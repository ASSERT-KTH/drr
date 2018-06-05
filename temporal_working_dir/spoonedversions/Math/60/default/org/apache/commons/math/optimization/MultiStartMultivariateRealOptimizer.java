

package org.apache.commons.math.optimization;


public class MultiStartMultivariateRealOptimizer extends org.apache.commons.math.optimization.BaseMultiStartMultivariateRealOptimizer<org.apache.commons.math.analysis.MultivariateRealFunction> implements org.apache.commons.math.optimization.MultivariateRealOptimizer {
	public MultiStartMultivariateRealOptimizer(final org.apache.commons.math.optimization.MultivariateRealOptimizer optimizer, final int starts, final org.apache.commons.math.random.RandomVectorGenerator generator) {
		super(optimizer, starts, generator);
	}
}

