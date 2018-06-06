

package org.apache.commons.math3.ode.nonstiff;


public class GillIntegrator extends org.apache.commons.math3.ode.nonstiff.RungeKuttaIntegrator {
	private static final double[] STATIC_C = new double[]{ 1.0 / 2.0 , 1.0 / 2.0 , 1.0 };

	private static final double[][] STATIC_A = new double[][]{ new double[]{ 1.0 / 2.0 } , new double[]{ ((org.apache.commons.math3.util.FastMath.sqrt(2.0)) - 1.0) / 2.0 , (2.0 - (org.apache.commons.math3.util.FastMath.sqrt(2.0))) / 2.0 } , new double[]{ 0.0 , (-(org.apache.commons.math3.util.FastMath.sqrt(2.0))) / 2.0 , (2.0 + (org.apache.commons.math3.util.FastMath.sqrt(2.0))) / 2.0 } };

	private static final double[] STATIC_B = new double[]{ 1.0 / 6.0 , (2.0 - (org.apache.commons.math3.util.FastMath.sqrt(2.0))) / 6.0 , (2.0 + (org.apache.commons.math3.util.FastMath.sqrt(2.0))) / 6.0 , 1.0 / 6.0 };

	public GillIntegrator(final double step) {
		super("Gill", org.apache.commons.math3.ode.nonstiff.GillIntegrator.STATIC_C, org.apache.commons.math3.ode.nonstiff.GillIntegrator.STATIC_A, org.apache.commons.math3.ode.nonstiff.GillIntegrator.STATIC_B, new org.apache.commons.math3.ode.nonstiff.GillStepInterpolator(), step);
	}
}

