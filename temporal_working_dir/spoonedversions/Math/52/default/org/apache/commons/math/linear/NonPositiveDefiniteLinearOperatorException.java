

package org.apache.commons.math.linear;


public class NonPositiveDefiniteLinearOperatorException extends org.apache.commons.math.exception.MathIllegalArgumentException {
	private final org.apache.commons.math.linear.RealLinearOperator a;

	private final org.apache.commons.math.linear.RealVector x;

	public NonPositiveDefiniteLinearOperatorException(final org.apache.commons.math.linear.RealLinearOperator a, final double[] x) {
		this(a, new org.apache.commons.math.linear.ArrayRealVector(x, false));
	}

	public NonPositiveDefiniteLinearOperatorException(final org.apache.commons.math.linear.RealLinearOperator a, final org.apache.commons.math.linear.RealVector x) {
		super(org.apache.commons.math.exception.util.LocalizedFormats.NON_POSITIVE_DEFINITE_LINEAR_OPERATOR, x);
		this.a = a;
		this.x = x;
	}

	public org.apache.commons.math.linear.RealVector getOffendingVector() {
		return x;
	}

	public org.apache.commons.math.linear.RealLinearOperator getOffendingLinearOperator() {
		return a;
	}
}

