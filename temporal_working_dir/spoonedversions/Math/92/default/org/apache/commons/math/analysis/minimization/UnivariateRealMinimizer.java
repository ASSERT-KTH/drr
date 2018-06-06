

package org.apache.commons.math.analysis.minimization;


public interface UnivariateRealMinimizer extends org.apache.commons.math.ConvergingAlgorithm {
	double minimize(org.apache.commons.math.analysis.UnivariateRealFunction f, double min, double max) throws org.apache.commons.math.ConvergenceException, org.apache.commons.math.FunctionEvaluationException;

	double minimize(org.apache.commons.math.analysis.UnivariateRealFunction f, double min, double max, double startValue) throws org.apache.commons.math.ConvergenceException, org.apache.commons.math.FunctionEvaluationException;

	double getResult();

	double getFunctionValue();
}

