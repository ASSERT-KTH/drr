

package org.apache.commons.math3.stat.regression;


public interface MultipleLinearRegression {
	double[] estimateRegressionParameters();

	double[][] estimateRegressionParametersVariance();

	double[] estimateResiduals();

	double estimateRegressandVariance();

	double[] estimateRegressionParametersStandardErrors();
}

