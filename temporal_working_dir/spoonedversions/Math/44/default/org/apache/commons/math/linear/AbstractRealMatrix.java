

package org.apache.commons.math.linear;


public abstract class AbstractRealMatrix extends org.apache.commons.math.linear.RealLinearOperator implements org.apache.commons.math.linear.RealMatrix {
	protected AbstractRealMatrix() {
	}

	protected AbstractRealMatrix(final int rowDimension, final int columnDimension) {
		if (rowDimension < 1) {
			throw new org.apache.commons.math.exception.NotStrictlyPositiveException(rowDimension);
		}
		if (columnDimension < 1) {
			throw new org.apache.commons.math.exception.NotStrictlyPositiveException(columnDimension);
		}
	}

	public abstract org.apache.commons.math.linear.RealMatrix createMatrix(final int rowDimension, final int columnDimension);

	public abstract org.apache.commons.math.linear.RealMatrix copy();

	public org.apache.commons.math.linear.RealMatrix add(org.apache.commons.math.linear.RealMatrix m) {
		org.apache.commons.math.linear.MatrixUtils.checkAdditionCompatible(org.apache.commons.math.linear.AbstractRealMatrix.this, m);
		final int rowCount = getRowDimension();
		final int columnCount = getColumnDimension();
		final org.apache.commons.math.linear.RealMatrix out = createMatrix(rowCount, columnCount);
		for (int row = 0; row < rowCount; ++row) {
			for (int col = 0; col < columnCount; ++col) {
				out.setEntry(row, col, ((getEntry(row, col)) + (m.getEntry(row, col))));
			}
		}
		return out;
	}

	public org.apache.commons.math.linear.RealMatrix subtract(final org.apache.commons.math.linear.RealMatrix m) {
		org.apache.commons.math.linear.MatrixUtils.checkSubtractionCompatible(org.apache.commons.math.linear.AbstractRealMatrix.this, m);
		final int rowCount = getRowDimension();
		final int columnCount = getColumnDimension();
		final org.apache.commons.math.linear.RealMatrix out = createMatrix(rowCount, columnCount);
		for (int row = 0; row < rowCount; ++row) {
			for (int col = 0; col < columnCount; ++col) {
				out.setEntry(row, col, ((getEntry(row, col)) - (m.getEntry(row, col))));
			}
		}
		return out;
	}

	public org.apache.commons.math.linear.RealMatrix scalarAdd(final double d) {
		final int rowCount = getRowDimension();
		final int columnCount = getColumnDimension();
		final org.apache.commons.math.linear.RealMatrix out = createMatrix(rowCount, columnCount);
		for (int row = 0; row < rowCount; ++row) {
			for (int col = 0; col < columnCount; ++col) {
				out.setEntry(row, col, ((getEntry(row, col)) + d));
			}
		}
		return out;
	}

	public org.apache.commons.math.linear.RealMatrix scalarMultiply(final double d) {
		final int rowCount = getRowDimension();
		final int columnCount = getColumnDimension();
		final org.apache.commons.math.linear.RealMatrix out = createMatrix(rowCount, columnCount);
		for (int row = 0; row < rowCount; ++row) {
			for (int col = 0; col < columnCount; ++col) {
				out.setEntry(row, col, ((getEntry(row, col)) * d));
			}
		}
		return out;
	}

	public org.apache.commons.math.linear.RealMatrix multiply(final org.apache.commons.math.linear.RealMatrix m) {
		org.apache.commons.math.linear.MatrixUtils.checkMultiplicationCompatible(org.apache.commons.math.linear.AbstractRealMatrix.this, m);
		final int nRows = getRowDimension();
		final int nCols = m.getColumnDimension();
		final int nSum = getColumnDimension();
		final org.apache.commons.math.linear.RealMatrix out = createMatrix(nRows, nCols);
		for (int row = 0; row < nRows; ++row) {
			for (int col = 0; col < nCols; ++col) {
				double sum = 0;
				for (int i = 0; i < nSum; ++i) {
					sum += (getEntry(row, i)) * (m.getEntry(i, col));
				}
				out.setEntry(row, col, sum);
			}
		}
		return out;
	}

