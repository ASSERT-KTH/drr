

package org.apache.commons.math;


@java.lang.Deprecated
public class MaxIterationsExceededException extends org.apache.commons.math.ConvergenceException {
	private static final long serialVersionUID = -7821226672760574694L;

	private final int maxIterations;

	public MaxIterationsExceededException(final int maxIterations) {
		super(org.apache.commons.math.exception.util.LocalizedFormats.MAX_ITERATIONS_EXCEEDED, maxIterations);
		this.maxIterations = maxIterations;
	}

	@java.lang.Deprecated
	public MaxIterationsExceededException(final int maxIterations, final java.lang.String pattern, final java.lang.Object... arguments) {
		this(maxIterations, new org.apache.commons.math.exception.util.DummyLocalizable(pattern), arguments);
	}

	public MaxIterationsExceededException(final int maxIterations, final org.apache.commons.math.exception.util.Localizable pattern, final java.lang.Object... arguments) {
		super(pattern, arguments);
		this.maxIterations = maxIterations;
	}

	public int getMaxIterations() {
		return maxIterations;
	}
}

