

package org.apache.commons.math.optimization;


public class MultivariateMultiStartOptimizer extends org.apache.commons.math.optimization.BaseMultivariateMultiStartOptimizer<org.apache.commons.math.analysis.MultivariateFunction> implements org.apache.commons.math.optimization.MultivariateOptimizer {
	public MultivariateMultiStartOptimizer(final org.apache.commons.math.optimization.MultivariateOptimizer optimizer, final int starts, final org.apache.commons.math.random.RandomVectorGenerator generator) {
		super(optimizer, starts, generator);
	}
}

