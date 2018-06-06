

package org.apache.commons.math3.optimization;


public class MultivariateMultiStartOptimizer extends org.apache.commons.math3.optimization.BaseMultivariateMultiStartOptimizer<org.apache.commons.math3.analysis.MultivariateFunction> implements org.apache.commons.math3.optimization.MultivariateOptimizer {
	public MultivariateMultiStartOptimizer(final org.apache.commons.math3.optimization.MultivariateOptimizer optimizer, final int starts, final org.apache.commons.math3.random.RandomVectorGenerator generator) {
		super(optimizer, starts, generator);
	}
}

