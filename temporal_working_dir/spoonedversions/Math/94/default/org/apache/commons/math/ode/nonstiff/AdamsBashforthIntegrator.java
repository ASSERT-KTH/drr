

package org.apache.commons.math.ode.nonstiff;


public class AdamsBashforthIntegrator extends org.apache.commons.math.ode.nonstiff.MultistepIntegrator {
	private static final long serialVersionUID = 1676381657635800870L;

	private static final java.lang.String METHOD_NAME = "Adams-Bashforth";

	private final double[] coeffs;

	private final double step;

	public AdamsBashforthIntegrator(final int order, final double step) {
		super(org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator.METHOD_NAME, order, new org.apache.commons.math.ode.nonstiff.AdamsBashforthStepInterpolator());
		int[][] bdArray = org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator.computeBackwardDifferencesArray(order);
		org.apache.commons.math.fraction.Fraction[] gamma = org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator.computeGammaArray(order);
		coeffs = new double[order];
		for (int i = 0; i < order; ++i) {
			org.apache.commons.math.fraction.Fraction f = org.apache.commons.math.fraction.Fraction.ZERO;
			for (int j = i; j < order; ++j) {
				f = f.add(gamma[j].multiply(new org.apache.commons.math.fraction.Fraction(bdArray[j][i], 1)));
			}
			coeffs[i] = f.doubleValue();
		}
		this.step = java.lang.Math.abs(step);
	}

	public double integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations equations, double t0, double[] y0, double t, double[] y) throws org.apache.commons.math.ode.DerivativeException, org.apache.commons.math.ode.IntegratorException {
		sanityChecks(equations, t0, y0, t, y);
		final boolean forward = t > t0;
		if (y != y0) {
			java.lang.System.arraycopy(y0, 0, y, 0, y0.length);
		}
		final double[] yTmp = new double[y0.length];
		final org.apache.commons.math.ode.nonstiff.AdamsBashforthStepInterpolator interpolator = ((org.apache.commons.math.ode.nonstiff.AdamsBashforthStepInterpolator) (prototype.copy()));
		interpolator.reinitialize(yTmp, previousT, previousF, forward);
		stepStart = t0;
		stepSize = (forward) ? step : -(step);
		for (org.apache.commons.math.ode.sampling.StepHandler handler : stepHandlers) {
			handler.reset();
		}
		org.apache.commons.math.ode.events.CombinedEventsManager manager = addEndTimeChecker(t0, t, eventsHandlersManager);
		double stopTime = start(previousF.length, stepSize, manager, equations, stepStart, y);
		if (java.lang.Double.isNaN(previousT[0])) {
			return stopTime;
		}
		stepStart = previousT[0];
		interpolator.storeTime(stepStart);
		boolean lastStep = false;
		while (!lastStep) {
			interpolator.shift();
			for (int j = 0; j < (y0.length); ++j) {
				double sum = 0;
				for (int l = 0; l < (coeffs.length); ++l) {
					sum += (coeffs[l]) * (previousF[l][j]);
				}
				yTmp[j] = (y[j]) + ((stepSize) * sum);
			}
			interpolator.storeTime(((stepStart) + (stepSize)));
			final boolean truncated;
			if (manager.evaluateStep(interpolator)) {
				truncated = true;
				interpolator.truncateStep(manager.getEventTime());
			}else {
				truncated = false;
			}
			final double nextStep = interpolator.getCurrentTime();
			interpolator.setInterpolatedTime(nextStep);
			java.lang.System.arraycopy(interpolator.getInterpolatedState(), 0, y, 0, y0.length);
			manager.stepAccepted(nextStep, y);
			lastStep = manager.stop();
			for (org.apache.commons.math.ode.sampling.StepHandler handler : stepHandlers) {
				handler.handleStep(interpolator, lastStep);
			}
			stepStart = nextStep;
			if (!lastStep) {
				if (manager.reset(stepStart, y)) {
					stopTime = start(previousF.length, stepSize, manager, equations, stepStart, y);
					if (java.lang.Double.isNaN(previousT[0])) {
						return stopTime;
					}
					stepStart = previousT[0];
				}else {
					if (truncated) {
						for (int i = 1; i < (previousF.length); ++i) {
							previousT[i] = (stepStart) - (i * (stepSize));
							interpolator.setInterpolatedTime(previousT[i]);
							java.lang.System.arraycopy(interpolator.getInterpolatedState(), 0, previousF[i], 0, y0.length);
						}
					}else {
						rotatePreviousSteps();
					}
					previousT[0] = stepStart;
					equations.computeDerivatives(stepStart, y, previousF[0]);
				}
			}
		} 
		stopTime = stepStart;
		stepStart = java.lang.Double.NaN;
		stepSize = java.lang.Double.NaN;
		return stopTime;
	}

	public double[] getCoeffs() {
		return coeffs.clone();
	}

	static int[][] computeBackwardDifferencesArray(final int order) {
		int[][] bdArray = new int[order][];
		bdArray[0] = new int[]{ 1 };
		for (int i = 1; i < order; ++i) {
			bdArray[i] = new int[i + 1];
			bdArray[i][0] = 1;
			for (int j = 0; j < (i - 1); ++j) {
				bdArray[i][(j + 1)] = (bdArray[(i - 1)][(j + 1)]) - (bdArray[(i - 1)][j]);
			}
			bdArray[i][i] = -(bdArray[(i - 1)][(i - 1)]);
		}
		return bdArray;
	}

	static org.apache.commons.math.fraction.Fraction[] computeGammaArray(final int order) {
		org.apache.commons.math.fraction.Fraction[] gammaArray = new org.apache.commons.math.fraction.Fraction[order];
		gammaArray[0] = org.apache.commons.math.fraction.Fraction.ONE;
		for (int i = 1; i < order; ++i) {
			org.apache.commons.math.fraction.Fraction gamma = org.apache.commons.math.fraction.Fraction.ONE;
			for (int j = 1; j <= i; ++j) {
				gamma = gamma.subtract(gammaArray[(i - j)].multiply(new org.apache.commons.math.fraction.Fraction(1, (j + 1))));
			}
			gammaArray[i] = gamma;
		}
		return gammaArray;
	}
}

