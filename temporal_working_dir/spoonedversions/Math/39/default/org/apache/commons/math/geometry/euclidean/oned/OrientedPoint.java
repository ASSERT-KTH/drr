

package org.apache.commons.math.geometry.euclidean.oned;


public class OrientedPoint implements org.apache.commons.math.geometry.partitioning.Hyperplane<org.apache.commons.math.geometry.euclidean.oned.Euclidean1D> {
	private org.apache.commons.math.geometry.euclidean.oned.Vector1D location;

	private boolean direct;

	public OrientedPoint(final org.apache.commons.math.geometry.euclidean.oned.Vector1D location, final boolean direct) {
		org.apache.commons.math.geometry.euclidean.oned.OrientedPoint.this.location = location;
		org.apache.commons.math.geometry.euclidean.oned.OrientedPoint.this.direct = direct;
	}

	public org.apache.commons.math.geometry.euclidean.oned.OrientedPoint copySelf() {
		return org.apache.commons.math.geometry.euclidean.oned.OrientedPoint.this;
	}

	public double getOffset(final org.apache.commons.math.geometry.Vector<org.apache.commons.math.geometry.euclidean.oned.Euclidean1D> point) {
		final double delta = (((org.apache.commons.math.geometry.euclidean.oned.Vector1D) (point)).getX()) - (location.getX());
		return direct ? delta : -delta;
	}

	public org.apache.commons.math.geometry.euclidean.oned.SubOrientedPoint wholeHyperplane() {
		return new org.apache.commons.math.geometry.euclidean.oned.SubOrientedPoint(org.apache.commons.math.geometry.euclidean.oned.OrientedPoint.this, null);
	}

	public org.apache.commons.math.geometry.euclidean.oned.IntervalsSet wholeSpace() {
		return new org.apache.commons.math.geometry.euclidean.oned.IntervalsSet();
	}

	public boolean sameOrientationAs(final org.apache.commons.math.geometry.partitioning.Hyperplane<org.apache.commons.math.geometry.euclidean.oned.Euclidean1D> other) {
		return !((direct) ^ (((org.apache.commons.math.geometry.euclidean.oned.OrientedPoint) (other)).direct));
	}

	public org.apache.commons.math.geometry.euclidean.oned.Vector1D getLocation() {
		return location;
	}

	public boolean isDirect() {
		return direct;
	}

	public void revertSelf() {
		direct = !(direct);
	}
}

