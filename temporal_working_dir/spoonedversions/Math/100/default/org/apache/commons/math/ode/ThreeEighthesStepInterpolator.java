

package org.apache.commons.math.ode;


class ThreeEighthesStepInterpolator extends org.apache.commons.math.ode.RungeKuttaStepInterpolator {
	public ThreeEighthesStepInterpolator() {
	}

	public ThreeEighthesStepInterpolator(org.apache.commons.math.ode.ThreeEighthesStepInterpolator interpolator) {
		super(interpolator);
	}

	protected org.apache.commons.math.ode.StepInterpolator doCopy() {
		return new org.apache.commons.math.ode.ThreeEighthesStepInterpolator(org.apache.commons.math.ode.ThreeEighthesStepInterpolator.this);
	}

	protected void computeInterpolatedState(double theta, double oneMinusThetaH) throws org.apache.commons.math.ode.DerivativeException {
		double fourTheta2 = (4 * theta) * theta;
		double s = oneMinusThetaH / 8.0;
		double coeff1 = s * ((1 - (7 * theta)) + (2 * fourTheta2));
		double coeff2 = (3 * s) * ((1 + theta) - fourTheta2);
		double coeff3 = (3 * s) * (1 + theta);
		double coeff4 = s * ((1 + theta) + fourTheta2);
		for (int i = 0; i < (interpolatedState.length); ++i) {
			interpolatedState[i] = ((((currentState[i]) - (coeff1 * (yDotK[0][i]))) - (coeff2 * (yDotK[1][i]))) - (coeff3 * (yDotK[2][i]))) - (coeff4 * (yDotK[3][i]));
		}
	}

	private static final long serialVersionUID = -3345024435978721931L;
}

