

package org.apache.commons.math.ode.nonstiff;


public class GillIntegrator extends org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator {
	private static final long serialVersionUID = 5566682259665027132L;

	private static final double[] c = new double[]{ 1.0 / 2.0 , 1.0 / 2.0 , 1.0 };

	private static final double[][] a = new double[][]{ new double[]{ 1.0 / 2.0 } , new double[]{ ((java.lang.Math.sqrt(2.0)) - 1.0) / 2.0 , (2.0 - (java.lang.Math.sqrt(2.0))) / 2.0 } , new double[]{ 0.0 , (-(java.lang.Math.sqrt(2.0))) / 2.0 , (2.0 + (java.lang.Math.sqrt(2.0))) / 2.0 } };

	private static final double[] b = new double[]{ 1.0 / 6.0 , (2.0 - (java.lang.Math.sqrt(2.0))) / 6.0 , (2.0 + (java.lang.Math.sqrt(2.0))) / 6.0 , 1.0 / 6.0 };

	public GillIntegrator(final double step) {
		super("Gill", org.apache.commons.math.ode.nonstiff.GillIntegrator.c, org.apache.commons.math.ode.nonstiff.GillIntegrator.a, org.apache.commons.math.ode.nonstiff.GillIntegrator.b, new org.apache.commons.math.ode.nonstiff.GillStepInterpolator(), step);
	}
}

