

package org.apache.commons.math.linear;


public class NonSquareMatrixException extends org.apache.commons.math.linear.InvalidMatrixException {
	private static final long serialVersionUID = 8996207526636673730L;

	public NonSquareMatrixException(final int rows, final int columns) {
		super(org.apache.commons.math.util.LocalizedFormats.NON_SQUARE_MATRIX, rows, columns);
	}
}

