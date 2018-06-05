

package org.apache.commons.math.exception;


public class DimensionMismatchException extends org.apache.commons.math.exception.MathIllegalNumberException {
	private final int dimension;

	public DimensionMismatchException(int wrong, int expected) {
		super(org.apache.commons.math.util.LocalizedFormats.DIMENSIONS_MISMATCH_SIMPLE, wrong, expected);
		dimension = expected;
	}

	public int getDimension() {
		return dimension;
	}
}

