

package org.apache.commons.math3.exception;


public class MathArithmeticException extends java.lang.ArithmeticException implements org.apache.commons.math3.exception.util.ExceptionContextProvider {
	private static final long serialVersionUID = -6024911025449780478L;

	private final org.apache.commons.math3.exception.util.ExceptionContext context;

	public MathArithmeticException() {
		context = new org.apache.commons.math3.exception.util.ExceptionContext(org.apache.commons.math3.exception.MathArithmeticException.this);
		context.addMessage(org.apache.commons.math3.exception.util.LocalizedFormats.ARITHMETIC_EXCEPTION);
	}

	public MathArithmeticException(org.apache.commons.math3.exception.util.Localizable pattern, java.lang.Object... args) {
		context = new org.apache.commons.math3.exception.util.ExceptionContext(org.apache.commons.math3.exception.MathArithmeticException.this);
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

