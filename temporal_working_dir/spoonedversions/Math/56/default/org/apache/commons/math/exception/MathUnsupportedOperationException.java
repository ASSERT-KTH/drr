

package org.apache.commons.math.exception;


public class MathUnsupportedOperationException extends org.apache.commons.math.exception.MathRuntimeException {
	private static final long serialVersionUID = -6024911025449780478L;

	public MathUnsupportedOperationException() {
		this(org.apache.commons.math.exception.util.LocalizedFormats.UNSUPPORTED_OPERATION);
	}

	public MathUnsupportedOperationException(org.apache.commons.math.exception.util.Localizable pattern, java.lang.Object... args) {
		addMessage(pattern, args);
	}
}

