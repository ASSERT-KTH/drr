

package org.apache.commons.math3.geometry.euclidean.twod;


class NestedLoops {
	private org.apache.commons.math3.geometry.euclidean.twod.Vector2D[] loop;

	private java.util.ArrayList<org.apache.commons.math3.geometry.euclidean.twod.NestedLoops> surrounded;

	private org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> polygon;

	private boolean originalIsClockwise;

	public NestedLoops() {
		surrounded = new java.util.ArrayList<org.apache.commons.math3.geometry.euclidean.twod.NestedLoops>();
	}

	private NestedLoops(final org.apache.commons.math3.geometry.euclidean.twod.Vector2D[] loop) throws org.apache.commons.math3.exception.MathIllegalArgumentException {
		if ((loop[0]) == null) {
			throw new org.apache.commons.math3.exception.MathIllegalArgumentException(org.apache.commons.math3.exception.util.LocalizedFormats.OUTLINE_BOUNDARY_LOOP_OPEN);
		}
		org.apache.commons.math3.geometry.euclidean.twod.NestedLoops.this.loop = loop;
		surrounded = new java.util.ArrayList<org.apache.commons.math3.geometry.euclidean.twod.NestedLoops>();
		final java.util.ArrayList<org.apache.commons.math3.geometry.partitioning.SubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D>> edges = new java.util.ArrayList<org.apache.commons.math3.geometry.partitioning.SubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D>>();
		org.apache.commons.math3.geometry.euclidean.twod.Vector2D current = loop[((loop.length) - 1)];
		for (int i = 0; i < (loop.length); ++i) {
			final org.apache.commons.math3.geometry.euclidean.twod.Vector2D previous = current;
			current = loop[i];
			final org.apache.commons.math3.geometry.euclidean.twod.Line line = new org.apache.commons.math3.geometry.euclidean.twod.Line(previous, current);
			final org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet region = new org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet(line.toSubSpace(previous).getX(), line.toSubSpace(current).getX());
			edges.add(new org.apache.commons.math3.geometry.euclidean.twod.SubLine(line, region));
		}
		polygon = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(edges);
		if (java.lang.Double.isInfinite(polygon.getSize())) {
			polygon = new org.apache.commons.math3.geometry.partitioning.RegionFactory<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D>().getComplement(polygon);
			originalIsClockwise = false;
		}else {
			originalIsClockwise = true;
		}
	}

	public void add(final org.apache.commons.math3.geometry.euclidean.twod.Vector2D[] bLoop) throws org.apache.commons.math3.exception.MathIllegalArgumentException {
		add(new org.apache.commons.math3.geometry.euclidean.twod.NestedLoops(bLoop));
	}

	private void add(final org.apache.commons.math3.geometry.euclidean.twod.NestedLoops node) throws org.apache.commons.math3.exception.MathIllegalArgumentException {
		for (final org.apache.commons.math3.geometry.euclidean.twod.NestedLoops child : surrounded) {
			if (child.polygon.contains(node.polygon)) {
				child.add(node);
				return ;
			}
		}
		for (final java.util.Iterator<org.apache.commons.math3.geometry.euclidean.twod.NestedLoops> iterator = surrounded.iterator(); iterator.hasNext();) {
			final org.apache.commons.math3.geometry.euclidean.twod.NestedLoops child = iterator.next();
			if (node.polygon.contains(child.polygon)) {
				node.surrounded.add(child);
				iterator.remove();
			}
		}
		org.apache.commons.math3.geometry.partitioning.RegionFactory<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> factory = new org.apache.commons.math3.geometry.partitioning.RegionFactory<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D>();
		for (final org.apache.commons.math3.geometry.euclidean.twod.NestedLoops child : surrounded) {
			if (!(factory.intersection(node.polygon, child.polygon).isEmpty())) {
				throw new org.apache.commons.math3.exception.MathIllegalArgumentException(org.apache.commons.math3.exception.util.LocalizedFormats.CROSSING_BOUNDARY_LOOPS);
			}
		}
		surrounded.add(node);
	}

	public void correctOrientation() {
		for (org.apache.commons.math3.geometry.euclidean.twod.NestedLoops child : surrounded) {
			child.setClockWise(true);
		}
	}

	private void setClockWise(final boolean clockwise) {
		if ((originalIsClockwise) ^ clockwise) {
			int min = -1;
			int max = loop.length;
			while ((++min) < (--max)) {
				final org.apache.commons.math3.geometry.euclidean.twod.Vector2D tmp = loop[min];
				loop[min] = loop[max];
				loop[max] = tmp;
			} 
		}
		for (final org.apache.commons.math3.geometry.euclidean.twod.NestedLoops child : surrounded) {
			child.setClockWise((!clockwise));
		}
	}
}

