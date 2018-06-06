

package org.apache.commons.math.ode.sampling;


public class StepNormalizer implements org.apache.commons.math.ode.sampling.StepHandler {
	private double h;

	private final org.apache.commons.math.ode.sampling.FixedStepHandler handler;

	private double firstTime;

	private double lastTime;

	private double[] lastState;

	private double[] lastDerivatives;

	private boolean forward;

	private final org.apache.commons.math.ode.sampling.StepNormalizerBounds bounds;

	private final org.apache.commons.math.ode.sampling.StepNormalizerMode mode;

	public StepNormalizer(final double h, final org.apache.commons.math.ode.sampling.FixedStepHandler handler) {
		this(h, handler, org.apache.commons.math.ode.sampling.StepNormalizerMode.INCREMENT, org.apache.commons.math.ode.sampling.StepNormalizerBounds.FIRST);
	}

	public StepNormalizer(final double h, final org.apache.commons.math.ode.sampling.FixedStepHandler handler, final org.apache.commons.math.ode.sampling.StepNormalizerMode mode) {
		this(h, handler, mode, org.apache.commons.math.ode.sampling.StepNormalizerBounds.FIRST);
	}

	public StepNormalizer(final double h, final org.apache.commons.math.ode.sampling.FixedStepHandler handler, final org.apache.commons.math.ode.sampling.StepNormalizerBounds bounds) {
		this(h, handler, org.apache.commons.math.ode.sampling.StepNormalizerMode.INCREMENT, bounds);
	}

	public StepNormalizer(final double h, final org.apache.commons.math.ode.sampling.FixedStepHandler handler, final org.apache.commons.math.ode.sampling.StepNormalizerMode mode, final org.apache.commons.math.ode.sampling.StepNormalizerBounds bounds) {
		org.apache.commons.math.ode.sampling.StepNormalizer.this.h = org.apache.commons.math.util.FastMath.abs(h);
		this.handler = handler;
		this.mode = mode;
		this.bounds = bounds;
		reset();
	}

	public void reset() {
		firstTime = java.lang.Double.NaN;
		lastTime = java.lang.Double.NaN;
		lastState = null;
		lastDerivatives = null;
		forward = true;
	}

	public void handleStep(final org.apache.commons.math.ode.sampling.StepInterpolator interpolator, final boolean isLast) {
		if ((lastState) == null) {
			firstTime = interpolator.getPreviousTime();
			lastTime = interpolator.getPreviousTime();
			interpolator.setInterpolatedTime(lastTime);
			lastState = interpolator.getInterpolatedState().clone();
			lastDerivatives = interpolator.getInterpolatedDerivatives().clone();
			forward = (interpolator.getCurrentTime()) >= (lastTime);
			if (!(forward)) {
				h = -(h);
			}
		}
		double nextTime = (mode) == (org.apache.commons.math.ode.sampling.StepNormalizerMode.INCREMENT) ? (lastTime) + (h) : ((org.apache.commons.math.util.FastMath.floor(((lastTime) / (h)))) + 1) * (h);
		if (((mode) == (org.apache.commons.math.ode.sampling.StepNormalizerMode.MULTIPLES)) && (org.apache.commons.math.util.Precision.equals(nextTime, lastTime, 1))) {
			nextTime += h;
		}
		boolean nextInStep = isNextInStep(nextTime, interpolator);
		while (nextInStep) {
			doNormalizedStep(false);
			storeStep(interpolator, nextTime);
			nextTime += h;
			nextInStep = isNextInStep(nextTime, interpolator);
		} 
		if (isLast) {
			boolean addLast = (bounds.lastIncluded()) && ((lastTime) != (interpolator.getCurrentTime()));
			doNormalizedStep((!addLast));
			if (addLast) {
				storeStep(interpolator, interpolator.getCurrentTime());
				doNormalizedStep(true);
			}
		}
	}

	private boolean isNextInStep(double nextTime, org.apache.commons.math.ode.sampling.StepInterpolator interpolator) {
		return forward ? nextTime <= (interpolator.getCurrentTime()) : nextTime >= (interpolator.getCurrentTime());
	}

	private void doNormalizedStep(boolean isLast) {
		if ((!(bounds.firstIncluded())) && ((firstTime) == (lastTime))) {
			return ;
		}
		handler.handleStep(lastTime, lastState, lastDerivatives, isLast);
	}

	private void storeStep(org.apache.commons.math.ode.sampling.StepInterpolator interpolator, double t) {
		lastTime = t;
		interpolator.setInterpolatedTime(lastTime);
		java.lang.System.arraycopy(interpolator.getInterpolatedState(), 0, lastState, 0, lastState.length);
		java.lang.System.arraycopy(interpolator.getInterpolatedDerivatives(), 0, lastDerivatives, 0, lastDerivatives.length);
	}
}

