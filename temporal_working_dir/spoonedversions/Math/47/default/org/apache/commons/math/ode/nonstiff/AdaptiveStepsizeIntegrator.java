

package org.apache.commons.math.ode.nonstiff;


public abstract class AdaptiveStepsizeIntegrator extends org.apache.commons.math.ode.AbstractIntegrator {
	protected double scalAbsoluteTolerance;

	protected double scalRelativeTolerance;

	protected double[] vecAbsoluteTolerance;

	protected double[] vecRelativeTolerance;

	protected int mainSetDimension;

	private double initialStep;

	private double minStep;

	private double maxStep;

	public AdaptiveStepsizeIntegrator(final java.lang.String name, final double minStep, final double maxStep, final double scalAbsoluteTolerance, final double scalRelativeTolerance) {
		super(name);
		setStepSizeControl(minStep, maxStep, scalAbsoluteTolerance, scalRelativeTolerance);
		resetInternalState();
	}

	public AdaptiveStepsizeIntegrator(final java.lang.String name, final double minStep, final double maxStep, final double[] vecAbsoluteTolerance, final double[] vecRelativeTolerance) {
		super(name);
		setStepSizeControl(minStep, maxStep, vecAbsoluteTolerance, vecRelativeTolerance);
		resetInternalState();
	}

	public void setStepSizeControl(final double minimalStep, final double maximalStep, final double absoluteTolerance, final double relativeTolerance) {
		minStep = org.apache.commons.math.util.FastMath.abs(minimalStep);
		maxStep = org.apache.commons.math.util.FastMath.abs(maximalStep);
		initialStep = -1;
		scalAbsoluteTolerance = absoluteTolerance;
		scalRelativeTolerance = relativeTolerance;
		vecAbsoluteTolerance = null;
		vecRelativeTolerance = null;
	}

	public void setStepSizeControl(final double minimalStep, final double maximalStep, final double[] absoluteTolerance, final double[] relativeTolerance) {
		minStep = org.apache.commons.math.util.FastMath.abs(minimalStep);
		maxStep = org.apache.commons.math.util.FastMath.abs(maximalStep);
		initialStep = -1;
		scalAbsoluteTolerance = 0;
		scalRelativeTolerance = 0;
		vecAbsoluteTolerance = absoluteTolerance.clone();
		vecRelativeTolerance = relativeTolerance.clone();
	}

	public void setInitialStepSize(final double initialStepSize) {
		if ((initialStepSize < (minStep)) || (initialStepSize > (maxStep))) {
			initialStep = -1.0;
		}else {
			initialStep = initialStepSize;
		}
	}

	@java.lang.Override
	protected void sanityChecks(final org.apache.commons.math.ode.FirstOrderDifferentialEquations equations, final double t0, final double[] y0, final double t, final double[] y) throws org.apache.commons.math.exception.DimensionMismatchException, org.apache.commons.math.exception.NumberIsTooSmallException {
		super.sanityChecks(equations, t0, y0, t, y);
		if (equations instanceof org.apache.commons.math.ode.ExtendedFirstOrderDifferentialEquations) {
			mainSetDimension = ((org.apache.commons.math.ode.ExtendedFirstOrderDifferentialEquations) (equations)).getMainSetDimension();
		}else {
			mainSetDimension = equations.getDimension();
		}
		if (((vecAbsoluteTolerance) != null) && ((vecAbsoluteTolerance.length) != (mainSetDimension))) {
			throw new org.apache.commons.math.exception.DimensionMismatchException(mainSetDimension, vecAbsoluteTolerance.length);
		}
		if (((vecRelativeTolerance) != null) && ((vecRelativeTolerance.length) != (mainSetDimension))) {
			throw new org.apache.commons.math.exception.DimensionMismatchException(mainSetDimension, vecRelativeTolerance.length);
		}
	}

	public double initializeStep(final org.apache.commons.math.ode.FirstOrderDifferentialEquations equations, final boolean forward, final int order, final double[] scale, final double t0, final double[] y0, final double[] yDot0, final double[] y1, final double[] yDot1) throws org.apache.commons.math.exception.MathUserException {
		if ((initialStep) > 0) {
			return forward ? initialStep : -(initialStep);
		}
		double ratio;
		double yOnScale2 = 0;
		double yDotOnScale2 = 0;
		for (int j = 0; j < (scale.length); ++j) {
			ratio = (y0[j]) / (scale[j]);
			yOnScale2 += ratio * ratio;
			ratio = (yDot0[j]) / (scale[j]);
			yDotOnScale2 += ratio * ratio;
		}
		double h = (yOnScale2 < 1.0E-10) || (yDotOnScale2 < 1.0E-10) ? 1.0E-6 : 0.01 * (org.apache.commons.math.util.FastMath.sqrt((yOnScale2 / yDotOnScale2)));
		if (!forward) {
			h = -h;
		}
		for (int j = 0; j < (y0.length); ++j) {
			y1[j] = (y0[j]) + (h * (yDot0[j]));
		}
		computeDerivatives((t0 + h), y1, yDot1);
		double yDDotOnScale = 0;
		for (int j = 0; j < (scale.length); ++j) {
			ratio = ((yDot1[j]) - (yDot0[j])) / (scale[j]);
			yDDotOnScale += ratio * ratio;
		}
		yDDotOnScale = (org.apache.commons.math.util.FastMath.sqrt(yDDotOnScale)) / h;
		final double maxInv2 = org.apache.commons.math.util.FastMath.max(org.apache.commons.math.util.FastMath.sqrt(yDotOnScale2), yDDotOnScale);
		final double h1 = maxInv2 < 1.0E-15 ? org.apache.commons.math.util.FastMath.max(1.0E-6, (0.001 * (org.apache.commons.math.util.FastMath.abs(h)))) : org.apache.commons.math.util.FastMath.pow((0.01 / maxInv2), (1.0 / order));
		h = org.apache.commons.math.util.FastMath.min((100.0 * (org.apache.commons.math.util.FastMath.abs(h))), h1);
		h = org.apache.commons.math.util.FastMath.max(h, (1.0E-12 * (org.apache.commons.math.util.FastMath.abs(t0))));
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

	protected double filterStep(final double h, final boolean forward, final boolean acceptSmall) throws org.apache.commons.math.exception.MathIllegalArgumentException {
		double filteredH = h;
		if ((org.apache.commons.math.util.FastMath.abs(h)) < (minStep)) {
			if (acceptSmall) {
				filteredH = (forward) ? minStep : -(minStep);
			}else {
				throw new org.apache.commons.math.exception.NumberIsTooSmallException(org.apache.commons.math.exception.util.LocalizedFormats.MINIMAL_STEPSIZE_REACHED_DURING_INTEGRATION, minStep, org.apache.commons.math.util.FastMath.abs(h), true);
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

	public abstract double integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations equations, double t0, double[] y0, double t, double[] y) throws org.apache.commons.math.exception.MathIllegalArgumentException, org.apache.commons.math.exception.MathIllegalStateException;

	@java.lang.Override
	public double getCurrentStepStart() {
		return stepStart;
	}

	protected void resetInternalState() {
		stepStart = java.lang.Double.NaN;
		stepSize = org.apache.commons.math.util.FastMath.sqrt(((minStep) * (maxStep)));
	}

	public double getMinStep() {
		return minStep;
	}

	public double getMaxStep() {
		return maxStep;
	}
}

