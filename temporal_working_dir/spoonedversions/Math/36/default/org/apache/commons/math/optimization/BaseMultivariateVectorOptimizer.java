

package org.apache.commons.math.optimization;


public interface BaseMultivariateVectorOptimizer<FUNC extends org.apache.commons.math.analysis.MultivariateVectorFunction> extends org.apache.commons.math.optimization.BaseOptimizer<org.apache.commons.math.optimization.PointVectorValuePair> {
	org.apache.commons.math.optimization.PointVectorValuePair optimize(int maxEval, FUNC f, double[] target, double[] weight, double[] startPoint);
}

