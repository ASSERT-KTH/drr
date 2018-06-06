

package org.apache.commons.math.optimization;


public interface BaseMultivariateSimpleBoundsOptimizer<FUNC extends org.apache.commons.math.analysis.MultivariateFunction> extends org.apache.commons.math.optimization.BaseMultivariateOptimizer<FUNC> {
	org.apache.commons.math.optimization.RealPointValuePair optimize(int maxEval, FUNC f, org.apache.commons.math.optimization.GoalType goalType, double[] startPoint, double[] lowerBound, double[] upperBound);
}

