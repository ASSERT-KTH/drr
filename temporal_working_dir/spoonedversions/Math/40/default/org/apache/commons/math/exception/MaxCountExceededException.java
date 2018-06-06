

package org.apache.commons.math.exception;


public class MaxCountExceededException extends org.apache.commons.math.exception.MathIllegalStateException {
	private static final long serialVersionUID = 4330003017885151975L;

	private final java.lang.Number max;

	public MaxCountExceededException(java.lang.Number max) {
		this(org.apache.commons.math.exception.util.LocalizedFormats.MAX_COUNT_EXCEEDED, max);
	}

	public MaxCountExceededException(org.apache.commons.math.exception.util.Localizable specific, java.lang.Number max, java.lang.Object... args) {
		getContext().addMessage(specific, max, args);
		this.max = max;
	}

	public java.lang.Number getMax() {
		return max;
	}
}

