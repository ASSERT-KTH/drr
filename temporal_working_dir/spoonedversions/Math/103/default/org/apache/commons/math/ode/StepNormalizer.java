

package org.apache.commons.math.ode;


public class StepNormalizer implements org.apache.commons.math.ode.StepHandler {
	public StepNormalizer(double h, org.apache.commons.math.ode.FixedStepHandler handler) {
		org.apache.commons.math.ode.StepNormalizer.this.h = java.lang.Math.abs(h);
		org.apache.commons.math.ode.StepNormalizer.this.handler = handler;
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

	public void handleStep(org.apache.commons.math.ode.StepInterpolator interpolator, boolean isLast) throws org.apache.commons.math.ode.DerivativeException {
		double nextTime;
		if ((lastState) == null) {
			lastTime = interpolator.getPreviousTime();
			interpolator.setInterpolatedTime(lastTime);
			double[] state = interpolator.getInterpolatedState();
			lastState = ((double[]) (state.clone()));
			forward = (interpolator.getCurrentTime()) >= (lastTime);
			if (!(forward)) {
				h = -(h);
			}
		}
		nextTime = (lastTime) + (h);
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

	private double h;

	private org.apache.commons.math.ode.FixedStepHandler handler;

	private double lastTime;

	private double[] lastState;

	private boolean forward;
}

