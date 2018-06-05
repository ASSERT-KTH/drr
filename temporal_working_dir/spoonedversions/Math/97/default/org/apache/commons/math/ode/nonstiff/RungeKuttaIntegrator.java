

package org.apache.commons.math.ode.nonstiff;


public abstract class RungeKuttaIntegrator implements org.apache.commons.math.ode.FirstOrderIntegrator {
	protected RungeKuttaIntegrator(final double[] c, final double[][] a, final double[] b, final org.apache.commons.math.ode.nonstiff.RungeKuttaStepInterpolator prototype, final double step) {
		org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator.this.c = c;
		org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator.this.a = a;
		org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator.this.b = b;
		org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator.this.prototype = prototype;
		org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator.this.step = step;
		handler = org.apache.commons.math.ode.sampling.DummyStepHandler.getInstance();
		eventsHandlersManager = new org.apache.commons.math.ode.events.CombinedEventsManager();
		resetInternalState();
	}

	public abstract java.lang.String getName();

	public void setStepHandler(final org.apache.commons.math.ode.sampling.StepHandler handler) {
		org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator.this.handler = handler;
	}

	public org.apache.commons.math.ode.sampling.StepHandler getStepHandler() {
		return handler;
	}

	public void addEventHandler(final org.apache.commons.math.ode.events.EventHandler function, final double maxCheckInterval, final double convergence, final int maxIterationCount) {
		eventsHandlersManager.addEventHandler(function, maxCheckInterval, convergence, maxIterationCount);
	}

	public java.util.Collection<org.apache.commons.math.ode.events.EventHandler> getEventsHandlers() {
		return eventsHandlersManager.getEventsHandlers();
	}

	public void clearEventsHandlers() {
		eventsHandlersManager.clearEventsHandlers();
	}

	private void sanityChecks(final org.apache.commons.math.ode.FirstOrderDifferentialEquations equations, final double t0, final double[] y0, final double t, final double[] y) throws org.apache.commons.math.ode.IntegratorException {
		if ((equations.getDimension()) != (y0.length)) {
			throw new org.apache.commons.math.ode.IntegratorException(("dimensions mismatch: ODE problem has dimension {0}," + " initial state vector has dimension {1}"), new java.lang.Object[]{ java.lang.Integer.valueOf(equations.getDimension()) , java.lang.Integer.valueOf(y0.length) });
		}
		if ((equations.getDimension()) != (y.length)) {
			throw new org.apache.commons.math.ode.IntegratorException(("dimensions mismatch: ODE problem has dimension {0}," + " final state vector has dimension {1}"), new java.lang.Object[]{ java.lang.Integer.valueOf(equations.getDimension()) , java.lang.Integer.valueOf(y.length) });
		}
		if ((java.lang.Math.abs((t - t0))) <= (1.0E-12 * (java.lang.Math.max(java.lang.Math.abs(t0), java.lang.Math.abs(t))))) {
			throw new org.apache.commons.math.ode.IntegratorException("too small integration interval: length = {0}", new java.lang.Object[]{ java.lang.Double.valueOf(java.lang.Math.abs((t - t0))) });
		}
	}

	public void integrate(final org.apache.commons.math.ode.FirstOrderDifferentialEquations equations, final double t0, final double[] y0, final double t, final double[] y) throws org.apache.commons.math.ode.DerivativeException, org.apache.commons.math.ode.IntegratorException {
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
		if ((handler.requiresDenseOutput()) || (!(eventsHandlersManager.isEmpty()))) {
			final org.apache.commons.math.ode.nonstiff.RungeKuttaStepInterpolator rki = ((org.apache.commons.math.ode.nonstiff.RungeKuttaStepInterpolator) (prototype.copy()));
			rki.reinitialize(equations, yTmp, yDotK, forward);
			interpolator = rki;
		}else {
			interpolator = new org.apache.commons.math.ode.sampling.DummyStepInterpolator(yTmp, forward);
		}
		interpolator.storeTime(t0);
		long nbStep = java.lang.Math.max(1L, java.lang.Math.abs(java.lang.Math.round(((t - t0) / (step)))));
		boolean lastStep = false;
		stepStart = t0;
		stepSize = (t - t0) / nbStep;
		handler.reset();
		for (long i = 0; !lastStep; ++i) {
			interpolator.shift();
			boolean needUpdate = false;
			for (boolean loop = true; loop;) {
				equations.computeDerivatives(stepStart, y, yDotK[0]);
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
				interpolator.storeTime(((stepStart) + (stepSize)));
				if (eventsHandlersManager.evaluateStep(interpolator)) {
					needUpdate = true;
					stepSize = (eventsHandlersManager.getEventTime()) - (stepStart);
				}else {
					loop = false;
				}
			}
			final double nextStep = (stepStart) + (stepSize);
			java.lang.System.arraycopy(yTmp, 0, y, 0, y0.length);
			eventsHandlersManager.stepAccepted(nextStep, y);
			if (eventsHandlersManager.stop()) {
				lastStep = true;
			}else {
				lastStep = i == (nbStep - 1);
			}
			interpolator.storeTime(nextStep);
			handler.handleStep(interpolator, lastStep);
			stepStart = nextStep;
			if ((eventsHandlersManager.reset(stepStart, y)) && (!lastStep)) {
				equations.computeDerivatives(stepStart, y, yDotK[0]);
			}
			if (needUpdate) {
				nbStep = java.lang.Math.max(1L, java.lang.Math.abs(java.lang.Math.round(((t - (stepStart)) / (step)))));
				stepSize = (t - (stepStart)) / nbStep;
				i = -1;
			}
		}
		resetInternalState();
	}

	public double getCurrentStepStart() {
		return stepStart;
	}

	public double getCurrentSignedStepsize() {
		return stepSize;
	}

	private void resetInternalState() {
		stepStart = java.lang.Double.NaN;
		stepSize = java.lang.Double.NaN;
	}

	private double[] c;

	private double[][] a;

	private double[] b;

	private org.apache.commons.math.ode.nonstiff.RungeKuttaStepInterpolator prototype;

	private double step;

	private org.apache.commons.math.ode.sampling.StepHandler handler;

	protected org.apache.commons.math.ode.events.CombinedEventsManager eventsHandlersManager;

	private double stepStart;

	private double stepSize;
}

