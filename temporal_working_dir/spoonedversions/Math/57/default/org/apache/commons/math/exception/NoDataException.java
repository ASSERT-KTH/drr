

package org.apache.commons.math.exception;


public class NoDataException extends org.apache.commons.math.exception.MathIllegalArgumentException {
	private static final long serialVersionUID = -3629324471511904459L;

	public NoDataException() {
		this(org.apache.commons.math.exception.util.LocalizedFormats.NO_DATA);
	}

	public NoDataException(org.apache.commons.math.exception.util.Localizable specific) {
		super(specific, null);
	}
}

