

package org.apache.commons.math3.ode;


public interface FirstOrderDifferentialEquations {
	int getDimension();

	void computeDerivatives(double t, double[] y, double[] yDot) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.MaxCountExceededException;
}

