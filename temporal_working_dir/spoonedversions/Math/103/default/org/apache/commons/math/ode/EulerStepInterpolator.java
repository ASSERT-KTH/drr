

package org.apache.commons.math.ode;


class EulerStepInterpolator extends org.apache.commons.math.ode.RungeKuttaStepInterpolator {
	public EulerStepInterpolator() {
	}

	public EulerStepInterpolator(org.apache.commons.math.ode.EulerStepInterpolator interpolator) {
		super(interpolator);
	}

	public java.lang.Object clone() {
		return new org.apache.commons.math.ode.EulerStepInterpolator(org.apache.commons.math.ode.EulerStepInterpolator.this);
	}

	protected void computeInterpolatedState(double theta, double oneMinusThetaH) throws org.apache.commons.math.ode.DerivativeException {
		for (int i = 0; i < (interpolatedState.length); ++i) {
			interpolatedState[i] = (currentState[i]) - (oneMinusThetaH * (yDotK[0][i]));
		}
	}

	private static final long serialVersionUID = -7179861704951334960L;
}

