

package org.apache.commons.math.ode;


public class GillIntegrator extends org.apache.commons.math.ode.RungeKuttaIntegrator {
	private static final java.lang.String methodName = "Gill";

	private static final double sqrt2 = java.lang.Math.sqrt(2.0);

	private static final double[] c = new double[]{ 1.0 / 2.0 , 1.0 / 2.0 , 1.0 };

	private static final double[][] a = new double[][]{ new double[]{ 1.0 / 2.0 } , new double[]{ ((org.apache.commons.math.ode.GillIntegrator.sqrt2) - 1.0) / 2.0 , (2.0 - (org.apache.commons.math.ode.GillIntegrator.sqrt2)) / 2.0 } , new double[]{ 0.0 , (-(org.apache.commons.math.ode.GillIntegrator.sqrt2)) / 2.0 , (2.0 + (org.apache.commons.math.ode.GillIntegrator.sqrt2)) / 2.0 } };

	private static final double[] b = new double[]{ 1.0 / 6.0 , (2.0 - (org.apache.commons.math.ode.GillIntegrator.sqrt2)) / 6.0 , (2.0 + (org.apache.commons.math.ode.GillIntegrator.sqrt2)) / 6.0 , 1.0 / 6.0 };

	public GillIntegrator(double step) {
		super(org.apache.commons.math.ode.GillIntegrator.c, org.apache.commons.math.ode.GillIntegrator.a, org.apache.commons.math.ode.GillIntegrator.b, new org.apache.commons.math.ode.GillStepInterpolator(), step);
	}

	public java.lang.String getName() {
		return org.apache.commons.math.ode.GillIntegrator.methodName;
	}
}

