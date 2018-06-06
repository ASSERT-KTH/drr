

package org.apache.commons.math.linear;


public class EigenDecompositionImpl implements org.apache.commons.math.linear.EigenDecomposition {
	private static final double TOLERANCE = 100 * (org.apache.commons.math.util.MathUtils.EPSILON);

	private static final double TOLERANCE_2 = (org.apache.commons.math.linear.EigenDecompositionImpl.TOLERANCE) * (org.apache.commons.math.linear.EigenDecompositionImpl.TOLERANCE);

	private double splitTolerance;

	private double[] main;

	private double[] secondary;

	private double[] squaredSecondary;

	private org.apache.commons.math.linear.TriDiagonalTransformer transformer;

	private double lowerSpectra;

	private double upperSpectra;

	private double minPivot;

	private double sigma;

	private double sigmaLow;

	private double tau;

	private double[] work;

	private int pingPong;

	private double qMax;

	private double eMin;

	private int tType;

	private double dMin;

	private double dMin1;

	private double dMin2;

	private double dN;

	private double dN1;

	private double dN2;

	private double g;

	private double[] realEigenvalues;

	private double[] imagEigenvalues;

	private org.apache.commons.math.linear.ArrayRealVector[] eigenvectors;

	private org.apache.commons.math.linear.RealMatrix cachedV;

	private org.apache.commons.math.linear.RealMatrix cachedD;

	private org.apache.commons.math.linear.RealMatrix cachedVt;

	public EigenDecompositionImpl(final org.apache.commons.math.linear.RealMatrix matrix, final double splitTolerance) throws org.apache.commons.math.linear.InvalidMatrixException {
		if (isSymmetric(matrix)) {
			org.apache.commons.math.linear.EigenDecompositionImpl.this.splitTolerance = splitTolerance;
			transformToTridiagonal(matrix);
			decompose();
		}else {
			throw new org.apache.commons.math.linear.InvalidMatrixException("eigen decomposition of assymetric matrices not supported yet");
		}
	}

	public EigenDecompositionImpl(final double[] main, double[] secondary, final double splitTolerance) throws org.apache.commons.math.linear.InvalidMatrixException {
		org.apache.commons.math.linear.EigenDecompositionImpl.this.main = main.clone();
		org.apache.commons.math.linear.EigenDecompositionImpl.this.secondary = secondary.clone();
		transformer = null;
		squaredSecondary = new double[secondary.length];
		for (int i = 0; i < (squaredSecondary.length); ++i) {
			final double s = secondary[i];
			squaredSecondary[i] = s * s;
		}
		org.apache.commons.math.linear.EigenDecompositionImpl.this.splitTolerance = splitTolerance;
		decompose();
	}

	private boolean isSymmetric(final org.apache.commons.math.linear.RealMatrix matrix) {
		final int rows = matrix.getRowDimension();
		final int columns = matrix.getColumnDimension();
		final double eps = ((10 * rows) * columns) * (org.apache.commons.math.util.MathUtils.EPSILON);
		for (int i = 0; i < rows; ++i) {
			for (int j = i + 1; j < columns; ++j) {
				final double mij = matrix.getEntry(i, j);
				final double mji = matrix.getEntry(j, i);
				if ((java.lang.Math.abs((mij - mji))) > ((java.lang.Math.max(java.lang.Math.abs(mij), java.lang.Math.abs(mji))) * eps)) {
					return false;
				}
			}
		}
		return true;
	}

	private void decompose() {
		cachedV = null;
		cachedD = null;
		cachedVt = null;
		work = new double[6 * (main.length)];
		computeGershgorinCircles();
		findEigenvalues();
		eigenvectors = null;
	}

	public org.apache.commons.math.linear.RealMatrix getV() throws org.apache.commons.math.linear.InvalidMatrixException {
		if ((cachedV) == null) {
			if ((eigenvectors) == null) {
				findEigenVectors();
			}
			final int m = eigenvectors.length;
			cachedV = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(m, m);
			for (int k = 0; k < m; ++k) {
				cachedV.setColumnVector(k, eigenvectors[k]);
			}
		}
		return cachedV;
	}

	public org.apache.commons.math.linear.RealMatrix getD() throws org.apache.commons.math.linear.InvalidMatrixException {
		if ((cachedD) == null) {
			cachedD = org.apache.commons.math.linear.MatrixUtils.createRealDiagonalMatrix(realEigenvalues);
		}
		return cachedD;
	}

	public org.apache.commons.math.linear.RealMatrix getVT() throws org.apache.commons.math.linear.InvalidMatrixException {
		if ((cachedVt) == null) {
			if ((eigenvectors) == null) {
				findEigenVectors();
			}
			final int m = eigenvectors.length;
			cachedVt = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(m, m);
			for (int k = 0; k < m; ++k) {
				cachedVt.setRowVector(k, eigenvectors[k]);
			}
		}
		return cachedVt;
	}

	public double[] getRealEigenvalues() throws org.apache.commons.math.linear.InvalidMatrixException {
		return realEigenvalues.clone();
	}

	public double getRealEigenvalue(final int i) throws java.lang.ArrayIndexOutOfBoundsException, org.apache.commons.math.linear.InvalidMatrixException {
		return realEigenvalues[i];
	}

	public double[] getImagEigenvalues() throws org.apache.commons.math.linear.InvalidMatrixException {
		return imagEigenvalues.clone();
	}

	public double getImagEigenvalue(final int i) throws java.lang.ArrayIndexOutOfBoundsException, org.apache.commons.math.linear.InvalidMatrixException {
		return imagEigenvalues[i];
	}

	public org.apache.commons.math.linear.RealVector getEigenvector(final int i) throws java.lang.ArrayIndexOutOfBoundsException, org.apache.commons.math.linear.InvalidMatrixException {
		if ((eigenvectors) == null) {
			findEigenVectors();
		}
		return eigenvectors[i].copy();
	}

	public double getDeterminant() {
		double determinant = 1;
		for (double lambda : realEigenvalues) {
			determinant *= lambda;
		}
		return determinant;
	}

	public org.apache.commons.math.linear.DecompositionSolver getSolver() {
		if ((eigenvectors) == null) {
			findEigenVectors();
		}
		return new org.apache.commons.math.linear.EigenDecompositionImpl.Solver(realEigenvalues, imagEigenvalues, eigenvectors);
	}

	private static class Solver implements org.apache.commons.math.linear.DecompositionSolver {
		private double[] realEigenvalues;

		private double[] imagEigenvalues;

		private final org.apache.commons.math.linear.ArrayRealVector[] eigenvectors;

		private Solver(final double[] realEigenvalues, final double[] imagEigenvalues, final org.apache.commons.math.linear.ArrayRealVector[] eigenvectors) {
			org.apache.commons.math.linear.EigenDecompositionImpl.Solver.this.realEigenvalues = realEigenvalues;
			org.apache.commons.math.linear.EigenDecompositionImpl.Solver.this.imagEigenvalues = imagEigenvalues;
			this.eigenvectors = eigenvectors;
		}

