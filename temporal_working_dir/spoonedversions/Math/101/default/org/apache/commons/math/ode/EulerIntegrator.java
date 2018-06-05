

package org.apache.commons.math.ode;


public class EulerIntegrator extends org.apache.commons.math.ode.RungeKuttaIntegrator {
	private static final java.lang.String methodName = "Euler";

	private static final double[] c = new double[]{  };

	private static final double[][] a = new double[][]{  };

	private static final double[] b = new double[]{ 1.0 };

	public EulerIntegrator(double step) {
		super(org.apache.commons.math.ode.EulerIntegrator.c, org.apache.commons.math.ode.EulerIntegrator.a, org.apache.commons.math.ode.EulerIntegrator.b, new org.apache.commons.math.ode.EulerStepInterpolator(), step);
	}

	public java.lang.String getName() {
		return org.apache.commons.math.ode.EulerIntegrator.methodName;
	}
}

