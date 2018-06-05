

package org.apache.commons.math3.linear;


public class Array2DRowRealMatrix extends org.apache.commons.math3.linear.AbstractRealMatrix implements java.io.Serializable {
	private static final long serialVersionUID = -1067294169172445528L;

	private double[][] data;

	public Array2DRowRealMatrix() {
	}

	public Array2DRowRealMatrix(final int rowDimension, final int columnDimension) {
		super(rowDimension, columnDimension);
		data = new double[rowDimension][columnDimension];
	}

	public Array2DRowRealMatrix(final double[][] d) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.NoDataException, org.apache.commons.math3.exception.NullArgumentException {
		copyIn(d);
	}

	public Array2DRowRealMatrix(final double[][] d, final boolean copyArray) {
		if (copyArray) {
			copyIn(d);
		}else {
			if (d == null) {
				throw new org.apache.commons.math3.exception.NullArgumentException();
			}
			final int nRows = d.length;
			if (nRows == 0) {
				throw new org.apache.commons.math3.exception.NoDataException(org.apache.commons.math3.exception.util.LocalizedFormats.AT_LEAST_ONE_ROW);
			}
			final int nCols = d[0].length;
			if (nCols == 0) {
				throw new org.apache.commons.math3.exception.NoDataException(org.apache.commons.math3.exception.util.LocalizedFormats.AT_LEAST_ONE_COLUMN);
			}
			for (int r = 1; r < nRows; r++) {
				if ((d[r].length) != nCols) {
					throw new org.apache.commons.math3.exception.DimensionMismatchException(d[r].length, nCols);
				}
			}
			data = d;
		}
	}

	public Array2DRowRealMatrix(final double[] v) {
		final int nRows = v.length;
		data = new double[nRows][1];
		for (int row = 0; row < nRows; row++) {
			data[row][0] = v[row];
		}
	}

	@java.lang.Override
	public org.apache.commons.math3.linear.RealMatrix createMatrix(final int rowDimension, final int columnDimension) {
		return new org.apache.commons.math3.linear.Array2DRowRealMatrix(rowDimension, columnDimension);
	}

	@java.lang.Override
	public org.apache.commons.math3.linear.RealMatrix copy() {
		return new org.apache.commons.math3.linear.Array2DRowRealMatrix(copyOut(), false);
	}

	public org.apache.commons.math3.linear.Array2DRowRealMatrix add(final org.apache.commons.math3.linear.Array2DRowRealMatrix m) {
		org.apache.commons.math3.linear.MatrixUtils.checkAdditionCompatible(org.apache.commons.math3.linear.Array2DRowRealMatrix.this, m);
		final int rowCount = getRowDimension();
		final int columnCount = getColumnDimension();
		final double[][] outData = new double[rowCount][columnCount];
		for (int row = 0; row < rowCount; row++) {
			final double[] dataRow = data[row];
			final double[] mRow = m.data[row];
			final double[] outDataRow = outData[row];
			for (int col = 0; col < columnCount; col++) {
				outDataRow[col] = (dataRow[col]) + (mRow[col]);
			}
		}
		return new org.apache.commons.math3.linear.Array2DRowRealMatrix(outData, false);
	}

	public org.apache.commons.math3.linear.Array2DRowRealMatrix subtract(final org.apache.commons.math3.linear.Array2DRowRealMatrix m) {
		org.apache.commons.math3.linear.MatrixUtils.checkSubtractionCompatible(org.apache.commons.math3.linear.Array2DRowRealMatrix.this, m);
		final int rowCount = getRowDimension();
		final int columnCount = getColumnDimension();
		final double[][] outData = new double[rowCount][columnCount];
		for (int row = 0; row < rowCount; row++) {
			final double[] dataRow = data[row];
			final double[] mRow = m.data[row];
			final double[] outDataRow = outData[row];
			for (int col = 0; col < columnCount; col++) {
				outDataRow[col] = (dataRow[col]) - (mRow[col]);
			}
		}
		return new org.apache.commons.math3.linear.Array2DRowRealMatrix(outData, false);
	}

