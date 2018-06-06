

package org.apache.commons.math;


public class MaxIterationsExceededException extends org.apache.commons.math.ConvergenceException {
	private static final long serialVersionUID = -2154780004193976271L;

	private int maxIterations;

	public MaxIterationsExceededException(int maxIterations) {
		super("Maximal number of iterations ({0}) exceeded", new java.lang.Object[]{ java.lang.Integer.valueOf(maxIterations) });
		org.apache.commons.math.MaxIterationsExceededException.this.maxIterations = maxIterations;
	}

	public MaxIterationsExceededException(int maxIterations, java.lang.String pattern, java.lang.Object[] arguments) {
		super(pattern, arguments);
		org.apache.commons.math.MaxIterationsExceededException.this.maxIterations = maxIterations;
	}

	public int getMaxIterations() {
		return maxIterations;
	}
}

