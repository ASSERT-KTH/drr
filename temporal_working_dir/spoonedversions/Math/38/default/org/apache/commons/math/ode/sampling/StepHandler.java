

package org.apache.commons.math.ode.sampling;


public interface StepHandler {
	void init(double t0, double[] y0, double t);

	void handleStep(org.apache.commons.math.ode.sampling.StepInterpolator interpolator, boolean isLast);
}

