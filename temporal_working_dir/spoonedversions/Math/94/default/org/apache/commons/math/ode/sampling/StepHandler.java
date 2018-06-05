

package org.apache.commons.math.ode.sampling;


public interface StepHandler extends java.io.Serializable {
	public boolean requiresDenseOutput();

	public void reset();

	public void handleStep(org.apache.commons.math.ode.sampling.StepInterpolator interpolator, boolean isLast) throws org.apache.commons.math.ode.DerivativeException;
}

