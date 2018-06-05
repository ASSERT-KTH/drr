

package org.apache.commons.math3.linear;


class SchurTransformer {
	private static final int MAX_ITERATIONS = 100;

	private final double[][] matrixP;

	private final double[][] matrixT;

	private org.apache.commons.math3.linear.RealMatrix cachedP;

	private org.apache.commons.math3.linear.RealMatrix cachedT;

	private org.apache.commons.math3.linear.RealMatrix cachedPt;

	private final double epsilon = org.apache.commons.math3.util.Precision.EPSILON;

	public SchurTransformer(final org.apache.commons.math3.linear.RealMatrix matrix) {
		if (!(matrix.isSquare())) {
			throw new org.apache.commons.math3.linear.NonSquareMatrixException(matrix.getRowDimension(), matrix.getColumnDimension());
		}
		org.apache.commons.math3.linear.HessenbergTransformer transformer = new org.apache.commons.math3.linear.HessenbergTransformer(matrix);
		matrixT = transformer.getH().getData();
		matrixP = transformer.getP().getData();
		cachedT = null;
		cachedP = null;
		cachedPt = null;
		transform();
	}

	public org.apache.commons.math3.linear.RealMatrix getP() {
		if ((cachedP) == null) {
			cachedP = org.apache.commons.math3.linear.MatrixUtils.createRealMatrix(matrixP);
		}
		return cachedP;
	}

	public org.apache.commons.math3.linear.RealMatrix getPT() {
		if ((cachedPt) == null) {
			cachedPt = getP().transpose();
		}
		return cachedPt;
	}

	public org.apache.commons.math3.linear.RealMatrix getT() {
		if ((cachedT) == null) {
			cachedT = org.apache.commons.math3.linear.MatrixUtils.createRealMatrix(matrixT);
		}
		return cachedT;
	}

	private void transform() {
		final int n = matrixT.length;
		final double norm = getNorm();
		final org.apache.commons.math3.linear.SchurTransformer.ShiftInfo shift = new org.apache.commons.math3.linear.SchurTransformer.ShiftInfo();
		int iteration = 0;
		int idx = n - 1;
		while (idx >= 0) {
			final int l = findSmallSubDiagonalElement(idx, norm);
			if (l == idx) {
				matrixT[idx][idx] = (matrixT[idx][idx]) + (shift.exShift);
				idx--;
				iteration = 0;
			}else
				if (l == (idx - 1)) {
					shift.w = (matrixT[idx][(idx - 1)]) * (matrixT[(idx - 1)][idx]);
					double p = ((matrixT[(idx - 1)][(idx - 1)]) - (matrixT[idx][idx])) / 2.0;
					double q = (p * p) + (shift.w);
					double z = org.apache.commons.math3.util.FastMath.sqrt(org.apache.commons.math3.util.FastMath.abs(q));
					matrixT[idx][idx] = (matrixT[idx][idx]) + (shift.exShift);
					matrixT[(idx - 1)][(idx - 1)] = (matrixT[(idx - 1)][(idx - 1)]) + (shift.exShift);
					shift.x = matrixT[idx][idx];
					if (q >= 0) {
						if (p >= 0) {
							z = p + z;
						}else {
							z = p - z;
						}
						shift.x = matrixT[idx][(idx - 1)];
						double s = (org.apache.commons.math3.util.FastMath.abs(shift.x)) + (org.apache.commons.math3.util.FastMath.abs(z));
						p = (shift.x) / s;
						q = z / s;
						double r = org.apache.commons.math3.util.FastMath.sqrt(((p * p) + (q * q)));
						p = p / r;
						q = q / r;
						for (int j = idx - 1; j < n; j++) {
							z = matrixT[(idx - 1)][j];
							matrixT[(idx - 1)][j] = (q * z) + (p * (matrixT[idx][j]));
							matrixT[idx][j] = (q * (matrixT[idx][j])) - (p * z);
						}
						for (int i = 0; i <= idx; i++) {
							z = matrixT[i][(idx - 1)];
							matrixT[i][(idx - 1)] = (q * z) + (p * (matrixT[i][idx]));
							matrixT[i][idx] = (q * (matrixT[i][idx])) - (p * z);
						}
						for (int i = 0; i <= (n - 1); i++) {
							z = matrixP[i][(idx - 1)];
							matrixP[i][(idx - 1)] = (q * z) + (p * (matrixP[i][idx]));
							matrixP[i][idx] = (q * (matrixP[i][idx])) - (p * z);
						}
					}
					idx -= 2;
					iteration = 0;
				}else {
					computeShift(l, idx, iteration, shift);
					if ((++iteration) > (org.apache.commons.math3.linear.SchurTransformer.MAX_ITERATIONS)) {
						throw new org.apache.commons.math3.exception.MaxCountExceededException(org.apache.commons.math3.exception.util.LocalizedFormats.CONVERGENCE_FAILED, org.apache.commons.math3.linear.SchurTransformer.MAX_ITERATIONS);
					}
					int m = idx - 2;
					final double[] hVec = new double[3];
					while (m >= l) {
						double z = matrixT[m][m];
						hVec[2] = (shift.x) - z;
						double s = (shift.y) - z;
						hVec[0] = ((((hVec[2]) * s) - (shift.w)) / (matrixT[(m + 1)][m])) + (matrixT[m][(m + 1)]);
						hVec[1] = (((matrixT[(m + 1)][(m + 1)]) - z) - (hVec[2])) - s;
						hVec[2] = matrixT[(m + 2)][(m + 1)];
						s = ((org.apache.commons.math3.util.FastMath.abs(hVec[0])) + (org.apache.commons.math3.util.FastMath.abs(hVec[1]))) + (org.apache.commons.math3.util.FastMath.abs(hVec[2]));
						if (m == l) {
							break;
						}
						for (int i = 0; i < (hVec.length); i++) {
							hVec[i] /= s;
						}
						final double lhs = (org.apache.commons.math3.util.FastMath.abs(matrixT[m][(m - 1)])) * ((org.apache.commons.math3.util.FastMath.abs(hVec[1])) + (org.apache.commons.math3.util.FastMath.abs(hVec[2])));
						final double rhs = (org.apache.commons.math3.util.FastMath.abs(hVec[0])) * (((org.apache.commons.math3.util.FastMath.abs(matrixT[(m - 1)][(m - 1)])) + (org.apache.commons.math3.util.FastMath.abs(z))) + (org.apache.commons.math3.util.FastMath.abs(matrixT[(m + 1)][(m + 1)])));
						if (lhs < ((epsilon) * rhs)) {
							break;
						}
						m--;
					} 
					performDoubleQRStep(l, m, idx, shift, hVec);
				}
			
		} 
	}

