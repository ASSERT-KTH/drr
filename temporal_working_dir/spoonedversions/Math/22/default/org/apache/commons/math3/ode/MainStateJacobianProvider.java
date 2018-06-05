

package org.apache.commons.math3.ode;


public interface MainStateJacobianProvider extends org.apache.commons.math3.ode.FirstOrderDifferentialEquations {
	void computeMainStateJacobian(double t, double[] y, double[] yDot, double[][] dFdY) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.MaxCountExceededException;
}

