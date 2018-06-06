

package org.apache.commons.math3.geometry.euclidean.twod;


public class SubLine extends org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> {
	public SubLine(final org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> hyperplane, final org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> remainingRegion) {
		super(hyperplane, remainingRegion);
	}

	public SubLine(final org.apache.commons.math3.geometry.euclidean.twod.Vector2D start, final org.apache.commons.math3.geometry.euclidean.twod.Vector2D end) {
		super(new org.apache.commons.math3.geometry.euclidean.twod.Line(start, end), org.apache.commons.math3.geometry.euclidean.twod.SubLine.buildIntervalSet(start, end));
	}

	public SubLine(final org.apache.commons.math3.geometry.euclidean.twod.Segment segment) {
		super(segment.getLine(), org.apache.commons.math3.geometry.euclidean.twod.SubLine.buildIntervalSet(segment.getStart(), segment.getEnd()));
	}

	public java.util.List<org.apache.commons.math3.geometry.euclidean.twod.Segment> getSegments() {
		final org.apache.commons.math3.geometry.euclidean.twod.Line line = ((org.apache.commons.math3.geometry.euclidean.twod.Line) (getHyperplane()));
		final java.util.List<org.apache.commons.math3.geometry.euclidean.oned.Interval> list = ((org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet) (getRemainingRegion())).asList();
		final java.util.List<org.apache.commons.math3.geometry.euclidean.twod.Segment> segments = new java.util.ArrayList<org.apache.commons.math3.geometry.euclidean.twod.Segment>();
		for (final org.apache.commons.math3.geometry.euclidean.oned.Interval interval : list) {
			final org.apache.commons.math3.geometry.euclidean.twod.Vector2D start = line.toSpace(new org.apache.commons.math3.geometry.euclidean.oned.Vector1D(interval.getLower()));
			final org.apache.commons.math3.geometry.euclidean.twod.Vector2D end = line.toSpace(new org.apache.commons.math3.geometry.euclidean.oned.Vector1D(interval.getUpper()));
			segments.add(new org.apache.commons.math3.geometry.euclidean.twod.Segment(start, end, line));
		}
		return segments;
	}

	public org.apache.commons.math3.geometry.euclidean.twod.Vector2D intersection(final org.apache.commons.math3.geometry.euclidean.twod.SubLine subLine, final boolean includeEndPoints) {
		org.apache.commons.math3.geometry.euclidean.twod.Line line1 = ((org.apache.commons.math3.geometry.euclidean.twod.Line) (getHyperplane()));
		org.apache.commons.math3.geometry.euclidean.twod.Line line2 = ((org.apache.commons.math3.geometry.euclidean.twod.Line) (subLine.getHyperplane()));
		org.apache.commons.math3.geometry.euclidean.twod.Vector2D v2D = line1.intersection(line2);
		org.apache.commons.math3.geometry.partitioning.Region.Location loc1 = getRemainingRegion().checkPoint(line1.toSubSpace(v2D));
		org.apache.commons.math3.geometry.partitioning.Region.Location loc2 = subLine.getRemainingRegion().checkPoint(line2.toSubSpace(v2D));
		if (includeEndPoints) {
			return (loc1 != (org.apache.commons.math3.geometry.partitioning.Region.Location.OUTSIDE)) && (loc2 != (org.apache.commons.math3.geometry.partitioning.Region.Location.OUTSIDE)) ? v2D : null;
		}else {
			return (loc1 == (org.apache.commons.math3.geometry.partitioning.Region.Location.INSIDE)) && (loc2 == (org.apache.commons.math3.geometry.partitioning.Region.Location.INSIDE)) ? v2D : null;
		}
	}

	private static org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet buildIntervalSet(final org.apache.commons.math3.geometry.euclidean.twod.Vector2D start, final org.apache.commons.math3.geometry.euclidean.twod.Vector2D end) {
		final org.apache.commons.math3.geometry.euclidean.twod.Line line = new org.apache.commons.math3.geometry.euclidean.twod.Line(start, end);
		return new org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet(line.toSubSpace(start).getX(), line.toSubSpace(end).getX());
	}

	@java.lang.Override
	protected org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> buildNew(final org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> hyperplane, final org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> remainingRegion) {
		return new org.apache.commons.math3.geometry.euclidean.twod.SubLine(hyperplane, remainingRegion);
	}

