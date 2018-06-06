

package org.apache.commons.math.linear;


public class PivotingQRDecomposition {
	private double[][] qr;

	private double[] rDiag;

	private org.apache.commons.math.linear.RealMatrix cachedQ;

	private org.apache.commons.math.linear.RealMatrix cachedQT;

	private org.apache.commons.math.linear.RealMatrix cachedR;

	private org.apache.commons.math.linear.RealMatrix cachedH;

	private int[] permutation;

	private int rank;

	private double[] beta;

	public boolean isSingular() {
		return (rank) != (qr[0].length);
	}

	public int getRank() {
		return rank;
	}

	public int[] getOrder() {
		return org.apache.commons.math.util.MathUtils.copyOf(permutation);
	}

	public PivotingQRDecomposition(org.apache.commons.math.linear.RealMatrix matrix) throws org.apache.commons.math.exception.ConvergenceException {
		this(matrix, 1.0E-16, true);
	}

	public PivotingQRDecomposition(org.apache.commons.math.linear.RealMatrix matrix, boolean allowPivot) throws org.apache.commons.math.exception.ConvergenceException {
		this(matrix, 1.0E-16, allowPivot);
	}

	public PivotingQRDecomposition(org.apache.commons.math.linear.RealMatrix matrix, double qrRankingThreshold, boolean allowPivot) throws org.apache.commons.math.exception.ConvergenceException {
		final int rows = matrix.getRowDimension();
		final int cols = matrix.getColumnDimension();
		qr = matrix.getData();
		rDiag = new double[cols];
		org.apache.commons.math.linear.PivotingQRDecomposition.this.beta = new double[cols];
		org.apache.commons.math.linear.PivotingQRDecomposition.this.permutation = new int[cols];
		cachedQ = null;
		cachedQT = null;
		cachedR = null;
		cachedH = null;
		for (int k = 0; k < cols; ++k) {
			permutation[k] = k;
		}
		for (int k = 0; k < cols; ++k) {
			int nextColumn = -1;
			double ak2 = java.lang.Double.NEGATIVE_INFINITY;
			if (allowPivot) {
				for (int i = k; i < cols; ++i) {
					double norm2 = 0;
					for (int j = k; j < rows; ++j) {
						final double aki = qr[j][permutation[i]];
						norm2 += aki * aki;
					}
					if ((java.lang.Double.isInfinite(norm2)) || (java.lang.Double.isNaN(norm2))) {
						throw new org.apache.commons.math.exception.ConvergenceException(org.apache.commons.math.exception.util.LocalizedFormats.UNABLE_TO_PERFORM_QR_DECOMPOSITION_ON_JACOBIAN, rows, cols);
					}
					if (norm2 > ak2) {
						nextColumn = i;
						ak2 = norm2;
					}
				}
			}else {
				nextColumn = k;
				ak2 = 0.0;
				for (int j = k; j < rows; ++j) {
					final double aki = qr[j][k];
					ak2 += aki * aki;
				}
			}
			if (ak2 <= qrRankingThreshold) {
				rank = k;
				for (int i = rank; i < rows; i++) {
					for (int j = i + 1; j < cols; j++) {
						qr[i][permutation[j]] = 0.0;
					}
				}
				return ;
			}
			final int pk = permutation[nextColumn];
			permutation[nextColumn] = permutation[k];
			permutation[k] = pk;
			final double akk = qr[k][pk];
			final double alpha = akk > 0 ? -(org.apache.commons.math.util.FastMath.sqrt(ak2)) : org.apache.commons.math.util.FastMath.sqrt(ak2);
			final double betak = 1.0 / (ak2 - (akk * alpha));
			beta[pk] = betak;
			rDiag[pk] = alpha;
			qr[k][pk] -= alpha;
			for (int dk = (cols - 1) - k; dk > 0; --dk) {
				double gamma = 0;
				for (int j = k; j < rows; ++j) {
					gamma += (qr[j][pk]) * (qr[j][permutation[(k + dk)]]);
				}
				gamma *= betak;
				for (int j = k; j < rows; ++j) {
					qr[j][permutation[(k + dk)]] -= gamma * (qr[j][pk]);
				}
			}
		}
		rank = cols;
		return ;
	}

