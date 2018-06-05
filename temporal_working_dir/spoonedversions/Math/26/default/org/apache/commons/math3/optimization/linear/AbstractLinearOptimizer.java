

package org.apache.commons.math3.optimization.linear;


public abstract class AbstractLinearOptimizer implements org.apache.commons.math3.optimization.linear.LinearOptimizer {
	public static final int DEFAULT_MAX_ITERATIONS = 100;

	private org.apache.commons.math3.optimization.linear.LinearObjectiveFunction function;

	private java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint> linearConstraints;

	private org.apache.commons.math3.optimization.GoalType goal;

	private boolean nonNegative;

	private int maxIterations;

	private int iterations;

	protected AbstractLinearOptimizer() {
		setMaxIterations(org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer.DEFAULT_MAX_ITERATIONS);
	}

	protected boolean restrictToNonNegative() {
		return nonNegative;
	}

	protected org.apache.commons.math3.optimization.GoalType getGoalType() {
		return goal;
	}

	protected org.apache.commons.math3.optimization.linear.LinearObjectiveFunction getFunction() {
		return function;
	}

	protected java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint> getConstraints() {
		return java.util.Collections.unmodifiableCollection(linearConstraints);
	}

	public void setMaxIterations(int maxIterations) {
		org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer.this.maxIterations = maxIterations;
	}

	public int getMaxIterations() {
		return maxIterations;
	}

	public int getIterations() {
		return iterations;
	}

	protected void incrementIterationsCounter() throws org.apache.commons.math3.exception.MaxCountExceededException {
		if ((++(iterations)) > (maxIterations)) {
			throw new org.apache.commons.math3.exception.MaxCountExceededException(maxIterations);
		}
	}

	public org.apache.commons.math3.optimization.PointValuePair optimize(final org.apache.commons.math3.optimization.linear.LinearObjectiveFunction f, final java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint> constraints, final org.apache.commons.math3.optimization.GoalType goalType, final boolean restrictToNonNegative) throws org.apache.commons.math3.exception.MathIllegalStateException {
		org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer.this.function = f;
		org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer.this.linearConstraints = constraints;
		org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer.this.goal = goalType;
		org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer.this.nonNegative = restrictToNonNegative;
		iterations = 0;
		return doOptimize();
	}

	protected abstract org.apache.commons.math3.optimization.PointValuePair doOptimize() throws org.apache.commons.math3.exception.MathIllegalStateException;
}

