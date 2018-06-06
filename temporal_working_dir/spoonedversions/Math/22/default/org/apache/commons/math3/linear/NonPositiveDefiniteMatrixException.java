

package org.apache.commons.math3.linear;


public class NonPositiveDefiniteMatrixException extends org.apache.commons.math3.exception.NumberIsTooSmallException {
	private static final long serialVersionUID = 1641613838113738061L;

	private final int index;

	private final double threshold;

	public NonPositiveDefiniteMatrixException(double wrong, int index, double threshold) {
		super(wrong, threshold, false);
		this.index = index;
		this.threshold = threshold;
		final org.apache.commons.math3.exception.util.ExceptionContext context = getContext();
		context.addMessage(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_DEFINITE_MATRIX);
		context.addMessage(org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_ELEMENT, wrong, index);
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

