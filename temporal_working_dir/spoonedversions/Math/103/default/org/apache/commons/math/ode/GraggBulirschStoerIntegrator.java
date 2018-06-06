

package org.apache.commons.math.ode;


public class GraggBulirschStoerIntegrator extends org.apache.commons.math.ode.AdaptiveStepsizeIntegrator {
	private static final java.lang.String methodName = "Gragg-Bulirsch-Stoer";

	public GraggBulirschStoerIntegrator(double minStep, double maxStep, double scalAbsoluteTolerance, double scalRelativeTolerance) {
		super(minStep, maxStep, scalAbsoluteTolerance, scalRelativeTolerance);
		denseOutput = (handler.requiresDenseOutput()) || (!(switchesHandler.isEmpty()));
		setStabilityCheck(true, (-1), (-1), (-1));
		setStepsizeControl((-1), (-1), (-1), (-1));
		setOrderControl((-1), (-1), (-1));
		setInterpolationControl(true, (-1));
	}

	public GraggBulirschStoerIntegrator(double minStep, double maxStep, double[] vecAbsoluteTolerance, double[] vecRelativeTolerance) {
		super(minStep, maxStep, vecAbsoluteTolerance, vecRelativeTolerance);
		denseOutput = (handler.requiresDenseOutput()) || (!(switchesHandler.isEmpty()));
		setStabilityCheck(true, (-1), (-1), (-1));
		setStepsizeControl((-1), (-1), (-1), (-1));
		setOrderControl((-1), (-1), (-1));
		setInterpolationControl(true, (-1));
	}

	public void setStabilityCheck(boolean performTest, int maxIter, int maxChecks, double stabilityReduction) {
		org.apache.commons.math.ode.GraggBulirschStoerIntegrator.this.performTest = performTest;
		org.apache.commons.math.ode.GraggBulirschStoerIntegrator.this.maxIter = (maxIter <= 0) ? 2 : maxIter;
		org.apache.commons.math.ode.GraggBulirschStoerIntegrator.this.maxChecks = (maxChecks <= 0) ? 1 : maxChecks;
		if ((stabilityReduction < 1.0E-4) || (stabilityReduction > 0.9999)) {
			org.apache.commons.math.ode.GraggBulirschStoerIntegrator.this.stabilityReduction = 0.5;
		}else {
			org.apache.commons.math.ode.GraggBulirschStoerIntegrator.this.stabilityReduction = stabilityReduction;
		}
	}

	public void setStepsizeControl(double stepControl1, double stepControl2, double stepControl3, double stepControl4) {
		if ((stepControl1 < 1.0E-4) || (stepControl1 > 0.9999)) {
			org.apache.commons.math.ode.GraggBulirschStoerIntegrator.this.stepControl1 = 0.65;
		}else {
			org.apache.commons.math.ode.GraggBulirschStoerIntegrator.this.stepControl1 = stepControl1;
		}
		if ((stepControl2 < 1.0E-4) || (stepControl2 > 0.9999)) {
			org.apache.commons.math.ode.GraggBulirschStoerIntegrator.this.stepControl2 = 0.94;
		}else {
			org.apache.commons.math.ode.GraggBulirschStoerIntegrator.this.stepControl2 = stepControl2;
		}
		if ((stepControl3 < 1.0E-4) || (stepControl3 > 0.9999)) {
			org.apache.commons.math.ode.GraggBulirschStoerIntegrator.this.stepControl3 = 0.02;
		}else {
			org.apache.commons.math.ode.GraggBulirschStoerIntegrator.this.stepControl3 = stepControl3;
		}
		if ((stepControl4 < 1.0001) || (stepControl4 > 999.9)) {
			org.apache.commons.math.ode.GraggBulirschStoerIntegrator.this.stepControl4 = 4.0;
		}else {
			org.apache.commons.math.ode.GraggBulirschStoerIntegrator.this.stepControl4 = stepControl4;
		}
	}

