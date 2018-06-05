

package org.apache.commons.math.linear;


public class NonSymmetricMatrixException extends org.apache.commons.math.exception.MathIllegalArgumentException {
	private static final long serialVersionUID = -7518495577824189882L;

	private final int row;

	private final int column;

	private final double threshold;

	public NonSymmetricMatrixException(int row, int column, double threshold) {
		super(org.apache.commons.math.exception.util.LocalizedFormats.NON_SYMMETRIC_MATRIX, row, column, threshold);
		this.row = row;
		this.column = column;
		this.threshold = threshold;
	}

	public int getRow() {
		return row;
	}

	public int getColumn() {
		return column;
	}

	public double getThreshold() {
		return threshold;
	}
}

