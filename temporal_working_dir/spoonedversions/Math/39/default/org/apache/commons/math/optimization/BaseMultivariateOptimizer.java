

package org.apache.commons.math.optimization;


public interface BaseMultivariateOptimizer<FUNC extends org.apache.commons.math.analysis.MultivariateFunction> extends org.apache.commons.math.optimization.BaseOptimizer<org.apache.commons.math.optimization.RealPointValuePair> {
	org.apache.commons.math.optimization.RealPointValuePair optimize(int maxEval, FUNC f, org.apache.commons.math.optimization.GoalType goalType, double[] startPoint);
}

