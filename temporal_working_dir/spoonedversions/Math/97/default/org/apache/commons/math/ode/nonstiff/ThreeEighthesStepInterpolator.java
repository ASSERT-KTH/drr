

package org.apache.commons.math.ode.nonstiff;


class ThreeEighthesStepInterpolator extends org.apache.commons.math.ode.nonstiff.RungeKuttaStepInterpolator {
	public ThreeEighthesStepInterpolator() {
	}

	public ThreeEighthesStepInterpolator(final org.apache.commons.math.ode.nonstiff.ThreeEighthesStepInterpolator interpolator) {
		super(interpolator);
	}

	protected org.apache.commons.math.ode.sampling.StepInterpolator doCopy() {
		return new org.apache.commons.math.ode.nonstiff.ThreeEighthesStepInterpolator(org.apache.commons.math.ode.nonstiff.ThreeEighthesStepInterpolator.this);
	}

	protected void computeInterpolatedState(final double theta, final double oneMinusThetaH) throws org.apache.commons.math.ode.DerivativeException {
		final double fourTheta2 = (4 * theta) * theta;
		final double s = oneMinusThetaH / 8.0;
		final double coeff1 = s * ((1 - (7 * theta)) + (2 * fourTheta2));
		final double coeff2 = (3 * s) * ((1 + theta) - fourTheta2);
		final double coeff3 = (3 * s) * (1 + theta);
		final double coeff4 = s * ((1 + theta) + fourTheta2);
		for (int i = 0; i < (interpolatedState.length); ++i) {
			interpolatedState[i] = ((((currentState[i]) - (coeff1 * (yDotK[0][i]))) - (coeff2 * (yDotK[1][i]))) - (coeff3 * (yDotK[2][i]))) - (coeff4 * (yDotK[3][i]));
		}
	}

	private static final long serialVersionUID = -3345024435978721931L;
}

