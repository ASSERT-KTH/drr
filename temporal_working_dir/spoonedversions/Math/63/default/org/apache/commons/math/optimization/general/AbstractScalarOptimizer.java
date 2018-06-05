

package org.apache.commons.math.optimization.general;


public abstract class AbstractScalarOptimizer extends org.apache.commons.math.optimization.general.BaseAbstractScalarOptimizer<org.apache.commons.math.analysis.MultivariateRealFunction> implements org.apache.commons.math.optimization.MultivariateRealOptimizer {
	protected AbstractScalarOptimizer() {
	}

	protected AbstractScalarOptimizer(org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> checker, int maxEvaluations) {
		super(checker, maxEvaluations);
	}
}

