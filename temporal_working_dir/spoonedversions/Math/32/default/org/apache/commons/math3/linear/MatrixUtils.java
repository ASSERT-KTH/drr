

package org.apache.commons.math3.linear;


public class MatrixUtils {
	private MatrixUtils() {
		super();
	}

	public static org.apache.commons.math3.linear.RealMatrix createRealMatrix(final int rows, final int columns) {
		return (rows * columns) <= 4096 ? new org.apache.commons.math3.linear.Array2DRowRealMatrix(rows, columns) : new org.apache.commons.math3.linear.BlockRealMatrix(rows, columns);
	}

	public static <T extends org.apache.commons.math3.FieldElement<T>> org.apache.commons.math3.linear.FieldMatrix<T> createFieldMatrix(final org.apache.commons.math3.Field<T> field, final int rows, final int columns) {
		return (rows * columns) <= 4096 ? new org.apache.commons.math3.linear.Array2DRowFieldMatrix<T>(field, rows, columns) : new org.apache.commons.math3.linear.BlockFieldMatrix<T>(field, rows, columns);
	}

	public static org.apache.commons.math3.linear.RealMatrix createRealMatrix(double[][] data) {
		if ((data == null) || ((data[0]) == null)) {
			throw new org.apache.commons.math3.exception.NullArgumentException();
		}
		return ((data.length) * (data[0].length)) <= 4096 ? new org.apache.commons.math3.linear.Array2DRowRealMatrix(data) : new org.apache.commons.math3.linear.BlockRealMatrix(data);
	}

	public static <T extends org.apache.commons.math3.FieldElement<T>> org.apache.commons.math3.linear.FieldMatrix<T> createFieldMatrix(T[][] data) {
		if ((data == null) || ((data[0]) == null)) {
			throw new org.apache.commons.math3.exception.NullArgumentException();
		}
		return ((data.length) * (data[0].length)) <= 4096 ? new org.apache.commons.math3.linear.Array2DRowFieldMatrix<T>(data) : new org.apache.commons.math3.linear.BlockFieldMatrix<T>(data);
	}

	public static org.apache.commons.math3.linear.RealMatrix createRealIdentityMatrix(int dimension) {
		final org.apache.commons.math3.linear.RealMatrix m = org.apache.commons.math3.linear.MatrixUtils.createRealMatrix(dimension, dimension);
		for (int i = 0; i < dimension; ++i) {
			m.setEntry(i, i, 1.0);
		}
		return m;
	}

	public static <T extends org.apache.commons.math3.FieldElement<T>> org.apache.commons.math3.linear.FieldMatrix<T> createFieldIdentityMatrix(final org.apache.commons.math3.Field<T> field, final int dimension) {
		final T zero = field.getZero();
		final T one = field.getOne();
		@java.lang.SuppressWarnings(value = "unchecked")
		final T[][] d = ((T[][]) (java.lang.reflect.Array.newInstance(field.getRuntimeClass(), new int[]{ dimension , dimension })));
		for (int row = 0; row < dimension; row++) {
			final T[] dRow = d[row];
			java.util.Arrays.fill(dRow, zero);
			dRow[row] = one;
		}
		return new org.apache.commons.math3.linear.Array2DRowFieldMatrix<T>(field, d, false);
	}

	public static org.apache.commons.math3.linear.RealMatrix createRealDiagonalMatrix(final double[] diagonal) {
		final org.apache.commons.math3.linear.RealMatrix m = org.apache.commons.math3.linear.MatrixUtils.createRealMatrix(diagonal.length, diagonal.length);
		for (int i = 0; i < (diagonal.length); ++i) {
			m.setEntry(i, i, diagonal[i]);
		}
		return m;
	}

	public static <T extends org.apache.commons.math3.FieldElement<T>> org.apache.commons.math3.linear.FieldMatrix<T> createFieldDiagonalMatrix(final T[] diagonal) {
		final org.apache.commons.math3.linear.FieldMatrix<T> m = org.apache.commons.math3.linear.MatrixUtils.createFieldMatrix(diagonal[0].getField(), diagonal.length, diagonal.length);
		for (int i = 0; i < (diagonal.length); ++i) {
			m.setEntry(i, i, diagonal[i]);
		}
		return m;
	}

	public static org.apache.commons.math3.linear.RealVector createRealVector(double[] data) {
		if (data == null) {
			throw new org.apache.commons.math3.exception.NullArgumentException();
		}
		return new org.apache.commons.math3.linear.ArrayRealVector(data, true);
	}

