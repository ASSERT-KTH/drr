

package org.apache.commons.math3.linear;


public interface FieldMatrix<T extends org.apache.commons.math3.FieldElement<T>> extends org.apache.commons.math3.linear.AnyMatrix {
	org.apache.commons.math3.Field<T> getField();

	org.apache.commons.math3.linear.FieldMatrix<T> createMatrix(final int rowDimension, final int columnDimension) throws org.apache.commons.math3.exception.NotStrictlyPositiveException;

	org.apache.commons.math3.linear.FieldMatrix<T> copy();

	org.apache.commons.math3.linear.FieldMatrix<T> add(org.apache.commons.math3.linear.FieldMatrix<T> m) throws org.apache.commons.math3.linear.MatrixDimensionMismatchException;

	org.apache.commons.math3.linear.FieldMatrix<T> subtract(org.apache.commons.math3.linear.FieldMatrix<T> m) throws org.apache.commons.math3.linear.MatrixDimensionMismatchException;

	org.apache.commons.math3.linear.FieldMatrix<T> scalarAdd(T d);

	org.apache.commons.math3.linear.FieldMatrix<T> scalarMultiply(T d);

	org.apache.commons.math3.linear.FieldMatrix<T> multiply(org.apache.commons.math3.linear.FieldMatrix<T> m) throws org.apache.commons.math3.exception.DimensionMismatchException;

	org.apache.commons.math3.linear.FieldMatrix<T> preMultiply(org.apache.commons.math3.linear.FieldMatrix<T> m) throws org.apache.commons.math3.exception.DimensionMismatchException;

	org.apache.commons.math3.linear.FieldMatrix<T> power(final int p) throws org.apache.commons.math3.exception.NotPositiveException, org.apache.commons.math3.linear.NonSquareMatrixException;

	T[][] getData();

	org.apache.commons.math3.linear.FieldMatrix<T> getSubMatrix(int startRow, int endRow, int startColumn, int endColumn) throws org.apache.commons.math3.exception.NumberIsTooSmallException, org.apache.commons.math3.exception.OutOfRangeException;

	org.apache.commons.math3.linear.FieldMatrix<T> getSubMatrix(int[] selectedRows, int[] selectedColumns) throws org.apache.commons.math3.exception.NoDataException, org.apache.commons.math3.exception.NullArgumentException, org.apache.commons.math3.exception.OutOfRangeException;

	void copySubMatrix(int startRow, int endRow, int startColumn, int endColumn, T[][] destination) throws org.apache.commons.math3.exception.NumberIsTooSmallException, org.apache.commons.math3.exception.OutOfRangeException, org.apache.commons.math3.linear.MatrixDimensionMismatchException;

	void copySubMatrix(int[] selectedRows, int[] selectedColumns, T[][] destination) throws org.apache.commons.math3.exception.NoDataException, org.apache.commons.math3.exception.NullArgumentException, org.apache.commons.math3.exception.OutOfRangeException, org.apache.commons.math3.linear.MatrixDimensionMismatchException;

	void setSubMatrix(T[][] subMatrix, int row, int column) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.NoDataException, org.apache.commons.math3.exception.NullArgumentException, org.apache.commons.math3.exception.OutOfRangeException;

	org.apache.commons.math3.linear.FieldMatrix<T> getRowMatrix(int row) throws org.apache.commons.math3.exception.OutOfRangeException;

	void setRowMatrix(int row, org.apache.commons.math3.linear.FieldMatrix<T> matrix) throws org.apache.commons.math3.exception.OutOfRangeException, org.apache.commons.math3.linear.MatrixDimensionMismatchException;

	org.apache.commons.math3.linear.FieldMatrix<T> getColumnMatrix(int column) throws org.apache.commons.math3.exception.OutOfRangeException;

	void setColumnMatrix(int column, org.apache.commons.math3.linear.FieldMatrix<T> matrix) throws org.apache.commons.math3.exception.OutOfRangeException, org.apache.commons.math3.linear.MatrixDimensionMismatchException;

	org.apache.commons.math3.linear.FieldVector<T> getRowVector(int row) throws org.apache.commons.math3.exception.OutOfRangeException;

	void setRowVector(int row, org.apache.commons.math3.linear.FieldVector<T> vector) throws org.apache.commons.math3.exception.OutOfRangeException, org.apache.commons.math3.linear.MatrixDimensionMismatchException;

	org.apache.commons.math3.linear.FieldVector<T> getColumnVector(int column) throws org.apache.commons.math3.exception.OutOfRangeException;

