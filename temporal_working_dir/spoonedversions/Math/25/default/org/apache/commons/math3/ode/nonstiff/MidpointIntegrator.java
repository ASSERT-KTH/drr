

package org.apache.commons.math3.ode.nonstiff;


public class MidpointIntegrator extends org.apache.commons.math3.ode.nonstiff.RungeKuttaIntegrator {
	private static final double[] STATIC_C = new double[]{ 1.0 / 2.0 };

	private static final double[][] STATIC_A = new double[][]{ new double[]{ 1.0 / 2.0 } };

	private static final double[] STATIC_B = new double[]{ 0.0 , 1.0 };

	public MidpointIntegrator(final double step) {
		super("midpoint", org.apache.commons.math3.ode.nonstiff.MidpointIntegrator.STATIC_C, org.apache.commons.math3.ode.nonstiff.MidpointIntegrator.STATIC_A, org.apache.commons.math3.ode.nonstiff.MidpointIntegrator.STATIC_B, new org.apache.commons.math3.ode.nonstiff.MidpointStepInterpolator(), step);
	}
}

