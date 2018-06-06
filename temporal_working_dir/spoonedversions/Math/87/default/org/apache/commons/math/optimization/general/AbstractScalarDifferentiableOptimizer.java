

package org.apache.commons.math.optimization.general;


public abstract class AbstractScalarDifferentiableOptimizer implements org.apache.commons.math.optimization.DifferentiableMultivariateRealOptimizer {
	public static final int DEFAULT_MAX_ITERATIONS = 100;

	private static final long serialVersionUID = 1357126012308766636L;

	private int maxIterations;

	private int iterations;

	private int evaluations;

	private int gradientEvaluations;

	protected org.apache.commons.math.optimization.RealConvergenceChecker checker;

	private org.apache.commons.math.analysis.DifferentiableMultivariateRealFunction f;

	private org.apache.commons.math.analysis.MultivariateVectorialFunction gradient;

	protected org.apache.commons.math.optimization.GoalType goalType;

	protected double[] point;

	protected AbstractScalarDifferentiableOptimizer() {
		setConvergenceChecker(new org.apache.commons.math.optimization.SimpleScalarValueChecker());
		setMaxIterations(org.apache.commons.math.optimization.general.AbstractScalarDifferentiableOptimizer.DEFAULT_MAX_ITERATIONS);
	}

	public void setMaxIterations(int maxIterations) {
		org.apache.commons.math.optimization.general.AbstractScalarDifferentiableOptimizer.this.maxIterations = maxIterations;
	}

	public int getMaxIterations() {
		return maxIterations;
	}

	public int getIterations() {
		return iterations;
	}

	public int getEvaluations() {
		return evaluations;
	}

	public int getGradientEvaluations() {
		return gradientEvaluations;
	}

	public void setConvergenceChecker(org.apache.commons.math.optimization.RealConvergenceChecker checker) {
		org.apache.commons.math.optimization.general.AbstractScalarDifferentiableOptimizer.this.checker = checker;
	}

	public org.apache.commons.math.optimization.RealConvergenceChecker getConvergenceChecker() {
		return checker;
	}

	protected void incrementIterationsCounter() throws org.apache.commons.math.optimization.OptimizationException {
		if ((++(iterations)) > (maxIterations)) {
			if ((++(iterations)) > (maxIterations)) {
				throw new org.apache.commons.math.optimization.OptimizationException(new org.apache.commons.math.MaxIterationsExceededException(maxIterations));
			}
		}
	}

	protected double[] computeObjectiveGradient(final double[] point) throws org.apache.commons.math.FunctionEvaluationException {
		++(gradientEvaluations);
		return gradient.value(point);
	}

	protected double computeObjectiveValue(final double[] point) throws org.apache.commons.math.FunctionEvaluationException {
		++(evaluations);
		return f.value(point);
	}

	public org.apache.commons.math.optimization.RealPointValuePair optimize(final org.apache.commons.math.analysis.DifferentiableMultivariateRealFunction f, final org.apache.commons.math.optimization.GoalType goalType, final double[] startPoint) throws java.lang.IllegalArgumentException, org.apache.commons.math.FunctionEvaluationException, org.apache.commons.math.optimization.OptimizationException {
		iterations = 0;
		evaluations = 0;
		gradientEvaluations = 0;
		org.apache.commons.math.optimization.general.AbstractScalarDifferentiableOptimizer.this.f = f;
		gradient = f.gradient();
		org.apache.commons.math.optimization.general.AbstractScalarDifferentiableOptimizer.this.goalType = goalType;
		point = startPoint.clone();
		return doOptimize();
	}

	protected abstract org.apache.commons.math.optimization.RealPointValuePair doOptimize() throws java.lang.IllegalArgumentException, org.apache.commons.math.FunctionEvaluationException, org.apache.commons.math.optimization.OptimizationException;
}

