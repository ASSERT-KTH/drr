

package org.apache.commons.math.geometry.euclidean.threed;


public class Vector3D implements java.io.Serializable , org.apache.commons.math.geometry.Vector<org.apache.commons.math.geometry.euclidean.threed.Euclidean3D> {
	public static final org.apache.commons.math.geometry.euclidean.threed.Vector3D ZERO = new org.apache.commons.math.geometry.euclidean.threed.Vector3D(0, 0, 0);

	public static final org.apache.commons.math.geometry.euclidean.threed.Vector3D PLUS_I = new org.apache.commons.math.geometry.euclidean.threed.Vector3D(1, 0, 0);

	public static final org.apache.commons.math.geometry.euclidean.threed.Vector3D MINUS_I = new org.apache.commons.math.geometry.euclidean.threed.Vector3D((-1), 0, 0);

	public static final org.apache.commons.math.geometry.euclidean.threed.Vector3D PLUS_J = new org.apache.commons.math.geometry.euclidean.threed.Vector3D(0, 1, 0);

	public static final org.apache.commons.math.geometry.euclidean.threed.Vector3D MINUS_J = new org.apache.commons.math.geometry.euclidean.threed.Vector3D(0, (-1), 0);

	public static final org.apache.commons.math.geometry.euclidean.threed.Vector3D PLUS_K = new org.apache.commons.math.geometry.euclidean.threed.Vector3D(0, 0, 1);

	public static final org.apache.commons.math.geometry.euclidean.threed.Vector3D MINUS_K = new org.apache.commons.math.geometry.euclidean.threed.Vector3D(0, 0, (-1));

	public static final org.apache.commons.math.geometry.euclidean.threed.Vector3D NaN = new org.apache.commons.math.geometry.euclidean.threed.Vector3D(java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN);

	public static final org.apache.commons.math.geometry.euclidean.threed.Vector3D POSITIVE_INFINITY = new org.apache.commons.math.geometry.euclidean.threed.Vector3D(java.lang.Double.POSITIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY);

	public static final org.apache.commons.math.geometry.euclidean.threed.Vector3D NEGATIVE_INFINITY = new org.apache.commons.math.geometry.euclidean.threed.Vector3D(java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.NEGATIVE_INFINITY);

	private static final long serialVersionUID = 1313493323784566947L;

	private final double x;

	private final double y;

	private final double z;

