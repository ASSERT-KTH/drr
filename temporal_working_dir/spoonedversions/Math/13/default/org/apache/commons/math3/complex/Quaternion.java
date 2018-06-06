

package org.apache.commons.math3.complex;


public final class Quaternion implements java.io.Serializable {
	public static final org.apache.commons.math3.complex.Quaternion IDENTITY = new org.apache.commons.math3.complex.Quaternion(1, 0, 0, 0);

	public static final org.apache.commons.math3.complex.Quaternion ZERO = new org.apache.commons.math3.complex.Quaternion(0, 0, 0, 0);

	public static final org.apache.commons.math3.complex.Quaternion I = new org.apache.commons.math3.complex.Quaternion(0, 1, 0, 0);

	public static final org.apache.commons.math3.complex.Quaternion J = new org.apache.commons.math3.complex.Quaternion(0, 0, 1, 0);

	public static final org.apache.commons.math3.complex.Quaternion K = new org.apache.commons.math3.complex.Quaternion(0, 0, 0, 1);

	private static final long serialVersionUID = 20092012L;

	private final double q0;

	private final double q1;

	private final double q2;

	private final double q3;

	public Quaternion(final double a, final double b, final double c, final double d) {
		this.q0 = a;
		this.q1 = b;
		this.q2 = c;
		this.q3 = d;
	}

	public Quaternion(final double scalar, final double[] v) throws org.apache.commons.math3.exception.DimensionMismatchException {
		if ((v.length) != 3) {
			throw new org.apache.commons.math3.exception.DimensionMismatchException(v.length, 3);
		}
		this.q0 = scalar;
		this.q1 = v[0];
		this.q2 = v[1];
		this.q3 = v[2];
	}

	public Quaternion(final double[] v) {
		this(0, v);
	}

	public org.apache.commons.math3.complex.Quaternion getConjugate() {
		return new org.apache.commons.math3.complex.Quaternion(q0, (-(q1)), (-(q2)), (-(q3)));
	}

	public static org.apache.commons.math3.complex.Quaternion multiply(final org.apache.commons.math3.complex.Quaternion q1, final org.apache.commons.math3.complex.Quaternion q2) {
		final double q1a = q1.getQ0();
		final double q1b = q1.getQ1();
		final double q1c = q1.getQ2();
		final double q1d = q1.getQ3();
		final double q2a = q2.getQ0();
		final double q2b = q2.getQ1();
		final double q2c = q2.getQ2();
		final double q2d = q2.getQ3();
		final double w = (((q1a * q2a) - (q1b * q2b)) - (q1c * q2c)) - (q1d * q2d);
		final double x = (((q1a * q2b) + (q1b * q2a)) + (q1c * q2d)) - (q1d * q2c);
		final double y = (((q1a * q2c) - (q1b * q2d)) + (q1c * q2a)) + (q1d * q2b);
		final double z = (((q1a * q2d) + (q1b * q2c)) - (q1c * q2b)) + (q1d * q2a);
		return new org.apache.commons.math3.complex.Quaternion(w, x, y, z);
	}

	public org.apache.commons.math3.complex.Quaternion multiply(final org.apache.commons.math3.complex.Quaternion q) {
		return org.apache.commons.math3.complex.Quaternion.multiply(org.apache.commons.math3.complex.Quaternion.this, q);
	}

	public static org.apache.commons.math3.complex.Quaternion add(final org.apache.commons.math3.complex.Quaternion q1, final org.apache.commons.math3.complex.Quaternion q2) {
		return new org.apache.commons.math3.complex.Quaternion(((q1.getQ0()) + (q2.getQ0())), ((q1.getQ1()) + (q2.getQ1())), ((q1.getQ2()) + (q2.getQ2())), ((q1.getQ3()) + (q2.getQ3())));
	}

	public org.apache.commons.math3.complex.Quaternion add(final org.apache.commons.math3.complex.Quaternion q) {
		return org.apache.commons.math3.complex.Quaternion.add(org.apache.commons.math3.complex.Quaternion.this, q);
	}

	public static org.apache.commons.math3.complex.Quaternion subtract(final org.apache.commons.math3.complex.Quaternion q1, final org.apache.commons.math3.complex.Quaternion q2) {
		return new org.apache.commons.math3.complex.Quaternion(((q1.getQ0()) - (q2.getQ0())), ((q1.getQ1()) - (q2.getQ1())), ((q1.getQ2()) - (q2.getQ2())), ((q1.getQ3()) - (q2.getQ3())));
	}

	public org.apache.commons.math3.complex.Quaternion subtract(final org.apache.commons.math3.complex.Quaternion q) {
		return org.apache.commons.math3.complex.Quaternion.subtract(org.apache.commons.math3.complex.Quaternion.this, q);
	}

