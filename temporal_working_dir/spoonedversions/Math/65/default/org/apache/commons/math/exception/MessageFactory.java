

package org.apache.commons.math.exception;


public class MessageFactory {
	private MessageFactory() {
	}

	public static java.lang.String buildMessage(java.util.Locale locale, org.apache.commons.math.exception.Localizable pattern, java.lang.Object... arguments) {
		final java.lang.String locPattern = pattern.getLocalizedString(locale);
		return new java.text.MessageFormat(locPattern, locale).format(arguments);
	}
}

