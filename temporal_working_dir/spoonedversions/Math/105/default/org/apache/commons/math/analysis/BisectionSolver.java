

package org.apache.commons.math.analysis;


public class BisectionSolver extends org.apache.commons.math.analysis.UnivariateRealSolverImpl {
	private static final long serialVersionUID = 7137520585963699578L;

	public BisectionSolver(org.apache.commons.math.analysis.UnivariateRealFunction f) {
		super(f, 100, 1.0E-6);
	}

	public double solve(double min, double max, double initial) throws org.apache.commons.math.ConvergenceException, org.apache.commons.math.FunctionEvaluationException {
		return solve(min, max);
	}

	public double solve(double min, double max) throws org.apache.commons.math.ConvergenceException, org.apache.commons.math.FunctionEvaluationException {
		clearResult();
		verifyInterval(min, max);
		double m;
		double fm;
		double fmin;
		int i = 0;
		while (i < (maximalIterationCount)) {
			m = org.apache.commons.math.analysis.UnivariateRealSolverUtils.midpoint(min, max);
			fmin = f.value(min);
			fm = f.value(m);
			if ((fm * fmin) > 0.0) {
				min = m;
			}else {
				max = m;
			}
			if ((java.lang.Math.abs((max - min))) <= (absoluteAccuracy)) {
				m = org.apache.commons.math.analysis.UnivariateRealSolverUtils.midpoint(min, max);
				setResult(m, i);
				return m;
			}
			++i;
		} 
		throw new org.apache.commons.math.ConvergenceException(("Maximum number of iterations exceeded: " + (maximalIterationCount)));
	}
}

