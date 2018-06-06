

package org.apache.commons.math3.ode.nonstiff;


public class EulerIntegrator extends org.apache.commons.math3.ode.nonstiff.RungeKuttaIntegrator {
	private static final double[] STATIC_C = new double[]{  };

	private static final double[][] STATIC_A = new double[][]{  };

	private static final double[] STATIC_B = new double[]{ 1.0 };

	public EulerIntegrator(final double step) {
		super("Euler", org.apache.commons.math3.ode.nonstiff.EulerIntegrator.STATIC_C, org.apache.commons.math3.ode.nonstiff.EulerIntegrator.STATIC_A, org.apache.commons.math3.ode.nonstiff.EulerIntegrator.STATIC_B, new org.apache.commons.math3.ode.nonstiff.EulerStepInterpolator(), step);
	}
}

