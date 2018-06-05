

package org.apache.commons.math.optimization;


public interface BaseSimpleBoundsMultivariateRealOptimizer<FUNC extends org.apache.commons.math.analysis.MultivariateRealFunction> extends org.apache.commons.math.optimization.BaseMultivariateRealOptimizer<FUNC> {
	org.apache.commons.math.optimization.RealPointValuePair optimize(int maxEval, FUNC f, org.apache.commons.math.optimization.GoalType goalType, double[] startPoint, double[] lowerBound, double[] upperBound);
}

