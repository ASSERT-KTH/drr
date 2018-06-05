

package org.apache.commons.math.ode;


public interface FixedStepHandler {
	public void handleStep(double t, double[] y, boolean isLast);
}