	public static <T extends org.apache.commons.math3.FieldElement<T>> org.apache.commons.math3.linear.FieldVector<T> createFieldVector(final T[] data) {
		if (data == null) {
			throw new org.apache.commons.math3.exception.NullArgumentException();
		}
		if ((data.length) == 0) {
			throw new org.apache.commons.math3.exception.ZeroException(org.apache.commons.math3.exception.util.LocalizedFormats.VECTOR_MUST_HAVE_AT_LEAST_ONE_ELEMENT);
		}
		return new org.apache.commons.math3.linear.ArrayFieldVector<T>(data[0].getField(), data, true);
	}

	public static org.apache.commons.math3.linear.RealMatrix createRowRealMatrix(double[] rowData) {
		if (rowData == null) {
			throw new org.apache.commons.math3.exception.NullArgumentException();
		}
		final int nCols = rowData.length;
		final org.apache.commons.math3.linear.RealMatrix m = org.apache.commons.math3.linear.MatrixUtils.createRealMatrix(1, nCols);
		for (int i = 0; i < nCols; ++i) {
			m.setEntry(0, i, rowData[i]);
		}
		return m;
	}

	public static <T extends org.apache.commons.math3.FieldElement<T>> org.apache.commons.math3.linear.FieldMatrix<T> createRowFieldMatrix(final T[] rowData) {
		if (rowData == null) {
			throw new org.apache.commons.math3.exception.NullArgumentException();
		}
		final int nCols = rowData.length;
		if (nCols == 0) {
			throw new org.apache.commons.math3.exception.NoDataException(org.apache.commons.math3.exception.util.LocalizedFormats.AT_LEAST_ONE_COLUMN);
		}
		final org.apache.commons.math3.linear.FieldMatrix<T> m = org.apache.commons.math3.linear.MatrixUtils.createFieldMatrix(rowData[0].getField(), 1, nCols);
		for (int i = 0; i < nCols; ++i) {
			m.setEntry(0, i, rowData[i]);
		}
		return m;
	}

	public static org.apache.commons.math3.linear.RealMatrix createColumnRealMatrix(double[] columnData) {
		if (columnData == null) {
			throw new org.apache.commons.math3.exception.NullArgumentException();
		}
		final int nRows = columnData.length;
		final org.apache.commons.math3.linear.RealMatrix m = org.apache.commons.math3.linear.MatrixUtils.createRealMatrix(nRows, 1);
		for (int i = 0; i < nRows; ++i) {
			m.setEntry(i, 0, columnData[i]);
		}
		return m;
	}

	public static <T extends org.apache.commons.math3.FieldElement<T>> org.apache.commons.math3.linear.FieldMatrix<T> createColumnFieldMatrix(final T[] columnData) {
		if (columnData == null) {
			throw new org.apache.commons.math3.exception.NullArgumentException();
		}
		final int nRows = columnData.length;
		if (nRows == 0) {
			throw new org.apache.commons.math3.exception.NoDataException(org.apache.commons.math3.exception.util.LocalizedFormats.AT_LEAST_ONE_ROW);
		}
		final org.apache.commons.math3.linear.FieldMatrix<T> m = org.apache.commons.math3.linear.MatrixUtils.createFieldMatrix(columnData[0].getField(), nRows, 1);
		for (int i = 0; i < nRows; ++i) {
			m.setEntry(i, 0, columnData[i]);
		}
		return m;
	}

	public static void checkMatrixIndex(final org.apache.commons.math3.linear.AnyMatrix m, final int row, final int column) {
		org.apache.commons.math3.linear.MatrixUtils.checkRowIndex(m, row);
		org.apache.commons.math3.linear.MatrixUtils.checkColumnIndex(m, column);
	}

	public static void checkRowIndex(final org.apache.commons.math3.linear.AnyMatrix m, final int row) {
		if ((row < 0) || (row >= (m.getRowDimension()))) {
			throw new org.apache.commons.math3.exception.OutOfRangeException(org.apache.commons.math3.exception.util.LocalizedFormats.ROW_INDEX, row, 0, ((m.getRowDimension()) - 1));
		}
	}

	public static void checkColumnIndex(final org.apache.commons.math3.linear.AnyMatrix m, final int column) {
		if ((column < 0) || (column >= (m.getColumnDimension()))) {
			throw new org.apache.commons.math3.exception.OutOfRangeException(org.apache.commons.math3.exception.util.LocalizedFormats.COLUMN_INDEX, column, 0, ((m.getColumnDimension()) - 1));
		}
	}

