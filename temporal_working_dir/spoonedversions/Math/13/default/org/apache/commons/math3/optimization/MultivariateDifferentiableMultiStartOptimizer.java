

package org.apache.commons.math3.optimization;


@java.lang.Deprecated
public class MultivariateDifferentiableMultiStartOptimizer extends org.apache.commons.math3.optimization.BaseMultivariateMultiStartOptimizer<org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableFunction> implements org.apache.commons.math3.optimization.MultivariateDifferentiableOptimizer {
	public MultivariateDifferentiableMultiStartOptimizer(final org.apache.commons.math3.optimization.MultivariateDifferentiableOptimizer optimizer, final int starts, final org.apache.commons.math3.random.RandomVectorGenerator generator) {
		super(optimizer, starts, generator);
	}
}

