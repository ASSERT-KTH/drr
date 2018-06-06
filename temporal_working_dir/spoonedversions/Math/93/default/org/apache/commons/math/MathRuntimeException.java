

package org.apache.commons.math;


public class MathRuntimeException extends java.lang.RuntimeException {
	private static final long serialVersionUID = -143052521750625264L;

	private static java.util.ResourceBundle cachedResources = null;

	private final java.lang.String pattern;

	private final java.lang.Object[] arguments;

	private static java.lang.String translate(final java.lang.String s, final java.util.Locale locale) {
		try {
			if (((org.apache.commons.math.MathRuntimeException.cachedResources) == null) || (!(org.apache.commons.math.MathRuntimeException.cachedResources.getLocale().equals(locale)))) {
				org.apache.commons.math.MathRuntimeException.cachedResources = java.util.ResourceBundle.getBundle("org.apache.commons.math.MessagesResources", locale);
			}
			if (org.apache.commons.math.MathRuntimeException.cachedResources.getLocale().getLanguage().equals(locale.getLanguage())) {
				return org.apache.commons.math.MathRuntimeException.cachedResources.getString(s);
			}
		} catch (java.util.MissingResourceException mre) {
		}
		return s;
	}

	private static java.lang.String buildMessage(final java.lang.String pattern, final java.lang.Object[] arguments, final java.util.Locale locale) {
		return pattern == null ? "" : new java.text.MessageFormat(org.apache.commons.math.MathRuntimeException.translate(pattern, locale), locale).format(arguments);
	}

	public MathRuntimeException(final java.lang.String pattern, final java.lang.Object[] arguments) {
		super(org.apache.commons.math.MathRuntimeException.buildMessage(pattern, arguments, java.util.Locale.US));
		this.pattern = pattern;
		this.arguments = (arguments == null) ? new java.lang.Object[0] : arguments.clone();
	}

	public MathRuntimeException(final java.lang.Throwable rootCause) {
		super(rootCause);
		this.pattern = getMessage();
		this.arguments = new java.lang.Object[0];
	}

	public MathRuntimeException(final java.lang.String pattern, final java.lang.Object[] arguments, final java.lang.Throwable rootCause) {
		super(org.apache.commons.math.MathRuntimeException.buildMessage(pattern, arguments, java.util.Locale.US), rootCause);
		this.pattern = pattern;
		this.arguments = (arguments == null) ? new java.lang.Object[0] : arguments.clone();
	}

	public java.lang.String getPattern() {
		return pattern;
	}

	public java.lang.Object[] getArguments() {
		return arguments.clone();
	}

	public java.lang.String getMessage(final java.util.Locale locale) {
		return org.apache.commons.math.MathRuntimeException.buildMessage(pattern, arguments, locale);
	}

	public java.lang.String getLocalizedMessage() {
		return getMessage(java.util.Locale.getDefault());
	}

	public void printStackTrace() {
		printStackTrace(java.lang.System.err);
	}

	public void printStackTrace(final java.io.PrintStream out) {
		synchronized(out) {
			java.io.PrintWriter pw = new java.io.PrintWriter(out, false);
			printStackTrace(pw);
			pw.flush();
		}
	}

	public static java.lang.ArithmeticException createArithmeticException(final java.lang.String pattern, final java.lang.Object[] arguments) {
		return new java.lang.ArithmeticException(org.apache.commons.math.MathRuntimeException.buildMessage(pattern, arguments, java.util.Locale.US)) {
			private static final long serialVersionUID = 7705628723242533939L;

			public java.lang.String getLocalizedMessage() {
				return org.apache.commons.math.MathRuntimeException.buildMessage(pattern, arguments, java.util.Locale.getDefault());
			}
		};
	}

