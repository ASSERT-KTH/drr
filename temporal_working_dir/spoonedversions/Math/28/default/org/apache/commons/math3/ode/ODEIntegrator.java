

package org.apache.commons.math3.ode;


public interface ODEIntegrator {
	java.lang.String getName();

	void addStepHandler(org.apache.commons.math3.ode.sampling.StepHandler handler);

	java.util.Collection<org.apache.commons.math3.ode.sampling.StepHandler> getStepHandlers();

	void clearStepHandlers();

	void addEventHandler(org.apache.commons.math3.ode.events.EventHandler handler, double maxCheckInterval, double convergence, int maxIterationCount);

	void addEventHandler(org.apache.commons.math3.ode.events.EventHandler handler, double maxCheckInterval, double convergence, int maxIterationCount, org.apache.commons.math3.analysis.solvers.UnivariateSolver solver);

	java.util.Collection<org.apache.commons.math3.ode.events.EventHandler> getEventHandlers();

	void clearEventHandlers();

	double getCurrentStepStart();

	double getCurrentSignedStepsize();

	void setMaxEvaluations(int maxEvaluations);

	int getMaxEvaluations();

	int getEvaluations();
}

