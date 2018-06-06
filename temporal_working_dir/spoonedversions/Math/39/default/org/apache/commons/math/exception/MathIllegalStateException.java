

package org.apache.commons.math.exception;


public class MathIllegalStateException extends java.lang.IllegalStateException implements org.apache.commons.math.exception.util.ExceptionContextProvider {
	private static final long serialVersionUID = -6024911025449780478L;

	private final org.apache.commons.math.exception.util.ExceptionContext context;

	public MathIllegalStateException(org.apache.commons.math.exception.util.Localizable pattern, java.lang.Object... args) {
		context = new org.apache.commons.math.exception.util.ExceptionContext(org.apache.commons.math.exception.MathIllegalStateException.this);
		context.addMessage(pattern, args);
	}

	public MathIllegalStateException(java.lang.Throwable cause, org.apache.commons.math.exception.util.Localizable pattern, java.lang.Object... args) {
		super(cause);
		context = new org.apache.commons.math.exception.util.ExceptionContext(org.apache.commons.math.exception.MathIllegalStateException.this);
		context.addMessage(pattern, args);
	}

	public MathIllegalStateException() {
		this(org.apache.commons.math.exception.util.LocalizedFormats.ILLEGAL_STATE);
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

