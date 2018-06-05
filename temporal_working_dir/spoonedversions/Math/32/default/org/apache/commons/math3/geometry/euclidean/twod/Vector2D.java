

package org.apache.commons.math3.geometry.euclidean.twod;


public class Vector2D implements org.apache.commons.math3.geometry.Vector<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> {
	public static final org.apache.commons.math3.geometry.euclidean.twod.Vector2D ZERO = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D(0, 0);

	public static final org.apache.commons.math3.geometry.euclidean.twod.Vector2D NaN = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D(java.lang.Double.NaN, java.lang.Double.NaN);

	public static final org.apache.commons.math3.geometry.euclidean.twod.Vector2D POSITIVE_INFINITY = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D(java.lang.Double.POSITIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY);

	public static final org.apache.commons.math3.geometry.euclidean.twod.Vector2D NEGATIVE_INFINITY = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D(java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.NEGATIVE_INFINITY);

	private static final long serialVersionUID = 266938651998679754L;

	private final double x;

	private final double y;

	public Vector2D(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public Vector2D(double[] v) throws org.apache.commons.math3.exception.DimensionMismatchException {
		if ((v.length) != 2) {
			throw new org.apache.commons.math3.exception.DimensionMismatchException(v.length, 2);
		}
		this.x = v[0];
		this.y = v[1];
	}

	public Vector2D(double a, org.apache.commons.math3.geometry.euclidean.twod.Vector2D u) {
		this.x = a * (u.x);
		this.y = a * (u.y);
	}

	public Vector2D(double a1, org.apache.commons.math3.geometry.euclidean.twod.Vector2D u1, double a2, org.apache.commons.math3.geometry.euclidean.twod.Vector2D u2) {
		this.x = (a1 * (u1.x)) + (a2 * (u2.x));
		this.y = (a1 * (u1.y)) + (a2 * (u2.y));
	}

	public Vector2D(double a1, org.apache.commons.math3.geometry.euclidean.twod.Vector2D u1, double a2, org.apache.commons.math3.geometry.euclidean.twod.Vector2D u2, double a3, org.apache.commons.math3.geometry.euclidean.twod.Vector2D u3) {
		this.x = ((a1 * (u1.x)) + (a2 * (u2.x))) + (a3 * (u3.x));
		this.y = ((a1 * (u1.y)) + (a2 * (u2.y))) + (a3 * (u3.y));
	}

	public Vector2D(double a1, org.apache.commons.math3.geometry.euclidean.twod.Vector2D u1, double a2, org.apache.commons.math3.geometry.euclidean.twod.Vector2D u2, double a3, org.apache.commons.math3.geometry.euclidean.twod.Vector2D u3, double a4, org.apache.commons.math3.geometry.euclidean.twod.Vector2D u4) {
		this.x = (((a1 * (u1.x)) + (a2 * (u2.x))) + (a3 * (u3.x))) + (a4 * (u4.x));
		this.y = (((a1 * (u1.y)) + (a2 * (u2.y))) + (a3 * (u3.y))) + (a4 * (u4.y));
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double[] toArray() {
		return new double[]{ x , y };
	}

	public org.apache.commons.math3.geometry.Space getSpace() {
		return org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D.getInstance();
	}

	public org.apache.commons.math3.geometry.euclidean.twod.Vector2D getZero() {
		return org.apache.commons.math3.geometry.euclidean.twod.Vector2D.ZERO;
	}

	public double getNorm1() {
		return (org.apache.commons.math3.util.FastMath.abs(x)) + (org.apache.commons.math3.util.FastMath.abs(y));
	}

	public double getNorm() {
		return org.apache.commons.math3.util.FastMath.sqrt((((x) * (x)) + ((y) * (y))));
	}

	public double getNormSq() {
		return ((x) * (x)) + ((y) * (y));
	}

	public double getNormInf() {
		return org.apache.commons.math3.util.FastMath.max(org.apache.commons.math3.util.FastMath.abs(x), org.apache.commons.math3.util.FastMath.abs(y));
	}

	public org.apache.commons.math3.geometry.euclidean.twod.Vector2D add(org.apache.commons.math3.geometry.Vector<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> v) {
		org.apache.commons.math3.geometry.euclidean.twod.Vector2D v2 = ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D) (v));
		return new org.apache.commons.math3.geometry.euclidean.twod.Vector2D(((x) + (v2.getX())), ((y) + (v2.getY())));
	}

