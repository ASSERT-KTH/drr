

package org.apache.commons.math.ode;


public interface SecondOrderIntegrator {
	public java.lang.String getName();

	public void setStepHandler(org.apache.commons.math.ode.sampling.StepHandler handler);

	public org.apache.commons.math.ode.sampling.StepHandler getStepHandler();

	public void integrate(org.apache.commons.math.ode.SecondOrderDifferentialEquations equations, double t0, double[] y0, double[] yDot0, double t, double[] y, double[] yDot) throws org.apache.commons.math.ode.DerivativeException, org.apache.commons.math.ode.IntegratorException;
}

