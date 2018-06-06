

package org.apache.commons.math.linear;


class BiDiagonalTransformer implements java.io.Serializable {
	private static final long serialVersionUID = 8935390784125343332L;

	private final double[][] householderVectors;

	private final double[] main;

	private final double[] secondary;

	private org.apache.commons.math.linear.RealMatrix cachedU;

	private org.apache.commons.math.linear.RealMatrix cachedB;

	private org.apache.commons.math.linear.RealMatrix cachedV;

	public BiDiagonalTransformer(org.apache.commons.math.linear.RealMatrix matrix) throws org.apache.commons.math.linear.InvalidMatrixException {
		final int m = matrix.getRowDimension();
		final int n = matrix.getColumnDimension();
		final int p = java.lang.Math.min(m, n);
		householderVectors = matrix.getData();
		main = new double[p];
		secondary = new double[p - 1];
		cachedU = null;
		cachedB = null;
		cachedV = null;
		if (m >= n) {
			transformToUpperBiDiagonal();
		}else {
			transformToLowerBiDiagonal();
		}
	}

	public org.apache.commons.math.linear.RealMatrix getU() {
		if ((cachedU) == null) {
			final int m = householderVectors.length;
			final int n = householderVectors[0].length;
			final int p = main.length;
			final int diagOffset = m >= n ? 0 : 1;
			final double[] diagonal = m >= n ? main : secondary;
			final double[][] uData = new double[m][m];
			for (int k = m - 1; k >= p; --k) {
				uData[k][k] = 1;
			}
			for (int k = p - 1; k >= diagOffset; --k) {
				final double[] hK = householderVectors[k];
				uData[k][k] = 1;
				if ((hK[(k - diagOffset)]) != 0.0) {
					for (int j = k; j < m; ++j) {
						double alpha = 0;
						for (int i = k; i < m; ++i) {
							alpha -= (uData[i][j]) * (householderVectors[i][(k - diagOffset)]);
						}
						alpha /= (diagonal[(k - diagOffset)]) * (hK[(k - diagOffset)]);
						for (int i = k; i < m; ++i) {
							uData[i][j] -= alpha * (householderVectors[i][(k - diagOffset)]);
						}
					}
				}
			}
			if (diagOffset > 0) {
				uData[0][0] = 1;
			}
			cachedU = new org.apache.commons.math.linear.RealMatrixImpl(uData, false);
		}
		return cachedU;
	}

	public org.apache.commons.math.linear.RealMatrix getB() {
		if ((cachedB) == null) {
			final int m = householderVectors.length;
			final int n = householderVectors[0].length;
			double[][] bData = new double[m][n];
			for (int i = 0; i < (main.length); ++i) {
				bData[i][i] = main[i];
				if (i < ((main.length) - 1)) {
					if (m < n) {
						bData[(i + 1)][i] = secondary[i];
					}else {
						bData[i][(i + 1)] = secondary[i];
					}
				}
			}
			cachedB = new org.apache.commons.math.linear.RealMatrixImpl(bData, false);
		}
		return cachedB;
	}

	public org.apache.commons.math.linear.RealMatrix getV() {
		if ((cachedV) == null) {
			final int m = householderVectors.length;
			final int n = householderVectors[0].length;
			final int p = main.length;
			final int diagOffset = m >= n ? 1 : 0;
			final double[] diagonal = m >= n ? secondary : main;
			final double[][] vData = new double[n][n];
			for (int k = n - 1; k >= p; --k) {
				vData[k][k] = 1;
			}
			for (int k = p - 1; k >= diagOffset; --k) {
				final double[] hK = householderVectors[(k - diagOffset)];
				vData[k][k] = 1;
				if ((hK[k]) != 0.0) {
					for (int j = k; j < n; ++j) {
						double beta = 0;
						for (int i = k; i < n; ++i) {
							beta -= (vData[i][j]) * (hK[i]);
						}
						beta /= (diagonal[(k - diagOffset)]) * (hK[k]);
						for (int i = k; i < n; ++i) {
							vData[i][j] -= beta * (hK[i]);
						}
					}
				}
			}
			if (diagOffset > 0) {
				vData[0][0] = 1;
			}
			cachedV = new org.apache.commons.math.linear.RealMatrixImpl(vData, false);
		}
		return cachedV;
	}

