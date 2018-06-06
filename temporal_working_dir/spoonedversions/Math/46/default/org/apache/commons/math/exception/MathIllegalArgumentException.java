

package org.apache.commons.math.exception;


public class MathIllegalArgumentException extends java.lang.IllegalArgumentException implements org.apache.commons.math.exception.util.ExceptionContextProvider {
	private static final long serialVersionUID = -6024911025449780478L;

	private final org.apache.commons.math.exception.util.ExceptionContext context = new org.apache.commons.math.exception.util.ExceptionContext();

	public MathIllegalArgumentException(org.apache.commons.math.exception.util.Localizable pattern, java.lang.Object... args) {
		context.addMessage(pattern, args);
	}

	public org.apache.commons.math.exception.util.ExceptionContext getContext() {
		return context;
	}

	public java.lang.Throwable getException() {
		return org.apache.commons.math.exception.MathIllegalArgumentException.this;
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

