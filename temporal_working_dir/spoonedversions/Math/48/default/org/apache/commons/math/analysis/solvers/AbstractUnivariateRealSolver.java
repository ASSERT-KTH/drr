

package org.apache.commons.math.analysis.solvers;


public abstract class AbstractUnivariateRealSolver extends org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> implements org.apache.commons.math.analysis.solvers.UnivariateRealSolver {
	protected AbstractUnivariateRealSolver(final double absoluteAccuracy) {
		super(absoluteAccuracy);
	}

	protected AbstractUnivariateRealSolver(final double relativeAccuracy, final double absoluteAccuracy) {
		super(relativeAccuracy, absoluteAccuracy);
	}

	protected AbstractUnivariateRealSolver(final double relativeAccuracy, final double absoluteAccuracy, final double functionValueAccuracy) {
		super(relativeAccuracy, absoluteAccuracy, functionValueAccuracy);
	}
}

