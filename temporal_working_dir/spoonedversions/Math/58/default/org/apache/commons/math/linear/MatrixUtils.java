

package org.apache.commons.math.linear;


public class MatrixUtils {
	private MatrixUtils() {
		super();
	}

	public static org.apache.commons.math.linear.RealMatrix createRealMatrix(final int rows, final int columns) {
		return (rows * columns) <= 4096 ? new org.apache.commons.math.linear.Array2DRowRealMatrix(rows, columns) : new org.apache.commons.math.linear.BlockRealMatrix(rows, columns);
	}

	public static <T extends org.apache.commons.math.FieldElement<T>> org.apache.commons.math.linear.FieldMatrix<T> createFieldMatrix(final org.apache.commons.math.Field<T> field, final int rows, final int columns) {
		return (rows * columns) <= 4096 ? new org.apache.commons.math.linear.Array2DRowFieldMatrix<T>(field, rows, columns) : new org.apache.commons.math.linear.BlockFieldMatrix<T>(field, rows, columns);
	}

	public static org.apache.commons.math.linear.RealMatrix createRealMatrix(double[][] data) {
		if ((data == null) || ((data[0]) == null)) {
			throw new org.apache.commons.math.exception.NullArgumentException();
		}
		return ((data.length) * (data[0].length)) <= 4096 ? new org.apache.commons.math.linear.Array2DRowRealMatrix(data) : new org.apache.commons.math.linear.BlockRealMatrix(data);
	}

	public static <T extends org.apache.commons.math.FieldElement<T>> org.apache.commons.math.linear.FieldMatrix<T> createFieldMatrix(T[][] data) {
		if ((data == null) || ((data[0]) == null)) {
			throw new org.apache.commons.math.exception.NullArgumentException();
		}
		return ((data.length) * (data[0].length)) <= 4096 ? new org.apache.commons.math.linear.Array2DRowFieldMatrix<T>(data) : new org.apache.commons.math.linear.BlockFieldMatrix<T>(data);
	}

	public static org.apache.commons.math.linear.RealMatrix createRealIdentityMatrix(int dimension) {
		final org.apache.commons.math.linear.RealMatrix m = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(dimension, dimension);
		for (int i = 0; i < dimension; ++i) {
			m.setEntry(i, i, 1.0);
		}
		return m;
	}

	public static <T extends org.apache.commons.math.FieldElement<T>> org.apache.commons.math.linear.FieldMatrix<T> createFieldIdentityMatrix(final org.apache.commons.math.Field<T> field, final int dimension) {
		final T zero = field.getZero();
		final T one = field.getOne();
		@java.lang.SuppressWarnings(value = "unchecked")
		final T[][] d = ((T[][]) (java.lang.reflect.Array.newInstance(zero.getClass(), new int[]{ dimension , dimension })));
		for (int row = 0; row < dimension; row++) {
			final T[] dRow = d[row];
			java.util.Arrays.fill(dRow, zero);
			dRow[row] = one;
		}
		return new org.apache.commons.math.linear.Array2DRowFieldMatrix<T>(d, false);
	}

	public static org.apache.commons.math.linear.RealMatrix createRealDiagonalMatrix(final double[] diagonal) {
		final org.apache.commons.math.linear.RealMatrix m = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(diagonal.length, diagonal.length);
		for (int i = 0; i < (diagonal.length); ++i) {
			m.setEntry(i, i, diagonal[i]);
		}
		return m;
	}

	public static <T extends org.apache.commons.math.FieldElement<T>> org.apache.commons.math.linear.FieldMatrix<T> createFieldDiagonalMatrix(final T[] diagonal) {
		final org.apache.commons.math.linear.FieldMatrix<T> m = org.apache.commons.math.linear.MatrixUtils.createFieldMatrix(diagonal[0].getField(), diagonal.length, diagonal.length);
		for (int i = 0; i < (diagonal.length); ++i) {
			m.setEntry(i, i, diagonal[i]);
		}
		return m;
	}

	public static org.apache.commons.math.linear.RealVector createRealVector(double[] data) {
		if (data == null) {
			throw new org.apache.commons.math.exception.NullArgumentException();
		}
		return new org.apache.commons.math.linear.ArrayRealVector(data, true);
	}

