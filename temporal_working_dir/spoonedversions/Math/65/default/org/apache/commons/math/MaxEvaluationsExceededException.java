

package org.apache.commons.math;


public class MaxEvaluationsExceededException extends org.apache.commons.math.ConvergenceException {
	private static final long serialVersionUID = -5921271447220129118L;

	private final int maxEvaluations;

	public MaxEvaluationsExceededException(final int maxEvaluations) {
		super(org.apache.commons.math.exception.LocalizedFormats.MAX_EVALUATIONS_EXCEEDED, maxEvaluations);
		this.maxEvaluations = maxEvaluations;
	}

	@java.lang.Deprecated
	public MaxEvaluationsExceededException(final int maxEvaluations, final java.lang.String pattern, final java.lang.Object... arguments) {
		this(maxEvaluations, new org.apache.commons.math.exception.DummyLocalizable(pattern), arguments);
	}

	public MaxEvaluationsExceededException(final int maxEvaluations, final org.apache.commons.math.exception.Localizable pattern, final java.lang.Object... arguments) {
		super(pattern, arguments);
		this.maxEvaluations = maxEvaluations;
	}

	public int getMaxEvaluations() {
		return maxEvaluations;
	}
}