	public org.apache.commons.math.linear.RealMatrix preMultiply(final org.apache.commons.math.linear.RealMatrix m) {
		return m.multiply(org.apache.commons.math.linear.AbstractRealMatrix.this);
	}

	public org.apache.commons.math.linear.RealMatrix power(final int p) {
		if (p < 0) {
			throw new java.lang.IllegalArgumentException("p must be >= 0");
		}
		if (!(isSquare())) {
			throw new org.apache.commons.math.linear.NonSquareMatrixException(getRowDimension(), getColumnDimension());
		}
		if (p == 0) {
			return org.apache.commons.math.linear.MatrixUtils.createRealIdentityMatrix(org.apache.commons.math.linear.AbstractRealMatrix.this.getRowDimension());
		}
		if (p == 1) {
			return org.apache.commons.math.linear.AbstractRealMatrix.this.copy();
		}
		final int power = p - 1;
		final char[] binaryRepresentation = java.lang.Integer.toBinaryString(power).toCharArray();
		final java.util.ArrayList<java.lang.Integer> nonZeroPositions = new java.util.ArrayList<java.lang.Integer>();
		int maxI = -1;
		for (int i = 0; i < (binaryRepresentation.length); ++i) {
			if ((binaryRepresentation[i]) == '1') {
				final int pos = ((binaryRepresentation.length) - i) - 1;
				nonZeroPositions.add(pos);
				if (maxI == (-1)) {
					maxI = pos;
				}
			}
		}
		org.apache.commons.math.linear.RealMatrix[] results = new org.apache.commons.math.linear.RealMatrix[maxI + 1];
		results[0] = org.apache.commons.math.linear.AbstractRealMatrix.this.copy();
		for (int i = 1; i <= maxI; ++i) {
			results[i] = results[(i - 1)].multiply(results[(i - 1)]);
		}
		org.apache.commons.math.linear.RealMatrix result = org.apache.commons.math.linear.AbstractRealMatrix.this.copy();
		for (java.lang.Integer i : nonZeroPositions) {
			result = result.multiply(results[i]);
		}
		return result;
	}

	public double[][] getData() {
		final double[][] data = new double[getRowDimension()][getColumnDimension()];
		for (int i = 0; i < (data.length); ++i) {
			final double[] dataI = data[i];
			for (int j = 0; j < (dataI.length); ++j) {
				dataI[j] = getEntry(i, j);
			}
		}
		return data;
	}

	public double getNorm() {
		return walkInColumnOrder(new org.apache.commons.math.linear.RealMatrixPreservingVisitor() {
			private double endRow;

			private double columnSum;

			private double maxColSum;

			public void start(final int rows, final int columns, final int startRow, final int endRow, final int startColumn, final int endColumn) {
				this.endRow = endRow;
				columnSum = 0;
				maxColSum = 0;
			}

			public void visit(final int row, final int column, final double value) {
				columnSum += org.apache.commons.math.util.FastMath.abs(value);
				if (row == (endRow)) {
					maxColSum = org.apache.commons.math.util.FastMath.max(maxColSum, columnSum);
					columnSum = 0;
				}
			}

			public double end() {
				return maxColSum;
			}
		});
	}

	public double getFrobeniusNorm() {
		return walkInOptimizedOrder(new org.apache.commons.math.linear.RealMatrixPreservingVisitor() {
			private double sum;

			public void start(final int rows, final int columns, final int startRow, final int endRow, final int startColumn, final int endColumn) {
				sum = 0;
			}

			public void visit(final int row, final int column, final double value) {
				sum += value * value;
			}

			public double end() {
				return org.apache.commons.math.util.FastMath.sqrt(sum);
			}
		});
	}

