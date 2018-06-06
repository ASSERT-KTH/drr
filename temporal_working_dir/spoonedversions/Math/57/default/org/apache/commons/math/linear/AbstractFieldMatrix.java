

package org.apache.commons.math.linear;


public abstract class AbstractFieldMatrix<T extends org.apache.commons.math.FieldElement<T>> implements org.apache.commons.math.linear.FieldMatrix<T> {
	private final org.apache.commons.math.Field<T> field;

	protected AbstractFieldMatrix() {
		field = null;
	}

	protected AbstractFieldMatrix(final org.apache.commons.math.Field<T> field) {
		this.field = field;
	}

	protected AbstractFieldMatrix(final org.apache.commons.math.Field<T> field, final int rowDimension, final int columnDimension) {
		if (rowDimension <= 0) {
			throw new org.apache.commons.math.exception.NotStrictlyPositiveException(org.apache.commons.math.exception.util.LocalizedFormats.DIMENSION, rowDimension);
		}
		if (columnDimension <= 0) {
			throw new org.apache.commons.math.exception.NotStrictlyPositiveException(org.apache.commons.math.exception.util.LocalizedFormats.DIMENSION, columnDimension);
		}
		this.field = field;
	}

	protected static <T extends org.apache.commons.math.FieldElement<T>> org.apache.commons.math.Field<T> extractField(final T[][] d) {
		if (d == null) {
			throw new org.apache.commons.math.exception.NullArgumentException();
		}
		if ((d.length) == 0) {
			throw new org.apache.commons.math.exception.NoDataException(org.apache.commons.math.exception.util.LocalizedFormats.AT_LEAST_ONE_ROW);
		}
		if ((d[0].length) == 0) {
			throw new org.apache.commons.math.exception.NoDataException(org.apache.commons.math.exception.util.LocalizedFormats.AT_LEAST_ONE_COLUMN);
		}
		return d[0][0].getField();
	}

	protected static <T extends org.apache.commons.math.FieldElement<T>> org.apache.commons.math.Field<T> extractField(final T[] d) {
		if ((d.length) == 0) {
			throw new org.apache.commons.math.exception.NoDataException(org.apache.commons.math.exception.util.LocalizedFormats.AT_LEAST_ONE_ROW);
		}
		return d[0].getField();
	}

	@java.lang.SuppressWarnings(value = "unchecked")
	protected static <T extends org.apache.commons.math.FieldElement<T>> T[][] buildArray(final org.apache.commons.math.Field<T> field, final int rows, final int columns) {
		if (columns < 0) {
			T[] dummyRow = ((T[]) (java.lang.reflect.Array.newInstance(field.getZero().getClass(), 0)));
			return ((T[][]) (java.lang.reflect.Array.newInstance(dummyRow.getClass(), rows)));
		}
		T[][] array = ((T[][]) (java.lang.reflect.Array.newInstance(field.getZero().getClass(), new int[]{ rows , columns })));
		for (int i = 0; i < (array.length); ++i) {
			java.util.Arrays.fill(array[i], field.getZero());
		}
		return array;
	}

	protected static <T extends org.apache.commons.math.FieldElement<T>> T[] buildArray(final org.apache.commons.math.Field<T> field, final int length) {
		@java.lang.SuppressWarnings(value = "unchecked")
		T[] array = ((T[]) (java.lang.reflect.Array.newInstance(field.getZero().getClass(), length)));
		java.util.Arrays.fill(array, field.getZero());
		return array;
	}

	public org.apache.commons.math.Field<T> getField() {
		return field;
	}

	public abstract org.apache.commons.math.linear.FieldMatrix<T> createMatrix(final int rowDimension, final int columnDimension);

	public abstract org.apache.commons.math.linear.FieldMatrix<T> copy();

	public org.apache.commons.math.linear.FieldMatrix<T> add(org.apache.commons.math.linear.FieldMatrix<T> m) {
		checkAdditionCompatible(m);
		final int rowCount = getRowDimension();
		final int columnCount = getColumnDimension();
		final org.apache.commons.math.linear.FieldMatrix<T> out = createMatrix(rowCount, columnCount);
		for (int row = 0; row < rowCount; ++row) {
			for (int col = 0; col < columnCount; ++col) {
				out.setEntry(row, col, getEntry(row, col).add(m.getEntry(row, col)));
			}
		}
		return out;
	}

