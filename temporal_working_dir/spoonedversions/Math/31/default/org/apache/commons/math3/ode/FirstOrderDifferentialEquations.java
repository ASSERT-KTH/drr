

package org.apache.commons.math3.ode;


public interface FirstOrderDifferentialEquations {
	int getDimension();

	void computeDerivatives(double t, double[] y, double[] yDot);
}

