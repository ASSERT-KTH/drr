

package org.apache.commons.math.optimization;


public interface BaseMultivariateVectorialOptimizer<FUNC extends org.apache.commons.math.analysis.MultivariateVectorialFunction> extends org.apache.commons.math.optimization.BaseOptimizer<org.apache.commons.math.optimization.VectorialPointValuePair> {
	org.apache.commons.math.optimization.VectorialPointValuePair optimize(FUNC f, double[] target, double[] weight, double[] startPoint) throws org.apache.commons.math.exception.MathUserException;
}

