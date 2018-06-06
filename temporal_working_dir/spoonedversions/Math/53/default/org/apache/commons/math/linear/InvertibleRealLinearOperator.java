

package org.apache.commons.math.linear;


public abstract class InvertibleRealLinearOperator extends org.apache.commons.math.linear.RealLinearOperator {
	public InvertibleRealLinearOperator(final int dim) {
		super(dim, dim);
	}

	public double[] solve(final double[] b) {
		if ((b.length) != (getRowDimension())) {
			throw new org.apache.commons.math.exception.DimensionMismatchException(b.length, getRowDimension());
		}
		final org.apache.commons.math.linear.RealVector x = solve(new org.apache.commons.math.linear.ArrayRealVector(b, false));
		if (x instanceof org.apache.commons.math.linear.ArrayRealVector) {
			return ((org.apache.commons.math.linear.ArrayRealVector) (x)).getDataRef();
		}else {
			return x.getData();
		}
	}

	public abstract org.apache.commons.math.linear.RealVector solve(final org.apache.commons.math.linear.RealVector b);
}

