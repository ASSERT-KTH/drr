

package org.apache.commons.math3.exception;


public class MultiDimensionMismatchException extends org.apache.commons.math3.exception.MathIllegalArgumentException {
	private static final long serialVersionUID = -8415396756375798143L;

	private final java.lang.Integer[] wrong;

	private final java.lang.Integer[] expected;

	public MultiDimensionMismatchException(java.lang.Integer[] wrong, java.lang.Integer[] expected) {
		this(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH, wrong, expected);
	}

	public MultiDimensionMismatchException(org.apache.commons.math3.exception.util.Localizable specific, java.lang.Integer[] wrong, java.lang.Integer[] expected) {
		super(specific, wrong, expected);
		this.wrong = wrong.clone();
		this.expected = expected.clone();
	}

	public java.lang.Integer[] getWrongDimensions() {
		return wrong.clone();
	}

	public java.lang.Integer[] getExpectedDimensions() {
		return expected.clone();
	}

	public int getWrongDimension(int index) {
		return wrong[index];
	}

	public int getExpectedDimension(int index) {
		return expected[index];
	}
}

