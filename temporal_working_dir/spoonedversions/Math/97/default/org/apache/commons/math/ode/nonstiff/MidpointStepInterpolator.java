

package org.apache.commons.math.ode.nonstiff;


class MidpointStepInterpolator extends org.apache.commons.math.ode.nonstiff.RungeKuttaStepInterpolator {
	public MidpointStepInterpolator() {
	}

	public MidpointStepInterpolator(final org.apache.commons.math.ode.nonstiff.MidpointStepInterpolator interpolator) {
		super(interpolator);
	}

	protected org.apache.commons.math.ode.sampling.StepInterpolator doCopy() {
		return new org.apache.commons.math.ode.nonstiff.MidpointStepInterpolator(org.apache.commons.math.ode.nonstiff.MidpointStepInterpolator.this);
	}

	protected void computeInterpolatedState(final double theta, final double oneMinusThetaH) throws org.apache.commons.math.ode.DerivativeException {
		final double coeff1 = oneMinusThetaH * theta;
		final double coeff2 = oneMinusThetaH * (1.0 + theta);
		for (int i = 0; i < (interpolatedState.length); ++i) {
			interpolatedState[i] = ((currentState[i]) + (coeff1 * (yDotK[0][i]))) - (coeff2 * (yDotK[1][i]));
		}
	}

	private static final long serialVersionUID = -865524111506042509L;
}

