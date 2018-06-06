

package org.apache.commons.math.exception;


public class MultiDimensionMismatchException extends org.apache.commons.math.exception.MathIllegalArgumentException {
	private static final long serialVersionUID = -8415396756375798143L;

	private final java.lang.Integer[] wrong;

	private final java.lang.Integer[] expected;

	public MultiDimensionMismatchException(java.lang.Integer[] wrong, java.lang.Integer[] expected) {
		this(null, wrong, expected);
	}

	public MultiDimensionMismatchException(org.apache.commons.math.exception.util.Localizable specific, java.lang.Integer[] wrong, java.lang.Integer[] expected) {
		super(specific, org.apache.commons.math.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH, wrong, expected);
		this.wrong = wrong.clone();
		this.expected = expected.clone();
	}

	public java.lang.Integer[] getWrongDimensions() {
		return wrong;
	}

	public java.lang.Integer[] getExpectedDimensions() {
		return expected;
	}
}

