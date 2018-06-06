

package org.apache.commons.math.exception;


public class NullArgumentException extends org.apache.commons.math.exception.MathIllegalArgumentException {
	private static final long serialVersionUID = -6024911025449780478L;

	public NullArgumentException() {
		super(org.apache.commons.math.exception.util.LocalizedFormats.NULL_NOT_ALLOWED);
	}

	public NullArgumentException(org.apache.commons.math.exception.util.Localizable specific) {
		super(specific, org.apache.commons.math.exception.util.LocalizedFormats.NULL_NOT_ALLOWED);
	}
}

