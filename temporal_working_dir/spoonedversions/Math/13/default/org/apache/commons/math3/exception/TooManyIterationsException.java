

package org.apache.commons.math3.exception;


public class TooManyIterationsException extends org.apache.commons.math3.exception.MaxCountExceededException {
	private static final long serialVersionUID = 20121211L;

	public TooManyIterationsException(java.lang.Number max) {
		super(max);
		getContext().addMessage(org.apache.commons.math3.exception.util.LocalizedFormats.ITERATIONS);
	}
}