		public double[] solve(final double[] b) throws java.lang.IllegalArgumentException, org.apache.commons.math.linear.InvalidMatrixException {
			if (!(isNonSingular())) {
				throw new org.apache.commons.math.linear.SingularMatrixException();
			}
			final int m = realEigenvalues.length;
			if ((b.length) != m) {
				throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("vector length mismatch: got {0} but expected {1}", b.length, m);
			}
			final double[] bp = new double[m];
			for (int i = 0; i < m; ++i) {
				final org.apache.commons.math.linear.ArrayRealVector v = eigenvectors[i];
				final double[] vData = v.getDataRef();
				final double s = (v.dotProduct(b)) / (realEigenvalues[i]);
				for (int j = 0; j < m; ++j) {
					bp[j] += s * (vData[j]);
				}
			}
			return bp;
		}

		public org.apache.commons.math.linear.RealVector solve(final org.apache.commons.math.linear.RealVector b) throws java.lang.IllegalArgumentException, org.apache.commons.math.linear.InvalidMatrixException {
			if (!(isNonSingular())) {
				throw new org.apache.commons.math.linear.SingularMatrixException();
			}
			final int m = realEigenvalues.length;
			if ((b.getDimension()) != m) {
				throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("vector length mismatch: got {0} but expected {1}", b.getDimension(), m);
			}
			final double[] bp = new double[m];
			for (int i = 0; i < m; ++i) {
				final org.apache.commons.math.linear.ArrayRealVector v = eigenvectors[i];
				final double[] vData = v.getDataRef();
				final double s = (v.dotProduct(b)) / (realEigenvalues[i]);
				for (int j = 0; j < m; ++j) {
					bp[j] += s * (vData[j]);
				}
			}
			return new org.apache.commons.math.linear.ArrayRealVector(bp, false);
		}

		public org.apache.commons.math.linear.RealMatrix solve(final org.apache.commons.math.linear.RealMatrix b) throws java.lang.IllegalArgumentException, org.apache.commons.math.linear.InvalidMatrixException {
			if (!(isNonSingular())) {
				throw new org.apache.commons.math.linear.SingularMatrixException();
			}
			final int m = realEigenvalues.length;
			if ((b.getRowDimension()) != m) {
				throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("dimensions mismatch: got {0}x{1} but expected {2}x{3}", b.getRowDimension(), b.getColumnDimension(), m, "n");
			}
			final int nColB = b.getColumnDimension();
			final double[][] bp = new double[m][nColB];
			for (int k = 0; k < nColB; ++k) {
				for (int i = 0; i < m; ++i) {
					final org.apache.commons.math.linear.ArrayRealVector v = eigenvectors[i];
					final double[] vData = v.getDataRef();
					double s = 0;
					for (int j = 0; j < m; ++j) {
						s += (v.getEntry(j)) * (b.getEntry(j, k));
					}
					s /= realEigenvalues[i];
					for (int j = 0; j < m; ++j) {
						bp[j][k] += s * (vData[j]);
					}
				}
			}
			return org.apache.commons.math.linear.MatrixUtils.createRealMatrix(bp);
		}

		public boolean isNonSingular() {
			for (int i = 0; i < (realEigenvalues.length); ++i) {
				if (((realEigenvalues[i]) == 0) && ((imagEigenvalues[i]) == 0)) {
					return false;
				}
			}
			return true;
		}

		public org.apache.commons.math.linear.RealMatrix getInverse() throws org.apache.commons.math.linear.InvalidMatrixException {
			if (!(isNonSingular())) {
				throw new org.apache.commons.math.linear.SingularMatrixException();
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
			return org.apache.commons.math.linear.MatrixUtils.createRealMatrix(invData);
		}
	}

	private void transformToTridiagonal(final org.apache.commons.math.linear.RealMatrix matrix) {
		transformer = new org.apache.commons.math.linear.TriDiagonalTransformer(matrix);
		main = transformer.getMainDiagonalRef();
		secondary = transformer.getSecondaryDiagonalRef();
		squaredSecondary = new double[secondary.length];
		for (int i = 0; i < (squaredSecondary.length); ++i) {
			final double s = secondary[i];
			squaredSecondary[i] = s * s;
		}
	}

	private void computeGershgorinCircles() {
		final int m = main.length;
		final int lowerStart = 4 * m;
		final int upperStart = 5 * m;
		lowerSpectra = java.lang.Double.POSITIVE_INFINITY;
		upperSpectra = java.lang.Double.NEGATIVE_INFINITY;
		double eMax = 0;
		double eCurrent = 0;
		for (int i = 0; i < (m - 1); ++i) {
			final double dCurrent = main[i];
			final double ePrevious = eCurrent;
			eCurrent = java.lang.Math.abs(secondary[i]);
			eMax = java.lang.Math.max(eMax, eCurrent);
			final double radius = ePrevious + eCurrent;
			final double lower = dCurrent - radius;
			work[(lowerStart + i)] = lower;
			lowerSpectra = java.lang.Math.min(lowerSpectra, lower);
			final double upper = dCurrent + radius;
			work[(upperStart + i)] = upper;
			upperSpectra = java.lang.Math.max(upperSpectra, upper);
		}
		final double dCurrent = main[(m - 1)];
		final double lower = dCurrent - eCurrent;
		work[((lowerStart + m) - 1)] = lower;
		lowerSpectra = java.lang.Math.min(lowerSpectra, lower);
		final double upper = dCurrent + eCurrent;
		work[((upperStart + m) - 1)] = upper;
		upperSpectra = java.lang.Math.max(upperSpectra, upper);
		minPivot = (org.apache.commons.math.util.MathUtils.SAFE_MIN) * (java.lang.Math.max(1.0, (eMax * eMax)));
	}

	private void findEigenvalues() throws org.apache.commons.math.linear.InvalidMatrixException {
		java.util.List<java.lang.Integer> splitIndices = computeSplits();
		realEigenvalues = new double[main.length];
		imagEigenvalues = new double[main.length];
		int begin = 0;
		for (final int end : splitIndices) {
			final int n = end - begin;
			switch (n) {
				case 1 :
					process1RowBlock(begin);
					break;
				case 2 :
					process2RowsBlock(begin);
					break;
				case 3 :
					process3RowsBlock(begin);
					break;
				default :
					final double[] range = eigenvaluesRange(begin, n);
					final double oneFourth = 0.25 * ((3 * (range[0])) + (range[1]));
					final int oneFourthCount = countEigenValues(oneFourth, begin, n);
					final double threeFourth = 0.25 * ((range[0]) + (3 * (range[1])));
					final int threeFourthCount = countEigenValues(threeFourth, begin, n);
					final boolean chooseLeft = (oneFourthCount - 1) >= (n - threeFourthCount);
					final double lambda = chooseLeft ? range[0] : range[1];
					tau = ((((range[1]) - (range[0])) * (org.apache.commons.math.util.MathUtils.EPSILON)) * n) + (2 * (minPivot));
					ldlTDecomposition(lambda, begin, n);
					processGeneralBlock(n);
					if (chooseLeft) {
						for (int i = 0; i < n; ++i) {
							realEigenvalues[(begin + i)] = lambda + (work[(4 * i)]);
						}
					}else {
						for (int i = 0; i < n; ++i) {
							realEigenvalues[(begin + i)] = lambda - (work[(4 * i)]);
						}
					}
			}
			begin = end;
		}
		java.util.Arrays.sort(realEigenvalues);
		int j = (realEigenvalues.length) - 1;
		for (int i = 0; i < j; ++i) {
			final double tmp = realEigenvalues[i];
			realEigenvalues[i] = realEigenvalues[j];
			realEigenvalues[j] = tmp;
			--j;
		}
	}

