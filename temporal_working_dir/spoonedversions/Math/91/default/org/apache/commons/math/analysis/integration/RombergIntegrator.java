

package org.apache.commons.math.analysis.integration;


public class RombergIntegrator extends org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl {
	private static final long serialVersionUID = 4616482344304576900L;

	@java.lang.Deprecated
	public RombergIntegrator(org.apache.commons.math.analysis.UnivariateRealFunction f) {
		super(f, 32);
	}

	public RombergIntegrator() {
		super(32);
	}

	@java.lang.Deprecated
	public double integrate(final double min, final double max) throws java.lang.IllegalArgumentException, org.apache.commons.math.FunctionEvaluationException, org.apache.commons.math.MaxIterationsExceededException {
		return integrate(f, min, max);
	}

	public double integrate(final org.apache.commons.math.analysis.UnivariateRealFunction f, final double min, final double max) throws java.lang.IllegalArgumentException, org.apache.commons.math.FunctionEvaluationException, org.apache.commons.math.MaxIterationsExceededException {
		int i = 1;
		int j;
		int m = (maximalIterationCount) + 1;
		double r;
		double[][] t = new double[m][m];
		double s;
		double olds;
		clearResult();
		verifyInterval(min, max);
		verifyIterationCount();
		org.apache.commons.math.analysis.integration.TrapezoidIntegrator qtrap = new org.apache.commons.math.analysis.integration.TrapezoidIntegrator();
		t[0][0] = qtrap.stage(f, min, max, 0);
		olds = t[0][0];
		while (i <= (maximalIterationCount)) {
			t[i][0] = qtrap.stage(f, min, max, i);
			for (j = 1; j <= i; j++) {
				r = (1L << (2 * j)) - 1;
				t[i][j] = (t[i][(j - 1)]) + (((t[i][(j - 1)]) - (t[(i - 1)][(j - 1)])) / r);
			}
			s = t[i][i];
			if (i >= (minimalIterationCount)) {
				final double delta = java.lang.Math.abs((s - olds));
				final double rLimit = ((relativeAccuracy) * ((java.lang.Math.abs(olds)) + (java.lang.Math.abs(s)))) * 0.5;
				if ((delta <= rLimit) || (delta <= (absoluteAccuracy))) {
					setResult(s, i);
					return result;
				}
			}
			olds = s;
			i++;
		} 
		throw new org.apache.commons.math.MaxIterationsExceededException(maximalIterationCount);
	}

	protected void verifyIterationCount() throws java.lang.IllegalArgumentException {
		super.verifyIterationCount();
		if ((maximalIterationCount) > 32) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("invalid iteration limits: min={0}, max={1}", 0, 32);
		}
	}
}

