

package org.apache.commons.math.exception;


public class NonPositiveDefiniteMatrixException extends org.apache.commons.math.exception.MathIllegalArgumentException {
	private final int index;

	private final double threshold;

	public NonPositiveDefiniteMatrixException(int index, double threshold) {
		super(org.apache.commons.math.exception.util.LocalizedFormats.NON_POSITIVE_DEFINITE_MATRIX, index, threshold);
		this.index = index;
		this.threshold = threshold;
	}

	public int getRow() {
		return index;
	}

	public int getColumn() {
		return index;
	}

	public double getThreshold() {
		return threshold;
	}
}

