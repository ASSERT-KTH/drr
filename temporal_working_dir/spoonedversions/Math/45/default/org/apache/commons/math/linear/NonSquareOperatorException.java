

package org.apache.commons.math.linear;


public class NonSquareOperatorException extends org.apache.commons.math.exception.DimensionMismatchException {
	private static final long serialVersionUID = -4145007524150846242L;

	public NonSquareOperatorException(int wrong, int expected) {
		super(org.apache.commons.math.exception.util.LocalizedFormats.NON_SQUARE_OPERATOR, wrong, expected);
	}
}

