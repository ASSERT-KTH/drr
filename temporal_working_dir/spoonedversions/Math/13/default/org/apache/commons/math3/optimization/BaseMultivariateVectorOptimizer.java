

package org.apache.commons.math3.optimization;


@java.lang.Deprecated
public interface BaseMultivariateVectorOptimizer<FUNC extends org.apache.commons.math3.analysis.MultivariateVectorFunction> extends org.apache.commons.math3.optimization.BaseOptimizer<org.apache.commons.math3.optimization.PointVectorValuePair> {
	@java.lang.Deprecated
	org.apache.commons.math3.optimization.PointVectorValuePair optimize(int maxEval, FUNC f, double[] target, double[] weight, double[] startPoint);
}

