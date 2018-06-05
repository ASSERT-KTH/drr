

package org.apache.commons.math3.optim.nonlinear.vector.jacobian;


public class LevenbergMarquardtOptimizer extends org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer {
	private int solvedCols;

	private double[] diagR;

	private double[] jacNorm;

	private double[] beta;

	private int[] permutation;

	private int rank;

	private double lmPar;

	private double[] lmDir;

	private final double initialStepBoundFactor;

	private final double costRelativeTolerance;

	private final double parRelativeTolerance;

	private final double orthoTolerance;

	private final double qrRankingThreshold;

	private double[] weightedResidual;

	private double[][] weightedJacobian;

	public LevenbergMarquardtOptimizer() {
		this(100, 1.0E-10, 1.0E-10, 1.0E-10, org.apache.commons.math3.util.Precision.SAFE_MIN);
	}

	public LevenbergMarquardtOptimizer(org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> checker) {
		this(100, checker, 1.0E-10, 1.0E-10, 1.0E-10, org.apache.commons.math3.util.Precision.SAFE_MIN);
	}

	public LevenbergMarquardtOptimizer(double initialStepBoundFactor, org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> checker, double costRelativeTolerance, double parRelativeTolerance, double orthoTolerance, double threshold) {
		super(checker);
		this.initialStepBoundFactor = initialStepBoundFactor;
		this.costRelativeTolerance = costRelativeTolerance;
		this.parRelativeTolerance = parRelativeTolerance;
		this.orthoTolerance = orthoTolerance;
		this.qrRankingThreshold = threshold;
	}

	public LevenbergMarquardtOptimizer(double costRelativeTolerance, double parRelativeTolerance, double orthoTolerance) {
		this(100, costRelativeTolerance, parRelativeTolerance, orthoTolerance, org.apache.commons.math3.util.Precision.SAFE_MIN);
	}

	public LevenbergMarquardtOptimizer(double initialStepBoundFactor, double costRelativeTolerance, double parRelativeTolerance, double orthoTolerance, double threshold) {
		super(null);
		this.initialStepBoundFactor = initialStepBoundFactor;
		this.costRelativeTolerance = costRelativeTolerance;
		this.parRelativeTolerance = parRelativeTolerance;
		this.orthoTolerance = orthoTolerance;
		this.qrRankingThreshold = threshold;
	}

