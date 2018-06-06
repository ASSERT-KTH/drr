

package org.apache.commons.math3.linear;


public interface RealMatrix extends org.apache.commons.math3.linear.AnyMatrix {
	org.apache.commons.math3.linear.RealMatrix createMatrix(int rowDimension, int columnDimension) throws org.apache.commons.math3.exception.NotStrictlyPositiveException;

	org.apache.commons.math3.linear.RealMatrix copy();

	org.apache.commons.math3.linear.RealMatrix add(org.apache.commons.math3.linear.RealMatrix m) throws org.apache.commons.math3.linear.MatrixDimensionMismatchException;

	org.apache.commons.math3.linear.RealMatrix subtract(org.apache.commons.math3.linear.RealMatrix m) throws org.apache.commons.math3.linear.MatrixDimensionMismatchException;

	org.apache.commons.math3.linear.RealMatrix scalarAdd(double d);

	org.apache.commons.math3.linear.RealMatrix scalarMultiply(double d);

	org.apache.commons.math3.linear.RealMatrix multiply(org.apache.commons.math3.linear.RealMatrix m) throws org.apache.commons.math3.exception.DimensionMismatchException;

	org.apache.commons.math3.linear.RealMatrix preMultiply(org.apache.commons.math3.linear.RealMatrix m) throws org.apache.commons.math3.exception.DimensionMismatchException;

	org.apache.commons.math3.linear.RealMatrix power(final int p) throws org.apache.commons.math3.exception.NotPositiveException, org.apache.commons.math3.linear.NonSquareMatrixException;

	double[][] getData();

	double getNorm();

	double getFrobeniusNorm();

	org.apache.commons.math3.linear.RealMatrix getSubMatrix(int startRow, int endRow, int startColumn, int endColumn) throws org.apache.commons.math3.exception.NumberIsTooSmallException, org.apache.commons.math3.exception.OutOfRangeException;

	org.apache.commons.math3.linear.RealMatrix getSubMatrix(int[] selectedRows, int[] selectedColumns) throws org.apache.commons.math3.exception.NoDataException, org.apache.commons.math3.exception.NullArgumentException, org.apache.commons.math3.exception.OutOfRangeException;

	void copySubMatrix(int startRow, int endRow, int startColumn, int endColumn, double[][] destination) throws org.apache.commons.math3.exception.NumberIsTooSmallException, org.apache.commons.math3.exception.OutOfRangeException, org.apache.commons.math3.linear.MatrixDimensionMismatchException;

	void copySubMatrix(int[] selectedRows, int[] selectedColumns, double[][] destination) throws org.apache.commons.math3.exception.NoDataException, org.apache.commons.math3.exception.NullArgumentException, org.apache.commons.math3.exception.OutOfRangeException, org.apache.commons.math3.linear.MatrixDimensionMismatchException;

	void setSubMatrix(double[][] subMatrix, int row, int column) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.NoDataException, org.apache.commons.math3.exception.NullArgumentException, org.apache.commons.math3.exception.OutOfRangeException;

	org.apache.commons.math3.linear.RealMatrix getRowMatrix(int row) throws org.apache.commons.math3.exception.OutOfRangeException;

	void setRowMatrix(int row, org.apache.commons.math3.linear.RealMatrix matrix) throws org.apache.commons.math3.exception.OutOfRangeException, org.apache.commons.math3.linear.MatrixDimensionMismatchException;

	org.apache.commons.math3.linear.RealMatrix getColumnMatrix(int column) throws org.apache.commons.math3.exception.OutOfRangeException;

	void setColumnMatrix(int column, org.apache.commons.math3.linear.RealMatrix matrix) throws org.apache.commons.math3.exception.OutOfRangeException, org.apache.commons.math3.linear.MatrixDimensionMismatchException;

	org.apache.commons.math3.linear.RealVector getRowVector(int row) throws org.apache.commons.math3.exception.OutOfRangeException;

	void setRowVector(int row, org.apache.commons.math3.linear.RealVector vector) throws org.apache.commons.math3.exception.OutOfRangeException, org.apache.commons.math3.linear.MatrixDimensionMismatchException;

	org.apache.commons.math3.linear.RealVector getColumnVector(int column) throws org.apache.commons.math3.exception.OutOfRangeException;

