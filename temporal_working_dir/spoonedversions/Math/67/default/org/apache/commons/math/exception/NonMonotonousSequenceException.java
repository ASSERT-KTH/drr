

package org.apache.commons.math.exception;


public class NonMonotonousSequenceException extends org.apache.commons.math.exception.MathIllegalNumberException {
	private final org.apache.commons.math.util.MathUtils.Order.Direction direction;

	private final boolean strict;

	private final int index;

	private final java.lang.Number previous;

	public NonMonotonousSequenceException(java.lang.Number wrong, java.lang.Number previous, int index) {
		this(wrong, previous, index, org.apache.commons.math.util.MathUtils.Order.Direction.INCREASING, true);
	}

	public NonMonotonousSequenceException(java.lang.Number wrong, java.lang.Number previous, int index, org.apache.commons.math.util.MathUtils.Order.Direction direction, boolean strict) {
		super((direction == (org.apache.commons.math.util.MathUtils.Order.Direction.INCREASING) ? strict ? org.apache.commons.math.util.LocalizedFormats.NOT_STRICTLY_INCREASING_SEQUENCE : org.apache.commons.math.util.LocalizedFormats.NOT_INCREASING_SEQUENCE : strict ? org.apache.commons.math.util.LocalizedFormats.NOT_STRICTLY_DECREASING_SEQUENCE : org.apache.commons.math.util.LocalizedFormats.NOT_DECREASING_SEQUENCE), wrong, previous, index, (index - 1));
		this.direction = direction;
		this.strict = strict;
		this.index = index;
		this.previous = previous;
	}

	public org.apache.commons.math.util.MathUtils.Order.Direction getDirection() {
		return direction;
	}

	public boolean getStrict() {
		return strict;
	}

	public int getIndex() {
		return index;
	}

	public java.lang.Number getPrevious() {
		return previous;
	}
}

