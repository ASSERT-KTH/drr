

package org.apache.commons.math.ode.nonstiff;


public class EulerIntegrator extends org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator {
	private static final long serialVersionUID = -3378479003330094013L;

	private static final java.lang.String methodName = "Euler";

	private static final double[] c = new double[]{  };

	private static final double[][] a = new double[][]{  };

	private static final double[] b = new double[]{ 1.0 };

	public EulerIntegrator(final double step) {
		super(org.apache.commons.math.ode.nonstiff.EulerIntegrator.c, org.apache.commons.math.ode.nonstiff.EulerIntegrator.a, org.apache.commons.math.ode.nonstiff.EulerIntegrator.b, new org.apache.commons.math.ode.nonstiff.EulerStepInterpolator(), step);
	}

	public java.lang.String getName() {
		return org.apache.commons.math.ode.nonstiff.EulerIntegrator.methodName;
	}
}