	public static void checkSubMatrixIndex(final org.apache.commons.math3.linear.AnyMatrix m, final int startRow, final int endRow, final int startColumn, final int endColumn) {
		org.apache.commons.math3.linear.MatrixUtils.checkRowIndex(m, startRow);
		org.apache.commons.math3.linear.MatrixUtils.checkRowIndex(m, endRow);
		if (endRow < startRow) {
			throw new org.apache.commons.math3.exception.NumberIsTooSmallException(org.apache.commons.math3.exception.util.LocalizedFormats.INITIAL_ROW_AFTER_FINAL_ROW, endRow, startRow, false);
		}
		org.apache.commons.math3.linear.MatrixUtils.checkColumnIndex(m, startColumn);
		org.apache.commons.math3.linear.MatrixUtils.checkColumnIndex(m, endColumn);
		if (endColumn < startColumn) {
			throw new org.apache.commons.math3.exception.NumberIsTooSmallException(org.apache.commons.math3.exception.util.LocalizedFormats.INITIAL_COLUMN_AFTER_FINAL_COLUMN, endColumn, startColumn, false);
		}
	}

	public static void checkSubMatrixIndex(final org.apache.commons.math3.linear.AnyMatrix m, final int[] selectedRows, final int[] selectedColumns) {
		if (selectedRows == null) {
			throw new org.apache.commons.math3.exception.NullArgumentException();
		}
		if (selectedColumns == null) {
			throw new org.apache.commons.math3.exception.NullArgumentException();
		}
		if ((selectedRows.length) == 0) {
			throw new org.apache.commons.math3.exception.NoDataException(org.apache.commons.math3.exception.util.LocalizedFormats.EMPTY_SELECTED_ROW_INDEX_ARRAY);
		}
		if ((selectedColumns.length) == 0) {
			throw new org.apache.commons.math3.exception.NoDataException(org.apache.commons.math3.exception.util.LocalizedFormats.EMPTY_SELECTED_COLUMN_INDEX_ARRAY);
		}
		for (final int row : selectedRows) {
			org.apache.commons.math3.linear.MatrixUtils.checkRowIndex(m, row);
		}
		for (final int column : selectedColumns) {
			org.apache.commons.math3.linear.MatrixUtils.checkColumnIndex(m, column);
		}
	}

	public static void checkAdditionCompatible(final org.apache.commons.math3.linear.AnyMatrix left, final org.apache.commons.math3.linear.AnyMatrix right) {
		if (((left.getRowDimension()) != (right.getRowDimension())) || ((left.getColumnDimension()) != (right.getColumnDimension()))) {
			throw new org.apache.commons.math3.linear.MatrixDimensionMismatchException(left.getRowDimension(), left.getColumnDimension(), right.getRowDimension(), right.getColumnDimension());
		}
	}

	public static void checkSubtractionCompatible(final org.apache.commons.math3.linear.AnyMatrix left, final org.apache.commons.math3.linear.AnyMatrix right) {
		if (((left.getRowDimension()) != (right.getRowDimension())) || ((left.getColumnDimension()) != (right.getColumnDimension()))) {
			throw new org.apache.commons.math3.linear.MatrixDimensionMismatchException(left.getRowDimension(), left.getColumnDimension(), right.getRowDimension(), right.getColumnDimension());
		}
	}

	public static void checkMultiplicationCompatible(final org.apache.commons.math3.linear.AnyMatrix left, final org.apache.commons.math3.linear.AnyMatrix right) {
		if ((left.getColumnDimension()) != (right.getRowDimension())) {
			throw new org.apache.commons.math3.exception.DimensionMismatchException(left.getColumnDimension(), right.getRowDimension());
		}
	}

	public static org.apache.commons.math3.linear.Array2DRowRealMatrix fractionMatrixToRealMatrix(final org.apache.commons.math3.linear.FieldMatrix<org.apache.commons.math3.fraction.Fraction> m) {
		final org.apache.commons.math3.linear.MatrixUtils.FractionMatrixConverter converter = new org.apache.commons.math3.linear.MatrixUtils.FractionMatrixConverter();
		m.walkInOptimizedOrder(converter);
		return converter.getConvertedMatrix();
	}

	private static class FractionMatrixConverter extends org.apache.commons.math3.linear.DefaultFieldMatrixPreservingVisitor<org.apache.commons.math3.fraction.Fraction> {
		private double[][] data;

		public FractionMatrixConverter() {
			super(org.apache.commons.math3.fraction.Fraction.ZERO);
		}

		@java.lang.Override
		public void start(int rows, int columns, int startRow, int endRow, int startColumn, int endColumn) {
			data = new double[rows][columns];
		}

		@java.lang.Override
		public void visit(int row, int column, org.apache.commons.math3.fraction.Fraction value) {
			data[row][column] = value.doubleValue();
		}

		org.apache.commons.math3.linear.Array2DRowRealMatrix getConvertedMatrix() {
			return new org.apache.commons.math3.linear.Array2DRowRealMatrix(data, false);
		}
	}

