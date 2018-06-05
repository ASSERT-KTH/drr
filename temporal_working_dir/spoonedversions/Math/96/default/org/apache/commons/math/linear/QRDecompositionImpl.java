

package org.apache.commons.math.linear;


public class QRDecompositionImpl implements org.apache.commons.math.linear.QRDecomposition {
	private static final long serialVersionUID = 3965943878043764074L;

	private final double[][] qr;

	private final double[] rDiag;

	private org.apache.commons.math.linear.RealMatrix cachedQ;

	private org.apache.commons.math.linear.RealMatrix cachedR;

	private org.apache.commons.math.linear.RealMatrix cachedH;

	private final int m;

	private final int n;

	public QRDecompositionImpl(org.apache.commons.math.linear.RealMatrix matrix) {
		m = matrix.getRowDimension();
		n = matrix.getColumnDimension();
		qr = matrix.getData();
		rDiag = new double[n];
		cachedQ = null;
		cachedR = null;
		cachedH = null;
		for (int minor = 0; minor < (java.lang.Math.min(m, n)); minor++) {
			double xNormSqr = 0;
			for (int row = minor; row < (m); row++) {
				final double c = qr[row][minor];
				xNormSqr += c * c;
			}
			final double a = (qr[minor][minor]) > 0 ? -(java.lang.Math.sqrt(xNormSqr)) : java.lang.Math.sqrt(xNormSqr);
			rDiag[minor] = a;
			if (a != 0.0) {
				qr[minor][minor] -= a;
				for (int col = minor + 1; col < (n); col++) {
					double alpha = 0;
					for (int row = minor; row < (m); row++) {
						final double[] qrRow = qr[row];
						alpha -= (qrRow[col]) * (qrRow[minor]);
					}
					alpha /= a * (qr[minor][minor]);
					for (int row = minor; row < (m); row++) {
						final double[] qrRow = qr[row];
						qrRow[col] -= alpha * (qrRow[minor]);
					}
				}
			}
		}
	}

	public org.apache.commons.math.linear.RealMatrix getR() {
		if ((cachedR) == null) {
			double[][] r = new double[m][n];
			for (int row = (java.lang.Math.min(m, n)) - 1; row >= 0; row--) {
				final double[] rRow = r[row];
				rRow[row] = rDiag[row];
				java.lang.System.arraycopy(qr[row], (row + 1), rRow, (row + 1), (((n) - row) - 1));
			}
			cachedR = new org.apache.commons.math.linear.RealMatrixImpl(r, false);
		}
		return cachedR;
	}

	public org.apache.commons.math.linear.RealMatrix getQ() {
		if ((cachedQ) == null) {
			double[][] Q = new double[m][m];
			for (int minor = (m) - 1; minor >= (java.lang.Math.min(m, n)); minor--) {
				Q[minor][minor] = 1;
			}
			for (int minor = (java.lang.Math.min(m, n)) - 1; minor >= 0; minor--) {
				Q[minor][minor] = 1;
				if ((qr[minor][minor]) != 0.0) {
					for (int col = minor; col < (m); col++) {
						double alpha = 0;
						for (int row = minor; row < (m); row++) {
							alpha -= (Q[row][col]) * (qr[row][minor]);
						}
						alpha /= (rDiag[minor]) * (qr[minor][minor]);
						for (int row = minor; row < (m); row++) {
							Q[row][col] -= alpha * (qr[row][minor]);
						}
					}
				}
			}
			cachedQ = new org.apache.commons.math.linear.RealMatrixImpl(Q, false);
		}
		return cachedQ;
	}

	public org.apache.commons.math.linear.RealMatrix getH() {
		if ((cachedH) == null) {
			double[][] hData = new double[m][n];
			for (int i = 0; i < (m); ++i) {
				for (int j = 0; j < (java.lang.Math.min((i + 1), n)); ++j) {
					hData[i][j] = (qr[i][j]) / (-(rDiag[j]));
				}
			}
			cachedH = new org.apache.commons.math.linear.RealMatrixImpl(hData, false);
		}
		return cachedH;
	}

