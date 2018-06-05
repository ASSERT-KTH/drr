

package org.apache.commons.math.analysis.solvers;


public interface BaseUnivariateRealSolver<FUNC extends org.apache.commons.math.analysis.UnivariateRealFunction> {
	void setMaxEvaluations(int maxEvaluations);

	int getMaxEvaluations();

	int getEvaluations();

	double getAbsoluteAccuracy();

	double getRelativeAccuracy();

	double getFunctionValueAccuracy();

	double solve(FUNC f, double min, double max);

	double solve(FUNC f, double min, double max, double startValue);

	double solve(FUNC f, double startValue);
}

