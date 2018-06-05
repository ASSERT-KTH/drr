

package org.apache.commons.math.analysis.integration;


public class TrapezoidIntegrator extends org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl {
	private double s;

	@java.lang.Deprecated
	public TrapezoidIntegrator(org.apache.commons.math.analysis.UnivariateRealFunction f) {
		super(f, 64);
	}

	public TrapezoidIntegrator() {
		super(64);
	}

	double stage(final org.apache.commons.math.analysis.UnivariateRealFunction f, final double min, final double max, final int n) throws org.apache.commons.math.FunctionEvaluationException {
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

	@java.lang.Deprecated
	public double integrate(final double min, final double max) throws java.lang.IllegalArgumentException, org.apache.commons.math.FunctionEvaluationException, org.apache.commons.math.MaxIterationsExceededException {
		return integrate(f, min, max);
	}

	public double integrate(final org.apache.commons.math.analysis.UnivariateRealFunction f, final double min, final double max) throws java.lang.IllegalArgumentException, org.apache.commons.math.FunctionEvaluationException, org.apache.commons.math.MaxIterationsExceededException {
		int i = 1;
		double t;
		double oldt;
		clearResult();
		verifyInterval(min, max);
		verifyIterationCount();
		oldt = stage(f, min, max, 0);
		while (i <= (maximalIterationCount)) {
			t = stage(f, min, max, i);
			if (i >= (minimalIterationCount)) {
				final double delta = java.lang.Math.abs((t - oldt));
				final double rLimit = ((relativeAccuracy) * ((java.lang.Math.abs(oldt)) + (java.lang.Math.abs(t)))) * 0.5;
				if ((delta <= rLimit) || (delta <= (absoluteAccuracy))) {
					setResult(t, i);
					return result;
				}
			}
			oldt = t;
			i++;
		} 
		throw new org.apache.commons.math.MaxIterationsExceededException(maximalIterationCount);
	}

	@java.lang.Override
	protected void verifyIterationCount() throws java.lang.IllegalArgumentException {
		super.verifyIterationCount();
		if ((maximalIterationCount) > 64) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("invalid iteration limits: min={0}, max={1}", 0, 64);
		}
	}
}

