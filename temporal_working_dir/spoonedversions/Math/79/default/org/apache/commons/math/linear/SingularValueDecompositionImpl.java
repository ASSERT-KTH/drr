

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

	public SingularValueDecompositionImpl(org.apache.commons.math.linear.RealMatrix matrix) throws org.apache.commons.math.linear.InvalidMatrixException {
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
		singularValues = eigenDecomposition.getRealEigenvalues();
		for (int i = 0; i < (singularValues.length); ++i) {
			singularValues[i] = java.lang.Math.sqrt(singularValues[i]);
		}
	}

	public org.apache.commons.math.linear.RealMatrix getU() throws org.apache.commons.math.linear.InvalidMatrixException {
		if ((cachedU) == null) {
			if ((m) >= (n)) {
				final double[][] eData = eigenDecomposition.getV().getData();
				final double[][] iData = new double[m][];
				double[] ei1 = eData[0];
				iData[0] = ei1;
				for (int i = 0; i < ((n) - 1); ++i) {
					final double[] ei0 = ei1;
					ei1 = eData[(i + 1)];
					iData[(i + 1)] = ei1;
					for (int j = 0; j < (n); ++j) {
						ei0[j] = (((mainBidiagonal[i]) * (ei0[j])) + ((secondaryBidiagonal[i]) * (ei1[j]))) / (singularValues[j]);
					}
				}
				final double lastMain = mainBidiagonal[((n) - 1)];
				for (int j = 0; j < (n); ++j) {
					ei1[j] *= lastMain / (singularValues[j]);
				}
				for (int i = n; i < (m); ++i) {
					iData[i] = new double[n];
				}
				cachedU = transformer.getU().multiply(org.apache.commons.math.linear.MatrixUtils.createRealMatrix(iData));
			}else {
				cachedU = transformer.getU().multiply(eigenDecomposition.getV());
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
			if ((m) >= (n)) {
				cachedV = transformer.getV().multiply(eigenDecomposition.getV());
			}else {
				final double[][] eData = eigenDecomposition.getV().getData();
				final double[][] iData = new double[n][];
				double[] ei1 = eData[0];
				iData[0] = ei1;
				for (int i = 0; i < ((m) - 1); ++i) {
					final double[] ei0 = ei1;
					ei1 = eData[(i + 1)];
					iData[(i + 1)] = ei1;
					for (int j = 0; j < (m); ++j) {
						ei0[j] = (((mainBidiagonal[i]) * (ei0[j])) + ((secondaryBidiagonal[i]) * (ei1[j]))) / (singularValues[j]);
					}
				}
				final double lastMain = mainBidiagonal[((m) - 1)];
				for (int j = 0; j < (m); ++j) {
					ei1[j] *= lastMain / (singularValues[j]);
				}
				for (int i = m; i < (n); ++i) {
					iData[i] = new double[m];
				}
				cachedV = transformer.getV().multiply(org.apache.commons.math.linear.MatrixUtils.createRealMatrix(iData));
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
		int dimension = 0;
		while ((dimension < (n)) && ((singularValues[dimension]) >= minSingularValue)) {
			++dimension;
		} 
		if (dimension == 0) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("cutoff singular value is {0}, should be at most {1}", minSingularValue, singularValues[0]);
		}
		final double[][] data = new double[dimension][n];
		getVT().walkInOptimizedOrder(new org.apache.commons.math.linear.DefaultRealMatrixPreservingVisitor() {
			@java.lang.Override
			public void visit(final int row, final int column, final double value) {
				data[row][column] = value / (singularValues[row]);
			}
		}, 0, (dimension - 1), 0, ((n) - 1));
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
		return new org.apache.commons.math.linear.SingularValueDecompositionImpl.Solver(singularValues, getUT(), getV(), ((getRank()) == (singularValues.length)));
	}

	private static class Solver implements org.apache.commons.math.linear.DecompositionSolver {
		private final double[] singularValues;

		private final org.apache.commons.math.linear.RealMatrix uT;

		private final org.apache.commons.math.linear.RealMatrix v;

		private boolean nonSingular;

		private Solver(final double[] singularValues, final org.apache.commons.math.linear.RealMatrix uT, final org.apache.commons.math.linear.RealMatrix v, final boolean nonSingular) {
			this.singularValues = singularValues;
			this.uT = uT;
			this.v = v;
			org.apache.commons.math.linear.SingularValueDecompositionImpl.Solver.this.nonSingular = nonSingular;
		}

		public double[] solve(final double[] b) throws java.lang.IllegalArgumentException, org.apache.commons.math.linear.InvalidMatrixException {
			if ((b.length) != (singularValues.length)) {
				throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("vector length mismatch: got {0} but expected {1}", b.length, singularValues.length);
			}
			final double[] w = uT.operate(b);
			for (int i = 0; i < (singularValues.length); ++i) {
				final double si = singularValues[i];
				if (si == 0) {
					throw new org.apache.commons.math.linear.SingularMatrixException();
				}
				w[i] /= si;
			}
			return v.operate(w);
		}

		public org.apache.commons.math.linear.RealVector solve(final org.apache.commons.math.linear.RealVector b) throws java.lang.IllegalArgumentException, org.apache.commons.math.linear.InvalidMatrixException {
			if ((b.getDimension()) != (singularValues.length)) {
				throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("vector length mismatch: got {0} but expected {1}", b.getDimension(), singularValues.length);
			}
			final org.apache.commons.math.linear.RealVector w = uT.operate(b);
			for (int i = 0; i < (singularValues.length); ++i) {
				final double si = singularValues[i];
				if (si == 0) {
					throw new org.apache.commons.math.linear.SingularMatrixException();
				}
				w.setEntry(i, ((w.getEntry(i)) / si));
			}
			return v.operate(w);
		}

		public org.apache.commons.math.linear.RealMatrix solve(final org.apache.commons.math.linear.RealMatrix b) throws java.lang.IllegalArgumentException, org.apache.commons.math.linear.InvalidMatrixException {
			if ((b.getRowDimension()) != (singularValues.length)) {
				throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("dimensions mismatch: got {0}x{1} but expected {2}x{3}", b.getRowDimension(), b.getColumnDimension(), singularValues.length, "n");
			}
			final org.apache.commons.math.linear.RealMatrix w = uT.multiply(b);
			for (int i = 0; i < (singularValues.length); ++i) {
				final double si = singularValues[i];
				if (si == 0) {
					throw new org.apache.commons.math.linear.SingularMatrixException();
				}
				final double inv = 1.0 / si;
				for (int j = 0; j < (b.getColumnDimension()); ++j) {
					w.multiplyEntry(i, j, inv);
				}
			}
			return v.multiply(w);
		}

		public boolean isNonSingular() {
			return nonSingular;
		}

		public org.apache.commons.math.linear.RealMatrix getInverse() throws org.apache.commons.math.linear.InvalidMatrixException {
			if (!(isNonSingular())) {
				throw new org.apache.commons.math.linear.SingularMatrixException();
			}
			return solve(org.apache.commons.math.linear.MatrixUtils.createRealIdentityMatrix(singularValues.length));
		}
	}
}