	public void setOrderControl(int maxOrder, double orderControl1, double orderControl2) {
		if ((maxOrder <= 6) || ((maxOrder % 2) != 0)) {
			org.apache.commons.math.ode.GraggBulirschStoerIntegrator.this.maxOrder = 18;
		}
		if ((orderControl1 < 1.0E-4) || (orderControl1 > 0.9999)) {
			org.apache.commons.math.ode.GraggBulirschStoerIntegrator.this.orderControl1 = 0.8;
		}else {
			org.apache.commons.math.ode.GraggBulirschStoerIntegrator.this.orderControl1 = orderControl1;
		}
		if ((orderControl2 < 1.0E-4) || (orderControl2 > 0.9999)) {
			org.apache.commons.math.ode.GraggBulirschStoerIntegrator.this.orderControl2 = 0.9;
		}else {
			org.apache.commons.math.ode.GraggBulirschStoerIntegrator.this.orderControl2 = orderControl2;
		}
		initializeArrays();
	}

	public void setStepHandler(org.apache.commons.math.ode.StepHandler handler) {
		super.setStepHandler(handler);
		denseOutput = (handler.requiresDenseOutput()) || (!(switchesHandler.isEmpty()));
		initializeArrays();
	}

	public void addSwitchingFunction(org.apache.commons.math.ode.SwitchingFunction function, double maxCheckInterval, double convergence) {
		super.addSwitchingFunction(function, maxCheckInterval, convergence);
		denseOutput = (handler.requiresDenseOutput()) || (!(switchesHandler.isEmpty()));
		initializeArrays();
	}

	private void initializeArrays() {
		int size = (maxOrder) / 2;
		if (((sequence) == null) || ((sequence.length) != size)) {
			sequence = new int[size];
			costPerStep = new int[size];
			coeff = new double[size][];
			costPerTimeUnit = new double[size];
			optimalStep = new double[size];
		}
		if (denseOutput) {
			for (int k = 0; k < size; ++k) {
				sequence[k] = (4 * k) + 2;
			}
		}else {
			for (int k = 0; k < size; ++k) {
				sequence[k] = 2 * (k + 1);
			}
		}
		costPerStep[0] = (sequence[0]) + 1;
		for (int k = 1; k < size; ++k) {
			costPerStep[k] = (costPerStep[(k - 1)]) + (sequence[k]);
		}
		for (int k = 0; k < size; ++k) {
			coeff[k] = (k > 0) ? new double[k] : null;
			for (int l = 0; l < k; ++l) {
				double ratio = ((double) (sequence[k])) / (sequence[((k - l) - 1)]);
				coeff[k][l] = 1.0 / ((ratio * ratio) - 1.0);
			}
		}
	}

	public void setInterpolationControl(boolean useInterpolationError, int mudif) {
		org.apache.commons.math.ode.GraggBulirschStoerIntegrator.this.useInterpolationError = useInterpolationError;
		if ((mudif <= 0) || (mudif >= 7)) {
			org.apache.commons.math.ode.GraggBulirschStoerIntegrator.this.mudif = 4;
		}else {
			org.apache.commons.math.ode.GraggBulirschStoerIntegrator.this.mudif = mudif;
		}
	}

	public java.lang.String getName() {
		return org.apache.commons.math.ode.GraggBulirschStoerIntegrator.methodName;
	}

	private void rescale(double[] y1, double[] y2, double[] scale) {
		if ((vecAbsoluteTolerance) == null) {
			for (int i = 0; i < (scale.length); ++i) {
				double yi = java.lang.Math.max(java.lang.Math.abs(y1[i]), java.lang.Math.abs(y2[i]));
				scale[i] = (scalAbsoluteTolerance) + ((scalRelativeTolerance) * yi);
			}
		}else {
			for (int i = 0; i < (scale.length); ++i) {
				double yi = java.lang.Math.max(java.lang.Math.abs(y1[i]), java.lang.Math.abs(y2[i]));
				scale[i] = (vecAbsoluteTolerance[i]) + ((vecRelativeTolerance[i]) * yi);
			}
		}
	}

