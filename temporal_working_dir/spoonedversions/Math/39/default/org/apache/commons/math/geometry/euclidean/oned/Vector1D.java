

package org.apache.commons.math.geometry.euclidean.oned;


public class Vector1D implements org.apache.commons.math.geometry.Vector<org.apache.commons.math.geometry.euclidean.oned.Euclidean1D> {
	public static final org.apache.commons.math.geometry.euclidean.oned.Vector1D ZERO = new org.apache.commons.math.geometry.euclidean.oned.Vector1D(0.0);

	public static final org.apache.commons.math.geometry.euclidean.oned.Vector1D ONE = new org.apache.commons.math.geometry.euclidean.oned.Vector1D(1.0);

	public static final org.apache.commons.math.geometry.euclidean.oned.Vector1D NaN = new org.apache.commons.math.geometry.euclidean.oned.Vector1D(java.lang.Double.NaN);

	public static final org.apache.commons.math.geometry.euclidean.oned.Vector1D POSITIVE_INFINITY = new org.apache.commons.math.geometry.euclidean.oned.Vector1D(java.lang.Double.POSITIVE_INFINITY);

	public static final org.apache.commons.math.geometry.euclidean.oned.Vector1D NEGATIVE_INFINITY = new org.apache.commons.math.geometry.euclidean.oned.Vector1D(java.lang.Double.NEGATIVE_INFINITY);

	private static final long serialVersionUID = 7556674948671647925L;

	private final double x;

	public Vector1D(double x) {
		this.x = x;
	}

	public Vector1D(double a, org.apache.commons.math.geometry.euclidean.oned.Vector1D u) {
		this.x = a * (u.x);
	}

	public Vector1D(double a1, org.apache.commons.math.geometry.euclidean.oned.Vector1D u1, double a2, org.apache.commons.math.geometry.euclidean.oned.Vector1D u2) {
		this.x = (a1 * (u1.x)) + (a2 * (u2.x));
	}

	public Vector1D(double a1, org.apache.commons.math.geometry.euclidean.oned.Vector1D u1, double a2, org.apache.commons.math.geometry.euclidean.oned.Vector1D u2, double a3, org.apache.commons.math.geometry.euclidean.oned.Vector1D u3) {
		this.x = ((a1 * (u1.x)) + (a2 * (u2.x))) + (a3 * (u3.x));
	}

	public Vector1D(double a1, org.apache.commons.math.geometry.euclidean.oned.Vector1D u1, double a2, org.apache.commons.math.geometry.euclidean.oned.Vector1D u2, double a3, org.apache.commons.math.geometry.euclidean.oned.Vector1D u3, double a4, org.apache.commons.math.geometry.euclidean.oned.Vector1D u4) {
		this.x = (((a1 * (u1.x)) + (a2 * (u2.x))) + (a3 * (u3.x))) + (a4 * (u4.x));
	}

	public double getX() {
		return x;
	}

	public org.apache.commons.math.geometry.Space getSpace() {
		return org.apache.commons.math.geometry.euclidean.oned.Euclidean1D.getInstance();
	}

	public org.apache.commons.math.geometry.euclidean.oned.Vector1D getZero() {
		return org.apache.commons.math.geometry.euclidean.oned.Vector1D.ZERO;
	}

	public double getNorm1() {
		return org.apache.commons.math.util.FastMath.abs(x);
	}

	public double getNorm() {
		return org.apache.commons.math.util.FastMath.abs(x);
	}

	public double getNormSq() {
		return (x) * (x);
	}

	public double getNormInf() {
		return org.apache.commons.math.util.FastMath.abs(x);
	}

	public org.apache.commons.math.geometry.euclidean.oned.Vector1D add(org.apache.commons.math.geometry.Vector<org.apache.commons.math.geometry.euclidean.oned.Euclidean1D> v) {
		org.apache.commons.math.geometry.euclidean.oned.Vector1D v1 = ((org.apache.commons.math.geometry.euclidean.oned.Vector1D) (v));
		return new org.apache.commons.math.geometry.euclidean.oned.Vector1D(((x) + (v1.getX())));
	}

	public org.apache.commons.math.geometry.euclidean.oned.Vector1D add(double factor, org.apache.commons.math.geometry.Vector<org.apache.commons.math.geometry.euclidean.oned.Euclidean1D> v) {
		org.apache.commons.math.geometry.euclidean.oned.Vector1D v1 = ((org.apache.commons.math.geometry.euclidean.oned.Vector1D) (v));
		return new org.apache.commons.math.geometry.euclidean.oned.Vector1D(((x) + (factor * (v1.getX()))));
	}

	public org.apache.commons.math.geometry.euclidean.oned.Vector1D subtract(org.apache.commons.math.geometry.Vector<org.apache.commons.math.geometry.euclidean.oned.Euclidean1D> p) {
		org.apache.commons.math.geometry.euclidean.oned.Vector1D p3 = ((org.apache.commons.math.geometry.euclidean.oned.Vector1D) (p));
		return new org.apache.commons.math.geometry.euclidean.oned.Vector1D(((x) - (p3.x)));
	}