	@java.lang.Override
	protected org.apache.commons.math3.optim.PointVectorValuePair doOptimize() {
		final int nR = getTarget().length;
		final double[] currentPoint = getStartPoint();
		final int nC = currentPoint.length;
		solvedCols = org.apache.commons.math3.util.FastMath.min(nR, nC);
		diagR = new double[nC];
		jacNorm = new double[nC];
		beta = new double[nC];
		permutation = new int[nC];
		lmDir = new double[nC];
		double delta = 0;
		double xNorm = 0;
		double[] diag = new double[nC];
		double[] oldX = new double[nC];
		double[] oldRes = new double[nR];
		double[] oldObj = new double[nR];
		double[] qtf = new double[nR];
		double[] work1 = new double[nC];
		double[] work2 = new double[nC];
		double[] work3 = new double[nC];
		final org.apache.commons.math3.linear.RealMatrix weightMatrixSqrt = getWeightSquareRoot();
		double[] currentObjective = computeObjectiveValue(currentPoint);
		double[] currentResiduals = computeResiduals(currentObjective);
		org.apache.commons.math3.optim.PointVectorValuePair current = new org.apache.commons.math3.optim.PointVectorValuePair(currentPoint, currentObjective);
		double currentCost = computeCost(currentResiduals);
		lmPar = 0;
		boolean firstIteration = true;
		int iter = 0;
		final org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> checker = getConvergenceChecker();
		while (true) {
			++iter;
			final org.apache.commons.math3.optim.PointVectorValuePair previous = current;
			qrDecomposition(computeWeightedJacobian(currentPoint));
			weightedResidual = weightMatrixSqrt.operate(currentResiduals);
			for (int i = 0; i < nR; i++) {
				qtf[i] = weightedResidual[i];
			}
			qTy(qtf);
			for (int k = 0; k < (solvedCols); ++k) {
				int pk = permutation[k];
				weightedJacobian[k][pk] = diagR[pk];
			}
			if (firstIteration) {
				xNorm = 0;
				for (int k = 0; k < nC; ++k) {
					double dk = jacNorm[k];
					if (dk == 0) {
						dk = 1.0;
					}
					double xk = dk * (currentPoint[k]);
					xNorm += xk * xk;
					diag[k] = dk;
				}
				xNorm = org.apache.commons.math3.util.FastMath.sqrt(xNorm);
				delta = (xNorm == 0) ? initialStepBoundFactor : (initialStepBoundFactor) * xNorm;
			}
			double maxCosine = 0;
			if (currentCost != 0) {
				for (int j = 0; j < (solvedCols); ++j) {
					int pj = permutation[j];
					double s = jacNorm[pj];
					if (s != 0) {
						double sum = 0;
						for (int i = 0; i <= j; ++i) {
							sum += (weightedJacobian[i][pj]) * (qtf[i]);
						}
						maxCosine = org.apache.commons.math3.util.FastMath.max(maxCosine, ((org.apache.commons.math3.util.FastMath.abs(sum)) / (s * currentCost)));
					}
				}
			}
			if (maxCosine <= (orthoTolerance)) {
				setCost(currentCost);
				return current;
			}
			for (int j = 0; j < nC; ++j) {
				diag[j] = org.apache.commons.math3.util.FastMath.max(diag[j], jacNorm[j]);
			}
			for (double ratio = 0; ratio < 1.0E-4;) {
				for (int j = 0; j < (solvedCols); ++j) {
					int pj = permutation[j];
					oldX[pj] = currentPoint[pj];
				}
				final double previousCost = currentCost;
				double[] tmpVec = weightedResidual;
				weightedResidual = oldRes;
				oldRes = tmpVec;
				tmpVec = currentObjective;
				currentObjective = oldObj;
				oldObj = tmpVec;
				determineLMParameter(qtf, delta, diag, work1, work2, work3);
				double lmNorm = 0;
				for (int j = 0; j < (solvedCols); ++j) {
					int pj = permutation[j];
					lmDir[pj] = -(lmDir[pj]);
					currentPoint[pj] = (oldX[pj]) + (lmDir[pj]);
					double s = (diag[pj]) * (lmDir[pj]);
					lmNorm += s * s;
				}
				lmNorm = org.apache.commons.math3.util.FastMath.sqrt(lmNorm);
				if (firstIteration) {
					delta = org.apache.commons.math3.util.FastMath.min(delta, lmNorm);
				}
				currentObjective = computeObjectiveValue(currentPoint);
				currentResiduals = computeResiduals(currentObjective);
				current = new org.apache.commons.math3.optim.PointVectorValuePair(currentPoint, currentObjective);
				currentCost = computeCost(currentResiduals);
				double actRed = -1.0;
				if ((0.1 * currentCost) < previousCost) {
					double r = currentCost / previousCost;
					actRed = 1.0 - (r * r);
				}
				for (int j = 0; j < (solvedCols); ++j) {
					int pj = permutation[j];
					double dirJ = lmDir[pj];
					work1[j] = 0;
					for (int i = 0; i <= j; ++i) {
						work1[i] += (weightedJacobian[i][pj]) * dirJ;
					}
				}
				double coeff1 = 0;
				for (int j = 0; j < (solvedCols); ++j) {
					coeff1 += (work1[j]) * (work1[j]);
				}
				double pc2 = previousCost * previousCost;
				coeff1 = coeff1 / pc2;
				double coeff2 = (((lmPar) * lmNorm) * lmNorm) / pc2;
				double preRed = coeff1 + (2 * coeff2);
				double dirDer = -(coeff1 + coeff2);
				ratio = (preRed == 0) ? 0 : actRed / preRed;
				if (ratio <= 0.25) {
					double tmp = actRed < 0 ? (0.5 * dirDer) / (dirDer + (0.5 * actRed)) : 0.5;
					if (((0.1 * currentCost) >= previousCost) || (tmp < 0.1)) {
						tmp = 0.1;
					}
					delta = tmp * (org.apache.commons.math3.util.FastMath.min(delta, (10.0 * lmNorm)));
					lmPar /= tmp;
				}else
					if (((lmPar) == 0) || (ratio >= 0.75)) {
						delta = 2 * lmNorm;
						lmPar *= 0.5;
					}
				
				if (ratio >= 1.0E-4) {
					firstIteration = false;
					xNorm = 0;
					for (int k = 0; k < nC; ++k) {
						double xK = (diag[k]) * (currentPoint[k]);
						xNorm += xK * xK;
					}
					xNorm = org.apache.commons.math3.util.FastMath.sqrt(xNorm);
					if (checker != null) {
						if (checker.converged(iter, previous, current)) {
							setCost(currentCost);
							return current;
						}
					}
				}else {
					currentCost = previousCost;
					for (int j = 0; j < (solvedCols); ++j) {
						int pj = permutation[j];
						currentPoint[pj] = oldX[pj];
					}
					tmpVec = weightedResidual;
					weightedResidual = oldRes;
					oldRes = tmpVec;
					tmpVec = currentObjective;
					currentObjective = oldObj;
					oldObj = tmpVec;
					current = new org.apache.commons.math3.optim.PointVectorValuePair(currentPoint, currentObjective);
				}
				if (((((org.apache.commons.math3.util.FastMath.abs(actRed)) <= (costRelativeTolerance)) && (preRed <= (costRelativeTolerance))) && (ratio <= 2.0)) || (delta <= ((parRelativeTolerance) * xNorm))) {
					setCost(currentCost);
					return current;
				}
				if ((((org.apache.commons.math3.util.FastMath.abs(actRed)) <= 2.2204E-16) && (preRed <= 2.2204E-16)) && (ratio <= 2.0)) {
					throw new org.apache.commons.math3.exception.ConvergenceException(org.apache.commons.math3.exception.util.LocalizedFormats.TOO_SMALL_COST_RELATIVE_TOLERANCE, costRelativeTolerance);
				}else
					if (delta <= (2.2204E-16 * xNorm)) {
						throw new org.apache.commons.math3.exception.ConvergenceException(org.apache.commons.math3.exception.util.LocalizedFormats.TOO_SMALL_PARAMETERS_RELATIVE_TOLERANCE, parRelativeTolerance);
					}else
						if (maxCosine <= 2.2204E-16) {
							throw new org.apache.commons.math3.exception.ConvergenceException(org.apache.commons.math3.exception.util.LocalizedFormats.TOO_SMALL_ORTHOGONALITY_TOLERANCE, orthoTolerance);
						}
					
				
			}
		} 
	}

