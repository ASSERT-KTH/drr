

package org.apache.commons.math.geometry.euclidean.threed;


public class OutlineExtractor {
	private org.apache.commons.math.geometry.euclidean.threed.Vector3D u;

	private org.apache.commons.math.geometry.euclidean.threed.Vector3D v;

	private org.apache.commons.math.geometry.euclidean.threed.Vector3D w;

	public OutlineExtractor(final org.apache.commons.math.geometry.euclidean.threed.Vector3D u, final org.apache.commons.math.geometry.euclidean.threed.Vector3D v) {
		org.apache.commons.math.geometry.euclidean.threed.OutlineExtractor.this.u = u;
		org.apache.commons.math.geometry.euclidean.threed.OutlineExtractor.this.v = v;
		w = org.apache.commons.math.geometry.euclidean.threed.Vector3D.crossProduct(u, v);
	}

	public org.apache.commons.math.geometry.euclidean.twod.Vector2D[][] getOutline(final org.apache.commons.math.geometry.euclidean.threed.PolyhedronsSet polyhedronsSet) {
		final org.apache.commons.math.geometry.euclidean.threed.OutlineExtractor.BoundaryProjector projector = new org.apache.commons.math.geometry.euclidean.threed.OutlineExtractor.BoundaryProjector();
		polyhedronsSet.getTree(true).visit(projector);
		final org.apache.commons.math.geometry.euclidean.twod.PolygonsSet projected = projector.getProjected();
		final org.apache.commons.math.geometry.euclidean.twod.Vector2D[][] outline = projected.getVertices();
		for (int i = 0; i < (outline.length); ++i) {
			final org.apache.commons.math.geometry.euclidean.twod.Vector2D[] rawLoop = outline[i];
			int end = rawLoop.length;
			int j = 0;
			while (j < end) {
				if (pointIsBetween(rawLoop, end, j)) {
					for (int k = j; k < (end - 1); ++k) {
						rawLoop[k] = rawLoop[(k + 1)];
					}
					--end;
				}else {
					++j;
				}
			} 
			if (end != (rawLoop.length)) {
				outline[i] = new org.apache.commons.math.geometry.euclidean.twod.Vector2D[end];
				java.lang.System.arraycopy(rawLoop, 0, outline[i], 0, end);
			}
		}
		return outline;
	}

	private boolean pointIsBetween(final org.apache.commons.math.geometry.euclidean.twod.Vector2D[] loop, final int n, final int i) {
		final org.apache.commons.math.geometry.euclidean.twod.Vector2D previous = loop[(((i + n) - 1) % n)];
		final org.apache.commons.math.geometry.euclidean.twod.Vector2D current = loop[i];
		final org.apache.commons.math.geometry.euclidean.twod.Vector2D next = loop[((i + 1) % n)];
		final double dx1 = (current.getX()) - (previous.getX());
		final double dy1 = (current.getY()) - (previous.getY());
		final double dx2 = (next.getX()) - (current.getX());
		final double dy2 = (next.getY()) - (current.getY());
		final double cross = (dx1 * dy2) - (dx2 * dy1);
		final double dot = (dx1 * dx2) + (dy1 * dy2);
		final double d1d2 = org.apache.commons.math.util.FastMath.sqrt((((dx1 * dx1) + (dy1 * dy1)) * ((dx2 * dx2) + (dy2 * dy2))));
		return ((org.apache.commons.math.util.FastMath.abs(cross)) <= (1.0E-6 * d1d2)) && (dot >= 0.0);
	}

	private class BoundaryProjector implements org.apache.commons.math.geometry.partitioning.BSPTreeVisitor<org.apache.commons.math.geometry.euclidean.threed.Euclidean3D> {
		private org.apache.commons.math.geometry.euclidean.twod.PolygonsSet projected;

		public BoundaryProjector() {
			projected = new org.apache.commons.math.geometry.euclidean.twod.PolygonsSet(new org.apache.commons.math.geometry.partitioning.BSPTree<org.apache.commons.math.geometry.euclidean.twod.Euclidean2D>(java.lang.Boolean.FALSE));
		}

		public org.apache.commons.math.geometry.partitioning.BSPTreeVisitor.Order visitOrder(final org.apache.commons.math.geometry.partitioning.BSPTree<org.apache.commons.math.geometry.euclidean.threed.Euclidean3D> node) {
			return org.apache.commons.math.geometry.partitioning.BSPTreeVisitor.Order.MINUS_SUB_PLUS;
		}

		public void visitInternalNode(final org.apache.commons.math.geometry.partitioning.BSPTree<org.apache.commons.math.geometry.euclidean.threed.Euclidean3D> node) {
			@java.lang.SuppressWarnings(value = "unchecked")
			final org.apache.commons.math.geometry.partitioning.BoundaryAttribute<org.apache.commons.math.geometry.euclidean.threed.Euclidean3D> attribute = ((org.apache.commons.math.geometry.partitioning.BoundaryAttribute<org.apache.commons.math.geometry.euclidean.threed.Euclidean3D>) (node.getAttribute()));
			if ((attribute.getPlusOutside()) != null) {
				addContribution(attribute.getPlusOutside(), false);
			}
			if ((attribute.getPlusInside()) != null) {
				addContribution(attribute.getPlusInside(), true);
			}
		}

		public void visitLeafNode(final org.apache.commons.math.geometry.partitioning.BSPTree<org.apache.commons.math.geometry.euclidean.threed.Euclidean3D> node) {
		}

