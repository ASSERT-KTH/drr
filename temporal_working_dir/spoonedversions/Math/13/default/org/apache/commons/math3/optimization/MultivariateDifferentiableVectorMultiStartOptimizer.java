

package org.apache.commons.math3.optimization;


@java.lang.Deprecated
public class MultivariateDifferentiableVectorMultiStartOptimizer extends org.apache.commons.math3.optimization.BaseMultivariateVectorMultiStartOptimizer<org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction> implements org.apache.commons.math3.optimization.MultivariateDifferentiableVectorOptimizer {
	public MultivariateDifferentiableVectorMultiStartOptimizer(final org.apache.commons.math3.optimization.MultivariateDifferentiableVectorOptimizer optimizer, final int starts, final org.apache.commons.math3.random.RandomVectorGenerator generator) {
		super(optimizer, starts, generator);
	}
}

