

package org.apache.commons.math3.exception;


public class NoDataException extends org.apache.commons.math3.exception.MathIllegalArgumentException {
	private static final long serialVersionUID = -3629324471511904459L;

	public NoDataException() {
		this(org.apache.commons.math3.exception.util.LocalizedFormats.NO_DATA);
	}

	public NoDataException(org.apache.commons.math3.exception.util.Localizable specific) {
		super(specific);
	}
}

