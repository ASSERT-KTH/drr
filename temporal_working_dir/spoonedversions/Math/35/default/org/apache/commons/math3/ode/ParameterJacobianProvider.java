

package org.apache.commons.math3.ode;


public interface ParameterJacobianProvider extends org.apache.commons.math3.ode.Parameterizable {
	void computeParameterJacobian(double t, double[] y, double[] yDot, java.lang.String paramName, double[] dFdP) throws org.apache.commons.math3.exception.MathIllegalArgumentException;
}

