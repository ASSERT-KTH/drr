

package org.apache.commons.math3.geometry.euclidean.twod;


public class PolygonsSet extends org.apache.commons.math3.geometry.partitioning.AbstractRegion<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> {
	private org.apache.commons.math3.geometry.euclidean.twod.Vector2D[][] vertices;

	public PolygonsSet() {
		super();
	}

	public PolygonsSet(final org.apache.commons.math3.geometry.partitioning.BSPTree<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> tree) {
		super(tree);
	}

	public PolygonsSet(final java.util.Collection<org.apache.commons.math3.geometry.partitioning.SubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D>> boundary) {
		super(boundary);
	}

	public PolygonsSet(final double xMin, final double xMax, final double yMin, final double yMax) {
		super(org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.boxBoundary(xMin, xMax, yMin, yMax));
	}

	private static org.apache.commons.math3.geometry.euclidean.twod.Line[] boxBoundary(final double xMin, final double xMax, final double yMin, final double yMax) {
		final org.apache.commons.math3.geometry.euclidean.twod.Vector2D minMin = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D(xMin, yMin);
		final org.apache.commons.math3.geometry.euclidean.twod.Vector2D minMax = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D(xMin, yMax);
		final org.apache.commons.math3.geometry.euclidean.twod.Vector2D maxMin = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D(xMax, yMin);
		final org.apache.commons.math3.geometry.euclidean.twod.Vector2D maxMax = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D(xMax, yMax);
		return new org.apache.commons.math3.geometry.euclidean.twod.Line[]{ new org.apache.commons.math3.geometry.euclidean.twod.Line(minMin, maxMin) , new org.apache.commons.math3.geometry.euclidean.twod.Line(maxMin, maxMax) , new org.apache.commons.math3.geometry.euclidean.twod.Line(maxMax, minMax) , new org.apache.commons.math3.geometry.euclidean.twod.Line(minMax, minMin) };
	}

	@java.lang.Override
	public org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet buildNew(final org.apache.commons.math3.geometry.partitioning.BSPTree<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> tree) {
		return new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(tree);
	}

	@java.lang.Override
	protected void computeGeometricalProperties() {
		final org.apache.commons.math3.geometry.euclidean.twod.Vector2D[][] v = getVertices();
		if ((v.length) == 0) {
			final org.apache.commons.math3.geometry.partitioning.BSPTree<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> tree = getTree(false);
			if (((tree.getCut()) == null) && ((java.lang.Boolean) (tree.getAttribute()))) {
				setSize(java.lang.Double.POSITIVE_INFINITY);
				setBarycenter(org.apache.commons.math3.geometry.euclidean.twod.Vector2D.NaN);
			}else {
				setSize(0);
				setBarycenter(new org.apache.commons.math3.geometry.euclidean.twod.Vector2D(0, 0));
			}
		}else
			if ((v[0][0]) == null) {
				setSize(java.lang.Double.POSITIVE_INFINITY);
				setBarycenter(org.apache.commons.math3.geometry.euclidean.twod.Vector2D.NaN);
			}else {
				double sum = 0;
				double sumX = 0;
				double sumY = 0;
				for (org.apache.commons.math3.geometry.euclidean.twod.Vector2D[] loop : v) {
					double x1 = loop[((loop.length) - 1)].getX();
					double y1 = loop[((loop.length) - 1)].getY();
					for (final org.apache.commons.math3.geometry.euclidean.twod.Vector2D point : loop) {
						final double x0 = x1;
						final double y0 = y1;
						x1 = point.getX();
						y1 = point.getY();
						final double factor = (x0 * y1) - (y0 * x1);
						sum += factor;
						sumX += factor * (x0 + x1);
						sumY += factor * (y0 + y1);
					}
				}
				if (sum < 0) {
					setSize(java.lang.Double.POSITIVE_INFINITY);
					setBarycenter(org.apache.commons.math3.geometry.euclidean.twod.Vector2D.NaN);
				}else {
					setSize((sum / 2));
					setBarycenter(new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((sumX / (3 * sum)), (sumY / (3 * sum))));
				}
			}
		
	}

