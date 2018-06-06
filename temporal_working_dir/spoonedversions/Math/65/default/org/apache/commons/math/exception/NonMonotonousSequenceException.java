

package org.apache.commons.math.exception;


public class NonMonotonousSequenceException extends org.apache.commons.math.exception.MathIllegalNumberException {
	private static final long serialVersionUID = 3596849179428944575L;

	private final org.apache.commons.math.util.MathUtils.OrderDirection direction;

	private final boolean strict;

	private final int index;

	private final java.lang.Number previous;

	public NonMonotonousSequenceException(java.lang.Number wrong, java.lang.Number previous, int index) {
		this(wrong, previous, index, org.apache.commons.math.util.MathUtils.OrderDirection.INCREASING, true);
	}

	public NonMonotonousSequenceException(java.lang.Number wrong, java.lang.Number previous, int index, org.apache.commons.math.util.MathUtils.OrderDirection direction, boolean strict) {
		super((direction == (org.apache.commons.math.util.MathUtils.OrderDirection.INCREASING) ? strict ? org.apache.commons.math.exception.LocalizedFormats.NOT_STRICTLY_INCREASING_SEQUENCE : org.apache.commons.math.exception.LocalizedFormats.NOT_INCREASING_SEQUENCE : strict ? org.apache.commons.math.exception.LocalizedFormats.NOT_STRICTLY_DECREASING_SEQUENCE : org.apache.commons.math.exception.LocalizedFormats.NOT_DECREASING_SEQUENCE), wrong, previous, index, (index - 1));
		this.direction = direction;
		this.strict = strict;
		this.index = index;
		this.previous = previous;
	}

	public org.apache.commons.math.util.MathUtils.OrderDirection getDirection() {
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

