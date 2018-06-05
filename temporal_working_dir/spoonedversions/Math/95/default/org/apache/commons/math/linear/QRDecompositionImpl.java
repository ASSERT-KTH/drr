

package org.apache.commons.math.linear;


public class QRDecompositionImpl implements org.apache.commons.math.linear.QRDecomposition {
	private static final long serialVersionUID = 7560093145655650408L;

	private double[][] qrt;

	private double[] rDiag;

	private org.apache.commons.math.linear.RealMatrix cachedQ;

	private org.apache.commons.math.linear.RealMatrix cachedR;

	private org.apache.commons.math.linear.RealMatrix cachedH;

	public QRDecompositionImpl() {
	}

	public QRDecompositionImpl(org.apache.commons.math.linear.RealMatrix matrix) {
		decompose(matrix);
	}

	public void decompose(org.apache.commons.math.linear.RealMatrix matrix) {
		final int m = matrix.getRowDimension();
		final int n = matrix.getColumnDimension();
		qrt = matrix.transpose().getData();
		rDiag = new double[n];
		cachedQ = null;
		cachedR = null;
		cachedH = null;
		for (int minor = 0; minor < (java.lang.Math.min(m, n)); minor++) {
			final double[] qrtMinor = qrt[minor];
			double xNormSqr = 0;
			for (int row = minor; row < m; row++) {
				final double c = qrtMinor[row];
				xNormSqr += c * c;
			}
			final double a = (qrtMinor[minor]) > 0 ? -(java.lang.Math.sqrt(xNormSqr)) : java.lang.Math.sqrt(xNormSqr);
			rDiag[minor] = a;
			if (a != 0.0) {
				qrtMinor[minor] -= a;
				for (int col = minor + 1; col < n; col++) {
					final double[] qrtCol = qrt[col];
					double alpha = 0;
					for (int row = minor; row < m; row++) {
						alpha -= (qrtCol[row]) * (qrtMinor[row]);
					}
					alpha /= a * (qrtMinor[minor]);
					for (int row = minor; row < m; row++) {
						qrtCol[row] -= alpha * (qrtMinor[row]);
					}
				}
			}
		}
	}

	public org.apache.commons.math.linear.RealMatrix getR() throws java.lang.IllegalStateException {
		if ((cachedR) == null) {
			checkDecomposed();
			final int n = qrt.length;
			final int m = qrt[0].length;
			double[][] r = new double[m][n];
			for (int row = (java.lang.Math.min(m, n)) - 1; row >= 0; row--) {
				double[] rRow = r[row];
				rRow[row] = rDiag[row];
				for (int col = row + 1; col < n; col++) {
					rRow[col] = qrt[col][row];
				}
			}
			cachedR = new org.apache.commons.math.linear.RealMatrixImpl(r, false);
		}
		return cachedR;
	}

	public org.apache.commons.math.linear.RealMatrix getQ() throws java.lang.IllegalStateException {
		if ((cachedQ) == null) {
			checkDecomposed();
			final int n = qrt.length;
			final int m = qrt[0].length;
			double[][] q = new double[m][m];
			for (int minor = m - 1; minor >= (java.lang.Math.min(m, n)); minor--) {
				q[minor][minor] = 1;
			}
			for (int minor = (java.lang.Math.min(m, n)) - 1; minor >= 0; minor--) {
				final double[] qrtMinor = qrt[minor];
				q[minor][minor] = 1;
				if ((qrtMinor[minor]) != 0.0) {
					for (int col = minor; col < m; col++) {
						double alpha = 0;
						for (int row = minor; row < m; row++) {
							alpha -= (q[row][col]) * (qrtMinor[row]);
						}
						alpha /= (rDiag[minor]) * (qrtMinor[minor]);
						for (int row = minor; row < m; row++) {
							q[row][col] -= alpha * (qrtMinor[row]);
						}
					}
				}
			}
			cachedQ = new org.apache.commons.math.linear.RealMatrixImpl(q, false);
		}
		return cachedQ;
	}

