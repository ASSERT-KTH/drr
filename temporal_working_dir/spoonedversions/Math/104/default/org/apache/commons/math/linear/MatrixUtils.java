

package org.apache.commons.math.linear;


public class MatrixUtils {
	public MatrixUtils() {
		super();
	}

	public static org.apache.commons.math.linear.RealMatrix createRealMatrix(double[][] data) {
		return new org.apache.commons.math.linear.RealMatrixImpl(data);
	}

	public static org.apache.commons.math.linear.RealMatrix createRealIdentityMatrix(int dimension) {
		org.apache.commons.math.linear.RealMatrixImpl out = new org.apache.commons.math.linear.RealMatrixImpl(dimension, dimension);
		double[][] d = out.getDataRef();
		for (int row = 0; row < dimension; row++) {
			for (int col = 0; col < dimension; col++) {
				d[row][col] = (row == col) ? 1.0 : 0.0;
			}
		}
		return out;
	}

	public static org.apache.commons.math.linear.BigMatrix createBigMatrix(double[][] data) {
		return new org.apache.commons.math.linear.BigMatrixImpl(data);
	}

	public static org.apache.commons.math.linear.BigMatrix createBigMatrix(java.math.BigDecimal[][] data) {
		return new org.apache.commons.math.linear.BigMatrixImpl(data);
	}

	public static org.apache.commons.math.linear.BigMatrix createBigMatrix(java.lang.String[][] data) {
		return new org.apache.commons.math.linear.BigMatrixImpl(data);
	}

	public static org.apache.commons.math.linear.RealMatrix createRowRealMatrix(double[] rowData) {
		int nCols = rowData.length;
		double[][] data = new double[1][nCols];
		java.lang.System.arraycopy(rowData, 0, data[0], 0, nCols);
		return new org.apache.commons.math.linear.RealMatrixImpl(data);
	}

	public static org.apache.commons.math.linear.BigMatrix createRowBigMatrix(double[] rowData) {
		int nCols = rowData.length;
		double[][] data = new double[1][nCols];
		java.lang.System.arraycopy(rowData, 0, data[0], 0, nCols);
		return new org.apache.commons.math.linear.BigMatrixImpl(data);
	}

	public static org.apache.commons.math.linear.BigMatrix createRowBigMatrix(java.math.BigDecimal[] rowData) {
		int nCols = rowData.length;
		java.math.BigDecimal[][] data = new java.math.BigDecimal[1][nCols];
		java.lang.System.arraycopy(rowData, 0, data[0], 0, nCols);
		return new org.apache.commons.math.linear.BigMatrixImpl(data);
	}

	public static org.apache.commons.math.linear.BigMatrix createRowBigMatrix(java.lang.String[] rowData) {
		int nCols = rowData.length;
		java.lang.String[][] data = new java.lang.String[1][nCols];
		java.lang.System.arraycopy(rowData, 0, data[0], 0, nCols);
		return new org.apache.commons.math.linear.BigMatrixImpl(data);
	}

	public static org.apache.commons.math.linear.RealMatrix createColumnRealMatrix(double[] columnData) {
		int nRows = columnData.length;
		double[][] data = new double[nRows][1];
		for (int row = 0; row < nRows; row++) {
			data[row][0] = columnData[row];
		}
		return new org.apache.commons.math.linear.RealMatrixImpl(data);
	}

	public static org.apache.commons.math.linear.BigMatrix createColumnBigMatrix(double[] columnData) {
		int nRows = columnData.length;
		double[][] data = new double[nRows][1];
		for (int row = 0; row < nRows; row++) {
			data[row][0] = columnData[row];
		}
		return new org.apache.commons.math.linear.BigMatrixImpl(data);
	}

	public static org.apache.commons.math.linear.BigMatrix createColumnBigMatrix(java.math.BigDecimal[] columnData) {
		int nRows = columnData.length;
		java.math.BigDecimal[][] data = new java.math.BigDecimal[nRows][1];
		for (int row = 0; row < nRows; row++) {
			data[row][0] = columnData[row];
		}
		return new org.apache.commons.math.linear.BigMatrixImpl(data);
	}

	public static org.apache.commons.math.linear.BigMatrix createColumnBigMatrix(java.lang.String[] columnData) {
		int nRows = columnData.length;
		java.lang.String[][] data = new java.lang.String[nRows][1];
		for (int row = 0; row < nRows; row++) {
			data[row][0] = columnData[row];
		}
		return new org.apache.commons.math.linear.BigMatrixImpl(data);
	}

	public static org.apache.commons.math.linear.BigMatrix createBigIdentityMatrix(int dimension) {
		org.apache.commons.math.linear.BigMatrixImpl out = new org.apache.commons.math.linear.BigMatrixImpl(dimension, dimension);
		java.math.BigDecimal[][] d = out.getDataRef();
		for (int row = 0; row < dimension; row++) {
			for (int col = 0; col < dimension; col++) {
				d[row][col] = (row == col) ? org.apache.commons.math.linear.BigMatrixImpl.ONE : org.apache.commons.math.linear.BigMatrixImpl.ZERO;
			}
		}
		return out;
	}
}

