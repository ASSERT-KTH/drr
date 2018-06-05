

package org.apache.commons.math3.analysis.solvers;


public abstract class AbstractPolynomialSolver extends org.apache.commons.math3.analysis.solvers.BaseAbstractUnivariateSolver<org.apache.commons.math3.analysis.polynomials.PolynomialFunction> implements org.apache.commons.math3.analysis.solvers.PolynomialSolver {
	private org.apache.commons.math3.analysis.polynomials.PolynomialFunction polynomialFunction;

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
	protected void setup(int maxEval, org.apache.commons.math3.analysis.polynomials.PolynomialFunction f, double min, double max, double startValue) {
		super.setup(maxEval, f, min, max, startValue);
		polynomialFunction = f;
	}

	protected double[] getCoefficients() {
		return polynomialFunction.getCoefficients();
	}
}

