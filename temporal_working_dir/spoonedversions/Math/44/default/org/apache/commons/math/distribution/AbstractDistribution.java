

package org.apache.commons.math.distribution;


public abstract class AbstractDistribution implements java.io.Serializable , org.apache.commons.math.distribution.Distribution {
	private static final long serialVersionUID = -38038050983108802L;

	private double numericalMean = java.lang.Double.NaN;

	private boolean numericalMeanIsCalculated = false;

	private double numericalVariance = java.lang.Double.NaN;

	private boolean numericalVarianceIsCalculated = false;

	protected AbstractDistribution() {
		super();
	}

	public double cumulativeProbability(double x0, double x1) {
		if (x0 > x1) {
			throw new org.apache.commons.math.exception.NumberIsTooLargeException(org.apache.commons.math.exception.util.LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT, x0, x1, true);
		}
		return (cumulativeProbability(x1)) - (cumulativeProbability(x0));
	}

	protected abstract double calculateNumericalMean();

	public double getNumericalMean() {
		if (!(numericalMeanIsCalculated)) {
			numericalMean = calculateNumericalMean();
			numericalMeanIsCalculated = true;
		}
		return numericalMean;
	}

	protected abstract double calculateNumericalVariance();

	public double getNumericalVariance() {
		if (!(numericalVarianceIsCalculated)) {
			numericalVariance = calculateNumericalVariance();
			numericalVarianceIsCalculated = true;
		}
		return numericalVariance;
	}

	public abstract boolean isSupportLowerBoundInclusive();

	public abstract boolean isSupportUpperBoundInclusive();

	public boolean isSupportConnected() {
		return true;
	}
}

