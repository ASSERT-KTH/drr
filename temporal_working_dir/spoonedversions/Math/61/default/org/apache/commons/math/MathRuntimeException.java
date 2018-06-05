

package org.apache.commons.math;


public class MathRuntimeException extends java.lang.RuntimeException {
	private static final long serialVersionUID = 9058794795027570002L;

	private final org.apache.commons.math.exception.util.Localizable pattern;

	private final java.lang.Object[] arguments;

	@java.lang.Deprecated
	public MathRuntimeException(final java.lang.String pattern, final java.lang.Object... arguments) {
		this(new org.apache.commons.math.exception.util.DummyLocalizable(pattern), arguments);
	}

	public MathRuntimeException(final org.apache.commons.math.exception.util.Localizable pattern, final java.lang.Object... arguments) {
		this.pattern = pattern;
		this.arguments = (arguments == null) ? new java.lang.Object[0] : arguments.clone();
	}

	public MathRuntimeException(final java.lang.Throwable rootCause) {
		super(rootCause);
		this.pattern = org.apache.commons.math.exception.util.LocalizedFormats.SIMPLE_MESSAGE;
		this.arguments = new java.lang.Object[]{ rootCause == null ? "" : rootCause.getMessage() };
	}

	@java.lang.Deprecated
	public MathRuntimeException(final java.lang.Throwable rootCause, final java.lang.String pattern, final java.lang.Object... arguments) {
		this(rootCause, new org.apache.commons.math.exception.util.DummyLocalizable(pattern), arguments);
	}

	public MathRuntimeException(final java.lang.Throwable rootCause, final org.apache.commons.math.exception.util.Localizable pattern, final java.lang.Object... arguments) {
		super(rootCause);
		this.pattern = pattern;
		this.arguments = (arguments == null) ? new java.lang.Object[0] : arguments.clone();
	}

	private static java.lang.String buildMessage(final java.util.Locale locale, final org.apache.commons.math.exception.util.Localizable pattern, final java.lang.Object... arguments) {
		return new java.text.MessageFormat(pattern.getLocalizedString(locale), locale).format(arguments);
	}

	@java.lang.Deprecated
	public java.lang.String getPattern() {
		return pattern.getSourceString();
	}

	public org.apache.commons.math.exception.util.Localizable getLocalizablePattern() {
		return pattern;
	}

	public java.lang.Object[] getArguments() {
		return arguments.clone();
	}