	public org.apache.commons.math.linear.RealMatrix getQ() {
		if ((cachedQ) == null) {
			cachedQ = getQT().transpose();
		}
		return cachedQ;
	}

	public org.apache.commons.math.linear.RealMatrix getQT() {
		if ((cachedQT) == null) {
			final int m = qr.length;
			cachedQT = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(m, m);
			for (int minor = m - 1; minor >= (rank); minor--) {
				cachedQT.setEntry(minor, minor, 1.0);
			}
			for (int minor = (rank) - 1; minor >= 0; minor--) {
				final int p_minor = permutation[minor];
				cachedQT.setEntry(minor, minor, 1.0);
				for (int col = minor; col < m; col++) {
					double alpha = 0.0;
					for (int row = minor; row < m; row++) {
						alpha -= (cachedQT.getEntry(col, row)) * (qr[row][p_minor]);
					}
					alpha /= (rDiag[p_minor]) * (qr[minor][p_minor]);
					for (int row = minor; row < m; row++) {
						cachedQT.addToEntry(col, row, ((-alpha) * (qr[row][p_minor])));
					}
				}
			}
		}
		return cachedQT;
	}

	public org.apache.commons.math.linear.RealMatrix getR() {
		if ((cachedR) == null) {
			final int n = qr[0].length;
			final int m = qr.length;
			cachedR = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(m, n);
			for (int row = (rank) - 1; row >= 0; row--) {
				cachedR.setEntry(row, row, rDiag[permutation[row]]);
				for (int col = row + 1; col < n; col++) {
					cachedR.setEntry(row, col, qr[row][permutation[col]]);
				}
			}
		}
		return cachedR;
	}

	public org.apache.commons.math.linear.RealMatrix getH() {
		if ((cachedH) == null) {
			final int n = qr[0].length;
			final int m = qr.length;
			cachedH = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(m, n);
			for (int i = 0; i < m; ++i) {
				for (int j = 0; j < (org.apache.commons.math.util.FastMath.min((i + 1), n)); ++j) {
					final int p_j = permutation[j];
					cachedH.setEntry(i, j, ((qr[i][p_j]) / (-(rDiag[p_j]))));
				}
			}
		}
		return cachedH;
	}

	public org.apache.commons.math.linear.RealMatrix getPermutationMatrix() {
		org.apache.commons.math.linear.RealMatrix rm = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(qr[0].length, qr[0].length);
		for (int i = 0; i < (org.apache.commons.math.linear.PivotingQRDecomposition.this.qr[0].length); i++) {
			rm.setEntry(permutation[i], i, 1.0);
		}
		return rm;
	}

	public org.apache.commons.math.linear.DecompositionSolver getSolver() {
		return new org.apache.commons.math.linear.PivotingQRDecomposition.Solver(qr, rDiag, permutation, rank);
	}

	private static class Solver implements org.apache.commons.math.linear.DecompositionSolver {
		private final double[][] qr;

		private final double[] rDiag;

		private final int rank;

		private final int[] perm;

		private Solver(final double[][] qr, final double[] rDiag, int[] perm, int rank) {
			this.qr = qr;
			this.rDiag = rDiag;
			this.perm = perm;
			this.rank = rank;
		}

		public boolean isNonSingular() {
			if ((qr.length) >= (qr[0].length)) {
				return (rank) == (qr[0].length);
			}else {
				return (rank) == (qr.length);
			}
		}

