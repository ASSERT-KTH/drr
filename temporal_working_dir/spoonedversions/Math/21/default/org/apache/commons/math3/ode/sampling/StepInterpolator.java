

package org.apache.commons.math3.ode.sampling;


public interface StepInterpolator extends java.io.Externalizable {
	double getPreviousTime();

	double getCurrentTime();

	double getInterpolatedTime();

	void setInterpolatedTime(double time);

	double[] getInterpolatedState() throws org.apache.commons.math3.exception.MaxCountExceededException;

	double[] getInterpolatedDerivatives() throws org.apache.commons.math3.exception.MaxCountExceededException;

	double[] getInterpolatedSecondaryState(int index) throws org.apache.commons.math3.exception.MaxCountExceededException;

	double[] getInterpolatedSecondaryDerivatives(int index) throws org.apache.commons.math3.exception.MaxCountExceededException;

	boolean isForward();

	org.apache.commons.math3.ode.sampling.StepInterpolator copy() throws org.apache.commons.math3.exception.MaxCountExceededException;
}