	public org.apache.commons.math.linear.FieldMatrix<T> subtract(final org.apache.commons.math.linear.FieldMatrix<T> m) {
		checkSubtractionCompatible(m);
		final int rowCount = getRowDimension();
		final int columnCount = getColumnDimension();
		final org.apache.commons.math.linear.FieldMatrix<T> out = createMatrix(rowCount, columnCount);
		for (int row = 0; row < rowCount; ++row) {
			for (int col = 0; col < columnCount; ++col) {
				out.setEntry(row, col, getEntry(row, col).subtract(m.getEntry(row, col)));
			}
		}
		return out;
	}

	public org.apache.commons.math.linear.FieldMatrix<T> scalarAdd(final T d) {
		final int rowCount = getRowDimension();
		final int columnCount = getColumnDimension();
		final org.apache.commons.math.linear.FieldMatrix<T> out = createMatrix(rowCount, columnCount);
		for (int row = 0; row < rowCount; ++row) {
			for (int col = 0; col < columnCount; ++col) {
				out.setEntry(row, col, getEntry(row, col).add(d));
			}
		}
		return out;
	}

	public org.apache.commons.math.linear.FieldMatrix<T> scalarMultiply(final T d) {
		final int rowCount = getRowDimension();
		final int columnCount = getColumnDimension();
		final org.apache.commons.math.linear.FieldMatrix<T> out = createMatrix(rowCount, columnCount);
		for (int row = 0; row < rowCount; ++row) {
			for (int col = 0; col < columnCount; ++col) {
				out.setEntry(row, col, getEntry(row, col).multiply(d));
			}
		}
		return out;
	}

	public org.apache.commons.math.linear.FieldMatrix<T> multiply(final org.apache.commons.math.linear.FieldMatrix<T> m) {
		checkMultiplicationCompatible(m);
		final int nRows = getRowDimension();
		final int nCols = m.getColumnDimension();
		final int nSum = getColumnDimension();
		final org.apache.commons.math.linear.FieldMatrix<T> out = createMatrix(nRows, nCols);
		for (int row = 0; row < nRows; ++row) {
			for (int col = 0; col < nCols; ++col) {
				T sum = field.getZero();
				for (int i = 0; i < nSum; ++i) {
					sum = sum.add(getEntry(row, i).multiply(m.getEntry(i, col)));
				}
				out.setEntry(row, col, sum);
			}
		}
		return out;
	}

	public org.apache.commons.math.linear.FieldMatrix<T> preMultiply(final org.apache.commons.math.linear.FieldMatrix<T> m) {
		return m.multiply(org.apache.commons.math.linear.AbstractFieldMatrix.this);
	}

	public T[][] getData() {
		final T[][] data = org.apache.commons.math.linear.AbstractFieldMatrix.buildArray(field, getRowDimension(), getColumnDimension());
		for (int i = 0; i < (data.length); ++i) {
			final T[] dataI = data[i];
			for (int j = 0; j < (dataI.length); ++j) {
				dataI[j] = getEntry(i, j);
			}
		}
		return data;
	}

	public org.apache.commons.math.linear.FieldMatrix<T> getSubMatrix(final int startRow, final int endRow, final int startColumn, final int endColumn) {
		checkSubMatrixIndex(startRow, endRow, startColumn, endColumn);
		final org.apache.commons.math.linear.FieldMatrix<T> subMatrix = createMatrix(((endRow - startRow) + 1), ((endColumn - startColumn) + 1));
		for (int i = startRow; i <= endRow; ++i) {
			for (int j = startColumn; j <= endColumn; ++j) {
				subMatrix.setEntry((i - startRow), (j - startColumn), getEntry(i, j));
			}
		}
		return subMatrix;
	}

	public org.apache.commons.math.linear.FieldMatrix<T> getSubMatrix(final int[] selectedRows, final int[] selectedColumns) {
		checkSubMatrixIndex(selectedRows, selectedColumns);
		final org.apache.commons.math.linear.FieldMatrix<T> subMatrix = createMatrix(selectedRows.length, selectedColumns.length);
		subMatrix.walkInOptimizedOrder(new org.apache.commons.math.linear.DefaultFieldMatrixChangingVisitor<T>(field.getZero()) {
			@java.lang.Override
			public T visit(final int row, final int column, final T value) {
				return getEntry(selectedRows[row], selectedColumns[column]);
			}
		});
		return subMatrix;
	}

