

package org.apache.commons.math3.linear;


public class NonSquareMatrixException extends org.apache.commons.math3.exception.DimensionMismatchException {
	private static final long serialVersionUID = -660069396594485772L;

	public NonSquareMatrixException(int wrong, int expected) {
		super(org.apache.commons.math3.exception.util.LocalizedFormats.NON_SQUARE_MATRIX, wrong, expected);
	}
}

