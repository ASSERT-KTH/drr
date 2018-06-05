

package org.apache.commons.math.ode.sampling;


public interface StepInterpolator extends java.io.Externalizable {
	double getPreviousTime();

	double getCurrentTime();

	double getInterpolatedTime();

	void setInterpolatedTime(double time);

	double[] getInterpolatedState();

	double[] getInterpolatedDerivatives();

	double[] getInterpolatedSecondaryState(int index);

	double[] getInterpolatedSecondaryDerivatives(int index);

	boolean isForward();

	org.apache.commons.math.ode.sampling.StepInterpolator copy();
}

