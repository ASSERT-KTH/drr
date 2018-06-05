

package org.apache.commons.math.stat.regression;


public interface MultipleLinearRegression {
	void addData(double[] y, double[][] x, double[][] covariance);

	double[] estimateRegressionParameters();

	double[][] estimateRegressionParametersVariance();

	double[] estimateResiduals();

	double estimateRegressandVariance();
}

