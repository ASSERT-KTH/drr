

package org.apache.commons.math3.linear;


public abstract class RealLinearOperator {
	public abstract int getRowDimension();

	public abstract int getColumnDimension();

	public abstract org.apache.commons.math3.linear.RealVector operate(final org.apache.commons.math3.linear.RealVector x) throws org.apache.commons.math3.exception.DimensionMismatchException;

	public org.apache.commons.math3.linear.RealVector operateTranspose(final org.apache.commons.math3.linear.RealVector x) throws java.lang.UnsupportedOperationException, org.apache.commons.math3.exception.DimensionMismatchException {
		throw new java.lang.UnsupportedOperationException();
	}

	public boolean isTransposable() {
		return false;
	}
}

