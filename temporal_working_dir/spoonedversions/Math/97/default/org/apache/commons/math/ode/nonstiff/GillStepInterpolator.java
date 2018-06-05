

package org.apache.commons.math.ode.nonstiff;


class GillStepInterpolator extends org.apache.commons.math.ode.nonstiff.RungeKuttaStepInterpolator {
	public GillStepInterpolator() {
	}

	public GillStepInterpolator(final org.apache.commons.math.ode.nonstiff.GillStepInterpolator interpolator) {
		super(interpolator);
	}

	protected org.apache.commons.math.ode.sampling.StepInterpolator doCopy() {
		return new org.apache.commons.math.ode.nonstiff.GillStepInterpolator(org.apache.commons.math.ode.nonstiff.GillStepInterpolator.this);
	}

	protected void computeInterpolatedState(final double theta, final double oneMinusThetaH) throws org.apache.commons.math.ode.DerivativeException {
		final double fourTheta = 4 * theta;
		final double s = oneMinusThetaH / 6.0;
		final double soMt = s * (1 - theta);
		final double c23 = soMt * (1 + (2 * theta));
		final double coeff1 = soMt * (1 - fourTheta);
		final double coeff2 = c23 * (org.apache.commons.math.ode.nonstiff.GillStepInterpolator.tMq);
		final double coeff3 = c23 * (org.apache.commons.math.ode.nonstiff.GillStepInterpolator.tPq);
		final double coeff4 = s * (1 + (theta * (1 + fourTheta)));
		for (int i = 0; i < (interpolatedState.length); ++i) {
			interpolatedState[i] = ((((currentState[i]) - (coeff1 * (yDotK[0][i]))) - (coeff2 * (yDotK[1][i]))) - (coeff3 * (yDotK[2][i]))) - (coeff4 * (yDotK[3][i]));
		}
	}

	private static final double tMq = 2 - (java.lang.Math.sqrt(2.0));

	private static final double tPq = 2 + (java.lang.Math.sqrt(2.0));

	private static final long serialVersionUID = -107804074496313322L;
}