	public static org.apache.commons.math3.linear.Array2DRowRealMatrix bigFractionMatrixToRealMatrix(final org.apache.commons.math3.linear.FieldMatrix<org.apache.commons.math3.fraction.BigFraction> m) {
		final org.apache.commons.math3.linear.MatrixUtils.BigFractionMatrixConverter converter = new org.apache.commons.math3.linear.MatrixUtils.BigFractionMatrixConverter();
		m.walkInOptimizedOrder(converter);
		return converter.getConvertedMatrix();
	}

	private static class BigFractionMatrixConverter extends org.apache.commons.math3.linear.DefaultFieldMatrixPreservingVisitor<org.apache.commons.math3.fraction.BigFraction> {
		private double[][] data;

		public BigFractionMatrixConverter() {
			super(org.apache.commons.math3.fraction.BigFraction.ZERO);
		}

		@java.lang.Override
		public void start(int rows, int columns, int startRow, int endRow, int startColumn, int endColumn) {
			data = new double[rows][columns];
		}

		@java.lang.Override
		public void visit(int row, int column, org.apache.commons.math3.fraction.BigFraction value) {
			data[row][column] = value.doubleValue();
		}

		org.apache.commons.math3.linear.Array2DRowRealMatrix getConvertedMatrix() {
			return new org.apache.commons.math3.linear.Array2DRowRealMatrix(data, false);
		}
	}

	public static void serializeRealVector(final org.apache.commons.math3.linear.RealVector vector, final java.io.ObjectOutputStream oos) throws java.io.IOException {
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
			final org.apache.commons.math3.linear.RealVector vector = new org.apache.commons.math3.linear.ArrayRealVector(data, false);
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

	public static void serializeRealMatrix(final org.apache.commons.math3.linear.RealMatrix matrix, final java.io.ObjectOutputStream oos) throws java.io.IOException {
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
			final org.apache.commons.math3.linear.RealMatrix matrix = new org.apache.commons.math3.linear.Array2DRowRealMatrix(data, false);
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

	public static void solveLowerTriangularSystem(org.apache.commons.math3.linear.RealMatrix rm, org.apache.commons.math3.linear.RealVector b) {
		if (((rm == null) || (b == null)) || ((rm.getRowDimension()) != (b.getDimension()))) {
			throw new org.apache.commons.math3.exception.MathIllegalArgumentException(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_SIMPLE, (rm == null ? 0 : rm.getRowDimension()), (b == null ? 0 : b.getDimension()));
		}
		if ((rm.getColumnDimension()) != (rm.getRowDimension())) {
			throw new org.apache.commons.math3.exception.MathIllegalArgumentException(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2, rm.getRowDimension(), rm.getRowDimension(), rm.getRowDimension(), rm.getColumnDimension());
		}
		int rows = rm.getRowDimension();
		for (int i = 0; i < rows; i++) {
			double diag = rm.getEntry(i, i);
			if ((org.apache.commons.math3.util.FastMath.abs(diag)) < (org.apache.commons.math3.util.Precision.SAFE_MIN)) {
				throw new org.apache.commons.math3.exception.MathArithmeticException(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_DENOMINATOR);
			}
			double bi = (b.getEntry(i)) / diag;
			b.setEntry(i, bi);
			for (int j = i + 1; j < rows; j++) {
				b.setEntry(j, ((b.getEntry(j)) - (bi * (rm.getEntry(j, i)))));
			}
		}
	}

	public static void solveUpperTriangularSystem(org.apache.commons.math3.linear.RealMatrix rm, org.apache.commons.math3.linear.RealVector b) {
		if (((rm == null) || (b == null)) || ((rm.getRowDimension()) != (b.getDimension()))) {
			throw new org.apache.commons.math3.exception.MathIllegalArgumentException(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_SIMPLE, (rm == null ? 0 : rm.getRowDimension()), (b == null ? 0 : b.getDimension()));
		}
		if ((rm.getColumnDimension()) != (rm.getRowDimension())) {
			throw new org.apache.commons.math3.exception.MathIllegalArgumentException(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2, rm.getRowDimension(), rm.getRowDimension(), rm.getRowDimension(), rm.getColumnDimension());
		}
		int rows = rm.getRowDimension();
		for (int i = rows - 1; i > (-1); i--) {
			double diag = rm.getEntry(i, i);
			if ((org.apache.commons.math3.util.FastMath.abs(diag)) < (org.apache.commons.math3.util.Precision.SAFE_MIN)) {
				throw new org.apache.commons.math3.exception.MathArithmeticException(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_DENOMINATOR);
			}
			double bi = (b.getEntry(i)) / diag;
			b.setEntry(i, bi);
			for (int j = i - 1; j > (-1); j--) {
				b.setEntry(j, ((b.getEntry(j)) - (bi * (rm.getEntry(j, i)))));
			}
		}
	}
}

