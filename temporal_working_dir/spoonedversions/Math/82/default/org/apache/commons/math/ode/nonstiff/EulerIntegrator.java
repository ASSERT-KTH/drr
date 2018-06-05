

package org.apache.commons.math.ode.nonstiff;


public class EulerIntegrator extends org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator {
	private static final double[] c = new double[]{  };

	private static final double[][] a = new double[][]{  };

	private static final double[] b = new double[]{ 1.0 };

	public EulerIntegrator(final double step) {
		super("Euler", org.apache.commons.math.ode.nonstiff.EulerIntegrator.c, org.apache.commons.math.ode.nonstiff.EulerIntegrator.a, org.apache.commons.math.ode.nonstiff.EulerIntegrator.b, new org.apache.commons.math.ode.nonstiff.EulerStepInterpolator(), step);
	}
}

