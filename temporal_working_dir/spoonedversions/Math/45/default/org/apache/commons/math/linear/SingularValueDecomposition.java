

package org.apache.commons.math.linear;


public class SingularValueDecomposition {
	private static final double EPS = 2.220446049250313E-16;

	private static final double TINY = 1.6033346880071782E-291;

	private final double[] singularValues;

	private final int m;

	private final int n;

	private final boolean transposed;

	private final org.apache.commons.math.linear.RealMatrix cachedU;

	private org.apache.commons.math.linear.RealMatrix cachedUt;

	private org.apache.commons.math.linear.RealMatrix cachedS;

	private final org.apache.commons.math.linear.RealMatrix cachedV;

	private org.apache.commons.math.linear.RealMatrix cachedVt;

	private final double tol;

	public SingularValueDecomposition(final org.apache.commons.math.linear.RealMatrix matrix) {
		final double[][] A;
		if ((matrix.getRowDimension()) < (matrix.getColumnDimension())) {
			transposed = true;
			A = matrix.transpose().getData();
			m = matrix.getColumnDimension();
			n = matrix.getRowDimension();
		}else {
			transposed = false;
			A = matrix.getData();
			m = matrix.getRowDimension();
			n = matrix.getColumnDimension();
		}
		singularValues = new double[n];
		final double[][] U = new double[m][n];
		final double[][] V = new double[n][n];
		final double[] e = new double[n];
		final double[] work = new double[m];
		final int nct = org.apache.commons.math.util.FastMath.min(((m) - 1), n);
		final int nrt = org.apache.commons.math.util.FastMath.max(0, ((n) - 2));
		for (int k = 0; k < (org.apache.commons.math.util.FastMath.max(nct, nrt)); k++) {
			if (k < nct) {
				singularValues[k] = 0;
				for (int i = k; i < (m); i++) {
					singularValues[k] = org.apache.commons.math.util.FastMath.hypot(singularValues[k], A[i][k]);
				}
				if ((singularValues[k]) != 0) {
					if ((A[k][k]) < 0) {
						singularValues[k] = -(singularValues[k]);
					}
					for (int i = k; i < (m); i++) {
						A[i][k] /= singularValues[k];
					}
					A[k][k] += 1;
				}
				singularValues[k] = -(singularValues[k]);
			}
			for (int j = k + 1; j < (n); j++) {
				if ((k < nct) && ((singularValues[k]) != 0)) {
					double t = 0;
					for (int i = k; i < (m); i++) {
						t += (A[i][k]) * (A[i][j]);
					}
					t = (-t) / (A[k][k]);
					for (int i = k; i < (m); i++) {
						A[i][j] += t * (A[i][k]);
					}
				}
				e[j] = A[k][j];
			}
			if (k < nct) {
				for (int i = k; i < (m); i++) {
					U[i][k] = A[i][k];
				}
			}
			if (k < nrt) {
				e[k] = 0;
				for (int i = k + 1; i < (n); i++) {
					e[k] = org.apache.commons.math.util.FastMath.hypot(e[k], e[i]);
				}
				if ((e[k]) != 0) {
					if ((e[(k + 1)]) < 0) {
						e[k] = -(e[k]);
					}
					for (int i = k + 1; i < (n); i++) {
						e[i] /= e[k];
					}
					e[(k + 1)] += 1;
				}
				e[k] = -(e[k]);
				if (((k + 1) < (m)) && ((e[k]) != 0)) {
					for (int i = k + 1; i < (m); i++) {
						work[i] = 0;
					}
					for (int j = k + 1; j < (n); j++) {
						for (int i = k + 1; i < (m); i++) {
							work[i] += (e[j]) * (A[i][j]);
						}
					}
					for (int j = k + 1; j < (n); j++) {
						final double t = (-(e[j])) / (e[(k + 1)]);
						for (int i = k + 1; i < (m); i++) {
							A[i][j] += t * (work[i]);
						}
					}
				}
				for (int i = k + 1; i < (n); i++) {
					V[i][k] = e[i];
				}
			}
		}
		int p = n;
		if (nct < (n)) {
			singularValues[nct] = A[nct][nct];
		}
		if ((m) < p) {
			singularValues[(p - 1)] = 0;
		}
		if ((nrt + 1) < p) {
			e[nrt] = A[nrt][(p - 1)];
		}
		e[(p - 1)] = 0;
		for (int j = nct; j < (n); j++) {
			for (int i = 0; i < (m); i++) {
				U[i][j] = 0;
			}
			U[j][j] = 1;
		}
		for (int k = nct - 1; k >= 0; k--) {
			if ((singularValues[k]) != 0) {
				for (int j = k + 1; j < (n); j++) {
					double t = 0;
					for (int i = k; i < (m); i++) {
						t += (U[i][k]) * (U[i][j]);
					}
					t = (-t) / (U[k][k]);
					for (int i = k; i < (m); i++) {
						U[i][j] += t * (U[i][k]);
					}
				}
				for (int i = k; i < (m); i++) {
					U[i][k] = -(U[i][k]);
				}
				U[k][k] = 1 + (U[k][k]);
				for (int i = 0; i < (k - 1); i++) {
					U[i][k] = 0;
				}
			}else {
				for (int i = 0; i < (m); i++) {
					U[i][k] = 0;
				}
				U[k][k] = 1;
			}
		}
		for (int k = (n) - 1; k >= 0; k--) {
			if ((k < nrt) && ((e[k]) != 0)) {
				for (int j = k + 1; j < (n); j++) {
					double t = 0;
					for (int i = k + 1; i < (n); i++) {
						t += (V[i][k]) * (V[i][j]);
					}
					t = (-t) / (V[(k + 1)][k]);
					for (int i = k + 1; i < (n); i++) {
						V[i][j] += t * (V[i][k]);
					}
				}
			}
			for (int i = 0; i < (n); i++) {
				V[i][k] = 0;
			}
			V[k][k] = 1;
		}
		final int pp = p - 1;
		int iter = 0;
		while (p > 0) {
			int k;
			int kase;
			for (k = p - 2; k >= 0; k--) {
				final double threshold = (org.apache.commons.math.linear.SingularValueDecomposition.TINY) + ((org.apache.commons.math.linear.SingularValueDecomposition.EPS) * ((org.apache.commons.math.util.FastMath.abs(singularValues[k])) + (org.apache.commons.math.util.FastMath.abs(singularValues[(k + 1)]))));
				if ((org.apache.commons.math.util.FastMath.abs(e[k])) <= threshold) {
					e[k] = 0;
					break;
				}
			}
			if (k == (p - 2)) {
				kase = 4;
			}else {
				int ks;
				for (ks = p - 1; ks >= k; ks--) {
					if (ks == k) {
						break;
					}
					final double t = (ks != p ? org.apache.commons.math.util.FastMath.abs(e[ks]) : 0) + (ks != (k + 1) ? org.apache.commons.math.util.FastMath.abs(e[(ks - 1)]) : 0);
					if ((org.apache.commons.math.util.FastMath.abs(singularValues[ks])) <= ((org.apache.commons.math.linear.SingularValueDecomposition.TINY) + ((org.apache.commons.math.linear.SingularValueDecomposition.EPS) * t))) {
						singularValues[ks] = 0;
						break;
					}
				}
				if (ks == k) {
					kase = 3;
				}else
					if (ks == (p - 1)) {
						kase = 1;
					}else {
						kase = 2;
						k = ks;
					}
				
			}
			k++;
			switch (kase) {
				case 1 :
					{
						double f = e[(p - 2)];
						e[(p - 2)] = 0;
						for (int j = p - 2; j >= k; j--) {
							double t = org.apache.commons.math.util.FastMath.hypot(singularValues[j], f);
							final double cs = (singularValues[j]) / t;
							final double sn = f / t;
							singularValues[j] = t;
							if (j != k) {
								f = (-sn) * (e[(j - 1)]);
								e[(j - 1)] = cs * (e[(j - 1)]);
							}
							for (int i = 0; i < (n); i++) {
								t = (cs * (V[i][j])) + (sn * (V[i][(p - 1)]));
								V[i][(p - 1)] = ((-sn) * (V[i][j])) + (cs * (V[i][(p - 1)]));
								V[i][j] = t;
							}
						}
					}
					break;
				case 2 :
					{
						double f = e[(k - 1)];
						e[(k - 1)] = 0;
						for (int j = k; j < p; j++) {
							double t = org.apache.commons.math.util.FastMath.hypot(singularValues[j], f);
							final double cs = (singularValues[j]) / t;
							final double sn = f / t;
							singularValues[j] = t;
							f = (-sn) * (e[j]);
							e[j] = cs * (e[j]);
							for (int i = 0; i < (m); i++) {
								t = (cs * (U[i][j])) + (sn * (U[i][(k - 1)]));
								U[i][(k - 1)] = ((-sn) * (U[i][j])) + (cs * (U[i][(k - 1)]));
								U[i][j] = t;
							}
						}
					}
					break;
				case 3 :
					{
						final double scale = org.apache.commons.math.util.FastMath.max(org.apache.commons.math.util.FastMath.max(org.apache.commons.math.util.FastMath.max(org.apache.commons.math.util.FastMath.max(org.apache.commons.math.util.FastMath.abs(singularValues[(p - 1)]), org.apache.commons.math.util.FastMath.abs(singularValues[(p - 2)])), org.apache.commons.math.util.FastMath.abs(e[(p - 2)])), org.apache.commons.math.util.FastMath.abs(singularValues[k])), org.apache.commons.math.util.FastMath.abs(e[k]));
						final double sp = (singularValues[(p - 1)]) / scale;
						final double spm1 = (singularValues[(p - 2)]) / scale;
						final double epm1 = (e[(p - 2)]) / scale;
						final double sk = (singularValues[k]) / scale;
						final double ek = (e[k]) / scale;
						final double b = (((spm1 + sp) * (spm1 - sp)) + (epm1 * epm1)) / 2.0;
						final double c = (sp * epm1) * (sp * epm1);
						double shift = 0;
						if ((b != 0) || (c != 0)) {
							shift = org.apache.commons.math.util.FastMath.sqrt(((b * b) + c));
							if (b < 0) {
								shift = -shift;
							}
							shift = c / (b + shift);
						}
						double f = ((sk + sp) * (sk - sp)) + shift;
						double g = sk * ek;
						for (int j = k; j < (p - 1); j++) {
							double t = org.apache.commons.math.util.FastMath.hypot(f, g);
							double cs = f / t;
							double sn = g / t;
							if (j != k) {
								e[(j - 1)] = t;
							}
							f = (cs * (singularValues[j])) + (sn * (e[j]));
							e[j] = (cs * (e[j])) - (sn * (singularValues[j]));
							g = sn * (singularValues[(j + 1)]);
							singularValues[(j + 1)] = cs * (singularValues[(j + 1)]);
							for (int i = 0; i < (n); i++) {
								t = (cs * (V[i][j])) + (sn * (V[i][(j + 1)]));
								V[i][(j + 1)] = ((-sn) * (V[i][j])) + (cs * (V[i][(j + 1)]));
								V[i][j] = t;
							}
							t = org.apache.commons.math.util.FastMath.hypot(f, g);
							cs = f / t;
							sn = g / t;
							singularValues[j] = t;
							f = (cs * (e[j])) + (sn * (singularValues[(j + 1)]));
							singularValues[(j + 1)] = ((-sn) * (e[j])) + (cs * (singularValues[(j + 1)]));
							g = sn * (e[(j + 1)]);
							e[(j + 1)] = cs * (e[(j + 1)]);
							if (j < ((m) - 1)) {
								for (int i = 0; i < (m); i++) {
									t = (cs * (U[i][j])) + (sn * (U[i][(j + 1)]));
									U[i][(j + 1)] = ((-sn) * (U[i][j])) + (cs * (U[i][(j + 1)]));
									U[i][j] = t;
								}
							}
						}
						e[(p - 2)] = f;
						iter = iter + 1;
					}
					break;
				default :
					{
						if ((singularValues[k]) <= 0) {
							singularValues[k] = ((singularValues[k]) < 0) ? -(singularValues[k]) : 0;
							for (int i = 0; i <= pp; i++) {
								V[i][k] = -(V[i][k]);
							}
						}
						while (k < pp) {
							if ((singularValues[k]) >= (singularValues[(k + 1)])) {
								break;
							}
							double t = singularValues[k];
							singularValues[k] = singularValues[(k + 1)];
							singularValues[(k + 1)] = t;
							if (k < ((n) - 1)) {
								for (int i = 0; i < (n); i++) {
									t = V[i][(k + 1)];
									V[i][(k + 1)] = V[i][k];
									V[i][k] = t;
								}
							}
							if (k < ((m) - 1)) {
								for (int i = 0; i < (m); i++) {
									t = U[i][(k + 1)];
									U[i][(k + 1)] = U[i][k];
									U[i][k] = t;
								}
							}
							k++;
						} 
						iter = 0;
						p--;
					}
					break;
			}
		} 
		tol = org.apache.commons.math.util.FastMath.max((((m) * (singularValues[0])) * (org.apache.commons.math.linear.SingularValueDecomposition.EPS)), org.apache.commons.math.util.FastMath.sqrt(org.apache.commons.math.util.MathUtils.SAFE_MIN));
		if (!(transposed)) {
			cachedU = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(U);
			cachedV = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(V);
		}else {
			cachedU = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(V);
			cachedV = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(U);
		}
	}

