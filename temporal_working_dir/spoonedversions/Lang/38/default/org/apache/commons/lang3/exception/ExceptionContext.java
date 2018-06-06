

package org.apache.commons.lang3.exception;


public interface ExceptionContext {
	public org.apache.commons.lang3.exception.ExceptionContext addValue(java.lang.String label, java.lang.Object value);

	public java.lang.Object getValue(java.lang.String label);

	public java.util.Set<java.lang.String> getLabelSet();

	public java.lang.String getFormattedExceptionMessage(java.lang.String baseMessage);
}

