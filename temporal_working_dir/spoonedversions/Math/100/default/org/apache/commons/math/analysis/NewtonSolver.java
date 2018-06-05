

package org.apache.commons.math.analysis;


public class NewtonSolver extends org.apache.commons.math.analysis.UnivariateRealSolverImpl {
	private static final long serialVersionUID = 2067325783137941016L;

	private transient org.apache.commons.math.analysis.UnivariateRealFunction derivative;

	public NewtonSolver(org.apache.commons.math.analysis.DifferentiableUnivariateRealFunction f) {
		super(f, 100, 1.0E-6);
		derivative = f.derivative();
	}

	public double solve(double min, double max) throws org.apache.commons.math.FunctionEvaluationException, org.apache.commons.math.MaxIterationsExceededException {
		return solve(min, max, org.apache.commons.math.analysis.UnivariateRealSolverUtils.midpoint(min, max));
	}

	public double solve(double min, double max, double startValue) throws org.apache.commons.math.FunctionEvaluationException, org.apache.commons.math.MaxIterationsExceededException {
		clearResult();
		verifySequence(min, startValue, max);
		double x0 = startValue;
		double x1;
		int i = 0;
		while (i < (maximalIterationCount)) {
			x1 = x0 - ((f.value(x0)) / (derivative.value(x0)));
			if ((java.lang.Math.abs((x1 - x0))) <= (absoluteAccuracy)) {
				setResult(x1, i);
				return x1;
			}
			x0 = x1;
			++i;
		} 
		throw new org.apache.commons.math.MaxIterationsExceededException(maximalIterationCount);
	}

	private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
		in.defaultReadObject();
		derivative = ((org.apache.commons.math.analysis.DifferentiableUnivariateRealFunction) (f)).derivative();
	}
}

