

package org.apache.commons.math.ode.nonstiff;


public class ThreeEighthesIntegrator extends org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator {
	private static final double[] c = new double[]{ 1.0 / 3.0 , 2.0 / 3.0 , 1.0 };

	private static final double[][] a = new double[][]{ new double[]{ 1.0 / 3.0 } , new double[]{ (-1.0) / 3.0 , 1.0 } , new double[]{ 1.0 , -1.0 , 1.0 } };

	private static final double[] b = new double[]{ 1.0 / 8.0 , 3.0 / 8.0 , 3.0 / 8.0 , 1.0 / 8.0 };

	public ThreeEighthesIntegrator(final double step) {
		super("3/8", org.apache.commons.math.ode.nonstiff.ThreeEighthesIntegrator.c, org.apache.commons.math.ode.nonstiff.ThreeEighthesIntegrator.a, org.apache.commons.math.ode.nonstiff.ThreeEighthesIntegrator.b, new org.apache.commons.math.ode.nonstiff.ThreeEighthesStepInterpolator(), step);
	}
}

