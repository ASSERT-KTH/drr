

package org.apache.commons.math.optimization.univariate;


public interface BaseUnivariateRealOptimizer<FUNC extends org.apache.commons.math.analysis.UnivariateRealFunction> extends org.apache.commons.math.optimization.BaseOptimizer<org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair> {
	org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair optimize(FUNC f, org.apache.commons.math.optimization.GoalType goalType, double min, double max) throws org.apache.commons.math.FunctionEvaluationException;

	org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair optimize(FUNC f, org.apache.commons.math.optimization.GoalType goalType, double min, double max, double startValue) throws org.apache.commons.math.FunctionEvaluationException;
}