	public org.apache.commons.math.geometry.euclidean.oned.Vector1D subtract(double factor, org.apache.commons.math.geometry.Vector<org.apache.commons.math.geometry.euclidean.oned.Euclidean1D> v) {
		org.apache.commons.math.geometry.euclidean.oned.Vector1D v1 = ((org.apache.commons.math.geometry.euclidean.oned.Vector1D) (v));
		return new org.apache.commons.math.geometry.euclidean.oned.Vector1D(((x) - (factor * (v1.getX()))));
	}

	public org.apache.commons.math.geometry.euclidean.oned.Vector1D normalize() {
		double s = getNorm();
		if (s == 0) {
			throw new org.apache.commons.math.exception.MathArithmeticException(org.apache.commons.math.exception.util.LocalizedFormats.CANNOT_NORMALIZE_A_ZERO_NORM_VECTOR);
		}
		return scalarMultiply((1 / s));
	}

	public org.apache.commons.math.geometry.euclidean.oned.Vector1D negate() {
		return new org.apache.commons.math.geometry.euclidean.oned.Vector1D((-(x)));
	}

	public org.apache.commons.math.geometry.euclidean.oned.Vector1D scalarMultiply(double a) {
		return new org.apache.commons.math.geometry.euclidean.oned.Vector1D((a * (x)));
	}

	public boolean isNaN() {
		return java.lang.Double.isNaN(x);
	}

	public boolean isInfinite() {
		return (!(isNaN())) && (java.lang.Double.isInfinite(x));
	}

	public double distance1(org.apache.commons.math.geometry.Vector<org.apache.commons.math.geometry.euclidean.oned.Euclidean1D> p) {
		org.apache.commons.math.geometry.euclidean.oned.Vector1D p3 = ((org.apache.commons.math.geometry.euclidean.oned.Vector1D) (p));
		final double dx = org.apache.commons.math.util.FastMath.abs(((p3.x) - (x)));
		return dx;
	}

	public double distance(org.apache.commons.math.geometry.Vector<org.apache.commons.math.geometry.euclidean.oned.Euclidean1D> p) {
		org.apache.commons.math.geometry.euclidean.oned.Vector1D p3 = ((org.apache.commons.math.geometry.euclidean.oned.Vector1D) (p));
		final double dx = (p3.x) - (x);
		return org.apache.commons.math.util.FastMath.abs(dx);
	}

	public double distanceInf(org.apache.commons.math.geometry.Vector<org.apache.commons.math.geometry.euclidean.oned.Euclidean1D> p) {
		org.apache.commons.math.geometry.euclidean.oned.Vector1D p3 = ((org.apache.commons.math.geometry.euclidean.oned.Vector1D) (p));
		final double dx = org.apache.commons.math.util.FastMath.abs(((p3.x) - (x)));
		return dx;
	}

	public double distanceSq(org.apache.commons.math.geometry.Vector<org.apache.commons.math.geometry.euclidean.oned.Euclidean1D> p) {
		org.apache.commons.math.geometry.euclidean.oned.Vector1D p3 = ((org.apache.commons.math.geometry.euclidean.oned.Vector1D) (p));
		final double dx = (p3.x) - (x);
		return dx * dx;
	}

	public double dotProduct(final org.apache.commons.math.geometry.Vector<org.apache.commons.math.geometry.euclidean.oned.Euclidean1D> v) {
		final org.apache.commons.math.geometry.euclidean.oned.Vector1D v1 = ((org.apache.commons.math.geometry.euclidean.oned.Vector1D) (v));
		return (x) * (v1.x);
	}

	public static double distance(org.apache.commons.math.geometry.euclidean.oned.Vector1D p1, org.apache.commons.math.geometry.euclidean.oned.Vector1D p2) {
		return p1.distance(p2);
	}

	public static double distanceInf(org.apache.commons.math.geometry.euclidean.oned.Vector1D p1, org.apache.commons.math.geometry.euclidean.oned.Vector1D p2) {
		return p1.distanceInf(p2);
	}

	public static double distanceSq(org.apache.commons.math.geometry.euclidean.oned.Vector1D p1, org.apache.commons.math.geometry.euclidean.oned.Vector1D p2) {
		return p1.distanceSq(p2);
	}

	@java.lang.Override
	public boolean equals(java.lang.Object other) {
		if ((org.apache.commons.math.geometry.euclidean.oned.Vector1D.this) == other) {
			return true;
		}
		if (other instanceof org.apache.commons.math.geometry.euclidean.oned.Vector1D) {
			final org.apache.commons.math.geometry.euclidean.oned.Vector1D rhs = ((org.apache.commons.math.geometry.euclidean.oned.Vector1D) (other));
			if (rhs.isNaN()) {
				return org.apache.commons.math.geometry.euclidean.oned.Vector1D.this.isNaN();
			}
			return (x) == (rhs.x);
		}
		return false;
	}

	@java.lang.Override
	public int hashCode() {
		if (isNaN()) {
			return 7785;
		}
		return 997 * (org.apache.commons.math.util.MathUtils.hash(x));
	}

	@java.lang.Override
	public java.lang.String toString() {
		return org.apache.commons.math.geometry.euclidean.oned.Vector1DFormat.getInstance().format(org.apache.commons.math.geometry.euclidean.oned.Vector1D.this);
	}

	public java.lang.String toString(final java.text.NumberFormat format) {
		return new org.apache.commons.math.geometry.euclidean.oned.Vector1DFormat(format).format(org.apache.commons.math.geometry.euclidean.oned.Vector1D.this);
	}
}