	private void determineLMParameter(double[] qy, double delta, double[] diag, double[] work1, double[] work2, double[] work3) {
		final int nC = weightedJacobian[0].length;
		for (int j = 0; j < (rank); ++j) {
			lmDir[permutation[j]] = qy[j];
		}
		for (int j = rank; j < nC; ++j) {
			lmDir[permutation[j]] = 0;
		}
		for (int k = (rank) - 1; k >= 0; --k) {
			int pk = permutation[k];
			double ypk = (lmDir[pk]) / (diagR[pk]);
			for (int i = 0; i < k; ++i) {
				lmDir[permutation[i]] -= ypk * (weightedJacobian[i][pk]);
			}
			lmDir[pk] = ypk;
		}
		double dxNorm = 0;
		for (int j = 0; j < (solvedCols); ++j) {
			int pj = permutation[j];
			double s = (diag[pj]) * (lmDir[pj]);
			work1[pj] = s;
			dxNorm += s * s;
		}
		dxNorm = org.apache.commons.math3.util.FastMath.sqrt(dxNorm);
		double fp = dxNorm - delta;
		if (fp <= (0.1 * delta)) {
			lmPar = 0;
			return ;
		}
		double sum2;
		double parl = 0;
		if ((rank) == (solvedCols)) {
			for (int j = 0; j < (solvedCols); ++j) {
				int pj = permutation[j];
				work1[pj] *= (diag[pj]) / dxNorm;
			}
			sum2 = 0;
			for (int j = 0; j < (solvedCols); ++j) {
				int pj = permutation[j];
				double sum = 0;
				for (int i = 0; i < j; ++i) {
					sum += (weightedJacobian[i][pj]) * (work1[permutation[i]]);
				}
				double s = ((work1[pj]) - sum) / (diagR[pj]);
				work1[pj] = s;
				sum2 += s * s;
			}
			parl = fp / (delta * sum2);
		}
		sum2 = 0;
		for (int j = 0; j < (solvedCols); ++j) {
			int pj = permutation[j];
			double sum = 0;
			for (int i = 0; i <= j; ++i) {
				sum += (weightedJacobian[i][pj]) * (qy[i]);
			}
			sum /= diag[pj];
			sum2 += sum * sum;
		}
		double gNorm = org.apache.commons.math3.util.FastMath.sqrt(sum2);
		double paru = gNorm / delta;
		if (paru == 0) {
			paru = 2.2251E-308 / (org.apache.commons.math3.util.FastMath.min(delta, 0.1));
		}
		lmPar = org.apache.commons.math3.util.FastMath.min(paru, org.apache.commons.math3.util.FastMath.max(lmPar, parl));
		if ((lmPar) == 0) {
			lmPar = gNorm / dxNorm;
		}
		for (int countdown = 10; countdown >= 0; --countdown) {
			if ((lmPar) == 0) {
				lmPar = org.apache.commons.math3.util.FastMath.max(2.2251E-308, (0.001 * paru));
			}
			double sPar = org.apache.commons.math3.util.FastMath.sqrt(lmPar);
			for (int j = 0; j < (solvedCols); ++j) {
				int pj = permutation[j];
				work1[pj] = sPar * (diag[pj]);
			}
			determineLMDirection(qy, work1, work2, work3);
			dxNorm = 0;
			for (int j = 0; j < (solvedCols); ++j) {
				int pj = permutation[j];
				double s = (diag[pj]) * (lmDir[pj]);
				work3[pj] = s;
				dxNorm += s * s;
			}
			dxNorm = org.apache.commons.math3.util.FastMath.sqrt(dxNorm);
			double previousFP = fp;
			fp = dxNorm - delta;
			if (((org.apache.commons.math3.util.FastMath.abs(fp)) <= (0.1 * delta)) || (((parl == 0) && (fp <= previousFP)) && (previousFP < 0))) {
				return ;
			}
			for (int j = 0; j < (solvedCols); ++j) {
				int pj = permutation[j];
				work1[pj] = ((work3[pj]) * (diag[pj])) / dxNorm;
			}
			for (int j = 0; j < (solvedCols); ++j) {
				int pj = permutation[j];
				work1[pj] /= work2[j];
				double tmp = work1[pj];
				for (int i = j + 1; i < (solvedCols); ++i) {
					work1[permutation[i]] -= (weightedJacobian[i][pj]) * tmp;
				}
			}
			sum2 = 0;
			for (int j = 0; j < (solvedCols); ++j) {
				double s = work1[permutation[j]];
				sum2 += s * s;
			}
			double correction = fp / (delta * sum2);
			if (fp > 0) {
				parl = org.apache.commons.math3.util.FastMath.max(parl, lmPar);
			}else
				if (fp < 0) {
					paru = org.apache.commons.math3.util.FastMath.min(paru, lmPar);
				}
			
			lmPar = org.apache.commons.math3.util.FastMath.max(parl, ((lmPar) + correction));
		}
	}

