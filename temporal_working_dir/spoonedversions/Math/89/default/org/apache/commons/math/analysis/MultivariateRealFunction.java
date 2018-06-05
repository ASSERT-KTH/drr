

package org.apache.commons.math.analysis;


public interface MultivariateRealFunction extends java.io.Serializable {
	double value(double[] point) throws java.lang.IllegalArgumentException, org.apache.commons.math.FunctionEvaluationException;
}