	private java.util.List<java.lang.Integer> computeSplits() {
		final java.util.List<java.lang.Integer> list = new java.util.ArrayList<java.lang.Integer>();
		double absDCurrent = java.lang.Math.abs(main[0]);
		for (int i = 0; i < (secondary.length); ++i) {
			final double absDPrevious = absDCurrent;
			absDCurrent = java.lang.Math.abs(main[(i + 1)]);
			final double max = (splitTolerance) * (java.lang.Math.sqrt((absDPrevious * absDCurrent)));
			if ((java.lang.Math.abs(secondary[i])) <= max) {
				list.add((i + 1));
				secondary[i] = 0;
				squaredSecondary[i] = 0;
			}
		}
		list.add(((secondary.length) + 1));
		return list;
	}

	private void process1RowBlock(final int index) {
		realEigenvalues[index] = main[index];
	}

	private void process2RowsBlock(final int index) throws org.apache.commons.math.linear.InvalidMatrixException {
		final double q0 = main[index];
		final double q1 = main[(index + 1)];
		final double e12 = squaredSecondary[index];
		final double s = q0 + q1;
		final double p = (q0 * q1) - e12;
		final double delta = (s * s) - (4 * p);
		if (delta < 0) {
			throw new org.apache.commons.math.linear.InvalidMatrixException("cannot solve degree {0} equation", 2);
		}
		final double largestRoot = 0.5 * (s + (java.lang.Math.sqrt(delta)));
		realEigenvalues[index] = largestRoot;
		realEigenvalues[(index + 1)] = p / largestRoot;
	}

	private void process3RowsBlock(final int index) throws org.apache.commons.math.linear.InvalidMatrixException {
		final double q0 = main[index];
		final double q1 = main[(index + 1)];
		final double q2 = main[(index + 2)];
		final double e12 = squaredSecondary[index];
		final double q1q2Me22 = (q1 * q2) - (squaredSecondary[(index + 1)]);
		final double b = -((q0 + q1) + q2);
		final double c = (((q0 * q1) + (q0 * q2)) + q1q2Me22) - e12;
		final double d = (q2 * e12) - (q0 * q1q2Me22);
		final double b2 = b * b;
		final double q = ((3 * c) - b2) / 9;
		final double r = ((((9 * c) - (2 * b2)) * b) - (27 * d)) / 54;
		final double delta = ((q * q) * q) + (r * r);
		if (delta >= 0) {
			throw new org.apache.commons.math.linear.InvalidMatrixException("cannot solve degree {0} equation", 3);
		}
		final double sqrtMq = java.lang.Math.sqrt((-q));
		final double theta = java.lang.Math.acos((r / ((-q) * sqrtMq)));
		final double alpha = 2 * sqrtMq;
		final double beta = b / 3;
		double z0 = (alpha * (java.lang.Math.cos((theta / 3)))) - beta;
		double z1 = (alpha * (java.lang.Math.cos(((theta + (2 * (java.lang.Math.PI))) / 3)))) - beta;
		double z2 = (alpha * (java.lang.Math.cos(((theta + (4 * (java.lang.Math.PI))) / 3)))) - beta;
		if (z0 < z1) {
			final double t = z0;
			z0 = z1;
			z1 = t;
		}
		if (z1 < z2) {
			final double t = z1;
			z1 = z2;
			z2 = t;
		}
		if (z0 < z1) {
			final double t = z0;
			z0 = z1;
			z1 = t;
		}
		realEigenvalues[index] = z0;
		realEigenvalues[(index + 1)] = z1;
		realEigenvalues[(index + 2)] = z2;
	}

	private void processGeneralBlock(final int n) throws org.apache.commons.math.linear.InvalidMatrixException {
		double sumOffDiag = 0;
		for (int i = 0; i < (n - 1); ++i) {
			final int fourI = 4 * i;
			final double ei = work[(fourI + 2)];
			sumOffDiag += ei;
		}
		if (sumOffDiag == 0) {
			return ;
		}
		flipEveryOtherIfWarranted(n);
		initialSplits(n);
		tType = 0;
		dMin1 = 0;
		dMin2 = 0;
		dN = 0;
		dN1 = 0;
		dN2 = 0;
		tau = 0;
		int i0 = 0;
		int n0 = n;
		while (n0 > 0) {
			sigma = (n0 == n) ? 0 : -(work[((4 * n0) - 2)]);
			sigmaLow = 0;
			double offDiagMin = i0 == n0 ? 0 : work[((4 * n0) - 6)];
			double offDiagMax = 0;
			double diagMax = work[((4 * n0) - 4)];
			double diagMin = diagMax;
			i0 = 0;
			for (int i = 4 * (n0 - 2); i >= 0; i -= 4) {
				if ((work[(i + 2)]) <= 0) {
					i0 = 1 + (i / 4);
					break;
				}
				if (diagMin >= (4 * offDiagMax)) {
					diagMin = java.lang.Math.min(diagMin, work[(i + 4)]);
					offDiagMax = java.lang.Math.max(offDiagMax, work[(i + 2)]);
				}
				diagMax = java.lang.Math.max(diagMax, ((work[i]) + (work[(i + 2)])));
				offDiagMin = java.lang.Math.min(offDiagMin, work[(i + 2)]);
			}
			work[((4 * n0) - 2)] = offDiagMin;
			dMin = -(java.lang.Math.max(0, (diagMin - (2 * (java.lang.Math.sqrt((diagMin * offDiagMax)))))));
			pingPong = 0;
			int maxIter = 30 * (n0 - i0);
			for (int k = 0; i0 < n0; ++k) {
				if (k >= maxIter) {
					throw new org.apache.commons.math.linear.InvalidMatrixException(new org.apache.commons.math.MaxIterationsExceededException(maxIter));
				}
				n0 = goodStep(i0, n0);
				pingPong = 1 - (pingPong);
				if (((((pingPong) == 0) && ((n0 - i0) > 3)) && ((work[((4 * n0) - 1)]) <= ((org.apache.commons.math.linear.EigenDecompositionImpl.TOLERANCE_2) * diagMax))) && ((work[((4 * n0) - 2)]) <= ((org.apache.commons.math.linear.EigenDecompositionImpl.TOLERANCE_2) * (sigma)))) {
					int split = i0 - 1;
					diagMax = work[(4 * i0)];
					offDiagMin = work[((4 * i0) + 2)];
					double previousEMin = work[((4 * i0) + 3)];
					for (int i = 4 * i0; i < ((4 * n0) - 16); i += 4) {
						if (((work[(i + 3)]) <= ((org.apache.commons.math.linear.EigenDecompositionImpl.TOLERANCE_2) * (work[i]))) || ((work[(i + 2)]) <= ((org.apache.commons.math.linear.EigenDecompositionImpl.TOLERANCE_2) * (sigma)))) {
							work[(i + 2)] = -(sigma);
							split = i / 4;
							diagMax = 0;
							offDiagMin = work[(i + 6)];
							previousEMin = work[(i + 7)];
						}else {
							diagMax = java.lang.Math.max(diagMax, work[(i + 4)]);
							offDiagMin = java.lang.Math.min(offDiagMin, work[(i + 2)]);
							previousEMin = java.lang.Math.min(previousEMin, work[(i + 3)]);
						}
					}
					work[((4 * n0) - 2)] = offDiagMin;
					work[((4 * n0) - 1)] = previousEMin;
					i0 = split + 1;
				}
			}
		} 
	}

