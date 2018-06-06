

package org.apache.commons.math.exception;


public class MathUserException extends org.apache.commons.math.exception.MathRuntimeException {
	private static final long serialVersionUID = -6024911025449780478L;

	public MathUserException() {
		addMessage(org.apache.commons.math.exception.util.LocalizedFormats.USER_EXCEPTION);
	}

	public MathUserException(final java.lang.Throwable cause) {
		super(cause);
		addMessage(org.apache.commons.math.exception.util.LocalizedFormats.USER_EXCEPTION);
	}

	public MathUserException(final org.apache.commons.math.exception.util.Localizable pattern, final java.lang.Object... arguments) {
		addMessage(pattern, arguments);
	}

	public MathUserException(final java.lang.Throwable cause, final org.apache.commons.math.exception.util.Localizable pattern, final java.lang.Object... arguments) {
		super(cause);
		addMessage(pattern, arguments);
	}
}

