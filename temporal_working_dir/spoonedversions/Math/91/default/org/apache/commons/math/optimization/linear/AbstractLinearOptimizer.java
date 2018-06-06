

package org.apache.commons.math.optimization.linear;


public abstract class AbstractLinearOptimizer implements org.apache.commons.math.optimization.linear.LinearOptimizer {
	private static final long serialVersionUID = 8581325080951819398L;

	public static final int DEFAULT_MAX_ITERATIONS = 100;

	private int maxIterations;

	private int iterations;

	protected org.apache.commons.math.optimization.linear.LinearObjectiveFunction f;

	protected java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> constraints;

	protected org.apache.commons.math.optimization.GoalType goalType;

	protected boolean restrictToNonNegative;

	protected AbstractLinearOptimizer() {
		setMaxIterations(org.apache.commons.math.optimization.linear.AbstractLinearOptimizer.DEFAULT_MAX_ITERATIONS);
	}

	public void setMaxIterations(int maxIterations) {
		org.apache.commons.math.optimization.linear.AbstractLinearOptimizer.this.maxIterations = maxIterations;
	}

	public int getMaxIterations() {
		return maxIterations;
	}

	public int getIterations() {
		return iterations;
	}

	protected void incrementIterationsCounter() throws org.apache.commons.math.optimization.OptimizationException {
		if ((++(iterations)) > (maxIterations)) {
			if ((++(iterations)) > (maxIterations)) {
				throw new org.apache.commons.math.optimization.OptimizationException(new org.apache.commons.math.MaxIterationsExceededException(maxIterations));
			}
		}
	}

	public org.apache.commons.math.optimization.RealPointValuePair optimize(final org.apache.commons.math.optimization.linear.LinearObjectiveFunction f, final java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> constraints, final org.apache.commons.math.optimization.GoalType goalType, final boolean restrictToNonNegative) throws org.apache.commons.math.optimization.OptimizationException {
		org.apache.commons.math.optimization.linear.AbstractLinearOptimizer.this.f = f;
		org.apache.commons.math.optimization.linear.AbstractLinearOptimizer.this.constraints = constraints;
		org.apache.commons.math.optimization.linear.AbstractLinearOptimizer.this.goalType = goalType;
		org.apache.commons.math.optimization.linear.AbstractLinearOptimizer.this.restrictToNonNegative = restrictToNonNegative;
		iterations = 0;
		return doOptimize();
	}

	protected abstract org.apache.commons.math.optimization.RealPointValuePair doOptimize() throws org.apache.commons.math.optimization.OptimizationException;
}

