

package org.apache.commons.math.ode;


public interface SecondaryEquations {
	int getDimension();

	void computeDerivatives(double t, double[] primary, double[] primaryDot, double[] secondary, double[] secondaryDot);
}