	public Vector3D(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public Vector3D(double[] v) throws org.apache.commons.math.exception.DimensionMismatchException {
		if ((v.length) != 3) {
			throw new org.apache.commons.math.exception.DimensionMismatchException(v.length, 3);
		}
		this.x = v[0];
		this.y = v[1];
		this.z = v[2];
	}

	public Vector3D(double alpha, double delta) {
		double cosDelta = org.apache.commons.math.util.FastMath.cos(delta);
		this.x = (org.apache.commons.math.util.FastMath.cos(alpha)) * cosDelta;
		this.y = (org.apache.commons.math.util.FastMath.sin(alpha)) * cosDelta;
		this.z = org.apache.commons.math.util.FastMath.sin(delta);
	}

	public Vector3D(double a, org.apache.commons.math.geometry.euclidean.threed.Vector3D u) {
		this.x = a * (u.x);
		this.y = a * (u.y);
		this.z = a * (u.z);
	}

	public Vector3D(double a1, org.apache.commons.math.geometry.euclidean.threed.Vector3D u1, double a2, org.apache.commons.math.geometry.euclidean.threed.Vector3D u2) {
		this.x = org.apache.commons.math.util.MathArrays.linearCombination(a1, u1.x, a2, u2.x);
		this.y = org.apache.commons.math.util.MathArrays.linearCombination(a1, u1.y, a2, u2.y);
		this.z = org.apache.commons.math.util.MathArrays.linearCombination(a1, u1.z, a2, u2.z);
	}

	public Vector3D(double a1, org.apache.commons.math.geometry.euclidean.threed.Vector3D u1, double a2, org.apache.commons.math.geometry.euclidean.threed.Vector3D u2, double a3, org.apache.commons.math.geometry.euclidean.threed.Vector3D u3) {
		this.x = org.apache.commons.math.util.MathArrays.linearCombination(a1, u1.x, a2, u2.x, a3, u3.x);
		this.y = org.apache.commons.math.util.MathArrays.linearCombination(a1, u1.y, a2, u2.y, a3, u3.y);
		this.z = org.apache.commons.math.util.MathArrays.linearCombination(a1, u1.z, a2, u2.z, a3, u3.z);
	}

	public Vector3D(double a1, org.apache.commons.math.geometry.euclidean.threed.Vector3D u1, double a2, org.apache.commons.math.geometry.euclidean.threed.Vector3D u2, double a3, org.apache.commons.math.geometry.euclidean.threed.Vector3D u3, double a4, org.apache.commons.math.geometry.euclidean.threed.Vector3D u4) {
		this.x = org.apache.commons.math.util.MathArrays.linearCombination(a1, u1.x, a2, u2.x, a3, u3.x, a4, u4.x);
		this.y = org.apache.commons.math.util.MathArrays.linearCombination(a1, u1.y, a2, u2.y, a3, u3.y, a4, u4.y);
		this.z = org.apache.commons.math.util.MathArrays.linearCombination(a1, u1.z, a2, u2.z, a3, u3.z, a4, u4.z);
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double getZ() {
		return z;
	}

	public double[] toArray() {
		return new double[]{ x , y , z };
	}

	public org.apache.commons.math.geometry.Space getSpace() {
		return org.apache.commons.math.geometry.euclidean.threed.Euclidean3D.getInstance();
	}

	public org.apache.commons.math.geometry.euclidean.threed.Vector3D getZero() {
		return org.apache.commons.math.geometry.euclidean.threed.Vector3D.ZERO;
	}

	public double getNorm1() {
		return ((org.apache.commons.math.util.FastMath.abs(x)) + (org.apache.commons.math.util.FastMath.abs(y))) + (org.apache.commons.math.util.FastMath.abs(z));
	}

	public double getNorm() {
		return org.apache.commons.math.util.FastMath.sqrt(((((x) * (x)) + ((y) * (y))) + ((z) * (z))));
	}

	public double getNormSq() {
		return (((x) * (x)) + ((y) * (y))) + ((z) * (z));
	}

	public double getNormInf() {
		return org.apache.commons.math.util.FastMath.max(org.apache.commons.math.util.FastMath.max(org.apache.commons.math.util.FastMath.abs(x), org.apache.commons.math.util.FastMath.abs(y)), org.apache.commons.math.util.FastMath.abs(z));
	}

	public double getAlpha() {
		return org.apache.commons.math.util.FastMath.atan2(y, x);
	}

	public double getDelta() {
		return org.apache.commons.math.util.FastMath.asin(((z) / (getNorm())));
	}

	public org.apache.commons.math.geometry.euclidean.threed.Vector3D add(final org.apache.commons.math.geometry.Vector<org.apache.commons.math.geometry.euclidean.threed.Euclidean3D> v) {
		final org.apache.commons.math.geometry.euclidean.threed.Vector3D v3 = ((org.apache.commons.math.geometry.euclidean.threed.Vector3D) (v));
		return new org.apache.commons.math.geometry.euclidean.threed.Vector3D(((x) + (v3.x)), ((y) + (v3.y)), ((z) + (v3.z)));
	}

	public org.apache.commons.math.geometry.euclidean.threed.Vector3D add(double factor, final org.apache.commons.math.geometry.Vector<org.apache.commons.math.geometry.euclidean.threed.Euclidean3D> v) {
		return new org.apache.commons.math.geometry.euclidean.threed.Vector3D(1, org.apache.commons.math.geometry.euclidean.threed.Vector3D.this, factor, ((org.apache.commons.math.geometry.euclidean.threed.Vector3D) (v)));
	}

	public org.apache.commons.math.geometry.euclidean.threed.Vector3D subtract(final org.apache.commons.math.geometry.Vector<org.apache.commons.math.geometry.euclidean.threed.Euclidean3D> v) {
		final org.apache.commons.math.geometry.euclidean.threed.Vector3D v3 = ((org.apache.commons.math.geometry.euclidean.threed.Vector3D) (v));
		return new org.apache.commons.math.geometry.euclidean.threed.Vector3D(((x) - (v3.x)), ((y) - (v3.y)), ((z) - (v3.z)));
	}

	public org.apache.commons.math.geometry.euclidean.threed.Vector3D subtract(final double factor, final org.apache.commons.math.geometry.Vector<org.apache.commons.math.geometry.euclidean.threed.Euclidean3D> v) {
		return new org.apache.commons.math.geometry.euclidean.threed.Vector3D(1, org.apache.commons.math.geometry.euclidean.threed.Vector3D.this, (-factor), ((org.apache.commons.math.geometry.euclidean.threed.Vector3D) (v)));
	}

	public org.apache.commons.math.geometry.euclidean.threed.Vector3D normalize() {
		double s = getNorm();
		if (s == 0) {
			throw new org.apache.commons.math.exception.MathArithmeticException(org.apache.commons.math.exception.util.LocalizedFormats.CANNOT_NORMALIZE_A_ZERO_NORM_VECTOR);
		}
		return scalarMultiply((1 / s));
	}

	public org.apache.commons.math.geometry.euclidean.threed.Vector3D orthogonal() {
		double threshold = 0.6 * (getNorm());
		if (threshold == 0) {
			throw new org.apache.commons.math.exception.MathArithmeticException(org.apache.commons.math.exception.util.LocalizedFormats.ZERO_NORM);
		}
		if (((x) >= (-threshold)) && ((x) <= threshold)) {
			double inverse = 1 / (org.apache.commons.math.util.FastMath.sqrt((((y) * (y)) + ((z) * (z)))));
			return new org.apache.commons.math.geometry.euclidean.threed.Vector3D(0, (inverse * (z)), ((-inverse) * (y)));
		}else
			if (((y) >= (-threshold)) && ((y) <= threshold)) {
				double inverse = 1 / (org.apache.commons.math.util.FastMath.sqrt((((x) * (x)) + ((z) * (z)))));
				return new org.apache.commons.math.geometry.euclidean.threed.Vector3D(((-inverse) * (z)), 0, (inverse * (x)));
			}
		
		double inverse = 1 / (org.apache.commons.math.util.FastMath.sqrt((((x) * (x)) + ((y) * (y)))));
		return new org.apache.commons.math.geometry.euclidean.threed.Vector3D((inverse * (y)), ((-inverse) * (x)), 0);
	}

	public static double angle(org.apache.commons.math.geometry.euclidean.threed.Vector3D v1, org.apache.commons.math.geometry.euclidean.threed.Vector3D v2) {
		double normProduct = (v1.getNorm()) * (v2.getNorm());
		if (normProduct == 0) {
			throw new org.apache.commons.math.exception.MathArithmeticException(org.apache.commons.math.exception.util.LocalizedFormats.ZERO_NORM);
		}
		double dot = v1.dotProduct(v2);
		double threshold = normProduct * 0.9999;
		if ((dot < (-threshold)) || (dot > threshold)) {
			org.apache.commons.math.geometry.euclidean.threed.Vector3D v3 = org.apache.commons.math.geometry.euclidean.threed.Vector3D.crossProduct(v1, v2);
			if (dot >= 0) {
				return org.apache.commons.math.util.FastMath.asin(((v3.getNorm()) / normProduct));
			}
			return (org.apache.commons.math.util.FastMath.PI) - (org.apache.commons.math.util.FastMath.asin(((v3.getNorm()) / normProduct)));
		}
		return org.apache.commons.math.util.FastMath.acos((dot / normProduct));
	}

	public org.apache.commons.math.geometry.euclidean.threed.Vector3D negate() {
		return new org.apache.commons.math.geometry.euclidean.threed.Vector3D((-(x)), (-(y)), (-(z)));
	}

	public org.apache.commons.math.geometry.euclidean.threed.Vector3D scalarMultiply(double a) {
		return new org.apache.commons.math.geometry.euclidean.threed.Vector3D((a * (x)), (a * (y)), (a * (z)));
	}

	public boolean isNaN() {
		return ((java.lang.Double.isNaN(x)) || (java.lang.Double.isNaN(y))) || (java.lang.Double.isNaN(z));
	}

	public boolean isInfinite() {
		return (!(isNaN())) && (((java.lang.Double.isInfinite(x)) || (java.lang.Double.isInfinite(y))) || (java.lang.Double.isInfinite(z)));
	}

	@java.lang.Override
	public boolean equals(java.lang.Object other) {
		if ((org.apache.commons.math.geometry.euclidean.threed.Vector3D.this) == other) {
			return true;
		}
		if (other instanceof org.apache.commons.math.geometry.euclidean.threed.Vector3D) {
			final org.apache.commons.math.geometry.euclidean.threed.Vector3D rhs = ((org.apache.commons.math.geometry.euclidean.threed.Vector3D) (other));
			if (rhs.isNaN()) {
				return org.apache.commons.math.geometry.euclidean.threed.Vector3D.this.isNaN();
			}
			return (((x) == (rhs.x)) && ((y) == (rhs.y))) && ((z) == (rhs.z));
		}
		return false;
	}

	@java.lang.Override
	public int hashCode() {
		if (isNaN()) {
			return 642;
		}
		return 643 * (((164 * (org.apache.commons.math.util.MathUtils.hash(x))) + (3 * (org.apache.commons.math.util.MathUtils.hash(y)))) + (org.apache.commons.math.util.MathUtils.hash(z)));
	}

	public double dotProduct(final org.apache.commons.math.geometry.Vector<org.apache.commons.math.geometry.euclidean.threed.Euclidean3D> v) {
		final org.apache.commons.math.geometry.euclidean.threed.Vector3D v3 = ((org.apache.commons.math.geometry.euclidean.threed.Vector3D) (v));
		return org.apache.commons.math.util.MathArrays.linearCombination(x, v3.x, y, v3.y, z, v3.z);
	}

	public org.apache.commons.math.geometry.euclidean.threed.Vector3D crossProduct(final org.apache.commons.math.geometry.Vector<org.apache.commons.math.geometry.euclidean.threed.Euclidean3D> v) {
		final org.apache.commons.math.geometry.euclidean.threed.Vector3D v3 = ((org.apache.commons.math.geometry.euclidean.threed.Vector3D) (v));
		return new org.apache.commons.math.geometry.euclidean.threed.Vector3D(org.apache.commons.math.util.MathArrays.linearCombination(y, v3.z, (-(z)), v3.y), org.apache.commons.math.util.MathArrays.linearCombination(z, v3.x, (-(x)), v3.z), org.apache.commons.math.util.MathArrays.linearCombination(x, v3.y, (-(y)), v3.x));
	}

	public double distance1(org.apache.commons.math.geometry.Vector<org.apache.commons.math.geometry.euclidean.threed.Euclidean3D> v) {
		final org.apache.commons.math.geometry.euclidean.threed.Vector3D v3 = ((org.apache.commons.math.geometry.euclidean.threed.Vector3D) (v));
		final double dx = org.apache.commons.math.util.FastMath.abs(((v3.x) - (x)));
		final double dy = org.apache.commons.math.util.FastMath.abs(((v3.y) - (y)));
		final double dz = org.apache.commons.math.util.FastMath.abs(((v3.z) - (z)));
		return (dx + dy) + dz;
	}

	public double distance(org.apache.commons.math.geometry.Vector<org.apache.commons.math.geometry.euclidean.threed.Euclidean3D> v) {
		final org.apache.commons.math.geometry.euclidean.threed.Vector3D v3 = ((org.apache.commons.math.geometry.euclidean.threed.Vector3D) (v));
		final double dx = (v3.x) - (x);
		final double dy = (v3.y) - (y);
		final double dz = (v3.z) - (z);
		return org.apache.commons.math.util.FastMath.sqrt((((dx * dx) + (dy * dy)) + (dz * dz)));
	}

	public double distanceInf(org.apache.commons.math.geometry.Vector<org.apache.commons.math.geometry.euclidean.threed.Euclidean3D> v) {
		final org.apache.commons.math.geometry.euclidean.threed.Vector3D v3 = ((org.apache.commons.math.geometry.euclidean.threed.Vector3D) (v));
		final double dx = org.apache.commons.math.util.FastMath.abs(((v3.x) - (x)));
		final double dy = org.apache.commons.math.util.FastMath.abs(((v3.y) - (y)));
		final double dz = org.apache.commons.math.util.FastMath.abs(((v3.z) - (z)));
		return org.apache.commons.math.util.FastMath.max(org.apache.commons.math.util.FastMath.max(dx, dy), dz);
	}

	public double distanceSq(org.apache.commons.math.geometry.Vector<org.apache.commons.math.geometry.euclidean.threed.Euclidean3D> v) {
		final org.apache.commons.math.geometry.euclidean.threed.Vector3D v3 = ((org.apache.commons.math.geometry.euclidean.threed.Vector3D) (v));
		final double dx = (v3.x) - (x);
		final double dy = (v3.y) - (y);
		final double dz = (v3.z) - (z);
		return ((dx * dx) + (dy * dy)) + (dz * dz);
	}

	public static double dotProduct(org.apache.commons.math.geometry.euclidean.threed.Vector3D v1, org.apache.commons.math.geometry.euclidean.threed.Vector3D v2) {
		return v1.dotProduct(v2);
	}

	public static org.apache.commons.math.geometry.euclidean.threed.Vector3D crossProduct(final org.apache.commons.math.geometry.euclidean.threed.Vector3D v1, final org.apache.commons.math.geometry.euclidean.threed.Vector3D v2) {
		return v1.crossProduct(v2);
	}

	public static double distance1(org.apache.commons.math.geometry.euclidean.threed.Vector3D v1, org.apache.commons.math.geometry.euclidean.threed.Vector3D v2) {
		return v1.distance1(v2);
	}

	public static double distance(org.apache.commons.math.geometry.euclidean.threed.Vector3D v1, org.apache.commons.math.geometry.euclidean.threed.Vector3D v2) {
		return v1.distance(v2);
	}

	public static double distanceInf(org.apache.commons.math.geometry.euclidean.threed.Vector3D v1, org.apache.commons.math.geometry.euclidean.threed.Vector3D v2) {
		return v1.distanceInf(v2);
	}

	public static double distanceSq(org.apache.commons.math.geometry.euclidean.threed.Vector3D v1, org.apache.commons.math.geometry.euclidean.threed.Vector3D v2) {
		return v1.distanceSq(v2);
	}

	@java.lang.Override
	public java.lang.String toString() {
		return org.apache.commons.math.geometry.euclidean.threed.Vector3DFormat.getInstance().format(org.apache.commons.math.geometry.euclidean.threed.Vector3D.this);
	}

	public java.lang.String toString(final java.text.NumberFormat format) {
		return new org.apache.commons.math.geometry.euclidean.threed.Vector3DFormat(format).format(org.apache.commons.math.geometry.euclidean.threed.Vector3D.this);
	}
}

