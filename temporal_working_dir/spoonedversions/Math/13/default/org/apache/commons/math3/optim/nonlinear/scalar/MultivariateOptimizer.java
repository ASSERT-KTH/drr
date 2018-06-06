

package org.apache.commons.math3.optim.nonlinear.scalar;


public abstract class MultivariateOptimizer extends org.apache.commons.math3.optim.BaseMultivariateOptimizer<org.apache.commons.math3.optim.PointValuePair> {
	private org.apache.commons.math3.analysis.MultivariateFunction function;

	private org.apache.commons.math3.optim.nonlinear.scalar.GoalType goal;

	protected MultivariateOptimizer(org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> checker) {
		super(checker);
	}

	@java.lang.Override
	public org.apache.commons.math3.optim.PointValuePair optimize(org.apache.commons.math3.optim.OptimizationData... optData) throws org.apache.commons.math3.exception.TooManyEvaluationsException {
		parseOptimizationData(optData);
		return super.optimize(optData);
	}

	private void parseOptimizationData(org.apache.commons.math3.optim.OptimizationData... optData) {
		for (org.apache.commons.math3.optim.OptimizationData data : optData) {
			if (data instanceof org.apache.commons.math3.optim.nonlinear.scalar.GoalType) {
				goal = ((org.apache.commons.math3.optim.nonlinear.scalar.GoalType) (data));
				continue;
			}
			if (data instanceof org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction) {
				function = ((org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction) (data)).getObjectiveFunction();
				continue;
			}
		}
	}

	public org.apache.commons.math3.optim.nonlinear.scalar.GoalType getGoalType() {
		return goal;
	}

	protected double computeObjectiveValue(double[] params) {
		super.incrementEvaluationCount();
		return function.value(params);
	}
}

