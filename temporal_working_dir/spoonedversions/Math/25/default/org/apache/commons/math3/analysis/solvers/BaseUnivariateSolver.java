

package org.apache.commons.math3.analysis.solvers;


public interface BaseUnivariateSolver<FUNC extends org.apache.commons.math3.analysis.UnivariateFunction> {
	int getMaxEvaluations();

	int getEvaluations();

	double getAbsoluteAccuracy();

	double getRelativeAccuracy();

	double getFunctionValueAccuracy();

	double solve(int maxEval, FUNC f, double min, double max);

	double solve(int maxEval, FUNC f, double min, double max, double startValue);

	double solve(int maxEval, FUNC f, double startValue);
}

