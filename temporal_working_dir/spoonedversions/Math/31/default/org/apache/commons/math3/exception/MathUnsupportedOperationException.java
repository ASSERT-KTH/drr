

package org.apache.commons.math3.exception;


public class MathUnsupportedOperationException extends java.lang.UnsupportedOperationException implements org.apache.commons.math3.exception.util.ExceptionContextProvider {
	private static final long serialVersionUID = -6024911025449780478L;

	private final org.apache.commons.math3.exception.util.ExceptionContext context;

	public MathUnsupportedOperationException() {
		this(org.apache.commons.math3.exception.util.LocalizedFormats.UNSUPPORTED_OPERATION);
	}

	public MathUnsupportedOperationException(org.apache.commons.math3.exception.util.Localizable pattern, java.lang.Object... args) {
		context = new org.apache.commons.math3.exception.util.ExceptionContext(org.apache.commons.math3.exception.MathUnsupportedOperationException.this);
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

