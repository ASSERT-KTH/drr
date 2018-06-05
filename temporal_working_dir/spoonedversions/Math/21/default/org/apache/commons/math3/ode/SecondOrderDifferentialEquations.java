

package org.apache.commons.math3.ode;


public interface SecondOrderDifferentialEquations {
	int getDimension();

	void computeSecondDerivatives(double t, double[] y, double[] yDot, double[] yDDot);
}

