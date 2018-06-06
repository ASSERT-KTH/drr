

package org.apache.commons.math3.geometry.euclidean.oned;


public class SubOrientedPoint extends org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> {
	public SubOrientedPoint(final org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> hyperplane, final org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> remainingRegion) {
		super(hyperplane, remainingRegion);
	}

	@java.lang.Override
	public double getSize() {
		return 0;
	}

	@java.lang.Override
	protected org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> buildNew(final org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> hyperplane, final org.apache.commons.math3.geometry.partitioning.Region<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> remainingRegion) {
		return new org.apache.commons.math3.geometry.euclidean.oned.SubOrientedPoint(hyperplane, remainingRegion);
	}

	@java.lang.Override
	public org.apache.commons.math3.geometry.partitioning.Side side(final org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> hyperplane) {
		final double global = hyperplane.getOffset(((org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint) (getHyperplane())).getLocation());
		return global < (-1.0E-10) ? org.apache.commons.math3.geometry.partitioning.Side.MINUS : global > 1.0E-10 ? org.apache.commons.math3.geometry.partitioning.Side.PLUS : org.apache.commons.math3.geometry.partitioning.Side.HYPER;
	}

	@java.lang.Override
	public org.apache.commons.math3.geometry.partitioning.SubHyperplane.SplitSubHyperplane<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> split(final org.apache.commons.math3.geometry.partitioning.Hyperplane<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> hyperplane) {
		final double global = hyperplane.getOffset(((org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint) (getHyperplane())).getLocation());
		return global < (-1.0E-10) ? new org.apache.commons.math3.geometry.partitioning.SubHyperplane.SplitSubHyperplane<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D>(null, org.apache.commons.math3.geometry.euclidean.oned.SubOrientedPoint.this) : new org.apache.commons.math3.geometry.partitioning.SubHyperplane.SplitSubHyperplane<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D>(org.apache.commons.math3.geometry.euclidean.oned.SubOrientedPoint.this, null);
	}
}

