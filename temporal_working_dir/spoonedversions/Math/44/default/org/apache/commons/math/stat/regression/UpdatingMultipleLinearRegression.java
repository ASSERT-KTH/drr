

package org.apache.commons.math.stat.regression;


public interface UpdatingMultipleLinearRegression {
	boolean hasIntercept();

	long getN();

	void addObservation(double[] x, double y) throws org.apache.commons.math.stat.regression.ModelSpecificationException;

	void addObservations(double[][] x, double[] y) throws org.apache.commons.math.stat.regression.ModelSpecificationException;

	void clear();

	org.apache.commons.math.stat.regression.RegressionResults regress() throws org.apache.commons.math.stat.regression.ModelSpecificationException;

	org.apache.commons.math.stat.regression.RegressionResults regress(int[] variablesToInclude) throws org.apache.commons.math.stat.regression.ModelSpecificationException;
}