	public org.apache.commons.math.linear.RealMatrix getSubMatrix(final int startRow, final int endRow, final int startColumn, final int endColumn) {
		org.apache.commons.math.linear.MatrixUtils.checkSubMatrixIndex(org.apache.commons.math.linear.AbstractRealMatrix.this, startRow, endRow, startColumn, endColumn);
		final org.apache.commons.math.linear.RealMatrix subMatrix = createMatrix(((endRow - startRow) + 1), ((endColumn - startColumn) + 1));
		for (int i = startRow; i <= endRow; ++i) {
			for (int j = startColumn; j <= endColumn; ++j) {
				subMatrix.setEntry((i - startRow), (j - startColumn), getEntry(i, j));
			}
		}
		return subMatrix;
	}

	public org.apache.commons.math.linear.RealMatrix getSubMatrix(final int[] selectedRows, final int[] selectedColumns) {
		org.apache.commons.math.linear.MatrixUtils.checkSubMatrixIndex(org.apache.commons.math.linear.AbstractRealMatrix.this, selectedRows, selectedColumns);
		final org.apache.commons.math.linear.RealMatrix subMatrix = createMatrix(selectedRows.length, selectedColumns.length);
		subMatrix.walkInOptimizedOrder(new org.apache.commons.math.linear.DefaultRealMatrixChangingVisitor() {
			@java.lang.Override
			public double visit(final int row, final int column, final double value) {
				return getEntry(selectedRows[row], selectedColumns[column]);
			}
		});
		return subMatrix;
	}

	public void copySubMatrix(final int startRow, final int endRow, final int startColumn, final int endColumn, final double[][] destination) {
		org.apache.commons.math.linear.MatrixUtils.checkSubMatrixIndex(org.apache.commons.math.linear.AbstractRealMatrix.this, startRow, endRow, startColumn, endColumn);
		final int rowsCount = (endRow + 1) - startRow;
		final int columnsCount = (endColumn + 1) - startColumn;
		if (((destination.length) < rowsCount) || ((destination[0].length) < columnsCount)) {
			throw new org.apache.commons.math.linear.MatrixDimensionMismatchException(destination.length, destination[0].length, rowsCount, columnsCount);
		}
		walkInOptimizedOrder(new org.apache.commons.math.linear.DefaultRealMatrixPreservingVisitor() {
			private int startRow;

			private int startColumn;

			@java.lang.Override
			public void start(final int rows, final int columns, final int startRow, final int endRow, final int startColumn, final int endColumn) {
				this.startRow = startRow;
				this.startColumn = startColumn;
			}

			@java.lang.Override
			public void visit(final int row, final int column, final double value) {
				destination[(row - (startRow))][(column - (startColumn))] = value;
			}
		}, startRow, endRow, startColumn, endColumn);
	}

	public void copySubMatrix(int[] selectedRows, int[] selectedColumns, double[][] destination) {
		org.apache.commons.math.linear.MatrixUtils.checkSubMatrixIndex(org.apache.commons.math.linear.AbstractRealMatrix.this, selectedRows, selectedColumns);
		if (((destination.length) < (selectedRows.length)) || ((destination[0].length) < (selectedColumns.length))) {
			throw new org.apache.commons.math.linear.MatrixDimensionMismatchException(destination.length, destination[0].length, selectedRows.length, selectedColumns.length);
		}
		for (int i = 0; i < (selectedRows.length); i++) {
			final double[] destinationI = destination[i];
			for (int j = 0; j < (selectedColumns.length); j++) {
				destinationI[j] = getEntry(selectedRows[i], selectedColumns[j]);
			}
		}
	}

