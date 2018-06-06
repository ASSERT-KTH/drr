

package org.apache.commons.math.optimization.univariate;


public interface BaseUnivariateOptimizer<FUNC extends org.apache.commons.math.analysis.UnivariateFunction> extends org.apache.commons.math.optimization.BaseOptimizer<org.apache.commons.math.optimization.univariate.UnivariatePointValuePair> {
	org.apache.commons.math.optimization.univariate.UnivariatePointValuePair optimize(int maxEval, FUNC f, org.apache.commons.math.optimization.GoalType goalType, double min, double max);

	org.apache.commons.math.optimization.univariate.UnivariatePointValuePair optimize(int maxEval, FUNC f, org.apache.commons.math.optimization.GoalType goalType, double min, double max, double startValue);
}

