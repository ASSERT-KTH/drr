

package org.apache.commons.math.ode.nonstiff;


public class AdamsBashforthIntegrator extends org.apache.commons.math.ode.nonstiff.AdamsIntegrator {
	private static final java.lang.String METHOD_NAME = "Adams-Bashforth";

	public AdamsBashforthIntegrator(final int nSteps, final double minStep, final double maxStep, final double scalAbsoluteTolerance, final double scalRelativeTolerance) throws java.lang.IllegalArgumentException {
		super(org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator.METHOD_NAME, nSteps, nSteps, minStep, maxStep, scalAbsoluteTolerance, scalRelativeTolerance);
	}

	public AdamsBashforthIntegrator(final int nSteps, final double minStep, final double maxStep, final double[] vecAbsoluteTolerance, final double[] vecRelativeTolerance) throws java.lang.IllegalArgumentException {
		super(org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator.METHOD_NAME, nSteps, nSteps, minStep, maxStep, vecAbsoluteTolerance, vecRelativeTolerance);
	}

	@java.lang.Override
	public double integrate(final org.apache.commons.math.ode.FirstOrderDifferentialEquations equations, final double t0, final double[] y0, final double t, final double[] y) throws org.apache.commons.math.exception.MathIllegalArgumentException, org.apache.commons.math.exception.MathIllegalStateException {
		final int n = y0.length;
		sanityChecks(equations, t0, y0, t, y);
		setEquations(equations);
		resetEvaluations();
		final boolean forward = t > t0;
		if (y != y0) {
			java.lang.System.arraycopy(y0, 0, y, 0, n);
		}
		final double[] yDot = new double[n];
		final org.apache.commons.math.ode.sampling.NordsieckStepInterpolator interpolator = new org.apache.commons.math.ode.sampling.NordsieckStepInterpolator();
		interpolator.reinitialize(y, forward);
		for (org.apache.commons.math.ode.sampling.StepHandler handler : stepHandlers) {
			handler.reset();
		}
		setStateInitialized(false);
		start(t0, y, t);
		interpolator.reinitialize(stepStart, stepSize, scaled, nordsieck);
		interpolator.storeTime(stepStart);
		final int lastRow = (nordsieck.getRowDimension()) - 1;
		double hNew = stepSize;
		interpolator.rescale(hNew);
		isLastStep = false;
		do {
			double error = 10;
			while (error >= 1.0) {
				stepSize = hNew;
				error = 0;
				for (int i = 0; i < (mainSetDimension); ++i) {
					final double yScale = org.apache.commons.math.util.FastMath.abs(y[i]);
					final double tol = (vecAbsoluteTolerance) == null ? (scalAbsoluteTolerance) + ((scalRelativeTolerance) * yScale) : (vecAbsoluteTolerance[i]) + ((vecRelativeTolerance[i]) * yScale);
					final double ratio = (nordsieck.getEntry(lastRow, i)) / tol;
					error += ratio * ratio;
				}
				error = org.apache.commons.math.util.FastMath.sqrt((error / (mainSetDimension)));
				if (error >= 1.0) {
					final double factor = computeStepGrowShrinkFactor(error);
					hNew = filterStep(((stepSize) * factor), forward, false);
					interpolator.rescale(hNew);
				}
			} 
			final double stepEnd = (stepStart) + (stepSize);
			interpolator.shift();
			interpolator.setInterpolatedTime(stepEnd);
			java.lang.System.arraycopy(interpolator.getInterpolatedState(), 0, y, 0, y0.length);
			computeDerivatives(stepEnd, y, yDot);
			final double[] predictedScaled = new double[y0.length];
			for (int j = 0; j < (y0.length); ++j) {
				predictedScaled[j] = (stepSize) * (yDot[j]);
			}
			final org.apache.commons.math.linear.Array2DRowRealMatrix nordsieckTmp = updateHighOrderDerivativesPhase1(nordsieck);
			updateHighOrderDerivativesPhase2(scaled, predictedScaled, nordsieckTmp);
			interpolator.reinitialize(stepEnd, stepSize, predictedScaled, nordsieckTmp);
			interpolator.storeTime(stepEnd);
			stepStart = acceptStep(interpolator, y, yDot, t);
			scaled = predictedScaled;
			nordsieck = nordsieckTmp;
			interpolator.reinitialize(stepEnd, stepSize, scaled, nordsieck);
			if (!(isLastStep)) {
				interpolator.storeTime(stepStart);
				if (resetOccurred) {
					start(stepStart, y, t);
					interpolator.reinitialize(stepStart, stepSize, scaled, nordsieck);
				}
				final double factor = computeStepGrowShrinkFactor(error);
				final double scaledH = (stepSize) * factor;
				final double nextT = (stepStart) + scaledH;
				final boolean nextIsLast = forward ? nextT >= t : nextT <= t;
				hNew = filterStep(scaledH, forward, nextIsLast);
				final double filteredNextT = (stepStart) + hNew;
				final boolean filteredNextIsLast = forward ? filteredNextT >= t : filteredNextT <= t;
				if (filteredNextIsLast) {
					hNew = t - (stepStart);
				}
				interpolator.rescale(hNew);
			}
		} while (!(isLastStep) );
		final double stopTime = stepStart;
		resetInternalState();
		return stopTime;
	}
}

