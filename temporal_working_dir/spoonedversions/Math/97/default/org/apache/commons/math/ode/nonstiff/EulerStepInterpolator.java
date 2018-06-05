

package org.apache.commons.math.ode.nonstiff;


class EulerStepInterpolator extends org.apache.commons.math.ode.nonstiff.RungeKuttaStepInterpolator {
	public EulerStepInterpolator() {
	}

	public EulerStepInterpolator(final org.apache.commons.math.ode.nonstiff.EulerStepInterpolator interpolator) {
		super(interpolator);
	}

	protected org.apache.commons.math.ode.sampling.StepInterpolator doCopy() {
		return new org.apache.commons.math.ode.nonstiff.EulerStepInterpolator(org.apache.commons.math.ode.nonstiff.EulerStepInterpolator.this);
	}

	protected void computeInterpolatedState(final double theta, final double oneMinusThetaH) throws org.apache.commons.math.ode.DerivativeException {
		for (int i = 0; i < (interpolatedState.length); ++i) {
			interpolatedState[i] = (currentState[i]) - (oneMinusThetaH * (yDotK[0][i]));
		}
	}

	private static final long serialVersionUID = -7179861704951334960L;
}

