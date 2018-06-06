

package org.apache.commons.math.exception;


public class MathArithmeticException extends org.apache.commons.math.exception.MathRuntimeException {
	private static final long serialVersionUID = -6024911025449780478L;

	public MathArithmeticException() {
		addMessage(org.apache.commons.math.exception.util.LocalizedFormats.ARITHMETIC_EXCEPTION);
	}

	public MathArithmeticException(org.apache.commons.math.exception.util.Localizable pattern, java.lang.Object... args) {
		addMessage(pattern, args);
	}
}

