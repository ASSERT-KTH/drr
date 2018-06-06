

package org.apache.commons.lang.exception;


public class ContextedRuntimeException extends java.lang.RuntimeException implements org.apache.commons.lang.exception.ExceptionContext {
	private static final long serialVersionUID = 1459691936045811817L;

	private org.apache.commons.lang.exception.ExceptionContext exceptionContext = new org.apache.commons.lang.exception.DefaultExceptionContext();

	public ContextedRuntimeException() {
	}

	public ContextedRuntimeException(java.lang.String message) {
		super(message);
	}

	public ContextedRuntimeException(java.lang.Throwable cause) {
		super(cause);
	}

	public ContextedRuntimeException(java.lang.String message, java.lang.Throwable cause) {
		this(message, cause, (cause instanceof org.apache.commons.lang.exception.ExceptionContext ? ((org.apache.commons.lang.exception.ExceptionContext) (cause)) : null));
	}

	public ContextedRuntimeException(java.lang.String message, java.lang.Throwable cause, org.apache.commons.lang.exception.ExceptionContext context) {
		super(message, cause);
		if (context != null) {
			org.apache.commons.lang.exception.ContextedRuntimeException.this.exceptionContext = context;
		}
	}

	public org.apache.commons.lang.exception.ContextedRuntimeException addLabeledValue(java.lang.String label, java.io.Serializable value) {
		org.apache.commons.lang.exception.ContextedRuntimeException.this.exceptionContext.addLabeledValue(label, value);
		return org.apache.commons.lang.exception.ContextedRuntimeException.this;
	}

	public java.io.Serializable getLabeledValue(java.lang.String label) {
		return org.apache.commons.lang.exception.ContextedRuntimeException.this.exceptionContext.getLabeledValue(label);
	}

	public java.util.Set<java.lang.String> getLabelSet() {
		return org.apache.commons.lang.exception.ContextedRuntimeException.this.exceptionContext.getLabelSet();
	}

	@java.lang.Override
	public java.lang.String getMessage() {
		return getFormattedExceptionMessage(super.getMessage());
	}

	public java.lang.String getFormattedExceptionMessage(java.lang.String baseMessage) {
		return org.apache.commons.lang.exception.ContextedRuntimeException.this.exceptionContext.getFormattedExceptionMessage(baseMessage);
	}
}