	public static <T extends org.apache.commons.math.FieldElement<T>> org.apache.commons.math.linear.FieldVector<T> createFieldVector(final T[] data) {
		if (data == null) {
			throw new org.apache.commons.math.exception.NullArgumentException();
		}
		return new org.apache.commons.math.linear.ArrayFieldVector<T>(data, true);
	}

	public static org.apache.commons.math.linear.RealMatrix createRowRealMatrix(double[] rowData) {
		if (rowData == null) {
			throw new org.apache.commons.math.exception.NullArgumentException();
		}
		final int nCols = rowData.length;
		final org.apache.commons.math.linear.RealMatrix m = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(1, nCols);
		for (int i = 0; i < nCols; ++i) {
			m.setEntry(0, i, rowData[i]);
		}
		return m;
	}

	public static <T extends org.apache.commons.math.FieldElement<T>> org.apache.commons.math.linear.FieldMatrix<T> createRowFieldMatrix(final T[] rowData) {
		if (rowData == null) {
			throw new org.apache.commons.math.exception.NullArgumentException();
		}
		final int nCols = rowData.length;
		if (nCols == 0) {
			throw new org.apache.commons.math.exception.NoDataException(org.apache.commons.math.exception.util.LocalizedFormats.AT_LEAST_ONE_COLUMN);
		}
		final org.apache.commons.math.linear.FieldMatrix<T> m = org.apache.commons.math.linear.MatrixUtils.createFieldMatrix(rowData[0].getField(), 1, nCols);
		for (int i = 0; i < nCols; ++i) {
			m.setEntry(0, i, rowData[i]);
		}
		return m;
	}

	public static org.apache.commons.math.linear.RealMatrix createColumnRealMatrix(double[] columnData) {
		if (columnData == null) {
			throw new org.apache.commons.math.exception.NullArgumentException();
		}
		final int nRows = columnData.length;
		final org.apache.commons.math.linear.RealMatrix m = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(nRows, 1);
		for (int i = 0; i < nRows; ++i) {
			m.setEntry(i, 0, columnData[i]);
		}
		return m;
	}

	public static <T extends org.apache.commons.math.FieldElement<T>> org.apache.commons.math.linear.FieldMatrix<T> createColumnFieldMatrix(final T[] columnData) {
		if (columnData == null) {
			throw new org.apache.commons.math.exception.NullArgumentException();
		}
		final int nRows = columnData.length;
		if (nRows == 0) {
			throw new org.apache.commons.math.exception.NoDataException(org.apache.commons.math.exception.util.LocalizedFormats.AT_LEAST_ONE_ROW);
		}
		final org.apache.commons.math.linear.FieldMatrix<T> m = org.apache.commons.math.linear.MatrixUtils.createFieldMatrix(columnData[0].getField(), nRows, 1);
		for (int i = 0; i < nRows; ++i) {
			m.setEntry(i, 0, columnData[i]);
		}
		return m;
	}

	public static void checkMatrixIndex(final org.apache.commons.math.linear.AnyMatrix m, final int row, final int column) {
		org.apache.commons.math.linear.MatrixUtils.checkRowIndex(m, row);
		org.apache.commons.math.linear.MatrixUtils.checkColumnIndex(m, column);
	}

	public static void checkRowIndex(final org.apache.commons.math.linear.AnyMatrix m, final int row) {
		if ((row < 0) || (row >= (m.getRowDimension()))) {
			throw new org.apache.commons.math.exception.OutOfRangeException(org.apache.commons.math.exception.util.LocalizedFormats.ROW_INDEX, row, 0, ((m.getRowDimension()) - 1));
		}
	}

	public static void checkColumnIndex(final org.apache.commons.math.linear.AnyMatrix m, final int column) {
		if ((column < 0) || (column >= (m.getColumnDimension()))) {
			throw new org.apache.commons.math.exception.OutOfRangeException(org.apache.commons.math.exception.util.LocalizedFormats.COLUMN_INDEX, column, 0, ((m.getColumnDimension()) - 1));
		}
	}