	private void initialSplits(final int n) {
		pingPong = 0;
		for (int k = 0; k < 2; ++k) {
			double d = work[((4 * (n - 1)) + (pingPong))];
			for (int i = (4 * (n - 2)) + (pingPong); i >= 0; i -= 4) {
				if ((work[(i + 2)]) <= ((org.apache.commons.math.linear.EigenDecompositionImpl.TOLERANCE_2) * d)) {
					work[(i + 2)] = -0.0;
					d = work[i];
				}else {
					d *= (work[i]) / (d + (work[(i + 2)]));
				}
			}
			d = work[pingPong];
			for (int i = 2 + (pingPong); i < ((4 * n) - 2); i += 4) {
				final int j = (i - (2 * (pingPong))) - 1;
				work[j] = d + (work[i]);
				if ((work[i]) <= ((org.apache.commons.math.linear.EigenDecompositionImpl.TOLERANCE_2) * d)) {
					work[i] = -0.0;
					work[j] = d;
					work[(j + 2)] = 0.0;
					d = work[(i + 2)];
				}else
					if ((((org.apache.commons.math.util.MathUtils.SAFE_MIN) * (work[(i + 2)])) < (work[j])) && (((org.apache.commons.math.util.MathUtils.SAFE_MIN) * (work[j])) < (work[(i + 2)]))) {
						final double tmp = (work[(i + 2)]) / (work[j]);
						work[(j + 2)] = (work[i]) * tmp;
						d *= tmp;
					}else {
						work[(j + 2)] = (work[(i + 2)]) * ((work[i]) / (work[j]));
						d *= (work[(i + 2)]) / (work[j]);
					}
				
			}
			work[(((4 * n) - 3) - (pingPong))] = d;
			pingPong = 1 - (pingPong);
		}
	}

	private int goodStep(final int start, final int end) {
		g = 0.0;
		int deflatedEnd = end;
		for (boolean deflating = true; deflating;) {
			if (start >= deflatedEnd) {
				return deflatedEnd;
			}
			final int k = ((4 * deflatedEnd) + (pingPong)) - 1;
			if ((start == (deflatedEnd - 1)) || ((start != (deflatedEnd - 2)) && (((work[(k - 5)]) <= ((org.apache.commons.math.linear.EigenDecompositionImpl.TOLERANCE_2) * ((sigma) + (work[(k - 3)])))) || ((work[((k - (2 * (pingPong))) - 4)]) <= ((org.apache.commons.math.linear.EigenDecompositionImpl.TOLERANCE_2) * (work[(k - 7)])))))) {
				work[((4 * deflatedEnd) - 4)] = (sigma) + (work[(((4 * deflatedEnd) - 4) + (pingPong))]);
				deflatedEnd -= 1;
			}else
				if (((start == (deflatedEnd - 2)) || ((work[(k - 9)]) <= ((org.apache.commons.math.linear.EigenDecompositionImpl.TOLERANCE_2) * (sigma)))) || ((work[((k - (2 * (pingPong))) - 8)]) <= ((org.apache.commons.math.linear.EigenDecompositionImpl.TOLERANCE_2) * (work[(k - 11)])))) {
					if ((work[(k - 3)]) > (work[(k - 7)])) {
						final double tmp = work[(k - 3)];
						work[(k - 3)] = work[(k - 7)];
						work[(k - 7)] = tmp;
					}
					if ((work[(k - 5)]) > ((org.apache.commons.math.linear.EigenDecompositionImpl.TOLERANCE_2) * (work[(k - 3)]))) {
						double t = 0.5 * (((work[(k - 7)]) - (work[(k - 3)])) + (work[(k - 5)]));
						double s = (work[(k - 3)]) * ((work[(k - 5)]) / t);
						if (s <= t) {
							s = ((work[(k - 3)]) * (work[(k - 5)])) / (t * (1 + (java.lang.Math.sqrt((1 + (s / t))))));
						}else {
							s = ((work[(k - 3)]) * (work[(k - 5)])) / (t + (java.lang.Math.sqrt((t * (t + s)))));
						}
						t = (work[(k - 7)]) + (s + (work[(k - 5)]));
						work[(k - 3)] *= (work[(k - 7)]) / t;
						work[(k - 7)] = t;
					}
					work[((4 * deflatedEnd) - 8)] = (sigma) + (work[(k - 7)]);
					work[((4 * deflatedEnd) - 4)] = (sigma) + (work[(k - 3)]);
					deflatedEnd -= 2;
				}else {
					deflating = false;
				}
			
		}
		final int l = ((4 * deflatedEnd) + (pingPong)) - 1;
		if (((dMin) <= 0) || (deflatedEnd < end)) {
			if (flipAllIfWarranted(deflatedEnd)) {
				dMin2 = java.lang.Math.min(dMin2, work[(l - 1)]);
				work[(l - 1)] = java.lang.Math.min(work[(l - 1)], java.lang.Math.min(work[(3 + (pingPong))], work[(7 + (pingPong))]));
				work[(l - (2 * (pingPong)))] = java.lang.Math.min(work[(l - (2 * (pingPong)))], java.lang.Math.min(work[(6 + (pingPong))], work[(6 + (pingPong))]));
				qMax = java.lang.Math.max(qMax, java.lang.Math.max(work[(3 + (pingPong))], work[(7 + (pingPong))]));
				dMin = -0.0;
			}
		}
		if (((dMin) < 0) || (((org.apache.commons.math.util.MathUtils.SAFE_MIN) * (qMax)) < (java.lang.Math.min(work[(l - 1)], java.lang.Math.min(work[(l - 9)], ((dMin2) + (work[(l - (2 * (pingPong)))]))))))) {
			computeShiftIncrement(start, deflatedEnd, (end - deflatedEnd));
			for (boolean loop = true; loop;) {
				dqds(start, deflatedEnd);
				if (((dMin) >= 0) && ((dMin1) > 0)) {
					updateSigma(tau);
					return deflatedEnd;
				}else
					if (((((dMin) < 0.0) && ((dMin1) > 0.0)) && ((work[(((4 * deflatedEnd) - 5) - (pingPong))]) < ((org.apache.commons.math.linear.EigenDecompositionImpl.TOLERANCE) * ((sigma) + (dN1))))) && ((java.lang.Math.abs(dN)) < ((org.apache.commons.math.linear.EigenDecompositionImpl.TOLERANCE) * (sigma)))) {
						work[(((4 * deflatedEnd) - 3) - (pingPong))] = 0.0;
						dMin = 0.0;
						updateSigma(tau);
						return deflatedEnd;
					}else
						if ((dMin) < 0.0) {
							if ((tType) < (-22)) {
								tau = 0.0;
							}else
								if ((dMin1) > 0.0) {
									tau = ((tau) + (dMin)) * (1.0 - (2.0 * (org.apache.commons.math.util.MathUtils.EPSILON)));
									tType -= 11;
								}else {
									tau *= 0.25;
									tType -= 12;
								}
							
						}else
							if (java.lang.Double.isNaN(dMin)) {
								tau = 0.0;
							}else {
								loop = false;
							}
						
					
				
			}
		}
		dqd(start, deflatedEnd);
		return deflatedEnd;
	}

