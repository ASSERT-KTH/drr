

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

	private org.apache.commons.math.util.Incrementor evaluations;

	private transient org.apache.commons.math.ode.ExpandableStatefulODE expandable;

	public AbstractIntegrator(final java.lang.String name) {
		this.name = name;
		stepHandlers = new java.util.ArrayList<org.apache.commons.math.ode.sampling.StepHandler>();
		stepStart = java.lang.Double.NaN;
		stepSize = java.lang.Double.NaN;
		eventsStates = new java.util.ArrayList<org.apache.commons.math.ode.events.EventState>();
		statesInitialized = false;
		evaluations = new org.apache.commons.math.util.Incrementor();
		setMaxEvaluations((-1));
		evaluations.resetCount();
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

	public void addEventHandler(final org.apache.commons.math.ode.events.EventHandler handler, final double maxCheckInterval, final double convergence, final int maxIterationCount, final org.apache.commons.math.analysis.solvers.UnivariateSolver solver) {
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
		evaluations.setMaximalCount((maxEvaluations < 0 ? java.lang.Integer.MAX_VALUE : maxEvaluations));
	}

	public int getMaxEvaluations() {
		return evaluations.getMaximalCount();
	}

	public int getEvaluations() {
		return evaluations.getCount();
	}

	protected void initIntegration(final double t0, final double[] y0, final double t) {
		evaluations.resetCount();
		for (final org.apache.commons.math.ode.events.EventState state : eventsStates) {
			state.getEventHandler().init(t0, y0, t);
		}
		for (org.apache.commons.math.ode.sampling.StepHandler handler : stepHandlers) {
			handler.init(t0, y0, t);
		}
		setStateInitialized(false);
	}

	protected void setEquations(final org.apache.commons.math.ode.ExpandableStatefulODE equations) {
		org.apache.commons.math.ode.AbstractIntegrator.this.expandable = equations;
	}

	public double integrate(final org.apache.commons.math.ode.FirstOrderDifferentialEquations equations, final double t0, final double[] y0, final double t, final double[] y) throws org.apache.commons.math.exception.MathIllegalArgumentException, org.apache.commons.math.exception.MathIllegalStateException {
		if ((y0.length) != (equations.getDimension())) {
			throw new org.apache.commons.math.exception.DimensionMismatchException(y0.length, equations.getDimension());
		}
		if ((y.length) != (equations.getDimension())) {
			throw new org.apache.commons.math.exception.DimensionMismatchException(y.length, equations.getDimension());
		}
		final org.apache.commons.math.ode.ExpandableStatefulODE expandableODE = new org.apache.commons.math.ode.ExpandableStatefulODE(equations);
		expandableODE.setTime(t0);
		expandableODE.setPrimaryState(y0);
		integrate(expandableODE, t);
		java.lang.System.arraycopy(expandableODE.getPrimaryState(), 0, y, 0, y.length);
		return expandableODE.getTime();
	}

	public abstract void integrate(org.apache.commons.math.ode.ExpandableStatefulODE equations, double t) throws org.apache.commons.math.exception.MathIllegalArgumentException, org.apache.commons.math.exception.MathIllegalStateException;

	public void computeDerivatives(final double t, final double[] y, final double[] yDot) throws org.apache.commons.math.exception.MaxCountExceededException {
		evaluations.incrementCount();
		expandable.computeDerivatives(t, y, yDot);
	}

	protected void setStateInitialized(final boolean stateInitialized) {
		org.apache.commons.math.ode.AbstractIntegrator.this.statesInitialized = stateInitialized;
	}

	protected double acceptStep(final org.apache.commons.math.ode.sampling.AbstractStepInterpolator interpolator, final double[] y, final double[] yDot, final double tEnd) throws org.apache.commons.math.exception.MathIllegalStateException {
		double previousT = interpolator.getGlobalPreviousTime();
		final double currentT = interpolator.getGlobalCurrentTime();
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
			final double[] eventY = interpolator.getInterpolatedState().clone();
			currentEvent.stepAccepted(eventT, eventY);
			isLastStep = currentEvent.stop();
			for (final org.apache.commons.math.ode.sampling.StepHandler handler : stepHandlers) {
				handler.handleStep(interpolator, isLastStep);
			}
			if (isLastStep) {
				java.lang.System.arraycopy(eventY, 0, y, 0, y.length);
				for (final org.apache.commons.math.ode.events.EventState remaining : occuringEvents) {
					remaining.stepAccepted(eventT, eventY);
				}
				return eventT;
			}
			if (currentEvent.reset(eventT, eventY)) {
				java.lang.System.arraycopy(eventY, 0, y, 0, y.length);
				computeDerivatives(eventT, y, yDot);
				resetOccurred = true;
				for (final org.apache.commons.math.ode.events.EventState remaining : occuringEvents) {
					remaining.stepAccepted(eventT, eventY);
				}
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
		isLastStep = (isLastStep) || (org.apache.commons.math.util.Precision.equals(currentT, tEnd, 1));
		for (org.apache.commons.math.ode.sampling.StepHandler handler : stepHandlers) {
			handler.handleStep(interpolator, isLastStep);
		}
		return currentT;
	}

	protected void sanityChecks(final org.apache.commons.math.ode.ExpandableStatefulODE equations, final double t) throws org.apache.commons.math.exception.NumberIsTooSmallException {
		final double threshold = 1000 * (org.apache.commons.math.util.FastMath.ulp(org.apache.commons.math.util.FastMath.max(org.apache.commons.math.util.FastMath.abs(equations.getTime()), org.apache.commons.math.util.FastMath.abs(t))));
		final double dt = org.apache.commons.math.util.FastMath.abs(((equations.getTime()) - t));
		if (dt <= threshold) {
			throw new org.apache.commons.math.exception.NumberIsTooSmallException(org.apache.commons.math.exception.util.LocalizedFormats.TOO_SMALL_INTEGRATION_INTERVAL, dt, threshold, false);
		}
	}
}

