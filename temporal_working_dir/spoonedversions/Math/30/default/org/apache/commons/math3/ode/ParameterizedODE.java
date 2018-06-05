

package org.apache.commons.math3.ode;


public interface ParameterizedODE extends org.apache.commons.math3.ode.Parameterizable {
	double getParameter(java.lang.String name) throws java.lang.IllegalArgumentException;

	void setParameter(java.lang.String name, double value) throws java.lang.IllegalArgumentException;
}