	public org.apache.commons.math3.geometry.euclidean.twod.Vector2D[][] getVertices() {
		if ((vertices) == null) {
			if ((getTree(false).getCut()) == null) {
				vertices = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D[0][];
			}else {
				final org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.SegmentsBuilder visitor = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.SegmentsBuilder();
				getTree(true).visit(visitor);
				final org.apache.commons.math3.geometry.partitioning.utilities.AVLTree<org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.ComparableSegment> sorted = visitor.getSorted();
				final java.util.ArrayList<java.util.List<org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.ComparableSegment>> loops = new java.util.ArrayList<java.util.List<org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.ComparableSegment>>();
				while (!(sorted.isEmpty())) {
					final org.apache.commons.math3.geometry.partitioning.utilities.AVLTree<org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.ComparableSegment>.Node node = sorted.getSmallest();
					final java.util.List<org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.ComparableSegment> loop = followLoop(node, sorted);
					if (loop != null) {
						loops.add(loop);
					}
				} 
				vertices = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D[loops.size()][];
				int i = 0;
				for (final java.util.List<org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.ComparableSegment> loop : loops) {
					if ((loop.size()) < 2) {
						final org.apache.commons.math3.geometry.euclidean.twod.Line line = loop.get(0).getLine();
						vertices[(i++)] = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D[]{ null , line.toSpace(new org.apache.commons.math3.geometry.euclidean.oned.Vector1D((-(java.lang.Float.MAX_VALUE)))) , line.toSpace(new org.apache.commons.math3.geometry.euclidean.oned.Vector1D((+(java.lang.Float.MAX_VALUE)))) };
					}else
						if ((loop.get(0).getStart()) == null) {
							final org.apache.commons.math3.geometry.euclidean.twod.Vector2D[] array = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D[(loop.size()) + 2];
							int j = 0;
							for (org.apache.commons.math3.geometry.euclidean.twod.Segment segment : loop) {
								if (j == 0) {
									double x = segment.getLine().toSubSpace(segment.getEnd()).getX();
									x -= org.apache.commons.math3.util.FastMath.max(1.0, org.apache.commons.math3.util.FastMath.abs((x / 2)));
									array[(j++)] = null;
									array[(j++)] = segment.getLine().toSpace(new org.apache.commons.math3.geometry.euclidean.oned.Vector1D(x));
								}
								if (j < ((array.length) - 1)) {
									array[(j++)] = segment.getEnd();
								}
								if (j == ((array.length) - 1)) {
									double x = segment.getLine().toSubSpace(segment.getStart()).getX();
									x += org.apache.commons.math3.util.FastMath.max(1.0, org.apache.commons.math3.util.FastMath.abs((x / 2)));
									array[(j++)] = segment.getLine().toSpace(new org.apache.commons.math3.geometry.euclidean.oned.Vector1D(x));
								}
							}
							vertices[(i++)] = array;
						}else {
							final org.apache.commons.math3.geometry.euclidean.twod.Vector2D[] array = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D[loop.size()];
							int j = 0;
							for (org.apache.commons.math3.geometry.euclidean.twod.Segment segment : loop) {
								array[(j++)] = segment.getStart();
							}
							vertices[(i++)] = array;
						}
					
				}
			}
		}
		return vertices.clone();
	}

	private java.util.List<org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.ComparableSegment> followLoop(final org.apache.commons.math3.geometry.partitioning.utilities.AVLTree<org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.ComparableSegment>.Node node, final org.apache.commons.math3.geometry.partitioning.utilities.AVLTree<org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.ComparableSegment> sorted) {
		final java.util.ArrayList<org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.ComparableSegment> loop = new java.util.ArrayList<org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.ComparableSegment>();
		org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.ComparableSegment segment = node.getElement();
		loop.add(segment);
		final org.apache.commons.math3.geometry.euclidean.twod.Vector2D globalStart = segment.getStart();
		org.apache.commons.math3.geometry.euclidean.twod.Vector2D end = segment.getEnd();
		node.delete();
		final boolean open = (segment.getStart()) == null;
		while ((end != null) && (open || ((globalStart.distance(end)) > 1.0E-10))) {
			org.apache.commons.math3.geometry.partitioning.utilities.AVLTree<org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.ComparableSegment>.Node selectedNode = null;
			org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.ComparableSegment selectedSegment = null;
			double selectedDistance = java.lang.Double.POSITIVE_INFINITY;
			final org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.ComparableSegment lowerLeft = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.ComparableSegment(end, (-1.0E-10), (-1.0E-10));
			final org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.ComparableSegment upperRight = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.ComparableSegment(end, (+1.0E-10), (+1.0E-10));
			for (org.apache.commons.math3.geometry.partitioning.utilities.AVLTree<org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.ComparableSegment>.Node n = sorted.getNotSmaller(lowerLeft); (n != null) && ((n.getElement().compareTo(upperRight)) <= 0); n = n.getNext()) {
				segment = n.getElement();
				final double distance = end.distance(segment.getStart());
				if (distance < selectedDistance) {
					selectedNode = n;
					selectedSegment = segment;
					selectedDistance = distance;
				}
			}
			if (selectedDistance > 1.0E-10) {
				return null;
			}
			end = selectedSegment.getEnd();
			loop.add(selectedSegment);
			selectedNode.delete();
		} 
		if (((loop.size()) == 2) && (!open)) {
			return null;
		}
		if ((end == null) && (!open)) {
			throw new org.apache.commons.math3.exception.MathInternalError();
		}
		return loop;
	}

