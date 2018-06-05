

package org.apache.commons.math.ode;


public abstract class AbstractIntegrator implements org.apache.commons.math.ode.FirstOrderIntegrator {
	protected java.util.Collection<org.apache.commons.math.ode.sampling.StepHandler> stepHandlers;

	protected double stepStart;

	protected double stepSize;

	protected boolean isLastStep;

	protected boolean resetOccurred;

	private java.util.Collection<org.apache.commons.math.ode.events.EventState> eventsStates;

	private boolean statesInitialized;

	private final java.lang.String name;

	private int maxEvaluations;

	private int evaluations;

	private transient org.apache.commons.math.ode.FirstOrderDifferentialEquations equations;

	public AbstractIntegrator(final java.lang.String name) {
		this.name = name;
		stepHandlers = new java.util.ArrayList<org.apache.commons.math.ode.sampling.StepHandler>();
		stepStart = java.lang.Double.NaN;
		stepSize = java.lang.Double.NaN;
		eventsStates = new java.util.ArrayList<org.apache.commons.math.ode.events.EventState>();
		statesInitialized = false;
		setMaxEvaluations((-1));
		resetEvaluations();
	}

	protected AbstractIntegrator() {
		this(null);
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

	public void addEventHandler(final org.apache.commons.math.ode.events.EventHandler handler, final double maxCheckInterval, final double convergence, final int maxIterationCount) {
		addEventHandler(handler, maxCheckInterval, convergence, maxIterationCount, new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(convergence, 5));
	}

	public void addEventHandler(final org.apache.commons.math.ode.events.EventHandler handler, final double maxCheckInterval, final double convergence, final int maxIterationCount, final org.apache.commons.math.analysis.solvers.UnivariateRealSolver solver) {
		eventsStates.add(new org.apache.commons.math.ode.events.EventState(handler, maxCheckInterval, convergence, maxIterationCount, solver));
	}

	public java.util.Collection<org.apache.commons.math.ode.events.EventHandler> getEventHandlers() {
		final java.util.List<org.apache.commons.math.ode.events.EventHandler> list = new java.util.ArrayList<org.apache.commons.math.ode.events.EventHandler>();
		for (org.apache.commons.math.ode.events.EventState state : eventsStates) {
			list.add(state.getEventHandler());
		}
		return java.util.Collections.unmodifiableCollection(list);
	}

	public void clearEventHandlers() {
		eventsStates.clear();
	}

	public double getCurrentStepStart() {
		return stepStart;
	}

	public double getCurrentSignedStepsize() {
		return stepSize;
	}

	public void setMaxEvaluations(int maxEvaluations) {
		org.apache.commons.math.ode.AbstractIntegrator.this.maxEvaluations = (maxEvaluations < 0) ? java.lang.Integer.MAX_VALUE : maxEvaluations;
	}

	public int getMaxEvaluations() {
		return maxEvaluations;
	}

	public int getEvaluations() {
		return evaluations;
	}

	protected void resetEvaluations() {
		evaluations = 0;
	}

	protected void setEquations(final org.apache.commons.math.ode.FirstOrderDifferentialEquations equations) {
		org.apache.commons.math.ode.AbstractIntegrator.this.equations = equations;
	}

	public void computeDerivatives(final double t, final double[] y, final double[] yDot) throws org.apache.commons.math.exception.MathUserException {
		if ((++(evaluations)) > (maxEvaluations)) {
			throw new org.apache.commons.math.exception.MathUserException(new org.apache.commons.math.MaxEvaluationsExceededException(maxEvaluations));
		}
		equations.computeDerivatives(t, y, yDot);
	}

	protected void setStateInitialized(final boolean stateInitialized) {
		org.apache.commons.math.ode.AbstractIntegrator.this.statesInitialized = stateInitialized;
	}

	protected double acceptStep(final org.apache.commons.math.ode.sampling.AbstractStepInterpolator interpolator, final double[] y, final double[] yDot, final double tEnd) throws org.apache.commons.math.ode.IntegratorException {
		try {
			double previousT = interpolator.getGlobalPreviousTime();
			final double currentT = interpolator.getGlobalCurrentTime();
			resetOccurred = false;
			if (!(statesInitialized)) {
				for (org.apache.commons.math.ode.events.EventState state : eventsStates) {
					state.reinitializeBegin(interpolator);
				}
				statesInitialized = true;
			}
			final int orderingSign = interpolator.isForward() ? +1 : -1;
			java.util.SortedSet<org.apache.commons.math.ode.events.EventState> occuringEvents = new java.util.TreeSet<org.apache.commons.math.ode.events.EventState>(new java.util.Comparator<org.apache.commons.math.ode.events.EventState>() {
				public int compare(org.apache.commons.math.ode.events.EventState es0, org.apache.commons.math.ode.events.EventState es1) {
					return orderingSign * (java.lang.Double.compare(es0.getEventTime(), es1.getEventTime()));
				}
			});
			for (final org.apache.commons.math.ode.events.EventState state : eventsStates) {
				if (state.evaluateStep(interpolator)) {
					occuringEvents.add(state);
				}
			}
			while (!(occuringEvents.isEmpty())) {
				final java.util.Iterator<org.apache.commons.math.ode.events.EventState> iterator = occuringEvents.iterator();
				final org.apache.commons.math.ode.events.EventState currentEvent = iterator.next();
				iterator.remove();
				final double eventT = currentEvent.getEventTime();
				interpolator.setSoftPreviousTime(previousT);
				interpolator.setSoftCurrentTime(eventT);
				interpolator.setInterpolatedTime(eventT);
				final double[] eventY = interpolator.getInterpolatedState();
				currentEvent.stepAccepted(eventT, eventY);
				isLastStep = currentEvent.stop();
				for (final org.apache.commons.math.ode.sampling.StepHandler handler : stepHandlers) {
					handler.handleStep(interpolator, isLastStep);
				}
				if (isLastStep) {
					java.lang.System.arraycopy(eventY, 0, y, 0, y.length);
					return eventT;
				}
				if (currentEvent.reset(eventT, eventY)) {
					java.lang.System.arraycopy(eventY, 0, y, 0, y.length);
					computeDerivatives(eventT, y, yDot);
					resetOccurred = true;
					return eventT;
				}
				previousT = eventT;
				interpolator.setSoftPreviousTime(eventT);
				interpolator.setSoftCurrentTime(currentT);
				if (currentEvent.evaluateStep(interpolator)) {
					occuringEvents.add(currentEvent);
				}
			} 
			interpolator.setInterpolatedTime(currentT);
			final double[] currentY = interpolator.getInterpolatedState();
			for (final org.apache.commons.math.ode.events.EventState state : eventsStates) {
				state.stepAccepted(currentT, currentY);
				isLastStep = (isLastStep) || (state.stop());
			}
			isLastStep = (isLastStep) || (org.apache.commons.math.util.MathUtils.equals(currentT, tEnd, 1));
			for (org.apache.commons.math.ode.sampling.StepHandler handler : stepHandlers) {
				handler.handleStep(interpolator, isLastStep);
			}
			return currentT;
		} catch (org.apache.commons.math.ode.events.EventException se) {
			final java.lang.Throwable cause = se.getCause();
			if ((cause != null) && (cause instanceof org.apache.commons.math.exception.MathUserException)) {
				throw ((org.apache.commons.math.exception.MathUserException) (cause));
			}
			throw new org.apache.commons.math.ode.IntegratorException(se);
		} catch (org.apache.commons.math.ConvergenceException ce) {
			throw new org.apache.commons.math.ode.IntegratorException(ce);
		}
	}

	protected void sanityChecks(final org.apache.commons.math.ode.FirstOrderDifferentialEquations ode, final double t0, final double[] y0, final double t, final double[] y) throws org.apache.commons.math.ode.IntegratorException {
		if ((ode.getDimension()) != (y0.length)) {
			throw new org.apache.commons.math.ode.IntegratorException(org.apache.commons.math.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_SIMPLE, ode.getDimension(), y0.length);
		}
		if ((ode.getDimension()) != (y.length)) {
			throw new org.apache.commons.math.ode.IntegratorException(org.apache.commons.math.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_SIMPLE, ode.getDimension(), y.length);
		}
		if ((org.apache.commons.math.util.FastMath.abs((t - t0))) <= (1.0E-12 * (org.apache.commons.math.util.FastMath.max(org.apache.commons.math.util.FastMath.abs(t0), org.apache.commons.math.util.FastMath.abs(t))))) {
			throw new org.apache.commons.math.ode.IntegratorException(org.apache.commons.math.exception.util.LocalizedFormats.TOO_SMALL_INTEGRATION_INTERVAL, org.apache.commons.math.util.FastMath.abs((t - t0)));
		}
	}
}

