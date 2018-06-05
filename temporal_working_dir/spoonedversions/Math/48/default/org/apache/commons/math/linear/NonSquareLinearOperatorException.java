

package org.apache.commons.math.linear;


public class NonSquareLinearOperatorException extends org.apache.commons.math.exception.DimensionMismatchException {
	private static final long serialVersionUID = -660069396594485772L;

	public NonSquareLinearOperatorException(int wrong, int expected) {
		super(org.apache.commons.math.exception.util.LocalizedFormats.NON_SQUARE_LINEAR_OPERATOR, wrong, expected);
	}
}