	public void setSubMatrix(final double[][] subMatrix, final int row, final int column) throws org.apache.commons.math.exception.DimensionMismatchException, org.apache.commons.math.exception.NoDataException, org.apache.commons.math.exception.NullArgumentException {
		org.apache.commons.math.util.MathUtils.checkNotNull(subMatrix);
		final int nRows = subMatrix.length;
		if (nRows == 0) {
			throw new org.apache.commons.math.exception.NoDataException(org.apache.commons.math.exception.util.LocalizedFormats.AT_LEAST_ONE_ROW);
		}
		final int nCols = subMatrix[0].length;
		if (nCols == 0) {
			throw new org.apache.commons.math.exception.NoDataException(org.apache.commons.math.exception.util.LocalizedFormats.AT_LEAST_ONE_COLUMN);
		}
		for (int r = 1; r < nRows; ++r) {
			if ((subMatrix[r].length) != nCols) {
				throw new org.apache.commons.math.exception.DimensionMismatchException(nCols, subMatrix[r].length);
			}
		}
		org.apache.commons.math.linear.MatrixUtils.checkRowIndex(org.apache.commons.math.linear.AbstractRealMatrix.this, row);
		org.apache.commons.math.linear.MatrixUtils.checkColumnIndex(org.apache.commons.math.linear.AbstractRealMatrix.this, column);
		org.apache.commons.math.linear.MatrixUtils.checkRowIndex(org.apache.commons.math.linear.AbstractRealMatrix.this, ((nRows + row) - 1));
		org.apache.commons.math.linear.MatrixUtils.checkColumnIndex(org.apache.commons.math.linear.AbstractRealMatrix.this, ((nCols + column) - 1));
		for (int i = 0; i < nRows; ++i) {
			for (int j = 0; j < nCols; ++j) {
				setEntry((row + i), (column + j), subMatrix[i][j]);
			}
		}
	}

	public org.apache.commons.math.linear.RealMatrix getRowMatrix(final int row) {
		org.apache.commons.math.linear.MatrixUtils.checkRowIndex(org.apache.commons.math.linear.AbstractRealMatrix.this, row);
		final int nCols = getColumnDimension();
		final org.apache.commons.math.linear.RealMatrix out = createMatrix(1, nCols);
		for (int i = 0; i < nCols; ++i) {
			out.setEntry(0, i, getEntry(row, i));
		}
		return out;
	}

	public void setRowMatrix(final int row, final org.apache.commons.math.linear.RealMatrix matrix) {
		org.apache.commons.math.linear.MatrixUtils.checkRowIndex(org.apache.commons.math.linear.AbstractRealMatrix.this, row);
		final int nCols = getColumnDimension();
		if (((matrix.getRowDimension()) != 1) || ((matrix.getColumnDimension()) != nCols)) {
			throw new org.apache.commons.math.linear.MatrixDimensionMismatchException(matrix.getRowDimension(), matrix.getColumnDimension(), 1, nCols);
		}
		for (int i = 0; i < nCols; ++i) {
			setEntry(row, i, matrix.getEntry(0, i));
		}
	}

	public org.apache.commons.math.linear.RealMatrix getColumnMatrix(final int column) {
		org.apache.commons.math.linear.MatrixUtils.checkColumnIndex(org.apache.commons.math.linear.AbstractRealMatrix.this, column);
		final int nRows = getRowDimension();
		final org.apache.commons.math.linear.RealMatrix out = createMatrix(nRows, 1);
		for (int i = 0; i < nRows; ++i) {
			out.setEntry(i, 0, getEntry(i, column));
		}
		return out;
	}

	public void setColumnMatrix(final int column, final org.apache.commons.math.linear.RealMatrix matrix) {
		org.apache.commons.math.linear.MatrixUtils.checkColumnIndex(org.apache.commons.math.linear.AbstractRealMatrix.this, column);
		final int nRows = getRowDimension();
		if (((matrix.getRowDimension()) != nRows) || ((matrix.getColumnDimension()) != 1)) {
			throw new org.apache.commons.math.linear.MatrixDimensionMismatchException(matrix.getRowDimension(), matrix.getColumnDimension(), nRows, 1);
		}
		for (int i = 0; i < nRows; ++i) {
			setEntry(i, column, matrix.getEntry(i, 0));
		}
	}

	public org.apache.commons.math.linear.RealVector getRowVector(final int row) {
		return new org.apache.commons.math.linear.ArrayRealVector(getRow(row), false);
	}