		private void addContribution(final org.apache.commons.math.geometry.partitioning.SubHyperplane<org.apache.commons.math.geometry.euclidean.threed.Euclidean3D> facet, final boolean reversed) {
			@java.lang.SuppressWarnings(value = "unchecked")
			final org.apache.commons.math.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math.geometry.euclidean.threed.Euclidean3D, org.apache.commons.math.geometry.euclidean.twod.Euclidean2D> absFacet = ((org.apache.commons.math.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math.geometry.euclidean.threed.Euclidean3D, org.apache.commons.math.geometry.euclidean.twod.Euclidean2D>) (facet));
			final org.apache.commons.math.geometry.euclidean.threed.Plane plane = ((org.apache.commons.math.geometry.euclidean.threed.Plane) (facet.getHyperplane()));
			final double scal = plane.getNormal().dotProduct(w);
			if ((org.apache.commons.math.util.FastMath.abs(scal)) > 0.001) {
				org.apache.commons.math.geometry.euclidean.twod.Vector2D[][] vertices = ((org.apache.commons.math.geometry.euclidean.twod.PolygonsSet) (absFacet.getRemainingRegion())).getVertices();
				if ((scal < 0) ^ reversed) {
					final org.apache.commons.math.geometry.euclidean.twod.Vector2D[][] newVertices = new org.apache.commons.math.geometry.euclidean.twod.Vector2D[vertices.length][];
					for (int i = 0; i < (vertices.length); ++i) {
						final org.apache.commons.math.geometry.euclidean.twod.Vector2D[] loop = vertices[i];
						final org.apache.commons.math.geometry.euclidean.twod.Vector2D[] newLoop = new org.apache.commons.math.geometry.euclidean.twod.Vector2D[loop.length];
						if ((loop[0]) == null) {
							newLoop[0] = null;
							for (int j = 1; j < (loop.length); ++j) {
								newLoop[j] = loop[((loop.length) - j)];
							}
						}else {
							for (int j = 0; j < (loop.length); ++j) {
								newLoop[j] = loop[((loop.length) - (j + 1))];
							}
						}
						newVertices[i] = newLoop;
					}
					vertices = newVertices;
				}
				final java.util.ArrayList<org.apache.commons.math.geometry.partitioning.SubHyperplane<org.apache.commons.math.geometry.euclidean.twod.Euclidean2D>> edges = new java.util.ArrayList<org.apache.commons.math.geometry.partitioning.SubHyperplane<org.apache.commons.math.geometry.euclidean.twod.Euclidean2D>>();
				for (org.apache.commons.math.geometry.euclidean.twod.Vector2D[] loop : vertices) {
					final boolean closed = (loop[0]) != null;
					int previous = closed ? (loop.length) - 1 : 1;
					org.apache.commons.math.geometry.euclidean.threed.Vector3D previous3D = plane.toSpace(loop[previous]);
					int current = (previous + 1) % (loop.length);
					org.apache.commons.math.geometry.euclidean.twod.Vector2D pPoint = new org.apache.commons.math.geometry.euclidean.twod.Vector2D(previous3D.dotProduct(u), previous3D.dotProduct(v));
					while (current < (loop.length)) {
						final org.apache.commons.math.geometry.euclidean.threed.Vector3D current3D = plane.toSpace(loop[current]);
						final org.apache.commons.math.geometry.euclidean.twod.Vector2D cPoint = new org.apache.commons.math.geometry.euclidean.twod.Vector2D(current3D.dotProduct(u), current3D.dotProduct(v));
						final org.apache.commons.math.geometry.euclidean.twod.Line line = new org.apache.commons.math.geometry.euclidean.twod.Line(pPoint, cPoint);
						org.apache.commons.math.geometry.partitioning.SubHyperplane<org.apache.commons.math.geometry.euclidean.twod.Euclidean2D> edge = line.wholeHyperplane();
						if (closed || (previous != 1)) {
							final double angle = (line.getAngle()) + (0.5 * (org.apache.commons.math.util.FastMath.PI));
							final org.apache.commons.math.geometry.euclidean.twod.Line l = new org.apache.commons.math.geometry.euclidean.twod.Line(pPoint, angle);
							edge = edge.split(l).getPlus();
						}
						if (closed || (current != ((loop.length) - 1))) {
							final double angle = (line.getAngle()) + (0.5 * (org.apache.commons.math.util.FastMath.PI));
							final org.apache.commons.math.geometry.euclidean.twod.Line l = new org.apache.commons.math.geometry.euclidean.twod.Line(cPoint, angle);
							edge = edge.split(l).getMinus();
						}
						edges.add(edge);
						previous = current++;
						previous3D = current3D;
						pPoint = cPoint;
					} 
				}
				final org.apache.commons.math.geometry.euclidean.twod.PolygonsSet projectedFacet = new org.apache.commons.math.geometry.euclidean.twod.PolygonsSet(edges);
				projected = ((org.apache.commons.math.geometry.euclidean.twod.PolygonsSet) (new org.apache.commons.math.geometry.partitioning.RegionFactory<org.apache.commons.math.geometry.euclidean.twod.Euclidean2D>().union(projected, projectedFacet)));
			}
		}

		public org.apache.commons.math.geometry.euclidean.twod.PolygonsSet getProjected() {
			return projected;
		}
	}
}

