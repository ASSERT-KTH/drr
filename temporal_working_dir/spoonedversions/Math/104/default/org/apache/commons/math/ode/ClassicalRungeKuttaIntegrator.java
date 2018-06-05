

package org.apache.commons.math.ode;


public class ClassicalRungeKuttaIntegrator extends org.apache.commons.math.ode.RungeKuttaIntegrator {
	private static final java.lang.String methodName = "classical Runge-Kutta";

	private static final double[] c = new double[]{ 1.0 / 2.0 , 1.0 / 2.0 , 1.0 };

	private static final double[][] a = new double[][]{ new double[]{ 1.0 / 2.0 } , new double[]{ 0.0 , 1.0 / 2.0 } , new double[]{ 0.0 , 0.0 , 1.0 } };

	private static final double[] b = new double[]{ 1.0 / 6.0 , 1.0 / 3.0 , 1.0 / 3.0 , 1.0 / 6.0 };

	public ClassicalRungeKuttaIntegrator(double step) {
		super(false, org.apache.commons.math.ode.ClassicalRungeKuttaIntegrator.c, org.apache.commons.math.ode.ClassicalRungeKuttaIntegrator.a, org.apache.commons.math.ode.ClassicalRungeKuttaIntegrator.b, new org.apache.commons.math.ode.ClassicalRungeKuttaStepInterpolator(), step);
	}

	public java.lang.String getName() {
		return org.apache.commons.math.ode.ClassicalRungeKuttaIntegrator.methodName;
	}
}

