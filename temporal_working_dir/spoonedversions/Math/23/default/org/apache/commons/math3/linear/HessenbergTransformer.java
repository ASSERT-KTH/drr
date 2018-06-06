

package org.apache.commons.math3.linear;


class HessenbergTransformer {
	private final double[][] householderVectors;

	private final double[] ort;

	private org.apache.commons.math3.linear.RealMatrix cachedP;

	private org.apache.commons.math3.linear.RealMatrix cachedPt;

	private org.apache.commons.math3.linear.RealMatrix cachedH;

	public HessenbergTransformer(final org.apache.commons.math3.linear.RealMatrix matrix) {
		if (!(matrix.isSquare())) {
			throw new org.apache.commons.math3.linear.NonSquareMatrixException(matrix.getRowDimension(), matrix.getColumnDimension());
		}
		final int m = matrix.getRowDimension();
		householderVectors = matrix.getData();
		ort = new double[m];
		cachedP = null;
		cachedPt = null;
		cachedH = null;
		transform();
	}

	public org.apache.commons.math3.linear.RealMatrix getP() {
		if ((cachedP) == null) {
			final int n = householderVectors.length;
			final int high = n - 1;
			final double[][] pa = new double[n][n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					pa[i][j] = (i == j) ? 1 : 0;
				}
			}
			for (int m = high - 1; m >= 1; m--) {
				if ((householderVectors[m][(m - 1)]) != 0.0) {
					for (int i = m + 1; i <= high; i++) {
						ort[i] = householderVectors[i][(m - 1)];
					}
					for (int j = m; j <= high; j++) {
						double g = 0.0;
						for (int i = m; i <= high; i++) {
							g += (ort[i]) * (pa[i][j]);
						}
						g = (g / (ort[m])) / (householderVectors[m][(m - 1)]);
						for (int i = m; i <= high; i++) {
							pa[i][j] += g * (ort[i]);
						}
					}
				}
			}
			cachedP = org.apache.commons.math3.linear.MatrixUtils.createRealMatrix(pa);
		}
		return cachedP;
	}

	public org.apache.commons.math3.linear.RealMatrix getPT() {
		if ((cachedPt) == null) {
			cachedPt = getP().transpose();
		}
		return cachedPt;
	}

	public org.apache.commons.math3.linear.RealMatrix getH() {
		if ((cachedH) == null) {
			final int m = householderVectors.length;
			final double[][] h = new double[m][m];
			for (int i = 0; i < m; ++i) {
				if (i > 0) {
					h[i][(i - 1)] = householderVectors[i][(i - 1)];
				}
				for (int j = i; j < m; ++j) {
					h[i][j] = householderVectors[i][j];
				}
			}
			cachedH = org.apache.commons.math3.linear.MatrixUtils.createRealMatrix(h);
		}
		return cachedH;
	}

	double[][] getHouseholderVectorsRef() {
		return householderVectors;
	}

	private void transform() {
		final int n = householderVectors.length;
		final int high = n - 1;
		for (int m = 1; m <= (high - 1); m++) {
			double scale = 0;
			for (int i = m; i <= high; i++) {
				scale += org.apache.commons.math3.util.FastMath.abs(householderVectors[i][(m - 1)]);
			}
			if (!(org.apache.commons.math3.util.Precision.equals(scale, 0))) {
				double h = 0;
				for (int i = high; i >= m; i--) {
					ort[i] = (householderVectors[i][(m - 1)]) / scale;
					h += (ort[i]) * (ort[i]);
				}
				final double g = (ort[m]) > 0 ? -(org.apache.commons.math3.util.FastMath.sqrt(h)) : org.apache.commons.math3.util.FastMath.sqrt(h);
				h = h - ((ort[m]) * g);
				ort[m] = (ort[m]) - g;
				for (int j = m; j < n; j++) {
					double f = 0;
					for (int i = high; i >= m; i--) {
						f += (ort[i]) * (householderVectors[i][j]);
					}
					f = f / h;
					for (int i = m; i <= high; i++) {
						householderVectors[i][j] -= f * (ort[i]);
					}
				}
				for (int i = 0; i <= high; i++) {
					double f = 0;
					for (int j = high; j >= m; j--) {
						f += (ort[j]) * (householderVectors[i][j]);
					}
					f = f / h;
					for (int j = m; j <= high; j++) {
						householderVectors[i][j] -= f * (ort[j]);
					}
				}
				ort[m] = scale * (ort[m]);
				householderVectors[m][(m - 1)] = scale * g;
			}
		}
	}
}

