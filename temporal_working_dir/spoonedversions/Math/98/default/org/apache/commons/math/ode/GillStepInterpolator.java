

package org.apache.commons.math.ode;


class GillStepInterpolator extends org.apache.commons.math.ode.RungeKuttaStepInterpolator {
	public GillStepInterpolator() {
	}

	public GillStepInterpolator(org.apache.commons.math.ode.GillStepInterpolator interpolator) {
		super(interpolator);
	}

	protected org.apache.commons.math.ode.StepInterpolator doCopy() {
		return new org.apache.commons.math.ode.GillStepInterpolator(org.apache.commons.math.ode.GillStepInterpolator.this);
	}

	protected void computeInterpolatedState(double theta, double oneMinusThetaH) throws org.apache.commons.math.ode.DerivativeException {
		double fourTheta = 4 * theta;
		double s = oneMinusThetaH / 6.0;
		double soMt = s * (1 - theta);
		double c23 = soMt * (1 + (2 * theta));
		double coeff1 = soMt * (1 - fourTheta);
		double coeff2 = c23 * (org.apache.commons.math.ode.GillStepInterpolator.tMq);
		double coeff3 = c23 * (org.apache.commons.math.ode.GillStepInterpolator.tPq);
		double coeff4 = s * (1 + (theta * (1 + fourTheta)));
		for (int i = 0; i < (interpolatedState.length); ++i) {
			interpolatedState[i] = ((((currentState[i]) - (coeff1 * (yDotK[0][i]))) - (coeff2 * (yDotK[1][i]))) - (coeff3 * (yDotK[2][i]))) - (coeff4 * (yDotK[3][i]));
		}
	}

	private static final double tMq = 2 - (java.lang.Math.sqrt(2.0));

	private static final double tPq = 2 + (java.lang.Math.sqrt(2.0));

	private static final long serialVersionUID = -107804074496313322L;
}