		public org.apache.commons.math.linear.RealVector solve(org.apache.commons.math.linear.RealVector b) {
			final int n = qr[0].length;
			final int m = qr.length;
			if ((b.getDimension()) != m) {
				throw new org.apache.commons.math.exception.DimensionMismatchException(b.getDimension(), m);
			}
			if (!(isNonSingular())) {
				throw new org.apache.commons.math.linear.SingularMatrixException();
			}
			final double[] x = new double[n];
			final double[] y = b.toArray();
			for (int minor = 0; minor < (rank); minor++) {
				final int m_idx = perm[minor];
				double dotProduct = 0;
				for (int row = minor; row < m; row++) {
					dotProduct += (y[row]) * (qr[row][m_idx]);
				}
				dotProduct /= (rDiag[m_idx]) * (qr[minor][m_idx]);
				for (int row = minor; row < m; row++) {
					y[row] += dotProduct * (qr[row][m_idx]);
				}
			}
			for (int row = (rank) - 1; row >= 0; --row) {
				final int m_row = perm[row];
				y[row] /= rDiag[m_row];
				final double yRow = y[row];
				x[perm[row]] = yRow;
				for (int i = 0; i < row; i++) {
					y[i] -= yRow * (qr[i][m_row]);
				}
			}
			return new org.apache.commons.math.linear.ArrayRealVector(x, false);
		}

		public org.apache.commons.math.linear.RealMatrix solve(org.apache.commons.math.linear.RealMatrix b) {
			final int cols = qr[0].length;
			final int rows = qr.length;
			if ((b.getRowDimension()) != rows) {
				throw new org.apache.commons.math.exception.DimensionMismatchException(b.getRowDimension(), rows);
			}
			if (!(isNonSingular())) {
				throw new org.apache.commons.math.linear.SingularMatrixException();
			}
			final int columns = b.getColumnDimension();
			final int blockSize = org.apache.commons.math.linear.BlockRealMatrix.BLOCK_SIZE;
			final int cBlocks = ((columns + blockSize) - 1) / blockSize;
			final double[][] xBlocks = org.apache.commons.math.linear.BlockRealMatrix.createBlocksLayout(cols, columns);
			final double[][] y = new double[b.getRowDimension()][blockSize];
			final double[] alpha = new double[blockSize];
			for (int kBlock = 0; kBlock < cBlocks; ++kBlock) {
				final int kStart = kBlock * blockSize;
				final int kEnd = org.apache.commons.math.util.FastMath.min((kStart + blockSize), columns);
				final int kWidth = kEnd - kStart;
				b.copySubMatrix(0, (rows - 1), kStart, (kEnd - 1), y);
				for (int minor = 0; minor < (rank); minor++) {
					final int m_idx = perm[minor];
					final double factor = 1.0 / ((rDiag[m_idx]) * (qr[minor][m_idx]));
					java.util.Arrays.fill(alpha, 0, kWidth, 0.0);
					for (int row = minor; row < rows; ++row) {
						final double d = qr[row][m_idx];
						final double[] yRow = y[row];
						for (int k = 0; k < kWidth; ++k) {
							alpha[k] += d * (yRow[k]);
						}
					}
					for (int k = 0; k < kWidth; ++k) {
						alpha[k] *= factor;
					}
					for (int row = minor; row < rows; ++row) {
						final double d = qr[row][m_idx];
						final double[] yRow = y[row];
						for (int k = 0; k < kWidth; ++k) {
							yRow[k] += (alpha[k]) * d;
						}
					}
				}
				for (int j = (rank) - 1; j >= 0; --j) {
					final int jBlock = (perm[j]) / blockSize;
					final int jStart = jBlock * blockSize;
					final double factor = 1.0 / (rDiag[perm[j]]);
					final double[] yJ = y[j];
					final double[] xBlock = xBlocks[((jBlock * cBlocks) + kBlock)];
					int index = ((perm[j]) - jStart) * kWidth;
					for (int k = 0; k < kWidth; ++k) {
						yJ[k] *= factor;
						xBlock[(index++)] = yJ[k];
					}
					for (int i = 0; i < j; ++i) {
						final double rIJ = qr[i][perm[j]];
						final double[] yI = y[i];
						for (int k = 0; k < kWidth; ++k) {
							yI[k] -= (yJ[k]) * rIJ;
						}
					}
				}
			}
			return new org.apache.commons.math.linear.BlockRealMatrix(cols, columns, xBlocks, false);
		}

		public org.apache.commons.math.linear.RealMatrix getInverse() {
			return solve(org.apache.commons.math.linear.MatrixUtils.createRealIdentityMatrix(rDiag.length));
		}
	}
}

