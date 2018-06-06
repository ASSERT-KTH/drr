

package org.apache.commons.math.estimation;


public class LevenbergMarquardtEstimator implements java.io.Serializable , org.apache.commons.math.estimation.Estimator {
	public LevenbergMarquardtEstimator() {
		setInitialStepBoundFactor(100.0);
		setMaxCostEval(1000);
		setCostRelativeTolerance(1.0E-10);
		setParRelativeTolerance(1.0E-10);
		setOrthoTolerance(1.0E-10);
	}

	public void setInitialStepBoundFactor(double initialStepBoundFactor) {
		org.apache.commons.math.estimation.LevenbergMarquardtEstimator.this.initialStepBoundFactor = initialStepBoundFactor;
	}

	public void setMaxCostEval(int maxCostEval) {
		org.apache.commons.math.estimation.LevenbergMarquardtEstimator.this.maxCostEval = maxCostEval;
	}

	public void setCostRelativeTolerance(double costRelativeTolerance) {
		org.apache.commons.math.estimation.LevenbergMarquardtEstimator.this.costRelativeTolerance = costRelativeTolerance;
	}

	public void setParRelativeTolerance(double parRelativeTolerance) {
		org.apache.commons.math.estimation.LevenbergMarquardtEstimator.this.parRelativeTolerance = parRelativeTolerance;
	}

	public void setOrthoTolerance(double orthoTolerance) {
		org.apache.commons.math.estimation.LevenbergMarquardtEstimator.this.orthoTolerance = orthoTolerance;
	}

	public int getCostEvaluations() {
		return costEvaluations;
	}

	public int getJacobianEvaluations() {
		return jacobianEvaluations;
	}

	private void updateJacobian() {
		++(jacobianEvaluations);
		java.util.Arrays.fill(jacobian, 0);
		for (int i = 0, index = 0; i < (rows); i++) {
			org.apache.commons.math.estimation.WeightedMeasurement wm = measurements[i];
			double factor = -(java.lang.Math.sqrt(wm.getWeight()));
			for (int j = 0; j < (cols); ++j) {
				jacobian[(index++)] = factor * (wm.getPartial(parameters[j]));
			}
		}
	}

	private void updateResidualsAndCost() {
		++(costEvaluations);
		cost = 0;
		for (int i = 0, index = 0; i < (rows); i++ , index += cols) {
			org.apache.commons.math.estimation.WeightedMeasurement wm = measurements[i];
			double residual = wm.getResidual();
			residuals[i] = (java.lang.Math.sqrt(wm.getWeight())) * residual;
			cost += ((wm.getWeight()) * residual) * residual;
		}
		cost = java.lang.Math.sqrt(cost);
	}

	public double getRMS(org.apache.commons.math.estimation.EstimationProblem problem) {
		org.apache.commons.math.estimation.WeightedMeasurement[] wm = problem.getMeasurements();
		double criterion = 0;
		for (int i = 0; i < (wm.length); ++i) {
			double residual = wm[i].getResidual();
			criterion += ((wm[i].getWeight()) * residual) * residual;
		}
		return java.lang.Math.sqrt((criterion / (wm.length)));
	}

