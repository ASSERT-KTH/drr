

package org.apache.commons.math.ode;


public interface ParameterizedODE extends org.apache.commons.math.ode.Parameterizable {
	double getParameter(java.lang.String name) throws java.lang.IllegalArgumentException;

	void setParameter(java.lang.String name, double value) throws java.lang.IllegalArgumentException;
}

