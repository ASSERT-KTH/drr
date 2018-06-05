

package org.apache.commons.math.ode;


public abstract class AbstractIntegrator implements org.apache.commons.math.ode.FirstOrderIntegrator {
	private static final long serialVersionUID = 5771479854166853494L;

	private final java.lang.String name;

	protected java.util.Collection<org.apache.commons.math.ode.sampling.StepHandler> stepHandlers;

	protected double stepStart;

	protected double stepSize;

	protected org.apache.commons.math.ode.events.CombinedEventsManager eventsHandlersManager;

	public AbstractIntegrator(final java.lang.String name) {
		this.name = name;
		stepHandlers = new java.util.ArrayList<org.apache.commons.math.ode.sampling.StepHandler>();
		stepStart = java.lang.Double.NaN;
		stepSize = java.lang.Double.NaN;
		eventsHandlersManager = new org.apache.commons.math.ode.events.CombinedEventsManager();
	}

	public java.lang.String getName() {
		return name;
	}

	public void addStepHandler(final org.apache.commons.math.ode.sampling.StepHandler handler) {
		stepHandlers.add(handler);
	}

	public java.util.Collection<org.apache.commons.math.ode.sampling.StepHandler> getStepHandlers() {
		return java.util.Collections.unmodifiableCollection(stepHandlers);
	}

	public void clearStepHandlers() {
		stepHandlers.clear();
	}

	public void addEventHandler(final org.apache.commons.math.ode.events.EventHandler function, final double maxCheckInterval, final double convergence, final int maxIterationCount) {
		eventsHandlersManager.addEventHandler(function, maxCheckInterval, convergence, maxIterationCount);
	}

	public java.util.Collection<org.apache.commons.math.ode.events.EventHandler> getEventHandlers() {
		return eventsHandlersManager.getEventsHandlers();
	}

	public void clearEventHandlers() {
		eventsHandlersManager.clearEventsHandlers();
	}

	protected boolean requiresDenseOutput() {
		for (org.apache.commons.math.ode.sampling.StepHandler handler : stepHandlers) {
			if (handler.requiresDenseOutput()) {
				return true;
			}
		}
		return false;
	}

	public double getCurrentStepStart() {
		return stepStart;
	}

	public double getCurrentSignedStepsize() {
		return stepSize;
	}

	protected void sanityChecks(final org.apache.commons.math.ode.FirstOrderDifferentialEquations equations, final double t0, final double[] y0, final double t, final double[] y) throws org.apache.commons.math.ode.IntegratorException {
		if ((equations.getDimension()) != (y0.length)) {
			throw new org.apache.commons.math.ode.IntegratorException(("dimensions mismatch: ODE problem has dimension {0}," + " initial state vector has dimension {1}"), equations.getDimension(), y0.length);
		}
		if ((equations.getDimension()) != (y.length)) {
			throw new org.apache.commons.math.ode.IntegratorException(("dimensions mismatch: ODE problem has dimension {0}," + " final state vector has dimension {1}"), equations.getDimension(), y.length);
		}
		if ((java.lang.Math.abs((t - t0))) <= (1.0E-12 * (java.lang.Math.max(java.lang.Math.abs(t0), java.lang.Math.abs(t))))) {
			throw new org.apache.commons.math.ode.IntegratorException("too small integration interval: length = {0}", java.lang.Math.abs((t - t0)));
		}
	}

	protected org.apache.commons.math.ode.events.CombinedEventsManager addEndTimeChecker(final double startTime, final double endTime, final org.apache.commons.math.ode.events.CombinedEventsManager manager) {
		org.apache.commons.math.ode.events.CombinedEventsManager newManager = new org.apache.commons.math.ode.events.CombinedEventsManager();
		for (final org.apache.commons.math.ode.events.EventState state : manager.getEventsStates()) {
			newManager.addEventHandler(state.getEventHandler(), state.getMaxCheckInterval(), state.getConvergence(), state.getMaxIterationCount());
		}
		newManager.addEventHandler(new org.apache.commons.math.ode.AbstractIntegrator.EndTimeChecker(endTime), java.lang.Double.POSITIVE_INFINITY, java.lang.Math.ulp(java.lang.Math.max(java.lang.Math.abs(startTime), java.lang.Math.abs(endTime))), 100);
		return newManager;
	}

	private static class EndTimeChecker implements org.apache.commons.math.ode.events.EventHandler {
		private static final long serialVersionUID = -7029115498939113263L;

		private final double endTime;

		public EndTimeChecker(final double endTime) {
			this.endTime = endTime;
		}

		public int eventOccurred(double t, double[] y, boolean increasing) {
			return org.apache.commons.math.ode.events.EventHandler.STOP;
		}

		public double g(double t, double[] y) {
			return t - (endTime);
		}

		public void resetState(double t, double[] y) {
		}
	}
}