	private boolean flipAllIfWarranted(final int n) {
		if ((1.5 * (work[pingPong])) >= (work[((4 * (n - 1)) + (pingPong))])) {
			return false;
		}
		int j = 4 * (n - 1);
		for (int i = 0; i < j; i += 4) {
			final double tmp1 = work[i];
			work[i] = work[j];
			work[j] = tmp1;
			final double tmp2 = work[(i + 1)];
			work[(i + 1)] = work[(j + 1)];
			work[(j + 1)] = tmp2;
			final double tmp3 = work[(i + 2)];
			work[(i + 2)] = work[(j - 2)];
			work[(j - 2)] = tmp3;
			final double tmp4 = work[(i + 3)];
			work[(i + 3)] = work[(j - 1)];
			work[(j - 1)] = tmp4;
			j -= 4;
		}
		return true;
	}

	private boolean flipEveryOtherIfWarranted(final int n) {
		if ((1.5 * (work[pingPong])) >= (work[((4 * (n - 1)) + (pingPong))])) {
			return false;
		}
		int j = 4 * (n - 1);
		for (int i = 0; i < j; i += 4) {
			for (int k = 0; k < 4; k += 2) {
				final double tmp = work[(i + k)];
				work[(i + k)] = work[(j - k)];
				work[(j - k)] = tmp;
			}
			j -= 4;
		}
		return true;
	}

	private double[] eigenvaluesRange(final int index, final int n) {
		final int lowerStart = 4 * (main.length);
		final int upperStart = 5 * (main.length);
		double lower = java.lang.Double.POSITIVE_INFINITY;
		double upper = java.lang.Double.NEGATIVE_INFINITY;
		for (int i = 0; i < n; ++i) {
			lower = java.lang.Math.min(lower, work[((lowerStart + index) + i)]);
			upper = java.lang.Math.max(upper, work[((upperStart + index) + i)]);
		}
		final double tNorm = java.lang.Math.max(java.lang.Math.abs(lower), java.lang.Math.abs(upper));
		final double relativeTolerance = java.lang.Math.sqrt(org.apache.commons.math.util.MathUtils.EPSILON);
		final double absoluteTolerance = 4 * (minPivot);
		final int maxIter = 2 + ((int) (((java.lang.Math.log((tNorm + (minPivot)))) - (java.lang.Math.log(minPivot))) / (java.lang.Math.log(2.0))));
		final double margin = 2 * (((tNorm * (org.apache.commons.math.util.MathUtils.EPSILON)) * n) + (2 * (minPivot)));
		double left = lower - margin;
		double right = upper + margin;
		for (int i = 0; i < maxIter; ++i) {
			final double range = right - left;
			if ((range < absoluteTolerance) || (range < (relativeTolerance * (java.lang.Math.max(java.lang.Math.abs(left), java.lang.Math.abs(right)))))) {
				break;
			}
			final double middle = 0.5 * (left + right);
			if ((countEigenValues(middle, index, n)) >= 1) {
				right = middle;
			}else {
				left = middle;
			}
		}
		lower = java.lang.Math.max(lower, (left - ((100 * (org.apache.commons.math.util.MathUtils.EPSILON)) * (java.lang.Math.abs(left)))));
		left = lower - margin;
		right = upper + margin;
		for (int i = 0; i < maxIter; ++i) {
			final double range = right - left;
			if ((range < absoluteTolerance) || (range < (relativeTolerance * (java.lang.Math.max(java.lang.Math.abs(left), java.lang.Math.abs(right)))))) {
				break;
			}
			final double middle = 0.5 * (left + right);
			if ((countEigenValues(middle, index, n)) >= n) {
				right = middle;
			}else {
				left = middle;
			}
		}
		upper = java.lang.Math.min(upper, (right + ((100 * (org.apache.commons.math.util.MathUtils.EPSILON)) * (java.lang.Math.abs(right)))));
		return new double[]{ lower , upper };
	}

	private int countEigenValues(final double t, final int index, final int n) {
		double ratio = (main[index]) - t;
		int count = ratio > 0 ? 0 : 1;
		for (int i = 1; i < n; ++i) {
			ratio = ((main[(index + i)]) - ((squaredSecondary[((index + i) - 1)]) / ratio)) - t;
			if (ratio <= 0) {
				++count;
			}
		}
		return count;
	}

	private void ldlTDecomposition(final double lambda, final int index, final int n) {
		double di = (main[index]) - lambda;
		work[0] = java.lang.Math.abs(di);
		for (int i = 1; i < n; ++i) {
			final int fourI = 4 * i;
			final double eiM1 = secondary[((index + i) - 1)];
			final double ratio = eiM1 / di;
			work[(fourI - 2)] = (ratio * ratio) * (java.lang.Math.abs(di));
			di = ((main[(index + i)]) - lambda) - (eiM1 * ratio);
			work[fourI] = java.lang.Math.abs(di);
		}
	}

