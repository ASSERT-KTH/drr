

package org.apache.commons.math.analysis.integration;


public interface UnivariateRealIntegrator {
	double getRelativeAccuracy();

	double getAbsoluteAccuracy();

	int getMinimalIterationCount();

	int getMaximalIterationCount();

	double integrate(int maxEval, org.apache.commons.math.analysis.UnivariateRealFunction f, double min, double max) throws org.apache.commons.math.exception.MathIllegalArgumentException, org.apache.commons.math.exception.MaxCountExceededException, org.apache.commons.math.exception.NullArgumentException, org.apache.commons.math.exception.TooManyEvaluationsException;

	int getEvaluations();

	int getIterations();
}

