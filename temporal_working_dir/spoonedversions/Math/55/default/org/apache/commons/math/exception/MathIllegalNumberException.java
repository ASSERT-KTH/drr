

package org.apache.commons.math.exception;


public class MathIllegalNumberException extends org.apache.commons.math.exception.MathIllegalArgumentException {
	private static final long serialVersionUID = -7447085893598031110L;

	private final java.lang.Number argument;

	protected MathIllegalNumberException(org.apache.commons.math.exception.util.Localizable pattern, java.lang.Number wrong, java.lang.Object... arguments) {
		super(pattern, wrong, arguments);
		argument = wrong;
	}

	public java.lang.Number getArgument() {
		return argument;
	}
}

