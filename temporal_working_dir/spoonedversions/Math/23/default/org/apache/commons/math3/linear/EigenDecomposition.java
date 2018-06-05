

package org.apache.commons.math3.linear;


public class EigenDecomposition {
	private static final double EPSILON = 1.0E-12;

	private byte maxIter = 30;

	private double[] main;

	private double[] secondary;

	private org.apache.commons.math3.linear.TriDiagonalTransformer transformer;

	private double[] realEigenvalues;

	private double[] imagEigenvalues;

	private org.apache.commons.math3.linear.ArrayRealVector[] eigenvectors;

	private org.apache.commons.math3.linear.RealMatrix cachedV;

	private org.apache.commons.math3.linear.RealMatrix cachedD;

	private org.apache.commons.math3.linear.RealMatrix cachedVt;

	public EigenDecomposition(final org.apache.commons.math3.linear.RealMatrix matrix) throws org.apache.commons.math3.exception.MathArithmeticException {
		if (isSymmetric(matrix, false)) {
			transformToTridiagonal(matrix);
			findEigenVectors(transformer.getQ().getData());
		}else {
			final org.apache.commons.math3.linear.SchurTransformer t = transformToSchur(matrix);
			findEigenVectorsFromSchur(t);
		}
	}

	@java.lang.Deprecated
	public EigenDecomposition(final org.apache.commons.math3.linear.RealMatrix matrix, final double splitTolerance) throws org.apache.commons.math3.exception.MathArithmeticException {
		this(matrix);
	}

	public EigenDecomposition(final double[] main, final double[] secondary) {
		org.apache.commons.math3.linear.EigenDecomposition.this.main = main.clone();
		org.apache.commons.math3.linear.EigenDecomposition.this.secondary = secondary.clone();
		transformer = null;
		final int size = main.length;
		final double[][] z = new double[size][size];
		for (int i = 0; i < size; i++) {
			z[i][i] = 1.0;
		}
		findEigenVectors(z);
	}

	@java.lang.Deprecated
	public EigenDecomposition(final double[] main, final double[] secondary, final double splitTolerance) {
		this(main, secondary);
	}

	private boolean isSymmetric(final org.apache.commons.math3.linear.RealMatrix matrix, boolean raiseException) {
		final int rows = matrix.getRowDimension();
		final int columns = matrix.getColumnDimension();
		final double eps = ((10 * rows) * columns) * (org.apache.commons.math3.util.Precision.EPSILON);
		for (int i = 0; i < rows; ++i) {
			for (int j = i + 1; j < columns; ++j) {
				final double mij = matrix.getEntry(i, j);
				final double mji = matrix.getEntry(j, i);
				if ((org.apache.commons.math3.util.FastMath.abs((mij - mji))) > ((org.apache.commons.math3.util.FastMath.max(org.apache.commons.math3.util.FastMath.abs(mij), org.apache.commons.math3.util.FastMath.abs(mji))) * eps)) {
					if (raiseException) {
						throw new org.apache.commons.math3.linear.NonSymmetricMatrixException(i, j, eps);
					}
					return false;
				}
			}
		}
		return true;
	}

	public org.apache.commons.math3.linear.RealMatrix getV() {
		if ((cachedV) == null) {
			final int m = eigenvectors.length;
			cachedV = org.apache.commons.math3.linear.MatrixUtils.createRealMatrix(m, m);
			for (int k = 0; k < m; ++k) {
				cachedV.setColumnVector(k, eigenvectors[k]);
			}
		}
		return cachedV;
	}

	public org.apache.commons.math3.linear.RealMatrix getD() {
		if ((cachedD) == null) {
			cachedD = org.apache.commons.math3.linear.MatrixUtils.createRealDiagonalMatrix(realEigenvalues);
			for (int i = 0; i < (imagEigenvalues.length); i++) {
				if ((org.apache.commons.math3.util.Precision.compareTo(imagEigenvalues[i], 0.0, org.apache.commons.math3.linear.EigenDecomposition.EPSILON)) > 0) {
					cachedD.setEntry(i, (i + 1), imagEigenvalues[i]);
				}else
					if ((org.apache.commons.math3.util.Precision.compareTo(imagEigenvalues[i], 0.0, org.apache.commons.math3.linear.EigenDecomposition.EPSILON)) < 0) {
						cachedD.setEntry(i, (i - 1), imagEigenvalues[i]);
					}
				
			}
		}
		return cachedD;
	}

