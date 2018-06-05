

package org.apache.commons.math.exception;


public class MathUnsupportedOperationException extends org.apache.commons.math.exception.MathRuntimeException {
	private static final long serialVersionUID = -6024911025449780478L;

	public MathUnsupportedOperationException(java.lang.Object... args) {
		this(null, args);
	}

	public MathUnsupportedOperationException(org.apache.commons.math.exception.util.Localizable specific, java.lang.Object... args) {
		super(null, specific, org.apache.commons.math.exception.util.LocalizedFormats.UNSUPPORTED_OPERATION, args);
	}
}

