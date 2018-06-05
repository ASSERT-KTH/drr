

package org.apache.commons.math.ode;


class MidpointStepInterpolator extends org.apache.commons.math.ode.RungeKuttaStepInterpolator {
	public MidpointStepInterpolator() {
	}

	public MidpointStepInterpolator(org.apache.commons.math.ode.MidpointStepInterpolator interpolator) {
		super(interpolator);
	}

	protected org.apache.commons.math.ode.StepInterpolator doCopy() {
		return new org.apache.commons.math.ode.MidpointStepInterpolator(org.apache.commons.math.ode.MidpointStepInterpolator.this);
	}

	protected void computeInterpolatedState(double theta, double oneMinusThetaH) throws org.apache.commons.math.ode.DerivativeException {
		double coeff1 = oneMinusThetaH * theta;
		double coeff2 = oneMinusThetaH * (1.0 + theta);
		for (int i = 0; i < (interpolatedState.length); ++i) {
			interpolatedState[i] = ((currentState[i]) + (coeff1 * (yDotK[0][i]))) - (coeff2 * (yDotK[1][i]));
		}
	}

	private static final long serialVersionUID = -865524111506042509L;
}

