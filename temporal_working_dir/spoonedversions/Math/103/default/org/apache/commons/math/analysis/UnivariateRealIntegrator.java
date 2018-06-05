

package org.apache.commons.math.analysis;


public interface UnivariateRealIntegrator {
	void setMaximalIterationCount(int count);

	int getMaximalIterationCount();

	void resetMaximalIterationCount();

	void setMinimalIterationCount(int count);

	int getMinimalIterationCount();

	void resetMinimalIterationCount();

	void setRelativeAccuracy(double accuracy);

	double getRelativeAccuracy();

	void resetRelativeAccuracy();

	double integrate(double min, double max) throws java.lang.IllegalArgumentException, org.apache.commons.math.ConvergenceException, org.apache.commons.math.FunctionEvaluationException;

	double getResult() throws java.lang.IllegalStateException;

	int getIterationCount() throws java.lang.IllegalStateException;
}

