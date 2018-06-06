

package org.apache.commons.math.ode.nonstiff;


public class MidpointIntegrator extends org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator {
	private static final long serialVersionUID = -7690774342890000483L;

	private static final double[] c = new double[]{ 1.0 / 2.0 };

	private static final double[][] a = new double[][]{ new double[]{ 1.0 / 2.0 } };

	private static final double[] b = new double[]{ 0.0 , 1.0 };

	public MidpointIntegrator(final double step) {
		super("midpoint", org.apache.commons.math.ode.nonstiff.MidpointIntegrator.c, org.apache.commons.math.ode.nonstiff.MidpointIntegrator.a, org.apache.commons.math.ode.nonstiff.MidpointIntegrator.b, new org.apache.commons.math.ode.nonstiff.MidpointStepInterpolator(), step);
	}
}

