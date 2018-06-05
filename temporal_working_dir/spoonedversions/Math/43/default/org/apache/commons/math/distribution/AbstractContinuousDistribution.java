

package org.apache.commons.math.distribution;


public abstract class AbstractContinuousDistribution extends org.apache.commons.math.distribution.AbstractDistribution implements java.io.Serializable , org.apache.commons.math.distribution.ContinuousDistribution {
	public static final double SOLVER_DEFAULT_ABSOLUTE_ACCURACY = 1.0E-6;

	private static final long serialVersionUID = -38038050983108802L;

	protected final org.apache.commons.math.random.RandomDataImpl randomData = new org.apache.commons.math.random.RandomDataImpl();

	private double solverAbsoluteAccuracy = org.apache.commons.math.distribution.AbstractContinuousDistribution.SOLVER_DEFAULT_ABSOLUTE_ACCURACY;

	protected AbstractContinuousDistribution() {
	}

	public final double probability(double x) {
		return 0.0;
	}

	public double inverseCumulativeProbability(final double p) throws org.apache.commons.math.exception.OutOfRangeException {
		if ((p < 0.0) || (p > 1.0)) {
			throw new org.apache.commons.math.exception.OutOfRangeException(p, 0, 1);
		}
		org.apache.commons.math.analysis.UnivariateRealFunction rootFindingFunction = new org.apache.commons.math.analysis.UnivariateRealFunction() {
			public double value(double x) {
				return (cumulativeProbability(x)) - p;
			}
		};
		double lowerBound = getDomainLowerBound(p);
		double upperBound = getDomainUpperBound(p);
		double[] bracket = null;
		try {
			bracket = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(rootFindingFunction, getInitialDomain(p), lowerBound, upperBound);
		} catch (org.apache.commons.math.exception.NumberIsTooLargeException ex) {
			if ((org.apache.commons.math.util.FastMath.abs(rootFindingFunction.value(lowerBound))) < (getSolverAbsoluteAccuracy())) {
				return lowerBound;
			}
			if ((org.apache.commons.math.util.FastMath.abs(rootFindingFunction.value(upperBound))) < (getSolverAbsoluteAccuracy())) {
				return upperBound;
			}
			throw new org.apache.commons.math.exception.MathInternalError(ex);
		}
		double root = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(rootFindingFunction, bracket[0], bracket[1], getSolverAbsoluteAccuracy());
		return root;
	}

	public void reseedRandomGenerator(long seed) {
		randomData.reSeed(seed);
	}

	public double sample() {
		return randomData.nextInversionDeviate(org.apache.commons.math.distribution.AbstractContinuousDistribution.this);
	}

	public double[] sample(int sampleSize) {
		if (sampleSize <= 0) {
			throw new org.apache.commons.math.exception.NotStrictlyPositiveException(org.apache.commons.math.exception.util.LocalizedFormats.NUMBER_OF_SAMPLES, sampleSize);
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

	public abstract double getSupportLowerBound();

	public abstract double getSupportUpperBound();
}