	public void copySubMatrix(final int startRow, final int endRow, final int startColumn, final int endColumn, final T[][] destination) {
		checkSubMatrixIndex(startRow, endRow, startColumn, endColumn);
		final int rowsCount = (endRow + 1) - startRow;
		final int columnsCount = (endColumn + 1) - startColumn;
		if (((destination.length) < rowsCount) || ((destination[0].length) < columnsCount)) {
			throw new org.apache.commons.math.linear.MatrixDimensionMismatchException(destination.length, destination[0].length, rowsCount, columnsCount);
		}
		walkInOptimizedOrder(new org.apache.commons.math.linear.DefaultFieldMatrixPreservingVisitor<T>(field.getZero()) {
			private int startRow;

			private int startColumn;

			@java.lang.Override
			public void start(final int rows, final int columns, final int startRow, final int endRow, final int startColumn, final int endColumn) {
				this.startRow = startRow;
				this.startColumn = startColumn;
			}

			@java.lang.Override
			public void visit(final int row, final int column, final T value) {
				destination[(row - (startRow))][(column - (startColumn))] = value;
			}
		}, startRow, endRow, startColumn, endColumn);
	}

	public void copySubMatrix(int[] selectedRows, int[] selectedColumns, T[][] destination) {
		checkSubMatrixIndex(selectedRows, selectedColumns);
		if (((destination.length) < (selectedRows.length)) || ((destination[0].length) < (selectedColumns.length))) {
			throw new org.apache.commons.math.linear.MatrixDimensionMismatchException(destination.length, destination[0].length, selectedRows.length, selectedColumns.length);
		}
		for (int i = 0; i < (selectedRows.length); i++) {
			final T[] destinationI = destination[i];
			for (int j = 0; j < (selectedColumns.length); j++) {
				destinationI[j] = getEntry(selectedRows[i], selectedColumns[j]);
			}
		}
	}

	public void setSubMatrix(final T[][] subMatrix, final int row, final int column) {
		if (subMatrix == null) {
			throw new org.apache.commons.math.exception.NullArgumentException();
		}
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
		checkRowIndex(row);
		checkColumnIndex(column);
		checkRowIndex(((nRows + row) - 1));
		checkColumnIndex(((nCols + column) - 1));
		for (int i = 0; i < nRows; ++i) {
			for (int j = 0; j < nCols; ++j) {
				setEntry((row + i), (column + j), subMatrix[i][j]);
			}
		}
	}

	public org.apache.commons.math.linear.FieldMatrix<T> getRowMatrix(final int row) {
		checkRowIndex(row);
		final int nCols = getColumnDimension();
		final org.apache.commons.math.linear.FieldMatrix<T> out = createMatrix(1, nCols);
		for (int i = 0; i < nCols; ++i) {
			out.setEntry(0, i, getEntry(row, i));
		}
		return out;
	}

	public void setRowMatrix(final int row, final org.apache.commons.math.linear.FieldMatrix<T> matrix) {
		checkRowIndex(row);
		final int nCols = getColumnDimension();
		if (((matrix.getRowDimension()) != 1) || ((matrix.getColumnDimension()) != nCols)) {
			throw new org.apache.commons.math.linear.MatrixDimensionMismatchException(matrix.getRowDimension(), matrix.getColumnDimension(), 1, nCols);
		}
		for (int i = 0; i < nCols; ++i) {
			setEntry(row, i, matrix.getEntry(0, i));
		}
	}

	public org.apache.commons.math.linear.FieldMatrix<T> getColumnMatrix(final int column) {
		checkColumnIndex(column);
		final int nRows = getRowDimension();
		final org.apache.commons.math.linear.FieldMatrix<T> out = createMatrix(nRows, 1);
		for (int i = 0; i < nRows; ++i) {
			out.setEntry(i, 0, getEntry(i, column));
		}
		return out;
	}

	public void setColumnMatrix(final int column, final org.apache.commons.math.linear.FieldMatrix<T> matrix) {
		checkColumnIndex(column);
		final int nRows = getRowDimension();
		if (((matrix.getRowDimension()) != nRows) || ((matrix.getColumnDimension()) != 1)) {
			throw new org.apache.commons.math.linear.MatrixDimensionMismatchException(matrix.getRowDimension(), matrix.getColumnDimension(), nRows, 1);
		}
		for (int i = 0; i < nRows; ++i) {
			setEntry(i, column, matrix.getEntry(i, 0));
		}
	}

