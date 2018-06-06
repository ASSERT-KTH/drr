

package org.apache.commons.math.optimization;


public interface BaseMultivariateVectorialOptimizer<FUNC extends org.apache.commons.math.analysis.MultivariateVectorFunction> extends org.apache.commons.math.optimization.BaseOptimizer<org.apache.commons.math.optimization.VectorialPointValuePair> {
	org.apache.commons.math.optimization.VectorialPointValuePair optimize(int maxEval, FUNC f, double[] target, double[] weight, double[] startPoint);
}