	public void setRowVector(final int row, final org.apache.commons.math.linear.RealVector vector) {
		org.apache.commons.math.linear.MatrixUtils.checkRowIndex(org.apache.commons.math.linear.AbstractRealMatrix.this, row);
		final int nCols = getColumnDimension();
		if ((vector.getDimension()) != nCols) {
			throw new org.apache.commons.math.linear.MatrixDimensionMismatchException(1, vector.getDimension(), 1, nCols);
		}
		for (int i = 0; i < nCols; ++i) {
			setEntry(row, i, vector.getEntry(i));
		}
	}

	public org.apache.commons.math.linear.RealVector getColumnVector(final int column) {
		return new org.apache.commons.math.linear.ArrayRealVector(getColumn(column), false);
	}

	public void setColumnVector(final int column, final org.apache.commons.math.linear.RealVector vector) {
		org.apache.commons.math.linear.MatrixUtils.checkColumnIndex(org.apache.commons.math.linear.AbstractRealMatrix.this, column);
		final int nRows = getRowDimension();
		if ((vector.getDimension()) != nRows) {
			throw new org.apache.commons.math.linear.MatrixDimensionMismatchException(vector.getDimension(), 1, nRows, 1);
		}
		for (int i = 0; i < nRows; ++i) {
			setEntry(i, column, vector.getEntry(i));
		}
	}

	public double[] getRow(final int row) {
		org.apache.commons.math.linear.MatrixUtils.checkRowIndex(org.apache.commons.math.linear.AbstractRealMatrix.this, row);
		final int nCols = getColumnDimension();
		final double[] out = new double[nCols];
		for (int i = 0; i < nCols; ++i) {
			out[i] = getEntry(row, i);
		}
		return out;
	}

	public void setRow(final int row, final double[] array) {
		org.apache.commons.math.linear.MatrixUtils.checkRowIndex(org.apache.commons.math.linear.AbstractRealMatrix.this, row);
		final int nCols = getColumnDimension();
		if ((array.length) != nCols) {
			throw new org.apache.commons.math.linear.MatrixDimensionMismatchException(1, array.length, 1, nCols);
		}
		for (int i = 0; i < nCols; ++i) {
			setEntry(row, i, array[i]);
		}
	}

	public double[] getColumn(final int column) {
		org.apache.commons.math.linear.MatrixUtils.checkColumnIndex(org.apache.commons.math.linear.AbstractRealMatrix.this, column);
		final int nRows = getRowDimension();
		final double[] out = new double[nRows];
		for (int i = 0; i < nRows; ++i) {
			out[i] = getEntry(i, column);
		}
		return out;
	}

	public void setColumn(final int column, final double[] array) {
		org.apache.commons.math.linear.MatrixUtils.checkColumnIndex(org.apache.commons.math.linear.AbstractRealMatrix.this, column);
		final int nRows = getRowDimension();
		if ((array.length) != nRows) {
			throw new org.apache.commons.math.linear.MatrixDimensionMismatchException(array.length, 1, nRows, 1);
		}
		for (int i = 0; i < nRows; ++i) {
			setEntry(i, column, array[i]);
		}
	}

	public abstract double getEntry(int row, int column);

	public abstract void setEntry(int row, int column, double value);

	public void addToEntry(int row, int column, double increment) {
		org.apache.commons.math.linear.MatrixUtils.checkMatrixIndex(org.apache.commons.math.linear.AbstractRealMatrix.this, row, column);
		setEntry(row, column, ((getEntry(row, column)) + increment));
	}

	public void multiplyEntry(int row, int column, double factor) {
		org.apache.commons.math.linear.MatrixUtils.checkMatrixIndex(org.apache.commons.math.linear.AbstractRealMatrix.this, row, column);
		setEntry(row, column, ((getEntry(row, column)) * factor));
	}

	public org.apache.commons.math.linear.RealMatrix transpose() {
		final int nRows = getRowDimension();
		final int nCols = getColumnDimension();
		final org.apache.commons.math.linear.RealMatrix out = createMatrix(nCols, nRows);
		walkInOptimizedOrder(new org.apache.commons.math.linear.DefaultRealMatrixPreservingVisitor() {
			@java.lang.Override
			public void visit(final int row, final int column, final double value) {
				out.setEntry(column, row, value);
			}
		});
		return out;
	}