	private static class ComparableSegment extends org.apache.commons.math3.geometry.euclidean.twod.Segment implements java.lang.Comparable<org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.ComparableSegment> {
		private org.apache.commons.math3.geometry.partitioning.utilities.OrderedTuple sortingKey;

		public ComparableSegment(final org.apache.commons.math3.geometry.euclidean.twod.Vector2D start, final org.apache.commons.math3.geometry.euclidean.twod.Vector2D end, final org.apache.commons.math3.geometry.euclidean.twod.Line line) {
			super(start, end, line);
			sortingKey = (start == null) ? new org.apache.commons.math3.geometry.partitioning.utilities.OrderedTuple(java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.NEGATIVE_INFINITY) : new org.apache.commons.math3.geometry.partitioning.utilities.OrderedTuple(start.getX(), start.getY());
		}

		public ComparableSegment(final org.apache.commons.math3.geometry.euclidean.twod.Vector2D start, final double dx, final double dy) {
			super(null, null, null);
			sortingKey = new org.apache.commons.math3.geometry.partitioning.utilities.OrderedTuple(((start.getX()) + dx), ((start.getY()) + dy));
		}

		public int compareTo(final org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.ComparableSegment o) {
			return sortingKey.compareTo(o.sortingKey);
		}

		@java.lang.Override
		public boolean equals(final java.lang.Object other) {
			if ((org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.ComparableSegment.this) == other) {
				return true;
			}else
				if (other instanceof org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.ComparableSegment) {
					return (compareTo(((org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.ComparableSegment) (other)))) == 0;
				}else {
					return false;
				}
			
		}

		@java.lang.Override
		public int hashCode() {
			return (((getStart().hashCode()) ^ (getEnd().hashCode())) ^ (getLine().hashCode())) ^ (sortingKey.hashCode());
		}
	}

	private static class SegmentsBuilder implements org.apache.commons.math3.geometry.partitioning.BSPTreeVisitor<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> {
		private org.apache.commons.math3.geometry.partitioning.utilities.AVLTree<org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.ComparableSegment> sorted;

		public SegmentsBuilder() {
			sorted = new org.apache.commons.math3.geometry.partitioning.utilities.AVLTree<org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.ComparableSegment>();
		}

		public org.apache.commons.math3.geometry.partitioning.BSPTreeVisitor.Order visitOrder(final org.apache.commons.math3.geometry.partitioning.BSPTree<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> node) {
			return org.apache.commons.math3.geometry.partitioning.BSPTreeVisitor.Order.MINUS_SUB_PLUS;
		}

		public void visitInternalNode(final org.apache.commons.math3.geometry.partitioning.BSPTree<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> node) {
			@java.lang.SuppressWarnings(value = "unchecked")
			final org.apache.commons.math3.geometry.partitioning.BoundaryAttribute<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> attribute = ((org.apache.commons.math3.geometry.partitioning.BoundaryAttribute<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D>) (node.getAttribute()));
			if ((attribute.getPlusOutside()) != null) {
				addContribution(attribute.getPlusOutside(), false);
			}
			if ((attribute.getPlusInside()) != null) {
				addContribution(attribute.getPlusInside(), true);
			}
		}

		public void visitLeafNode(final org.apache.commons.math3.geometry.partitioning.BSPTree<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> node) {
		}

		private void addContribution(final org.apache.commons.math3.geometry.partitioning.SubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> sub, final boolean reversed) {
			@java.lang.SuppressWarnings(value = "unchecked")
			final org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> absSub = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D>) (sub));
			final org.apache.commons.math3.geometry.euclidean.twod.Line line = ((org.apache.commons.math3.geometry.euclidean.twod.Line) (sub.getHyperplane()));
			final java.util.List<org.apache.commons.math3.geometry.euclidean.oned.Interval> intervals = ((org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet) (absSub.getRemainingRegion())).asList();
			for (final org.apache.commons.math3.geometry.euclidean.oned.Interval i : intervals) {
				final org.apache.commons.math3.geometry.euclidean.twod.Vector2D start = java.lang.Double.isInfinite(i.getLower()) ? null : ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D) (line.toSpace(new org.apache.commons.math3.geometry.euclidean.oned.Vector1D(i.getLower()))));
				final org.apache.commons.math3.geometry.euclidean.twod.Vector2D end = java.lang.Double.isInfinite(i.getUpper()) ? null : ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D) (line.toSpace(new org.apache.commons.math3.geometry.euclidean.oned.Vector1D(i.getUpper()))));
				if (reversed) {
					sorted.insert(new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.ComparableSegment(end, start, line.getReverse()));
				}else {
					sorted.insert(new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.ComparableSegment(start, end, line));
				}
			}
		}

		public org.apache.commons.math3.geometry.partitioning.utilities.AVLTree<org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.ComparableSegment> getSorted() {
			return sorted;
		}
	}
}

