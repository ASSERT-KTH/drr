

package org.apache.commons.math3.ode.sampling;


public interface FixedStepHandler {
	void init(double t0, double[] y0, double t);

	void handleStep(double t, double[] y, double[] yDot, boolean isLast);
}

