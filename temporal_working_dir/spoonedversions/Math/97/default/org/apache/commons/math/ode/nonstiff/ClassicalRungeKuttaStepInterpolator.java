

package org.apache.commons.math.ode.nonstiff;


class ClassicalRungeKuttaStepInterpolator extends org.apache.commons.math.ode.nonstiff.RungeKuttaStepInterpolator {
	private static final long serialVersionUID = -6576285612589783992L;

	public ClassicalRungeKuttaStepInterpolator() {
	}

	public ClassicalRungeKuttaStepInterpolator(final org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaStepInterpolator interpolator) {
		super(interpolator);
	}

	protected org.apache.commons.math.ode.sampling.StepInterpolator doCopy() {
		return new org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaStepInterpolator(org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaStepInterpolator.this);
	}

	protected void computeInterpolatedState(final double theta, final double oneMinusThetaH) throws org.apache.commons.math.ode.DerivativeException {
		final double fourTheta = 4 * theta;
		final double s = oneMinusThetaH / 6.0;
		final double coeff1 = s * ((((-fourTheta) + 5) * theta) - 1);
		final double coeff23 = s * (((fourTheta - 2) * theta) - 2);
		final double coeff4 = s * ((((-fourTheta) - 1) * theta) - 1);
		for (int i = 0; i < (interpolatedState.length); ++i) {
			interpolatedState[i] = (((currentState[i]) + (coeff1 * (yDotK[0][i]))) + (coeff23 * ((yDotK[1][i]) + (yDotK[2][i])))) + (coeff4 * (yDotK[3][i]));
		}
	}
}

