

package org.apache.commons.math.optimization;


public interface BaseMultivariateRealOptimizer<FUNC extends org.apache.commons.math.analysis.MultivariateRealFunction> extends org.apache.commons.math.optimization.BaseOptimizer<org.apache.commons.math.optimization.RealPointValuePair> {
	org.apache.commons.math.optimization.RealPointValuePair optimize(FUNC f, org.apache.commons.math.optimization.GoalType goalType, double[] startPoint) throws org.apache.commons.math.FunctionEvaluationException;
}

