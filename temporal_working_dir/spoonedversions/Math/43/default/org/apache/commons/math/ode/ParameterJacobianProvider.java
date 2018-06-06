

package org.apache.commons.math.ode;


public interface ParameterJacobianProvider extends org.apache.commons.math.ode.Parameterizable {
	void computeParameterJacobian(double t, double[] y, double[] yDot, java.lang.String paramName, double[] dFdP) throws org.apache.commons.math.exception.MathIllegalArgumentException;
}

