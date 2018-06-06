

package org.apache.commons.math.ode.nonstiff;


public class AdamsMoultonIntegrator extends org.apache.commons.math.ode.nonstiff.AdamsIntegrator {
	private static final java.lang.String METHOD_NAME = "Adams-Moulton";

	public AdamsMoultonIntegrator(final int nSteps, final double minStep, final double maxStep, final double scalAbsoluteTolerance, final double scalRelativeTolerance) throws java.lang.IllegalArgumentException {
		super(org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator.METHOD_NAME, nSteps, (nSteps + 1), minStep, maxStep, scalAbsoluteTolerance, scalRelativeTolerance);
	}

	public AdamsMoultonIntegrator(final int nSteps, final double minStep, final double maxStep, final double[] vecAbsoluteTolerance, final double[] vecRelativeTolerance) throws java.lang.IllegalArgumentException {
		super(org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator.METHOD_NAME, nSteps, (nSteps + 1), minStep, maxStep, vecAbsoluteTolerance, vecRelativeTolerance);
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
		final double[] yDot = new double[y0.length];
		final double[] yTmp = new double[y0.length];
		final double[] predictedScaled = new double[y0.length];
		org.apache.commons.math.linear.Array2DRowRealMatrix nordsieckTmp = null;
		final org.apache.commons.math.ode.sampling.NordsieckStepInterpolator interpolator = new org.apache.commons.math.ode.sampling.NordsieckStepInterpolator();
		interpolator.reinitialize(y, forward);
		for (org.apache.commons.math.ode.sampling.StepHandler handler : stepHandlers) {
			handler.reset();
		}
		setStateInitialized(false);
		start(t0, y, t);
		interpolator.reinitialize(stepStart, stepSize, scaled, nordsieck);
		interpolator.storeTime(stepStart);
		double hNew = stepSize;
		interpolator.rescale(hNew);
		isLastStep = false;
		do {
			double error = 10;
			while (error >= 1.0) {
				stepSize = hNew;
				final double stepEnd = (stepStart) + (stepSize);
				interpolator.setInterpolatedTime(stepEnd);
				java.lang.System.arraycopy(interpolator.getInterpolatedState(), 0, yTmp, 0, y0.length);
				computeDerivatives(stepEnd, yTmp, yDot);
				for (int j = 0; j < (y0.length); ++j) {
					predictedScaled[j] = (stepSize) * (yDot[j]);
				}
				nordsieckTmp = updateHighOrderDerivativesPhase1(nordsieck);
				updateHighOrderDerivativesPhase2(scaled, predictedScaled, nordsieckTmp);
				error = nordsieckTmp.walkInOptimizedOrder(new org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator.Corrector(y, predictedScaled, yTmp));
				if (error >= 1.0) {
					final double factor = computeStepGrowShrinkFactor(error);
					hNew = filterStep(((stepSize) * factor), forward, false);
					interpolator.rescale(hNew);
				}
			} 
			final double stepEnd = (stepStart) + (stepSize);
			computeDerivatives(stepEnd, yTmp, yDot);
			final double[] correctedScaled = new double[y0.length];
			for (int j = 0; j < (y0.length); ++j) {
				correctedScaled[j] = (stepSize) * (yDot[j]);
			}
			updateHighOrderDerivativesPhase2(predictedScaled, correctedScaled, nordsieckTmp);
			java.lang.System.arraycopy(yTmp, 0, y, 0, n);
			interpolator.reinitialize(stepEnd, stepSize, correctedScaled, nordsieckTmp);
			interpolator.storeTime(stepStart);
			interpolator.shift();
			interpolator.storeTime(stepEnd);
			stepStart = acceptStep(interpolator, y, yDot, t);
			scaled = correctedScaled;
			nordsieck = nordsieckTmp;
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
		stepStart = java.lang.Double.NaN;
		stepSize = java.lang.Double.NaN;
		return stopTime;
	}

	private class Corrector implements org.apache.commons.math.linear.RealMatrixPreservingVisitor {
		private final double[] previous;

		private final double[] scaled;

		private final double[] before;

		private final double[] after;

		public Corrector(final double[] previous, final double[] scaled, final double[] state) {
			this.previous = previous;
			this.scaled = scaled;
			this.after = state;
			this.before = state.clone();
		}

		public void start(int rows, int columns, int startRow, int endRow, int startColumn, int endColumn) {
			java.util.Arrays.fill(after, 0.0);
		}

		public void visit(int row, int column, double value) {
			if ((row & 1) == 0) {
				after[column] -= value;
			}else {
				after[column] += value;
			}
		}

		public double end() {
			double error = 0;
			for (int i = 0; i < (after.length); ++i) {
				after[i] += (previous[i]) + (scaled[i]);
				if (i < (mainSetDimension)) {
					final double yScale = org.apache.commons.math.util.FastMath.max(org.apache.commons.math.util.FastMath.abs(previous[i]), org.apache.commons.math.util.FastMath.abs(after[i]));
					final double tol = (vecAbsoluteTolerance) == null ? (scalAbsoluteTolerance) + ((scalRelativeTolerance) * yScale) : (vecAbsoluteTolerance[i]) + ((vecRelativeTolerance[i]) * yScale);
					final double ratio = ((after[i]) - (before[i])) / tol;
					error += ratio * ratio;
				}
			}
			return org.apache.commons.math.util.FastMath.sqrt((error / (mainSetDimension)));
		}
	}
}

