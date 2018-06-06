

package org.apache.commons.math.ode.nonstiff;


public class AdamsMoultonIntegrator extends org.apache.commons.math.ode.MultistepIntegrator {
	private static final long serialVersionUID = 4990335331377040417L;

	private static final java.lang.String METHOD_NAME = "Adams-Moulton";

	private final double[] predictorCoeffs;

	private final double[] correctorCoeffs;

	private final double step;

	public AdamsMoultonIntegrator(final int order, final double step) {
		super(org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator.METHOD_NAME, (order + 1), new org.apache.commons.math.ode.nonstiff.AdamsMoultonStepInterpolator());
		int[][] bdArray = org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator.computeBackwardDifferencesArray((order + 1));
		org.apache.commons.math.fraction.Fraction[] gamma = org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator.computeGammaArray(order);
		predictorCoeffs = new double[order];
		for (int i = 0; i < order; ++i) {
			org.apache.commons.math.fraction.Fraction fPredictor = org.apache.commons.math.fraction.Fraction.ZERO;
			for (int j = i; j < order; ++j) {
				org.apache.commons.math.fraction.Fraction f = new org.apache.commons.math.fraction.Fraction(bdArray[j][i], 1);
				fPredictor = fPredictor.add(gamma[j].multiply(f));
			}
			predictorCoeffs[i] = fPredictor.doubleValue();
		}
		org.apache.commons.math.fraction.Fraction[] gammaStar = org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator.computeGammaStarArray(order);
		correctorCoeffs = new double[order + 1];
		for (int i = 0; i <= order; ++i) {
			org.apache.commons.math.fraction.Fraction fCorrector = org.apache.commons.math.fraction.Fraction.ZERO;
			for (int j = i; j <= order; ++j) {
				org.apache.commons.math.fraction.Fraction f = new org.apache.commons.math.fraction.Fraction(bdArray[j][i], 1);
				fCorrector = fCorrector.add(gammaStar[j].multiply(f));
			}
			correctorCoeffs[i] = fCorrector.doubleValue();
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
		final org.apache.commons.math.ode.nonstiff.AdamsMoultonStepInterpolator interpolator = ((org.apache.commons.math.ode.nonstiff.AdamsMoultonStepInterpolator) (prototype.copy()));
		interpolator.reinitialize(yTmp, previousT, previousF, forward);
		stepStart = t0;
		stepSize = (forward) ? step : -(step);
		for (org.apache.commons.math.ode.sampling.StepHandler handler : stepHandlers) {
			handler.reset();
		}
		org.apache.commons.math.ode.events.CombinedEventsManager manager = addEndTimeChecker(t0, t, eventsHandlersManager);
		double stopTime = start(((previousF.length) - 1), stepSize, manager, equations, stepStart, y);
		if (java.lang.Double.isNaN(previousT[0])) {
			return stopTime;
		}
		stepStart = previousT[0];
		rotatePreviousSteps();
		previousF[0] = new double[y0.length];
		interpolator.storeTime(stepStart);
		boolean lastStep = false;
		while (!lastStep) {
			interpolator.shift();
			for (int j = 0; j < (y0.length); ++j) {
				double sum = 0;
				for (int l = 0; l < (predictorCoeffs.length); ++l) {
					sum += (predictorCoeffs[l]) * (previousF[(l + 1)][j]);
				}
				yTmp[j] = (y[j]) + ((stepSize) * sum);
			}
			final double stepEnd = (stepStart) + (stepSize);
			equations.computeDerivatives(stepEnd, yTmp, previousF[0]);
			for (int j = 0; j < (y0.length); ++j) {
				double sum = 0;
				for (int l = 0; l < (correctorCoeffs.length); ++l) {
					sum += (correctorCoeffs[l]) * (previousF[l][j]);
				}
				yTmp[j] = (y[j]) + ((stepSize) * sum);
			}
			interpolator.storeTime(stepEnd);
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
					stopTime = start(((previousF.length) - 1), stepSize, manager, equations, stepStart, y);
					if (java.lang.Double.isNaN(previousT[0])) {
						return stopTime;
					}
					stepStart = previousT[0];
					rotatePreviousSteps();
					previousF[0] = new double[y0.length];
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

	public double[] getPredictorCoeffs() {
		return predictorCoeffs.clone();
	}

	public double[] getCorrectorCoeffs() {
		return correctorCoeffs.clone();
	}

	static org.apache.commons.math.fraction.Fraction[] computeGammaStarArray(final int order) {
		org.apache.commons.math.fraction.Fraction[] gammaStarArray = new org.apache.commons.math.fraction.Fraction[order + 1];
		gammaStarArray[0] = org.apache.commons.math.fraction.Fraction.ONE;
		for (int i = 1; i <= order; ++i) {
			org.apache.commons.math.fraction.Fraction gammaStar = org.apache.commons.math.fraction.Fraction.ZERO;
			for (int j = 1; j <= i; ++j) {
				gammaStar = gammaStar.subtract(gammaStarArray[(i - j)].multiply(new org.apache.commons.math.fraction.Fraction(1, (j + 1))));
			}
			gammaStarArray[i] = gammaStar;
		}
		return gammaStarArray;
	}
}

