

package org.apache.commons.math.optimization;


public class MultiStartDifferentiableMultivariateRealOptimizer extends org.apache.commons.math.optimization.BaseMultiStartMultivariateRealOptimizer<org.apache.commons.math.analysis.DifferentiableMultivariateFunction> implements org.apache.commons.math.optimization.DifferentiableMultivariateRealOptimizer {
	public MultiStartDifferentiableMultivariateRealOptimizer(final org.apache.commons.math.optimization.DifferentiableMultivariateRealOptimizer optimizer, final int starts, final org.apache.commons.math.random.RandomVectorGenerator generator) {
		super(optimizer, starts, generator);
	}
}

