

package org.apache.commons.math.exception;


public class MathIllegalStateException extends org.apache.commons.math.exception.MathRuntimeException {
	private static final long serialVersionUID = -6024911025449780478L;

	public MathIllegalStateException(org.apache.commons.math.exception.util.Localizable pattern, java.lang.Object... args) {
		addMessage(pattern, args);
	}

	public MathIllegalStateException(java.lang.Throwable cause, org.apache.commons.math.exception.util.Localizable pattern, java.lang.Object... args) {
		super(cause);
		addMessage(pattern, args);
	}

	public MathIllegalStateException() {
		addMessage(org.apache.commons.math.exception.util.LocalizedFormats.ILLEGAL_STATE);
	}
}