	public org.apache.commons.math.linear.RealMatrix getU() {
		return cachedU;
	}

	public org.apache.commons.math.linear.RealMatrix getUT() {
		if ((cachedUt) == null) {
			cachedUt = getU().transpose();
		}
		return cachedUt;
	}

	public org.apache.commons.math.linear.RealMatrix getS() {
		if ((cachedS) == null) {
			cachedS = org.apache.commons.math.linear.MatrixUtils.createRealDiagonalMatrix(singularValues);
		}
		return cachedS;
	}

	public double[] getSingularValues() {
		return singularValues.clone();
	}

	public org.apache.commons.math.linear.RealMatrix getV() {
		return cachedV;
	}

	public org.apache.commons.math.linear.RealMatrix getVT() {
		if ((cachedVt) == null) {
			cachedVt = getV().transpose();
		}
		return cachedVt;
	}

	public org.apache.commons.math.linear.RealMatrix getCovariance(final double minSingularValue) {
		final int p = singularValues.length;
		int dimension = 0;
		while ((dimension < p) && ((singularValues[dimension]) >= minSingularValue)) {
			++dimension;
		} 
		if (dimension == 0) {
			throw new org.apache.commons.math.exception.NumberIsTooLargeException(org.apache.commons.math.exception.util.LocalizedFormats.TOO_LARGE_CUTOFF_SINGULAR_VALUE, minSingularValue, singularValues[0], true);
		}
		final double[][] data = new double[dimension][p];
		getVT().walkInOptimizedOrder(new org.apache.commons.math.linear.DefaultRealMatrixPreservingVisitor() {
			@java.lang.Override
			public void visit(final int row, final int column, final double value) {
				data[row][column] = value / (singularValues[row]);
			}
		}, 0, (dimension - 1), 0, (p - 1));
		org.apache.commons.math.linear.RealMatrix jv = new org.apache.commons.math.linear.Array2DRowRealMatrix(data, false);
		return jv.transpose().multiply(jv);
	}

