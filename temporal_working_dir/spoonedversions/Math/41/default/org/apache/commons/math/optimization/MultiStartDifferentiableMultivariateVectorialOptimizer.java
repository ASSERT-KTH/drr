

package org.apache.commons.math.optimization;


public class MultiStartDifferentiableMultivariateVectorialOptimizer extends org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer<org.apache.commons.math.analysis.DifferentiableMultivariateVectorFunction> implements org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer {
	public MultiStartDifferentiableMultivariateVectorialOptimizer(final org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer optimizer, final int starts, final org.apache.commons.math.random.RandomVectorGenerator generator) {
		super(optimizer, starts, generator);
	}
}

