

package org.apache.commons.math.ode;


public class ThreeEighthesIntegrator extends org.apache.commons.math.ode.RungeKuttaIntegrator {
	private static final long serialVersionUID = -5738562635641912717L;

	private static final java.lang.String methodName = "3/8";

	private static final double[] c = new double[]{ 1.0 / 3.0 , 2.0 / 3.0 , 1.0 };

	private static final double[][] a = new double[][]{ new double[]{ 1.0 / 3.0 } , new double[]{ (-1.0) / 3.0 , 1.0 } , new double[]{ 1.0 , -1.0 , 1.0 } };

	private static final double[] b = new double[]{ 1.0 / 8.0 , 3.0 / 8.0 , 3.0 / 8.0 , 1.0 / 8.0 };

	public ThreeEighthesIntegrator(double step) {
		super(org.apache.commons.math.ode.ThreeEighthesIntegrator.c, org.apache.commons.math.ode.ThreeEighthesIntegrator.a, org.apache.commons.math.ode.ThreeEighthesIntegrator.b, new org.apache.commons.math.ode.ThreeEighthesStepInterpolator(), step);
	}

	public java.lang.String getName() {
		return org.apache.commons.math.ode.ThreeEighthesIntegrator.methodName;
	}
}

