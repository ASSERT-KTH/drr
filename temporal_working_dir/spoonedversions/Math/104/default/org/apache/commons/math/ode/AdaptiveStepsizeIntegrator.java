

package org.apache.commons.math.ode;


public abstract class AdaptiveStepsizeIntegrator implements org.apache.commons.math.ode.FirstOrderIntegrator {
	public AdaptiveStepsizeIntegrator(double minStep, double maxStep, double scalAbsoluteTolerance, double scalRelativeTolerance) {
		org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.this.minStep = minStep;
		org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.this.maxStep = maxStep;
		org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.this.initialStep = -1.0;
		org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.this.scalAbsoluteTolerance = scalAbsoluteTolerance;
		org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.this.scalRelativeTolerance = scalRelativeTolerance;
		org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.this.vecAbsoluteTolerance = null;
		org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.this.vecRelativeTolerance = null;
		handler = org.apache.commons.math.ode.DummyStepHandler.getInstance();
		switchesHandler = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
	}

	public AdaptiveStepsizeIntegrator(double minStep, double maxStep, double[] vecAbsoluteTolerance, double[] vecRelativeTolerance) {
		org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.this.minStep = minStep;
		org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.this.maxStep = maxStep;
		org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.this.initialStep = -1.0;
		org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.this.scalAbsoluteTolerance = 0;
		org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.this.scalRelativeTolerance = 0;
		org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.this.vecAbsoluteTolerance = vecAbsoluteTolerance;
		org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.this.vecRelativeTolerance = vecRelativeTolerance;
		handler = org.apache.commons.math.ode.DummyStepHandler.getInstance();
		switchesHandler = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
	}

	public void setInitialStepSize(double initialStepSize) {
		if ((initialStepSize < (minStep)) || (initialStepSize > (maxStep))) {
			initialStep = -1.0;
		}else {
			initialStep = initialStepSize;
		}
	}

	public void setStepHandler(org.apache.commons.math.ode.StepHandler handler) {
		org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.this.handler = handler;
	}

	public org.apache.commons.math.ode.StepHandler getStepHandler() {
		return handler;
	}

	public void addSwitchingFunction(org.apache.commons.math.ode.SwitchingFunction function, double maxCheckInterval, double convergence) {
		switchesHandler.add(function, maxCheckInterval, convergence);
	}

	public double initializeStep(org.apache.commons.math.ode.FirstOrderDifferentialEquations equations, boolean forward, int order, double[] scale, double t0, double[] y0, double[] yDot0, double[] y1, double[] yDot1) throws org.apache.commons.math.ode.DerivativeException {
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
		double maxInv2 = java.lang.Math.max(java.lang.Math.sqrt(yDotOnScale2), yDDotOnScale);
		double h1 = maxInv2 < 1.0E-15 ? java.lang.Math.max(1.0E-6, (0.001 * (java.lang.Math.abs(h)))) : java.lang.Math.pow((0.01 / maxInv2), (1.0 / order));
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

	protected double filterStep(double h, boolean acceptSmall) throws org.apache.commons.math.ode.IntegratorException {
		if ((java.lang.Math.abs(h)) < (minStep)) {
			if (acceptSmall) {
				h = (h < 0) ? -(minStep) : minStep;
			}else {
				throw new org.apache.commons.math.ode.IntegratorException(("minimal step size ({0}) reached," + " integration needs {1}"), new java.lang.String[]{ java.lang.Double.toString(minStep) , java.lang.Double.toString(java.lang.Math.abs(h)) });
			}
		}
		if (h > (maxStep)) {
			h = maxStep;
		}else
			if (h < (-(maxStep))) {
				h = -(maxStep);
			}
		
		return h;
	}

	public abstract void integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations equations, double t0, double[] y0, double t, double[] y) throws org.apache.commons.math.ode.DerivativeException, org.apache.commons.math.ode.IntegratorException;

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

	protected org.apache.commons.math.ode.StepHandler handler;

	protected org.apache.commons.math.ode.SwitchingFunctionsHandler switchesHandler;
}