	private double getNorm() {
		double norm = 0.0;
		for (int i = 0; i < (matrixT.length); i++) {
			for (int j = org.apache.commons.math3.util.FastMath.max((i - 1), 0); j < (matrixT.length); j++) {
				norm += org.apache.commons.math3.util.FastMath.abs(matrixT[i][j]);
			}
		}
		return norm;
	}

	private int findSmallSubDiagonalElement(final int startIdx, final double norm) {
		int l = startIdx;
		while (l > 0) {
			double s = (org.apache.commons.math3.util.FastMath.abs(matrixT[(l - 1)][(l - 1)])) + (org.apache.commons.math3.util.FastMath.abs(matrixT[l][l]));
			if (org.apache.commons.math3.util.Precision.equals(s, 0.0, epsilon)) {
				s = norm;
			}
			if ((org.apache.commons.math3.util.FastMath.abs(matrixT[l][(l - 1)])) < ((epsilon) * s)) {
				break;
			}
			l--;
		} 
		return l;
	}

	private void computeShift(final int l, final int idx, final int iteration, final org.apache.commons.math3.linear.SchurTransformer.ShiftInfo shift) {
		shift.x = matrixT[idx][idx];
		shift.y = shift.w = 0.0;
		if (l < idx) {
			shift.y = matrixT[(idx - 1)][(idx - 1)];
			shift.w = (matrixT[idx][(idx - 1)]) * (matrixT[(idx - 1)][idx]);
		}
		if (iteration == 10) {
			shift.exShift += shift.x;
			for (int i = 0; i <= idx; i++) {
				matrixT[i][i] -= shift.x;
			}
			double s = (org.apache.commons.math3.util.FastMath.abs(matrixT[idx][(idx - 1)])) + (org.apache.commons.math3.util.FastMath.abs(matrixT[(idx - 1)][(idx - 2)]));
			shift.x = shift.y = 0.75 * s;
			shift.w = ((-0.4375) * s) * s;
		}
		if (iteration == 30) {
			double s = ((shift.y) - (shift.x)) / 2.0;
			s = (s * s) + (shift.w);
			if ((org.apache.commons.math3.util.Precision.compareTo(s, 0.0, epsilon)) > 0) {
				s = org.apache.commons.math3.util.FastMath.sqrt(s);
				if ((shift.y) < (shift.x)) {
					s = -s;
				}
				s = (shift.x) - ((shift.w) / ((((shift.y) - (shift.x)) / 2.0) + s));
				for (int i = 0; i <= idx; i++) {
					matrixT[i][i] -= s;
				}
				shift.exShift += s;
				shift.x = shift.y = shift.w = 0.964;
			}
		}
	}