	public boolean isSquare() {
		return (getColumnDimension()) == (getRowDimension());
	}

	@java.lang.Override
	public abstract int getRowDimension();

	@java.lang.Override
	public abstract int getColumnDimension();

	public double getTrace() {
		final int nRows = getRowDimension();
		final int nCols = getColumnDimension();
		if (nRows != nCols) {
			throw new org.apache.commons.math.linear.NonSquareMatrixException(nRows, nCols);
		}
		double trace = 0;
		for (int i = 0; i < nRows; ++i) {
			trace += getEntry(i, i);
		}
		return trace;
	}

	public double[] operate(final double[] v) {
		final int nRows = getRowDimension();
		final int nCols = getColumnDimension();
		if ((v.length) != nCols) {
			throw new org.apache.commons.math.exception.DimensionMismatchException(v.length, nCols);
		}
		final double[] out = new double[nRows];
		for (int row = 0; row < nRows; ++row) {
			double sum = 0;
			for (int i = 0; i < nCols; ++i) {
				sum += (getEntry(row, i)) * (v[i]);
			}
			out[row] = sum;
		}
		return out;
	}

	@java.lang.Override
	public org.apache.commons.math.linear.RealVector operate(final org.apache.commons.math.linear.RealVector v) {
		try {
			return new org.apache.commons.math.linear.ArrayRealVector(operate(((org.apache.commons.math.linear.ArrayRealVector) (v)).getDataRef()), false);
		} catch (java.lang.ClassCastException cce) {
			final int nRows = getRowDimension();
			final int nCols = getColumnDimension();
			if ((v.getDimension()) != nCols) {
				throw new org.apache.commons.math.exception.DimensionMismatchException(v.getDimension(), nCols);
			}
			final double[] out = new double[nRows];
			for (int row = 0; row < nRows; ++row) {
				double sum = 0;
				for (int i = 0; i < nCols; ++i) {
					sum += (getEntry(row, i)) * (v.getEntry(i));
				}
				out[row] = sum;
			}
			return new org.apache.commons.math.linear.ArrayRealVector(out, false);
		}
	}

	public double[] preMultiply(final double[] v) {
		final int nRows = getRowDimension();
		final int nCols = getColumnDimension();
		if ((v.length) != nRows) {
			throw new org.apache.commons.math.exception.DimensionMismatchException(v.length, nRows);
		}
		final double[] out = new double[nCols];
		for (int col = 0; col < nCols; ++col) {
			double sum = 0;
			for (int i = 0; i < nRows; ++i) {
				sum += (getEntry(i, col)) * (v[i]);
			}
			out[col] = sum;
		}
		return out;
	}

	public org.apache.commons.math.linear.RealVector preMultiply(final org.apache.commons.math.linear.RealVector v) {
		try {
			return new org.apache.commons.math.linear.ArrayRealVector(preMultiply(((org.apache.commons.math.linear.ArrayRealVector) (v)).getDataRef()), false);
		} catch (java.lang.ClassCastException cce) {
			final int nRows = getRowDimension();
			final int nCols = getColumnDimension();
			if ((v.getDimension()) != nRows) {
				throw new org.apache.commons.math.exception.DimensionMismatchException(v.getDimension(), nRows);
			}
			final double[] out = new double[nCols];
			for (int col = 0; col < nCols; ++col) {
				double sum = 0;
				for (int i = 0; i < nRows; ++i) {
					sum += (getEntry(i, col)) * (v.getEntry(i));
				}
				out[col] = sum;
			}
			return new org.apache.commons.math.linear.ArrayRealVector(out, false);
		}
	}

