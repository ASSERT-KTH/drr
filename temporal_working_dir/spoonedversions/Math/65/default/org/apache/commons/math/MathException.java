

package org.apache.commons.math;


public class MathException extends java.lang.Exception {
	private static final long serialVersionUID = 7428019509644517071L;

	private final org.apache.commons.math.exception.Localizable pattern;

	private final java.lang.Object[] arguments;

	public MathException() {
		this.pattern = org.apache.commons.math.exception.LocalizedFormats.SIMPLE_MESSAGE;
		this.arguments = new java.lang.Object[]{ "" };
	}

	@java.lang.Deprecated
	public MathException(java.lang.String pattern, java.lang.Object... arguments) {
		this(new org.apache.commons.math.exception.DummyLocalizable(pattern), arguments);
	}

	public MathException(org.apache.commons.math.exception.Localizable pattern, java.lang.Object... arguments) {
		this.pattern = pattern;
		this.arguments = (arguments == null) ? new java.lang.Object[0] : arguments.clone();
	}

	public MathException(java.lang.Throwable rootCause) {
		super(rootCause);
		this.pattern = org.apache.commons.math.exception.LocalizedFormats.SIMPLE_MESSAGE;
		this.arguments = new java.lang.Object[]{ rootCause == null ? "" : rootCause.getMessage() };
	}

	@java.lang.Deprecated
	public MathException(java.lang.Throwable rootCause, java.lang.String pattern, java.lang.Object... arguments) {
		this(rootCause, new org.apache.commons.math.exception.DummyLocalizable(pattern), arguments);
	}

	public MathException(java.lang.Throwable rootCause, org.apache.commons.math.exception.Localizable pattern, java.lang.Object... arguments) {
		super(rootCause);
		this.pattern = pattern;
		this.arguments = (arguments == null) ? new java.lang.Object[0] : arguments.clone();
	}

	@java.lang.Deprecated
	public java.lang.String getPattern() {
		return pattern.getSourceString();
	}

	public org.apache.commons.math.exception.Localizable getLocalizablePattern() {
		return pattern;
	}

	public java.lang.Object[] getArguments() {
		return arguments.clone();
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