	public org.apache.commons.math3.linear.Array2DRowRealMatrix multiply(final org.apache.commons.math3.linear.Array2DRowRealMatrix m) {
		org.apache.commons.math3.linear.MatrixUtils.checkMultiplicationCompatible(org.apache.commons.math3.linear.Array2DRowRealMatrix.this, m);
		final int nRows = org.apache.commons.math3.linear.Array2DRowRealMatrix.this.getRowDimension();
		final int nCols = m.getColumnDimension();
		final int nSum = org.apache.commons.math3.linear.Array2DRowRealMatrix.this.getColumnDimension();
		final double[][] outData = new double[nRows][nCols];
		final double[] mCol = new double[nSum];
		final double[][] mData = m.data;
		for (int col = 0; col < nCols; col++) {
			for (int mRow = 0; mRow < nSum; mRow++) {
				mCol[mRow] = mData[mRow][col];
			}
			for (int row = 0; row < nRows; row++) {
				final double[] dataRow = data[row];
				double sum = 0;
				for (int i = 0; i < nSum; i++) {
					sum += (dataRow[i]) * (mCol[i]);
				}
				outData[row][col] = sum;
			}
		}
		return new org.apache.commons.math3.linear.Array2DRowRealMatrix(outData, false);
	}

	@java.lang.Override
	public double[][] getData() {
		return copyOut();
	}

	public double[][] getDataRef() {
		return data;
	}

	@java.lang.Override
	public void setSubMatrix(final double[][] subMatrix, final int row, final int column) {
		if ((data) == null) {
			if (row > 0) {
				throw new org.apache.commons.math3.exception.MathIllegalStateException(org.apache.commons.math3.exception.util.LocalizedFormats.FIRST_ROWS_NOT_INITIALIZED_YET, row);
			}
			if (column > 0) {
				throw new org.apache.commons.math3.exception.MathIllegalStateException(org.apache.commons.math3.exception.util.LocalizedFormats.FIRST_COLUMNS_NOT_INITIALIZED_YET, column);
			}
			org.apache.commons.math3.util.MathUtils.checkNotNull(subMatrix);
			final int nRows = subMatrix.length;
			if (nRows == 0) {
				throw new org.apache.commons.math3.exception.NoDataException(org.apache.commons.math3.exception.util.LocalizedFormats.AT_LEAST_ONE_ROW);
			}
			final int nCols = subMatrix[0].length;
			if (nCols == 0) {
				throw new org.apache.commons.math3.exception.NoDataException(org.apache.commons.math3.exception.util.LocalizedFormats.AT_LEAST_ONE_COLUMN);
			}
			data = new double[subMatrix.length][nCols];
			for (int i = 0; i < (data.length); ++i) {
				if ((subMatrix[i].length) != nCols) {
					throw new org.apache.commons.math3.exception.DimensionMismatchException(subMatrix[i].length, nCols);
				}
				java.lang.System.arraycopy(subMatrix[i], 0, data[(i + row)], column, nCols);
			}
		}else {
			super.setSubMatrix(subMatrix, row, column);
		}
	}

	@java.lang.Override
	public double getEntry(final int row, final int column) {
		org.apache.commons.math3.linear.MatrixUtils.checkMatrixIndex(org.apache.commons.math3.linear.Array2DRowRealMatrix.this, row, column);
		return data[row][column];
	}

	@java.lang.Override
	public void setEntry(final int row, final int column, final double value) {
		org.apache.commons.math3.linear.MatrixUtils.checkMatrixIndex(org.apache.commons.math3.linear.Array2DRowRealMatrix.this, row, column);
		data[row][column] = value;
	}

	@java.lang.Override
	public void addToEntry(final int row, final int column, final double increment) {
		org.apache.commons.math3.linear.MatrixUtils.checkMatrixIndex(org.apache.commons.math3.linear.Array2DRowRealMatrix.this, row, column);
		data[row][column] += increment;
	}

