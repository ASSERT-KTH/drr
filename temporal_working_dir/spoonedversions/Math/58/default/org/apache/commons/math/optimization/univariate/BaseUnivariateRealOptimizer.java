

package org.apache.commons.math.optimization.univariate;


public interface BaseUnivariateRealOptimizer<FUNC extends org.apache.commons.math.analysis.UnivariateRealFunction> extends org.apache.commons.math.optimization.BaseOptimizer<org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair> {
	org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair optimize(int maxEval, FUNC f, org.apache.commons.math.optimization.GoalType goalType, double min, double max);

	org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair optimize(int maxEval, FUNC f, org.apache.commons.math.optimization.GoalType goalType, double min, double max, double startValue);
}

