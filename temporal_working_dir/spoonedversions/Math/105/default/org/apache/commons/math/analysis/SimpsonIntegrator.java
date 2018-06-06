

package org.apache.commons.math.analysis;


public class SimpsonIntegrator extends org.apache.commons.math.analysis.UnivariateRealIntegratorImpl {
	static final long serialVersionUID = 3405465123320678216L;

	public SimpsonIntegrator(org.apache.commons.math.analysis.UnivariateRealFunction f) {
		super(f, 64);
	}

	public double integrate(double min, double max) throws java.lang.IllegalArgumentException, org.apache.commons.math.ConvergenceException, org.apache.commons.math.FunctionEvaluationException {
		int i = 1;
		double s;
		double olds;
		double t;
		double oldt;
		clearResult();
		verifyInterval(min, max);
		verifyIterationCount();
		org.apache.commons.math.analysis.TrapezoidIntegrator qtrap = new org.apache.commons.math.analysis.TrapezoidIntegrator(org.apache.commons.math.analysis.SimpsonIntegrator.this.f);
		if ((minimalIterationCount) == 1) {
			s = ((4 * (qtrap.stage(min, max, 1))) - (qtrap.stage(min, max, 0))) / 3.0;
			setResult(s, 1);
			return result;
		}
		olds = 0;
		oldt = qtrap.stage(min, max, 0);
		while (i <= (maximalIterationCount)) {
			t = qtrap.stage(min, max, i);
			s = ((4 * t) - oldt) / 3.0;
			if (i >= (minimalIterationCount)) {
				if ((java.lang.Math.abs((s - olds))) <= (java.lang.Math.abs(((relativeAccuracy) * olds)))) {
					setResult(s, i);
					return result;
				}
			}
			olds = s;
			oldt = t;
			i++;
		} 
		throw new org.apache.commons.math.ConvergenceException("Maximum number of iterations exceeded.");
	}

	protected void verifyIterationCount() throws java.lang.IllegalArgumentException {
		super.verifyIterationCount();
		if ((maximalIterationCount) > 64) {
			throw new java.lang.IllegalArgumentException(("Iteration upper limit out of [0, 64] range: " + (maximalIterationCount)));
		}
	}
}

