

package org.apache.commons.math.ode.nonstiff;


class HighamHall54StepInterpolator extends org.apache.commons.math.ode.nonstiff.RungeKuttaStepInterpolator {
	public HighamHall54StepInterpolator() {
		super();
	}

	public HighamHall54StepInterpolator(final org.apache.commons.math.ode.nonstiff.HighamHall54StepInterpolator interpolator) {
		super(interpolator);
	}

	protected org.apache.commons.math.ode.sampling.StepInterpolator doCopy() {
		return new org.apache.commons.math.ode.nonstiff.HighamHall54StepInterpolator(org.apache.commons.math.ode.nonstiff.HighamHall54StepInterpolator.this);
	}

	protected void computeInterpolatedState(final double theta, final double oneMinusThetaH) throws org.apache.commons.math.ode.DerivativeException {
		final double theta2 = theta * theta;
		final double b0 = (h) * (((-1.0) / 12.0) + (theta * (1.0 + (theta * (((-15.0) / 4.0) + (theta * ((16.0 / 3.0) + ((theta * (-5.0)) / 2.0))))))));
		final double b2 = (h) * (((-27.0) / 32.0) + (theta2 * ((459.0 / 32.0) + (theta * (((-243.0) / 8.0) + ((theta * 135.0) / 8.0))))));
		final double b3 = (h) * ((4.0 / 3.0) + (theta2 * ((-22.0) + (theta * ((152.0 / 3.0) + (theta * (-30.0)))))));
		final double b4 = (h) * (((-125.0) / 96.0) + (theta2 * ((375.0 / 32.0) + (theta * (((-625.0) / 24.0) + ((theta * 125.0) / 8.0))))));
		final double b5 = (h) * (((-5.0) / 48.0) + (theta2 * (((-5.0) / 16.0) + ((theta * 5.0) / 12.0))));
		for (int i = 0; i < (interpolatedState.length); ++i) {
			interpolatedState[i] = (((((currentState[i]) + (b0 * (yDotK[0][i]))) + (b2 * (yDotK[2][i]))) + (b3 * (yDotK[3][i]))) + (b4 * (yDotK[4][i]))) + (b5 * (yDotK[5][i]));
		}
	}

	private static final long serialVersionUID = -3583240427587318654L;
}

