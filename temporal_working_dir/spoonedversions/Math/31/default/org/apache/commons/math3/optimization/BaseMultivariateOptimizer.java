

package org.apache.commons.math3.optimization;


public interface BaseMultivariateOptimizer<FUNC extends org.apache.commons.math3.analysis.MultivariateFunction> extends org.apache.commons.math3.optimization.BaseOptimizer<org.apache.commons.math3.optimization.PointValuePair> {
	org.apache.commons.math3.optimization.PointValuePair optimize(int maxEval, FUNC f, org.apache.commons.math3.optimization.GoalType goalType, double[] startPoint);
}

