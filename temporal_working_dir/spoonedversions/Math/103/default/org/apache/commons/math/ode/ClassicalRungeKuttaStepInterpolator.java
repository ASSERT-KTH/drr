

package org.apache.commons.math.ode;


class ClassicalRungeKuttaStepInterpolator extends org.apache.commons.math.ode.RungeKuttaStepInterpolator {
	public ClassicalRungeKuttaStepInterpolator() {
	}

	public ClassicalRungeKuttaStepInterpolator(org.apache.commons.math.ode.ClassicalRungeKuttaStepInterpolator interpolator) {
		super(interpolator);
	}

	public java.lang.Object clone() {
		return new org.apache.commons.math.ode.ClassicalRungeKuttaStepInterpolator(org.apache.commons.math.ode.ClassicalRungeKuttaStepInterpolator.this);
	}

	protected void computeInterpolatedState(double theta, double oneMinusThetaH) throws org.apache.commons.math.ode.DerivativeException {
		double fourTheta = 4 * theta;
		double s = oneMinusThetaH / 6.0;
		double coeff1 = s * ((((-fourTheta) + 5) * theta) - 1);
		double coeff23 = s * (((fourTheta - 2) * theta) - 2);
		double coeff4 = s * ((((-fourTheta) - 1) * theta) - 1);
		for (int i = 0; i < (interpolatedState.length); ++i) {
			interpolatedState[i] = (((currentState[i]) + (coeff1 * (yDotK[0][i]))) + (coeff23 * ((yDotK[1][i]) + (yDotK[2][i])))) + (coeff4 * (yDotK[3][i]));
		}
	}

	private static final long serialVersionUID = -6576285612589783992L;
}