	private boolean tryStep(org.apache.commons.math.ode.FirstOrderDifferentialEquations equations, double t0, double[] y0, double step, int k, double[] scale, double[][] f, double[] yMiddle, double[] yEnd, double[] yTmp) throws org.apache.commons.math.ode.DerivativeException {
		int n = sequence[k];
		double subStep = step / n;
		double subStep2 = 2 * subStep;
		double t = t0 + subStep;
		for (int i = 0; i < (y0.length); ++i) {
			yTmp[i] = y0[i];
			yEnd[i] = (y0[i]) + (subStep * (f[0][i]));
		}
		equations.computeDerivatives(t, yEnd, f[1]);
		for (int j = 1; j < n; ++j) {
			if ((2 * j) == n) {
				java.lang.System.arraycopy(yEnd, 0, yMiddle, 0, y0.length);
			}
			t += subStep;
			for (int i = 0; i < (y0.length); ++i) {
				double middle = yEnd[i];
				yEnd[i] = (yTmp[i]) + (subStep2 * (f[j][i]));
				yTmp[i] = middle;
			}
			equations.computeDerivatives(t, yEnd, f[(j + 1)]);
			if (((performTest) && (j <= (maxChecks))) && (k < (maxIter))) {
				double initialNorm = 0.0;
				for (int l = 0; l < (y0.length); ++l) {
					double ratio = (f[0][l]) / (scale[l]);
					initialNorm += ratio * ratio;
				}
				double deltaNorm = 0.0;
				for (int l = 0; l < (y0.length); ++l) {
					double ratio = ((f[(j + 1)][l]) - (f[0][l])) / (scale[l]);
					deltaNorm += ratio * ratio;
				}
				if (deltaNorm > (4 * (java.lang.Math.max(1.0E-15, initialNorm)))) {
					return false;
				}
			}
		}
		for (int i = 0; i < (y0.length); ++i) {
			yEnd[i] = 0.5 * (((yTmp[i]) + (yEnd[i])) + (subStep * (f[n][i])));
		}
		return true;
	}

	private void extrapolate(int offset, int k, double[][] diag, double[] last) {
		for (int j = 1; j < k; ++j) {
			for (int i = 0; i < (last.length); ++i) {
				diag[((k - j) - 1)][i] = (diag[(k - j)][i]) + ((coeff[(k + offset)][(j - 1)]) * ((diag[(k - j)][i]) - (diag[((k - j) - 1)][i])));
			}
		}
		for (int i = 0; i < (last.length); ++i) {
			last[i] = (diag[0][i]) + ((coeff[(k + offset)][(k - 1)]) * ((diag[0][i]) - (last[i])));
		}
	}