	@java.lang.Override
	public void multiplyEntry(final int row, final int column, final double factor) {
		org.apache.commons.math3.linear.MatrixUtils.checkMatrixIndex(org.apache.commons.math3.linear.Array2DRowRealMatrix.this, row, column);
		data[row][column] *= factor;
	}

	@java.lang.Override
	public int getRowDimension() {
		return (data) == null ? 0 : data.length;
	}

	@java.lang.Override
	public int getColumnDimension() {
		return ((data) == null) || ((data[0]) == null) ? 0 : data[0].length;
	}

	@java.lang.Override
	public double[] operate(final double[] v) {
		final int nRows = org.apache.commons.math3.linear.Array2DRowRealMatrix.this.getRowDimension();
		final int nCols = org.apache.commons.math3.linear.Array2DRowRealMatrix.this.getColumnDimension();
		if ((v.length) != nCols) {
			throw new org.apache.commons.math3.exception.DimensionMismatchException(v.length, nCols);
		}
		final double[] out = new double[nRows];
		for (int row = 0; row < nRows; row++) {
			final double[] dataRow = data[row];
			double sum = 0;
			for (int i = 0; i < nCols; i++) {
				sum += (dataRow[i]) * (v[i]);
			}
			out[row] = sum;
		}
		return out;
	}

	@java.lang.Override
	public double[] preMultiply(final double[] v) {
		final int nRows = getRowDimension();
		final int nCols = getColumnDimension();
		if ((v.length) != nRows) {
			throw new org.apache.commons.math3.exception.DimensionMismatchException(v.length, nRows);
		}
		final double[] out = new double[nCols];
		for (int col = 0; col < nCols; ++col) {
			double sum = 0;
			for (int i = 0; i < nRows; ++i) {
				sum += (data[i][col]) * (v[i]);
			}
			out[col] = sum;
		}
		return out;
	}

	@java.lang.Override
	public double walkInRowOrder(final org.apache.commons.math3.linear.RealMatrixChangingVisitor visitor) {
		final int rows = getRowDimension();
		final int columns = getColumnDimension();
		visitor.start(rows, columns, 0, (rows - 1), 0, (columns - 1));
		for (int i = 0; i < rows; ++i) {
			final double[] rowI = data[i];
			for (int j = 0; j < columns; ++j) {
				rowI[j] = visitor.visit(i, j, rowI[j]);
			}
		}
		return visitor.end();
	}

	@java.lang.Override
	public double walkInRowOrder(final org.apache.commons.math3.linear.RealMatrixPreservingVisitor visitor) {
		final int rows = getRowDimension();
		final int columns = getColumnDimension();
		visitor.start(rows, columns, 0, (rows - 1), 0, (columns - 1));
		for (int i = 0; i < rows; ++i) {
			final double[] rowI = data[i];
			for (int j = 0; j < columns; ++j) {
				visitor.visit(i, j, rowI[j]);
			}
		}
		return visitor.end();
	}

	@java.lang.Override
	public double walkInRowOrder(final org.apache.commons.math3.linear.RealMatrixChangingVisitor visitor, final int startRow, final int endRow, final int startColumn, final int endColumn) {
		org.apache.commons.math3.linear.MatrixUtils.checkSubMatrixIndex(org.apache.commons.math3.linear.Array2DRowRealMatrix.this, startRow, endRow, startColumn, endColumn);
		visitor.start(getRowDimension(), getColumnDimension(), startRow, endRow, startColumn, endColumn);
		for (int i = startRow; i <= endRow; ++i) {
			final double[] rowI = data[i];
			for (int j = startColumn; j <= endColumn; ++j) {
				rowI[j] = visitor.visit(i, j, rowI[j]);
			}
		}
		return visitor.end();
	}