	public static void checkSubMatrixIndex(final org.apache.commons.math.linear.AnyMatrix m, final int startRow, final int endRow, final int startColumn, final int endColumn) {
		org.apache.commons.math.linear.MatrixUtils.checkRowIndex(m, startRow);
		org.apache.commons.math.linear.MatrixUtils.checkRowIndex(m, endRow);
		if (endRow < startRow) {
			throw new org.apache.commons.math.exception.NumberIsTooSmallException(org.apache.commons.math.exception.util.LocalizedFormats.INITIAL_ROW_AFTER_FINAL_ROW, endRow, startRow, false);
		}
		org.apache.commons.math.linear.MatrixUtils.checkColumnIndex(m, startColumn);
		org.apache.commons.math.linear.MatrixUtils.checkColumnIndex(m, endColumn);
		if (endColumn < startColumn) {
			throw new org.apache.commons.math.exception.NumberIsTooSmallException(org.apache.commons.math.exception.util.LocalizedFormats.INITIAL_COLUMN_AFTER_FINAL_COLUMN, endColumn, startColumn, false);
		}
	}

	public static void checkSubMatrixIndex(final org.apache.commons.math.linear.AnyMatrix m, final int[] selectedRows, final int[] selectedColumns) {
		if (selectedRows == null) {
			throw new org.apache.commons.math.exception.NullArgumentException();
		}
		if (selectedColumns == null) {
			throw new org.apache.commons.math.exception.NullArgumentException();
		}
		if ((selectedRows.length) == 0) {
			throw new org.apache.commons.math.exception.NoDataException(org.apache.commons.math.exception.util.LocalizedFormats.EMPTY_SELECTED_ROW_INDEX_ARRAY);
		}
		if ((selectedColumns.length) == 0) {
			throw new org.apache.commons.math.exception.NoDataException(org.apache.commons.math.exception.util.LocalizedFormats.EMPTY_SELECTED_COLUMN_INDEX_ARRAY);
		}
		for (final int row : selectedRows) {
			org.apache.commons.math.linear.MatrixUtils.checkRowIndex(m, row);
		}
		for (final int column : selectedColumns) {
			org.apache.commons.math.linear.MatrixUtils.checkColumnIndex(m, column);
		}
	}

	public static void checkAdditionCompatible(final org.apache.commons.math.linear.AnyMatrix left, final org.apache.commons.math.linear.AnyMatrix right) {
		if (((left.getRowDimension()) != (right.getRowDimension())) || ((left.getColumnDimension()) != (right.getColumnDimension()))) {
			throw new org.apache.commons.math.exception.MatrixDimensionMismatchException(left.getRowDimension(), left.getColumnDimension(), right.getRowDimension(), right.getColumnDimension());
		}
	}

	public static void checkSubtractionCompatible(final org.apache.commons.math.linear.AnyMatrix left, final org.apache.commons.math.linear.AnyMatrix right) {
		if (((left.getRowDimension()) != (right.getRowDimension())) || ((left.getColumnDimension()) != (right.getColumnDimension()))) {
			throw new org.apache.commons.math.exception.MatrixDimensionMismatchException(left.getRowDimension(), left.getColumnDimension(), right.getRowDimension(), right.getColumnDimension());
		}
	}

	public static void checkMultiplicationCompatible(final org.apache.commons.math.linear.AnyMatrix left, final org.apache.commons.math.linear.AnyMatrix right) {
		if ((left.getColumnDimension()) != (right.getRowDimension())) {
			throw new org.apache.commons.math.exception.DimensionMismatchException(left.getColumnDimension(), right.getRowDimension());
		}
	}

	public static org.apache.commons.math.linear.Array2DRowRealMatrix fractionMatrixToRealMatrix(final org.apache.commons.math.linear.FieldMatrix<org.apache.commons.math.fraction.Fraction> m) {
		final org.apache.commons.math.linear.MatrixUtils.FractionMatrixConverter converter = new org.apache.commons.math.linear.MatrixUtils.FractionMatrixConverter();
		m.walkInOptimizedOrder(converter);
		return converter.getConvertedMatrix();
	}

	private static class FractionMatrixConverter extends org.apache.commons.math.linear.DefaultFieldMatrixPreservingVisitor<org.apache.commons.math.fraction.Fraction> {
		private double[][] data;

		public FractionMatrixConverter() {
			super(org.apache.commons.math.fraction.Fraction.ZERO);
		}

		@java.lang.Override
		public void start(int rows, int columns, int startRow, int endRow, int startColumn, int endColumn) {
			data = new double[rows][columns];
		}

		@java.lang.Override
		public void visit(int row, int column, org.apache.commons.math.fraction.Fraction value) {
			data[row][column] = value.doubleValue();
		}

		org.apache.commons.math.linear.Array2DRowRealMatrix getConvertedMatrix() {
			return new org.apache.commons.math.linear.Array2DRowRealMatrix(data, false);
		}
	}

