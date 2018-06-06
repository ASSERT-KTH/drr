

package org.apache.commons.lang3.exception;


public class ContextedException extends java.lang.Exception implements org.apache.commons.lang3.exception.ExceptionContext {
	private static final long serialVersionUID = 8940917952810290164L;

	private final org.apache.commons.lang3.exception.ExceptionContext exceptionContext;

	public ContextedException() {
		super();
		exceptionContext = new org.apache.commons.lang3.exception.DefaultExceptionContext();
	}

	public ContextedException(java.lang.String message) {
		super(message);
		exceptionContext = new org.apache.commons.lang3.exception.DefaultExceptionContext();
	}

	public ContextedException(java.lang.Throwable cause) {
		super(cause);
		exceptionContext = new org.apache.commons.lang3.exception.DefaultExceptionContext();
	}

	public ContextedException(java.lang.String message, java.lang.Throwable cause) {
		super(message, cause);
		exceptionContext = new org.apache.commons.lang3.exception.DefaultExceptionContext();
	}

	public ContextedException(java.lang.String message, java.lang.Throwable cause, org.apache.commons.lang3.exception.ExceptionContext context) {
		super(message, cause);
		if (context == null) {
			context = new org.apache.commons.lang3.exception.DefaultExceptionContext();
		}
		exceptionContext = context;
	}

	public org.apache.commons.lang3.exception.ContextedException addValue(java.lang.String label, java.lang.Object value) {
		exceptionContext.addValue(label, value);
		return org.apache.commons.lang3.exception.ContextedException.this;
	}

	public org.apache.commons.lang3.exception.ContextedException replaceValue(java.lang.String label, java.lang.Object value) {
		exceptionContext.replaceValue(label, value);
		return org.apache.commons.lang3.exception.ContextedException.this;
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

