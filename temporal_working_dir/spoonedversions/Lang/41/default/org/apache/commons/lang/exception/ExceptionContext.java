

package org.apache.commons.lang.exception;


public interface ExceptionContext extends java.io.Serializable {
	public org.apache.commons.lang.exception.ExceptionContext addLabeledValue(java.lang.String label, java.io.Serializable value);

	public java.io.Serializable getLabeledValue(java.lang.String label);

	public java.util.Set<java.lang.String> getLabelSet();

	public java.lang.String getFormattedExceptionMessage(java.lang.String baseMessage);
}