	public boolean isFullRank() {
		for (double diag : rDiag) {
			if (diag == 0) {
				return false;
			}
		}
		return true;
	}

	public double[] solve(double[] b) throws java.lang.IllegalArgumentException, org.apache.commons.math.linear.InvalidMatrixException {
		if ((b.length) != (m)) {
			throw new java.lang.IllegalArgumentException("Incorrect row dimension");
		}
		if (!(isFullRank())) {
			throw new org.apache.commons.math.linear.InvalidMatrixException("Matrix is rank-deficient");
		}
		final double[] x = new double[n];
		final double[] y = b.clone();
		for (int minor = 0; minor < (java.lang.Math.min(m, n)); minor++) {
			double dotProduct = 0;
			for (int row = minor; row < (m); row++) {
				dotProduct += (y[row]) * (qr[row][minor]);
			}
			dotProduct /= (rDiag[minor]) * (qr[minor][minor]);
			for (int row = minor; row < (m); row++) {
				y[row] += dotProduct * (qr[row][minor]);
			}
		}
		for (int row = (n) - 1; row >= 0; --row) {
			y[row] /= rDiag[row];
			final double yRow = y[row];
			x[row] = yRow;
			for (int i = 0; i < row; i++) {
				y[i] -= yRow * (qr[i][row]);
			}
		}
		return x;
	}

	public org.apache.commons.math.linear.RealVector solve(org.apache.commons.math.linear.RealVector b) throws java.lang.IllegalArgumentException, org.apache.commons.math.linear.InvalidMatrixException {
		try {
			return solve(((org.apache.commons.math.linear.RealVectorImpl) (b)));
		} catch (java.lang.ClassCastException cce) {
			return new org.apache.commons.math.linear.RealVectorImpl(solve(b.getData()), false);
		}
	}

	public org.apache.commons.math.linear.RealVectorImpl solve(org.apache.commons.math.linear.RealVectorImpl b) throws java.lang.IllegalArgumentException, org.apache.commons.math.linear.InvalidMatrixException {
		return new org.apache.commons.math.linear.RealVectorImpl(solve(b.getDataRef()), false);
	}

	public org.apache.commons.math.linear.RealMatrix solve(org.apache.commons.math.linear.RealMatrix b) throws java.lang.IllegalArgumentException, org.apache.commons.math.linear.InvalidMatrixException {
		if ((b.getRowDimension()) != (m)) {
			throw new java.lang.IllegalArgumentException("Incorrect row dimension");
		}
		if (!(isFullRank())) {
			throw new org.apache.commons.math.linear.InvalidMatrixException("Matrix is rank-deficient");
		}
		final int cols = b.getColumnDimension();
		final double[][] xData = new double[n][cols];
		final double[] y = new double[b.getRowDimension()];
		for (int k = 0; k < cols; ++k) {
			for (int j = 0; j < (y.length); ++j) {
				y[j] = b.getEntry(j, k);
			}
			for (int minor = 0; minor < (java.lang.Math.min(m, n)); minor++) {
				double dotProduct = 0;
				for (int row = minor; row < (m); row++) {
					dotProduct += (y[row]) * (qr[row][minor]);
				}
				dotProduct /= (rDiag[minor]) * (qr[minor][minor]);
				for (int row = minor; row < (m); row++) {
					y[row] += dotProduct * (qr[row][minor]);
				}
			}
			for (int row = (n) - 1; row >= 0; --row) {
				y[row] /= rDiag[row];
				final double yRow = y[row];
				xData[row][k] = yRow;
				for (int i = 0; i < row; i++) {
					y[i] -= yRow * (qr[i][row]);
				}
			}
		}
		return new org.apache.commons.math.linear.RealMatrixImpl(xData, false);
	}
}

