

package org.apache.commons.lang3.exception;


public class ContextedRuntimeException extends java.lang.RuntimeException implements org.apache.commons.lang3.exception.ExceptionContext {
	private static final long serialVersionUID = 1459691936045811817L;

	private final org.apache.commons.lang3.exception.ExceptionContext exceptionContext;

	public ContextedRuntimeException() {
		super();
		exceptionContext = new org.apache.commons.lang3.exception.DefaultExceptionContext();
	}

	public ContextedRuntimeException(java.lang.String message) {
		super(message);
		exceptionContext = new org.apache.commons.lang3.exception.DefaultExceptionContext();
	}

	public ContextedRuntimeException(java.lang.Throwable cause) {
		super(cause);
		exceptionContext = new org.apache.commons.lang3.exception.DefaultExceptionContext();
	}

	public ContextedRuntimeException(java.lang.String message, java.lang.Throwable cause) {
		super(message, cause);
		exceptionContext = new org.apache.commons.lang3.exception.DefaultExceptionContext();
	}

	public ContextedRuntimeException(java.lang.String message, java.lang.Throwable cause, org.apache.commons.lang3.exception.ExceptionContext context) {
		super(message, cause);
		if (context == null) {
			context = new org.apache.commons.lang3.exception.DefaultExceptionContext();
		}
		exceptionContext = context;
	}

	public org.apache.commons.lang3.exception.ContextedRuntimeException addValue(java.lang.String label, java.lang.Object value) {
		exceptionContext.addValue(label, value);
		return org.apache.commons.lang3.exception.ContextedRuntimeException.this;
	}

	public org.apache.commons.lang3.exception.ContextedRuntimeException replaceValue(java.lang.String label, java.lang.Object value) {
		exceptionContext.replaceValue(label, value);
		return org.apache.commons.lang3.exception.ContextedRuntimeException.this;
	}

	public java.lang.Object getValue(java.lang.String label) {
		return exceptionContext.getValue(label);
	}

	public java.util.Set<java.lang.String> getLabelSet() {
		return exceptionContext.getLabelSet();
	}

	@java.lang.Override
	public java.lang.String getMessage() {
		return getFormattedExceptionMessage(super.getMessage());
	}

	public java.lang.String getFormattedExceptionMessage(java.lang.String baseMessage) {
		return exceptionContext.getFormattedExceptionMessage(baseMessage);
	}
}

