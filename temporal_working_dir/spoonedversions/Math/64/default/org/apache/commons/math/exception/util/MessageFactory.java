

package org.apache.commons.math.exception.util;


public class MessageFactory {
	private MessageFactory() {
	}

	public static java.lang.String buildMessage(java.util.Locale locale, org.apache.commons.math.exception.util.Localizable pattern, java.lang.Object... arguments) {
		return org.apache.commons.math.exception.util.MessageFactory.buildMessage(locale, null, pattern, arguments);
	}

	public static java.lang.String buildMessage(java.util.Locale locale, org.apache.commons.math.exception.util.Localizable specific, org.apache.commons.math.exception.util.Localizable general, java.lang.Object... arguments) {
		final java.lang.StringBuilder sb = new java.lang.StringBuilder();
		java.text.MessageFormat fmt = null;
		if (specific != null) {
			fmt = new java.text.MessageFormat(specific.getLocalizedString(locale), locale);
			sb.append(fmt.format(arguments));
			sb.append(": ");
		}
		fmt = new java.text.MessageFormat(general.getLocalizedString(locale), locale);
		sb.append(fmt.format(arguments));
		return sb.toString();
	}
}

