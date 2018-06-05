

package org.apache.commons.math.ode;


public abstract class AdaptiveStepsizeIntegrator implements org.apache.commons.math.ode.FirstOrderIntegrator {
	public AdaptiveStepsizeIntegrator(final double minStep, final double maxStep, final double scalAbsoluteTolerance, final double scalRelativeTolerance) {
		org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.this.minStep = minStep;
		org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.this.maxStep = maxStep;
		org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.this.initialStep = -1.0;
		org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.this.scalAbsoluteTolerance = scalAbsoluteTolerance;
		org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.this.scalRelativeTolerance = scalRelativeTolerance;
		org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.this.vecAbsoluteTolerance = null;
		org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.this.vecRelativeTolerance = null;
		handler = org.apache.commons.math.ode.sampling.DummyStepHandler.getInstance();
		eventsHandlersManager = new org.apache.commons.math.ode.events.CombinedEventsManager();
		resetInternalState();
	}

	public AdaptiveStepsizeIntegrator(final double minStep, final double maxStep, final double[] vecAbsoluteTolerance, final double[] vecRelativeTolerance) {
		org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.this.minStep = minStep;
		org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.this.maxStep = maxStep;
		org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.this.initialStep = -1.0;
		org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.this.scalAbsoluteTolerance = 0;
		org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.this.scalRelativeTolerance = 0;
		org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.this.vecAbsoluteTolerance = vecAbsoluteTolerance;
		org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.this.vecRelativeTolerance = vecRelativeTolerance;
		handler = org.apache.commons.math.ode.sampling.DummyStepHandler.getInstance();
		eventsHandlersManager = new org.apache.commons.math.ode.events.CombinedEventsManager();
		resetInternalState();
	}

	public void setInitialStepSize(final double initialStepSize) {
		if ((initialStepSize < (minStep)) || (initialStepSize > (maxStep))) {
			initialStep = -1.0;
		}else {
			initialStep = initialStepSize;
		}
	}

