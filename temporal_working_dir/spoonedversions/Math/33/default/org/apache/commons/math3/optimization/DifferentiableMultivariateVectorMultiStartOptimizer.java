

package org.apache.commons.math3.optimization;


public class DifferentiableMultivariateVectorMultiStartOptimizer extends org.apache.commons.math3.optimization.BaseMultivariateVectorMultiStartOptimizer<org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction> implements org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer {
	public DifferentiableMultivariateVectorMultiStartOptimizer(final org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer optimizer, final int starts, final org.apache.commons.math3.random.RandomVectorGenerator generator) {
		super(optimizer, starts, generator);
	}
}

