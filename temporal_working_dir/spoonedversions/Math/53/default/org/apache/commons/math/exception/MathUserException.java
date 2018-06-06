

package org.apache.commons.math.exception;


public class MathUserException extends java.lang.RuntimeException implements org.apache.commons.math.exception.util.ExceptionContextProvider {
	private static final long serialVersionUID = -6024911025449780478L;

	private final org.apache.commons.math.exception.util.ExceptionContext context = new org.apache.commons.math.exception.util.ExceptionContext();

	public MathUserException() {
		context.addMessage(org.apache.commons.math.exception.util.LocalizedFormats.USER_EXCEPTION);
	}

	public MathUserException(final java.lang.Throwable cause) {
		super(cause);
		context.addMessage(org.apache.commons.math.exception.util.LocalizedFormats.USER_EXCEPTION);
	}

	public MathUserException(final org.apache.commons.math.exception.util.Localizable pattern, final java.lang.Object... arguments) {
		context.addMessage(pattern, arguments);
	}

	public MathUserException(final java.lang.Throwable cause, final org.apache.commons.math.exception.util.Localizable pattern, final java.lang.Object... arguments) {
		super(cause);
		context.addMessage(pattern, arguments);
	}

	public org.apache.commons.math.exception.util.ExceptionContext getContext() {
		return context;
	}

	@java.lang.Override
	public java.lang.String getMessage() {
		return context.getMessage();
	}

	@java.lang.Override
	public java.lang.String getLocalizedMessage() {
		return context.getLocalizedMessage();
	}
}