	private void dqds(final int start, final int end) {
		eMin = work[(((4 * start) + (pingPong)) + 4)];
		double d = (work[((4 * start) + (pingPong))]) - (tau);
		dMin = d;
		dMin1 = -(work[((4 * start) + (pingPong))]);
		if ((pingPong) == 0) {
			for (int j4 = (4 * start) + 3; j4 <= (4 * (end - 3)); j4 += 4) {
				work[(j4 - 2)] = d + (work[(j4 - 1)]);
				final double tmp = (work[(j4 + 1)]) / (work[(j4 - 2)]);
				d = (d * tmp) - (tau);
				dMin = java.lang.Math.min(dMin, d);
				work[j4] = (work[(j4 - 1)]) * tmp;
				eMin = java.lang.Math.min(work[j4], eMin);
			}
		}else {
			for (int j4 = (4 * start) + 3; j4 <= (4 * (end - 3)); j4 += 4) {
				work[(j4 - 3)] = d + (work[j4]);
				final double tmp = (work[(j4 + 2)]) / (work[(j4 - 3)]);
				d = (d * tmp) - (tau);
				dMin = java.lang.Math.min(dMin, d);
				work[(j4 - 1)] = (work[j4]) * tmp;
				eMin = java.lang.Math.min(work[(j4 - 1)], eMin);
			}
		}
		dN2 = d;
		dMin2 = dMin;
		int j4 = ((4 * (end - 2)) - (pingPong)) - 1;
		int j4p2 = (j4 + (2 * (pingPong))) - 1;
		work[(j4 - 2)] = (dN2) + (work[j4p2]);
		work[j4] = (work[(j4p2 + 2)]) * ((work[j4p2]) / (work[(j4 - 2)]));
		dN1 = ((work[(j4p2 + 2)]) * ((dN2) / (work[(j4 - 2)]))) - (tau);
		dMin = java.lang.Math.min(dMin, dN1);
		dMin1 = dMin;
		j4 = j4 + 4;
		j4p2 = (j4 + (2 * (pingPong))) - 1;
		work[(j4 - 2)] = (dN1) + (work[j4p2]);
		work[j4] = (work[(j4p2 + 2)]) * ((work[j4p2]) / (work[(j4 - 2)]));
		dN = ((work[(j4p2 + 2)]) * ((dN1) / (work[(j4 - 2)]))) - (tau);
		dMin = java.lang.Math.min(dMin, dN);
		work[(j4 + 2)] = dN;
		work[(((4 * end) - (pingPong)) - 1)] = eMin;
	}

	private void dqd(final int start, final int end) {
		eMin = work[(((4 * start) + (pingPong)) + 4)];
		double d = work[((4 * start) + (pingPong))];
		dMin = d;
		if ((pingPong) == 0) {
			for (int j4 = (4 * start) + 3; j4 < (4 * (end - 3)); j4 += 4) {
				work[(j4 - 2)] = d + (work[(j4 - 1)]);
				if ((work[(j4 - 2)]) == 0.0) {
					work[j4] = 0.0;
					d = work[(j4 + 1)];
					dMin = d;
					eMin = 0.0;
				}else
					if ((((org.apache.commons.math.util.MathUtils.SAFE_MIN) * (work[(j4 + 1)])) < (work[(j4 - 2)])) && (((org.apache.commons.math.util.MathUtils.SAFE_MIN) * (work[(j4 - 2)])) < (work[(j4 + 1)]))) {
						final double tmp = (work[(j4 + 1)]) / (work[(j4 - 2)]);
						work[j4] = (work[(j4 - 1)]) * tmp;
						d *= tmp;
					}else {
						work[j4] = (work[(j4 + 1)]) * ((work[(j4 - 1)]) / (work[(j4 - 2)]));
						d *= (work[(j4 + 1)]) / (work[(j4 - 2)]);
					}
				
				dMin = java.lang.Math.min(dMin, d);
				eMin = java.lang.Math.min(eMin, work[j4]);
			}
		}else {
			for (int j4 = (4 * start) + 3; j4 < (4 * (end - 3)); j4 += 4) {
				work[(j4 - 3)] = d + (work[j4]);
				if ((work[(j4 - 3)]) == 0.0) {
					work[(j4 - 1)] = 0.0;
					d = work[(j4 + 2)];
					dMin = d;
					eMin = 0.0;
				}else
					if ((((org.apache.commons.math.util.MathUtils.SAFE_MIN) * (work[(j4 + 2)])) < (work[(j4 - 3)])) && (((org.apache.commons.math.util.MathUtils.SAFE_MIN) * (work[(j4 - 3)])) < (work[(j4 + 2)]))) {
						final double tmp = (work[(j4 + 2)]) / (work[(j4 - 3)]);
						work[(j4 - 1)] = (work[j4]) * tmp;
						d *= tmp;
					}else {
						work[(j4 - 1)] = (work[(j4 + 2)]) * ((work[j4]) / (work[(j4 - 3)]));
						d *= (work[(j4 + 2)]) / (work[(j4 - 3)]);
					}
				
				dMin = java.lang.Math.min(dMin, d);
				eMin = java.lang.Math.min(eMin, work[(j4 - 1)]);
			}
		}
		dN2 = d;
		dMin2 = dMin;
		int j4 = ((4 * (end - 2)) - (pingPong)) - 1;
		int j4p2 = (j4 + (2 * (pingPong))) - 1;
		work[(j4 - 2)] = (dN2) + (work[j4p2]);
		if ((work[(j4 - 2)]) == 0.0) {
			work[j4] = 0.0;
			dN1 = work[(j4p2 + 2)];
			dMin = dN1;
			eMin = 0.0;
		}else
			if ((((org.apache.commons.math.util.MathUtils.SAFE_MIN) * (work[(j4p2 + 2)])) < (work[(j4 - 2)])) && (((org.apache.commons.math.util.MathUtils.SAFE_MIN) * (work[(j4 - 2)])) < (work[(j4p2 + 2)]))) {
				final double tmp = (work[(j4p2 + 2)]) / (work[(j4 - 2)]);
				work[j4] = (work[j4p2]) * tmp;
				dN1 = (dN2) * tmp;
			}else {
				work[j4] = (work[(j4p2 + 2)]) * ((work[j4p2]) / (work[(j4 - 2)]));
				dN1 = (work[(j4p2 + 2)]) * ((dN2) / (work[(j4 - 2)]));
			}
		
		dMin = java.lang.Math.min(dMin, dN1);
		dMin1 = dMin;
		j4 = j4 + 4;
		j4p2 = (j4 + (2 * (pingPong))) - 1;
		work[(j4 - 2)] = (dN1) + (work[j4p2]);
		if ((work[(j4 - 2)]) == 0.0) {
			work[j4] = 0.0;
			dN = work[(j4p2 + 2)];
			dMin = dN;
			eMin = 0.0;
		}else
			if ((((org.apache.commons.math.util.MathUtils.SAFE_MIN) * (work[(j4p2 + 2)])) < (work[(j4 - 2)])) && (((org.apache.commons.math.util.MathUtils.SAFE_MIN) * (work[(j4 - 2)])) < (work[(j4p2 + 2)]))) {
				final double tmp = (work[(j4p2 + 2)]) / (work[(j4 - 2)]);
				work[j4] = (work[j4p2]) * tmp;
				dN = (dN1) * tmp;
			}else {
				work[j4] = (work[(j4p2 + 2)]) * ((work[j4p2]) / (work[(j4 - 2)]));
				dN = (work[(j4p2 + 2)]) * ((dN1) / (work[(j4 - 2)]));
			}
		
		dMin = java.lang.Math.min(dMin, dN);
		work[(j4 + 2)] = dN;
		work[(((4 * end) - (pingPong)) - 1)] = eMin;
	}

