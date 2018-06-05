

package org.apache.commons.math3.linear;


public interface RealMatrix extends org.apache.commons.math3.linear.AnyMatrix {
	org.apache.commons.math3.linear.RealMatrix createMatrix(final int rowDimension, final int columnDimension);

	org.apache.commons.math3.linear.RealMatrix copy();

	org.apache.commons.math3.linear.RealMatrix add(org.apache.commons.math3.linear.RealMatrix m);

	org.apache.commons.math3.linear.RealMatrix subtract(org.apache.commons.math3.linear.RealMatrix m);

	org.apache.commons.math3.linear.RealMatrix scalarAdd(double d);

	org.apache.commons.math3.linear.RealMatrix scalarMultiply(double d);

	org.apache.commons.math3.linear.RealMatrix multiply(org.apache.commons.math3.linear.RealMatrix m);

	org.apache.commons.math3.linear.RealMatrix preMultiply(org.apache.commons.math3.linear.RealMatrix m);

	org.apache.commons.math3.linear.RealMatrix power(final int p);

	double[][] getData();

	double getNorm();

	double getFrobeniusNorm();

	org.apache.commons.math3.linear.RealMatrix getSubMatrix(int startRow, int endRow, int startColumn, int endColumn);

	org.apache.commons.math3.linear.RealMatrix getSubMatrix(int[] selectedRows, int[] selectedColumns);

	void copySubMatrix(int startRow, int endRow, int startColumn, int endColumn, double[][] destination);

	void copySubMatrix(int[] selectedRows, int[] selectedColumns, double[][] destination);

	void setSubMatrix(double[][] subMatrix, int row, int column) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.NullArgumentException, org.apache.commons.math3.exception.OutOfRangeException, org.apache.commons.math3.exception.ZeroException;

	org.apache.commons.math3.linear.RealMatrix getRowMatrix(int row);

	void setRowMatrix(int row, org.apache.commons.math3.linear.RealMatrix matrix);

	org.apache.commons.math3.linear.RealMatrix getColumnMatrix(int column);

	void setColumnMatrix(int column, org.apache.commons.math3.linear.RealMatrix matrix);

	org.apache.commons.math3.linear.RealVector getRowVector(int row);

	void setRowVector(int row, org.apache.commons.math3.linear.RealVector vector);

	org.apache.commons.math3.linear.RealVector getColumnVector(int column);

	void setColumnVector(int column, org.apache.commons.math3.linear.RealVector vector);

	double[] getRow(int row);

	void setRow(int row, double[] array);

	double[] getColumn(int column);

	void setColumn(int column, double[] array);

	double getEntry(int row, int column);

	void setEntry(int row, int column, double value);

	void addToEntry(int row, int column, double increment);

	void multiplyEntry(int row, int column, double factor);

	org.apache.commons.math3.linear.RealMatrix transpose();

	double getTrace();

	double[] operate(double[] v);

	org.apache.commons.math3.linear.RealVector operate(org.apache.commons.math3.linear.RealVector v);

	double[] preMultiply(double[] v);

	org.apache.commons.math3.linear.RealVector preMultiply(org.apache.commons.math3.linear.RealVector v);

	double walkInRowOrder(org.apache.commons.math3.linear.RealMatrixChangingVisitor visitor);

	double walkInRowOrder(org.apache.commons.math3.linear.RealMatrixPreservingVisitor visitor);

	double walkInRowOrder(org.apache.commons.math3.linear.RealMatrixChangingVisitor visitor, int startRow, int endRow, int startColumn, int endColumn);

	double walkInRowOrder(org.apache.commons.math3.linear.RealMatrixPreservingVisitor visitor, int startRow, int endRow, int startColumn, int endColumn);

	double walkInColumnOrder(org.apache.commons.math3.linear.RealMatrixChangingVisitor visitor);

	double walkInColumnOrder(org.apache.commons.math3.linear.RealMatrixPreservingVisitor visitor);

	double walkInColumnOrder(org.apache.commons.math3.linear.RealMatrixChangingVisitor visitor, int startRow, int endRow, int startColumn, int endColumn);

	double walkInColumnOrder(org.apache.commons.math3.linear.RealMatrixPreservingVisitor visitor, int startRow, int endRow, int startColumn, int endColumn);

	double walkInOptimizedOrder(org.apache.commons.math3.linear.RealMatrixChangingVisitor visitor);

	double walkInOptimizedOrder(org.apache.commons.math3.linear.RealMatrixPreservingVisitor visitor);

	double walkInOptimizedOrder(org.apache.commons.math3.linear.RealMatrixChangingVisitor visitor, int startRow, int endRow, int startColumn, int endColumn);

	double walkInOptimizedOrder(org.apache.commons.math3.linear.RealMatrixPreservingVisitor visitor, int startRow, int endRow, int startColumn, int endColumn);
}

