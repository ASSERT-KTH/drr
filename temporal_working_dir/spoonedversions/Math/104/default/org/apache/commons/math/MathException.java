

package org.apache.commons.math;


public class MathException extends java.lang.Exception {
	private static final long serialVersionUID = -8602234299177097102L;

	private static final boolean JDK_SUPPORTS_NESTED;

	static {
		boolean flag = false;
		try {
			java.lang.Throwable.class.getDeclaredMethod("getCause", new java.lang.Class[0]);
			flag = true;
		} catch (java.lang.NoSuchMethodException ex) {
			flag = false;
		}
		JDK_SUPPORTS_NESTED = flag;
	}

	private static java.util.ResourceBundle cachedResources = null;

	private final java.lang.String pattern;

	private final java.lang.Object[] arguments;

	private final java.lang.Throwable rootCause;

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
		java.text.MessageFormat mf = new java.text.MessageFormat(org.apache.commons.math.MathException.translate(pattern, locale));
		mf.setLocale(locale);
		return mf.format(arguments);
	}

	public MathException() {
		super();
		this.pattern = null;
		this.arguments = new java.lang.Object[0];
		this.rootCause = null;
	}

	public MathException(java.lang.String msg) {
		super(msg);
		this.pattern = msg;
		this.arguments = new java.lang.Object[0];
		this.rootCause = null;
	}

	public MathException(java.lang.String pattern, java.lang.Object[] arguments) {
		super(org.apache.commons.math.MathException.buildMessage(pattern, arguments, java.util.Locale.US));
		this.pattern = pattern;
		this.arguments = arguments;
		this.rootCause = null;
	}

	public MathException(java.lang.Throwable rootCause) {
		super((rootCause == null ? null : rootCause.getMessage()));
		this.pattern = getMessage();
		this.arguments = new java.lang.Object[0];
		this.rootCause = rootCause;
	}

	public MathException(java.lang.String msg, java.lang.Throwable rootCause) {
		super(msg);
		this.pattern = msg;
		this.arguments = new java.lang.Object[0];
		this.rootCause = rootCause;
	}

	public MathException(java.lang.String pattern, java.lang.Object[] arguments, java.lang.Throwable rootCause) {
		super(org.apache.commons.math.MathException.buildMessage(pattern, arguments, java.util.Locale.US));
		this.pattern = pattern;
		this.arguments = arguments;
		this.rootCause = rootCause;
	}

	public java.lang.String getPattern() {
		return pattern;
	}

	public java.lang.Object[] getArguments() {
		return arguments;
	}

	public java.lang.String getMessage(java.util.Locale locale) {
		return (pattern) == null ? null : org.apache.commons.math.MathException.buildMessage(pattern, arguments, locale);
	}

	public java.lang.Throwable getCause() {
		return rootCause;
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

	public void printStackTrace(java.io.PrintWriter out) {
		synchronized(out) {
			super.printStackTrace(out);
			if (((rootCause) != null) && ((org.apache.commons.math.MathException.JDK_SUPPORTS_NESTED) == false)) {
				out.print("Caused by: ");
				rootCause.printStackTrace(out);
			}
		}
	}
}

