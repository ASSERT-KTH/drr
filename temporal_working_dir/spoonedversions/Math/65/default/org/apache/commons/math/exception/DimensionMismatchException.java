

package org.apache.commons.math.exception;


public class DimensionMismatchException extends org.apache.commons.math.exception.MathIllegalNumberException {
	private static final long serialVersionUID = -8415396756375798143L;

	private final int dimension;

	public DimensionMismatchException(int wrong, int expected) {
		super(org.apache.commons.math.exception.LocalizedFormats.DIMENSIONS_MISMATCH_SIMPLE, wrong, expected);
		dimension = expected;
	}

	public int getDimension() {
		return dimension;
	}
}

