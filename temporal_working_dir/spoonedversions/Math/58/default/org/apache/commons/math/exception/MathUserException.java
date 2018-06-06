

package org.apache.commons.math.exception;


public class MathUserException extends org.apache.commons.math.exception.MathRuntimeException {
	private static final long serialVersionUID = -6024911025449780478L;

	public MathUserException() {
		this(((java.lang.Throwable) (null)));
	}

	public MathUserException(final java.lang.Throwable cause) {
		this(cause, org.apache.commons.math.exception.util.LocalizedFormats.USER_EXCEPTION);
	}

	public MathUserException(final org.apache.commons.math.exception.util.Localizable pattern, final java.lang.Object... arguments) {
		this(((java.lang.Throwable) (null)), pattern, arguments);
	}

	public MathUserException(final java.lang.Throwable cause, final org.apache.commons.math.exception.util.Localizable pattern, final java.lang.Object... arguments) {
		this(cause, ((org.apache.commons.math.exception.util.Localizable) (null)), pattern, arguments);
	}

	public MathUserException(final org.apache.commons.math.exception.util.Localizable specific, final org.apache.commons.math.exception.util.Localizable general, final java.lang.Object... arguments) {
		this(((java.lang.Throwable) (null)), specific, general, arguments);
	}

	public MathUserException(final java.lang.Throwable cause, final org.apache.commons.math.exception.util.Localizable specific, final org.apache.commons.math.exception.util.Localizable general, final java.lang.Object... arguments) {
		super(cause, specific, general, arguments);
	}
}

