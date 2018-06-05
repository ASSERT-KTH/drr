

package org.apache.commons.math.ode.nonstiff;


public class ClassicalRungeKuttaIntegrator extends org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator {
	private static final long serialVersionUID = -8987762131146169612L;

	private static final java.lang.String methodName = "classical Runge-Kutta";

	private static final double[] c = new double[]{ 1.0 / 2.0 , 1.0 / 2.0 , 1.0 };

	private static final double[][] a = new double[][]{ new double[]{ 1.0 / 2.0 } , new double[]{ 0.0 , 1.0 / 2.0 } , new double[]{ 0.0 , 0.0 , 1.0 } };

	private static final double[] b = new double[]{ 1.0 / 6.0 , 1.0 / 3.0 , 1.0 / 3.0 , 1.0 / 6.0 };

	public ClassicalRungeKuttaIntegrator(final double step) {
		super(org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator.c, org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator.a, org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator.b, new org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaStepInterpolator(), step);
	}

	public java.lang.String getName() {
		return org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator.methodName;
	}
}

