

package org.apache.commons.math.ode.nonstiff;


public abstract class EmbeddedRungeKuttaIntegrator extends org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator {
	protected EmbeddedRungeKuttaIntegrator(final java.lang.String name, final boolean fsal, final double[] c, final double[][] a, final double[] b, final org.apache.commons.math.ode.nonstiff.RungeKuttaStepInterpolator prototype, final double minStep, final double maxStep, final double scalAbsoluteTolerance, final double scalRelativeTolerance) {
		super(name, minStep, maxStep, scalAbsoluteTolerance, scalRelativeTolerance);
		org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.this.fsal = fsal;
		org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.this.c = c;
		org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.this.a = a;
		org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.this.b = b;
		org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.this.prototype = prototype;
		exp = (-1.0) / (getOrder());
		setSafety(0.9);
		setMinReduction(0.2);
		setMaxGrowth(10.0);
	}

	protected EmbeddedRungeKuttaIntegrator(final java.lang.String name, final boolean fsal, final double[] c, final double[][] a, final double[] b, final org.apache.commons.math.ode.nonstiff.RungeKuttaStepInterpolator prototype, final double minStep, final double maxStep, final double[] vecAbsoluteTolerance, final double[] vecRelativeTolerance) {
		super(name, minStep, maxStep, vecAbsoluteTolerance, vecRelativeTolerance);
		org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.this.fsal = fsal;
		org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.this.c = c;
		org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.this.a = a;
		org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.this.b = b;
		org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.this.prototype = prototype;
		exp = (-1.0) / (getOrder());
		setSafety(0.9);
		setMinReduction(0.2);
		setMaxGrowth(10.0);
	}

	public abstract int getOrder();

	public double getSafety() {
		return safety;
	}

	public void setSafety(final double safety) {
		org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.this.safety = safety;
	}