	private void determineLMDirection(double[] qy, double[] diag, double[] lmDiag, double[] work) {
		for (int j = 0; j < (solvedCols); ++j) {
			int pj = permutation[j];
			for (int i = j + 1; i < (solvedCols); ++i) {
				weightedJacobian[i][pj] = weightedJacobian[j][permutation[i]];
			}
			lmDir[j] = diagR[pj];
			work[j] = qy[j];
		}
		for (int j = 0; j < (solvedCols); ++j) {
			int pj = permutation[j];
			double dpj = diag[pj];
			if (dpj != 0) {
				java.util.Arrays.fill(lmDiag, (j + 1), lmDiag.length, 0);
			}
			lmDiag[j] = dpj;
			double qtbpj = 0;
			for (int k = j; k < (solvedCols); ++k) {
				int pk = permutation[k];
				if ((lmDiag[k]) != 0) {
					final double sin;
					final double cos;
					double rkk = weightedJacobian[k][pk];
					if ((org.apache.commons.math3.util.FastMath.abs(rkk)) < (org.apache.commons.math3.util.FastMath.abs(lmDiag[k]))) {
						final double cotan = rkk / (lmDiag[k]);
						sin = 1.0 / (org.apache.commons.math3.util.FastMath.sqrt((1.0 + (cotan * cotan))));
						cos = sin * cotan;
					}else {
						final double tan = (lmDiag[k]) / rkk;
						cos = 1.0 / (org.apache.commons.math3.util.FastMath.sqrt((1.0 + (tan * tan))));
						sin = cos * tan;
					}
					weightedJacobian[k][pk] = (cos * rkk) + (sin * (lmDiag[k]));
					final double temp = (cos * (work[k])) + (sin * qtbpj);
					qtbpj = ((-sin) * (work[k])) + (cos * qtbpj);
					work[k] = temp;
					for (int i = k + 1; i < (solvedCols); ++i) {
						double rik = weightedJacobian[i][pk];
						final double temp2 = (cos * rik) + (sin * (lmDiag[i]));
						lmDiag[i] = ((-sin) * rik) + (cos * (lmDiag[i]));
						weightedJacobian[i][pk] = temp2;
					}
				}
			}
			lmDiag[j] = weightedJacobian[j][permutation[j]];
			weightedJacobian[j][permutation[j]] = lmDir[j];
		}
		int nSing = solvedCols;
		for (int j = 0; j < (solvedCols); ++j) {
			if (((lmDiag[j]) == 0) && (nSing == (solvedCols))) {
				nSing = j;
			}
			if (nSing < (solvedCols)) {
				work[j] = 0;
			}
		}
		if (nSing > 0) {
			for (int j = nSing - 1; j >= 0; --j) {
				int pj = permutation[j];
				double sum = 0;
				for (int i = j + 1; i < nSing; ++i) {
					sum += (weightedJacobian[i][pj]) * (work[i]);
				}
				work[j] = ((work[j]) - sum) / (lmDiag[j]);
			}
		}
		for (int j = 0; j < (lmDir.length); ++j) {
			lmDir[permutation[j]] = work[j];
		}
	}

