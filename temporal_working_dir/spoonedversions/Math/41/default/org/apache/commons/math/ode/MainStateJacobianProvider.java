

package org.apache.commons.math.ode;


public interface MainStateJacobianProvider extends org.apache.commons.math.ode.FirstOrderDifferentialEquations {
	void computeMainStateJacobian(double t, double[] y, double[] yDot, double[][] dFdY);
}

