

package org.apache.commons.math.ode;


class SwitchState implements java.io.Serializable {
	private static final long serialVersionUID = 3256541562455482289L;

	private org.apache.commons.math.ode.SwitchingFunction function;

	private double maxCheckInterval;

	private double convergence;

	private double t0;

	private double g0;

	private boolean g0Positive;

	private boolean pendingEvent;

	private double pendingEventTime;

	private double previousEventTime;

	private boolean increasing;

	private int nextAction;

	public SwitchState(org.apache.commons.math.ode.SwitchingFunction function, double maxCheckInterval, double convergence) {
		org.apache.commons.math.ode.SwitchState.this.function = function;
		org.apache.commons.math.ode.SwitchState.this.maxCheckInterval = maxCheckInterval;
		org.apache.commons.math.ode.SwitchState.this.convergence = java.lang.Math.abs(convergence);
		t0 = java.lang.Double.NaN;
		g0 = java.lang.Double.NaN;
		g0Positive = true;
		pendingEvent = false;
		pendingEventTime = java.lang.Double.NaN;
		previousEventTime = java.lang.Double.NaN;
		increasing = true;
		nextAction = org.apache.commons.math.ode.SwitchingFunction.CONTINUE;
	}

	public void reinitializeBegin(double t0, double[] y0) {
		org.apache.commons.math.ode.SwitchState.this.t0 = t0;
		g0 = function.g(t0, y0);
		g0Positive = (g0) >= 0;
	}

	public boolean evaluateStep(final org.apache.commons.math.ode.StepInterpolator interpolator) {
		try {
			double t1 = interpolator.getCurrentTime();
			int n = java.lang.Math.max(1, ((int) (java.lang.Math.ceil(((java.lang.Math.abs((t1 - (t0)))) / (maxCheckInterval))))));
			double h = (t1 - (t0)) / n;
			double ta = t0;
			double ga = g0;
			double tb = (t0) + (t1 > (t0) ? convergence : -(convergence));
			for (int i = 0; i < n; ++i) {
				tb += h;
				interpolator.setInterpolatedTime(tb);
				double gb = function.g(tb, interpolator.getInterpolatedState());
				if ((g0Positive) ^ (gb >= 0)) {
					increasing = gb >= ga;
					try {
						org.apache.commons.math.analysis.UnivariateRealSolver solver = new org.apache.commons.math.analysis.BrentSolver(new org.apache.commons.math.analysis.UnivariateRealFunction() {
							public double value(double t) throws org.apache.commons.math.FunctionEvaluationException {
								try {
									interpolator.setInterpolatedTime(t);
									return function.g(t, interpolator.getInterpolatedState());
								} catch (org.apache.commons.math.ode.DerivativeException e) {
									throw new org.apache.commons.math.FunctionEvaluationException(t, e);
								}
							}
						});
						solver.setAbsoluteAccuracy(convergence);
						solver.setMaximalIterationCount(1000);
						double root = solver.solve(ta, tb);
						if ((java.lang.Double.isNaN(previousEventTime)) || ((java.lang.Math.abs(((previousEventTime) - root))) > (convergence))) {
							pendingEventTime = root;
							if ((pendingEvent) && ((java.lang.Math.abs((t1 - (pendingEventTime)))) <= (convergence))) {
								return false;
							}
							pendingEvent = true;
							return true;
						}
					} catch (org.apache.commons.math.ConvergenceException ce) {
						throw new java.lang.RuntimeException("internal error");
					}
				}else {
					ta = tb;
					ga = gb;
				}
			}
			pendingEvent = false;
			pendingEventTime = java.lang.Double.NaN;
			return false;
		} catch (org.apache.commons.math.ode.DerivativeException e) {
			throw new java.lang.RuntimeException(("unexpected exception: " + (e.getMessage())));
		} catch (org.apache.commons.math.FunctionEvaluationException e) {
			throw new java.lang.RuntimeException(("unexpected exception: " + (e.getMessage())));
		}
	}

	public double getEventTime() {
		return pendingEventTime;
	}

	public void stepAccepted(double t, double[] y) {
		t0 = t;
		g0 = function.g(t, y);
		if (pendingEvent) {
			previousEventTime = t;
			g0Positive = increasing;
			nextAction = function.eventOccurred(t, y);
		}else {
			g0Positive = (g0) >= 0;
			nextAction = org.apache.commons.math.ode.SwitchingFunction.CONTINUE;
		}
	}

	public boolean stop() {
		return (nextAction) == (org.apache.commons.math.ode.SwitchingFunction.STOP);
	}

	public boolean reset(double t, double[] y) {
		if (!(pendingEvent)) {
			return false;
		}
		if ((nextAction) == (org.apache.commons.math.ode.SwitchingFunction.RESET_STATE)) {
			function.resetState(t, y);
		}
		pendingEvent = false;
		pendingEventTime = java.lang.Double.NaN;
		return ((nextAction) == (org.apache.commons.math.ode.SwitchingFunction.RESET_STATE)) || ((nextAction) == (org.apache.commons.math.ode.SwitchingFunction.RESET_DERIVATIVES));
	}
}

