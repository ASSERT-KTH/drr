

package org.apache.commons.math.exception;


public class MathArithmeticException extends java.lang.ArithmeticException {
	private static final long serialVersionUID = -6024911025449780478L;

	private final org.apache.commons.math.exception.util.Localizable specific;

	private final java.lang.Object[] arguments;

	public MathArithmeticException(java.lang.Object... args) {
		this(null, args);
	}

	public MathArithmeticException(org.apache.commons.math.exception.util.Localizable specific, java.lang.Object... args) {
		this.specific = specific;
		arguments = org.apache.commons.math.exception.util.ArgUtils.flatten(args);
	}

	public java.lang.String getMessage(final java.util.Locale locale) {
		return org.apache.commons.math.exception.util.MessageFactory.buildMessage(locale, specific, org.apache.commons.math.exception.util.LocalizedFormats.UNSUPPORTED_OPERATION, arguments);
	}

	@java.lang.Override
	public java.lang.String getMessage() {
		return getMessage(java.util.Locale.US);
	}

	@java.lang.Override
	public java.lang.String getLocalizedMessage() {
		return getMessage(java.util.Locale.getDefault());
	}
}

