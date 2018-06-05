

package org.apache.commons.math3.ode.nonstiff;


class EulerStepInterpolator extends org.apache.commons.math3.ode.nonstiff.RungeKuttaStepInterpolator {
	private static final long serialVersionUID = 20111120L;

	public EulerStepInterpolator() {
	}

	public EulerStepInterpolator(final org.apache.commons.math3.ode.nonstiff.EulerStepInterpolator interpolator) {
		super(interpolator);
	}

	@java.lang.Override
	protected org.apache.commons.math3.ode.sampling.StepInterpolator doCopy() {
		return new org.apache.commons.math3.ode.nonstiff.EulerStepInterpolator(org.apache.commons.math3.ode.nonstiff.EulerStepInterpolator.this);
	}

	@java.lang.Override
	protected void computeInterpolatedStateAndDerivatives(final double theta, final double oneMinusThetaH) {
		if (((previousState) != null) && (theta <= 0.5)) {
			for (int i = 0; i < (interpolatedState.length); ++i) {
				interpolatedState[i] = (previousState[i]) + ((theta * (h)) * (yDotK[0][i]));
			}
			java.lang.System.arraycopy(yDotK[0], 0, interpolatedDerivatives, 0, interpolatedDerivatives.length);
		}else {
			for (int i = 0; i < (interpolatedState.length); ++i) {
				interpolatedState[i] = (currentState[i]) - (oneMinusThetaH * (yDotK[0][i]));
			}
			java.lang.System.arraycopy(yDotK[0], 0, interpolatedDerivatives, 0, interpolatedDerivatives.length);
		}
	}
}

