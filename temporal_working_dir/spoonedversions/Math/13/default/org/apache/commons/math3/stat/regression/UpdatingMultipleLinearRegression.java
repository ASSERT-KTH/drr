

package org.apache.commons.math3.stat.regression;


public interface UpdatingMultipleLinearRegression {
	boolean hasIntercept();

	long getN();

	void addObservation(double[] x, double y) throws org.apache.commons.math3.stat.regression.ModelSpecificationException;

	void addObservations(double[][] x, double[] y) throws org.apache.commons.math3.stat.regression.ModelSpecificationException;

	void clear();

	org.apache.commons.math3.stat.regression.RegressionResults regress() throws org.apache.commons.math3.exception.NoDataException, org.apache.commons.math3.stat.regression.ModelSpecificationException;

	org.apache.commons.math3.stat.regression.RegressionResults regress(int[] variablesToInclude) throws org.apache.commons.math3.exception.MathIllegalArgumentException, org.apache.commons.math3.stat.regression.ModelSpecificationException;
}

