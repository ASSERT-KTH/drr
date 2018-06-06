

package org.apache.commons.math.ode.sampling;


public interface StepHandler {
	void reset();

	void handleStep(org.apache.commons.math.ode.sampling.StepInterpolator interpolator, boolean isLast);
}