	public org.apache.commons.math3.linear.RealMatrix getVT() {
		if ((cachedVt) == null) {
			final int m = eigenvectors.length;
			cachedVt = org.apache.commons.math3.linear.MatrixUtils.createRealMatrix(m, m);
			for (int k = 0; k < m; ++k) {
				cachedVt.setRowVector(k, eigenvectors[k]);
			}
		}
		return cachedVt;
	}

	public boolean hasComplexEigenvalues() {
		for (int i = 0; i < (imagEigenvalues.length); i++) {
			if (!(org.apache.commons.math3.util.Precision.equals(imagEigenvalues[i], 0.0, org.apache.commons.math3.linear.EigenDecomposition.EPSILON))) {
				return true;
			}
		}
		return false;
	}

	public double[] getRealEigenvalues() {
		return realEigenvalues.clone();
	}

	public double getRealEigenvalue(final int i) {
		return realEigenvalues[i];
	}

	public double[] getImagEigenvalues() {
		return imagEigenvalues.clone();
	}

	public double getImagEigenvalue(final int i) {
		return imagEigenvalues[i];
	}

	public org.apache.commons.math3.linear.RealVector getEigenvector(final int i) {
		return eigenvectors[i].copy();
	}

	public double getDeterminant() {
		double determinant = 1;
		for (double lambda : realEigenvalues) {
			determinant *= lambda;
		}
		return determinant;
	}

	public org.apache.commons.math3.linear.DecompositionSolver getSolver() {
		if (hasComplexEigenvalues()) {
			throw new org.apache.commons.math3.exception.MathUnsupportedOperationException();
		}
		return new org.apache.commons.math3.linear.EigenDecomposition.Solver(realEigenvalues, imagEigenvalues, eigenvectors);
	}

	private static class Solver implements org.apache.commons.math3.linear.DecompositionSolver {
		private double[] realEigenvalues;

		private double[] imagEigenvalues;

		private final org.apache.commons.math3.linear.ArrayRealVector[] eigenvectors;

		private Solver(final double[] realEigenvalues, final double[] imagEigenvalues, final org.apache.commons.math3.linear.ArrayRealVector[] eigenvectors) {
			org.apache.commons.math3.linear.EigenDecomposition.Solver.this.realEigenvalues = realEigenvalues;
			org.apache.commons.math3.linear.EigenDecomposition.Solver.this.imagEigenvalues = imagEigenvalues;
			this.eigenvectors = eigenvectors;
		}

		public org.apache.commons.math3.linear.RealVector solve(final org.apache.commons.math3.linear.RealVector b) {
			if (!(isNonSingular())) {
				throw new org.apache.commons.math3.linear.SingularMatrixException();
			}
			final int m = realEigenvalues.length;
			if ((b.getDimension()) != m) {
				throw new org.apache.commons.math3.exception.DimensionMismatchException(b.getDimension(), m);
			}
			final double[] bp = new double[m];
			for (int i = 0; i < m; ++i) {
				final org.apache.commons.math3.linear.ArrayRealVector v = eigenvectors[i];
				final double[] vData = v.getDataRef();
				final double s = (v.dotProduct(b)) / (realEigenvalues[i]);
				for (int j = 0; j < m; ++j) {
					bp[j] += s * (vData[j]);
				}
			}
			return new org.apache.commons.math3.linear.ArrayRealVector(bp, false);
		}

		public org.apache.commons.math3.linear.RealMatrix solve(org.apache.commons.math3.linear.RealMatrix b) {
			if (!(isNonSingular())) {
				throw new org.apache.commons.math3.linear.SingularMatrixException();
			}
			final int m = realEigenvalues.length;
			if ((b.getRowDimension()) != m) {
				throw new org.apache.commons.math3.exception.DimensionMismatchException(b.getRowDimension(), m);
			}
			final int nColB = b.getColumnDimension();
			final double[][] bp = new double[m][nColB];
			final double[] tmpCol = new double[m];
			for (int k = 0; k < nColB; ++k) {
				for (int i = 0; i < m; ++i) {
					tmpCol[i] = b.getEntry(i, k);
					bp[i][k] = 0;
				}
				for (int i = 0; i < m; ++i) {
					final org.apache.commons.math3.linear.ArrayRealVector v = eigenvectors[i];
					final double[] vData = v.getDataRef();
					double s = 0;
					for (int j = 0; j < m; ++j) {
						s += (v.getEntry(j)) * (tmpCol[j]);
					}
					s /= realEigenvalues[i];
					for (int j = 0; j < m; ++j) {
						bp[j][k] += s * (vData[j]);
					}
				}
			}
			return new org.apache.commons.math3.linear.Array2DRowRealMatrix(bp, false);
		}