	public org.apache.commons.math3.geometry.euclidean.twod.Vector2D add(double factor, org.apache.commons.math3.geometry.Vector<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> v) {
		org.apache.commons.math3.geometry.euclidean.twod.Vector2D v2 = ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D) (v));
		return new org.apache.commons.math3.geometry.euclidean.twod.Vector2D(((x) + (factor * (v2.getX()))), ((y) + (factor * (v2.getY()))));
	}

	public org.apache.commons.math3.geometry.euclidean.twod.Vector2D subtract(org.apache.commons.math3.geometry.Vector<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> p) {
		org.apache.commons.math3.geometry.euclidean.twod.Vector2D p3 = ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D) (p));
		return new org.apache.commons.math3.geometry.euclidean.twod.Vector2D(((x) - (p3.x)), ((y) - (p3.y)));
	}

	public org.apache.commons.math3.geometry.euclidean.twod.Vector2D subtract(double factor, org.apache.commons.math3.geometry.Vector<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> v) {
		org.apache.commons.math3.geometry.euclidean.twod.Vector2D v2 = ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D) (v));
		return new org.apache.commons.math3.geometry.euclidean.twod.Vector2D(((x) - (factor * (v2.getX()))), ((y) - (factor * (v2.getY()))));
	}

	public org.apache.commons.math3.geometry.euclidean.twod.Vector2D normalize() {
		double s = getNorm();
		if (s == 0) {
			throw new org.apache.commons.math3.exception.MathArithmeticException(org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_NORMALIZE_A_ZERO_NORM_VECTOR);
		}
		return scalarMultiply((1 / s));
	}

	public org.apache.commons.math3.geometry.euclidean.twod.Vector2D negate() {
		return new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((-(x)), (-(y)));
	}

	public org.apache.commons.math3.geometry.euclidean.twod.Vector2D scalarMultiply(double a) {
		return new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((a * (x)), (a * (y)));
	}

	public boolean isNaN() {
		return (java.lang.Double.isNaN(x)) || (java.lang.Double.isNaN(y));
	}

	public boolean isInfinite() {
		return (!(isNaN())) && ((java.lang.Double.isInfinite(x)) || (java.lang.Double.isInfinite(y)));
	}

	public double distance1(org.apache.commons.math3.geometry.Vector<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> p) {
		org.apache.commons.math3.geometry.euclidean.twod.Vector2D p3 = ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D) (p));
		final double dx = org.apache.commons.math3.util.FastMath.abs(((p3.x) - (x)));
		final double dy = org.apache.commons.math3.util.FastMath.abs(((p3.y) - (y)));
		return dx + dy;
	}

	public double distance(org.apache.commons.math3.geometry.Vector<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> p) {
		org.apache.commons.math3.geometry.euclidean.twod.Vector2D p3 = ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D) (p));
		final double dx = (p3.x) - (x);
		final double dy = (p3.y) - (y);
		return org.apache.commons.math3.util.FastMath.sqrt(((dx * dx) + (dy * dy)));
	}

	public double distanceInf(org.apache.commons.math3.geometry.Vector<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> p) {
		org.apache.commons.math3.geometry.euclidean.twod.Vector2D p3 = ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D) (p));
		final double dx = org.apache.commons.math3.util.FastMath.abs(((p3.x) - (x)));
		final double dy = org.apache.commons.math3.util.FastMath.abs(((p3.y) - (y)));
		return org.apache.commons.math3.util.FastMath.max(dx, dy);
	}

	public double distanceSq(org.apache.commons.math3.geometry.Vector<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> p) {
		org.apache.commons.math3.geometry.euclidean.twod.Vector2D p3 = ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D) (p));
		final double dx = (p3.x) - (x);
		final double dy = (p3.y) - (y);
		return (dx * dx) + (dy * dy);
	}

	public double dotProduct(final org.apache.commons.math3.geometry.Vector<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> v) {
		final org.apache.commons.math3.geometry.euclidean.twod.Vector2D v2 = ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D) (v));
		return ((x) * (v2.x)) + ((y) * (v2.y));
	}

	public static double distance(org.apache.commons.math3.geometry.euclidean.twod.Vector2D p1, org.apache.commons.math3.geometry.euclidean.twod.Vector2D p2) {
		return p1.distance(p2);
	}

	public static double distanceInf(org.apache.commons.math3.geometry.euclidean.twod.Vector2D p1, org.apache.commons.math3.geometry.euclidean.twod.Vector2D p2) {
		return p1.distanceInf(p2);
	}

	public static double distanceSq(org.apache.commons.math3.geometry.euclidean.twod.Vector2D p1, org.apache.commons.math3.geometry.euclidean.twod.Vector2D p2) {
		return p1.distanceSq(p2);
	}

	@java.lang.Override
	public boolean equals(java.lang.Object other) {
		if ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D.this) == other) {
			return true;
		}
		if (other instanceof org.apache.commons.math3.geometry.euclidean.twod.Vector2D) {
			final org.apache.commons.math3.geometry.euclidean.twod.Vector2D rhs = ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D) (other));
			if (rhs.isNaN()) {
				return org.apache.commons.math3.geometry.euclidean.twod.Vector2D.this.isNaN();
			}
			return ((x) == (rhs.x)) && ((y) == (rhs.y));
		}
		return false;
	}

	@java.lang.Override
	public int hashCode() {
		if (isNaN()) {
			return 542;
		}
		return 122 * ((76 * (org.apache.commons.math3.util.MathUtils.hash(x))) + (org.apache.commons.math3.util.MathUtils.hash(y)));
	}

	@java.lang.Override
	public java.lang.String toString() {
		return org.apache.commons.math3.geometry.euclidean.twod.Vector2DFormat.getInstance().format(org.apache.commons.math3.geometry.euclidean.twod.Vector2D.this);
	}

	public java.lang.String toString(final java.text.NumberFormat format) {
		return new org.apache.commons.math3.geometry.euclidean.twod.Vector2DFormat(format).format(org.apache.commons.math3.geometry.euclidean.twod.Vector2D.this);
	}
}

