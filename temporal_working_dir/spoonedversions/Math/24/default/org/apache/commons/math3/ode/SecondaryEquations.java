

package org.apache.commons.math3.ode;


public interface SecondaryEquations {
	int getDimension();

	void computeDerivatives(double t, double[] primary, double[] primaryDot, double[] secondary, double[] secondaryDot) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.MaxCountExceededException;
}

