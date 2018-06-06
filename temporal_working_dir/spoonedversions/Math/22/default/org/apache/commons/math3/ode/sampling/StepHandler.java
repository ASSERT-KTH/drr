

package org.apache.commons.math3.ode.sampling;


public interface StepHandler {
	void init(double t0, double[] y0, double t);

	void handleStep(org.apache.commons.math3.ode.sampling.StepInterpolator interpolator, boolean isLast) throws org.apache.commons.math3.exception.MaxCountExceededException;
}

