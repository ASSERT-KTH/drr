

package org.apache.commons.math;


public class MathException extends java.lang.Exception {
	private static final long serialVersionUID = 5924076008552401454L;

	private static java.util.ResourceBundle cachedResources = null;

	private final java.lang.String pattern;

	private final java.lang.Object[] arguments;

	private static java.lang.String translate(java.lang.String s, java.util.Locale locale) {
		try {
			if (((org.apache.commons.math.MathException.cachedResources) == null) || (!(org.apache.commons.math.MathException.cachedResources.getLocale().equals(locale)))) {
				org.apache.commons.math.MathException.cachedResources = java.util.ResourceBundle.getBundle("org.apache.commons.math.MessagesResources", locale);
			}
			if (org.apache.commons.math.MathException.cachedResources.getLocale().getLanguage().equals(locale.getLanguage())) {
				return org.apache.commons.math.MathException.cachedResources.getString(s);
			}
		} catch (java.util.MissingResourceException mre) {
		}
		return s;
	}

	private static java.lang.String buildMessage(java.lang.String pattern, java.lang.Object[] arguments, java.util.Locale locale) {
		return pattern == null ? "" : new java.text.MessageFormat(org.apache.commons.math.MathException.translate(pattern, locale), locale).format(arguments);
	}

	public MathException() {
		super();
		this.pattern = null;
		this.arguments = new java.lang.Object[0];
	}

	public MathException(java.lang.String pattern, java.lang.Object[] arguments) {
		super(org.apache.commons.math.MathException.buildMessage(pattern, arguments, java.util.Locale.US));
		this.pattern = pattern;
		this.arguments = (arguments == null) ? new java.lang.Object[0] : arguments.clone();
	}

	public MathException(java.lang.Throwable rootCause) {
		super(rootCause);
		this.pattern = getMessage();
		this.arguments = new java.lang.Object[0];
	}

	public MathException(java.lang.String pattern, java.lang.Object[] arguments, java.lang.Throwable rootCause) {
		super(org.apache.commons.math.MathException.buildMessage(pattern, arguments, java.util.Locale.US), rootCause);
		this.pattern = pattern;
		this.arguments = (arguments == null) ? new java.lang.Object[0] : arguments.clone();
	}

	public java.lang.String getPattern() {
		return pattern;
	}

	public java.lang.Object[] getArguments() {
		return arguments.clone();
	}

	public java.lang.String getMessage(java.util.Locale locale) {
		return org.apache.commons.math.MathException.buildMessage(pattern, arguments, locale);
	}

	public java.lang.String getLocalizedMessage() {
		return getMessage(java.util.Locale.getDefault());
	}

	public void printStackTrace() {
		printStackTrace(java.lang.System.err);
	}

	public void printStackTrace(java.io.PrintStream out) {
		synchronized(out) {
			java.io.PrintWriter pw = new java.io.PrintWriter(out, false);
			printStackTrace(pw);
			pw.flush();
		}
	}
}

