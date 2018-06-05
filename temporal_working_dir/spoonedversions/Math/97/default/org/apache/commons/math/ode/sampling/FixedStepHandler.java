

package org.apache.commons.math.ode.sampling;


public interface FixedStepHandler {
	public void handleStep(double t, double[] y, boolean isLast);
}

