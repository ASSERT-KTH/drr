

package org.apache.commons.lang.exception;


public class ContextedException extends java.lang.Exception implements org.apache.commons.lang.exception.ExceptionContext {
	private static final long serialVersionUID = 8940917952810290164L;

	private org.apache.commons.lang.exception.ExceptionContext exceptionContext = new org.apache.commons.lang.exception.DefaultExceptionContext();

	public ContextedException() {
	}

	public ContextedException(java.lang.String message) {
		super(message);
	}

	public ContextedException(java.lang.Throwable cause) {
		super(cause);
	}

	public ContextedException(java.lang.String message, java.lang.Throwable cause) {
		super(message, cause);
	}

	public ContextedException(java.lang.String message, java.lang.Throwable cause, org.apache.commons.lang.exception.ExceptionContext context) {
		super(message, cause);
		if (context != null) {
			org.apache.commons.lang.exception.ContextedException.this.exceptionContext = context;
		}
	}

	public org.apache.commons.lang.exception.ContextedException addLabeledValue(java.lang.String label, java.io.Serializable value) {
		org.apache.commons.lang.exception.ContextedException.this.exceptionContext.addLabeledValue(label, value);
		return org.apache.commons.lang.exception.ContextedException.this;
	}

	public java.io.Serializable getLabeledValue(java.lang.String label) {
		return org.apache.commons.lang.exception.ContextedException.this.exceptionContext.getLabeledValue(label);
	}

	public java.util.Set<java.lang.String> getLabelSet() {
		return org.apache.commons.lang.exception.ContextedException.this.exceptionContext.getLabelSet();
	}

	@java.lang.Override
	public java.lang.String getMessage() {
		return getFormattedExceptionMessage(super.getMessage());
	}

	public java.lang.String getFormattedExceptionMessage(java.lang.String baseMessage) {
		return org.apache.commons.lang.exception.ContextedException.this.exceptionContext.getFormattedExceptionMessage(baseMessage);
	}
}

