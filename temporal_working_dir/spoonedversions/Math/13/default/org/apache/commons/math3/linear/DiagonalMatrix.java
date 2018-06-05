

package org.apache.commons.math3.linear;


public class DiagonalMatrix extends org.apache.commons.math3.linear.AbstractRealMatrix implements java.io.Serializable {
	private static final long serialVersionUID = 20121229L;

	private double[] data;

	public DiagonalMatrix() {
	}

	public DiagonalMatrix(final int dimension) throws org.apache.commons.math3.exception.NotStrictlyPositiveException {
		super(dimension, dimension);
		data = new double[dimension];
	}

	public DiagonalMatrix(final double[] d) {
		data = d.clone();
	}

	public DiagonalMatrix(final double[] d, final boolean copyArray) {
		data = (copyArray) ? d.clone() : d;
	}

	@java.lang.Override
	public org.apache.commons.math3.linear.RealMatrix createMatrix(final int rowDimension, final int columnDimension) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.NotStrictlyPositiveException {
		if (rowDimension != columnDimension) {
			throw new org.apache.commons.math3.exception.DimensionMismatchException(rowDimension, columnDimension);
		}
		return new org.apache.commons.math3.linear.DiagonalMatrix(rowDimension);
	}

	@java.lang.Override
	public org.apache.commons.math3.linear.RealMatrix copy() {
		return new org.apache.commons.math3.linear.DiagonalMatrix(data);
	}

	public org.apache.commons.math3.linear.DiagonalMatrix add(final org.apache.commons.math3.linear.DiagonalMatrix m) throws org.apache.commons.math3.linear.MatrixDimensionMismatchException {
		org.apache.commons.math3.linear.MatrixUtils.checkAdditionCompatible(org.apache.commons.math3.linear.DiagonalMatrix.this, m);
		final int dim = getRowDimension();
		final double[] outData = new double[dim];
		for (int i = 0; i < dim; i++) {
			outData[i] = (data[i]) + (m.data[i]);
		}
		return new org.apache.commons.math3.linear.DiagonalMatrix(outData, false);
	}

	public org.apache.commons.math3.linear.DiagonalMatrix subtract(final org.apache.commons.math3.linear.DiagonalMatrix m) throws org.apache.commons.math3.linear.MatrixDimensionMismatchException {
		org.apache.commons.math3.linear.MatrixUtils.checkSubtractionCompatible(org.apache.commons.math3.linear.DiagonalMatrix.this, m);
		final int dim = getRowDimension();
		final double[] outData = new double[dim];
		for (int i = 0; i < dim; i++) {
			outData[i] = (data[i]) - (m.data[i]);
		}
		return new org.apache.commons.math3.linear.DiagonalMatrix(outData, false);
	}

	public org.apache.commons.math3.linear.DiagonalMatrix multiply(final org.apache.commons.math3.linear.DiagonalMatrix m) throws org.apache.commons.math3.exception.DimensionMismatchException {
		org.apache.commons.math3.linear.MatrixUtils.checkMultiplicationCompatible(org.apache.commons.math3.linear.DiagonalMatrix.this, m);
		final int dim = getRowDimension();
		final double[] outData = new double[dim];
		for (int i = 0; i < dim; i++) {
			outData[i] = (data[i]) * (m.data[i]);
		}
		return new org.apache.commons.math3.linear.DiagonalMatrix(outData, false);
	}

	public org.apache.commons.math3.linear.RealMatrix multiply(final org.apache.commons.math3.linear.RealMatrix m) throws org.apache.commons.math3.exception.DimensionMismatchException {
		if (m instanceof org.apache.commons.math3.linear.DiagonalMatrix) {
			return multiply(((org.apache.commons.math3.linear.DiagonalMatrix) (m)));
		}else {
			org.apache.commons.math3.linear.MatrixUtils.checkMultiplicationCompatible(org.apache.commons.math3.linear.DiagonalMatrix.this, m);
			final int nRows = m.getRowDimension();
			final int nCols = m.getColumnDimension();
			final double[][] product = new double[nRows][nCols];
			for (int r = 0; r < nRows; r++) {
				for (int c = 0; c < nCols; c++) {
					product[r][c] = (data[r]) * (m.getEntry(r, c));
				}
			}
			return new org.apache.commons.math3.linear.Array2DRowRealMatrix(product, false);
		}
	}

	@java.lang.Override
	public double[][] getData() {
		final int dim = getRowDimension();
		final double[][] out = new double[dim][dim];
		for (int i = 0; i < dim; i++) {
			out[i][i] = data[i];
		}
		return out;
	}

	public double[] getDataRef() {
		return data;
	}

	@java.lang.Override
	public void setSubMatrix(final double[][] subMatrix, final int row, final int column) throws org.apache.commons.math3.exception.MathUnsupportedOperationException {
		throw new org.apache.commons.math3.exception.MathUnsupportedOperationException();
	}