	public static org.apache.commons.math.linear.Array2DRowRealMatrix bigFractionMatrixToRealMatrix(final org.apache.commons.math.linear.FieldMatrix<org.apache.commons.math.fraction.BigFraction> m) {
		final org.apache.commons.math.linear.MatrixUtils.BigFractionMatrixConverter converter = new org.apache.commons.math.linear.MatrixUtils.BigFractionMatrixConverter();
		m.walkInOptimizedOrder(converter);
		return converter.getConvertedMatrix();
	}

	private static class BigFractionMatrixConverter extends org.apache.commons.math.linear.DefaultFieldMatrixPreservingVisitor<org.apache.commons.math.fraction.BigFraction> {
		private double[][] data;

		public BigFractionMatrixConverter() {
			super(org.apache.commons.math.fraction.BigFraction.ZERO);
		}

		@java.lang.Override
		public void start(int rows, int columns, int startRow, int endRow, int startColumn, int endColumn) {
			data = new double[rows][columns];
		}

		@java.lang.Override
		public void visit(int row, int column, org.apache.commons.math.fraction.BigFraction value) {
			data[row][column] = value.doubleValue();
		}

		org.apache.commons.math.linear.Array2DRowRealMatrix getConvertedMatrix() {
			return new org.apache.commons.math.linear.Array2DRowRealMatrix(data, false);
		}
	}

	public static void serializeRealVector(final org.apache.commons.math.linear.RealVector vector, final java.io.ObjectOutputStream oos) throws java.io.IOException {
		final int n = vector.getDimension();
		oos.writeInt(n);
		for (int i = 0; i < n; ++i) {
			oos.writeDouble(vector.getEntry(i));
		}
	}

	public static void deserializeRealVector(final java.lang.Object instance, final java.lang.String fieldName, final java.io.ObjectInputStream ois) throws java.io.IOException, java.lang.ClassNotFoundException {
		try {
			final int n = ois.readInt();
			final double[] data = new double[n];
			for (int i = 0; i < n; ++i) {
				data[i] = ois.readDouble();
			}
			final org.apache.commons.math.linear.RealVector vector = new org.apache.commons.math.linear.ArrayRealVector(data, false);
			final java.lang.reflect.Field f = instance.getClass().getDeclaredField(fieldName);
			f.setAccessible(true);
			f.set(instance, vector);
		} catch (java.lang.NoSuchFieldException nsfe) {
			java.io.IOException ioe = new java.io.IOException();
			ioe.initCause(nsfe);
			throw ioe;
		} catch (java.lang.IllegalAccessException iae) {
			java.io.IOException ioe = new java.io.IOException();
			ioe.initCause(iae);
			throw ioe;
		}
	}

	public static void serializeRealMatrix(final org.apache.commons.math.linear.RealMatrix matrix, final java.io.ObjectOutputStream oos) throws java.io.IOException {
		final int n = matrix.getRowDimension();
		final int m = matrix.getColumnDimension();
		oos.writeInt(n);
		oos.writeInt(m);
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < m; ++j) {
				oos.writeDouble(matrix.getEntry(i, j));
			}
		}
	}

	public static void deserializeRealMatrix(final java.lang.Object instance, final java.lang.String fieldName, final java.io.ObjectInputStream ois) throws java.io.IOException, java.lang.ClassNotFoundException {
		try {
			final int n = ois.readInt();
			final int m = ois.readInt();
			final double[][] data = new double[n][m];
			for (int i = 0; i < n; ++i) {
				final double[] dataI = data[i];
				for (int j = 0; j < m; ++j) {
					dataI[j] = ois.readDouble();
				}
			}
			final org.apache.commons.math.linear.RealMatrix matrix = new org.apache.commons.math.linear.Array2DRowRealMatrix(data, false);
			final java.lang.reflect.Field f = instance.getClass().getDeclaredField(fieldName);
			f.setAccessible(true);
			f.set(instance, matrix);
		} catch (java.lang.NoSuchFieldException nsfe) {
			java.io.IOException ioe = new java.io.IOException();
			ioe.initCause(nsfe);
			throw ioe;
		} catch (java.lang.IllegalAccessException iae) {
			java.io.IOException ioe = new java.io.IOException();
			ioe.initCause(iae);
			throw ioe;
		}
	}
}

