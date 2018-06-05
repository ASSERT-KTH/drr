

package org.apache.commons.math3.linear;


class TriDiagonalTransformer {
	private final double[][] householderVectors;

	private final double[] main;

	private final double[] secondary;

	private org.apache.commons.math3.linear.RealMatrix cachedQ;

	private org.apache.commons.math3.linear.RealMatrix cachedQt;

	private org.apache.commons.math3.linear.RealMatrix cachedT;

	public TriDiagonalTransformer(org.apache.commons.math3.linear.RealMatrix matrix) {
		if (!(matrix.isSquare())) {
			throw new org.apache.commons.math3.linear.NonSquareMatrixException(matrix.getRowDimension(), matrix.getColumnDimension());
		}
		final int m = matrix.getRowDimension();
		householderVectors = matrix.getData();
		main = new double[m];
		secondary = new double[m - 1];
		cachedQ = null;
		cachedQt = null;
		cachedT = null;
		transform();
	}

	public org.apache.commons.math3.linear.RealMatrix getQ() {
		if ((cachedQ) == null) {
			cachedQ = getQT().transpose();
		}
		return cachedQ;
	}

	public org.apache.commons.math3.linear.RealMatrix getQT() {
		if ((cachedQt) == null) {
			final int m = householderVectors.length;
			double[][] qta = new double[m][m];
			for (int k = m - 1; k >= 1; --k) {
				final double[] hK = householderVectors[(k - 1)];
				qta[k][k] = 1;
				if ((hK[k]) != 0.0) {
					final double inv = 1.0 / ((secondary[(k - 1)]) * (hK[k]));
					double beta = 1.0 / (secondary[(k - 1)]);
					qta[k][k] = 1 + (beta * (hK[k]));
					for (int i = k + 1; i < m; ++i) {
						qta[k][i] = beta * (hK[i]);
					}
					for (int j = k + 1; j < m; ++j) {
						beta = 0;
						for (int i = k + 1; i < m; ++i) {
							beta += (qta[j][i]) * (hK[i]);
						}
						beta *= inv;
						qta[j][k] = beta * (hK[k]);
						for (int i = k + 1; i < m; ++i) {
							qta[j][i] += beta * (hK[i]);
						}
					}
				}
			}
			qta[0][0] = 1;
			cachedQt = org.apache.commons.math3.linear.MatrixUtils.createRealMatrix(qta);
		}
		return cachedQt;
	}

	public org.apache.commons.math3.linear.RealMatrix getT() {
		if ((cachedT) == null) {
			final int m = main.length;
			double[][] ta = new double[m][m];
			for (int i = 0; i < m; ++i) {
				ta[i][i] = main[i];
				if (i > 0) {
					ta[i][(i - 1)] = secondary[(i - 1)];
				}
				if (i < ((main.length) - 1)) {
					ta[i][(i + 1)] = secondary[i];
				}
			}
			cachedT = org.apache.commons.math3.linear.MatrixUtils.createRealMatrix(ta);
		}
		return cachedT;
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

	private void transform() {
		final int m = householderVectors.length;
		final double[] z = new double[m];
		for (int k = 0; k < (m - 1); k++) {
			final double[] hK = householderVectors[k];
			main[k] = hK[k];
			double xNormSqr = 0;
			for (int j = k + 1; j < m; ++j) {
				final double c = hK[j];
				xNormSqr += c * c;
			}
			final double a = (hK[(k + 1)]) > 0 ? -(org.apache.commons.math3.util.FastMath.sqrt(xNormSqr)) : org.apache.commons.math3.util.FastMath.sqrt(xNormSqr);
			secondary[k] = a;
			if (a != 0.0) {
				hK[(k + 1)] -= a;
				final double beta = (-1) / (a * (hK[(k + 1)]));
				java.util.Arrays.fill(z, (k + 1), m, 0);
				for (int i = k + 1; i < m; ++i) {
					final double[] hI = householderVectors[i];
					final double hKI = hK[i];
					double zI = (hI[i]) * hKI;
					for (int j = i + 1; j < m; ++j) {
						final double hIJ = hI[j];
						zI += hIJ * (hK[j]);
						z[j] += hIJ * hKI;
					}
					z[i] = beta * ((z[i]) + zI);
				}
				double gamma = 0;
				for (int i = k + 1; i < m; ++i) {
					gamma += (z[i]) * (hK[i]);
				}
				gamma *= beta / 2;
				for (int i = k + 1; i < m; ++i) {
					z[i] -= gamma * (hK[i]);
				}
				for (int i = k + 1; i < m; ++i) {
					final double[] hI = householderVectors[i];
					for (int j = i; j < m; ++j) {
						hI[j] -= ((hK[i]) * (z[j])) + ((z[i]) * (hK[j]));
					}
				}
			}
		}
		main[(m - 1)] = householderVectors[(m - 1)][(m - 1)];
	}
}

