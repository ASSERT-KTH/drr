

package org.apache.commons.math.linear;


public interface RealMatrix {
	org.apache.commons.math.linear.RealMatrix copy();

	org.apache.commons.math.linear.RealMatrix add(org.apache.commons.math.linear.RealMatrix m) throws java.lang.IllegalArgumentException;

	org.apache.commons.math.linear.RealMatrix subtract(org.apache.commons.math.linear.RealMatrix m) throws java.lang.IllegalArgumentException;

	org.apache.commons.math.linear.RealMatrix scalarAdd(double d);

	org.apache.commons.math.linear.RealMatrix scalarMultiply(double d);

	org.apache.commons.math.linear.RealMatrix multiply(org.apache.commons.math.linear.RealMatrix m) throws java.lang.IllegalArgumentException;

	public org.apache.commons.math.linear.RealMatrix preMultiply(org.apache.commons.math.linear.RealMatrix m) throws java.lang.IllegalArgumentException;

	double[][] getData();

	double getNorm();

	org.apache.commons.math.linear.RealMatrix getSubMatrix(int startRow, int endRow, int startColumn, int endColumn) throws org.apache.commons.math.linear.MatrixIndexException;

	org.apache.commons.math.linear.RealMatrix getSubMatrix(int[] selectedRows, int[] selectedColumns) throws org.apache.commons.math.linear.MatrixIndexException;

	org.apache.commons.math.linear.RealMatrix getRowMatrix(int row) throws org.apache.commons.math.linear.MatrixIndexException;

	org.apache.commons.math.linear.RealMatrix getColumnMatrix(int column) throws org.apache.commons.math.linear.MatrixIndexException;

	org.apache.commons.math.linear.RealVector getRowVector(int row) throws org.apache.commons.math.linear.MatrixIndexException;

	org.apache.commons.math.linear.RealVector getColumnVector(int column) throws org.apache.commons.math.linear.MatrixIndexException;

	double[] getRow(int row) throws org.apache.commons.math.linear.MatrixIndexException;

	double[] getColumn(int col) throws org.apache.commons.math.linear.MatrixIndexException;

	double getEntry(int row, int column) throws org.apache.commons.math.linear.MatrixIndexException;

	org.apache.commons.math.linear.RealMatrix transpose();

	org.apache.commons.math.linear.RealMatrix inverse() throws org.apache.commons.math.linear.InvalidMatrixException;

	double getDeterminant();

	boolean isSquare();

	boolean isSingular();

	int getRowDimension();

	int getColumnDimension();

	double getTrace();

	double[] operate(double[] v) throws java.lang.IllegalArgumentException;

	org.apache.commons.math.linear.RealVector operate(org.apache.commons.math.linear.RealVector v) throws java.lang.IllegalArgumentException;

	double[] preMultiply(double[] v) throws java.lang.IllegalArgumentException;

	org.apache.commons.math.linear.RealVector preMultiply(org.apache.commons.math.linear.RealVector v) throws java.lang.IllegalArgumentException;

	double[] solve(double[] b) throws java.lang.IllegalArgumentException, org.apache.commons.math.linear.InvalidMatrixException;

	org.apache.commons.math.linear.RealVector solve(org.apache.commons.math.linear.RealVector b) throws java.lang.IllegalArgumentException, org.apache.commons.math.linear.InvalidMatrixException;

	org.apache.commons.math.linear.RealMatrix solve(org.apache.commons.math.linear.RealMatrix b) throws java.lang.IllegalArgumentException, org.apache.commons.math.linear.InvalidMatrixException;
}

