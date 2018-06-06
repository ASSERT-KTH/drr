

package org.apache.commons.math3.exception;


public class NullArgumentException extends org.apache.commons.math3.exception.MathIllegalArgumentException {
	private static final long serialVersionUID = -6024911025449780478L;

	public NullArgumentException() {
		this(org.apache.commons.math3.exception.util.LocalizedFormats.NULL_NOT_ALLOWED);
	}

	public NullArgumentException(org.apache.commons.math3.exception.util.Localizable pattern, java.lang.Object... arguments) {
		super(pattern, arguments);
	}
}

