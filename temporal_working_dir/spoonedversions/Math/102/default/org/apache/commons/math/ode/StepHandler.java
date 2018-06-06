

package org.apache.commons.math.ode;


public interface StepHandler {
	public boolean requiresDenseOutput();

	public void reset();

	public void handleStep(org.apache.commons.math.ode.StepInterpolator interpolator, boolean isLast) throws org.apache.commons.math.ode.DerivativeException;
}

