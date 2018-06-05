

package org.apache.commons.math.analysis;


public interface MultivariateVectorialFunction extends java.io.Serializable {
	double[] value(double[] point) throws java.lang.IllegalArgumentException, org.apache.commons.math.FunctionEvaluationException;
}

