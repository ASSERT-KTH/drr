

package org.apache.commons.math.linear;


public class SingularValueDecompositionImpl implements org.apache.commons.math.linear.SingularValueDecomposition {
	private int m;

	private int n;

	private org.apache.commons.math.linear.BiDiagonalTransformer transformer;

	private double[] mainBidiagonal;

	private double[] secondaryBidiagonal;

	private double[] mainTridiagonal;

	private double[] secondaryTridiagonal;

	private org.apache.commons.math.linear.EigenDecomposition eigenDecomposition;

	private double[] singularValues;

	private org.apache.commons.math.linear.RealMatrix cachedU;

	private org.apache.commons.math.linear.RealMatrix cachedUt;

	private org.apache.commons.math.linear.RealMatrix cachedS;

	private org.apache.commons.math.linear.RealMatrix cachedV;

	private org.apache.commons.math.linear.RealMatrix cachedVt;

	public SingularValueDecompositionImpl(final org.apache.commons.math.linear.RealMatrix matrix) throws org.apache.commons.math.linear.InvalidMatrixException {
		this(matrix, java.lang.Math.min(matrix.getRowDimension(), matrix.getColumnDimension()));
	}

	public SingularValueDecompositionImpl(final org.apache.commons.math.linear.RealMatrix matrix, final int max) throws org.apache.commons.math.linear.InvalidMatrixException {
		m = matrix.getRowDimension();
		n = matrix.getColumnDimension();
		cachedU = null;
		cachedS = null;
		cachedV = null;
		cachedVt = null;
		transformer = new org.apache.commons.math.linear.BiDiagonalTransformer(matrix);
		mainBidiagonal = transformer.getMainDiagonalRef();
		secondaryBidiagonal = transformer.getSecondaryDiagonalRef();
		mainTridiagonal = new double[mainBidiagonal.length];
		secondaryTridiagonal = new double[(mainBidiagonal.length) - 1];
		double a = mainBidiagonal[0];
		mainTridiagonal[0] = a * a;
		for (int i = 1; i < (mainBidiagonal.length); ++i) {
			final double b = secondaryBidiagonal[(i - 1)];
			secondaryTridiagonal[(i - 1)] = a * b;
			a = mainBidiagonal[i];
			mainTridiagonal[i] = (a * a) + (b * b);
		}
		eigenDecomposition = new org.apache.commons.math.linear.EigenDecompositionImpl(mainTridiagonal, secondaryTridiagonal, org.apache.commons.math.util.MathUtils.SAFE_MIN);
		final double[] eigenValues = eigenDecomposition.getRealEigenvalues();
		int p = java.lang.Math.min(max, eigenValues.length);
		while ((p > 0) && ((eigenValues[(p - 1)]) <= 0)) {
			--p;
		} 
		singularValues = new double[p];
		for (int i = 0; i < p; ++i) {
			singularValues[i] = java.lang.Math.sqrt(eigenValues[i]);
		}
	}

	public org.apache.commons.math.linear.RealMatrix getU() throws org.apache.commons.math.linear.InvalidMatrixException {
		if ((cachedU) == null) {
			final int p = singularValues.length;
			if ((m) >= (n)) {
				final org.apache.commons.math.linear.RealMatrix e = eigenDecomposition.getV().getSubMatrix(0, ((n) - 1), 0, (p - 1));
				final double[][] eData = e.getData();
				final double[][] wData = new double[m][p];
				double[] ei1 = eData[0];
				for (int i = 0; i < p; ++i) {
					final double mi = mainBidiagonal[i];
					final double[] ei0 = ei1;
					final double[] wi = wData[i];
					if (i < ((n) - 1)) {
						ei1 = eData[(i + 1)];
						final double si = secondaryBidiagonal[i];
						for (int j = 0; j < p; ++j) {
							wi[j] = ((mi * (ei0[j])) + (si * (ei1[j]))) / (singularValues[j]);
						}
					}else {
						for (int j = 0; j < p; ++j) {
							wi[j] = (mi * (ei0[j])) / (singularValues[j]);
						}
					}
				}
				for (int i = p; i < (m); ++i) {
					wData[i] = new double[p];
				}
				cachedU = transformer.getU().multiply(org.apache.commons.math.linear.MatrixUtils.createRealMatrix(wData));
			}else {
				final org.apache.commons.math.linear.RealMatrix e = eigenDecomposition.getV().getSubMatrix(0, ((m) - 1), 0, (p - 1));
				cachedU = transformer.getU().multiply(e);
			}
		}
		return cachedU;
	}

	public org.apache.commons.math.linear.RealMatrix getUT() throws org.apache.commons.math.linear.InvalidMatrixException {
		if ((cachedUt) == null) {
			cachedUt = getU().transpose();
		}
		return cachedUt;
	}

