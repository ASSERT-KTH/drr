

package org.apache.commons.math.ode;


class DormandPrince54StepInterpolator extends org.apache.commons.math.ode.RungeKuttaStepInterpolator {
	public DormandPrince54StepInterpolator() {
		super();
		v1 = null;
		v2 = null;
		v3 = null;
		v4 = null;
		vectorsInitialized = false;
	}

	public DormandPrince54StepInterpolator(org.apache.commons.math.ode.DormandPrince54StepInterpolator interpolator) {
		super(interpolator);
		if ((interpolator.v1) == null) {
			v1 = null;
			v2 = null;
			v3 = null;
			v4 = null;
			vectorsInitialized = false;
		}else {
			v1 = ((double[]) (interpolator.v1.clone()));
			v2 = ((double[]) (interpolator.v2.clone()));
			v3 = ((double[]) (interpolator.v3.clone()));
			v4 = ((double[]) (interpolator.v4.clone()));
			vectorsInitialized = interpolator.vectorsInitialized;
		}
	}

	protected org.apache.commons.math.ode.StepInterpolator doCopy() {
		return new org.apache.commons.math.ode.DormandPrince54StepInterpolator(org.apache.commons.math.ode.DormandPrince54StepInterpolator.this);
	}

	public void reinitialize(org.apache.commons.math.ode.FirstOrderDifferentialEquations equations, double[] y, double[][] yDotK, boolean forward) {
		super.reinitialize(equations, y, yDotK, forward);
		v1 = null;
		v2 = null;
		v3 = null;
		v4 = null;
		vectorsInitialized = false;
	}

	public void storeTime(double t) {
		super.storeTime(t);
		vectorsInitialized = false;
	}

	protected void computeInterpolatedState(double theta, double oneMinusThetaH) throws org.apache.commons.math.ode.DerivativeException {
		if (!(vectorsInitialized)) {
			if ((v1) == null) {
				v1 = new double[interpolatedState.length];
				v2 = new double[interpolatedState.length];
				v3 = new double[interpolatedState.length];
				v4 = new double[interpolatedState.length];
			}
			for (int i = 0; i < (interpolatedState.length); ++i) {
				v1[i] = (h) * ((((((org.apache.commons.math.ode.DormandPrince54StepInterpolator.a70) * (yDotK[0][i])) + ((org.apache.commons.math.ode.DormandPrince54StepInterpolator.a72) * (yDotK[2][i]))) + ((org.apache.commons.math.ode.DormandPrince54StepInterpolator.a73) * (yDotK[3][i]))) + ((org.apache.commons.math.ode.DormandPrince54StepInterpolator.a74) * (yDotK[4][i]))) + ((org.apache.commons.math.ode.DormandPrince54StepInterpolator.a75) * (yDotK[5][i])));
				v2[i] = ((h) * (yDotK[0][i])) - (v1[i]);
				v3[i] = ((v1[i]) - (v2[i])) - ((h) * (yDotK[6][i]));
				v4[i] = (h) * (((((((org.apache.commons.math.ode.DormandPrince54StepInterpolator.d0) * (yDotK[0][i])) + ((org.apache.commons.math.ode.DormandPrince54StepInterpolator.d2) * (yDotK[2][i]))) + ((org.apache.commons.math.ode.DormandPrince54StepInterpolator.d3) * (yDotK[3][i]))) + ((org.apache.commons.math.ode.DormandPrince54StepInterpolator.d4) * (yDotK[4][i]))) + ((org.apache.commons.math.ode.DormandPrince54StepInterpolator.d5) * (yDotK[5][i]))) + ((org.apache.commons.math.ode.DormandPrince54StepInterpolator.d6) * (yDotK[6][i])));
			}
			vectorsInitialized = true;
		}
		double eta = oneMinusThetaH / (h);
		for (int i = 0; i < (interpolatedState.length); ++i) {
			interpolatedState[i] = (currentState[i]) - (eta * ((v1[i]) - (theta * ((v2[i]) + (theta * ((v3[i]) + (eta * (v4[i]))))))));
		}
	}

	private double[] v1;

	private double[] v2;

	private double[] v3;

	private double[] v4;

	private boolean vectorsInitialized;

	private static final double a70 = 35.0 / 384.0;

	private static final double a72 = 500.0 / 1113.0;

	private static final double a73 = 125.0 / 192.0;

	private static final double a74 = (-2187.0) / 6784.0;

	private static final double a75 = 11.0 / 84.0;

	private static final double d0 = (-1.2715105075E10) / 1.1282082432E10;

	private static final double d2 = 8.74874797E10 / 3.2700410799E10;

	private static final double d3 = (-1.0690763975E10) / 1.880347072E9;

	private static final double d4 = 7.01980252875E11 / 1.99316789632E11;

	private static final double d5 = (-1.453857185E9) / 8.22651844E8;

	private static final double d6 = 6.9997945E7 / 2.9380423E7;

	private static final long serialVersionUID = 4104157279605906956L;
}