	public org.apache.commons.math.linear.FieldVector<T> getRowVector(final int row) {
		return new org.apache.commons.math.linear.ArrayFieldVector<T>(getRow(row), false);
	}

	public void setRowVector(final int row, final org.apache.commons.math.linear.FieldVector<T> vector) {
		checkRowIndex(row);
		final int nCols = getColumnDimension();
		if ((vector.getDimension()) != nCols) {
			throw new org.apache.commons.math.linear.MatrixDimensionMismatchException(1, vector.getDimension(), 1, nCols);
		}
		for (int i = 0; i < nCols; ++i) {
			setEntry(row, i, vector.getEntry(i));
		}
	}

	public org.apache.commons.math.linear.FieldVector<T> getColumnVector(final int column) {
		return new org.apache.commons.math.linear.ArrayFieldVector<T>(getColumn(column), false);
	}

	public void setColumnVector(final int column, final org.apache.commons.math.linear.FieldVector<T> vector) {
		checkColumnIndex(column);
		final int nRows = getRowDimension();
		if ((vector.getDimension()) != nRows) {
			throw new org.apache.commons.math.linear.MatrixDimensionMismatchException(vector.getDimension(), 1, nRows, 1);
		}
		for (int i = 0; i < nRows; ++i) {
			setEntry(i, column, vector.getEntry(i));
		}
	}

	public T[] getRow(final int row) {
		checkRowIndex(row);
		final int nCols = getColumnDimension();
		final T[] out = org.apache.commons.math.linear.AbstractFieldMatrix.buildArray(field, nCols);
		for (int i = 0; i < nCols; ++i) {
			out[i] = getEntry(row, i);
		}
		return out;
	}

	public void setRow(final int row, final T[] array) {
		checkRowIndex(row);
		final int nCols = getColumnDimension();
		if ((array.length) != nCols) {
			throw new org.apache.commons.math.linear.MatrixDimensionMismatchException(1, array.length, 1, nCols);
		}
		for (int i = 0; i < nCols; ++i) {
			setEntry(row, i, array[i]);
		}
	}

	public T[] getColumn(final int column) {
		checkColumnIndex(column);
		final int nRows = getRowDimension();
		final T[] out = org.apache.commons.math.linear.AbstractFieldMatrix.buildArray(field, nRows);
		for (int i = 0; i < nRows; ++i) {
			out[i] = getEntry(i, column);
		}
		return out;
	}

	public void setColumn(final int column, final T[] array) {
		checkColumnIndex(column);
		final int nRows = getRowDimension();
		if ((array.length) != nRows) {
			throw new org.apache.commons.math.linear.MatrixDimensionMismatchException(array.length, 1, nRows, 1);
		}
		for (int i = 0; i < nRows; ++i) {
			setEntry(i, column, array[i]);
		}
	}

	public abstract T getEntry(int row, int column);

	public abstract void setEntry(int row, int column, T value);

	public abstract void addToEntry(int row, int column, T increment);

	public abstract void multiplyEntry(int row, int column, T factor);

	public org.apache.commons.math.linear.FieldMatrix<T> transpose() {
		final int nRows = getRowDimension();
		final int nCols = getColumnDimension();
		final org.apache.commons.math.linear.FieldMatrix<T> out = createMatrix(nCols, nRows);
		walkInOptimizedOrder(new org.apache.commons.math.linear.DefaultFieldMatrixPreservingVisitor<T>(field.getZero()) {
			@java.lang.Override
			public void visit(final int row, final int column, final T value) {
				out.setEntry(column, row, value);
			}
		});
		return out;
	}

	public boolean isSquare() {
		return (getColumnDimension()) == (getRowDimension());
	}

	public abstract int getRowDimension();

	public abstract int getColumnDimension();

	public T getTrace() {
		final int nRows = getRowDimension();
		final int nCols = getColumnDimension();
		if (nRows != nCols) {
			throw new org.apache.commons.math.linear.NonSquareMatrixException(nRows, nCols);
		}
		T trace = field.getZero();
		for (int i = 0; i < nRows; ++i) {
			trace = trace.add(getEntry(i, i));
		}
		return trace;
	}