	public org.apache.commons.math.linear.RealMatrix getS() throws org.apache.commons.math.linear.InvalidMatrixException {
		if ((cachedS) == null) {
			cachedS = org.apache.commons.math.linear.MatrixUtils.createRealDiagonalMatrix(singularValues);
		}
		return cachedS;
	}

	public double[] getSingularValues() throws org.apache.commons.math.linear.InvalidMatrixException {
		return singularValues.clone();
	}

	public org.apache.commons.math.linear.RealMatrix getV() throws org.apache.commons.math.linear.InvalidMatrixException {
		if ((cachedV) == null) {
			final int p = singularValues.length;
			if ((m) >= (n)) {
				final org.apache.commons.math.linear.RealMatrix e = eigenDecomposition.getV().getSubMatrix(0, ((n) - 1), 0, (p - 1));
				cachedV = transformer.getV().multiply(e);
			}else {
				final org.apache.commons.math.linear.RealMatrix e = eigenDecomposition.getV().getSubMatrix(0, ((m) - 1), 0, (p - 1));
				final double[][] eData = e.getData();
				final double[][] wData = new double[n][p];
				double[] ei1 = eData[0];
				for (int i = 0; i < p; ++i) {
					final double mi = mainBidiagonal[i];
					final double[] ei0 = ei1;
					final double[] wi = wData[i];
					if (i < ((m) - 1)) {
						ei1 = eData[(i + 1)];
						final double si = secondaryBidiagonal[i];
						for (int j = 0; j < p; ++j) {
							wi[j] = ((mi * (ei0[j])) + (si * (ei1[j]))) / (singularValues[j]);
						}
					}else {
						for (int j = 0; j < p; ++j) {
							wi[j] = (mi * (ei0[j])) / (singularValues[j]);
						}
					}
				}
				for (int i = p; i < (n); ++i) {
					wData[i] = new double[p];
				}
				cachedV = transformer.getV().multiply(org.apache.commons.math.linear.MatrixUtils.createRealMatrix(wData));
			}
		}
		return cachedV;
	}

	public org.apache.commons.math.linear.RealMatrix getVT() throws org.apache.commons.math.linear.InvalidMatrixException {
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
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("cutoff singular value is {0}, should be at most {1}", minSingularValue, singularValues[0]);
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

	public double getNorm() throws org.apache.commons.math.linear.InvalidMatrixException {
		return singularValues[0];
	}

	public double getConditionNumber() throws org.apache.commons.math.linear.InvalidMatrixException {
		return (singularValues[0]) / (singularValues[((singularValues.length) - 1)]);
	}

	public int getRank() throws java.lang.IllegalStateException {
		final double threshold = (java.lang.Math.max(m, n)) * (java.lang.Math.ulp(singularValues[0]));
		for (int i = (singularValues.length) - 1; i >= 0; --i) {
			if ((singularValues[i]) > threshold) {
				return i + 1;
			}
		}
		return 0;
	}

	public org.apache.commons.math.linear.DecompositionSolver getSolver() {
		return new org.apache.commons.math.linear.SingularValueDecompositionImpl.Solver(singularValues, getUT(), getV(), ((getRank()) == (java.lang.Math.max(m, n))));
	}

	private static class Solver implements org.apache.commons.math.linear.DecompositionSolver {
		private final org.apache.commons.math.linear.RealMatrix pseudoInverse;

		private boolean nonSingular;

		private Solver(final double[] singularValues, final org.apache.commons.math.linear.RealMatrix uT, final org.apache.commons.math.linear.RealMatrix v, final boolean nonSingular) {
			double[][] suT = uT.getData();
			for (int i = 0; i < (singularValues.length); ++i) {
				final double a = 1.0 / (singularValues[i]);
				final double[] suTi = suT[i];
				for (int j = 0; j < (suTi.length); ++j) {
					suTi[j] *= a;
				}
			}
			pseudoInverse = v.multiply(new org.apache.commons.math.linear.Array2DRowRealMatrix(suT, false));
			org.apache.commons.math.linear.SingularValueDecompositionImpl.Solver.this.nonSingular = nonSingular;
		}

		public double[] solve(final double[] b) throws java.lang.IllegalArgumentException {
			return pseudoInverse.operate(b);
		}

		public org.apache.commons.math.linear.RealVector solve(final org.apache.commons.math.linear.RealVector b) throws java.lang.IllegalArgumentException {
			return pseudoInverse.operate(b);
		}

		public org.apache.commons.math.linear.RealMatrix solve(final org.apache.commons.math.linear.RealMatrix b) throws java.lang.IllegalArgumentException {
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

