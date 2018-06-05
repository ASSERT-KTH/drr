

package org.apache.commons.math3.ode;


public interface ParameterizedODE extends org.apache.commons.math3.ode.Parameterizable {
	double getParameter(java.lang.String name) throws org.apache.commons.math3.ode.UnknownParameterException;

	void setParameter(java.lang.String name, double value) throws org.apache.commons.math3.ode.UnknownParameterException;
}

