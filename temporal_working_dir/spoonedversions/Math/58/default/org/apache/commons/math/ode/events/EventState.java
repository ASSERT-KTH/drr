

package org.apache.commons.math.ode.events;


public class EventState {
	private final org.apache.commons.math.ode.events.EventHandler handler;

	private final double maxCheckInterval;

	private final double convergence;

	private final int maxIterationCount;

	private double t0;

	private double g0;

	private boolean g0Positive;

	private boolean pendingEvent;

	private double pendingEventTime;

	private double previousEventTime;

	private boolean forward;

	private boolean increasing;

	private int nextAction;

	public EventState(final org.apache.commons.math.ode.events.EventHandler handler, final double maxCheckInterval, final double convergence, final int maxIterationCount) {
		this.handler = handler;
		this.maxCheckInterval = maxCheckInterval;
		this.convergence = org.apache.commons.math.util.FastMath.abs(convergence);
		this.maxIterationCount = maxIterationCount;
		t0 = java.lang.Double.NaN;
		g0 = java.lang.Double.NaN;
		g0Positive = true;
		pendingEvent = false;
		pendingEventTime = java.lang.Double.NaN;
		previousEventTime = java.lang.Double.NaN;
		increasing = true;
		nextAction = org.apache.commons.math.ode.events.EventHandler.CONTINUE;
	}

	public org.apache.commons.math.ode.events.EventHandler getEventHandler() {
		return handler;
	}

	public double getMaxCheckInterval() {
		return maxCheckInterval;
	}

	public double getConvergence() {
		return convergence;
	}

	public int getMaxIterationCount() {
		return maxIterationCount;
	}

	public void reinitializeBegin(final org.apache.commons.math.ode.sampling.StepInterpolator interpolator) throws org.apache.commons.math.ode.events.EventException {
		try {
			final double ignoreZone = interpolator.isForward() ? getConvergence() : -(getConvergence());
			t0 = (interpolator.getPreviousTime()) + ignoreZone;
			interpolator.setInterpolatedTime(t0);
			g0 = handler.g(t0, interpolator.getInterpolatedState());
			if ((g0) == 0) {
				final double tStart = interpolator.getPreviousTime();
				interpolator.setInterpolatedTime(tStart);
				g0Positive = (handler.g(tStart, interpolator.getInterpolatedState())) <= 0;
			}else {
				g0Positive = (g0) >= 0;
			}
		} catch (org.apache.commons.math.exception.MathUserException mue) {
			throw new org.apache.commons.math.ode.events.EventException(mue);
		}
	}

	public boolean evaluateStep(final org.apache.commons.math.ode.sampling.StepInterpolator interpolator) throws org.apache.commons.math.ConvergenceException, org.apache.commons.math.exception.MathUserException, org.apache.commons.math.ode.events.EventException {
		try {
			forward = interpolator.isForward();
			final double t1 = interpolator.getCurrentTime();
			if ((org.apache.commons.math.util.FastMath.abs((t1 - (t0)))) < (convergence)) {
				return false;
			}
			final double start = forward ? (t0) + (convergence) : (t0) - (convergence);
			final double dt = t1 - start;
			final int n = org.apache.commons.math.util.FastMath.max(1, ((int) (org.apache.commons.math.util.FastMath.ceil(((org.apache.commons.math.util.FastMath.abs(dt)) / (maxCheckInterval))))));
			final double h = dt / n;
			double ta = t0;
			double ga = g0;
			for (int i = 0; i < n; ++i) {
				final double tb = start + ((i + 1) * h);
				interpolator.setInterpolatedTime(tb);
				final double gb = handler.g(tb, interpolator.getInterpolatedState());
				if ((g0Positive) ^ (gb >= 0)) {
					increasing = gb >= ga;
					final org.apache.commons.math.analysis.UnivariateRealFunction f = new org.apache.commons.math.analysis.UnivariateRealFunction() {
						public double value(final double t) throws org.apache.commons.math.exception.MathUserException {
							try {
								interpolator.setInterpolatedTime(t);
								return handler.g(t, interpolator.getInterpolatedState());
							} catch (org.apache.commons.math.ode.events.EventException e) {
								throw new org.apache.commons.math.exception.MathUserException(e);
							}
						}
					};
					final org.apache.commons.math.analysis.solvers.BrentSolver solver = new org.apache.commons.math.analysis.solvers.BrentSolver(convergence);
					if ((ga * gb) >= 0) {
						final double epsilon = (forward ? 0.25 : -0.25) * (convergence);
						for (int k = 0; (k < 4) && ((ga * gb) > 0); ++k) {
							ta += epsilon;
							ga = f.value(ta);
						}
						if ((ga * gb) > 0) {
							throw new org.apache.commons.math.exception.MathInternalError();
						}
					}
					final double root = ta <= tb ? solver.solve(maxIterationCount, f, ta, tb) : solver.solve(maxIterationCount, f, tb, ta);
					if (((!(java.lang.Double.isNaN(previousEventTime))) && ((org.apache.commons.math.util.FastMath.abs((root - ta))) <= (convergence))) && ((org.apache.commons.math.util.FastMath.abs((root - (previousEventTime)))) <= (convergence))) {
						ta = tb;
						ga = gb;
					}else
						if ((java.lang.Double.isNaN(previousEventTime)) || ((org.apache.commons.math.util.FastMath.abs(((previousEventTime) - root))) > (convergence))) {
							pendingEventTime = root;
							pendingEvent = true;
							return true;
						}else {
							ta = tb;
							ga = gb;
						}
					
				}else {
					ta = tb;
					ga = gb;
				}
			}
			pendingEvent = false;
			pendingEventTime = java.lang.Double.NaN;
			return false;
		} catch (org.apache.commons.math.exception.MathUserException mue) {
			final java.lang.Throwable cause = mue.getCause();
			if ((cause != null) && (cause instanceof org.apache.commons.math.ode.events.EventException)) {
				throw ((org.apache.commons.math.ode.events.EventException) (cause));
			}
			throw mue;
		}
	}

	public double getEventTime() {
		return pendingEvent ? pendingEventTime : java.lang.Double.POSITIVE_INFINITY;
	}

	public void stepAccepted(final double t, final double[] y) throws org.apache.commons.math.ode.events.EventException {
		t0 = t;
		g0 = handler.g(t, y);
		if ((pendingEvent) && ((org.apache.commons.math.util.FastMath.abs(((pendingEventTime) - t))) <= (convergence))) {
			previousEventTime = t;
			g0Positive = increasing;
			nextAction = handler.eventOccurred(t, y, (!((increasing) ^ (forward))));
		}else {
			g0Positive = (g0) >= 0;
			nextAction = org.apache.commons.math.ode.events.EventHandler.CONTINUE;
		}
	}

	public boolean stop() {
		return (nextAction) == (org.apache.commons.math.ode.events.EventHandler.STOP);
	}

	public boolean reset(final double t, final double[] y) throws org.apache.commons.math.ode.events.EventException {
		if (!((pendingEvent) && ((org.apache.commons.math.util.FastMath.abs(((pendingEventTime) - t))) <= (convergence)))) {
			return false;
		}
		if ((nextAction) == (org.apache.commons.math.ode.events.EventHandler.RESET_STATE)) {
			handler.resetState(t, y);
		}
		pendingEvent = false;
		pendingEventTime = java.lang.Double.NaN;
		return ((nextAction) == (org.apache.commons.math.ode.events.EventHandler.RESET_STATE)) || ((nextAction) == (org.apache.commons.math.ode.events.EventHandler.RESET_DERIVATIVES));
	}
}

