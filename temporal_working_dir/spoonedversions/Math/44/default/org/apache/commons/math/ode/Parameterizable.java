

package org.apache.commons.math.ode;


public interface Parameterizable {
	java.util.Collection<java.lang.String> getParametersNames();

	boolean isSupported(java.lang.String name);
}