	public double getNorm() {
		return singularValues[0];
	}

	public double getConditionNumber() {
		return (singularValues[0]) / (singularValues[((n) - 1)]);
	}

	public double getInverseConditionNumber() {
		return (singularValues[((n) - 1)]) / (singularValues[0]);
	}

	public int getRank() {
		int r = 0;
		for (int i = 0; i < (singularValues.length); i++) {
			if ((singularValues[i]) > (tol)) {
				r++;
			}
		}
		return r;
	}

	public org.apache.commons.math.linear.DecompositionSolver getSolver() {
		return new org.apache.commons.math.linear.SingularValueDecomposition.Solver(singularValues, getUT(), getV(), ((getRank()) == (m)), tol);
	}

	private static class Solver implements org.apache.commons.math.linear.DecompositionSolver {
		private final org.apache.commons.math.linear.RealMatrix pseudoInverse;

		private boolean nonSingular;

		private Solver(final double[] singularValues, final org.apache.commons.math.linear.RealMatrix uT, final org.apache.commons.math.linear.RealMatrix v, final boolean nonSingular, final double tol) {
			final double[][] suT = uT.getData();
			for (int i = 0; i < (singularValues.length); ++i) {
				final double a;
				if ((singularValues[i]) > tol) {
					a = 1 / (singularValues[i]);
				}else {
					a = 0;
				}
				final double[] suTi = suT[i];
				for (int j = 0; j < (suTi.length); ++j) {
					suTi[j] *= a;
				}
			}
			pseudoInverse = v.multiply(new org.apache.commons.math.linear.Array2DRowRealMatrix(suT, false));
			org.apache.commons.math.linear.SingularValueDecomposition.Solver.this.nonSingular = nonSingular;
		}

		public org.apache.commons.math.linear.RealVector solve(final org.apache.commons.math.linear.RealVector b) {
			return pseudoInverse.operate(b);
		}

		public org.apache.commons.math.linear.RealMatrix solve(final org.apache.commons.math.linear.RealMatrix b) {
			return pseudoInverse.multiply(b);
		}

		public boolean isNonSingular() {
			return nonSingular;
		}

		public org.apache.commons.math.linear.RealMatrix getInverse() {
			return pseudoInverse;
		}
	}
}

