

package org.apache.commons.math.linear;


public class NonPositiveDefiniteMatrixException extends org.apache.commons.math.exception.MathIllegalArgumentException {
	private static final long serialVersionUID = 1641613838113738061L;

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

