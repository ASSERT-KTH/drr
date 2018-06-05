

package org.apache.commons.math3.analysis.solvers;


public abstract class AbstractUnivariateDifferentiableSolver extends org.apache.commons.math3.analysis.solvers.BaseAbstractUnivariateSolver<org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction> implements org.apache.commons.math3.analysis.solvers.UnivariateDifferentiableSolver {
	private org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction function;

	protected AbstractUnivariateDifferentiableSolver(final double absoluteAccuracy) {
		super(absoluteAccuracy);
	}

	protected AbstractUnivariateDifferentiableSolver(final double relativeAccuracy, final double absoluteAccuracy, final double functionValueAccuracy) {
		super(relativeAccuracy, absoluteAccuracy, functionValueAccuracy);
	}

	protected org.apache.commons.math3.analysis.differentiation.DerivativeStructure computeObjectiveValueAndDerivative(double point) {
		incrementEvaluationCount();
		return function.value(new org.apache.commons.math3.analysis.differentiation.DerivativeStructure(1, 1, 0, point));
	}

	@java.lang.Override
	protected void setup(int maxEval, org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction f, double min, double max, double startValue) {
		super.setup(maxEval, f, min, max, startValue);
		function = f;
	}
}

