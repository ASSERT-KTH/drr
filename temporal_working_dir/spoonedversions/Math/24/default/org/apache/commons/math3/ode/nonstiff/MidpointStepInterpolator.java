

package org.apache.commons.math3.ode.nonstiff;


class MidpointStepInterpolator extends org.apache.commons.math3.ode.nonstiff.RungeKuttaStepInterpolator {
	private static final long serialVersionUID = 20111120L;

	public MidpointStepInterpolator() {
	}

	public MidpointStepInterpolator(final org.apache.commons.math3.ode.nonstiff.MidpointStepInterpolator interpolator) {
		super(interpolator);
	}

	@java.lang.Override
	protected org.apache.commons.math3.ode.sampling.StepInterpolator doCopy() {
		return new org.apache.commons.math3.ode.nonstiff.MidpointStepInterpolator(org.apache.commons.math3.ode.nonstiff.MidpointStepInterpolator.this);
	}

	@java.lang.Override
	protected void computeInterpolatedStateAndDerivatives(final double theta, final double oneMinusThetaH) {
		final double coeffDot2 = 2 * theta;
		final double coeffDot1 = 1 - coeffDot2;
		if (((previousState) != null) && (theta <= 0.5)) {
			final double coeff1 = theta * oneMinusThetaH;
			final double coeff2 = (theta * theta) * (h);
			for (int i = 0; i < (interpolatedState.length); ++i) {
				final double yDot1 = yDotK[0][i];
				final double yDot2 = yDotK[1][i];
				interpolatedState[i] = ((previousState[i]) + (coeff1 * yDot1)) + (coeff2 * yDot2);
				interpolatedDerivatives[i] = (coeffDot1 * yDot1) + (coeffDot2 * yDot2);
			}
		}else {
			final double coeff1 = oneMinusThetaH * theta;
			final double coeff2 = oneMinusThetaH * (1.0 + theta);
			for (int i = 0; i < (interpolatedState.length); ++i) {
				final double yDot1 = yDotK[0][i];
				final double yDot2 = yDotK[1][i];
				interpolatedState[i] = ((currentState[i]) + (coeff1 * yDot1)) - (coeff2 * yDot2);
				interpolatedDerivatives[i] = (coeffDot1 * yDot1) + (coeffDot2 * yDot2);
			}
		}
	}
}

