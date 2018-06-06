

package org.apache.commons.math3.distribution;


public class TDistribution extends org.apache.commons.math3.distribution.AbstractRealDistribution {
	public static final double DEFAULT_INVERSE_ABSOLUTE_ACCURACY = 1.0E-9;

	private static final long serialVersionUID = -5852615386664158222L;

	private final double degreesOfFreedom;

	private final double solverAbsoluteAccuracy;

	public TDistribution(double degreesOfFreedom, double inverseCumAccuracy) throws org.apache.commons.math3.exception.NotStrictlyPositiveException {
		if (degreesOfFreedom <= 0) {
			throw new org.apache.commons.math3.exception.NotStrictlyPositiveException(org.apache.commons.math3.exception.util.LocalizedFormats.DEGREES_OF_FREEDOM, degreesOfFreedom);
		}
		this.degreesOfFreedom = degreesOfFreedom;
		solverAbsoluteAccuracy = inverseCumAccuracy;
	}

	public TDistribution(double degreesOfFreedom) throws org.apache.commons.math3.exception.NotStrictlyPositiveException {
		this(degreesOfFreedom, org.apache.commons.math3.distribution.TDistribution.DEFAULT_INVERSE_ABSOLUTE_ACCURACY);
	}

	public double getDegreesOfFreedom() {
		return degreesOfFreedom;
	}

	public double probability(double x) {
		return 0.0;
	}

	public double density(double x) {
		final double n = degreesOfFreedom;
		final double nPlus1Over2 = (n + 1) / 2;
		return org.apache.commons.math3.util.FastMath.exp(((((org.apache.commons.math3.special.Gamma.logGamma(nPlus1Over2)) - (0.5 * ((org.apache.commons.math3.util.FastMath.log(org.apache.commons.math3.util.FastMath.PI)) + (org.apache.commons.math3.util.FastMath.log(n))))) - (org.apache.commons.math3.special.Gamma.logGamma((n / 2)))) - (nPlus1Over2 * (org.apache.commons.math3.util.FastMath.log((1 + ((x * x) / n)))))));
	}

	public double cumulativeProbability(double x) {
		double ret;
		if (x == 0) {
			ret = 0.5;
		}else {
			double t = org.apache.commons.math3.special.Beta.regularizedBeta(((degreesOfFreedom) / ((degreesOfFreedom) + (x * x))), (0.5 * (degreesOfFreedom)), 0.5);
			if (x < 0.0) {
				ret = 0.5 * t;
			}else {
				ret = 1.0 - (0.5 * t);
			}
		}
		return ret;
	}

	@java.lang.Override
	protected double getSolverAbsoluteAccuracy() {
		return solverAbsoluteAccuracy;
	}

	public double getNumericalMean() {
		final double df = getDegreesOfFreedom();
		if (df > 1) {
			return 0;
		}
		return java.lang.Double.NaN;
	}

	public double getNumericalVariance() {
		final double df = getDegreesOfFreedom();
		if (df > 2) {
			return df / (df - 2);
		}
		if ((df > 1) && (df <= 2)) {
			return java.lang.Double.POSITIVE_INFINITY;
		}
		return java.lang.Double.NaN;
	}

	public double getSupportLowerBound() {
		return java.lang.Double.NEGATIVE_INFINITY;
	}

	public double getSupportUpperBound() {
		return java.lang.Double.POSITIVE_INFINITY;
	}

	public boolean isSupportLowerBoundInclusive() {
		return false;
	}

	public boolean isSupportUpperBoundInclusive() {
		return false;
	}

	public boolean isSupportConnected() {
		return true;
	}
}

