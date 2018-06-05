

package org.apache.commons.math3.exception;


public class DimensionMismatchException extends org.apache.commons.math3.exception.MathIllegalNumberException {
	private static final long serialVersionUID = -8415396756375798143L;

	private final int dimension;

	public DimensionMismatchException(org.apache.commons.math3.exception.util.Localizable specific, int wrong, int expected) {
		super(specific, wrong, expected);
		dimension = expected;
	}

	public DimensionMismatchException(int wrong, int expected) {
		this(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_SIMPLE, wrong, expected);
	}

	public int getDimension() {
		return dimension;
	}
}

