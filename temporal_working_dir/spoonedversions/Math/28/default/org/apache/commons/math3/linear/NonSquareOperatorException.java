

package org.apache.commons.math3.linear;


public class NonSquareOperatorException extends org.apache.commons.math3.exception.DimensionMismatchException {
	private static final long serialVersionUID = -4145007524150846242L;

	public NonSquareOperatorException(int wrong, int expected) {
		super(org.apache.commons.math3.exception.util.LocalizedFormats.NON_SQUARE_OPERATOR, wrong, expected);
	}
}

