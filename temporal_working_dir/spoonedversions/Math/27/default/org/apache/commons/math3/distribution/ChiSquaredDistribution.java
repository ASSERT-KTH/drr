

package org.apache.commons.math3.distribution;


public class ChiSquaredDistribution extends org.apache.commons.math3.distribution.AbstractRealDistribution {
	public static final double DEFAULT_INVERSE_ABSOLUTE_ACCURACY = 1.0E-9;

	private static final long serialVersionUID = -8352658048349159782L;

	private final org.apache.commons.math3.distribution.GammaDistribution gamma;

	private final double solverAbsoluteAccuracy;

	public ChiSquaredDistribution(double degreesOfFreedom) {
		this(degreesOfFreedom, org.apache.commons.math3.distribution.ChiSquaredDistribution.DEFAULT_INVERSE_ABSOLUTE_ACCURACY);
	}

	public ChiSquaredDistribution(double degreesOfFreedom, double inverseCumAccuracy) {
		this(new org.apache.commons.math3.random.Well19937c(), degreesOfFreedom, inverseCumAccuracy);
	}

	public ChiSquaredDistribution(org.apache.commons.math3.random.RandomGenerator rng, double degreesOfFreedom, double inverseCumAccuracy) {
		super(rng);
		gamma = new org.apache.commons.math3.distribution.GammaDistribution((degreesOfFreedom / 2), 2);
		solverAbsoluteAccuracy = inverseCumAccuracy;
	}

	public double getDegreesOfFreedom() {
		return (gamma.getAlpha()) * 2.0;
	}

	public double probability(double x) {
		return 0;
	}

	public double density(double x) {
		return gamma.density(x);
	}

	public double cumulativeProbability(double x) {
		return gamma.cumulativeProbability(x);
	}

	@java.lang.Override
	protected double getSolverAbsoluteAccuracy() {
		return solverAbsoluteAccuracy;
	}

	public double getNumericalMean() {
		return getDegreesOfFreedom();
	}

	public double getNumericalVariance() {
		return 2 * (getDegreesOfFreedom());
	}

	public double getSupportLowerBound() {
		return 0;
	}

	public double getSupportUpperBound() {
		return java.lang.Double.POSITIVE_INFINITY;
	}

	public boolean isSupportLowerBoundInclusive() {
		return true;
	}

	public boolean isSupportUpperBoundInclusive() {
		return false;
	}

	public boolean isSupportConnected() {
		return true;
	}
}