	@java.lang.Override
	public double walkInRowOrder(final org.apache.commons.math3.linear.RealMatrixPreservingVisitor visitor, final int startRow, final int endRow, final int startColumn, final int endColumn) {
		org.apache.commons.math3.linear.MatrixUtils.checkSubMatrixIndex(org.apache.commons.math3.linear.Array2DRowRealMatrix.this, startRow, endRow, startColumn, endColumn);
		visitor.start(getRowDimension(), getColumnDimension(), startRow, endRow, startColumn, endColumn);
		for (int i = startRow; i <= endRow; ++i) {
			final double[] rowI = data[i];
			for (int j = startColumn; j <= endColumn; ++j) {
				visitor.visit(i, j, rowI[j]);
			}
		}
		return visitor.end();
	}

	@java.lang.Override
	public double walkInColumnOrder(final org.apache.commons.math3.linear.RealMatrixChangingVisitor visitor) {
		final int rows = getRowDimension();
		final int columns = getColumnDimension();
		visitor.start(rows, columns, 0, (rows - 1), 0, (columns - 1));
		for (int j = 0; j < columns; ++j) {
			for (int i = 0; i < rows; ++i) {
				final double[] rowI = data[i];
				rowI[j] = visitor.visit(i, j, rowI[j]);
			}
		}
		return visitor.end();
	}

	@java.lang.Override
	public double walkInColumnOrder(final org.apache.commons.math3.linear.RealMatrixPreservingVisitor visitor) {
		final int rows = getRowDimension();
		final int columns = getColumnDimension();
		visitor.start(rows, columns, 0, (rows - 1), 0, (columns - 1));
		for (int j = 0; j < columns; ++j) {
			for (int i = 0; i < rows; ++i) {
				visitor.visit(i, j, data[i][j]);
			}
		}
		return visitor.end();
	}

	@java.lang.Override
	public double walkInColumnOrder(final org.apache.commons.math3.linear.RealMatrixChangingVisitor visitor, final int startRow, final int endRow, final int startColumn, final int endColumn) {
		org.apache.commons.math3.linear.MatrixUtils.checkSubMatrixIndex(org.apache.commons.math3.linear.Array2DRowRealMatrix.this, startRow, endRow, startColumn, endColumn);
		visitor.start(getRowDimension(), getColumnDimension(), startRow, endRow, startColumn, endColumn);
		for (int j = startColumn; j <= endColumn; ++j) {
			for (int i = startRow; i <= endRow; ++i) {
				final double[] rowI = data[i];
				rowI[j] = visitor.visit(i, j, rowI[j]);
			}
		}
		return visitor.end();
	}

	@java.lang.Override
	public double walkInColumnOrder(final org.apache.commons.math3.linear.RealMatrixPreservingVisitor visitor, final int startRow, final int endRow, final int startColumn, final int endColumn) {
		org.apache.commons.math3.linear.MatrixUtils.checkSubMatrixIndex(org.apache.commons.math3.linear.Array2DRowRealMatrix.this, startRow, endRow, startColumn, endColumn);
		visitor.start(getRowDimension(), getColumnDimension(), startRow, endRow, startColumn, endColumn);
		for (int j = startColumn; j <= endColumn; ++j) {
			for (int i = startRow; i <= endRow; ++i) {
				visitor.visit(i, j, data[i][j]);
			}
		}
		return visitor.end();
	}

	private double[][] copyOut() {
		final int nRows = org.apache.commons.math3.linear.Array2DRowRealMatrix.this.getRowDimension();
		final double[][] out = new double[nRows][org.apache.commons.math3.linear.Array2DRowRealMatrix.this.getColumnDimension()];
		for (int i = 0; i < nRows; i++) {
			java.lang.System.arraycopy(data[i], 0, out[i], 0, data[i].length);
		}
		return out;
	}

	private void copyIn(final double[][] in) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.NoDataException, org.apache.commons.math3.exception.NullArgumentException {
		setSubMatrix(in, 0, 0);
	}
}