	public static java.lang.ArrayIndexOutOfBoundsException createArrayIndexOutOfBoundsException(final java.lang.String pattern, final java.lang.Object[] arguments) {
		return new java.lang.ArrayIndexOutOfBoundsException(org.apache.commons.math.MathRuntimeException.buildMessage(pattern, arguments, java.util.Locale.US)) {
			private static final long serialVersionUID = 8077627622976962141L;

			public java.lang.String getLocalizedMessage() {
				return org.apache.commons.math.MathRuntimeException.buildMessage(pattern, arguments, java.util.Locale.getDefault());
			}
		};
	}

	public static java.io.EOFException createEOFException(final java.lang.String pattern, final java.lang.Object[] arguments) {
		return new java.io.EOFException(org.apache.commons.math.MathRuntimeException.buildMessage(pattern, arguments, java.util.Locale.US)) {
			private static final long serialVersionUID = 279461544586092584L;

			public java.lang.String getLocalizedMessage() {
				return org.apache.commons.math.MathRuntimeException.buildMessage(pattern, arguments, java.util.Locale.getDefault());
			}
		};
	}

	public static java.io.IOException createIOException(final java.lang.Throwable rootCause) {
		java.io.IOException ioe = new java.io.IOException(rootCause.getLocalizedMessage());
		ioe.initCause(rootCause);
		return ioe;
	}

	public static java.lang.IllegalArgumentException createIllegalArgumentException(final java.lang.String pattern, final java.lang.Object[] arguments) {
		return new java.lang.IllegalArgumentException(org.apache.commons.math.MathRuntimeException.buildMessage(pattern, arguments, java.util.Locale.US)) {
			private static final long serialVersionUID = -7537852425838457684L;

			public java.lang.String getLocalizedMessage() {
				return org.apache.commons.math.MathRuntimeException.buildMessage(pattern, arguments, java.util.Locale.getDefault());
			}
		};
	}

	public static java.lang.IllegalStateException createIllegalStateException(final java.lang.String pattern, final java.lang.Object[] arguments) {
		return new java.lang.IllegalStateException(org.apache.commons.math.MathRuntimeException.buildMessage(pattern, arguments, java.util.Locale.US)) {
			private static final long serialVersionUID = 5173599768297434381L;

			public java.lang.String getLocalizedMessage() {
				return org.apache.commons.math.MathRuntimeException.buildMessage(pattern, arguments, java.util.Locale.getDefault());
			}
		};
	}

	public static java.util.ConcurrentModificationException createConcurrentModificationException(final java.lang.String pattern, final java.lang.Object[] arguments) {
		return new java.util.ConcurrentModificationException(org.apache.commons.math.MathRuntimeException.buildMessage(pattern, arguments, java.util.Locale.US)) {
			private static final long serialVersionUID = 6134247282754009421L;

			public java.lang.String getLocalizedMessage() {
				return org.apache.commons.math.MathRuntimeException.buildMessage(pattern, arguments, java.util.Locale.getDefault());
			}
		};
	}

	public static java.util.NoSuchElementException createNoSuchElementException(final java.lang.String pattern, final java.lang.Object[] arguments) {
		return new java.util.NoSuchElementException(org.apache.commons.math.MathRuntimeException.buildMessage(pattern, arguments, java.util.Locale.US)) {
			private static final long serialVersionUID = 7304273322489425799L;

			public java.lang.String getLocalizedMessage() {
				return org.apache.commons.math.MathRuntimeException.buildMessage(pattern, arguments, java.util.Locale.getDefault());
			}
		};
	}

	public static java.text.ParseException createParseException(final java.lang.String pattern, final java.lang.Object[] arguments, final int offset) {
		return new java.text.ParseException(org.apache.commons.math.MathRuntimeException.buildMessage(pattern, arguments, java.util.Locale.US), offset) {
			private static final long serialVersionUID = -1103502177342465975L;

			public java.lang.String getLocalizedMessage() {
				return org.apache.commons.math.MathRuntimeException.buildMessage(pattern, arguments, java.util.Locale.getDefault());
			}
		};
	}
}

