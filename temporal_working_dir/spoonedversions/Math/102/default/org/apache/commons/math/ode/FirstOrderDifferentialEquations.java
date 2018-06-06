

package org.apache.commons.math.ode;


public interface FirstOrderDifferentialEquations {
	public int getDimension();

	public void computeDerivatives(double t, double[] y, double[] yDot) throws org.apache.commons.math.ode.DerivativeException;
}

