

package org.apache.commons.math.ode;


public abstract class RungeKuttaFehlbergIntegrator extends org.apache.commons.math.ode.AdaptiveStepsizeIntegrator {
	protected RungeKuttaFehlbergIntegrator(boolean fsal, double[] c, double[][] a, double[] b, org.apache.commons.math.ode.RungeKuttaStepInterpolator prototype, double minStep, double maxStep, double scalAbsoluteTolerance, double scalRelativeTolerance) {
		super(minStep, maxStep, scalAbsoluteTolerance, scalRelativeTolerance);
		org.apache.commons.math.ode.RungeKuttaFehlbergIntegrator.this.fsal = fsal;
		org.apache.commons.math.ode.RungeKuttaFehlbergIntegrator.this.c = c;
		org.apache.commons.math.ode.RungeKuttaFehlbergIntegrator.this.a = a;
		org.apache.commons.math.ode.RungeKuttaFehlbergIntegrator.this.b = b;
		org.apache.commons.math.ode.RungeKuttaFehlbergIntegrator.this.prototype = prototype;
		exp = (-1.0) / (getOrder());
		org.apache.commons.math.ode.RungeKuttaFehlbergIntegrator.this.safety = 0.9;
		setMinReduction(0.2);
		setMaxGrowth(10.0);
	}

	protected RungeKuttaFehlbergIntegrator(boolean fsal, double[] c, double[][] a, double[] b, org.apache.commons.math.ode.RungeKuttaStepInterpolator prototype, double minStep, double maxStep, double[] vecAbsoluteTolerance, double[] vecRelativeTolerance) {
		super(minStep, maxStep, vecAbsoluteTolerance, vecRelativeTolerance);
		org.apache.commons.math.ode.RungeKuttaFehlbergIntegrator.this.fsal = fsal;
		org.apache.commons.math.ode.RungeKuttaFehlbergIntegrator.this.c = c;
		org.apache.commons.math.ode.RungeKuttaFehlbergIntegrator.this.a = a;
		org.apache.commons.math.ode.RungeKuttaFehlbergIntegrator.this.b = b;
		org.apache.commons.math.ode.RungeKuttaFehlbergIntegrator.this.prototype = prototype;
		exp = (-1.0) / (getOrder());
		org.apache.commons.math.ode.RungeKuttaFehlbergIntegrator.this.safety = 0.9;
		setMinReduction(0.2);
		setMaxGrowth(10.0);
	}

	public abstract java.lang.String getName();

	public abstract int getOrder();

	public double getSafety() {
		return safety;
	}

	public void setSafety(double safety) {
		org.apache.commons.math.ode.RungeKuttaFehlbergIntegrator.this.safety = safety;
	}

