

package org.apache.commons.math.analysis;


public class TrapezoidIntegrator extends org.apache.commons.math.analysis.UnivariateRealIntegratorImpl {
	static final long serialVersionUID = 4978222553983172543L;

	private double s;

	public TrapezoidIntegrator(org.apache.commons.math.analysis.UnivariateRealFunction f) {
		super(f, 64);
	}

	double stage(double min, double max, int n) throws org.apache.commons.math.FunctionEvaluationException {
		long i;
		long np;
		double x;
		double spacing;
		double sum = 0;
		if (n == 0) {
			s = (0.5 * (max - min)) * ((f.value(min)) + (f.value(max)));
			return s;
		}else {
			np = 1L << (n - 1);
			spacing = (max - min) / np;
			x = min + (0.5 * spacing);
			for (i = 0; i < np; i++) {
				sum += f.value(x);
				x += spacing;
			}
			s = 0.5 * ((s) + (sum * spacing));
			return s;
		}
	}

	public double integrate(double min, double max) throws java.lang.IllegalArgumentException, org.apache.commons.math.ConvergenceException, org.apache.commons.math.FunctionEvaluationException {
		int i = 1;
		double t;
		double oldt;
		clearResult();
		verifyInterval(min, max);
		verifyIterationCount();
		oldt = stage(min, max, 0);
		while (i <= (maximalIterationCount)) {
			t = stage(min, max, i);
			if (i >= (minimalIterationCount)) {
				if ((java.lang.Math.abs((t - oldt))) <= (java.lang.Math.abs(((relativeAccuracy) * oldt)))) {
					setResult(t, i);
					return result;
				}
			}
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

