

package org.apache.commons.math.analysis;


public interface UnivariateRealSolver {
	void setMaximalIterationCount(int count);

	int getMaximalIterationCount();

	void resetMaximalIterationCount();

	void setAbsoluteAccuracy(double accuracy);

	double getAbsoluteAccuracy();

	void resetAbsoluteAccuracy();

	void setRelativeAccuracy(double accuracy);

	double getRelativeAccuracy();

	void resetRelativeAccuracy();

	void setFunctionValueAccuracy(double accuracy);

	double getFunctionValueAccuracy();

	void resetFunctionValueAccuracy();

	@java.lang.Deprecated
	double solve(double min, double max) throws org.apache.commons.math.ConvergenceException, org.apache.commons.math.FunctionEvaluationException;

	double solve(org.apache.commons.math.analysis.UnivariateRealFunction f, double min, double max) throws org.apache.commons.math.ConvergenceException, org.apache.commons.math.FunctionEvaluationException;

	@java.lang.Deprecated
	double solve(double min, double max, double startValue) throws org.apache.commons.math.ConvergenceException, org.apache.commons.math.FunctionEvaluationException;

	double solve(org.apache.commons.math.analysis.UnivariateRealFunction f, double min, double max, double startValue) throws org.apache.commons.math.ConvergenceException, org.apache.commons.math.FunctionEvaluationException;

	double getResult();

	int getIterationCount();
}