	void setColumnVector(int column, org.apache.commons.math3.linear.RealVector vector) throws org.apache.commons.math3.exception.OutOfRangeException, org.apache.commons.math3.linear.MatrixDimensionMismatchException;

	double[] getRow(int row) throws org.apache.commons.math3.exception.OutOfRangeException;

	void setRow(int row, double[] array) throws org.apache.commons.math3.exception.OutOfRangeException, org.apache.commons.math3.linear.MatrixDimensionMismatchException;

	double[] getColumn(int column) throws org.apache.commons.math3.exception.OutOfRangeException;

	void setColumn(int column, double[] array) throws org.apache.commons.math3.exception.OutOfRangeException, org.apache.commons.math3.linear.MatrixDimensionMismatchException;

	double getEntry(int row, int column) throws org.apache.commons.math3.exception.OutOfRangeException;

	void setEntry(int row, int column, double value) throws org.apache.commons.math3.exception.OutOfRangeException;

	void addToEntry(int row, int column, double increment) throws org.apache.commons.math3.exception.OutOfRangeException;

	void multiplyEntry(int row, int column, double factor) throws org.apache.commons.math3.exception.OutOfRangeException;

	org.apache.commons.math3.linear.RealMatrix transpose();

	double getTrace() throws org.apache.commons.math3.linear.NonSquareMatrixException;

	double[] operate(double[] v) throws org.apache.commons.math3.exception.DimensionMismatchException;

	org.apache.commons.math3.linear.RealVector operate(org.apache.commons.math3.linear.RealVector v) throws org.apache.commons.math3.exception.DimensionMismatchException;

	double[] preMultiply(double[] v) throws org.apache.commons.math3.exception.DimensionMismatchException;

	org.apache.commons.math3.linear.RealVector preMultiply(org.apache.commons.math3.linear.RealVector v) throws org.apache.commons.math3.exception.DimensionMismatchException;

	double walkInRowOrder(org.apache.commons.math3.linear.RealMatrixChangingVisitor visitor);

	double walkInRowOrder(org.apache.commons.math3.linear.RealMatrixPreservingVisitor visitor);

	double walkInRowOrder(org.apache.commons.math3.linear.RealMatrixChangingVisitor visitor, int startRow, int endRow, int startColumn, int endColumn) throws org.apache.commons.math3.exception.NumberIsTooSmallException, org.apache.commons.math3.exception.OutOfRangeException;

	double walkInRowOrder(org.apache.commons.math3.linear.RealMatrixPreservingVisitor visitor, int startRow, int endRow, int startColumn, int endColumn) throws org.apache.commons.math3.exception.NumberIsTooSmallException, org.apache.commons.math3.exception.OutOfRangeException;

	double walkInColumnOrder(org.apache.commons.math3.linear.RealMatrixChangingVisitor visitor);

	double walkInColumnOrder(org.apache.commons.math3.linear.RealMatrixPreservingVisitor visitor);

	double walkInColumnOrder(org.apache.commons.math3.linear.RealMatrixChangingVisitor visitor, int startRow, int endRow, int startColumn, int endColumn) throws org.apache.commons.math3.exception.NumberIsTooSmallException, org.apache.commons.math3.exception.OutOfRangeException;

	double walkInColumnOrder(org.apache.commons.math3.linear.RealMatrixPreservingVisitor visitor, int startRow, int endRow, int startColumn, int endColumn) throws org.apache.commons.math3.exception.NumberIsTooSmallException, org.apache.commons.math3.exception.OutOfRangeException;

	double walkInOptimizedOrder(org.apache.commons.math3.linear.RealMatrixChangingVisitor visitor);

	double walkInOptimizedOrder(org.apache.commons.math3.linear.RealMatrixPreservingVisitor visitor);

	double walkInOptimizedOrder(org.apache.commons.math3.linear.RealMatrixChangingVisitor visitor, int startRow, int endRow, int startColumn, int endColumn) throws org.apache.commons.math3.exception.NumberIsTooSmallException, org.apache.commons.math3.exception.OutOfRangeException;

	double walkInOptimizedOrder(org.apache.commons.math3.linear.RealMatrixPreservingVisitor visitor, int startRow, int endRow, int startColumn, int endColumn) throws org.apache.commons.math3.exception.NumberIsTooSmallException, org.apache.commons.math3.exception.OutOfRangeException;
}

