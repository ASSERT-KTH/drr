

package org.apache.commons.math.exception;


public class NonSquareMatrixException extends org.apache.commons.math.exception.DimensionMismatchException {
	public NonSquareMatrixException(int wrong, int expected) {
		super(org.apache.commons.math.exception.util.LocalizedFormats.NON_SQUARE_MATRIX, wrong, expected);
	}
}

