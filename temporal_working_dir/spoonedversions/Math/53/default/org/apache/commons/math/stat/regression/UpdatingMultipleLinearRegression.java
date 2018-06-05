

package org.apache.commons.math.stat.regression;


public interface UpdatingMultipleLinearRegression {
	boolean hasIntercept();

	long getN();

	void addObservation(double[] x, double y);

	void addObservations(double[][] x, double[] y);

	void clear();

	org.apache.commons.math.stat.regression.RegressionResults regress() throws org.apache.commons.math.MathException;

	org.apache.commons.math.stat.regression.RegressionResults regress(int[] variablesToInclude) throws org.apache.commons.math.MathException;
}

