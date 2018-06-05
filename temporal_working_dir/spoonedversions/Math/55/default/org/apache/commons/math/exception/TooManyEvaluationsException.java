

package org.apache.commons.math.exception;


public class TooManyEvaluationsException extends org.apache.commons.math.exception.MaxCountExceededException {
	private static final long serialVersionUID = 4330003017885151975L;

	public TooManyEvaluationsException(java.lang.Number max) {
		super(org.apache.commons.math.exception.util.LocalizedFormats.EVALUATIONS, max);
	}
}

