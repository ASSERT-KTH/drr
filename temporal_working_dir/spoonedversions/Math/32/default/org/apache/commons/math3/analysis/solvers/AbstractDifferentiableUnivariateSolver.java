

package org.apache.commons.math3.analysis.solvers;


public abstract class AbstractDifferentiableUnivariateSolver extends org.apache.commons.math3.analysis.solvers.BaseAbstractUnivariateSolver<org.apache.commons.math3.analysis.DifferentiableUnivariateFunction> implements org.apache.commons.math3.analysis.solvers.DifferentiableUnivariateSolver {
	private org.apache.commons.math3.analysis.UnivariateFunction functionDerivative;

	protected AbstractDifferentiableUnivariateSolver(final double absoluteAccuracy) {
		super(absoluteAccuracy);
	}

	protected AbstractDifferentiableUnivariateSolver(final double relativeAccuracy, final double absoluteAccuracy, final double functionValueAccuracy) {
		super(relativeAccuracy, absoluteAccuracy, functionValueAccuracy);
	}

	protected double computeDerivativeObjectiveValue(double point) {
		incrementEvaluationCount();
		return functionDerivative.value(point);
	}

	@java.lang.Override
	protected void setup(int maxEval, org.apache.commons.math3.analysis.DifferentiableUnivariateFunction f, double min, double max, double startValue) {
		super.setup(maxEval, f, min, max, startValue);
		functionDerivative = f.derivative();
	}
}

