

package org.apache.commons.math.linear;


public class MatrixUtils {
	public MatrixUtils() {
		super();
	}

	public static org.apache.commons.math.linear.RealMatrix createRealMatrix(final int rows, final int columns) {
		return new org.apache.commons.math.linear.DenseRealMatrix(rows, columns);
	}

	public static org.apache.commons.math.linear.RealMatrix createRealMatrix(double[][] data) {
		return new org.apache.commons.math.linear.DenseRealMatrix(data);
	}

	public static org.apache.commons.math.linear.RealMatrix createRealIdentityMatrix(int dimension) {
		final org.apache.commons.math.linear.RealMatrix m = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(dimension, dimension);
		for (int i = 0; i < dimension; ++i) {
			m.setEntry(i, i, 1.0);
		}
		return m;
	}

	public static org.apache.commons.math.linear.RealMatrix createRealDiagonalMatrix(final double[] diagonal) {
		final org.apache.commons.math.linear.RealMatrix m = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(diagonal.length, diagonal.length);
		for (int i = 0; i < (diagonal.length); ++i) {
			m.setEntry(i, i, diagonal[i]);
		}
		return m;
	}

	public static org.apache.commons.math.linear.BigMatrix createBigMatrix(double[][] data) {
		return new org.apache.commons.math.linear.BigMatrixImpl(data);
	}

	public static org.apache.commons.math.linear.BigMatrix createBigMatrix(java.math.BigDecimal[][] data) {
		return new org.apache.commons.math.linear.BigMatrixImpl(data);
	}

	public static org.apache.commons.math.linear.BigMatrix createBigMatrix(java.math.BigDecimal[][] data, boolean copyArray) {
		return new org.apache.commons.math.linear.BigMatrixImpl(data, copyArray);
	}

	public static org.apache.commons.math.linear.BigMatrix createBigMatrix(java.lang.String[][] data) {
		return new org.apache.commons.math.linear.BigMatrixImpl(data);
	}

	public static org.apache.commons.math.linear.RealVector createRealVector(double[] data) {
		return new org.apache.commons.math.linear.RealVectorImpl(data, true);
	}

	public static org.apache.commons.math.linear.RealMatrix createRowRealMatrix(double[] rowData) {
		final int nCols = rowData.length;
		final org.apache.commons.math.linear.RealMatrix m = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(1, nCols);
		for (int i = 0; i < nCols; ++i) {
			m.setEntry(0, i, rowData[i]);
		}
		return m;
	}

	public static org.apache.commons.math.linear.BigMatrix createRowBigMatrix(double[] rowData) {
		final int nCols = rowData.length;
		final java.math.BigDecimal[][] data = new java.math.BigDecimal[1][nCols];
		for (int i = 0; i < nCols; ++i) {
			data[0][i] = new java.math.BigDecimal(rowData[i]);
		}
		return new org.apache.commons.math.linear.BigMatrixImpl(data, false);
	}

	public static org.apache.commons.math.linear.BigMatrix createRowBigMatrix(java.math.BigDecimal[] rowData) {
		final int nCols = rowData.length;
		final java.math.BigDecimal[][] data = new java.math.BigDecimal[1][nCols];
		java.lang.System.arraycopy(rowData, 0, data[0], 0, nCols);
		return new org.apache.commons.math.linear.BigMatrixImpl(data, false);
	}

	public static org.apache.commons.math.linear.BigMatrix createRowBigMatrix(java.lang.String[] rowData) {
		final int nCols = rowData.length;
		final java.math.BigDecimal[][] data = new java.math.BigDecimal[1][nCols];
		for (int i = 0; i < nCols; ++i) {
			data[0][i] = new java.math.BigDecimal(rowData[i]);
		}
		return new org.apache.commons.math.linear.BigMatrixImpl(data, false);
	}

	public static org.apache.commons.math.linear.RealMatrix createColumnRealMatrix(double[] columnData) {
		final int nRows = columnData.length;
		final org.apache.commons.math.linear.RealMatrix m = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(nRows, 1);
		for (int i = 0; i < nRows; ++i) {
			m.setEntry(i, 0, columnData[i]);
		}
		return m;
	}

	public static org.apache.commons.math.linear.BigMatrix createColumnBigMatrix(double[] columnData) {
		final int nRows = columnData.length;
		final java.math.BigDecimal[][] data = new java.math.BigDecimal[nRows][1];
		for (int row = 0; row < nRows; row++) {
			data[row][0] = new java.math.BigDecimal(columnData[row]);
		}
		return new org.apache.commons.math.linear.BigMatrixImpl(data, false);
	}

	public static org.apache.commons.math.linear.BigMatrix createColumnBigMatrix(java.math.BigDecimal[] columnData) {
		final int nRows = columnData.length;
		final java.math.BigDecimal[][] data = new java.math.BigDecimal[nRows][1];
		for (int row = 0; row < nRows; row++) {
			data[row][0] = columnData[row];
		}
		return new org.apache.commons.math.linear.BigMatrixImpl(data, false);
	}

	public static org.apache.commons.math.linear.BigMatrix createColumnBigMatrix(java.lang.String[] columnData) {
		int nRows = columnData.length;
		final java.math.BigDecimal[][] data = new java.math.BigDecimal[nRows][1];
		for (int row = 0; row < nRows; row++) {
			data[row][0] = new java.math.BigDecimal(columnData[row]);
		}
		return new org.apache.commons.math.linear.BigMatrixImpl(data, false);
	}

	public static org.apache.commons.math.linear.BigMatrix createBigIdentityMatrix(int dimension) {
		final java.math.BigDecimal[][] d = new java.math.BigDecimal[dimension][dimension];
		for (int row = 0; row < dimension; row++) {
			final java.math.BigDecimal[] dRow = d[row];
			java.util.Arrays.fill(dRow, org.apache.commons.math.linear.BigMatrixImpl.ZERO);
			dRow[row] = org.apache.commons.math.linear.BigMatrixImpl.ONE;
		}
		return new org.apache.commons.math.linear.BigMatrixImpl(d, false);
	}
}

