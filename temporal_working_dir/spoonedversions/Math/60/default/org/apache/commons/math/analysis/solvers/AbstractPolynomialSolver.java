

package org.apache.commons.math.analysis.solvers;


public abstract class AbstractPolynomialSolver extends org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver<org.apache.commons.math.analysis.polynomials.PolynomialFunction> implements org.apache.commons.math.analysis.solvers.PolynomialSolver {
	private org.apache.commons.math.analysis.polynomials.PolynomialFunction polynomialFunction;

	protected AbstractPolynomialSolver(final double absoluteAccuracy) {
		super(absoluteAccuracy);
	}

	protected AbstractPolynomialSolver(final double relativeAccuracy, final double absoluteAccuracy) {
		super(relativeAccuracy, absoluteAccuracy);
	}

	protected AbstractPolynomialSolver(final double relativeAccuracy, final double absoluteAccuracy, final double functionValueAccuracy) {
		super(relativeAccuracy, absoluteAccuracy, functionValueAccuracy);
	}

	@java.lang.Override
	protected void setup(org.apache.commons.math.analysis.polynomials.PolynomialFunction f, double min, double max, double startValue) {
		super.setup(f, min, max, startValue);
		polynomialFunction = f;
	}

	protected double[] getCoefficients() {
		return polynomialFunction.getCoefficients();
	}
}

