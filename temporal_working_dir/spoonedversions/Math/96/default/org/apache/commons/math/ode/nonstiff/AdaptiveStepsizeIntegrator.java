

package org.apache.commons.math.ode.nonstiff;


public abstract class AdaptiveStepsizeIntegrator extends org.apache.commons.math.ode.AbstractIntegrator {
	public AdaptiveStepsizeIntegrator(final java.lang.String name, final double minStep, final double maxStep, final double scalAbsoluteTolerance, final double scalRelativeTolerance) {
		super(name);
		org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.this.minStep = minStep;
		org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.this.maxStep = maxStep;
		org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.this.initialStep = -1.0;
		org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.this.scalAbsoluteTolerance = scalAbsoluteTolerance;
		org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.this.scalRelativeTolerance = scalRelativeTolerance;
		org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.this.vecAbsoluteTolerance = null;
		org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.this.vecRelativeTolerance = null;
		resetInternalState();
	}

	public AdaptiveStepsizeIntegrator(final java.lang.String name, final double minStep, final double maxStep, final double[] vecAbsoluteTolerance, final double[] vecRelativeTolerance) {
		super(name);
		org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.this.minStep = minStep;
		org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.this.maxStep = maxStep;
		org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.this.initialStep = -1.0;
		org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.this.scalAbsoluteTolerance = 0;
		org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.this.scalRelativeTolerance = 0;
		org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.this.vecAbsoluteTolerance = vecAbsoluteTolerance;
		org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.this.vecRelativeTolerance = vecRelativeTolerance;
		resetInternalState();
	}

	public void setInitialStepSize(final double initialStepSize) {
		if ((initialStepSize < (minStep)) || (initialStepSize > (maxStep))) {
			initialStep = -1.0;
		}else {
			initialStep = initialStepSize;
		}
	}

	protected void sanityChecks(final org.apache.commons.math.ode.FirstOrderDifferentialEquations equations, final double t0, final double[] y0, final double t, final double[] y) throws org.apache.commons.math.ode.IntegratorException {
		super.sanityChecks(equations, t0, y0, t, y);
		if (((vecAbsoluteTolerance) != null) && ((vecAbsoluteTolerance.length) != (y0.length))) {
			throw new org.apache.commons.math.ode.IntegratorException(("dimensions mismatch: state vector has dimension {0}," + " absolute tolerance vector has dimension {1}"), new java.lang.Object[]{ java.lang.Integer.valueOf(y0.length) , java.lang.Integer.valueOf(vecAbsoluteTolerance.length) });
		}
		if (((vecRelativeTolerance) != null) && ((vecRelativeTolerance.length) != (y0.length))) {
			throw new org.apache.commons.math.ode.IntegratorException(("dimensions mismatch: state vector has dimension {0}," + " relative tolerance vector has dimension {1}"), new java.lang.Object[]{ java.lang.Integer.valueOf(y0.length) , java.lang.Integer.valueOf(vecRelativeTolerance.length) });
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

	protected double filterStep(final double h, final boolean forward, final boolean acceptSmall) throws org.apache.commons.math.ode.IntegratorException {
		double filteredH = h;
		if ((java.lang.Math.abs(h)) < (minStep)) {
			if (acceptSmall) {
				filteredH = (forward) ? minStep : -(minStep);
			}else {
				throw new org.apache.commons.math.ode.IntegratorException(("minimal step size ({0}) reached," + " integration needs {1}"), new java.lang.Object[]{ java.lang.Double.valueOf(minStep) , java.lang.Double.valueOf(java.lang.Math.abs(h)) });
			}
		}
		if (filteredH > (maxStep)) {
			filteredH = maxStep;
		}else
			if (filteredH < (-(maxStep))) {
				filteredH = -(maxStep);
			}
		
		return filteredH;
	}

	public abstract double integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations equations, double t0, double[] y0, double t, double[] y) throws org.apache.commons.math.ode.DerivativeException, org.apache.commons.math.ode.IntegratorException;

	public double getCurrentStepStart() {
		return stepStart;
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
}

