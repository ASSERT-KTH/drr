

package org.apache.commons.math.exception;


public class MathIllegalNumberException extends org.apache.commons.math.exception.MathIllegalArgumentException {
	private final java.lang.Number argument;

	protected MathIllegalNumberException(org.apache.commons.math.util.Localizable specific, org.apache.commons.math.util.Localizable general, java.lang.Number wrong, java.lang.Object... arguments) {
		super(specific, general, wrong, arguments);
		argument = wrong;
	}

	protected MathIllegalNumberException(org.apache.commons.math.util.Localizable general, java.lang.Number wrong, java.lang.Object... arguments) {
		super(general, wrong, arguments);
		argument = wrong;
	}

	public java.lang.Number getArgument() {
		return argument;
	}
}

