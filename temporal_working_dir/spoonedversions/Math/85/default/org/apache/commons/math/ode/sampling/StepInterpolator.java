

package org.apache.commons.math.ode.sampling;


public interface StepInterpolator extends java.io.Externalizable {
	public double getPreviousTime();

	public double getCurrentTime();

	public double getInterpolatedTime();

	public void setInterpolatedTime(double time);

	public double[] getInterpolatedState() throws org.apache.commons.math.ode.DerivativeException;

	public double[] getInterpolatedDerivatives() throws org.apache.commons.math.ode.DerivativeException;

	public boolean isForward();

	public org.apache.commons.math.ode.sampling.StepInterpolator copy() throws org.apache.commons.math.ode.DerivativeException;
}