		public boolean isNonSingular() {
			for (int i = 0; i < (realEigenvalues.length); ++i) {
				if (((realEigenvalues[i]) == 0) && ((imagEigenvalues[i]) == 0)) {
					return false;
				}
			}
			return true;
		}

		public org.apache.commons.math3.linear.RealMatrix getInverse() {
			if (!(isNonSingular())) {
				throw new org.apache.commons.math3.linear.SingularMatrixException();
			}
			final int m = realEigenvalues.length;
			final double[][] invData = new double[m][m];
			for (int i = 0; i < m; ++i) {
				final double[] invI = invData[i];
				for (int j = 0; j < m; ++j) {
					double invIJ = 0;
					for (int k = 0; k < m; ++k) {
						final double[] vK = eigenvectors[k].getDataRef();
						invIJ += ((vK[i]) * (vK[j])) / (realEigenvalues[k]);
					}
					invI[j] = invIJ;
				}
			}
			return org.apache.commons.math3.linear.MatrixUtils.createRealMatrix(invData);
		}
	}

	private void transformToTridiagonal(final org.apache.commons.math3.linear.RealMatrix matrix) {
		transformer = new org.apache.commons.math3.linear.TriDiagonalTransformer(matrix);
		main = transformer.getMainDiagonalRef();
		secondary = transformer.getSecondaryDiagonalRef();
	}

