

package org.apache.commons.math.exception;


public class NoDataException extends org.apache.commons.math.exception.MathIllegalArgumentException {
	private static final long serialVersionUID = -3629324471511904459L;

	public NoDataException() {
		this(null);
	}

	public NoDataException(org.apache.commons.math.exception.Localizable specific) {
		super(specific, org.apache.commons.math.exception.LocalizedFormats.NO_DATA, ((java.lang.Object[]) (null)));
	}
}

