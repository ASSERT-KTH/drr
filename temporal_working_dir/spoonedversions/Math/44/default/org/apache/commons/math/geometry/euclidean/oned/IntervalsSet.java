

package org.apache.commons.math.geometry.euclidean.oned;


public class IntervalsSet extends org.apache.commons.math.geometry.partitioning.AbstractRegion<org.apache.commons.math.geometry.euclidean.oned.Euclidean1D, org.apache.commons.math.geometry.euclidean.oned.Euclidean1D> {
	public IntervalsSet() {
		super();
	}

	public IntervalsSet(final double lower, final double upper) {
		super(org.apache.commons.math.geometry.euclidean.oned.IntervalsSet.buildTree(lower, upper));
	}

	public IntervalsSet(final org.apache.commons.math.geometry.partitioning.BSPTree<org.apache.commons.math.geometry.euclidean.oned.Euclidean1D> tree) {
		super(tree);
	}

	public IntervalsSet(final java.util.Collection<org.apache.commons.math.geometry.partitioning.SubHyperplane<org.apache.commons.math.geometry.euclidean.oned.Euclidean1D>> boundary) {
		super(boundary);
	}

	private static org.apache.commons.math.geometry.partitioning.BSPTree<org.apache.commons.math.geometry.euclidean.oned.Euclidean1D> buildTree(final double lower, final double upper) {
		if ((java.lang.Double.isInfinite(lower)) && (lower < 0)) {
			if ((java.lang.Double.isInfinite(upper)) && (upper > 0)) {
				return new org.apache.commons.math.geometry.partitioning.BSPTree<org.apache.commons.math.geometry.euclidean.oned.Euclidean1D>(java.lang.Boolean.TRUE);
			}
			final org.apache.commons.math.geometry.partitioning.SubHyperplane<org.apache.commons.math.geometry.euclidean.oned.Euclidean1D> upperCut = new org.apache.commons.math.geometry.euclidean.oned.OrientedPoint(new org.apache.commons.math.geometry.euclidean.oned.Vector1D(upper), true).wholeHyperplane();
			return new org.apache.commons.math.geometry.partitioning.BSPTree<org.apache.commons.math.geometry.euclidean.oned.Euclidean1D>(upperCut, new org.apache.commons.math.geometry.partitioning.BSPTree<org.apache.commons.math.geometry.euclidean.oned.Euclidean1D>(java.lang.Boolean.FALSE), new org.apache.commons.math.geometry.partitioning.BSPTree<org.apache.commons.math.geometry.euclidean.oned.Euclidean1D>(java.lang.Boolean.TRUE), null);
		}
		final org.apache.commons.math.geometry.partitioning.SubHyperplane<org.apache.commons.math.geometry.euclidean.oned.Euclidean1D> lowerCut = new org.apache.commons.math.geometry.euclidean.oned.OrientedPoint(new org.apache.commons.math.geometry.euclidean.oned.Vector1D(lower), false).wholeHyperplane();
		if ((java.lang.Double.isInfinite(upper)) && (upper > 0)) {
			return new org.apache.commons.math.geometry.partitioning.BSPTree<org.apache.commons.math.geometry.euclidean.oned.Euclidean1D>(lowerCut, new org.apache.commons.math.geometry.partitioning.BSPTree<org.apache.commons.math.geometry.euclidean.oned.Euclidean1D>(java.lang.Boolean.FALSE), new org.apache.commons.math.geometry.partitioning.BSPTree<org.apache.commons.math.geometry.euclidean.oned.Euclidean1D>(java.lang.Boolean.TRUE), null);
		}
		final org.apache.commons.math.geometry.partitioning.SubHyperplane<org.apache.commons.math.geometry.euclidean.oned.Euclidean1D> upperCut = new org.apache.commons.math.geometry.euclidean.oned.OrientedPoint(new org.apache.commons.math.geometry.euclidean.oned.Vector1D(upper), true).wholeHyperplane();
		return new org.apache.commons.math.geometry.partitioning.BSPTree<org.apache.commons.math.geometry.euclidean.oned.Euclidean1D>(lowerCut, new org.apache.commons.math.geometry.partitioning.BSPTree<org.apache.commons.math.geometry.euclidean.oned.Euclidean1D>(java.lang.Boolean.FALSE), new org.apache.commons.math.geometry.partitioning.BSPTree<org.apache.commons.math.geometry.euclidean.oned.Euclidean1D>(upperCut, new org.apache.commons.math.geometry.partitioning.BSPTree<org.apache.commons.math.geometry.euclidean.oned.Euclidean1D>(java.lang.Boolean.FALSE), new org.apache.commons.math.geometry.partitioning.BSPTree<org.apache.commons.math.geometry.euclidean.oned.Euclidean1D>(java.lang.Boolean.TRUE), null), null);
	}