	public static double dotProduct(final org.apache.commons.math3.complex.Quaternion q1, final org.apache.commons.math3.complex.Quaternion q2) {
		return ((((q1.getQ0()) * (q2.getQ0())) + ((q1.getQ1()) * (q2.getQ1()))) + ((q1.getQ2()) * (q2.getQ2()))) + ((q1.getQ3()) * (q2.getQ3()));
	}

	public double dotProduct(final org.apache.commons.math3.complex.Quaternion q) {
		return org.apache.commons.math3.complex.Quaternion.dotProduct(org.apache.commons.math3.complex.Quaternion.this, q);
	}

	public double getNorm() {
		return org.apache.commons.math3.util.FastMath.sqrt((((((q0) * (q0)) + ((q1) * (q1))) + ((q2) * (q2))) + ((q3) * (q3))));
	}

	public org.apache.commons.math3.complex.Quaternion normalize() {
		final double norm = getNorm();
		if (norm < (org.apache.commons.math3.util.Precision.SAFE_MIN)) {
			throw new org.apache.commons.math3.exception.ZeroException(org.apache.commons.math3.exception.util.LocalizedFormats.NORM, norm);
		}
		return new org.apache.commons.math3.complex.Quaternion(((q0) / norm), ((q1) / norm), ((q2) / norm), ((q3) / norm));
	}

	@java.lang.Override
	public boolean equals(java.lang.Object other) {
		if ((org.apache.commons.math3.complex.Quaternion.this) == other) {
			return true;
		}
		if (other instanceof org.apache.commons.math3.complex.Quaternion) {
			final org.apache.commons.math3.complex.Quaternion q = ((org.apache.commons.math3.complex.Quaternion) (other));
			return ((((q0) == (q.getQ0())) && ((q1) == (q.getQ1()))) && ((q2) == (q.getQ2()))) && ((q3) == (q.getQ3()));
		}
		return false;
	}

	@java.lang.Override
	public int hashCode() {
		int result = 17;
		for (double comp : new double[]{ q0 , q1 , q2 , q3 }) {
			final int c = org.apache.commons.math3.util.MathUtils.hash(comp);
			result = (31 * result) + c;
		}
		return result;
	}

	public boolean equals(final org.apache.commons.math3.complex.Quaternion q, final double eps) {
		return (((org.apache.commons.math3.util.Precision.equals(q0, q.getQ0(), eps)) && (org.apache.commons.math3.util.Precision.equals(q1, q.getQ1(), eps))) && (org.apache.commons.math3.util.Precision.equals(q2, q.getQ2(), eps))) && (org.apache.commons.math3.util.Precision.equals(q3, q.getQ3(), eps));
	}

	public boolean isUnitQuaternion(double eps) {
		return org.apache.commons.math3.util.Precision.equals(getNorm(), 1.0, eps);
	}

	public boolean isPureQuaternion(double eps) {
		return (org.apache.commons.math3.util.FastMath.abs(getQ0())) <= eps;
	}

	public org.apache.commons.math3.complex.Quaternion getPositivePolarForm() {
		if ((getQ0()) < 0) {
			final org.apache.commons.math3.complex.Quaternion unitQ = normalize();
			return new org.apache.commons.math3.complex.Quaternion((-(unitQ.getQ0())), (-(unitQ.getQ1())), (-(unitQ.getQ2())), (-(unitQ.getQ3())));
		}else {
			return org.apache.commons.math3.complex.Quaternion.this.normalize();
		}
	}

	public org.apache.commons.math3.complex.Quaternion getInverse() {
		final double squareNorm = ((((q0) * (q0)) + ((q1) * (q1))) + ((q2) * (q2))) + ((q3) * (q3));
		if (squareNorm < (org.apache.commons.math3.util.Precision.SAFE_MIN)) {
			throw new org.apache.commons.math3.exception.ZeroException(org.apache.commons.math3.exception.util.LocalizedFormats.NORM, squareNorm);
		}
		return new org.apache.commons.math3.complex.Quaternion(((q0) / squareNorm), ((-(q1)) / squareNorm), ((-(q2)) / squareNorm), ((-(q3)) / squareNorm));
	}

	public double getQ0() {
		return q0;
	}

	public double getQ1() {
		return q1;
	}

	public double getQ2() {
		return q2;
	}

	public double getQ3() {
		return q3;
	}

	public double getScalarPart() {
		return getQ0();
	}

	public double[] getVectorPart() {
		return new double[]{ getQ1() , getQ2() , getQ3() };
	}

	public org.apache.commons.math3.complex.Quaternion multiply(final double alpha) {
		return new org.apache.commons.math3.complex.Quaternion((alpha * (q0)), (alpha * (q1)), (alpha * (q2)), (alpha * (q3)));
	}

	@java.lang.Override
	public java.lang.String toString() {
		final java.lang.String sp = " ";
		final java.lang.StringBuilder s = new java.lang.StringBuilder();
		s.append("[").append(q0).append(sp).append(q1).append(sp).append(q2).append(sp).append(q3).append("]");
		return s.toString();
	}
}

