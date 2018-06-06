

package org.apache.commons.math.ode;


public interface FirstOrderIntegrator {
	public java.lang.String getName();

	public void setStepHandler(org.apache.commons.math.ode.StepHandler handler);

	public org.apache.commons.math.ode.StepHandler getStepHandler();

	public void addSwitchingFunction(org.apache.commons.math.ode.SwitchingFunction function, double maxCheckInterval, double convergence);

	public void integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations equations, double t0, double[] y0, double t, double[] y) throws org.apache.commons.math.ode.DerivativeException, org.apache.commons.math.ode.IntegratorException;
}