	public org.apache.commons.math.geometry.euclidean.oned.IntervalsSet buildNew(final org.apache.commons.math.geometry.partitioning.BSPTree<org.apache.commons.math.geometry.euclidean.oned.Euclidean1D> tree) {
		return new org.apache.commons.math.geometry.euclidean.oned.IntervalsSet(tree);
	}

	protected void computeGeometricalProperties() {
		if ((getTree(false).getCut()) == null) {
			setBarycenter(org.apache.commons.math.geometry.euclidean.oned.Vector1D.NaN);
			setSize((((java.lang.Boolean) (getTree(false).getAttribute())) ? java.lang.Double.POSITIVE_INFINITY : 0));
		}else {
			double size = 0.0;
			double sum = 0.0;
			for (final org.apache.commons.math.geometry.euclidean.oned.Interval interval : asList()) {
				size += interval.getLength();
				sum += (interval.getLength()) * (interval.getMidPoint());
			}
			setSize(size);
			setBarycenter((java.lang.Double.isInfinite(size) ? org.apache.commons.math.geometry.euclidean.oned.Vector1D.NaN : new org.apache.commons.math.geometry.euclidean.oned.Vector1D((sum / size))));
		}
	}

	public double getInf() {
		org.apache.commons.math.geometry.partitioning.BSPTree<org.apache.commons.math.geometry.euclidean.oned.Euclidean1D> node = getTree(false);
		double inf = java.lang.Double.POSITIVE_INFINITY;
		while ((node.getCut()) != null) {
			final org.apache.commons.math.geometry.euclidean.oned.OrientedPoint op = ((org.apache.commons.math.geometry.euclidean.oned.OrientedPoint) (node.getCut().getHyperplane()));
			inf = op.getLocation().getX();
			node = (op.isDirect()) ? node.getMinus() : node.getPlus();
		} 
		return ((java.lang.Boolean) (node.getAttribute())) ? java.lang.Double.NEGATIVE_INFINITY : inf;
	}

	public double getSup() {
		org.apache.commons.math.geometry.partitioning.BSPTree<org.apache.commons.math.geometry.euclidean.oned.Euclidean1D> node = getTree(false);
		double sup = java.lang.Double.NEGATIVE_INFINITY;
		while ((node.getCut()) != null) {
			final org.apache.commons.math.geometry.euclidean.oned.OrientedPoint op = ((org.apache.commons.math.geometry.euclidean.oned.OrientedPoint) (node.getCut().getHyperplane()));
			sup = op.getLocation().getX();
			node = (op.isDirect()) ? node.getPlus() : node.getMinus();
		} 
		return ((java.lang.Boolean) (node.getAttribute())) ? java.lang.Double.POSITIVE_INFINITY : sup;
	}

	public java.util.List<org.apache.commons.math.geometry.euclidean.oned.Interval> asList() {
		final java.util.List<org.apache.commons.math.geometry.euclidean.oned.Interval> list = new java.util.ArrayList<org.apache.commons.math.geometry.euclidean.oned.Interval>();
		recurseList(getTree(false), list, java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY);
		return list;
	}

	private void recurseList(final org.apache.commons.math.geometry.partitioning.BSPTree<org.apache.commons.math.geometry.euclidean.oned.Euclidean1D> node, final java.util.List<org.apache.commons.math.geometry.euclidean.oned.Interval> list, final double lower, final double upper) {
		if ((node.getCut()) == null) {
			if (((java.lang.Boolean) (node.getAttribute()))) {
				list.add(new org.apache.commons.math.geometry.euclidean.oned.Interval(lower, upper));
			}
		}else {
			final org.apache.commons.math.geometry.euclidean.oned.OrientedPoint op = ((org.apache.commons.math.geometry.euclidean.oned.OrientedPoint) (node.getCut().getHyperplane()));
			final org.apache.commons.math.geometry.euclidean.oned.Vector1D loc = op.getLocation();
			double x = loc.getX();
			final org.apache.commons.math.geometry.partitioning.BSPTree<org.apache.commons.math.geometry.euclidean.oned.Euclidean1D> low = op.isDirect() ? node.getMinus() : node.getPlus();
			final org.apache.commons.math.geometry.partitioning.BSPTree<org.apache.commons.math.geometry.euclidean.oned.Euclidean1D> high = op.isDirect() ? node.getPlus() : node.getMinus();
			recurseList(low, list, lower, x);
			if (((checkPoint(low, loc)) == (org.apache.commons.math.geometry.partitioning.Region.Location.INSIDE)) && ((checkPoint(high, loc)) == (org.apache.commons.math.geometry.partitioning.Region.Location.INSIDE))) {
				x = ((org.apache.commons.math.geometry.euclidean.oned.Interval) (list.remove(((list.size()) - 1)))).getLower();
			}
			recurseList(high, list, x, upper);
		}
	}
}

