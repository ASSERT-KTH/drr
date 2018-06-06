

package org.apache.commons.math3.analysis.solvers;


public abstract class AbstractUnivariateSolver extends org.apache.commons.math3.analysis.solvers.BaseAbstractUnivariateSolver<org.apache.commons.math3.analysis.UnivariateFunction> implements org.apache.commons.math3.analysis.solvers.UnivariateSolver {
	protected AbstractUnivariateSolver(final double absoluteAccuracy) {
		super(absoluteAccuracy);
	}

	protected AbstractUnivariateSolver(final double relativeAccuracy, final double absoluteAccuracy) {
		super(relativeAccuracy, absoluteAccuracy);
	}

	protected AbstractUnivariateSolver(final double relativeAccuracy, final double absoluteAccuracy, final double functionValueAccuracy) {
		super(relativeAccuracy, absoluteAccuracy, functionValueAccuracy);
	}
}

