

package org.apache.commons.math.linear;


public class NonSelfAdjointLinearOperatorException extends org.apache.commons.math.exception.MathIllegalArgumentException {
	private final org.apache.commons.math.linear.RealLinearOperator a;

	private final double threshold;

	private final org.apache.commons.math.linear.RealVector x;

	private final org.apache.commons.math.linear.RealVector y;

	public NonSelfAdjointLinearOperatorException(final org.apache.commons.math.linear.RealLinearOperator a, final double[] x, final double[] y, final double threshold) {
		this(a, new org.apache.commons.math.linear.ArrayRealVector(x, false), new org.apache.commons.math.linear.ArrayRealVector(y, false), threshold);
	}

	public NonSelfAdjointLinearOperatorException(final org.apache.commons.math.linear.RealLinearOperator a, final org.apache.commons.math.linear.RealVector x, final org.apache.commons.math.linear.RealVector y, final double threshold) {
		super(org.apache.commons.math.exception.util.LocalizedFormats.NON_SELF_ADJOINT_LINEAR_OPERATOR, threshold, x, y);
		this.a = a;
		this.x = x;
		this.y = y;
		this.threshold = threshold;
	}

	public org.apache.commons.math.linear.RealVector getFirstOffendingVector() {
		return x;
	}

	public org.apache.commons.math.linear.RealLinearOperator getOffendingLinearOperator() {
		return a;
	}

	public org.apache.commons.math.linear.RealVector getSecondOffendingVector() {
		return y;
	}

	public double getThreshold() {
		return threshold;
	}
}

