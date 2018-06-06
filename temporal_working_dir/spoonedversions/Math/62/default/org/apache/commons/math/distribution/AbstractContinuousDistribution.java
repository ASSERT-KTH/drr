

package org.apache.commons.math.distribution;


public abstract class AbstractContinuousDistribution extends org.apache.commons.math.distribution.AbstractDistribution implements java.io.Serializable , org.apache.commons.math.distribution.ContinuousDistribution {
	private static final long serialVersionUID = -38038050983108802L;

	protected final org.apache.commons.math.random.RandomDataImpl randomData = new org.apache.commons.math.random.RandomDataImpl();

	private double solverAbsoluteAccuracy = org.apache.commons.math.analysis.solvers.BrentSolver.DEFAULT_ABSOLUTE_ACCURACY;

	protected AbstractContinuousDistribution() {
		super();
	}

	public double density(double x) throws org.apache.commons.math.MathRuntimeException {
		throw new org.apache.commons.math.MathRuntimeException(new java.lang.UnsupportedOperationException(), org.apache.commons.math.exception.util.LocalizedFormats.NO_DENSITY_FOR_THIS_DISTRIBUTION);
	}

	public double inverseCumulativeProbability(final double p) throws org.apache.commons.math.MathException {
		if ((p < 0.0) || (p > 1.0)) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(org.apache.commons.math.exception.util.LocalizedFormats.OUT_OF_RANGE_SIMPLE, p, 0.0, 1.0);
		}
		org.apache.commons.math.analysis.UnivariateRealFunction rootFindingFunction = new org.apache.commons.math.analysis.UnivariateRealFunction() {
			public double value(double x) throws org.apache.commons.math.FunctionEvaluationException {
				double ret = java.lang.Double.NaN;
				try {
					ret = (cumulativeProbability(x)) - p;
				} catch (org.apache.commons.math.MathException ex) {
					throw new org.apache.commons.math.FunctionEvaluationException(ex, x, ex.getLocalizablePattern(), ex.getArguments());
				}
				if (java.lang.Double.isNaN(ret)) {
					throw new org.apache.commons.math.FunctionEvaluationException(x, org.apache.commons.math.exception.util.LocalizedFormats.CUMULATIVE_PROBABILITY_RETURNED_NAN, x, p);
				}
				return ret;
			}
		};
		double lowerBound = getDomainLowerBound(p);
		double upperBound = getDomainUpperBound(p);
		double[] bracket = null;
		try {
			bracket = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(rootFindingFunction, getInitialDomain(p), lowerBound, upperBound);
		} catch (org.apache.commons.math.ConvergenceException ex) {
			if ((org.apache.commons.math.util.FastMath.abs(rootFindingFunction.value(lowerBound))) < (getSolverAbsoluteAccuracy())) {
				return lowerBound;
			}
			if ((org.apache.commons.math.util.FastMath.abs(rootFindingFunction.value(upperBound))) < (getSolverAbsoluteAccuracy())) {
				return upperBound;
			}
			throw new org.apache.commons.math.MathException(ex);
		}
		double root = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(rootFindingFunction, bracket[0], bracket[1], getSolverAbsoluteAccuracy());
		return root;
	}

	public void reseedRandomGenerator(long seed) {
		randomData.reSeed(seed);
	}

	public double sample() throws org.apache.commons.math.MathException {
		return randomData.nextInversionDeviate(org.apache.commons.math.distribution.AbstractContinuousDistribution.this);
	}

	public double[] sample(int sampleSize) throws org.apache.commons.math.MathException {
		if (sampleSize <= 0) {
			org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(org.apache.commons.math.exception.util.LocalizedFormats.NOT_POSITIVE_SAMPLE_SIZE, sampleSize);
		}
		double[] out = new double[sampleSize];
		for (int i = 0; i < sampleSize; i++) {
			out[i] = sample();
		}
		return out;
	}

	protected abstract double getInitialDomain(double p);

	protected abstract double getDomainLowerBound(double p);

	protected abstract double getDomainUpperBound(double p);

	protected double getSolverAbsoluteAccuracy() {
		return solverAbsoluteAccuracy;
	}
}

