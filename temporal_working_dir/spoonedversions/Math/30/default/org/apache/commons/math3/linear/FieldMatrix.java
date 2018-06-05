

package org.apache.commons.math3.linear;


public interface FieldMatrix<T extends org.apache.commons.math3.FieldElement<T>> extends org.apache.commons.math3.linear.AnyMatrix {
	org.apache.commons.math3.Field<T> getField();

	org.apache.commons.math3.linear.FieldMatrix<T> createMatrix(final int rowDimension, final int columnDimension);

	org.apache.commons.math3.linear.FieldMatrix<T> copy();

	org.apache.commons.math3.linear.FieldMatrix<T> add(org.apache.commons.math3.linear.FieldMatrix<T> m);

	org.apache.commons.math3.linear.FieldMatrix<T> subtract(org.apache.commons.math3.linear.FieldMatrix<T> m);

	org.apache.commons.math3.linear.FieldMatrix<T> scalarAdd(T d);

	org.apache.commons.math3.linear.FieldMatrix<T> scalarMultiply(T d);

	org.apache.commons.math3.linear.FieldMatrix<T> multiply(org.apache.commons.math3.linear.FieldMatrix<T> m);

	org.apache.commons.math3.linear.FieldMatrix<T> preMultiply(org.apache.commons.math3.linear.FieldMatrix<T> m);

	org.apache.commons.math3.linear.FieldMatrix<T> power(final int p);

	T[][] getData();

	org.apache.commons.math3.linear.FieldMatrix<T> getSubMatrix(int startRow, int endRow, int startColumn, int endColumn);

	org.apache.commons.math3.linear.FieldMatrix<T> getSubMatrix(int[] selectedRows, int[] selectedColumns);

	void copySubMatrix(int startRow, int endRow, int startColumn, int endColumn, T[][] destination);

	void copySubMatrix(int[] selectedRows, int[] selectedColumns, T[][] destination);

	void setSubMatrix(T[][] subMatrix, int row, int column);

	org.apache.commons.math3.linear.FieldMatrix<T> getRowMatrix(int row);

	void setRowMatrix(int row, org.apache.commons.math3.linear.FieldMatrix<T> matrix);

	org.apache.commons.math3.linear.FieldMatrix<T> getColumnMatrix(int column);

	void setColumnMatrix(int column, org.apache.commons.math3.linear.FieldMatrix<T> matrix);

	org.apache.commons.math3.linear.FieldVector<T> getRowVector(int row);

	void setRowVector(int row, org.apache.commons.math3.linear.FieldVector<T> vector);

	org.apache.commons.math3.linear.FieldVector<T> getColumnVector(int column);

	void setColumnVector(int column, org.apache.commons.math3.linear.FieldVector<T> vector);

	T[] getRow(int row);

	void setRow(int row, T[] array);

	T[] getColumn(int column);

	void setColumn(int column, T[] array);

	T getEntry(int row, int column);

	void setEntry(int row, int column, T value);

	void addToEntry(int row, int column, T increment);

	void multiplyEntry(int row, int column, T factor);

	org.apache.commons.math3.linear.FieldMatrix<T> transpose();

	T getTrace();

	T[] operate(T[] v);

	org.apache.commons.math3.linear.FieldVector<T> operate(org.apache.commons.math3.linear.FieldVector<T> v);

	T[] preMultiply(T[] v);

	org.apache.commons.math3.linear.FieldVector<T> preMultiply(org.apache.commons.math3.linear.FieldVector<T> v);

	T walkInRowOrder(org.apache.commons.math3.linear.FieldMatrixChangingVisitor<T> visitor);

	T walkInRowOrder(org.apache.commons.math3.linear.FieldMatrixPreservingVisitor<T> visitor);

	T walkInRowOrder(org.apache.commons.math3.linear.FieldMatrixChangingVisitor<T> visitor, int startRow, int endRow, int startColumn, int endColumn);

	T walkInRowOrder(org.apache.commons.math3.linear.FieldMatrixPreservingVisitor<T> visitor, int startRow, int endRow, int startColumn, int endColumn);

	T walkInColumnOrder(org.apache.commons.math3.linear.FieldMatrixChangingVisitor<T> visitor);

	T walkInColumnOrder(org.apache.commons.math3.linear.FieldMatrixPreservingVisitor<T> visitor);

	T walkInColumnOrder(org.apache.commons.math3.linear.FieldMatrixChangingVisitor<T> visitor, int startRow, int endRow, int startColumn, int endColumn);

	T walkInColumnOrder(org.apache.commons.math3.linear.FieldMatrixPreservingVisitor<T> visitor, int startRow, int endRow, int startColumn, int endColumn);

	T walkInOptimizedOrder(org.apache.commons.math3.linear.FieldMatrixChangingVisitor<T> visitor);

	T walkInOptimizedOrder(org.apache.commons.math3.linear.FieldMatrixPreservingVisitor<T> visitor);

	T walkInOptimizedOrder(org.apache.commons.math3.linear.FieldMatrixChangingVisitor<T> visitor, int startRow, int endRow, int startColumn, int endColumn);

	T walkInOptimizedOrder(org.apache.commons.math3.linear.FieldMatrixPreservingVisitor<T> visitor, int startRow, int endRow, int startColumn, int endColumn);
}

