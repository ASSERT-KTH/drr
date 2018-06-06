

package org.apache.commons.math3.analysis.integration;


public interface UnivariateIntegrator {
	double getRelativeAccuracy();

	double getAbsoluteAccuracy();

	int getMinimalIterationCount();

	int getMaximalIterationCount();

	double integrate(int maxEval, org.apache.commons.math3.analysis.UnivariateFunction f, double min, double max) throws org.apache.commons.math3.exception.MathIllegalArgumentException, org.apache.commons.math3.exception.MaxCountExceededException, org.apache.commons.math3.exception.NullArgumentException, org.apache.commons.math3.exception.TooManyEvaluationsException;

	int getEvaluations();

	int getIterations();
}