	public java.lang.String getMessage(final java.util.Locale locale) {
		if ((pattern) != null) {
			return org.apache.commons.math.MathRuntimeException.buildMessage(locale, pattern, arguments);
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
	public void printStackTrace(final java.io.PrintStream out) {
		synchronized(out) {
			java.io.PrintWriter pw = new java.io.PrintWriter(out, false);
			printStackTrace(pw);
			pw.flush();
		}
	}

	@java.lang.Deprecated
	public static java.lang.ArithmeticException createArithmeticException(final java.lang.String pattern, final java.lang.Object... arguments) {
		return org.apache.commons.math.MathRuntimeException.createArithmeticException(new org.apache.commons.math.exception.util.DummyLocalizable(pattern), arguments);
	}

	public static java.lang.ArithmeticException createArithmeticException(final org.apache.commons.math.exception.util.Localizable pattern, final java.lang.Object... arguments) {
		return new java.lang.ArithmeticException() {
			private static final long serialVersionUID = 5305498554076846637L;

			@java.lang.Override
			public java.lang.String getMessage() {
				return org.apache.commons.math.MathRuntimeException.buildMessage(java.util.Locale.US, pattern, arguments);
			}

			@java.lang.Override
			public java.lang.String getLocalizedMessage() {
				return org.apache.commons.math.MathRuntimeException.buildMessage(java.util.Locale.getDefault(), pattern, arguments);
			}
		};
	}

	@java.lang.Deprecated
	public static java.lang.ArrayIndexOutOfBoundsException createArrayIndexOutOfBoundsException(final java.lang.String pattern, final java.lang.Object... arguments) {
		return org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(new org.apache.commons.math.exception.util.DummyLocalizable(pattern), arguments);
	}

	public static java.lang.ArrayIndexOutOfBoundsException createArrayIndexOutOfBoundsException(final org.apache.commons.math.exception.util.Localizable pattern, final java.lang.Object... arguments) {
		return new java.lang.ArrayIndexOutOfBoundsException() {
			private static final long serialVersionUID = 6718518191249632175L;

			@java.lang.Override
			public java.lang.String getMessage() {
				return org.apache.commons.math.MathRuntimeException.buildMessage(java.util.Locale.US, pattern, arguments);
			}

			@java.lang.Override
			public java.lang.String getLocalizedMessage() {
				return org.apache.commons.math.MathRuntimeException.buildMessage(java.util.Locale.getDefault(), pattern, arguments);
			}
		};
	}

	@java.lang.Deprecated
	public static java.io.EOFException createEOFException(final java.lang.String pattern, final java.lang.Object... arguments) {
		return org.apache.commons.math.MathRuntimeException.createEOFException(new org.apache.commons.math.exception.util.DummyLocalizable(pattern), arguments);
	}

	public static java.io.EOFException createEOFException(final org.apache.commons.math.exception.util.Localizable pattern, final java.lang.Object... arguments) {
		return new java.io.EOFException() {
			private static final long serialVersionUID = 6067985859347601503L;

			@java.lang.Override
			public java.lang.String getMessage() {
				return org.apache.commons.math.MathRuntimeException.buildMessage(java.util.Locale.US, pattern, arguments);
			}

			@java.lang.Override
			public java.lang.String getLocalizedMessage() {
				return org.apache.commons.math.MathRuntimeException.buildMessage(java.util.Locale.getDefault(), pattern, arguments);
			}
		};
	}

	public static java.io.IOException createIOException(final java.lang.Throwable rootCause) {
		java.io.IOException ioe = new java.io.IOException(rootCause.getLocalizedMessage());
		ioe.initCause(rootCause);
		return ioe;
	}

	@java.lang.Deprecated
	public static java.lang.IllegalArgumentException createIllegalArgumentException(final java.lang.String pattern, final java.lang.Object... arguments) {
		return org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(new org.apache.commons.math.exception.util.DummyLocalizable(pattern), arguments);
	}

	public static java.lang.IllegalArgumentException createIllegalArgumentException(final org.apache.commons.math.exception.util.Localizable pattern, final java.lang.Object... arguments) {
		return new java.lang.IllegalArgumentException() {
			private static final long serialVersionUID = -4284649691002411505L;

			@java.lang.Override
			public java.lang.String getMessage() {
				return org.apache.commons.math.MathRuntimeException.buildMessage(java.util.Locale.US, pattern, arguments);
			}

			@java.lang.Override
			public java.lang.String getLocalizedMessage() {
				return org.apache.commons.math.MathRuntimeException.buildMessage(java.util.Locale.getDefault(), pattern, arguments);
			}
		};
	}

	public static java.lang.IllegalArgumentException createIllegalArgumentException(final java.lang.Throwable rootCause) {
		java.lang.IllegalArgumentException iae = new java.lang.IllegalArgumentException(rootCause.getLocalizedMessage());
		iae.initCause(rootCause);
		return iae;
	}

	@java.lang.Deprecated
	public static java.lang.IllegalStateException createIllegalStateException(final java.lang.String pattern, final java.lang.Object... arguments) {
		return org.apache.commons.math.MathRuntimeException.createIllegalStateException(new org.apache.commons.math.exception.util.DummyLocalizable(pattern), arguments);
	}

	public static java.lang.IllegalStateException createIllegalStateException(final org.apache.commons.math.exception.util.Localizable pattern, final java.lang.Object... arguments) {
		return new java.lang.IllegalStateException() {
			private static final long serialVersionUID = 6880901520234515725L;

			@java.lang.Override
			public java.lang.String getMessage() {
				return org.apache.commons.math.MathRuntimeException.buildMessage(java.util.Locale.US, pattern, arguments);
			}

			@java.lang.Override
			public java.lang.String getLocalizedMessage() {
				return org.apache.commons.math.MathRuntimeException.buildMessage(java.util.Locale.getDefault(), pattern, arguments);
			}
		};
	}

	@java.lang.Deprecated
	public static java.util.ConcurrentModificationException createConcurrentModificationException(final java.lang.String pattern, final java.lang.Object... arguments) {
		return org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(new org.apache.commons.math.exception.util.DummyLocalizable(pattern), arguments);
	}

	public static java.util.ConcurrentModificationException createConcurrentModificationException(final org.apache.commons.math.exception.util.Localizable pattern, final java.lang.Object... arguments) {
		return new java.util.ConcurrentModificationException() {
			private static final long serialVersionUID = -1878427236170442052L;

			@java.lang.Override
			public java.lang.String getMessage() {
				return org.apache.commons.math.MathRuntimeException.buildMessage(java.util.Locale.US, pattern, arguments);
			}

			@java.lang.Override
			public java.lang.String getLocalizedMessage() {
				return org.apache.commons.math.MathRuntimeException.buildMessage(java.util.Locale.getDefault(), pattern, arguments);
			}
		};
	}

	@java.lang.Deprecated
	public static java.util.NoSuchElementException createNoSuchElementException(final java.lang.String pattern, final java.lang.Object... arguments) {
		return org.apache.commons.math.MathRuntimeException.createNoSuchElementException(new org.apache.commons.math.exception.util.DummyLocalizable(pattern), arguments);
	}

	public static java.util.NoSuchElementException createNoSuchElementException(final org.apache.commons.math.exception.util.Localizable pattern, final java.lang.Object... arguments) {
		return new java.util.NoSuchElementException() {
			private static final long serialVersionUID = 1632410088350355086L;

			@java.lang.Override
			public java.lang.String getMessage() {
				return org.apache.commons.math.MathRuntimeException.buildMessage(java.util.Locale.US, pattern, arguments);
			}

			@java.lang.Override
			public java.lang.String getLocalizedMessage() {
				return org.apache.commons.math.MathRuntimeException.buildMessage(java.util.Locale.getDefault(), pattern, arguments);
			}
		};
	}

	public static java.lang.UnsupportedOperationException createUnsupportedOperationException(final org.apache.commons.math.exception.util.Localizable pattern, final java.lang.Object... arguments) {
		return new java.lang.UnsupportedOperationException() {
			private static final long serialVersionUID = -4284649691002411505L;

			@java.lang.Override
			public java.lang.String getMessage() {
				return org.apache.commons.math.MathRuntimeException.buildMessage(java.util.Locale.US, pattern, arguments);
			}

			@java.lang.Override
			public java.lang.String getLocalizedMessage() {
				return org.apache.commons.math.MathRuntimeException.buildMessage(java.util.Locale.getDefault(), pattern, arguments);
			}
		};
	}

	@java.lang.Deprecated
	public static java.lang.NullPointerException createNullPointerException(final java.lang.String pattern, final java.lang.Object... arguments) {
		return org.apache.commons.math.MathRuntimeException.createNullPointerException(new org.apache.commons.math.exception.util.DummyLocalizable(pattern), arguments);
	}

	public static java.lang.NullPointerException createNullPointerException(final org.apache.commons.math.exception.util.Localizable pattern, final java.lang.Object... arguments) {
		return new java.lang.NullPointerException() {
			private static final long serialVersionUID = 451965530686593945L;

			@java.lang.Override
			public java.lang.String getMessage() {
				return org.apache.commons.math.MathRuntimeException.buildMessage(java.util.Locale.US, pattern, arguments);
			}

			@java.lang.Override
			public java.lang.String getLocalizedMessage() {
				return org.apache.commons.math.MathRuntimeException.buildMessage(java.util.Locale.getDefault(), pattern, arguments);
			}
		};
	}

	@java.lang.Deprecated
	public static java.text.ParseException createParseException(final int offset, final java.lang.String pattern, final java.lang.Object... arguments) {
		return org.apache.commons.math.MathRuntimeException.createParseException(offset, new org.apache.commons.math.exception.util.DummyLocalizable(pattern), arguments);
	}

	public static java.text.ParseException createParseException(final int offset, final org.apache.commons.math.exception.util.Localizable pattern, final java.lang.Object... arguments) {
		return new java.text.ParseException(null, offset) {
			private static final long serialVersionUID = 8153587599409010120L;

			@java.lang.Override
			public java.lang.String getMessage() {
				return org.apache.commons.math.MathRuntimeException.buildMessage(java.util.Locale.US, pattern, arguments);
			}

			@java.lang.Override
			public java.lang.String getLocalizedMessage() {
				return org.apache.commons.math.MathRuntimeException.buildMessage(java.util.Locale.getDefault(), pattern, arguments);
			}
		};
	}

	public static java.lang.RuntimeException createInternalError(final java.lang.Throwable cause) {
		final java.lang.String argument = "https://issues.apache.org/jira/browse/MATH";
		return new java.lang.RuntimeException(cause) {
			private static final long serialVersionUID = -201865440834027016L;

			@java.lang.Override
			public java.lang.String getMessage() {
				return org.apache.commons.math.MathRuntimeException.buildMessage(java.util.Locale.US, org.apache.commons.math.exception.util.LocalizedFormats.INTERNAL_ERROR, argument);
			}

			@java.lang.Override
			public java.lang.String getLocalizedMessage() {
				return org.apache.commons.math.MathRuntimeException.buildMessage(java.util.Locale.getDefault(), org.apache.commons.math.exception.util.LocalizedFormats.INTERNAL_ERROR, argument);
			}
		};
	}
}