	public void estimate(org.apache.commons.math.estimation.EstimationProblem problem) throws org.apache.commons.math.estimation.EstimationException {
		measurements = problem.getMeasurements();
		parameters = problem.getUnboundParameters();
		rows = measurements.length;
		cols = parameters.length;
		solvedCols = java.lang.Math.min(rows, cols);
		jacobian = new double[(rows) * (cols)];
		diagR = new double[cols];
		jacNorm = new double[cols];
		beta = new double[cols];
		permutation = new int[cols];
		lmDir = new double[cols];
		residuals = new double[rows];
		double delta = 0;
		double xNorm = 0;
		double[] diag = new double[cols];
		double[] oldX = new double[cols];
		double[] oldRes = new double[rows];
		double[] work1 = new double[cols];
		double[] work2 = new double[cols];
		double[] work3 = new double[cols];
		updateResidualsAndCost();
		lmPar = 0;
		costEvaluations = 0;
		jacobianEvaluations = 0;
		boolean firstIteration = true;
		while ((costEvaluations) < (maxCostEval)) {
			updateJacobian();
			qrDecomposition();
			qTy(residuals);
			for (int k = 0; k < (solvedCols); ++k) {
				int pk = permutation[k];
				jacobian[((k * (cols)) + pk)] = diagR[pk];
			}
			if (firstIteration) {
				xNorm = 0;
				for (int k = 0; k < (cols); ++k) {
					double dk = jacNorm[k];
					if (dk == 0) {
						dk = 1.0;
					}
					double xk = dk * (parameters[k].getEstimate());
					xNorm += xk * xk;
					diag[k] = dk;
				}
				xNorm = java.lang.Math.sqrt(xNorm);
				delta = (xNorm == 0) ? initialStepBoundFactor : (initialStepBoundFactor) * xNorm;
			}
			double maxCosine = 0;
			if ((cost) != 0) {
				for (int j = 0; j < (solvedCols); ++j) {
					int pj = permutation[j];
					double s = jacNorm[pj];
					if (s != 0) {
						double sum = 0;
						for (int i = 0, index = pj; i <= j; ++i , index += cols) {
							sum += (jacobian[index]) * (residuals[i]);
						}
						maxCosine = java.lang.Math.max(maxCosine, ((java.lang.Math.abs(sum)) / (s * (cost))));
					}
				}
			}
			if (maxCosine <= (orthoTolerance)) {
				return ;
			}
			for (int j = 0; j < (cols); ++j) {
				diag[j] = java.lang.Math.max(diag[j], jacNorm[j]);
			}
			for (double ratio = 0; ratio < 1.0E-4;) {
				for (int j = 0; j < (solvedCols); ++j) {
					int pj = permutation[j];
					oldX[pj] = parameters[pj].getEstimate();
				}
				double previousCost = cost;
				double[] tmpVec = residuals;
				residuals = oldRes;
				oldRes = tmpVec;
				determineLMParameter(oldRes, delta, diag, work1, work2, work3);
				double lmNorm = 0;
				for (int j = 0; j < (solvedCols); ++j) {
					int pj = permutation[j];
					lmDir[pj] = -(lmDir[pj]);
					parameters[pj].setEstimate(((oldX[pj]) + (lmDir[pj])));
					double s = (diag[pj]) * (lmDir[pj]);
					lmNorm += s * s;
				}
				lmNorm = java.lang.Math.sqrt(lmNorm);
				if (firstIteration) {
					delta = java.lang.Math.min(delta, lmNorm);
				}
				updateResidualsAndCost();
				double actRed = -1.0;
				if ((0.1 * (cost)) < previousCost) {
					double r = (cost) / previousCost;
					actRed = 1.0 - (r * r);
				}
				for (int j = 0; j < (solvedCols); ++j) {
					int pj = permutation[j];
					double dirJ = lmDir[pj];
					work1[j] = 0;
					for (int i = 0, index = pj; i <= j; ++i , index += cols) {
						work1[i] += (jacobian[index]) * dirJ;
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
					if (((0.1 * (cost)) >= previousCost) || (tmp < 0.1)) {
						tmp = 0.1;
					}
					delta = tmp * (java.lang.Math.min(delta, (10.0 * lmNorm)));
					lmPar /= tmp;
				}else
					if (((lmPar) == 0) || (ratio >= 0.75)) {
						delta = 2 * lmNorm;
						lmPar *= 0.5;
					}
				
				if (ratio >= 1.0E-4) {
					firstIteration = false;
					xNorm = 0;
					for (int k = 0; k < (cols); ++k) {
						double xK = (diag[k]) * (parameters[k].getEstimate());
						xNorm += xK * xK;
					}
					xNorm = java.lang.Math.sqrt(xNorm);
				}else {
					cost = previousCost;
					for (int j = 0; j < (solvedCols); ++j) {
						int pj = permutation[j];
						parameters[pj].setEstimate(oldX[pj]);
					}
					tmpVec = residuals;
					residuals = oldRes;
					oldRes = tmpVec;
				}
				if (((((java.lang.Math.abs(actRed)) <= (costRelativeTolerance)) && (preRed <= (costRelativeTolerance))) && (ratio <= 2.0)) || (delta <= ((parRelativeTolerance) * xNorm))) {
					return ;
				}
				if ((costEvaluations) >= (maxCostEval)) {
					break;
				}
				if ((((java.lang.Math.abs(actRed)) <= 2.2204E-16) && (preRed <= 2.2204E-16)) && (ratio <= 2.0)) {
					throw new org.apache.commons.math.estimation.EstimationException(("cost relative tolerance is too small ({0})," + (" no further reduction in the" + " sum of squares is possible")), new java.lang.String[]{ java.lang.Double.toString(costRelativeTolerance) });
				}else
					if (delta <= (2.2204E-16 * xNorm)) {
						throw new org.apache.commons.math.estimation.EstimationException(("parameters relative tolerance is too small" + (" ({0}), no further improvement in" + " the approximate solution is possible")), new java.lang.String[]{ java.lang.Double.toString(parRelativeTolerance) });
					}else
						if (maxCosine <= 2.2204E-16) {
							throw new org.apache.commons.math.estimation.EstimationException(("orthogonality tolerance is too small ({0})," + " solution is orthogonal to the jacobian"), new java.lang.String[]{ java.lang.Double.toString(orthoTolerance) });
						}
					
				
			}
		} 
		throw new org.apache.commons.math.estimation.EstimationException("maximal number of evaluations exceeded ({0})", new java.lang.String[]{ java.lang.Integer.toString(maxCostEval) });
	}

	private void determineLMParameter(double[] qy, double delta, double[] diag, double[] work1, double[] work2, double[] work3) {
		for (int j = 0; j < (rank); ++j) {
			lmDir[permutation[j]] = qy[j];
		}
		for (int j = rank; j < (cols); ++j) {
			lmDir[permutation[j]] = 0;
		}
		for (int k = (rank) - 1; k >= 0; --k) {
			int pk = permutation[k];
			double ypk = (lmDir[pk]) / (diagR[pk]);
			for (int i = 0, index = pk; i < k; ++i , index += cols) {
				lmDir[permutation[i]] -= ypk * (jacobian[index]);
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
		dxNorm = java.lang.Math.sqrt(dxNorm);
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
				for (int i = 0, index = pj; i < j; ++i , index += cols) {
					sum += (jacobian[index]) * (work1[permutation[i]]);
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
			for (int i = 0, index = pj; i <= j; ++i , index += cols) {
				sum += (jacobian[index]) * (qy[i]);
			}
			sum /= diag[pj];
			sum2 += sum * sum;
		}
		double gNorm = java.lang.Math.sqrt(sum2);
		double paru = gNorm / delta;
		if (paru == 0) {
			paru = 2.2251E-308 / (java.lang.Math.min(delta, 0.1));
		}
		lmPar = java.lang.Math.min(paru, java.lang.Math.max(lmPar, parl));
		if ((lmPar) == 0) {
			lmPar = gNorm / dxNorm;
		}
		for (int countdown = 10; countdown >= 0; --countdown) {
			if ((lmPar) == 0) {
				lmPar = java.lang.Math.max(2.2251E-308, (0.001 * paru));
			}
			double sPar = java.lang.Math.sqrt(lmPar);
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
			dxNorm = java.lang.Math.sqrt(dxNorm);
			double previousFP = fp;
			fp = dxNorm - delta;
			if (((java.lang.Math.abs(fp)) <= (0.1 * delta)) || (((parl == 0) && (fp <= previousFP)) && (previousFP < 0))) {
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
					work1[permutation[i]] -= (jacobian[((i * (cols)) + pj)]) * tmp;
				}
			}
			sum2 = 0;
			for (int j = 0; j < (solvedCols); ++j) {
				double s = work1[permutation[j]];
				sum2 += s * s;
			}
			double correction = fp / (delta * sum2);
			if (fp > 0) {
				parl = java.lang.Math.max(parl, lmPar);
			}else
				if (fp < 0) {
					paru = java.lang.Math.min(paru, lmPar);
				}
			
			lmPar = java.lang.Math.max(parl, ((lmPar) + correction));
		}
	}

	private void determineLMDirection(double[] qy, double[] diag, double[] lmDiag, double[] work) {
		for (int j = 0; j < (solvedCols); ++j) {
			int pj = permutation[j];
			for (int i = j + 1; i < (solvedCols); ++i) {
				jacobian[((i * (cols)) + pj)] = jacobian[((j * (cols)) + (permutation[i]))];
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
					double sin;
					double cos;
					double rkk = jacobian[((k * (cols)) + pk)];
					if ((java.lang.Math.abs(rkk)) < (java.lang.Math.abs(lmDiag[k]))) {
						double cotan = rkk / (lmDiag[k]);
						sin = 1.0 / (java.lang.Math.sqrt((1.0 + (cotan * cotan))));
						cos = sin * cotan;
					}else {
						double tan = (lmDiag[k]) / rkk;
						cos = 1.0 / (java.lang.Math.sqrt((1.0 + (tan * tan))));
						sin = cos * tan;
					}
					jacobian[((k * (cols)) + pk)] = (cos * rkk) + (sin * (lmDiag[k]));
					double temp = (cos * (work[k])) + (sin * qtbpj);
					qtbpj = ((-sin) * (work[k])) + (cos * qtbpj);
					work[k] = temp;
					for (int i = k + 1; i < (solvedCols); ++i) {
						double rik = jacobian[((i * (cols)) + pk)];
						temp = (cos * rik) + (sin * (lmDiag[i]));
						lmDiag[i] = ((-sin) * rik) + (cos * (lmDiag[i]));
						jacobian[((i * (cols)) + pk)] = temp;
					}
				}
			}
			int index = (j * (cols)) + (permutation[j]);
			lmDiag[j] = jacobian[index];
			jacobian[index] = lmDir[j];
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
					sum += (jacobian[((i * (cols)) + pj)]) * (work[i]);
				}
				work[j] = ((work[j]) - sum) / (lmDiag[j]);
			}
		}
		for (int j = 0; j < (lmDir.length); ++j) {
			lmDir[permutation[j]] = work[j];
		}
	}

	private void qrDecomposition() {
		for (int k = 0; k < (cols); ++k) {
			permutation[k] = k;
			double norm2 = 0;
			for (int index = k; index < (jacobian.length); index += cols) {
				double akk = jacobian[index];
				norm2 += akk * akk;
			}
			jacNorm[k] = java.lang.Math.sqrt(norm2);
		}
		for (int k = 0; k < (cols); ++k) {
			int nextColumn = -1;
			double ak2 = java.lang.Double.NEGATIVE_INFINITY;
			for (int i = k; i < (cols); ++i) {
				double norm2 = 0;
				int iDiag = (k * (cols)) + (permutation[i]);
				for (int index = iDiag; index < (jacobian.length); index += cols) {
					double aki = jacobian[index];
					norm2 += aki * aki;
				}
				if (norm2 > ak2) {
					nextColumn = i;
					ak2 = norm2;
				}
			}
			if (ak2 == 0) {
				rank = k;
				return ;
			}
			int pk = permutation[nextColumn];
			permutation[nextColumn] = permutation[k];
			permutation[k] = pk;
			int kDiag = (k * (cols)) + pk;
			double akk = jacobian[kDiag];
			double alpha = akk > 0 ? -(java.lang.Math.sqrt(ak2)) : java.lang.Math.sqrt(ak2);
			double betak = 1.0 / (ak2 - (akk * alpha));
			beta[pk] = betak;
			diagR[pk] = alpha;
			jacobian[kDiag] -= alpha;
			for (int dk = ((cols) - 1) - k; dk > 0; --dk) {
				int dkp = (permutation[(k + dk)]) - pk;
				double gamma = 0;
				for (int index = kDiag; index < (jacobian.length); index += cols) {
					gamma += (jacobian[index]) * (jacobian[(index + dkp)]);
				}
				gamma *= betak;
				for (int index = kDiag; index < (jacobian.length); index += cols) {
					jacobian[(index + dkp)] -= gamma * (jacobian[index]);
				}
			}
		}
		rank = solvedCols;
	}

	private void qTy(double[] y) {
		for (int k = 0; k < (cols); ++k) {
			int pk = permutation[k];
			int kDiag = (k * (cols)) + pk;
			double gamma = 0;
			for (int i = k, index = kDiag; i < (rows); ++i , index += cols) {
				gamma += (jacobian[index]) * (y[i]);
			}
			gamma *= beta[pk];
			for (int i = k, index = kDiag; i < (rows); ++i , index += cols) {
				y[i] -= gamma * (jacobian[index]);
			}
		}
	}

	private org.apache.commons.math.estimation.WeightedMeasurement[] measurements;

	private org.apache.commons.math.estimation.EstimatedParameter[] parameters;

	private double[] jacobian;

	private int cols;

	private int solvedCols;

	private int rows;

	private double[] diagR;

	private double[] jacNorm;

	private double[] beta;

	private int[] permutation;

	private int rank;

	private double lmPar;

	private double[] lmDir;

	private double[] residuals;

	private double cost;

	private double initialStepBoundFactor;

	private int maxCostEval;

	private int costEvaluations;

	private int jacobianEvaluations;

	private double costRelativeTolerance;

	private double parRelativeTolerance;

	private double orthoTolerance;

	private static final long serialVersionUID = 5387476316105068340L;
}