	void setColumnVector(int column, org.apache.commons.math3.linear.FieldVector<T> vector) throws org.apache.commons.math3.exception.OutOfRangeException, org.apache.commons.math3.linear.MatrixDimensionMismatchException;

	T[] getRow(int row) throws org.apache.commons.math3.exception.OutOfRangeException;

	void setRow(int row, T[] array) throws org.apache.commons.math3.exception.OutOfRangeException, org.apache.commons.math3.linear.MatrixDimensionMismatchException;

	T[] getColumn(int column) throws org.apache.commons.math3.exception.OutOfRangeException;

	void setColumn(int column, T[] array) throws org.apache.commons.math3.exception.OutOfRangeException, org.apache.commons.math3.linear.MatrixDimensionMismatchException;

	T getEntry(int row, int column) throws org.apache.commons.math3.exception.OutOfRangeException;

	void setEntry(int row, int column, T value) throws org.apache.commons.math3.exception.OutOfRangeException;

	void addToEntry(int row, int column, T increment) throws org.apache.commons.math3.exception.OutOfRangeException;

	void multiplyEntry(int row, int column, T factor) throws org.apache.commons.math3.exception.OutOfRangeException;

	org.apache.commons.math3.linear.FieldMatrix<T> transpose();

	T getTrace() throws org.apache.commons.math3.linear.NonSquareMatrixException;

	T[] operate(T[] v) throws org.apache.commons.math3.exception.DimensionMismatchException;

	org.apache.commons.math3.linear.FieldVector<T> operate(org.apache.commons.math3.linear.FieldVector<T> v) throws org.apache.commons.math3.exception.DimensionMismatchException;

	T[] preMultiply(T[] v) throws org.apache.commons.math3.exception.DimensionMismatchException;

	org.apache.commons.math3.linear.FieldVector<T> preMultiply(org.apache.commons.math3.linear.FieldVector<T> v) throws org.apache.commons.math3.exception.DimensionMismatchException;

	T walkInRowOrder(org.apache.commons.math3.linear.FieldMatrixChangingVisitor<T> visitor);

	T walkInRowOrder(org.apache.commons.math3.linear.FieldMatrixPreservingVisitor<T> visitor);

	T walkInRowOrder(org.apache.commons.math3.linear.FieldMatrixChangingVisitor<T> visitor, int startRow, int endRow, int startColumn, int endColumn) throws org.apache.commons.math3.exception.NumberIsTooSmallException, org.apache.commons.math3.exception.OutOfRangeException;

	T walkInRowOrder(org.apache.commons.math3.linear.FieldMatrixPreservingVisitor<T> visitor, int startRow, int endRow, int startColumn, int endColumn) throws org.apache.commons.math3.exception.NumberIsTooSmallException, org.apache.commons.math3.exception.OutOfRangeException;

	T walkInColumnOrder(org.apache.commons.math3.linear.FieldMatrixChangingVisitor<T> visitor);

	T walkInColumnOrder(org.apache.commons.math3.linear.FieldMatrixPreservingVisitor<T> visitor);

	T walkInColumnOrder(org.apache.commons.math3.linear.FieldMatrixChangingVisitor<T> visitor, int startRow, int endRow, int startColumn, int endColumn) throws org.apache.commons.math3.exception.NumberIsTooSmallException, org.apache.commons.math3.exception.OutOfRangeException;

	T walkInColumnOrder(org.apache.commons.math3.linear.FieldMatrixPreservingVisitor<T> visitor, int startRow, int endRow, int startColumn, int endColumn) throws org.apache.commons.math3.exception.NumberIsTooSmallException, org.apache.commons.math3.exception.OutOfRangeException;

	T walkInOptimizedOrder(org.apache.commons.math3.linear.FieldMatrixChangingVisitor<T> visitor);

	T walkInOptimizedOrder(org.apache.commons.math3.linear.FieldMatrixPreservingVisitor<T> visitor);

	T walkInOptimizedOrder(org.apache.commons.math3.linear.FieldMatrixChangingVisitor<T> visitor, int startRow, int endRow, int startColumn, int endColumn) throws org.apache.commons.math3.exception.NumberIsTooSmallException, org.apache.commons.math3.exception.OutOfRangeException;

	T walkInOptimizedOrder(org.apache.commons.math3.linear.FieldMatrixPreservingVisitor<T> visitor, int startRow, int endRow, int startColumn, int endColumn) throws org.apache.commons.math3.exception.NumberIsTooSmallException, org.apache.commons.math3.exception.OutOfRangeException;
}

