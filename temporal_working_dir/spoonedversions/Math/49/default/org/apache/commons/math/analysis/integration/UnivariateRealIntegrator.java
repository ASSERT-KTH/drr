

package org.apache.commons.math.analysis.integration;


public interface UnivariateRealIntegrator {
	void setMaximalIterationCount(int count);

	int getMaximalIterationCount();

	void setAbsoluteAccuracy(double accuracy);

	double getAbsoluteAccuracy();

	void setRelativeAccuracy(double accuracy);

	double getRelativeAccuracy();

	void setMinimalIterationCount(int count);

	int getMinimalIterationCount();

	void resetMinimalIterationCount();

	double integrate(org.apache.commons.math.analysis.UnivariateRealFunction f, double min, double max) throws java.lang.IllegalArgumentException, org.apache.commons.math.ConvergenceException, org.apache.commons.math.exception.MathUserException;

	double getResult() throws java.lang.IllegalStateException;
}