	public void integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations equations, double t0, double[] y0, double t, double[] y) throws org.apache.commons.math.ode.DerivativeException, org.apache.commons.math.ode.IntegratorException {
		if ((equations.getDimension()) != (y0.length)) {
			throw new org.apache.commons.math.ode.IntegratorException(("dimensions mismatch: " + ("ODE problem has dimension {0}" + ", state vector has dimension {1}")), new java.lang.String[]{ java.lang.Integer.toString(equations.getDimension()) , java.lang.Integer.toString(y0.length) });
		}
		if ((java.lang.Math.abs((t - t0))) <= (1.0E-12 * (java.lang.Math.max(java.lang.Math.abs(t0), java.lang.Math.abs(t))))) {
			throw new org.apache.commons.math.ode.IntegratorException("too small integration interval: length = {0}", new java.lang.String[]{ java.lang.Double.toString(java.lang.Math.abs((t - t0))) });
		}
		boolean forward = t > t0;
		double[] yDot0 = new double[y0.length];
		double[] y1 = new double[y0.length];
		double[] yTmp = new double[y0.length];
		double[] yTmpDot = new double[y0.length];
		double[][] diagonal = new double[(sequence.length) - 1][];
		double[][] y1Diag = new double[(sequence.length) - 1][];
		for (int k = 0; k < ((sequence.length) - 1); ++k) {
			diagonal[k] = new double[y0.length];
			y1Diag[k] = new double[y0.length];
		}
		double[][][] fk = new double[sequence.length][][];
		for (int k = 0; k < (sequence.length); ++k) {
			fk[k] = new double[(sequence[k]) + 1][];
			fk[k][0] = yDot0;
			for (int l = 0; l < (sequence[k]); ++l) {
				fk[k][(l + 1)] = new double[y0.length];
			}
		}
		if (y != y0) {
			java.lang.System.arraycopy(y0, 0, y, 0, y0.length);
		}
		double[] yDot1 = null;
		double[][] yMidDots = null;
		if (denseOutput) {
			yDot1 = new double[y0.length];
			yMidDots = new double[1 + (2 * (sequence.length))][];
			for (int j = 0; j < (yMidDots.length); ++j) {
				yMidDots[j] = new double[y0.length];
			}
		}else {
			yMidDots = new double[1][];
			yMidDots[0] = new double[y0.length];
		}
		double[] scale = new double[y0.length];
		rescale(y, y, scale);
		double log10R = (java.lang.Math.log(java.lang.Math.max(1.0E-10, ((vecRelativeTolerance) == null ? scalRelativeTolerance : vecRelativeTolerance[0])))) / (java.lang.Math.log(10.0));
		int targetIter = java.lang.Math.max(1, java.lang.Math.min(((sequence.length) - 2), ((int) (java.lang.Math.floor((0.5 - (0.6 * log10R)))))));
		org.apache.commons.math.ode.AbstractStepInterpolator interpolator = null;
		if ((denseOutput) || (!(switchesHandler.isEmpty()))) {
			interpolator = new org.apache.commons.math.ode.GraggBulirschStoerStepInterpolator(y, yDot0, y1, yDot1, yMidDots, forward);
		}else {
			interpolator = new org.apache.commons.math.ode.DummyStepInterpolator(y, forward);
		}
		interpolator.storeTime(t0);
		double currentT = t0;
		double hNew = 0;
		double maxError = java.lang.Double.MAX_VALUE;
		boolean previousRejected = false;
		boolean firstTime = true;
		boolean newStep = true;
		boolean lastStep = false;
		boolean firstStepAlreadyComputed = false;
		handler.reset();
		costPerTimeUnit[0] = 0;
		while (!lastStep) {
			double h;
			double error;
			boolean reject = false;
			if (newStep) {
				interpolator.shift();
				if (!firstStepAlreadyComputed) {
					equations.computeDerivatives(currentT, y, yDot0);
				}
				if (firstTime) {
					hNew = initializeStep(equations, forward, ((2 * targetIter) + 1), scale, currentT, y, yDot0, yTmp, yTmpDot);
					if (!forward) {
						hNew = -hNew;
					}
				}
				newStep = false;
			}
			h = hNew;
			if ((forward && ((currentT + h) > t)) || ((!forward) && ((currentT + h) < t))) {
				h = t - currentT;
			}
			double nextT = currentT + h;
			lastStep = (forward) ? nextT >= t : nextT <= t;
			int k = -1;
			for (boolean loop = true; loop;) {
				++k;
				if (!(tryStep(equations, currentT, y, h, k, scale, fk[k], (k == 0 ? yMidDots[0] : diagonal[(k - 1)]), (k == 0 ? y1 : y1Diag[(k - 1)]), yTmp))) {
					hNew = java.lang.Math.abs(filterStep((h * (stabilityReduction)), false));
					reject = true;
					loop = false;
				}else {
					if (k > 0) {
						extrapolate(0, k, y1Diag, y1);
						rescale(y, y1, scale);
						error = 0;
						for (int j = 0; j < (y0.length); ++j) {
							double e = (java.lang.Math.abs(((y1[j]) - (y1Diag[0][j])))) / (scale[j]);
							error += e * e;
						}
						error = java.lang.Math.sqrt((error / (y0.length)));
						if ((error > 1.0E15) || ((k > 1) && (error > maxError))) {
							hNew = java.lang.Math.abs(filterStep((h * (stabilityReduction)), false));
							reject = true;
							loop = false;
						}else {
							maxError = java.lang.Math.max((4 * error), 1.0);
							double exp = 1.0 / ((2 * k) + 1);
							double fac = (stepControl2) / (java.lang.Math.pow((error / (stepControl1)), exp));
							double pow = java.lang.Math.pow(stepControl3, exp);
							fac = java.lang.Math.max((pow / (stepControl4)), java.lang.Math.min((1 / pow), fac));
							optimalStep[k] = java.lang.Math.abs(filterStep((h * fac), true));
							costPerTimeUnit[k] = (costPerStep[k]) / (optimalStep[k]);
							switch (k - targetIter) {
								case -1 :
									if ((targetIter > 1) && (!previousRejected)) {
										if (error <= 1.0) {
											loop = false;
										}else {
											double ratio = (((double) (sequence[k])) * (sequence[(k + 1)])) / ((sequence[0]) * (sequence[0]));
											if (error > (ratio * ratio)) {
												reject = true;
												loop = false;
												targetIter = k;
												if ((targetIter > 1) && ((costPerTimeUnit[(targetIter - 1)]) < ((orderControl1) * (costPerTimeUnit[targetIter])))) {
													--targetIter;
												}
												hNew = optimalStep[targetIter];
											}
										}
									}
									break;
								case 0 :
									if (error <= 1.0) {
										loop = false;
									}else {
										double ratio = ((double) (sequence[(k + 1)])) / (sequence[0]);
										if (error > (ratio * ratio)) {
											reject = true;
											loop = false;
											if ((targetIter > 1) && ((costPerTimeUnit[(targetIter - 1)]) < ((orderControl1) * (costPerTimeUnit[targetIter])))) {
												--targetIter;
											}
											hNew = optimalStep[targetIter];
										}
									}
									break;
								case 1 :
									if (error > 1.0) {
										reject = true;
										if ((targetIter > 1) && ((costPerTimeUnit[(targetIter - 1)]) < ((orderControl1) * (costPerTimeUnit[targetIter])))) {
											--targetIter;
										}
										hNew = optimalStep[targetIter];
									}
									loop = false;
									break;
								default :
									if ((firstTime || lastStep) && (error <= 1.0)) {
										loop = false;
									}
									break;
							}
						}
					}
				}
			}
			double hInt = getMaxStep();
			if ((denseOutput) && (!reject)) {
				for (int j = 1; j <= k; ++j) {
					extrapolate(0, j, diagonal, yMidDots[0]);
				}
				equations.computeDerivatives((currentT + h), y1, yDot1);
				int mu = ((2 * k) - (mudif)) + 3;
				for (int l = 0; l < mu; ++l) {
					int l2 = l / 2;
					double factor = java.lang.Math.pow((0.5 * (sequence[l2])), l);
					int middleIndex = (fk[l2].length) / 2;
					for (int i = 0; i < (y0.length); ++i) {
						yMidDots[(l + 1)][i] = factor * (fk[l2][(middleIndex + l)][i]);
					}
					for (int j = 1; j <= (k - l2); ++j) {
						factor = java.lang.Math.pow((0.5 * (sequence[(j + l2)])), l);
						middleIndex = (fk[(l2 + j)].length) / 2;
						for (int i = 0; i < (y0.length); ++i) {
							diagonal[(j - 1)][i] = factor * (fk[(l2 + j)][(middleIndex + l)][i]);
						}
						extrapolate(l2, j, diagonal, yMidDots[(l + 1)]);
					}
					for (int i = 0; i < (y0.length); ++i) {
						yMidDots[(l + 1)][i] *= h;
					}
					for (int j = (l + 1) / 2; j <= k; ++j) {
						for (int m = (fk[j].length) - 1; m >= (2 * (l + 1)); --m) {
							for (int i = 0; i < (y0.length); ++i) {
								fk[j][m][i] -= fk[j][(m - 2)][i];
							}
						}
					}
				}
				if (mu >= 0) {
					org.apache.commons.math.ode.GraggBulirschStoerStepInterpolator gbsInterpolator = ((org.apache.commons.math.ode.GraggBulirschStoerStepInterpolator) (interpolator));
					gbsInterpolator.computeCoefficients(mu, h);
					if (useInterpolationError) {
						double interpError = gbsInterpolator.estimateError(scale);
						hInt = java.lang.Math.abs((h / (java.lang.Math.max(java.lang.Math.pow(interpError, (1.0 / (mu + 4))), 0.01))));
						if (interpError > 10.0) {
							hNew = hInt;
							reject = true;
						}
					}
					if (!reject) {
						interpolator.storeTime((currentT + h));
						if (switchesHandler.evaluateStep(interpolator)) {
							reject = true;
							hNew = java.lang.Math.abs(((switchesHandler.getEventTime()) - currentT));
						}
					}
				}
				if (!reject) {
					firstStepAlreadyComputed = true;
					java.lang.System.arraycopy(yDot1, 0, yDot0, 0, y0.length);
				}
			}
			if (!reject) {
				currentT += h;
				java.lang.System.arraycopy(y1, 0, y, 0, y0.length);
				switchesHandler.stepAccepted(currentT, y);
				if (switchesHandler.stop()) {
					lastStep = true;
				}
				interpolator.storeTime(currentT);
				handler.handleStep(interpolator, lastStep);
				if ((switchesHandler.reset(currentT, y)) && (!lastStep)) {
					firstStepAlreadyComputed = false;
				}
				int optimalIter;
				if (k == 1) {
					optimalIter = 2;
					if (previousRejected) {
						optimalIter = 1;
					}
				}else
					if (k <= targetIter) {
						optimalIter = k;
						if ((costPerTimeUnit[(k - 1)]) < ((orderControl1) * (costPerTimeUnit[k]))) {
							optimalIter = k - 1;
						}else
							if ((costPerTimeUnit[k]) < ((orderControl2) * (costPerTimeUnit[(k - 1)]))) {
								optimalIter = java.lang.Math.min((k + 1), ((sequence.length) - 2));
							}
						
					}else {
						optimalIter = k - 1;
						if ((k > 2) && ((costPerTimeUnit[(k - 2)]) < ((orderControl1) * (costPerTimeUnit[(k - 1)])))) {
							optimalIter = k - 2;
						}
						if ((costPerTimeUnit[k]) < ((orderControl2) * (costPerTimeUnit[optimalIter]))) {
							optimalIter = java.lang.Math.min(k, ((sequence.length) - 2));
						}
					}
				
				if (previousRejected) {
					targetIter = java.lang.Math.min(optimalIter, k);
					hNew = java.lang.Math.min(java.lang.Math.abs(h), optimalStep[targetIter]);
				}else {
					if (optimalIter <= k) {
						hNew = optimalStep[optimalIter];
					}else {
						if ((k < targetIter) && ((costPerTimeUnit[k]) < ((orderControl2) * (costPerTimeUnit[(k - 1)])))) {
							hNew = filterStep((((optimalStep[k]) * (costPerStep[(optimalIter + 1)])) / (costPerStep[k])), false);
						}else {
							hNew = filterStep((((optimalStep[k]) * (costPerStep[optimalIter])) / (costPerStep[k])), false);
						}
					}
					targetIter = optimalIter;
				}
				newStep = true;
			}
			hNew = java.lang.Math.min(hNew, hInt);
			if (!forward) {
				hNew = -hNew;
			}
			firstTime = false;
			if (reject) {
				lastStep = false;
				previousRejected = true;
			}else {
				previousRejected = false;
			}
		} 
	}

	private int maxOrder;

	private int[] sequence;

	private int[] costPerStep;

	private double[] costPerTimeUnit;

	private double[] optimalStep;

	private double[][] coeff;

	private boolean performTest;

	private int maxChecks;

	private int maxIter;

	private double stabilityReduction;

	private double stepControl1;

	private double stepControl2;

	private double stepControl3;

	private double stepControl4;

	private double orderControl1;

	private double orderControl2;

	private boolean denseOutput;

	private boolean useInterpolationError;

	private int mudif;
}

