

package org.apache.commons.math.exception;


public class NoDataException extends org.apache.commons.math.exception.MathIllegalArgumentException {
	public NoDataException() {
		this(null);
	}

	public NoDataException(org.apache.commons.math.util.Localizable specific) {
		super(specific, org.apache.commons.math.util.LocalizedFormats.NO_DATA, null);
	}
}