	private void computeShiftIncrement(final int start, final int end, final int deflated) {
		final double cnst1 = 0.563;
		final double cnst2 = 1.01;
		final double cnst3 = 1.05;
		if ((dMin) <= 0.0) {
			tau = -(dMin);
			tType = -1;
			return ;
		}
		int nn = ((4 * end) + (pingPong)) - 1;
		switch (deflated) {
			case 0 :
				if (((dMin) == (dN)) || ((dMin) == (dN1))) {
					double b1 = (java.lang.Math.sqrt(work[(nn - 3)])) * (java.lang.Math.sqrt(work[(nn - 5)]));
					double b2 = (java.lang.Math.sqrt(work[(nn - 7)])) * (java.lang.Math.sqrt(work[(nn - 9)]));
					double a2 = (work[(nn - 7)]) + (work[(nn - 5)]);
					if (((dMin) == (dN)) && ((dMin1) == (dN1))) {
						final double gap2 = ((dMin2) - a2) - ((dMin2) * 0.25);
						final double gap1 = (a2 - (dN)) - ((gap2 > 0.0) && (gap2 > b2) ? (b2 / gap2) * b2 : b1 + b2);
						if ((gap1 > 0.0) && (gap1 > b1)) {
							tau = java.lang.Math.max(((dN) - ((b1 / gap1) * b1)), (0.5 * (dMin)));
							tType = -2;
						}else {
							double s = 0.0;
							if ((dN) > b1) {
								s = (dN) - b1;
							}
							if (a2 > (b1 + b2)) {
								s = java.lang.Math.min(s, (a2 - (b1 + b2)));
							}
							tau = java.lang.Math.max(s, (0.333 * (dMin)));
							tType = -3;
						}
					}else {
						tType = -4;
						double s = 0.25 * (dMin);
						double gam;
						int np;
						if ((dMin) == (dN)) {
							gam = dN;
							a2 = 0.0;
							if ((work[(nn - 5)]) > (work[(nn - 7)])) {
								return ;
							}
							b2 = (work[(nn - 5)]) / (work[(nn - 7)]);
							np = nn - 9;
						}else {
							np = nn - (2 * (pingPong));
							b2 = work[(np - 2)];
							gam = dN1;
							if ((work[(np - 4)]) > (work[(np - 2)])) {
								return ;
							}
							a2 = (work[(np - 4)]) / (work[(np - 2)]);
							if ((work[(nn - 9)]) > (work[(nn - 11)])) {
								return ;
							}
							b2 = (work[(nn - 9)]) / (work[(nn - 11)]);
							np = nn - 13;
						}
						a2 = a2 + b2;
						for (int i4 = np; i4 >= (((4 * start) + 2) + (pingPong)); i4 -= 4) {
							if (b2 == 0.0) {
								break;
							}
							b1 = b2;
							if ((work[i4]) > (work[(i4 - 2)])) {
								return ;
							}
							b2 = b2 * ((work[i4]) / (work[(i4 - 2)]));
							a2 = a2 + b2;
							if (((100 * (java.lang.Math.max(b2, b1))) < a2) || (cnst1 < a2)) {
								break;
							}
						}
						a2 = cnst3 * a2;
						if (a2 < cnst1) {
							s = (gam * (1 - (java.lang.Math.sqrt(a2)))) / (1 + a2);
						}
						tau = s;
					}
				}else
					if ((dMin) == (dN2)) {
						tType = -5;
						double s = 0.25 * (dMin);
						final int np = nn - (2 * (pingPong));
						double b1 = work[(np - 2)];
						double b2 = work[(np - 6)];
						final double gam = dN2;
						if (((work[(np - 8)]) > b2) || ((work[(np - 4)]) > b1)) {
							return ;
						}
						double a2 = ((work[(np - 8)]) / b2) * (1 + ((work[(np - 4)]) / b1));
						if ((end - start) > 3) {
							b2 = (work[(nn - 13)]) / (work[(nn - 15)]);
							a2 = a2 + b2;
							for (int i4 = nn - 17; i4 >= (((4 * start) + 2) + (pingPong)); i4 -= 4) {
								if (b2 == 0.0) {
									break;
								}
								b1 = b2;
								if ((work[i4]) > (work[(i4 - 2)])) {
									return ;
								}
								b2 = b2 * ((work[i4]) / (work[(i4 - 2)]));
								a2 = a2 + b2;
								if (((100 * (java.lang.Math.max(b2, b1))) < a2) || (cnst1 < a2)) {
									break;
								}
							}
							a2 = cnst3 * a2;
						}
						if (a2 < cnst1) {
							tau = (gam * (1 - (java.lang.Math.sqrt(a2)))) / (1 + a2);
						}else {
							tau = s;
						}
					}else {
						if ((tType) == (-6)) {
							g += 0.333 * (1 - (g));
						}else
							if ((tType) == (-18)) {
								g = 0.25 * 0.333;
							}else {
								g = 0.25;
							}
						
						tau = (g) * (dMin);
						tType = -6;
					}
				
				break;
			case 1 :
				if (((dMin1) == (dN1)) && ((dMin2) == (dN2))) {
					tType = -7;
					double s = 0.333 * (dMin1);
					if ((work[(nn - 5)]) > (work[(nn - 7)])) {
						return ;
					}
					double b1 = (work[(nn - 5)]) / (work[(nn - 7)]);
					double b2 = b1;
					if (b2 != 0.0) {
						for (int i4 = ((4 * end) - 10) + (pingPong); i4 >= (((4 * start) + 2) + (pingPong)); i4 -= 4) {
							final double oldB1 = b1;
							if ((work[i4]) > (work[(i4 - 2)])) {
								return ;
							}
							b1 = b1 * ((work[i4]) / (work[(i4 - 2)]));
							b2 = b2 + b1;
							if ((100 * (java.lang.Math.max(b1, oldB1))) < b2) {
								break;
							}
						}
					}
					b2 = java.lang.Math.sqrt((cnst3 * b2));
					final double a2 = (dMin1) / (1 + (b2 * b2));
					final double gap2 = (0.5 * (dMin2)) - a2;
					if ((gap2 > 0.0) && (gap2 > (b2 * a2))) {
						tau = java.lang.Math.max(s, (a2 * (1 - (((cnst2 * a2) * (b2 / gap2)) * b2))));
					}else {
						tau = java.lang.Math.max(s, (a2 * (1 - (cnst2 * b2))));
						tType = -8;
					}
				}else {
					tau = 0.25 * (dMin1);
					if ((dMin1) == (dN1)) {
						tau = 0.5 * (dMin1);
					}
					tType = -9;
				}
				break;
			case 2 :
				if (((dMin2) == (dN2)) && ((2 * (work[(nn - 5)])) < (work[(nn - 7)]))) {
					tType = -10;
					final double s = 0.333 * (dMin2);
					if ((work[(nn - 5)]) > (work[(nn - 7)])) {
						return ;
					}
					double b1 = (work[(nn - 5)]) / (work[(nn - 7)]);
					double b2 = b1;
					if (b2 != 0.0) {
						for (int i4 = ((4 * end) - 9) + (pingPong); i4 >= (((4 * start) + 2) + (pingPong)); i4 -= 4) {
							if ((work[i4]) > (work[(i4 - 2)])) {
								return ;
							}
							b1 *= (work[i4]) / (work[(i4 - 2)]);
							b2 += b1;
							if ((100 * b1) < b2) {
								break;
							}
						}
					}
					b2 = java.lang.Math.sqrt((cnst3 * b2));
					final double a2 = (dMin2) / (1 + (b2 * b2));
					final double gap2 = (((work[(nn - 7)]) + (work[(nn - 9)])) - ((java.lang.Math.sqrt(work[(nn - 11)])) * (java.lang.Math.sqrt(work[(nn - 9)])))) - a2;
					if ((gap2 > 0.0) && (gap2 > (b2 * a2))) {
						tau = java.lang.Math.max(s, (a2 * (1 - (((cnst2 * a2) * (b2 / gap2)) * b2))));
					}else {
						tau = java.lang.Math.max(s, (a2 * (1 - (cnst2 * b2))));
					}
				}else {
					tau = 0.25 * (dMin2);
					tType = -11;
				}
				break;
			default :
				tau = 0.0;
				tType = -12;
		}
	}

