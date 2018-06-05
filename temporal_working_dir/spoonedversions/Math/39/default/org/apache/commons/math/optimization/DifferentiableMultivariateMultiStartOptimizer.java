

package org.apache.commons.math.optimization;


public class DifferentiableMultivariateMultiStartOptimizer extends org.apache.commons.math.optimization.BaseMultivariateMultiStartOptimizer<org.apache.commons.math.analysis.DifferentiableMultivariateFunction> implements org.apache.commons.math.optimization.DifferentiableMultivariateOptimizer {
	public DifferentiableMultivariateMultiStartOptimizer(final org.apache.commons.math.optimization.DifferentiableMultivariateOptimizer optimizer, final int starts, final org.apache.commons.math.random.RandomVectorGenerator generator) {
		super(optimizer, starts, generator);
	}
}

