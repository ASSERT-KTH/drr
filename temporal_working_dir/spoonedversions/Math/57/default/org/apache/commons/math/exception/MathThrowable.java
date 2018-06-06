

package org.apache.commons.math.exception;


public interface MathThrowable {
	void addMessage(org.apache.commons.math.exception.util.Localizable pattern);

	void addMessage(org.apache.commons.math.exception.util.Localizable pattern, java.lang.Object... arguments);

	void setContext(java.lang.String key, java.lang.Object value);

	java.lang.Object getContext(java.lang.String key);

	java.util.Set<java.lang.String> getContextKeys();

	java.lang.String getMessage(final java.util.Locale locale);

	java.lang.String getMessage();

	java.lang.String getLocalizedMessage();
}

