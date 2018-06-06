

package org.apache.commons.math.linear;


public class LUDecompositionImpl implements org.apache.commons.math.linear.LUDecomposition {
	private static final long serialVersionUID = -1606789599960880183L;

	private final double singularityThreshold;

	private final int m;

	private final double[][] lu;

	private final int[] pivot;

	private int parity;

	private boolean singular;

	private org.apache.commons.math.linear.RealMatrix cachedL;

	private org.apache.commons.math.linear.RealMatrix cachedU;

	private org.apache.commons.math.linear.RealMatrix cachedP;

	private static final double DEFAULT_TOO_SMALL = 1.0E-11;

	public LUDecompositionImpl(org.apache.commons.math.linear.RealMatrix matrix) throws org.apache.commons.math.linear.InvalidMatrixException {
		this(matrix, org.apache.commons.math.linear.LUDecompositionImpl.DEFAULT_TOO_SMALL);
	}

	public LUDecompositionImpl(org.apache.commons.math.linear.RealMatrix matrix, double singularityThreshold) throws org.apache.commons.math.linear.InvalidMatrixException {
		if (!(matrix.isSquare())) {
			throw new org.apache.commons.math.linear.InvalidMatrixException("LU decomposition requires that the matrix be square.");
		}
		this.singularityThreshold = singularityThreshold;
		m = matrix.getColumnDimension();
		lu = matrix.getData();
		pivot = new int[m];
		cachedL = null;
		cachedU = null;
		cachedP = null;
		luDecompose();
	}

	public org.apache.commons.math.linear.RealMatrix getL() {
		if (((cachedL) == null) && (!(singular))) {
			final double[][] lData = new double[m][m];
			for (int i = 0; i < (m); ++i) {
				java.lang.System.arraycopy(lu[i], 0, lData[i], 0, i);
				lData[i][i] = 1.0;
			}
			cachedL = new org.apache.commons.math.linear.RealMatrixImpl(lData, false);
		}
		return cachedL;
	}

	public org.apache.commons.math.linear.RealMatrix getU() {
		if (((cachedU) == null) && (!(singular))) {
			final double[][] uData = new double[m][m];
			for (int i = 0; i < (m); ++i) {
				java.lang.System.arraycopy(lu[i], i, uData[i], i, ((m) - i));
			}
			cachedU = new org.apache.commons.math.linear.RealMatrixImpl(uData, false);
		}
		return cachedU;
	}

	public org.apache.commons.math.linear.RealMatrix getP() {
		if (((cachedP) == null) && (!(singular))) {
			final double[][] pData = new double[m][m];
			for (int i = 0; i < (m); ++i) {
				pData[i][pivot[i]] = 1.0;
			}
			cachedP = new org.apache.commons.math.linear.RealMatrixImpl(pData, false);
		}
		return cachedP;
	}

	public int[] getPivot() {
		return pivot.clone();
	}

	public boolean isNonSingular() {
		return !(singular);
	}

	public double getDeterminant() {
		if (singular) {
			return 0;
		}else {
			double determinant = parity;
			for (int i = 0; i < (m); i++) {
				determinant *= lu[i][i];
			}
			return determinant;
		}
	}

	public double[] solve(double[] b) throws java.lang.IllegalArgumentException, org.apache.commons.math.linear.InvalidMatrixException {
		if ((b.length) != (m)) {
			throw new java.lang.IllegalArgumentException("constant vector has wrong length");
		}
		if (singular) {
			throw new org.apache.commons.math.linear.InvalidMatrixException("Matrix is singular.");
		}
		final double[] bp = new double[m];
		for (int row = 0; row < (m); row++) {
			bp[row] = b[pivot[row]];
		}
		for (int col = 0; col < (m); col++) {
			for (int i = col + 1; i < (m); i++) {
				bp[i] -= (bp[col]) * (lu[i][col]);
			}
		}
		for (int col = (m) - 1; col >= 0; col--) {
			bp[col] /= lu[col][col];
			for (int i = 0; i < col; i++) {
				bp[i] -= (bp[col]) * (lu[i][col]);
			}
		}
		return bp;
	}

