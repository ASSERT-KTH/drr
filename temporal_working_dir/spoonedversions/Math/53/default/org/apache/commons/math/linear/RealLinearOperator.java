

package org.apache.commons.math.linear;


public abstract class RealLinearOperator {
	private final int rowDimension;

	private final int columnDimension;

	public RealLinearOperator(final int rowDimension, final int columnDimension) {
		this.columnDimension = columnDimension;
		this.rowDimension = rowDimension;
	}

	public final int getRowDimension() {
		return rowDimension;
	}

	public final int getColumnDimension() {
		return columnDimension;
	}

	public double[] operate(final double[] x) {
		if ((x.length) != (getColumnDimension())) {
			throw new org.apache.commons.math.exception.DimensionMismatchException(x.length, getColumnDimension());
		}
		final org.apache.commons.math.linear.RealVector y = operate(new org.apache.commons.math.linear.ArrayRealVector(x, false));
		if (y instanceof org.apache.commons.math.linear.ArrayRealVector) {
			return ((org.apache.commons.math.linear.ArrayRealVector) (y)).getDataRef();
		}else {
			return y.getData();
		}
	}

	public abstract org.apache.commons.math.linear.RealVector operate(final org.apache.commons.math.linear.RealVector x);
}