	public T[] operate(final T[] v) {
		final int nRows = getRowDimension();
		final int nCols = getColumnDimension();
		if ((v.length) != nCols) {
			throw new org.apache.commons.math.exception.DimensionMismatchException(v.length, nCols);
		}
		final T[] out = org.apache.commons.math.linear.AbstractFieldMatrix.buildArray(field, nRows);
		for (int row = 0; row < nRows; ++row) {
			T sum = field.getZero();
			for (int i = 0; i < nCols; ++i) {
				sum = sum.add(getEntry(row, i).multiply(v[i]));
			}
			out[row] = sum;
		}
		return out;
	}

	public org.apache.commons.math.linear.FieldVector<T> operate(final org.apache.commons.math.linear.FieldVector<T> v) {
		try {
			return new org.apache.commons.math.linear.ArrayFieldVector<T>(operate(((org.apache.commons.math.linear.ArrayFieldVector<T>) (v)).getDataRef()), false);
		} catch (java.lang.ClassCastException cce) {
			final int nRows = getRowDimension();
			final int nCols = getColumnDimension();
			if ((v.getDimension()) != nCols) {
				throw new org.apache.commons.math.exception.DimensionMismatchException(v.getDimension(), nCols);
			}
			final T[] out = org.apache.commons.math.linear.AbstractFieldMatrix.buildArray(field, nRows);
			for (int row = 0; row < nRows; ++row) {
				T sum = field.getZero();
				for (int i = 0; i < nCols; ++i) {
					sum = sum.add(getEntry(row, i).multiply(v.getEntry(i)));
				}
				out[row] = sum;
			}
			return new org.apache.commons.math.linear.ArrayFieldVector<T>(out, false);
		}
	}

	public T[] preMultiply(final T[] v) {
		final int nRows = getRowDimension();
		final int nCols = getColumnDimension();
		if ((v.length) != nRows) {
			throw new org.apache.commons.math.exception.DimensionMismatchException(v.length, nRows);
		}
		final T[] out = org.apache.commons.math.linear.AbstractFieldMatrix.buildArray(field, nCols);
		for (int col = 0; col < nCols; ++col) {
			T sum = field.getZero();
			for (int i = 0; i < nRows; ++i) {
				sum = sum.add(getEntry(i, col).multiply(v[i]));
			}
			out[col] = sum;
		}
		return out;
	}

	public org.apache.commons.math.linear.FieldVector<T> preMultiply(final org.apache.commons.math.linear.FieldVector<T> v) {
		try {
			return new org.apache.commons.math.linear.ArrayFieldVector<T>(preMultiply(((org.apache.commons.math.linear.ArrayFieldVector<T>) (v)).getDataRef()), false);
		} catch (java.lang.ClassCastException cce) {
			final int nRows = getRowDimension();
			final int nCols = getColumnDimension();
			if ((v.getDimension()) != nRows) {
				throw new org.apache.commons.math.exception.DimensionMismatchException(v.getDimension(), nRows);
			}
			final T[] out = org.apache.commons.math.linear.AbstractFieldMatrix.buildArray(field, nCols);
			for (int col = 0; col < nCols; ++col) {
				T sum = field.getZero();
				for (int i = 0; i < nRows; ++i) {
					sum = sum.add(getEntry(i, col).multiply(v.getEntry(i)));
				}
				out[col] = sum;
			}
			return new org.apache.commons.math.linear.ArrayFieldVector<T>(out);
		}
	}

	public T walkInRowOrder(final org.apache.commons.math.linear.FieldMatrixChangingVisitor<T> visitor) {
		final int rows = getRowDimension();
		final int columns = getColumnDimension();
		visitor.start(rows, columns, 0, (rows - 1), 0, (columns - 1));
		for (int row = 0; row < rows; ++row) {
			for (int column = 0; column < columns; ++column) {
				final T oldValue = getEntry(row, column);
				final T newValue = visitor.visit(row, column, oldValue);
				setEntry(row, column, newValue);
			}
		}
		return visitor.end();
	}

