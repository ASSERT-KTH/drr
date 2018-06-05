

package org.apache.commons.math.optimization;


public interface DifferentiableMultivariateRealOptimizer extends java.io.Serializable {
	void setMaxIterations(int maxIterations);

	int getMaxIterations();

	int getIterations();

	int getEvaluations();

	int getGradientEvaluations();

	void setConvergenceChecker(org.apache.commons.math.optimization.RealConvergenceChecker checker);

	org.apache.commons.math.optimization.RealConvergenceChecker getConvergenceChecker();

	org.apache.commons.math.optimization.RealPointValuePair optimize(org.apache.commons.math.analysis.DifferentiableMultivariateRealFunction f, org.apache.commons.math.optimization.GoalType goalType, double[] startPoint) throws java.lang.IllegalArgumentException, org.apache.commons.math.FunctionEvaluationException, org.apache.commons.math.optimization.OptimizationException;
}

