

package org.apache.commons.math3.linear;


class BiDiagonalTransformer {
	private final double[][] householderVectors;

	private final double[] main;

	private final double[] secondary;

	private org.apache.commons.math3.linear.RealMatrix cachedU;

	private org.apache.commons.math3.linear.RealMatrix cachedB;

	private org.apache.commons.math3.linear.RealMatrix cachedV;

	public BiDiagonalTransformer(org.apache.commons.math3.linear.RealMatrix matrix) {
		final int m = matrix.getRowDimension();
		final int n = matrix.getColumnDimension();
		final int p = org.apache.commons.math3.util.FastMath.min(m, n);
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

	public org.apache.commons.math3.linear.RealMatrix getU() {
		if ((cachedU) == null) {
			final int m = householderVectors.length;
			final int n = householderVectors[0].length;
			final int p = main.length;
			final int diagOffset = m >= n ? 0 : 1;
			final double[] diagonal = m >= n ? main : secondary;
			double[][] ua = new double[m][m];
			for (int k = m - 1; k >= p; --k) {
				ua[k][k] = 1;
			}
			for (int k = p - 1; k >= diagOffset; --k) {
				final double[] hK = householderVectors[k];
				ua[k][k] = 1;
				if ((hK[(k - diagOffset)]) != 0.0) {
					for (int j = k; j < m; ++j) {
						double alpha = 0;
						for (int i = k; i < m; ++i) {
							alpha -= (ua[i][j]) * (householderVectors[i][(k - diagOffset)]);
						}
						alpha /= (diagonal[(k - diagOffset)]) * (hK[(k - diagOffset)]);
						for (int i = k; i < m; ++i) {
							ua[i][j] += (-alpha) * (householderVectors[i][(k - diagOffset)]);
						}
					}
				}
			}
			if (diagOffset > 0) {
				ua[0][0] = 1;
			}
			cachedU = org.apache.commons.math3.linear.MatrixUtils.createRealMatrix(ua);
		}
		return cachedU;
	}

	public org.apache.commons.math3.linear.RealMatrix getB() {
		if ((cachedB) == null) {
			final int m = householderVectors.length;
			final int n = householderVectors[0].length;
			double[][] ba = new double[m][n];
			for (int i = 0; i < (main.length); ++i) {
				ba[i][i] = main[i];
				if (m < n) {
					if (i > 0) {
						ba[i][(i - 1)] = secondary[(i - 1)];
					}
				}else {
					if (i < ((main.length) - 1)) {
						ba[i][(i + 1)] = secondary[i];
					}
				}
			}
			cachedB = org.apache.commons.math3.linear.MatrixUtils.createRealMatrix(ba);
		}
		return cachedB;
	}

	public org.apache.commons.math3.linear.RealMatrix getV() {
		if ((cachedV) == null) {
			final int m = householderVectors.length;
			final int n = householderVectors[0].length;
			final int p = main.length;
			final int diagOffset = m >= n ? 1 : 0;
			final double[] diagonal = m >= n ? secondary : main;
			double[][] va = new double[n][n];
			for (int k = n - 1; k >= p; --k) {
				va[k][k] = 1;
			}
			for (int k = p - 1; k >= diagOffset; --k) {
				final double[] hK = householderVectors[(k - diagOffset)];
				va[k][k] = 1;
				if ((hK[k]) != 0.0) {
					for (int j = k; j < n; ++j) {
						double beta = 0;
						for (int i = k; i < n; ++i) {
							beta -= (va[i][j]) * (hK[i]);
						}
						beta /= (diagonal[(k - diagOffset)]) * (hK[k]);
						for (int i = k; i < n; ++i) {
							va[i][j] += (-beta) * (hK[i]);
						}
					}
				}
			}
			if (diagOffset > 0) {
				va[0][0] = 1;
			}
			cachedV = org.apache.commons.math3.linear.MatrixUtils.createRealMatrix(va);
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
			final double[] hK = householderVectors[k];
			final double a = (hK[k]) > 0 ? -(org.apache.commons.math3.util.FastMath.sqrt(xNormSqr)) : org.apache.commons.math3.util.FastMath.sqrt(xNormSqr);
			main[k] = a;
			if (a != 0.0) {
				hK[k] -= a;
				for (int j = k + 1; j < n; ++j) {
					double alpha = 0;
					for (int i = k; i < m; ++i) {
						final double[] hI = householderVectors[i];
						alpha -= (hI[j]) * (hI[k]);
					}
					alpha /= a * (householderVectors[k][k]);
					for (int i = k; i < m; ++i) {
						final double[] hI = householderVectors[i];
						hI[j] -= alpha * (hI[k]);
					}
				}
			}
			if (k < (n - 1)) {
				xNormSqr = 0;
				for (int j = k + 1; j < n; ++j) {
					final double c = hK[j];
					xNormSqr += c * c;
				}
				final double b = (hK[(k + 1)]) > 0 ? -(org.apache.commons.math3.util.FastMath.sqrt(xNormSqr)) : org.apache.commons.math3.util.FastMath.sqrt(xNormSqr);
				secondary[k] = b;
				if (b != 0.0) {
					hK[(k + 1)] -= b;
					for (int i = k + 1; i < m; ++i) {
						final double[] hI = householderVectors[i];
						double beta = 0;
						for (int j = k + 1; j < n; ++j) {
							beta -= (hI[j]) * (hK[j]);
						}
						beta /= b * (hK[(k + 1)]);
						for (int j = k + 1; j < n; ++j) {
							hI[j] -= beta * (hK[j]);
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
			final double[] hK = householderVectors[k];
			double xNormSqr = 0;
			for (int j = k; j < n; ++j) {
				final double c = hK[j];
				xNormSqr += c * c;
			}
			final double a = (hK[k]) > 0 ? -(org.apache.commons.math3.util.FastMath.sqrt(xNormSqr)) : org.apache.commons.math3.util.FastMath.sqrt(xNormSqr);
			main[k] = a;
			if (a != 0.0) {
				hK[k] -= a;
				for (int i = k + 1; i < m; ++i) {
					final double[] hI = householderVectors[i];
					double alpha = 0;
					for (int j = k; j < n; ++j) {
						alpha -= (hI[j]) * (hK[j]);
					}
					alpha /= a * (householderVectors[k][k]);
					for (int j = k; j < n; ++j) {
						hI[j] -= alpha * (hK[j]);
					}
				}
			}
			if (k < (m - 1)) {
				final double[] hKp1 = householderVectors[(k + 1)];
				xNormSqr = 0;
				for (int i = k + 1; i < m; ++i) {
					final double c = householderVectors[i][k];
					xNormSqr += c * c;
				}
				final double b = (hKp1[k]) > 0 ? -(org.apache.commons.math3.util.FastMath.sqrt(xNormSqr)) : org.apache.commons.math3.util.FastMath.sqrt(xNormSqr);
				secondary[k] = b;
				if (b != 0.0) {
					hKp1[k] -= b;
					for (int j = k + 1; j < n; ++j) {
						double beta = 0;
						for (int i = k + 1; i < m; ++i) {
							final double[] hI = householderVectors[i];
							beta -= (hI[j]) * (hI[k]);
						}
						beta /= b * (hKp1[k]);
						for (int i = k + 1; i < m; ++i) {
							final double[] hI = householderVectors[i];
							hI[j] -= beta * (hI[k]);
						}
					}
				}
			}
		}
	}
}