	public double walkInRowOrder(final org.apache.commons.math.linear.RealMatrixChangingVisitor visitor) {
		final int rows = getRowDimension();
		final int columns = getColumnDimension();
		visitor.start(rows, columns, 0, (rows - 1), 0, (columns - 1));
		for (int row = 0; row < rows; ++row) {
			for (int column = 0; column < columns; ++column) {
				final double oldValue = getEntry(row, column);
				final double newValue = visitor.visit(row, column, oldValue);
				setEntry(row, column, newValue);
			}
		}
		return visitor.end();
	}

	public double walkInRowOrder(final org.apache.commons.math.linear.RealMatrixPreservingVisitor visitor) {
		final int rows = getRowDimension();
		final int columns = getColumnDimension();
		visitor.start(rows, columns, 0, (rows - 1), 0, (columns - 1));
		for (int row = 0; row < rows; ++row) {
			for (int column = 0; column < columns; ++column) {
				visitor.visit(row, column, getEntry(row, column));
			}
		}
		return visitor.end();
	}

	public double walkInRowOrder(final org.apache.commons.math.linear.RealMatrixChangingVisitor visitor, final int startRow, final int endRow, final int startColumn, final int endColumn) {
		org.apache.commons.math.linear.MatrixUtils.checkSubMatrixIndex(org.apache.commons.math.linear.AbstractRealMatrix.this, startRow, endRow, startColumn, endColumn);
		visitor.start(getRowDimension(), getColumnDimension(), startRow, endRow, startColumn, endColumn);
		for (int row = startRow; row <= endRow; ++row) {
			for (int column = startColumn; column <= endColumn; ++column) {
				final double oldValue = getEntry(row, column);
				final double newValue = visitor.visit(row, column, oldValue);
				setEntry(row, column, newValue);
			}
		}
		return visitor.end();
	}

	public double walkInRowOrder(final org.apache.commons.math.linear.RealMatrixPreservingVisitor visitor, final int startRow, final int endRow, final int startColumn, final int endColumn) {
		org.apache.commons.math.linear.MatrixUtils.checkSubMatrixIndex(org.apache.commons.math.linear.AbstractRealMatrix.this, startRow, endRow, startColumn, endColumn);
		visitor.start(getRowDimension(), getColumnDimension(), startRow, endRow, startColumn, endColumn);
		for (int row = startRow; row <= endRow; ++row) {
			for (int column = startColumn; column <= endColumn; ++column) {
				visitor.visit(row, column, getEntry(row, column));
			}
		}
		return visitor.end();
	}

	public double walkInColumnOrder(final org.apache.commons.math.linear.RealMatrixChangingVisitor visitor) {
		final int rows = getRowDimension();
		final int columns = getColumnDimension();
		visitor.start(rows, columns, 0, (rows - 1), 0, (columns - 1));
		for (int column = 0; column < columns; ++column) {
			for (int row = 0; row < rows; ++row) {
				final double oldValue = getEntry(row, column);
				final double newValue = visitor.visit(row, column, oldValue);
				setEntry(row, column, newValue);
			}
		}
		return visitor.end();
	}

	public double walkInColumnOrder(final org.apache.commons.math.linear.RealMatrixPreservingVisitor visitor) {
		final int rows = getRowDimension();
		final int columns = getColumnDimension();
		visitor.start(rows, columns, 0, (rows - 1), 0, (columns - 1));
		for (int column = 0; column < columns; ++column) {
			for (int row = 0; row < rows; ++row) {
				visitor.visit(row, column, getEntry(row, column));
			}
		}
		return visitor.end();
	}

	public double walkInColumnOrder(final org.apache.commons.math.linear.RealMatrixChangingVisitor visitor, final int startRow, final int endRow, final int startColumn, final int endColumn) {
		org.apache.commons.math.linear.MatrixUtils.checkSubMatrixIndex(org.apache.commons.math.linear.AbstractRealMatrix.this, startRow, endRow, startColumn, endColumn);
		visitor.start(getRowDimension(), getColumnDimension(), startRow, endRow, startColumn, endColumn);
		for (int column = startColumn; column <= endColumn; ++column) {
			for (int row = startRow; row <= endRow; ++row) {
				final double oldValue = getEntry(row, column);
				final double newValue = visitor.visit(row, column, oldValue);
				setEntry(row, column, newValue);
			}
		}
		return visitor.end();
	}

