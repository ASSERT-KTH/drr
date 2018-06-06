

package org.apache.commons.math3.ode;


public abstract class AbstractParameterizable implements org.apache.commons.math3.ode.Parameterizable {
	private final java.util.Collection<java.lang.String> parametersNames;

	protected AbstractParameterizable(final java.lang.String... names) {
		parametersNames = new java.util.ArrayList<java.lang.String>();
		for (final java.lang.String name : names) {
			parametersNames.add(name);
		}
	}

	protected AbstractParameterizable(final java.util.Collection<java.lang.String> names) {
		parametersNames = new java.util.ArrayList<java.lang.String>();
		parametersNames.addAll(names);
	}

	public java.util.Collection<java.lang.String> getParametersNames() {
		return parametersNames;
	}

	public boolean isSupported(final java.lang.String name) {
		for (final java.lang.String supportedName : parametersNames) {
			if (supportedName.equals(name)) {
				return true;
			}
		}
		return false;
	}

	public void complainIfNotSupported(final java.lang.String name) throws org.apache.commons.math3.ode.UnknownParameterException {
		if (!(isSupported(name))) {
			throw new org.apache.commons.math3.ode.UnknownParameterException(name);
		}
	}
}

