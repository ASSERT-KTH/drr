

package org.apache.commons.math.analysis.solvers;


public abstract class AbstractDifferentiableUnivariateRealSolver extends org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver<org.apache.commons.math.analysis.DifferentiableUnivariateFunction> implements org.apache.commons.math.analysis.solvers.DifferentiableUnivariateRealSolver {
	private org.apache.commons.math.analysis.UnivariateFunction functionDerivative;

	protected AbstractDifferentiableUnivariateRealSolver(final double absoluteAccuracy) {
		super(absoluteAccuracy);
	}

	protected AbstractDifferentiableUnivariateRealSolver(final double relativeAccuracy, final double absoluteAccuracy, final double functionValueAccuracy) {
		super(relativeAccuracy, absoluteAccuracy, functionValueAccuracy);
	}

	protected double computeDerivativeObjectiveValue(double point) {
		incrementEvaluationCount();
		return functionDerivative.value(point);
	}

	@java.lang.Override
	protected void setup(int maxEval, org.apache.commons.math.analysis.DifferentiableUnivariateFunction f, double min, double max, double startValue) {
		super.setup(maxEval, f, min, max, startValue);
		functionDerivative = f.derivative();
	}
}