	private void qrDecomposition(org.apache.commons.math3.linear.RealMatrix jacobian) throws org.apache.commons.math3.exception.ConvergenceException {
		weightedJacobian = jacobian.scalarMultiply((-1)).getData();
		final int nR = weightedJacobian.length;
		final int nC = weightedJacobian[0].length;
		for (int k = 0; k < nC; ++k) {
			permutation[k] = k;
			double norm2 = 0;
			for (int i = 0; i < nR; ++i) {
				double akk = weightedJacobian[i][k];
				norm2 += akk * akk;
			}
			jacNorm[k] = org.apache.commons.math3.util.FastMath.sqrt(norm2);
		}
		for (int k = 0; k < nC; ++k) {
			int nextColumn = -1;
			double ak2 = java.lang.Double.NEGATIVE_INFINITY;
			for (int i = k; i < nC; ++i) {
				double norm2 = 0;
				for (int j = k; j < nR; ++j) {
					double aki = weightedJacobian[j][permutation[i]];
					norm2 += aki * aki;
				}
				if ((java.lang.Double.isInfinite(norm2)) || (java.lang.Double.isNaN(norm2))) {
					throw new org.apache.commons.math3.exception.ConvergenceException(org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_PERFORM_QR_DECOMPOSITION_ON_JACOBIAN, nR, nC);
				}
				if (norm2 > ak2) {
					nextColumn = i;
					ak2 = norm2;
				}
			}
			if (ak2 <= (qrRankingThreshold)) {
				rank = k;
				return ;
			}
			int pk = permutation[nextColumn];
			permutation[nextColumn] = permutation[k];
			permutation[k] = pk;
			double akk = weightedJacobian[k][pk];
			double alpha = akk > 0 ? -(org.apache.commons.math3.util.FastMath.sqrt(ak2)) : org.apache.commons.math3.util.FastMath.sqrt(ak2);
			double betak = 1.0 / (ak2 - (akk * alpha));
			beta[pk] = betak;
			diagR[pk] = alpha;
			weightedJacobian[k][pk] -= alpha;
			for (int dk = (nC - 1) - k; dk > 0; --dk) {
				double gamma = 0;
				for (int j = k; j < nR; ++j) {
					gamma += (weightedJacobian[j][pk]) * (weightedJacobian[j][permutation[(k + dk)]]);
				}
				gamma *= betak;
				for (int j = k; j < nR; ++j) {
					weightedJacobian[j][permutation[(k + dk)]] -= gamma * (weightedJacobian[j][pk]);
				}
			}
		}
		rank = solvedCols;
	}

	private void qTy(double[] y) {
		final int nR = weightedJacobian.length;
		final int nC = weightedJacobian[0].length;
		for (int k = 0; k < nC; ++k) {
			int pk = permutation[k];
			double gamma = 0;
			for (int i = k; i < nR; ++i) {
				gamma += (weightedJacobian[i][pk]) * (y[i]);
			}
			gamma *= beta[pk];
			for (int i = k; i < nR; ++i) {
				y[i] -= gamma * (weightedJacobian[i][pk]);
			}
		}
	}
}

