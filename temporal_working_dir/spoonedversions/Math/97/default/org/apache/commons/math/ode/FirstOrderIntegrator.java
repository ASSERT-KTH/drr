

package org.apache.commons.math.ode;


public interface FirstOrderIntegrator extends java.io.Serializable {
	public java.lang.String getName();

	public void setStepHandler(org.apache.commons.math.ode.sampling.StepHandler handler);

	public org.apache.commons.math.ode.sampling.StepHandler getStepHandler();

	public void addEventHandler(org.apache.commons.math.ode.events.EventHandler handler, double maxCheckInterval, double convergence, int maxIterationCount);

	public java.util.Collection<org.apache.commons.math.ode.events.EventHandler> getEventsHandlers();

	public void clearEventsHandlers();

	public void integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations equations, double t0, double[] y0, double t, double[] y) throws org.apache.commons.math.ode.DerivativeException, org.apache.commons.math.ode.IntegratorException;

	public double getCurrentStepStart();

	public double getCurrentSignedStepsize();
}

