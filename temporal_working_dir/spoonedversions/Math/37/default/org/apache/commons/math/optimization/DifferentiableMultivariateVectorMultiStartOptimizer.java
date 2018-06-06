

package org.apache.commons.math.optimization;


public class DifferentiableMultivariateVectorMultiStartOptimizer extends org.apache.commons.math.optimization.BaseMultivariateVectorMultiStartOptimizer<org.apache.commons.math.analysis.DifferentiableMultivariateVectorFunction> implements org.apache.commons.math.optimization.DifferentiableMultivariateVectorOptimizer {
	public DifferentiableMultivariateVectorMultiStartOptimizer(final org.apache.commons.math.optimization.DifferentiableMultivariateVectorOptimizer optimizer, final int starts, final org.apache.commons.math.random.RandomVectorGenerator generator) {
		super(optimizer, starts, generator);
	}
}

