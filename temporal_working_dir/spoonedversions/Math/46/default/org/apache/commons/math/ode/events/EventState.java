

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

	private final org.apache.commons.math.analysis.solvers.UnivariateRealSolver solver;

	public EventState(final org.apache.commons.math.ode.events.EventHandler handler, final double maxCheckInterval, final double convergence, final int maxIterationCount, final org.apache.commons.math.analysis.solvers.UnivariateRealSolver solver) {
		this.handler = handler;
		this.maxCheckInterval = maxCheckInterval;
		this.convergence = org.apache.commons.math.util.FastMath.abs(convergence);
		this.maxIterationCount = maxIterationCount;
		this.solver = solver;
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

	public void reinitializeBegin(final org.apache.commons.math.ode.sampling.StepInterpolator interpolator) {
		t0 = interpolator.getPreviousTime();
		interpolator.setInterpolatedTime(t0);
		g0 = handler.g(t0, interpolator.getInterpolatedState());
		if ((g0) == 0) {
			final double epsilon = org.apache.commons.math.util.FastMath.max(solver.getAbsoluteAccuracy(), org.apache.commons.math.util.FastMath.abs(((solver.getRelativeAccuracy()) * (t0))));
			final double tStart = (t0) + (0.5 * epsilon);
			interpolator.setInterpolatedTime(tStart);
			g0 = handler.g(tStart, interpolator.getInterpolatedState());
		}
		g0Positive = (g0) >= 0;
	}

	public boolean evaluateStep(final org.apache.commons.math.ode.sampling.StepInterpolator interpolator) throws org.apache.commons.math.exception.ConvergenceException {
		forward = interpolator.isForward();
		final double t1 = interpolator.getCurrentTime();
		final double dt = t1 - (t0);
		if ((org.apache.commons.math.util.FastMath.abs(dt)) < (convergence)) {
			return false;
		}
		final int n = org.apache.commons.math.util.FastMath.max(1, ((int) (org.apache.commons.math.util.FastMath.ceil(((org.apache.commons.math.util.FastMath.abs(dt)) / (maxCheckInterval))))));
		final double h = dt / n;
		final org.apache.commons.math.analysis.UnivariateRealFunction f = new org.apache.commons.math.analysis.UnivariateRealFunction() {
			public double value(final double t) {
				interpolator.setInterpolatedTime(t);
				return handler.g(t, interpolator.getInterpolatedState());
			}
		};
		double ta = t0;
		double ga = g0;
		for (int i = 0; i < n; ++i) {
			final double tb = (t0) + ((i + 1) * h);
			interpolator.setInterpolatedTime(tb);
			final double gb = handler.g(tb, interpolator.getInterpolatedState());
			if ((g0Positive) ^ (gb >= 0)) {
				increasing = gb >= ga;
				final double root;
				if ((solver) instanceof org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<?>) {
					@java.lang.SuppressWarnings(value = "unchecked")
					org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> bracketing = ((org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction>) (solver));
					root = (forward) ? bracketing.solve(maxIterationCount, f, ta, tb, org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE) : bracketing.solve(maxIterationCount, f, tb, ta, org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE);
				}else {
					final double baseRoot = forward ? solver.solve(maxIterationCount, f, ta, tb) : solver.solve(maxIterationCount, f, tb, ta);
					final int remainingEval = (maxIterationCount) - (solver.getEvaluations());
					org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> bracketing = new org.apache.commons.math.analysis.solvers.PegasusSolver(solver.getRelativeAccuracy(), solver.getAbsoluteAccuracy());
					root = (forward) ? org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide(remainingEval, f, bracketing, baseRoot, ta, tb, org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE) : org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide(remainingEval, f, bracketing, baseRoot, tb, ta, org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE);
				}
				if (((!(java.lang.Double.isNaN(previousEventTime))) && ((org.apache.commons.math.util.FastMath.abs((root - ta))) <= (convergence))) && ((org.apache.commons.math.util.FastMath.abs((root - (previousEventTime)))) <= (convergence))) {
					ta = (forward) ? ta + (convergence) : ta - (convergence);
					ga = f.value(ta);
					--i;
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
	}

	public double getEventTime() {
		return pendingEvent ? pendingEventTime : forward ? java.lang.Double.POSITIVE_INFINITY : java.lang.Double.NEGATIVE_INFINITY;
	}

	public void stepAccepted(final double t, final double[] y) {
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

	public boolean reset(final double t, final double[] y) {
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

