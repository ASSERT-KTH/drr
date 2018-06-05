

package org.apache.commons.math3.exception;


public class MathRuntimeException extends java.lang.RuntimeException implements org.apache.commons.math3.exception.util.ExceptionContextProvider {
	private static final long serialVersionUID = 20120926L;

	private final org.apache.commons.math3.exception.util.ExceptionContext context;

	public MathRuntimeException(org.apache.commons.math3.exception.util.Localizable pattern, java.lang.Object... args) {
		context = new org.apache.commons.math3.exception.util.ExceptionContext(org.apache.commons.math3.exception.MathRuntimeException.this);
		context.addMessage(pattern, args);
	}

	public org.apache.commons.math3.exception.util.ExceptionContext getContext() {
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

