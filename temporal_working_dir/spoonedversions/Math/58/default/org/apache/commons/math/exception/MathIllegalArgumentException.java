

package org.apache.commons.math.exception;


public class MathIllegalArgumentException extends org.apache.commons.math.exception.MathRuntimeException {
	private static final long serialVersionUID = -6024911025449780478L;

	public MathIllegalArgumentException(org.apache.commons.math.exception.util.Localizable specific, org.apache.commons.math.exception.util.Localizable general, java.lang.Object... args) {
		super(null, specific, general, args);
	}

	public MathIllegalArgumentException(org.apache.commons.math.exception.util.Localizable general, java.lang.Object... args) {
		this(null, general, args);
	}
}

