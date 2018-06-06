

package org.apache.commons.math.ode;


public interface FirstOrderIntegrator extends java.io.Serializable {
	public java.lang.String getName();

	public void setStepHandler(org.apache.commons.math.ode.StepHandler handler);

	public org.apache.commons.math.ode.StepHandler getStepHandler();

	public void addSwitchingFunction(org.apache.commons.math.ode.SwitchingFunction function, double maxCheckInterval, double convergence, int maxIterationCount);

	public java.util.Collection<org.apache.commons.math.ode.SwitchState> getSwitchingFunctions();

	public void clearSwitchingFunctions();

	public void integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations equations, double t0, double[] y0, double t, double[] y) throws org.apache.commons.math.ode.DerivativeException, org.apache.commons.math.ode.IntegratorException;

	public double getCurrentStepStart();

	public double getCurrentSignedStepsize();
}

