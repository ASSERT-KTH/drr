

package org.apache.commons.math3.ode;


public class UnknownParameterException extends org.apache.commons.math3.exception.MathIllegalArgumentException {
	private static final long serialVersionUID = 20120902L;

	private final java.lang.String name;

	public UnknownParameterException(final java.lang.String name) {
		super(org.apache.commons.math3.exception.util.LocalizedFormats.UNKNOWN_PARAMETER);
		this.name = name;
	}

	public java.lang.String getName() {
		return name;
	}
}

