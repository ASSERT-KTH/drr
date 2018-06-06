

package org.apache.commons.math.linear;


public interface RealMatrix extends org.apache.commons.math.linear.AnyMatrix {
	org.apache.commons.math.linear.RealMatrix createMatrix(final int rowDimension, final int columnDimension);

	org.apache.commons.math.linear.RealMatrix copy();

	org.apache.commons.math.linear.RealMatrix add(org.apache.commons.math.linear.RealMatrix m);

	org.apache.commons.math.linear.RealMatrix subtract(org.apache.commons.math.linear.RealMatrix m);

	org.apache.commons.math.linear.RealMatrix scalarAdd(double d);

	org.apache.commons.math.linear.RealMatrix scalarMultiply(double d);

	org.apache.commons.math.linear.RealMatrix multiply(org.apache.commons.math.linear.RealMatrix m);

	org.apache.commons.math.linear.RealMatrix preMultiply(org.apache.commons.math.linear.RealMatrix m);

	double[][] getData();

	double getNorm();

	double getFrobeniusNorm();

	org.apache.commons.math.linear.RealMatrix getSubMatrix(int startRow, int endRow, int startColumn, int endColumn);

	org.apache.commons.math.linear.RealMatrix getSubMatrix(int[] selectedRows, int[] selectedColumns);

	void copySubMatrix(int startRow, int endRow, int startColumn, int endColumn, double[][] destination);

	void copySubMatrix(int[] selectedRows, int[] selectedColumns, double[][] destination);

	void setSubMatrix(double[][] subMatrix, int row, int column);

	org.apache.commons.math.linear.RealMatrix getRowMatrix(int row);

	void setRowMatrix(int row, org.apache.commons.math.linear.RealMatrix matrix);

	org.apache.commons.math.linear.RealMatrix getColumnMatrix(int column);

	void setColumnMatrix(int column, org.apache.commons.math.linear.RealMatrix matrix);

	org.apache.commons.math.linear.RealVector getRowVector(int row);

	void setRowVector(int row, org.apache.commons.math.linear.RealVector vector);

	org.apache.commons.math.linear.RealVector getColumnVector(int column);

	void setColumnVector(int column, org.apache.commons.math.linear.RealVector vector);

	double[] getRow(int row);

	void setRow(int row, double[] array);

	double[] getColumn(int column);

	void setColumn(int column, double[] array);

	double getEntry(int row, int column);

	void setEntry(int row, int column, double value);

	void addToEntry(int row, int column, double increment);

	void multiplyEntry(int row, int column, double factor);

	org.apache.commons.math.linear.RealMatrix transpose();

	@java.lang.Deprecated
	org.apache.commons.math.linear.RealMatrix inverse();

	@java.lang.Deprecated
	double getDeterminant();

	@java.lang.Deprecated
	boolean isSingular();

	double getTrace();

	double[] operate(double[] v);

	org.apache.commons.math.linear.RealVector operate(org.apache.commons.math.linear.RealVector v);

	double[] preMultiply(double[] v);

	org.apache.commons.math.linear.RealVector preMultiply(org.apache.commons.math.linear.RealVector v);

	double walkInRowOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor visitor);

	double walkInRowOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor visitor);

	double walkInRowOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor visitor, int startRow, int endRow, int startColumn, int endColumn);

	double walkInRowOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor visitor, int startRow, int endRow, int startColumn, int endColumn);

	double walkInColumnOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor visitor);

	double walkInColumnOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor visitor);

	double walkInColumnOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor visitor, int startRow, int endRow, int startColumn, int endColumn);

	double walkInColumnOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor visitor, int startRow, int endRow, int startColumn, int endColumn);

	double walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor visitor);

	double walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor visitor);

	double walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor visitor, int startRow, int endRow, int startColumn, int endColumn);

	double walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor visitor, int startRow, int endRow, int startColumn, int endColumn);

	@java.lang.Deprecated
	double[] solve(double[] b);

	@java.lang.Deprecated
	org.apache.commons.math.linear.RealMatrix solve(org.apache.commons.math.linear.RealMatrix b);
}