	private void updateSigma(final double shift) {
		if (shift < (sigma)) {
			sigmaLow += shift;
			final double t = (sigma) + (sigmaLow);
			sigmaLow -= t - (sigma);
			sigma = t;
		}else {
			final double t = (sigma) + shift;
			sigmaLow += (sigma) - (t - shift);
			sigma = t;
		}
	}

	private void findEigenVectors() {
		final int m = main.length;
		eigenvectors = new org.apache.commons.math.linear.ArrayRealVector[m];
		final double[] d = new double[m];
		final double[] l = new double[m - 1];
		final double mu = ((realEigenvalues[(m - 1)]) <= 0) && ((realEigenvalues[0]) > 0) ? 0.5 - (realEigenvalues[(m - 1)]) : 0;
		double di = (main[0]) + mu;
		d[0] = di;
		for (int i = 1; i < m; ++i) {
			final double eiM1 = secondary[(i - 1)];
			final double ratio = eiM1 / di;
			di = ((main[i]) - (eiM1 * ratio)) + mu;
			l[(i - 1)] = ratio;
			d[i] = di;
		}
		for (int i = 0; i < m; ++i) {
			eigenvectors[i] = findEigenvector(((realEigenvalues[i]) + mu), d, l);
		}
	}

	private org.apache.commons.math.linear.ArrayRealVector findEigenvector(final double eigenvalue, final double[] d, final double[] l) {
		final int m = main.length;
		stationaryQuotientDifferenceWithShift(d, l, eigenvalue);
		progressiveQuotientDifferenceWithShift(d, l, eigenvalue);
		int r = m - 1;
		double minG = java.lang.Math.abs((((work[(6 * r)]) + (work[((6 * r) + 3)])) + eigenvalue));
		int sixI = 0;
		for (int i = 0; i < (m - 1); ++i) {
			final double absG = java.lang.Math.abs(((work[sixI]) + (((d[i]) * (work[(sixI + 9)])) / (work[(sixI + 10)]))));
			if (absG < minG) {
				r = i;
				minG = absG;
			}
			sixI += 6;
		}
		double[] eigenvector = new double[m];
		double n2 = 1;
		eigenvector[r] = 1;
		double z = 1;
		for (int i = r - 1; i >= 0; --i) {
			z *= -(work[((6 * i) + 2)]);
			eigenvector[i] = z;
			n2 += z * z;
		}
		z = 1;
		for (int i = r + 1; i < m; ++i) {
			z *= -(work[((6 * i) - 1)]);
			eigenvector[i] = z;
			n2 += z * z;
		}
		final double inv = 1.0 / (java.lang.Math.sqrt(n2));
		for (int i = 0; i < m; ++i) {
			eigenvector[i] *= inv;
		}
		return (transformer) == null ? new org.apache.commons.math.linear.ArrayRealVector(eigenvector, false) : new org.apache.commons.math.linear.ArrayRealVector(transformer.getQ().operate(eigenvector), false);
	}

	private void stationaryQuotientDifferenceWithShift(final double[] d, final double[] l, final double lambda) {
		final int nM1 = (d.length) - 1;
		double si = -lambda;
		int sixI = 0;
		for (int i = 0; i < nM1; ++i) {
			final double di = d[i];
			final double li = l[i];
			final double ldi = li * di;
			final double diP1 = di + si;
			final double liP1 = ldi / diP1;
			work[sixI] = si;
			work[(sixI + 1)] = diP1;
			work[(sixI + 2)] = liP1;
			si = ((li * liP1) * si) - lambda;
			sixI += 6;
		}
		if (java.lang.Double.isNaN(si)) {
			si = -lambda;
			sixI = 0;
			for (int i = 0; i < nM1; ++i) {
				final double di = d[i];
				final double li = l[i];
				final double ldi = li * di;
				double diP1 = di + si;
				if ((java.lang.Math.abs(diP1)) < (minPivot)) {
					diP1 = -(minPivot);
				}
				final double liP1 = ldi / diP1;
				work[sixI] = si;
				work[(sixI + 1)] = diP1;
				work[(sixI + 2)] = liP1;
				si = (li * (liP1 == 0 ? li * di : liP1 * si)) - lambda;
				sixI += 6;
			}
		}
		work[((6 * nM1) + 1)] = (d[nM1]) + si;
		work[(6 * nM1)] = si;
	}

	private void progressiveQuotientDifferenceWithShift(final double[] d, final double[] l, final double lambda) {
		final int nM1 = (d.length) - 1;
		double pi = (d[nM1]) - lambda;
		int sixI = 6 * (nM1 - 1);
		for (int i = nM1 - 1; i >= 0; --i) {
			final double di = d[i];
			final double li = l[i];
			final double diP1 = ((di * li) * li) + pi;
			final double t = di / diP1;
			work[(sixI + 9)] = pi;
			work[(sixI + 10)] = diP1;
			work[(sixI + 5)] = li * t;
			pi = (pi * t) - lambda;
			sixI -= 6;
		}
		if (java.lang.Double.isNaN(pi)) {
			pi = (d[nM1]) - lambda;
			sixI = 6 * (nM1 - 1);
			for (int i = nM1 - 1; i >= 0; --i) {
				final double di = d[i];
				final double li = l[i];
				double diP1 = ((di * li) * li) + pi;
				if ((java.lang.Math.abs(diP1)) < (minPivot)) {
					diP1 = -(minPivot);
				}
				final double t = di / diP1;
				work[(sixI + 9)] = pi;
				work[(sixI + 10)] = diP1;
				work[(sixI + 5)] = li * t;
				pi = (t == 0 ? di : pi * t) - lambda;
				sixI -= 6;
			}
		}
		work[3] = pi;
		work[4] = pi;
	}
}