	public T walkInRowOrder(final org.apache.commons.math.linear.FieldMatrixPreservingVisitor<T> visitor) {
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

	public T walkInRowOrder(final org.apache.commons.math.linear.FieldMatrixChangingVisitor<T> visitor, final int startRow, final int endRow, final int startColumn, final int endColumn) {
		checkSubMatrixIndex(startRow, endRow, startColumn, endColumn);
		visitor.start(getRowDimension(), getColumnDimension(), startRow, endRow, startColumn, endColumn);
		for (int row = startRow; row <= endRow; ++row) {
			for (int column = startColumn; column <= endColumn; ++column) {
				final T oldValue = getEntry(row, column);
				final T newValue = visitor.visit(row, column, oldValue);
				setEntry(row, column, newValue);
			}
		}
		return visitor.end();
	}

	public T walkInRowOrder(final org.apache.commons.math.linear.FieldMatrixPreservingVisitor<T> visitor, final int startRow, final int endRow, final int startColumn, final int endColumn) {
		checkSubMatrixIndex(startRow, endRow, startColumn, endColumn);
		visitor.start(getRowDimension(), getColumnDimension(), startRow, endRow, startColumn, endColumn);
		for (int row = startRow; row <= endRow; ++row) {
			for (int column = startColumn; column <= endColumn; ++column) {
				visitor.visit(row, column, getEntry(row, column));
			}
		}
		return visitor.end();
	}

	public T walkInColumnOrder(final org.apache.commons.math.linear.FieldMatrixChangingVisitor<T> visitor) {
		final int rows = getRowDimension();
		final int columns = getColumnDimension();
		visitor.start(rows, columns, 0, (rows - 1), 0, (columns - 1));
		for (int column = 0; column < columns; ++column) {
			for (int row = 0; row < rows; ++row) {
				final T oldValue = getEntry(row, column);
				final T newValue = visitor.visit(row, column, oldValue);
				setEntry(row, column, newValue);
			}
		}
		return visitor.end();
	}

	public T walkInColumnOrder(final org.apache.commons.math.linear.FieldMatrixPreservingVisitor<T> visitor) {
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

	public T walkInColumnOrder(final org.apache.commons.math.linear.FieldMatrixChangingVisitor<T> visitor, final int startRow, final int endRow, final int startColumn, final int endColumn) {
		checkSubMatrixIndex(startRow, endRow, startColumn, endColumn);
		visitor.start(getRowDimension(), getColumnDimension(), startRow, endRow, startColumn, endColumn);
		for (int column = startColumn; column <= endColumn; ++column) {
			for (int row = startRow; row <= endRow; ++row) {
				final T oldValue = getEntry(row, column);
				final T newValue = visitor.visit(row, column, oldValue);
				setEntry(row, column, newValue);
			}
		}
		return visitor.end();
	}

	public T walkInColumnOrder(final org.apache.commons.math.linear.FieldMatrixPreservingVisitor<T> visitor, final int startRow, final int endRow, final int startColumn, final int endColumn) {
		checkSubMatrixIndex(startRow, endRow, startColumn, endColumn);
		visitor.start(getRowDimension(), getColumnDimension(), startRow, endRow, startColumn, endColumn);
		for (int column = startColumn; column <= endColumn; ++column) {
			for (int row = startRow; row <= endRow; ++row) {
				visitor.visit(row, column, getEntry(row, column));
			}
		}
		return visitor.end();
	}

	public T walkInOptimizedOrder(final org.apache.commons.math.linear.FieldMatrixChangingVisitor<T> visitor) {
		return walkInRowOrder(visitor);
	}

	public T walkInOptimizedOrder(final org.apache.commons.math.linear.FieldMatrixPreservingVisitor<T> visitor) {
		return walkInRowOrder(visitor);
	}

	public T walkInOptimizedOrder(final org.apache.commons.math.linear.FieldMatrixChangingVisitor<T> visitor, final int startRow, final int endRow, final int startColumn, final int endColumn) {
		return walkInRowOrder(visitor, startRow, endRow, startColumn, endColumn);
	}

	public T walkInOptimizedOrder(final org.apache.commons.math.linear.FieldMatrixPreservingVisitor<T> visitor, final int startRow, final int endRow, final int startColumn, final int endColumn) {
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
		if (object == (org.apache.commons.math.linear.AbstractFieldMatrix.this)) {
			return true;
		}
		if ((object instanceof org.apache.commons.math.linear.FieldMatrix<?>) == false) {
			return false;
		}
		org.apache.commons.math.linear.FieldMatrix<?> m = ((org.apache.commons.math.linear.FieldMatrix<?>) (object));
		final int nRows = getRowDimension();
		final int nCols = getColumnDimension();
		if (((m.getColumnDimension()) != nCols) || ((m.getRowDimension()) != nRows)) {
			return false;
		}
		for (int row = 0; row < nRows; ++row) {
			for (int col = 0; col < nCols; ++col) {
				if (!(getEntry(row, col).equals(m.getEntry(row, col)))) {
					return false;
				}
			}
		}
		return true;
	}

	@java.lang.Override
	public int hashCode() {
		int ret = 322562;
		final int nRows = getRowDimension();
		final int nCols = getColumnDimension();
		ret = (ret * 31) + nRows;
		ret = (ret * 31) + nCols;
		for (int row = 0; row < nRows; ++row) {
			for (int col = 0; col < nCols; ++col) {
				ret = (ret * 31) + (((11 * (row + 1)) + (17 * (col + 1))) * (getEntry(row, col).hashCode()));
			}
		}
		return ret;
	}

	protected void checkRowIndex(final int row) {
		if ((row < 0) || (row >= (getRowDimension()))) {
			throw new org.apache.commons.math.exception.OutOfRangeException(org.apache.commons.math.exception.util.LocalizedFormats.ROW_INDEX, row, 0, ((getRowDimension()) - 1));
		}
	}

	protected void checkColumnIndex(final int column) {
		if ((column < 0) || (column >= (getColumnDimension()))) {
			throw new org.apache.commons.math.exception.OutOfRangeException(org.apache.commons.math.exception.util.LocalizedFormats.COLUMN_INDEX, column, 0, ((getColumnDimension()) - 1));
		}
	}

	protected void checkSubMatrixIndex(final int startRow, final int endRow, final int startColumn, final int endColumn) {
		checkRowIndex(startRow);
		checkRowIndex(endRow);
		if (endRow < startRow) {
			throw new org.apache.commons.math.exception.NumberIsTooSmallException(org.apache.commons.math.exception.util.LocalizedFormats.INITIAL_ROW_AFTER_FINAL_ROW, endRow, startRow, true);
		}
		checkColumnIndex(startColumn);
		checkColumnIndex(endColumn);
		if (endColumn < startColumn) {
			throw new org.apache.commons.math.exception.NumberIsTooSmallException(org.apache.commons.math.exception.util.LocalizedFormats.INITIAL_COLUMN_AFTER_FINAL_COLUMN, endColumn, startColumn, true);
		}
	}

	protected void checkSubMatrixIndex(final int[] selectedRows, final int[] selectedColumns) {
		if ((selectedRows == null) || (selectedColumns == null)) {
			throw new org.apache.commons.math.exception.NullArgumentException();
		}
		if (((selectedRows.length) == 0) || ((selectedColumns.length) == 0)) {
			throw new org.apache.commons.math.exception.NoDataException();
		}
		for (final int row : selectedRows) {
			checkRowIndex(row);
		}
		for (final int column : selectedColumns) {
			checkColumnIndex(column);
		}
	}

	protected void checkAdditionCompatible(final org.apache.commons.math.linear.FieldMatrix<T> m) {
		if (((getRowDimension()) != (m.getRowDimension())) || ((getColumnDimension()) != (m.getColumnDimension()))) {
			throw new org.apache.commons.math.linear.MatrixDimensionMismatchException(m.getRowDimension(), m.getColumnDimension(), getRowDimension(), getColumnDimension());
		}
	}

	protected void checkSubtractionCompatible(final org.apache.commons.math.linear.FieldMatrix<T> m) {
		if (((getRowDimension()) != (m.getRowDimension())) || ((getColumnDimension()) != (m.getColumnDimension()))) {
			throw new org.apache.commons.math.linear.MatrixDimensionMismatchException(m.getRowDimension(), m.getColumnDimension(), getRowDimension(), getColumnDimension());
		}
	}

	protected void checkMultiplicationCompatible(final org.apache.commons.math.linear.FieldMatrix<T> m) {
		if ((getColumnDimension()) != (m.getRowDimension())) {
			throw new org.apache.commons.math.exception.DimensionMismatchException(m.getRowDimension(), getColumnDimension());
		}
	}
}

