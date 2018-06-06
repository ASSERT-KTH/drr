

package org.apache.commons.math3.ode;


public interface SecondOrderIntegrator extends org.apache.commons.math3.ode.ODEIntegrator {
	void integrate(org.apache.commons.math3.ode.SecondOrderDifferentialEquations equations, double t0, double[] y0, double[] yDot0, double t, double[] y, double[] yDot) throws org.apache.commons.math3.exception.MathIllegalArgumentException, org.apache.commons.math3.exception.MathIllegalStateException;
}