	double[][] getHouseholderVectorsRef() {
		return householderVectors;
	}

	double[] getMainDiagonalRef() {
		return main;
	}

	double[] getSecondaryDiagonalRef() {
		return secondary;
	}

	boolean isUpperBiDiagonal() {
		return (householderVectors.length) >= (householderVectors[0].length);
	}

	private void transformToUpperBiDiagonal() {
		final int m = householderVectors.length;
		final int n = householderVectors[0].length;
		for (int k = 0; k < n; k++) {
			double xNormSqr = 0;
			for (int i = k; i < m; ++i) {
				final double c = householderVectors[i][k];
				xNormSqr += c * c;
			}
			final double a = (householderVectors[k][k]) > 0 ? -(java.lang.Math.sqrt(xNormSqr)) : java.lang.Math.sqrt(xNormSqr);
			main[k] = a;
			if (a != 0.0) {
				householderVectors[k][k] -= a;
				for (int j = k + 1; j < n; ++j) {
					double alpha = 0;
					for (int i = k; i < m; ++i) {
						final double[] uvI = householderVectors[i];
						alpha -= (uvI[j]) * (uvI[k]);
					}
					alpha /= a * (householderVectors[k][k]);
					for (int i = k; i < m; ++i) {
						final double[] uvI = householderVectors[i];
						uvI[j] -= alpha * (uvI[k]);
					}
				}
			}
			if (k < (n - 1)) {
				final double[] uvK = householderVectors[k];
				xNormSqr = 0;
				for (int j = k + 1; j < n; ++j) {
					final double c = uvK[j];
					xNormSqr += c * c;
				}
				final double b = (uvK[(k + 1)]) > 0 ? -(java.lang.Math.sqrt(xNormSqr)) : java.lang.Math.sqrt(xNormSqr);
				secondary[k] = b;
				if (b != 0.0) {
					uvK[(k + 1)] -= b;
					for (int i = k + 1; i < m; ++i) {
						final double[] uvI = householderVectors[i];
						double beta = 0;
						for (int j = k + 1; j < n; ++j) {
							beta -= (uvI[j]) * (uvK[j]);
						}
						beta /= b * (uvK[(k + 1)]);
						for (int j = k + 1; j < n; ++j) {
							uvI[j] -= beta * (uvK[j]);
						}
					}
				}
			}
		}
	}

	private void transformToLowerBiDiagonal() {
		final int m = householderVectors.length;
		final int n = householderVectors[0].length;
		for (int k = 0; k < m; k++) {
			final double[] uvK = householderVectors[k];
			double xNormSqr = 0;
			for (int j = k; j < n; ++j) {
				final double c = uvK[j];
				xNormSqr += c * c;
			}
			final double a = (uvK[k]) > 0 ? -(java.lang.Math.sqrt(xNormSqr)) : java.lang.Math.sqrt(xNormSqr);
			main[k] = a;
			if (a != 0.0) {
				uvK[k] -= a;
				for (int i = k + 1; i < m; ++i) {
					final double[] uvI = householderVectors[i];
					double alpha = 0;
					for (int j = k; j < n; ++j) {
						alpha -= (uvI[j]) * (uvK[j]);
					}
					alpha /= a * (householderVectors[k][k]);
					for (int j = k; j < n; ++j) {
						uvI[j] -= alpha * (uvK[j]);
					}
				}
			}
			if (k < (m - 1)) {
				xNormSqr = 0;
				for (int i = k + 1; i < m; ++i) {
					final double c = householderVectors[i][k];
					xNormSqr += c * c;
				}
				final double b = (householderVectors[(k + 1)][k]) > 0 ? -(java.lang.Math.sqrt(xNormSqr)) : java.lang.Math.sqrt(xNormSqr);
				secondary[k] = b;
				if (b != 0.0) {
					householderVectors[(k + 1)][k] -= b;
					for (int j = k + 1; j < n; ++j) {
						double beta = 0;
						for (int i = k + 1; i < m; ++i) {
							final double[] uvI = householderVectors[i];
							beta -= (uvI[j]) * (uvI[k]);
						}
						beta /= b * (householderVectors[(k + 1)][k]);
						for (int i = k + 1; i < m; ++i) {
							final double[] uvI = householderVectors[i];
							uvI[j] -= beta * (uvI[k]);
						}
					}
				}
			}
		}
	}
}