	@java.lang.Override
	public double getEntry(final int row, final int column) throws org.apache.commons.math3.exception.OutOfRangeException {
		org.apache.commons.math3.linear.MatrixUtils.checkMatrixIndex(org.apache.commons.math3.linear.DiagonalMatrix.this, row, column);
		return row == column ? data[row] : 0;
	}

	@java.lang.Override
	public void setEntry(final int row, final int column, final double value) throws org.apache.commons.math3.exception.MathUnsupportedOperationException, org.apache.commons.math3.exception.OutOfRangeException {
		if (row != column) {
			throw new org.apache.commons.math3.exception.MathUnsupportedOperationException();
		}
		org.apache.commons.math3.linear.MatrixUtils.checkMatrixIndex(org.apache.commons.math3.linear.DiagonalMatrix.this, row, column);
		data[row] = value;
	}

	@java.lang.Override
	public void addToEntry(final int row, final int column, final double increment) throws org.apache.commons.math3.exception.MathUnsupportedOperationException, org.apache.commons.math3.exception.OutOfRangeException {
		if (row != column) {
			throw new org.apache.commons.math3.exception.MathUnsupportedOperationException();
		}
		org.apache.commons.math3.linear.MatrixUtils.checkMatrixIndex(org.apache.commons.math3.linear.DiagonalMatrix.this, row, column);
		data[row] += increment;
	}

	@java.lang.Override
	public void multiplyEntry(final int row, final int column, final double factor) throws org.apache.commons.math3.exception.MathUnsupportedOperationException, org.apache.commons.math3.exception.OutOfRangeException {
		if (row != column) {
			throw new org.apache.commons.math3.exception.MathUnsupportedOperationException();
		}
		org.apache.commons.math3.linear.MatrixUtils.checkMatrixIndex(org.apache.commons.math3.linear.DiagonalMatrix.this, row, column);
		data[row] *= factor;
	}

	@java.lang.Override
	public int getRowDimension() {
		return (data) == null ? 0 : data.length;
	}

	@java.lang.Override
	public int getColumnDimension() {
		return getRowDimension();
	}

	@java.lang.Override
	public double[] operate(final double[] v) throws org.apache.commons.math3.exception.DimensionMismatchException {
		return multiply(new org.apache.commons.math3.linear.DiagonalMatrix(v, false)).getDataRef();
	}

	@java.lang.Override
	public double[] preMultiply(final double[] v) throws org.apache.commons.math3.exception.DimensionMismatchException {
		return operate(v);
	}

	@java.lang.Override
	public double walkInRowOrder(final org.apache.commons.math3.linear.RealMatrixChangingVisitor visitor) throws org.apache.commons.math3.exception.MathUnsupportedOperationException {
		throw new org.apache.commons.math3.exception.MathUnsupportedOperationException();
	}

	@java.lang.Override
	public double walkInRowOrder(final org.apache.commons.math3.linear.RealMatrixPreservingVisitor visitor) throws org.apache.commons.math3.exception.MathUnsupportedOperationException {
		throw new org.apache.commons.math3.exception.MathUnsupportedOperationException();
	}

	@java.lang.Override
	public double walkInRowOrder(final org.apache.commons.math3.linear.RealMatrixChangingVisitor visitor, final int startRow, final int endRow, final int startColumn, final int endColumn) throws org.apache.commons.math3.exception.MathUnsupportedOperationException {
		throw new org.apache.commons.math3.exception.MathUnsupportedOperationException();
	}

	@java.lang.Override
	public double walkInRowOrder(final org.apache.commons.math3.linear.RealMatrixPreservingVisitor visitor, final int startRow, final int endRow, final int startColumn, final int endColumn) throws org.apache.commons.math3.exception.MathUnsupportedOperationException {
		throw new org.apache.commons.math3.exception.MathUnsupportedOperationException();
	}

	@java.lang.Override
	public double walkInColumnOrder(final org.apache.commons.math3.linear.RealMatrixChangingVisitor visitor) throws org.apache.commons.math3.exception.MathUnsupportedOperationException {
		throw new org.apache.commons.math3.exception.MathUnsupportedOperationException();
	}

	@java.lang.Override
	public double walkInColumnOrder(final org.apache.commons.math3.linear.RealMatrixPreservingVisitor visitor) throws org.apache.commons.math3.exception.MathUnsupportedOperationException {
		throw new org.apache.commons.math3.exception.MathUnsupportedOperationException();
	}

	@java.lang.Override
	public double walkInColumnOrder(final org.apache.commons.math3.linear.RealMatrixChangingVisitor visitor, final int startRow, final int endRow, final int startColumn, final int endColumn) throws org.apache.commons.math3.exception.MathUnsupportedOperationException {
		throw new org.apache.commons.math3.exception.MathUnsupportedOperationException();
	}

	@java.lang.Override
	public double walkInColumnOrder(final org.apache.commons.math3.linear.RealMatrixPreservingVisitor visitor, final int startRow, final int endRow, final int startColumn, final int endColumn) throws org.apache.commons.math3.exception.MathUnsupportedOperationException {
		throw new org.apache.commons.math3.exception.MathUnsupportedOperationException();
	}
}