	private void findEigenVectors(final double[][] householderMatrix) {
		final double[][] z = householderMatrix.clone();
		final int n = main.length;
		realEigenvalues = new double[n];
		imagEigenvalues = new double[n];
		final double[] e = new double[n];
		for (int i = 0; i < (n - 1); i++) {
			realEigenvalues[i] = main[i];
			e[i] = secondary[i];
		}
		realEigenvalues[(n - 1)] = main[(n - 1)];
		e[(n - 1)] = 0;
		double maxAbsoluteValue = 0;
		for (int i = 0; i < n; i++) {
			if ((org.apache.commons.math3.util.FastMath.abs(realEigenvalues[i])) > maxAbsoluteValue) {
				maxAbsoluteValue = org.apache.commons.math3.util.FastMath.abs(realEigenvalues[i]);
			}
			if ((org.apache.commons.math3.util.FastMath.abs(e[i])) > maxAbsoluteValue) {
				maxAbsoluteValue = org.apache.commons.math3.util.FastMath.abs(e[i]);
			}
		}
		if (maxAbsoluteValue != 0) {
			for (int i = 0; i < n; i++) {
				if ((org.apache.commons.math3.util.FastMath.abs(realEigenvalues[i])) <= ((org.apache.commons.math3.util.Precision.EPSILON) * maxAbsoluteValue)) {
					realEigenvalues[i] = 0;
				}
				if ((org.apache.commons.math3.util.FastMath.abs(e[i])) <= ((org.apache.commons.math3.util.Precision.EPSILON) * maxAbsoluteValue)) {
					e[i] = 0;
				}
			}
		}
		for (int j = 0; j < n; j++) {
			int its = 0;
			int m;
			do {
				for (m = j; m < (n - 1); m++) {
					double delta = (org.apache.commons.math3.util.FastMath.abs(realEigenvalues[m])) + (org.apache.commons.math3.util.FastMath.abs(realEigenvalues[(m + 1)]));
					if (((org.apache.commons.math3.util.FastMath.abs(e[m])) + delta) == delta) {
						break;
					}
				}
				if (m != j) {
					if (its == (maxIter)) {
						throw new org.apache.commons.math3.exception.MaxCountExceededException(org.apache.commons.math3.exception.util.LocalizedFormats.CONVERGENCE_FAILED, maxIter);
					}
					its++;
					double q = ((realEigenvalues[(j + 1)]) - (realEigenvalues[j])) / (2 * (e[j]));
					double t = org.apache.commons.math3.util.FastMath.sqrt((1 + (q * q)));
					if (q < 0.0) {
						q = ((realEigenvalues[m]) - (realEigenvalues[j])) + ((e[j]) / (q - t));
					}else {
						q = ((realEigenvalues[m]) - (realEigenvalues[j])) + ((e[j]) / (q + t));
					}
					double u = 0.0;
					double s = 1.0;
					double c = 1.0;
					int i;
					for (i = m - 1; i >= j; i--) {
						double p = s * (e[i]);
						double h = c * (e[i]);
						if ((org.apache.commons.math3.util.FastMath.abs(p)) >= (org.apache.commons.math3.util.FastMath.abs(q))) {
							c = q / p;
							t = org.apache.commons.math3.util.FastMath.sqrt(((c * c) + 1.0));
							e[(i + 1)] = p * t;
							s = 1.0 / t;
							c = c * s;
						}else {
							s = p / q;
							t = org.apache.commons.math3.util.FastMath.sqrt(((s * s) + 1.0));
							e[(i + 1)] = q * t;
							c = 1.0 / t;
							s = s * c;
						}
						if ((e[(i + 1)]) == 0.0) {
							realEigenvalues[(i + 1)] -= u;
							e[m] = 0.0;
							break;
						}
						q = (realEigenvalues[(i + 1)]) - u;
						t = (((realEigenvalues[i]) - q) * s) + ((2.0 * c) * h);
						u = s * t;
						realEigenvalues[(i + 1)] = q + u;
						q = (c * t) - h;
						for (int ia = 0; ia < n; ia++) {
							p = z[ia][(i + 1)];
							z[ia][(i + 1)] = (s * (z[ia][i])) + (c * p);
							z[ia][i] = (c * (z[ia][i])) - (s * p);
						}
					}
					if ((t == 0.0) && (i >= j)) {
						continue;
					}
					realEigenvalues[j] -= u;
					e[j] = q;
					e[m] = 0.0;
				}
			} while (m != j );
		}
		for (int i = 0; i < n; i++) {
			int k = i;
			double p = realEigenvalues[i];
			for (int j = i + 1; j < n; j++) {
				if ((realEigenvalues[j]) > p) {
					k = j;
					p = realEigenvalues[j];
				}
			}
			if (k != i) {
				realEigenvalues[k] = realEigenvalues[i];
				realEigenvalues[i] = p;
				for (int j = 0; j < n; j++) {
					p = z[j][i];
					z[j][i] = z[j][k];
					z[j][k] = p;
				}
			}
		}
		maxAbsoluteValue = 0;
		for (int i = 0; i < n; i++) {
			if ((org.apache.commons.math3.util.FastMath.abs(realEigenvalues[i])) > maxAbsoluteValue) {
				maxAbsoluteValue = org.apache.commons.math3.util.FastMath.abs(realEigenvalues[i]);
			}
		}
		if (maxAbsoluteValue != 0.0) {
			for (int i = 0; i < n; i++) {
				if ((org.apache.commons.math3.util.FastMath.abs(realEigenvalues[i])) < ((org.apache.commons.math3.util.Precision.EPSILON) * maxAbsoluteValue)) {
					realEigenvalues[i] = 0;
				}
			}
		}
		eigenvectors = new org.apache.commons.math3.linear.ArrayRealVector[n];
		final double[] tmp = new double[n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				tmp[j] = z[j][i];
			}
			eigenvectors[i] = new org.apache.commons.math3.linear.ArrayRealVector(tmp);
		}
	}

	private org.apache.commons.math3.linear.SchurTransformer transformToSchur(final org.apache.commons.math3.linear.RealMatrix matrix) {
		final org.apache.commons.math3.linear.SchurTransformer schurTransform = new org.apache.commons.math3.linear.SchurTransformer(matrix);
		final double[][] matT = schurTransform.getT().getData();
		realEigenvalues = new double[matT.length];
		imagEigenvalues = new double[matT.length];
		for (int i = 0; i < (realEigenvalues.length); i++) {
			if ((i == ((realEigenvalues.length) - 1)) || (org.apache.commons.math3.util.Precision.equals(matT[(i + 1)][i], 0.0, org.apache.commons.math3.linear.EigenDecomposition.EPSILON))) {
				realEigenvalues[i] = matT[i][i];
			}else {
				final double x = matT[(i + 1)][(i + 1)];
				final double p = 0.5 * ((matT[i][i]) - x);
				final double z = org.apache.commons.math3.util.FastMath.sqrt(org.apache.commons.math3.util.FastMath.abs(((p * p) + ((matT[(i + 1)][i]) * (matT[i][(i + 1)])))));
				realEigenvalues[i] = x + p;
				imagEigenvalues[i] = z;
				realEigenvalues[(i + 1)] = x + p;
				imagEigenvalues[(i + 1)] = -z;
				i++;
			}
		}
		return schurTransform;
	}

	private org.apache.commons.math3.complex.Complex cdiv(final double xr, final double xi, final double yr, final double yi) {
		return new org.apache.commons.math3.complex.Complex(xr, xi).divide(new org.apache.commons.math3.complex.Complex(yr, yi));
	}

	private void findEigenVectorsFromSchur(final org.apache.commons.math3.linear.SchurTransformer schur) throws org.apache.commons.math3.exception.MathArithmeticException {
		final double[][] matrixT = schur.getT().getData();
		final double[][] matrixP = schur.getP().getData();
		final int n = matrixT.length;
		double norm = 0.0;
		for (int i = 0; i < n; i++) {
			for (int j = org.apache.commons.math3.util.FastMath.max((i - 1), 0); j < n; j++) {
				norm = norm + (org.apache.commons.math3.util.FastMath.abs(matrixT[i][j]));
			}
		}
		if (org.apache.commons.math3.util.Precision.equals(norm, 0.0, org.apache.commons.math3.linear.EigenDecomposition.EPSILON)) {
			throw new org.apache.commons.math3.exception.MathArithmeticException(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM);
		}
		double r = 0.0;
		double s = 0.0;
		double z = 0.0;
		for (int idx = n - 1; idx >= 0; idx--) {
			double p = realEigenvalues[idx];
			double q = imagEigenvalues[idx];
			if (org.apache.commons.math3.util.Precision.equals(q, 0.0)) {
				int l = idx;
				matrixT[idx][idx] = 1.0;
				for (int i = idx - 1; i >= 0; i--) {
					double w = (matrixT[i][i]) - p;
					r = 0.0;
					for (int j = l; j <= idx; j++) {
						r = r + ((matrixT[i][j]) * (matrixT[j][idx]));
					}
					if ((org.apache.commons.math3.util.Precision.compareTo(imagEigenvalues[i], 0.0, org.apache.commons.math3.linear.EigenDecomposition.EPSILON)) < 0.0) {
						z = w;
						s = r;
					}else {
						l = i;
						if (org.apache.commons.math3.util.Precision.equals(imagEigenvalues[i], 0.0)) {
							if (w != 0.0) {
								matrixT[i][idx] = (-r) / w;
							}else {
								matrixT[i][idx] = (-r) / ((org.apache.commons.math3.util.Precision.EPSILON) * norm);
							}
						}else {
							double x = matrixT[i][(i + 1)];
							double y = matrixT[(i + 1)][i];
							q = (((realEigenvalues[i]) - p) * ((realEigenvalues[i]) - p)) + ((imagEigenvalues[i]) * (imagEigenvalues[i]));
							double t = ((x * s) - (z * r)) / q;
							matrixT[i][idx] = t;
							if ((org.apache.commons.math3.util.FastMath.abs(x)) > (org.apache.commons.math3.util.FastMath.abs(z))) {
								matrixT[(i + 1)][idx] = ((-r) - (w * t)) / x;
							}else {
								matrixT[(i + 1)][idx] = ((-s) - (y * t)) / z;
							}
						}
						double t = org.apache.commons.math3.util.FastMath.abs(matrixT[i][idx]);
						if ((((org.apache.commons.math3.util.Precision.EPSILON) * t) * t) > 1) {
							for (int j = i; j <= idx; j++) {
								matrixT[j][idx] = (matrixT[j][idx]) / t;
							}
						}
					}
				}
			}else
				if (q < 0.0) {
					int l = idx - 1;
					if ((org.apache.commons.math3.util.FastMath.abs(matrixT[idx][(idx - 1)])) > (org.apache.commons.math3.util.FastMath.abs(matrixT[(idx - 1)][idx]))) {
						matrixT[(idx - 1)][(idx - 1)] = q / (matrixT[idx][(idx - 1)]);
						matrixT[(idx - 1)][idx] = (-((matrixT[idx][idx]) - p)) / (matrixT[idx][(idx - 1)]);
					}else {
						final org.apache.commons.math3.complex.Complex result = cdiv(0.0, (-(matrixT[(idx - 1)][idx])), ((matrixT[(idx - 1)][(idx - 1)]) - p), q);
						matrixT[(idx - 1)][(idx - 1)] = result.getReal();
						matrixT[(idx - 1)][idx] = result.getImaginary();
					}
					matrixT[idx][(idx - 1)] = 0.0;
					matrixT[idx][idx] = 1.0;
					for (int i = idx - 2; i >= 0; i--) {
						double ra = 0.0;
						double sa = 0.0;
						for (int j = l; j <= idx; j++) {
							ra = ra + ((matrixT[i][j]) * (matrixT[j][(idx - 1)]));
							sa = sa + ((matrixT[i][j]) * (matrixT[j][idx]));
						}
						double w = (matrixT[i][i]) - p;
						if ((org.apache.commons.math3.util.Precision.compareTo(imagEigenvalues[i], 0.0, org.apache.commons.math3.linear.EigenDecomposition.EPSILON)) < 0.0) {
							z = w;
							r = ra;
							s = sa;
						}else {
							l = i;
							if (org.apache.commons.math3.util.Precision.equals(imagEigenvalues[i], 0.0)) {
								final org.apache.commons.math3.complex.Complex c = cdiv((-ra), (-sa), w, q);
								matrixT[i][(idx - 1)] = c.getReal();
								matrixT[i][idx] = c.getImaginary();
							}else {
								double x = matrixT[i][(i + 1)];
								double y = matrixT[(i + 1)][i];
								double vr = ((((realEigenvalues[i]) - p) * ((realEigenvalues[i]) - p)) + ((imagEigenvalues[i]) * (imagEigenvalues[i]))) - (q * q);
								final double vi = (((realEigenvalues[i]) - p) * 2.0) * q;
								if ((org.apache.commons.math3.util.Precision.equals(vr, 0.0)) && (org.apache.commons.math3.util.Precision.equals(vi, 0.0))) {
									vr = ((org.apache.commons.math3.util.Precision.EPSILON) * norm) * (((((org.apache.commons.math3.util.FastMath.abs(w)) + (org.apache.commons.math3.util.FastMath.abs(q))) + (org.apache.commons.math3.util.FastMath.abs(x))) + (org.apache.commons.math3.util.FastMath.abs(y))) + (org.apache.commons.math3.util.FastMath.abs(z)));
								}
								final org.apache.commons.math3.complex.Complex c = cdiv((((x * r) - (z * ra)) + (q * sa)), (((x * s) - (z * sa)) - (q * ra)), vr, vi);
								matrixT[i][(idx - 1)] = c.getReal();
								matrixT[i][idx] = c.getImaginary();
								if ((org.apache.commons.math3.util.FastMath.abs(x)) > ((org.apache.commons.math3.util.FastMath.abs(z)) + (org.apache.commons.math3.util.FastMath.abs(q)))) {
									matrixT[(i + 1)][(idx - 1)] = (((-ra) - (w * (matrixT[i][(idx - 1)]))) + (q * (matrixT[i][idx]))) / x;
									matrixT[(i + 1)][idx] = (((-sa) - (w * (matrixT[i][idx]))) - (q * (matrixT[i][(idx - 1)]))) / x;
								}else {
									final org.apache.commons.math3.complex.Complex c2 = cdiv(((-r) - (y * (matrixT[i][(idx - 1)]))), ((-s) - (y * (matrixT[i][idx]))), z, q);
									matrixT[(i + 1)][(idx - 1)] = c2.getReal();
									matrixT[(i + 1)][idx] = c2.getImaginary();
								}
							}
							double t = org.apache.commons.math3.util.FastMath.max(org.apache.commons.math3.util.FastMath.abs(matrixT[i][(idx - 1)]), org.apache.commons.math3.util.FastMath.abs(matrixT[i][idx]));
							if ((((org.apache.commons.math3.util.Precision.EPSILON) * t) * t) > 1) {
								for (int j = i; j <= idx; j++) {
									matrixT[j][(idx - 1)] = (matrixT[j][(idx - 1)]) / t;
									matrixT[j][idx] = (matrixT[j][idx]) / t;
								}
							}
						}
					}
				}
			
		}
		for (int i = 0; i < n; i++) {
			if ((i < 0) | (i > (n - 1))) {
				for (int j = i; j < n; j++) {
					matrixP[i][j] = matrixT[i][j];
				}
			}
		}
		for (int j = n - 1; j >= 0; j--) {
			for (int i = 0; i <= (n - 1); i++) {
				z = 0.0;
				for (int k = 0; k <= (org.apache.commons.math3.util.FastMath.min(j, (n - 1))); k++) {
					z = z + ((matrixP[i][k]) * (matrixT[k][j]));
				}
				matrixP[i][j] = z;
			}
		}
		eigenvectors = new org.apache.commons.math3.linear.ArrayRealVector[n];
		final double[] tmp = new double[n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				tmp[j] = matrixP[j][i];
			}
			eigenvectors[i] = new org.apache.commons.math3.linear.ArrayRealVector(tmp);
		}
	}
}

