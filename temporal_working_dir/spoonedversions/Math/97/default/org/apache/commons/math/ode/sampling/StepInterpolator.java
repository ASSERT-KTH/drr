

package org.apache.commons.math.ode.sampling;


public interface StepInterpolator extends java.io.Externalizable {
	public double getPreviousTime();

	public double getCurrentTime();

	public double getInterpolatedTime();

	public void setInterpolatedTime(double time) throws org.apache.commons.math.ode.DerivativeException;

	public double[] getInterpolatedState();

	public boolean isForward();

	public org.apache.commons.math.ode.sampling.StepInterpolator copy() throws org.apache.commons.math.ode.DerivativeException;
}