	public double integrate(final org.apache.commons.math.ode.FirstOrderDifferentialEquations equations, final double t0, final double[] y0, final double t, final double[] y) throws org.apache.commons.math.ode.DerivativeException, org.apache.commons.math.ode.IntegratorException {
		sanityChecks(equations, t0, y0, t, y);
		final boolean forward = t > t0;
		final int stages = (c.length) + 1;
		if (y != y0) {
			java.lang.System.arraycopy(y0, 0, y, 0, y0.length);
		}
		final double[][] yDotK = new double[stages][];
		for (int i = 0; i < stages; ++i) {
			yDotK[i] = new double[y0.length];
		}
		final double[] yTmp = new double[y0.length];
		org.apache.commons.math.ode.sampling.AbstractStepInterpolator interpolator;
		if ((requiresDenseOutput()) || (!(eventsHandlersManager.isEmpty()))) {
			final org.apache.commons.math.ode.nonstiff.RungeKuttaStepInterpolator rki = ((org.apache.commons.math.ode.nonstiff.RungeKuttaStepInterpolator) (prototype.copy()));
			rki.reinitialize(equations, yTmp, yDotK, forward);
			interpolator = rki;
		}else {
			interpolator = new org.apache.commons.math.ode.sampling.DummyStepInterpolator(yTmp, forward);
		}
		interpolator.storeTime(t0);
		stepStart = t0;
		double hNew = 0;
		boolean firstTime = true;
		for (org.apache.commons.math.ode.sampling.StepHandler handler : stepHandlers) {
			handler.reset();
		}
		org.apache.commons.math.ode.events.CombinedEventsManager manager = addEndTimeChecker(t0, t, eventsHandlersManager);
		boolean lastStep = false;
		while (!lastStep) {
			interpolator.shift();
			double error = 0;
			for (boolean loop = true; loop;) {
				if (firstTime || (!(fsal))) {
					equations.computeDerivatives(stepStart, y, yDotK[0]);
				}
				if (firstTime) {
					final double[] scale;
					if ((vecAbsoluteTolerance) != null) {
						scale = vecAbsoluteTolerance;
					}else {
						scale = new double[y0.length];
						for (int i = 0; i < (scale.length); ++i) {
							scale[i] = scalAbsoluteTolerance;
						}
					}
					hNew = initializeStep(equations, forward, getOrder(), scale, stepStart, y, yDotK[0], yTmp, yDotK[1]);
					firstTime = false;
				}
				stepSize = hNew;
				for (int k = 1; k < stages; ++k) {
					for (int j = 0; j < (y0.length); ++j) {
						double sum = (a[(k - 1)][0]) * (yDotK[0][j]);
						for (int l = 1; l < k; ++l) {
							sum += (a[(k - 1)][l]) * (yDotK[l][j]);
						}
						yTmp[j] = (y[j]) + ((stepSize) * sum);
					}
					equations.computeDerivatives(((stepStart) + ((c[(k - 1)]) * (stepSize))), yTmp, yDotK[k]);
				}
				for (int j = 0; j < (y0.length); ++j) {
					double sum = (b[0]) * (yDotK[0][j]);
					for (int l = 1; l < stages; ++l) {
						sum += (b[l]) * (yDotK[l][j]);
					}
					yTmp[j] = (y[j]) + ((stepSize) * sum);
				}
				error = estimateError(yDotK, y, yTmp, stepSize);
				if (error <= 1.0) {
					interpolator.storeTime(((stepStart) + (stepSize)));
					if (manager.evaluateStep(interpolator)) {
						hNew = (manager.getEventTime()) - (stepStart);
					}else {
						loop = false;
					}
				}else {
					final double factor = java.lang.Math.min(maxGrowth, java.lang.Math.max(minReduction, ((safety) * (java.lang.Math.pow(error, exp)))));
					hNew = filterStep(((stepSize) * factor), forward, false);
				}
			}
			final double nextStep = (stepStart) + (stepSize);
			java.lang.System.arraycopy(yTmp, 0, y, 0, y0.length);
			manager.stepAccepted(nextStep, y);
			lastStep = manager.stop();
			interpolator.storeTime(nextStep);
			for (org.apache.commons.math.ode.sampling.StepHandler handler : stepHandlers) {
				handler.handleStep(interpolator, lastStep);
			}
			stepStart = nextStep;
			if (fsal) {
				java.lang.System.arraycopy(yDotK[(stages - 1)], 0, yDotK[0], 0, y0.length);
			}
			if ((manager.reset(stepStart, y)) && (!lastStep)) {
				equations.computeDerivatives(stepStart, y, yDotK[0]);
			}
			if (!lastStep) {
				stepSize = filterStep(stepSize, forward, true);
				final double factor = java.lang.Math.min(maxGrowth, java.lang.Math.max(minReduction, ((safety) * (java.lang.Math.pow(error, exp)))));
				final double scaledH = (stepSize) * factor;
				final double nextT = (stepStart) + scaledH;
				final boolean nextIsLast = forward ? nextT >= t : nextT <= t;
				hNew = filterStep(scaledH, forward, nextIsLast);
			}
		} 
		final double stopTime = stepStart;
		resetInternalState();
		return stopTime;
	}

	public double getMinReduction() {
		return minReduction;
	}

	public void setMinReduction(final double minReduction) {
		org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.this.minReduction = minReduction;
	}

	public double getMaxGrowth() {
		return maxGrowth;
	}

	public void setMaxGrowth(final double maxGrowth) {
		org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.this.maxGrowth = maxGrowth;
	}

	protected abstract double estimateError(double[][] yDotK, double[] y0, double[] y1, double h);

	private boolean fsal;

	private double[] c;

	private double[][] a;

	private double[] b;

	private org.apache.commons.math.ode.nonstiff.RungeKuttaStepInterpolator prototype;

	private double exp;

	private double safety;

	private double minReduction;

	private double maxGrowth;
}

