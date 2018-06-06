

package org.apache.commons.math;


public class MathException extends java.lang.Exception implements org.apache.commons.math.exception.MathThrowable {
	private static final long serialVersionUID = 7428019509644517071L;

	private static final java.lang.String DEPRECATION_MESSAGE = "This class is deprecated; calling this method is a bug.";

	private final org.apache.commons.math.exception.util.Localizable pattern;

	private final java.lang.Object[] arguments;

	public MathException() {
		this.pattern = org.apache.commons.math.exception.util.LocalizedFormats.SIMPLE_MESSAGE;
		this.arguments = new java.lang.Object[]{ "" };
	}

	public MathException(org.apache.commons.math.exception.util.Localizable pattern, java.lang.Object... arguments) {
		this.pattern = pattern;
		this.arguments = (arguments == null) ? new java.lang.Object[0] : arguments.clone();
	}

	public MathException(java.lang.Throwable rootCause) {
		super(rootCause);
		this.pattern = org.apache.commons.math.exception.util.LocalizedFormats.SIMPLE_MESSAGE;
		this.arguments = new java.lang.Object[]{ rootCause == null ? "" : rootCause.getMessage() };
	}

	public MathException(java.lang.Throwable rootCause, org.apache.commons.math.exception.util.Localizable pattern, java.lang.Object... arguments) {
		super(rootCause);
		this.pattern = pattern;
		this.arguments = (arguments == null) ? new java.lang.Object[0] : arguments.clone();
	}

	public void addMessage(org.apache.commons.math.exception.util.Localizable pat, java.lang.Object... args) {
		throw new java.lang.UnsupportedOperationException(org.apache.commons.math.MathException.DEPRECATION_MESSAGE);
	}

	public void setContext(java.lang.String key, java.lang.Object value) {
		throw new java.lang.UnsupportedOperationException(org.apache.commons.math.MathException.DEPRECATION_MESSAGE);
	}

	public java.lang.Object getContext(java.lang.String key) {
		throw new java.lang.UnsupportedOperationException(org.apache.commons.math.MathException.DEPRECATION_MESSAGE);
	}

	public java.util.Set<java.lang.String> getContextKeys() {
		throw new java.lang.UnsupportedOperationException(org.apache.commons.math.MathException.DEPRECATION_MESSAGE);
	}

	public java.lang.String getMessage(final java.util.Locale locale) {
		if ((pattern) != null) {
			return new java.text.MessageFormat(pattern.getLocalizedString(locale), locale).format(arguments);
		}
		return "";
	}

	@java.lang.Override
	public java.lang.String getMessage() {
		return getMessage(java.util.Locale.US);
	}

	@java.lang.Override
	public java.lang.String getLocalizedMessage() {
		return getMessage(java.util.Locale.getDefault());
	}

	@java.lang.Override
	public void printStackTrace() {
		printStackTrace(java.lang.System.err);
	}

	@java.lang.Override
	public void printStackTrace(java.io.PrintStream out) {
		synchronized(out) {
			java.io.PrintWriter pw = new java.io.PrintWriter(out, false);
			printStackTrace(pw);
			pw.flush();
		}
	}
}

