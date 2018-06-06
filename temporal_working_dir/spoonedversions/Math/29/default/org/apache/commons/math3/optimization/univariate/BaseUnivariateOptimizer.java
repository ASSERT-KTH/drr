

package org.apache.commons.math3.optimization.univariate;


public interface BaseUnivariateOptimizer<FUNC extends org.apache.commons.math3.analysis.UnivariateFunction> extends org.apache.commons.math3.optimization.BaseOptimizer<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> {
	org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair optimize(int maxEval, FUNC f, org.apache.commons.math3.optimization.GoalType goalType, double min, double max);

	org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair optimize(int maxEval, FUNC f, org.apache.commons.math3.optimization.GoalType goalType, double min, double max, double startValue);
}