	public org.apache.commons.math.linear.RealVector solve(org.apache.commons.math.linear.RealVector b) throws java.lang.IllegalArgumentException, org.apache.commons.math.linear.InvalidMatrixException {
		try {
			return solve(((org.apache.commons.math.linear.RealVectorImpl) (b)));
		} catch (java.lang.ClassCastException cce) {
			if ((b.getDimension()) != (m)) {
				throw new java.lang.IllegalArgumentException("constant vector has wrong length");
			}
			if (singular) {
				throw new org.apache.commons.math.linear.InvalidMatrixException("Matrix is singular.");
			}
			final double[] bp = new double[m];
			for (int row = 0; row < (m); row++) {
				bp[row] = b.getEntry(pivot[row]);
			}
			for (int col = 0; col < (m); col++) {
				for (int i = col + 1; i < (m); i++) {
					bp[i] -= (bp[col]) * (lu[i][col]);
				}
			}
			for (int col = (m) - 1; col >= 0; col--) {
				bp[col] /= lu[col][col];
				for (int i = 0; i < col; i++) {
					bp[i] -= (bp[col]) * (lu[i][col]);
				}
			}
			return new org.apache.commons.math.linear.RealVectorImpl(bp, false);
		}
	}

	public org.apache.commons.math.linear.RealVectorImpl solve(org.apache.commons.math.linear.RealVectorImpl b) throws java.lang.IllegalArgumentException, org.apache.commons.math.linear.InvalidMatrixException {
		return new org.apache.commons.math.linear.RealVectorImpl(solve(b.getDataRef()), false);
	}

	public org.apache.commons.math.linear.RealMatrix solve(org.apache.commons.math.linear.RealMatrix b) throws java.lang.IllegalArgumentException, org.apache.commons.math.linear.InvalidMatrixException {
		if ((b.getRowDimension()) != (m)) {
			throw new java.lang.IllegalArgumentException("Incorrect row dimension");
		}
		if (singular) {
			throw new org.apache.commons.math.linear.InvalidMatrixException("Matrix is singular.");
		}
		final int nColB = b.getColumnDimension();
		final double[][] bp = new double[m][nColB];
		for (int row = 0; row < (m); row++) {
			final double[] bpRow = bp[row];
			final int pRow = pivot[row];
			for (int col = 0; col < nColB; col++) {
				bpRow[col] = b.getEntry(pRow, col);
			}
		}
		for (int col = 0; col < (m); col++) {
			final double[] bpCol = bp[col];
			for (int i = col + 1; i < (m); i++) {
				final double[] bpI = bp[i];
				final double luICol = lu[i][col];
				for (int j = 0; j < nColB; j++) {
					bpI[j] -= (bpCol[j]) * luICol;
				}
			}
		}
		for (int col = (m) - 1; col >= 0; col--) {
			final double[] bpCol = bp[col];
			final double luDiag = lu[col][col];
			for (int j = 0; j < nColB; j++) {
				bpCol[j] /= luDiag;
			}
			for (int i = 0; i < col; i++) {
				final double[] bpI = bp[i];
				final double luICol = lu[i][col];
				for (int j = 0; j < nColB; j++) {
					bpI[j] -= (bpCol[j]) * luICol;
				}
			}
		}
		return new org.apache.commons.math.linear.RealMatrixImpl(bp, false);
	}

	private void luDecompose() {
		for (int row = 0; row < (m); row++) {
			pivot[row] = row;
		}
		parity = 1;
		singular = false;
		for (int col = 0; col < (m); col++) {
			double sum = 0;
			for (int row = 0; row < col; row++) {
				final double[] luRow = lu[row];
				sum = luRow[col];
				for (int i = 0; i < row; i++) {
					sum -= (luRow[i]) * (lu[i][col]);
				}
				luRow[col] = sum;
			}
			int max = col;
			double largest = java.lang.Double.NEGATIVE_INFINITY;
			for (int row = col; row < (m); row++) {
				final double[] luRow = lu[row];
				sum = luRow[col];
				for (int i = 0; i < col; i++) {
					sum -= (luRow[i]) * (lu[i][col]);
				}
				luRow[col] = sum;
				if ((java.lang.Math.abs(sum)) > largest) {
					largest = java.lang.Math.abs(sum);
					max = row;
				}
			}
			if ((java.lang.Math.abs(lu[max][col])) < (singularityThreshold)) {
				singular = true;
				return ;
			}
			if (max != col) {
				double tmp = 0;
				for (int i = 0; i < (m); i++) {
					tmp = lu[max][i];
					lu[max][i] = lu[col][i];
					lu[col][i] = tmp;
				}
				int temp = pivot[max];
				pivot[max] = pivot[col];
				pivot[col] = temp;
				parity = -(parity);
			}
			final double luDiag = lu[col][col];
			for (int row = col + 1; row < (m); row++) {
				lu[row][col] /= luDiag;
			}
		}
	}
}

