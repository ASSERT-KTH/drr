

package org.apache.commons.math.exception;


public class MathIllegalStateException extends org.apache.commons.math.exception.MathRuntimeException {
	private static final long serialVersionUID = -6024911025449780478L;

	public MathIllegalStateException(org.apache.commons.math.exception.util.Localizable specific, org.apache.commons.math.exception.util.Localizable general, java.lang.Object... args) {
		super(null, specific, general, args);
	}

	public MathIllegalStateException(org.apache.commons.math.exception.util.Localizable specific, java.lang.Object... args) {
		this(specific, org.apache.commons.math.exception.util.LocalizedFormats.ILLEGAL_STATE, args);
	}

	public MathIllegalStateException(java.lang.Object... args) {
		this(null, args);
	}
}