	public double walkInColumnOrder(final org.apache.commons.math.linear.RealMatrixPreservingVisitor visitor, final int startRow, final int endRow, final int startColumn, final int endColumn) {
		org.apache.commons.math.linear.MatrixUtils.checkSubMatrixIndex(org.apache.commons.math.linear.AbstractRealMatrix.this, startRow, endRow, startColumn, endColumn);
		visitor.start(getRowDimension(), getColumnDimension(), startRow, endRow, startColumn, endColumn);
		for (int column = startColumn; column <= endColumn; ++column) {
			for (int row = startRow; row <= endRow; ++row) {
				visitor.visit(row, column, getEntry(row, column));
			}
		}
		return visitor.end();
	}

	public double walkInOptimizedOrder(final org.apache.commons.math.linear.RealMatrixChangingVisitor visitor) {
		return walkInRowOrder(visitor);
	}

	public double walkInOptimizedOrder(final org.apache.commons.math.linear.RealMatrixPreservingVisitor visitor) {
		return walkInRowOrder(visitor);
	}

	public double walkInOptimizedOrder(final org.apache.commons.math.linear.RealMatrixChangingVisitor visitor, final int startRow, final int endRow, final int startColumn, final int endColumn) {
		return walkInRowOrder(visitor, startRow, endRow, startColumn, endColumn);
	}

	public double walkInOptimizedOrder(final org.apache.commons.math.linear.RealMatrixPreservingVisitor visitor, final int startRow, final int endRow, final int startColumn, final int endColumn) {
		return walkInRowOrder(visitor, startRow, endRow, startColumn, endColumn);
	}

	@java.lang.Override
	public java.lang.String toString() {
		final int nRows = getRowDimension();
		final int nCols = getColumnDimension();
		final java.lang.StringBuffer res = new java.lang.StringBuffer();
		java.lang.String fullClassName = getClass().getName();
		java.lang.String shortClassName = fullClassName.substring(((fullClassName.lastIndexOf('.')) + 1));
		res.append(shortClassName).append("{");
		for (int i = 0; i < nRows; ++i) {
			if (i > 0) {
				res.append(",");
			}
			res.append("{");
			for (int j = 0; j < nCols; ++j) {
				if (j > 0) {
					res.append(",");
				}
				res.append(getEntry(i, j));
			}
			res.append("}");
		}
		res.append("}");
		return res.toString();
	}

	@java.lang.Override
	public boolean equals(final java.lang.Object object) {
		if (object == (org.apache.commons.math.linear.AbstractRealMatrix.this)) {
			return true;
		}
		if ((object instanceof org.apache.commons.math.linear.RealMatrix) == false) {
			return false;
		}
		org.apache.commons.math.linear.RealMatrix m = ((org.apache.commons.math.linear.RealMatrix) (object));
		final int nRows = getRowDimension();
		final int nCols = getColumnDimension();
		if (((m.getColumnDimension()) != nCols) || ((m.getRowDimension()) != nRows)) {
			return false;
		}
		for (int row = 0; row < nRows; ++row) {
			for (int col = 0; col < nCols; ++col) {
				if ((getEntry(row, col)) != (m.getEntry(row, col))) {
					return false;
				}
			}
		}
		return true;
	}

	@java.lang.Override
	public int hashCode() {
		int ret = 7;
		final int nRows = getRowDimension();
		final int nCols = getColumnDimension();
		ret = (ret * 31) + nRows;
		ret = (ret * 31) + nCols;
		for (int row = 0; row < nRows; ++row) {
			for (int col = 0; col < nCols; ++col) {
				ret = (ret * 31) + (((11 * (row + 1)) + (17 * (col + 1))) * (org.apache.commons.math.util.MathUtils.hash(getEntry(row, col))));
			}
		}
		return ret;
	}
}

