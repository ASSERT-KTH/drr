

package org.apache.commons.math.ode.sampling;


public class StepNormalizer implements org.apache.commons.math.ode.sampling.StepHandler {
	private static final long serialVersionUID = -973517244031912577L;

	private double h;

	private final org.apache.commons.math.ode.sampling.FixedStepHandler handler;

	private double lastTime;

	private double[] lastState;

	private boolean forward;

	public StepNormalizer(final double h, final org.apache.commons.math.ode.sampling.FixedStepHandler handler) {
		org.apache.commons.math.ode.sampling.StepNormalizer.this.h = java.lang.Math.abs(h);
		this.handler = handler;
		reset();
	}

	public boolean requiresDenseOutput() {
		return true;
	}

	public void reset() {
		lastTime = java.lang.Double.NaN;
		lastState = null;
		forward = true;
	}

	public void handleStep(final org.apache.commons.math.ode.sampling.StepInterpolator interpolator, final boolean isLast) throws org.apache.commons.math.ode.DerivativeException {
		if ((lastState) == null) {
			lastTime = interpolator.getPreviousTime();
			interpolator.setInterpolatedTime(lastTime);
			final double[] state = interpolator.getInterpolatedState();
			lastState = ((double[]) (state.clone()));
			forward = (interpolator.getCurrentTime()) >= (lastTime);
			if (!(forward)) {
				h = -(h);
			}
		}
		double nextTime = (lastTime) + (h);
		boolean nextInStep = (forward) ^ (nextTime > (interpolator.getCurrentTime()));
		while (nextInStep) {
			handler.handleStep(lastTime, lastState, false);
			lastTime = nextTime;
			interpolator.setInterpolatedTime(lastTime);
			java.lang.System.arraycopy(interpolator.getInterpolatedState(), 0, lastState, 0, lastState.length);
			nextTime += h;
			nextInStep = (forward) ^ (nextTime > (interpolator.getCurrentTime()));
		} 
		if (isLast) {
			handler.handleStep(lastTime, lastState, true);
		}
	}
}