	public void setStepHandler(final org.apache.commons.math.ode.sampling.StepHandler handler) {
		org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.this.handler = handler;
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

	protected void sanityChecks(final org.apache.commons.math.ode.FirstOrderDifferentialEquations equations, final double t0, final double[] y0, final double t, final double[] y) throws org.apache.commons.math.ode.IntegratorException {
		if ((equations.getDimension()) != (y0.length)) {
			throw new org.apache.commons.math.ode.IntegratorException(("dimensions mismatch: ODE problem has dimension {0}," + " initial state vector has dimension {1}"), new java.lang.Object[]{ java.lang.Integer.valueOf(equations.getDimension()) , java.lang.Integer.valueOf(y0.length) });
		}
		if ((equations.getDimension()) != (y.length)) {
			throw new org.apache.commons.math.ode.IntegratorException(("dimensions mismatch: ODE problem has dimension {0}," + " final state vector has dimension {1}"), new java.lang.Object[]{ java.lang.Integer.valueOf(equations.getDimension()) , java.lang.Integer.valueOf(y.length) });
		}
		if (((vecAbsoluteTolerance) != null) && ((vecAbsoluteTolerance.length) != (y0.length))) {
			throw new org.apache.commons.math.ode.IntegratorException(("dimensions mismatch: state vector has dimension {0}," + " absolute tolerance vector has dimension {1}"), new java.lang.Object[]{ java.lang.Integer.valueOf(y0.length) , java.lang.Integer.valueOf(vecAbsoluteTolerance.length) });
		}
		if (((vecRelativeTolerance) != null) && ((vecRelativeTolerance.length) != (y0.length))) {
			throw new org.apache.commons.math.ode.IntegratorException(("dimensions mismatch: state vector has dimension {0}," + " relative tolerance vector has dimension {1}"), new java.lang.Object[]{ java.lang.Integer.valueOf(y0.length) , java.lang.Integer.valueOf(vecRelativeTolerance.length) });
		}
		if ((java.lang.Math.abs((t - t0))) <= (1.0E-12 * (java.lang.Math.max(java.lang.Math.abs(t0), java.lang.Math.abs(t))))) {
			throw new org.apache.commons.math.ode.IntegratorException("too small integration interval: length = {0}", new java.lang.Object[]{ java.lang.Double.valueOf(java.lang.Math.abs((t - t0))) });
		}
	}

	public double initializeStep(final org.apache.commons.math.ode.FirstOrderDifferentialEquations equations, final boolean forward, final int order, final double[] scale, final double t0, final double[] y0, final double[] yDot0, final double[] y1, final double[] yDot1) throws org.apache.commons.math.ode.DerivativeException {
		if ((initialStep) > 0) {
			return forward ? initialStep : -(initialStep);
		}
		double ratio;
		double yOnScale2 = 0;
		double yDotOnScale2 = 0;
		for (int j = 0; j < (y0.length); ++j) {
			ratio = (y0[j]) / (scale[j]);
			yOnScale2 += ratio * ratio;
			ratio = (yDot0[j]) / (scale[j]);
			yDotOnScale2 += ratio * ratio;
		}
		double h = (yOnScale2 < 1.0E-10) || (yDotOnScale2 < 1.0E-10) ? 1.0E-6 : 0.01 * (java.lang.Math.sqrt((yOnScale2 / yDotOnScale2)));
		if (!forward) {
			h = -h;
		}
		for (int j = 0; j < (y0.length); ++j) {
			y1[j] = (y0[j]) + (h * (yDot0[j]));
		}
		equations.computeDerivatives((t0 + h), y1, yDot1);
		double yDDotOnScale = 0;
		for (int j = 0; j < (y0.length); ++j) {
			ratio = ((yDot1[j]) - (yDot0[j])) / (scale[j]);
			yDDotOnScale += ratio * ratio;
		}
		yDDotOnScale = (java.lang.Math.sqrt(yDDotOnScale)) / h;
		final double maxInv2 = java.lang.Math.max(java.lang.Math.sqrt(yDotOnScale2), yDDotOnScale);
		final double h1 = maxInv2 < 1.0E-15 ? java.lang.Math.max(1.0E-6, (0.001 * (java.lang.Math.abs(h)))) : java.lang.Math.pow((0.01 / maxInv2), (1.0 / order));
		h = java.lang.Math.min((100.0 * (java.lang.Math.abs(h))), h1);
		h = java.lang.Math.max(h, (1.0E-12 * (java.lang.Math.abs(t0))));
		if (h < (getMinStep())) {
			h = getMinStep();
		}
		if (h > (getMaxStep())) {
			h = getMaxStep();
		}
		if (!forward) {
			h = -h;
		}
		return h;
	}

	protected double filterStep(final double h, final boolean acceptSmall) throws org.apache.commons.math.ode.IntegratorException {
		double filteredH = h;
		if ((java.lang.Math.abs(h)) < (minStep)) {
			if (acceptSmall) {
				filteredH = (filteredH < 0) ? -(minStep) : minStep;
			}else {
				throw new org.apache.commons.math.ode.IntegratorException(("minimal step size ({0}) reached," + " integration needs {1}"), new java.lang.Object[]{ java.lang.Double.valueOf(minStep) , java.lang.Double.valueOf(java.lang.Math.abs(h)) });
			}
		}
		if (filteredH > (maxStep)) {
			filteredH = maxStep;
		}else
			if (h < (-(maxStep))) {
				filteredH = -(maxStep);
			}
		
		return filteredH;
	}

	public abstract void integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations equations, double t0, double[] y0, double t, double[] y) throws org.apache.commons.math.ode.DerivativeException, org.apache.commons.math.ode.IntegratorException;

	public double getCurrentStepStart() {
		return stepStart;
	}

	public double getCurrentSignedStepsize() {
		return stepSize;
	}

	protected void resetInternalState() {
		stepStart = java.lang.Double.NaN;
		stepSize = java.lang.Math.sqrt(((minStep) * (maxStep)));
	}

	public double getMinStep() {
		return minStep;
	}

	public double getMaxStep() {
		return maxStep;
	}

	private double minStep;

	private double maxStep;

	private double initialStep;

	protected double scalAbsoluteTolerance;

	protected double scalRelativeTolerance;

	protected double[] vecAbsoluteTolerance;

	protected double[] vecRelativeTolerance;

	protected org.apache.commons.math.ode.sampling.StepHandler handler;

	protected org.apache.commons.math.ode.events.CombinedEventsManager eventsHandlersManager;

	protected double stepStart;

	protected double stepSize;
}

