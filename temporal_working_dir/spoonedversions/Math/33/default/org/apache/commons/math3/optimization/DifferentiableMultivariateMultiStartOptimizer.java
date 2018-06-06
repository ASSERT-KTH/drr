

package org.apache.commons.math3.optimization;


public class DifferentiableMultivariateMultiStartOptimizer extends org.apache.commons.math3.optimization.BaseMultivariateMultiStartOptimizer<org.apache.commons.math3.analysis.DifferentiableMultivariateFunction> implements org.apache.commons.math3.optimization.DifferentiableMultivariateOptimizer {
	public DifferentiableMultivariateMultiStartOptimizer(final org.apache.commons.math3.optimization.DifferentiableMultivariateOptimizer optimizer, final int starts, final org.apache.commons.math3.random.RandomVectorGenerator generator) {
		super(optimizer, starts, generator);
	}
}

