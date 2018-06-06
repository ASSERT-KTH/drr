

package org.apache.commons.math.analysis;


public interface MultivariateMatrixFunction extends java.io.Serializable {
	double[][] value(double[] point) throws java.lang.IllegalArgumentException, org.apache.commons.math.FunctionEvaluationException;
}