	@java.lang.Override
	public org.apache.commons.math3.geometry.partitioning.Side side(final org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> hyperplane) {
		final org.apache.commons.math3.geometry.euclidean.twod.Line thisLine = ((org.apache.commons.math3.geometry.euclidean.twod.Line) (getHyperplane()));
		final org.apache.commons.math3.geometry.euclidean.twod.Line otherLine = ((org.apache.commons.math3.geometry.euclidean.twod.Line) (hyperplane));
		final org.apache.commons.math3.geometry.euclidean.twod.Vector2D crossing = thisLine.intersection(otherLine);
		if (crossing == null) {
			final double global = otherLine.getOffset(thisLine);
			return global < (-1.0E-10) ? org.apache.commons.math3.geometry.partitioning.Side.MINUS : global > 1.0E-10 ? org.apache.commons.math3.geometry.partitioning.Side.PLUS : org.apache.commons.math3.geometry.partitioning.Side.HYPER;
		}
		final boolean direct = (org.apache.commons.math3.util.FastMath.sin(((thisLine.getAngle()) - (otherLine.getAngle())))) < 0;
		final org.apache.commons.math3.geometry.euclidean.oned.Vector1D x = thisLine.toSubSpace(crossing);
		return getRemainingRegion().side(new org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint(x, direct));
	}

	@java.lang.Override
	public org.apache.commons.math3.geometry.partitioning.SubHyperplane.SplitSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> split(final org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> hyperplane) {
		final org.apache.commons.math3.geometry.euclidean.twod.Line thisLine = ((org.apache.commons.math3.geometry.euclidean.twod.Line) (getHyperplane()));
		final org.apache.commons.math3.geometry.euclidean.twod.Line otherLine = ((org.apache.commons.math3.geometry.euclidean.twod.Line) (hyperplane));
		final org.apache.commons.math3.geometry.euclidean.twod.Vector2D crossing = thisLine.intersection(otherLine);
		if (crossing == null) {
			final double global = otherLine.getOffset(thisLine);
			return global < (-1.0E-10) ? new org.apache.commons.math3.geometry.partitioning.SubHyperplane.SplitSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D>(null, org.apache.commons.math3.geometry.euclidean.twod.SubLine.this) : new org.apache.commons.math3.geometry.partitioning.SubHyperplane.SplitSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D>(org.apache.commons.math3.geometry.euclidean.twod.SubLine.this, null);
		}
		final boolean direct = (org.apache.commons.math3.util.FastMath.sin(((thisLine.getAngle()) - (otherLine.getAngle())))) < 0;
		final org.apache.commons.math3.geometry.euclidean.oned.Vector1D x = thisLine.toSubSpace(crossing);
		final org.apache.commons.math3.geometry.partitioning.SubHyperplane<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> subPlus = new org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint(x, (!direct)).wholeHyperplane();
		final org.apache.commons.math3.geometry.partitioning.SubHyperplane<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> subMinus = new org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint(x, direct).wholeHyperplane();
		final org.apache.commons.math3.geometry.partitioning.BSPTree<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> splitTree = getRemainingRegion().getTree(false).split(subMinus);
		final org.apache.commons.math3.geometry.partitioning.BSPTree<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> plusTree = getRemainingRegion().isEmpty(splitTree.getPlus()) ? new org.apache.commons.math3.geometry.partitioning.BSPTree<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D>(java.lang.Boolean.FALSE) : new org.apache.commons.math3.geometry.partitioning.BSPTree<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D>(subPlus, new org.apache.commons.math3.geometry.partitioning.BSPTree<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D>(java.lang.Boolean.FALSE), splitTree.getPlus(), null);
		final org.apache.commons.math3.geometry.partitioning.BSPTree<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> minusTree = getRemainingRegion().isEmpty(splitTree.getMinus()) ? new org.apache.commons.math3.geometry.partitioning.BSPTree<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D>(java.lang.Boolean.FALSE) : new org.apache.commons.math3.geometry.partitioning.BSPTree<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D>(subMinus, new org.apache.commons.math3.geometry.partitioning.BSPTree<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D>(java.lang.Boolean.FALSE), splitTree.getMinus(), null);
		return new org.apache.commons.math3.geometry.partitioning.SubHyperplane.SplitSubHyperplane<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D>(new org.apache.commons.math3.geometry.euclidean.twod.SubLine(thisLine.copySelf(), new org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet(plusTree)), new org.apache.commons.math3.geometry.euclidean.twod.SubLine(thisLine.copySelf(), new org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet(minusTree)));
	}
}