	private void performDoubleQRStep(final int l, final int m, final int idx, final org.apache.commons.math3.linear.SchurTransformer.ShiftInfo shift, final double[] hVec) {
		final int n = matrixT.length;
		double p = hVec[0];
		double q = hVec[1];
		double r = hVec[2];
		for (int k = m; k <= (idx - 1); k++) {
			boolean notlast = k != (idx - 1);
			if (k != m) {
				p = matrixT[k][(k - 1)];
				q = matrixT[(k + 1)][(k - 1)];
				r = (notlast) ? matrixT[(k + 2)][(k - 1)] : 0.0;
				shift.x = ((org.apache.commons.math3.util.FastMath.abs(p)) + (org.apache.commons.math3.util.FastMath.abs(q))) + (org.apache.commons.math3.util.FastMath.abs(r));
				if (!(org.apache.commons.math3.util.Precision.equals(shift.x, 0.0, epsilon))) {
					p = p / (shift.x);
					q = q / (shift.x);
					r = r / (shift.x);
				}
			}
			if (org.apache.commons.math3.util.Precision.equals(shift.x, 0.0, epsilon)) {
				break;
			}
			double s = org.apache.commons.math3.util.FastMath.sqrt((((p * p) + (q * q)) + (r * r)));
			if (p < 0.0) {
				s = -s;
			}
			if (!(org.apache.commons.math3.util.Precision.equals(s, 0.0, epsilon))) {
				if (k != m) {
					matrixT[k][(k - 1)] = (-s) * (shift.x);
				}else
					if (l != m) {
						matrixT[k][(k - 1)] = -(matrixT[k][(k - 1)]);
					}
				
				p = p + s;
				shift.x = p / s;
				shift.y = q / s;
				double z = r / s;
				q = q / p;
				r = r / p;
				for (int j = k; j < n; j++) {
					p = (matrixT[k][j]) + (q * (matrixT[(k + 1)][j]));
					if (notlast) {
						p = p + (r * (matrixT[(k + 2)][j]));
						matrixT[(k + 2)][j] = (matrixT[(k + 2)][j]) - (p * z);
					}
					matrixT[k][j] = (matrixT[k][j]) - (p * (shift.x));
					matrixT[(k + 1)][j] = (matrixT[(k + 1)][j]) - (p * (shift.y));
				}
				for (int i = 0; i <= (org.apache.commons.math3.util.FastMath.min(idx, (k + 3))); i++) {
					p = ((shift.x) * (matrixT[i][k])) + ((shift.y) * (matrixT[i][(k + 1)]));
					if (notlast) {
						p = p + (z * (matrixT[i][(k + 2)]));
						matrixT[i][(k + 2)] = (matrixT[i][(k + 2)]) - (p * r);
					}
					matrixT[i][k] = (matrixT[i][k]) - p;
					matrixT[i][(k + 1)] = (matrixT[i][(k + 1)]) - (p * q);
				}
				final int high = (matrixT.length) - 1;
				for (int i = 0; i <= high; i++) {
					p = ((shift.x) * (matrixP[i][k])) + ((shift.y) * (matrixP[i][(k + 1)]));
					if (notlast) {
						p = p + (z * (matrixP[i][(k + 2)]));
						matrixP[i][(k + 2)] = (matrixP[i][(k + 2)]) - (p * r);
					}
					matrixP[i][k] = (matrixP[i][k]) - p;
					matrixP[i][(k + 1)] = (matrixP[i][(k + 1)]) - (p * q);
				}
			}
		}
		for (int i = m + 2; i <= idx; i++) {
			matrixT[i][(i - 2)] = 0.0;
			if (i > (m + 2)) {
				matrixT[i][(i - 3)] = 0.0;
			}
		}
	}

	private static class ShiftInfo {
		double x;

		double y;

		double w;

		double exShift;
	}
}

