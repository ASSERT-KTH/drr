

package org.apache.commons.math.exception;


public class MathRuntimeException extends java.lang.RuntimeException implements org.apache.commons.math.exception.MathThrowable {
	private static final long serialVersionUID = -6024911025449780478L;

	private final org.apache.commons.math.exception.util.Localizable specific;

	private final org.apache.commons.math.exception.util.Localizable general;

	private final java.lang.Object[] arguments;

	public MathRuntimeException(final java.lang.Throwable cause, final org.apache.commons.math.exception.util.Localizable specific, final org.apache.commons.math.exception.util.Localizable general, final java.lang.Object... arguments) {
		super(cause);
		this.specific = specific;
		this.general = general;
		this.arguments = org.apache.commons.math.exception.util.ArgUtils.flatten(arguments);
	}

	public MathRuntimeException(final java.lang.Throwable cause) {
		this(cause, null, null);
	}

	public org.apache.commons.math.exception.util.Localizable getSpecificPattern() {
		return specific;
	}

	public org.apache.commons.math.exception.util.Localizable getGeneralPattern() {
		return general;
	}

	public java.lang.Object[] getArguments() {
		return arguments.clone();
	}

	public java.lang.String getMessage(final java.util.Locale locale) {
		return org.apache.commons.math.exception.util.MessageFactory.buildMessage(locale, specific, general, arguments);
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

