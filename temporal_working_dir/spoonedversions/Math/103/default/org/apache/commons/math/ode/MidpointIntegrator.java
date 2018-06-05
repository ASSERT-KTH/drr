

package org.apache.commons.math.ode;


public class MidpointIntegrator extends org.apache.commons.math.ode.RungeKuttaIntegrator {
	private static final java.lang.String methodName = "midpoint";

	private static final double[] c = new double[]{ 1.0 / 2.0 };

	private static final double[][] a = new double[][]{ new double[]{ 1.0 / 2.0 } };

	private static final double[] b = new double[]{ 0.0 , 1.0 };

	public MidpointIntegrator(double step) {
		super(false, org.apache.commons.math.ode.MidpointIntegrator.c, org.apache.commons.math.ode.MidpointIntegrator.a, org.apache.commons.math.ode.MidpointIntegrator.b, new org.apache.commons.math.ode.MidpointStepInterpolator(), step);
	}

	public java.lang.String getName() {
		return org.apache.commons.math.ode.MidpointIntegrator.methodName;
	}
}

