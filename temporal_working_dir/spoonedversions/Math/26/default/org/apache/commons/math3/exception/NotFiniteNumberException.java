

package org.apache.commons.math3.exception;


public class NotFiniteNumberException extends org.apache.commons.math3.exception.MathIllegalNumberException {
	private static final long serialVersionUID = -6100997100383932834L;

	public NotFiniteNumberException(java.lang.Number wrong, java.lang.Object... args) {
		this(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_FINITE_NUMBER, wrong, args);
	}

	public NotFiniteNumberException(org.apache.commons.math3.exception.util.Localizable specific, java.lang.Number wrong, java.lang.Object... args) {
		super(specific, wrong, args);
	}
}

