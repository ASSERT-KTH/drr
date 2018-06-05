

package org.apache.commons.math.linear;


public abstract class RealLinearOperator {
	public abstract int getRowDimension();

	public abstract int getColumnDimension();

	public abstract org.apache.commons.math.linear.RealVector operate(final org.apache.commons.math.linear.RealVector x);

	public org.apache.commons.math.linear.RealVector operateTranspose(final org.apache.commons.math.linear.RealVector x) throws java.lang.UnsupportedOperationException, org.apache.commons.math.exception.DimensionMismatchException {
		throw new java.lang.UnsupportedOperationException();
	}

	public boolean isTransposable() {
		return false;
	}
}

