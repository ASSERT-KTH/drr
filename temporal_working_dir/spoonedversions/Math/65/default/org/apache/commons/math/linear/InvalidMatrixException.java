

package org.apache.commons.math.linear;


public class InvalidMatrixException extends org.apache.commons.math.MathRuntimeException {
	private static final long serialVersionUID = -2068020346562029801L;

	public InvalidMatrixException(final java.lang.String pattern, final java.lang.Object... arguments) {
		this(new org.apache.commons.math.exception.DummyLocalizable(pattern), arguments);
	}

	public InvalidMatrixException(final org.apache.commons.math.exception.Localizable pattern, final java.lang.Object... arguments) {
		super(pattern, arguments);
	}

	public InvalidMatrixException(final java.lang.Throwable cause) {
		super(cause);
	}
}