	public void integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations equations, double t0, double[] y0, double t, double[] y) throws org.apache.commons.math.ode.DerivativeException, org.apache.commons.math.ode.IntegratorException {
		if ((equations.getDimension()) != (y0.length)) {
			throw new org.apache.commons.math.ode.IntegratorException(("dimensions mismatch: ODE problem has dimension {0}," + " state vector has dimension {1}"), new java.lang.String[]{ java.lang.Integer.toString(equations.getDimension()) , java.lang.Integer.toString(y0.length) });
		}
		if ((java.lang.Math.abs((t - t0))) <= (1.0E-12 * (java.lang.Math.max(java.lang.Math.abs(t0), java.lang.Math.abs(t))))) {
			throw new org.apache.commons.math.ode.IntegratorException("too small integration interval: length = {0}", new java.lang.String[]{ java.lang.Double.toString(java.lang.Math.abs((t - t0))) });
		}
		boolean forward = t > t0;
		int stages = (c.length) + 1;
		if (y != y0) {
			java.lang.System.arraycopy(y0, 0, y, 0, y0.length);
		}
		double[][] yDotK = new double[stages][];
		for (int i = 0; i < stages; ++i) {
			yDotK[i] = new double[y0.length];
		}
		double[] yTmp = new double[y0.length];
		org.apache.commons.math.ode.AbstractStepInterpolator interpolator;
		if ((handler.requiresDenseOutput()) || (!(switchesHandler.isEmpty()))) {
			org.apache.commons.math.ode.RungeKuttaStepInterpolator rki = ((org.apache.commons.math.ode.RungeKuttaStepInterpolator) (prototype.clone()));
			rki.reinitialize(equations, yTmp, yDotK, forward);
			interpolator = rki;
		}else {
			interpolator = new org.apache.commons.math.ode.DummyStepInterpolator(yTmp, forward);
		}
		interpolator.storeTime(t0);
		double currentT = t0;
		double hNew = 0;
		boolean firstTime = true;
		boolean lastStep;
		handler.reset();
		do {
			interpolator.shift();
			double h = 0;
			double error = 0;
			for (boolean loop = true; loop;) {
				if (firstTime || (!(fsal))) {
					equations.computeDerivatives(currentT, y, yDotK[0]);
				}
				if (firstTime) {
					double[] scale;
					if ((vecAbsoluteTolerance) != null) {
						scale = vecAbsoluteTolerance;
					}else {
						scale = new double[y0.length];
						for (int i = 0; i < (scale.length); ++i) {
							scale[i] = scalAbsoluteTolerance;
						}
					}
					hNew = initializeStep(equations, forward, getOrder(), scale, currentT, y, yDotK[0], yTmp, yDotK[1]);
					firstTime = false;
				}
				h = hNew;
				if ((forward && ((currentT + h) > t)) || ((!forward) && ((currentT + h) < t))) {
					h = t - currentT;
				}
				for (int k = 1; k < stages; ++k) {
					for (int j = 0; j < (y0.length); ++j) {
						double sum = (a[(k - 1)][0]) * (yDotK[0][j]);
						for (int l = 1; l < k; ++l) {
							sum += (a[(k - 1)][l]) * (yDotK[l][j]);
						}
						yTmp[j] = (y[j]) + (h * sum);
					}
					equations.computeDerivatives((currentT + ((c[(k - 1)]) * h)), yTmp, yDotK[k]);
				}
				for (int j = 0; j < (y0.length); ++j) {
					double sum = (b[0]) * (yDotK[0][j]);
					for (int l = 1; l < stages; ++l) {
						sum += (b[l]) * (yDotK[l][j]);
					}
					yTmp[j] = (y[j]) + (h * sum);
				}
				error = estimateError(yDotK, y, yTmp, h);
				if (error <= 1.0) {
					interpolator.storeTime((currentT + h));
					if (switchesHandler.evaluateStep(interpolator)) {
						hNew = (switchesHandler.getEventTime()) - currentT;
					}else {
						loop = false;
					}
				}else {
					double factor = java.lang.Math.min(maxGrowth, java.lang.Math.max(minReduction, ((safety) * (java.lang.Math.pow(error, exp)))));
					hNew = filterStep((h * factor), false);
				}
			}
			currentT += h;
			java.lang.System.arraycopy(yTmp, 0, y, 0, y0.length);
			switchesHandler.stepAccepted(currentT, y);
			if (switchesHandler.stop()) {
				lastStep = true;
			}else {
				lastStep = (forward) ? currentT >= t : currentT <= t;
			}
			interpolator.storeTime(currentT);
			handler.handleStep(interpolator, lastStep);
			if (fsal) {
				java.lang.System.arraycopy(yDotK[(stages - 1)], 0, yDotK[0], 0, y0.length);
			}
			if ((switchesHandler.reset(currentT, y)) && (!lastStep)) {
				equations.computeDerivatives(currentT, y, yDotK[0]);
			}
			if (!lastStep) {
				double factor = java.lang.Math.min(maxGrowth, java.lang.Math.max(minReduction, ((safety) * (java.lang.Math.pow(error, exp)))));
				double scaledH = h * factor;
				double nextT = currentT + scaledH;
				boolean nextIsLast = forward ? nextT >= t : nextT <= t;
				hNew = filterStep(scaledH, nextIsLast);
			}
		} while (!lastStep );
	}

	public double getMinReduction() {
		return minReduction;
	}

	public void setMinReduction(double minReduction) {
		org.apache.commons.math.ode.RungeKuttaFehlbergIntegrator.this.minReduction = minReduction;
	}

	public double getMaxGrowth() {
		return maxGrowth;
	}

	public void setMaxGrowth(double maxGrowth) {
		org.apache.commons.math.ode.RungeKuttaFehlbergIntegrator.this.maxGrowth = maxGrowth;
	}

	protected abstract double estimateError(double[][] yDotK, double[] y0, double[] y1, double h);

	private boolean fsal;

	private double[] c;

	private double[][] a;

	private double[] b;

	private org.apache.commons.math.ode.RungeKuttaStepInterpolator prototype;

	private double exp;

	private double safety;

	private double minReduction;

	private double maxGrowth;
}

