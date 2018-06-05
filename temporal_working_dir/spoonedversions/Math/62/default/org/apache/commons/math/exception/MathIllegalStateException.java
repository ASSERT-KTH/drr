

package org.apache.commons.math.exception;


public class MathIllegalStateException extends java.lang.IllegalStateException {
	private static final long serialVersionUID = -6024911025449780478L;

	private final org.apache.commons.math.exception.util.Localizable specific;

	private final org.apache.commons.math.exception.util.Localizable general;

	private final java.lang.Object[] arguments;

	public MathIllegalStateException(org.apache.commons.math.exception.util.Localizable specific, org.apache.commons.math.exception.util.Localizable general, java.lang.Object... args) {
		this.specific = specific;
		this.general = general;
		arguments = org.apache.commons.math.exception.util.ArgUtils.flatten(args);
	}

	public MathIllegalStateException(org.apache.commons.math.exception.util.Localizable general, java.lang.Object... args) {
		this(null, general, args);
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