	public org.apache.commons.math.linear.RealMatrix getH() throws java.lang.IllegalStateException {
		if ((cachedH) == null) {
			checkDecomposed();
			final int n = qrt.length;
			final int m = qrt[0].length;
			double[][] hData = new double[m][n];
			for (int i = 0; i < m; ++i) {
				final double[] hDataI = hData[i];
				for (int j = 0; j < (java.lang.Math.min((i + 1), n)); ++j) {
					hDataI[j] = (qrt[j][i]) / (-(rDiag[j]));
				}
			}
			cachedH = new org.apache.commons.math.linear.RealMatrixImpl(hData, false);
		}
		return cachedH;
	}

	public boolean isFullRank() throws java.lang.IllegalStateException {
		checkDecomposed();
		for (double diag : rDiag) {
			if (diag == 0) {
				return false;
			}
		}
		return true;
	}

	public double[] solve(double[] b) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, org.apache.commons.math.linear.InvalidMatrixException {
		checkDecomposed();
		final int n = qrt.length;
		final int m = qrt[0].length;
		if ((b.length) != m) {
			throw new java.lang.IllegalArgumentException("Incorrect row dimension");
		}
		if (!(isFullRank())) {
			throw new org.apache.commons.math.linear.InvalidMatrixException("Matrix is rank-deficient");
		}
		final double[] x = new double[n];
		final double[] y = b.clone();
		for (int minor = 0; minor < (java.lang.Math.min(m, n)); minor++) {
			final double[] qrtMinor = qrt[minor];
			double dotProduct = 0;
			for (int row = minor; row < m; row++) {
				dotProduct += (y[row]) * (qrtMinor[row]);
			}
			dotProduct /= (rDiag[minor]) * (qrtMinor[minor]);
			for (int row = minor; row < m; row++) {
				y[row] += dotProduct * (qrtMinor[row]);
			}
		}
		for (int row = n - 1; row >= 0; --row) {
			y[row] /= rDiag[row];
			final double yRow = y[row];
			final double[] qrtRow = qrt[row];
			x[row] = yRow;
			for (int i = 0; i < row; i++) {
				y[i] -= yRow * (qrtRow[i]);
			}
		}
		return x;
	}

	public org.apache.commons.math.linear.RealVector solve(org.apache.commons.math.linear.RealVector b) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, org.apache.commons.math.linear.InvalidMatrixException {
		try {
			return solve(((org.apache.commons.math.linear.RealVectorImpl) (b)));
		} catch (java.lang.ClassCastException cce) {
			checkDecomposed();
			return new org.apache.commons.math.linear.RealVectorImpl(solve(b.getData()), false);
		}
	}

	public org.apache.commons.math.linear.RealVectorImpl solve(org.apache.commons.math.linear.RealVectorImpl b) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, org.apache.commons.math.linear.InvalidMatrixException {
		return new org.apache.commons.math.linear.RealVectorImpl(solve(b.getDataRef()), false);
	}

	public org.apache.commons.math.linear.RealMatrix solve(org.apache.commons.math.linear.RealMatrix b) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, org.apache.commons.math.linear.InvalidMatrixException {
		checkDecomposed();
		final int n = qrt.length;
		final int m = qrt[0].length;
		if ((b.getRowDimension()) != m) {
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
				final double[] qrtMinor = qrt[minor];
				double dotProduct = 0;
				for (int row = minor; row < m; row++) {
					dotProduct += (y[row]) * (qrtMinor[row]);
				}
				dotProduct /= (rDiag[minor]) * (qrtMinor[minor]);
				for (int row = minor; row < m; row++) {
					y[row] += dotProduct * (qrtMinor[row]);
				}
			}
			for (int row = n - 1; row >= 0; --row) {
				y[row] /= rDiag[row];
				final double yRow = y[row];
				final double[] qrtRow = qrt[row];
				xData[row][k] = yRow;
				for (int i = 0; i < row; i++) {
					y[i] -= yRow * (qrtRow[i]);
				}
			}
		}
		return new org.apache.commons.math.linear.RealMatrixImpl(xData, false);
	}

	private void checkDecomposed() throws java.lang.IllegalStateException {
		if ((qrt) == null) {
			throw new java.lang.IllegalStateException("no matrix have been decomposed yet");
		}
	}
}

