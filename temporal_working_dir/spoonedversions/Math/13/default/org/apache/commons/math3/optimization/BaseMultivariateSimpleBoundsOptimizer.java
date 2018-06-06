

package org.apache.commons.math3.optimization;


@java.lang.Deprecated
public interface BaseMultivariateSimpleBoundsOptimizer<FUNC extends org.apache.commons.math3.analysis.MultivariateFunction> extends org.apache.commons.math3.optimization.BaseMultivariateOptimizer<FUNC> {
	org.apache.commons.math3.optimization.PointValuePair optimize(int maxEval, FUNC f, org.apache.commons.math3.optimization.GoalType goalType, double[] startPoint, double[] lowerBound, double[] upperBound);
}

