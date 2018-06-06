

package org.apache.commons.math3.distribution;


public class ExponentialDistribution extends org.apache.commons.math3.distribution.AbstractRealDistribution {
	public static final double DEFAULT_INVERSE_ABSOLUTE_ACCURACY = 1.0E-9;

	private static final long serialVersionUID = 2401296428283614780L;

	private static final double[] EXPONENTIAL_SA_QI;

	private final double mean;

	private final double solverAbsoluteAccuracy;

	static {
		final double LN2 = org.apache.commons.math3.util.FastMath.log(2);
		double qi = 0;
		int i = 1;
		final org.apache.commons.math3.util.ResizableDoubleArray ra = new org.apache.commons.math3.util.ResizableDoubleArray(20);
		while (qi < 1) {
			qi += (org.apache.commons.math3.util.FastMath.pow(LN2, i)) / (org.apache.commons.math3.util.ArithmeticUtils.factorial(i));
			ra.addElement(qi);
			++i;
		} 
		EXPONENTIAL_SA_QI = ra.getElements();
	}

	public ExponentialDistribution(double mean) {
		this(mean, org.apache.commons.math3.distribution.ExponentialDistribution.DEFAULT_INVERSE_ABSOLUTE_ACCURACY);
	}

	public ExponentialDistribution(double mean, double inverseCumAccuracy) {
		this(new org.apache.commons.math3.random.Well19937c(), mean, inverseCumAccuracy);
	}

	public ExponentialDistribution(org.apache.commons.math3.random.RandomGenerator rng, double mean, double inverseCumAccuracy) throws org.apache.commons.math3.exception.NotStrictlyPositiveException {
		super(rng);
		if (mean <= 0) {
			throw new org.apache.commons.math3.exception.NotStrictlyPositiveException(org.apache.commons.math3.exception.util.LocalizedFormats.MEAN, mean);
		}
		this.mean = mean;
		solverAbsoluteAccuracy = inverseCumAccuracy;
	}

	public double getMean() {
		return mean;
	}

	public double density(double x) {
		if (x < 0) {
			return 0;
		}
		return (org.apache.commons.math3.util.FastMath.exp(((-x) / (mean)))) / (mean);
	}

	public double cumulativeProbability(double x) {
		double ret;
		if (x <= 0.0) {
			ret = 0.0;
		}else {
			ret = 1.0 - (org.apache.commons.math3.util.FastMath.exp(((-x) / (mean))));
		}
		return ret;
	}

	@java.lang.Override
	public double inverseCumulativeProbability(double p) throws org.apache.commons.math3.exception.OutOfRangeException {
		double ret;
		if ((p < 0.0) || (p > 1.0)) {
			throw new org.apache.commons.math3.exception.OutOfRangeException(p, 0.0, 1.0);
		}else
			if (p == 1.0) {
				ret = java.lang.Double.POSITIVE_INFINITY;
			}else {
				ret = (-(mean)) * (org.apache.commons.math3.util.FastMath.log((1.0 - p)));
			}
		
		return ret;
	}

	@java.lang.Override
	public double sample() {
		double a = 0;
		double u = random.nextDouble();
		while (u < 0.5) {
			a += org.apache.commons.math3.distribution.ExponentialDistribution.EXPONENTIAL_SA_QI[0];
			u *= 2;
		} 
		u += u - 1;
		if (u <= (org.apache.commons.math3.distribution.ExponentialDistribution.EXPONENTIAL_SA_QI[0])) {
			return (mean) * (a + u);
		}
		int i = 0;
		double u2 = random.nextDouble();
		double umin = u2;
		do {
			++i;
			u2 = random.nextDouble();
			if (u2 < umin) {
				umin = u2;
			}
		} while (u > (org.apache.commons.math3.distribution.ExponentialDistribution.EXPONENTIAL_SA_QI[i]) );
		return (mean) * (a + (umin * (org.apache.commons.math3.distribution.ExponentialDistribution.EXPONENTIAL_SA_QI[0])));
	}

	@java.lang.Override
	protected double getSolverAbsoluteAccuracy() {
		return solverAbsoluteAccuracy;
	}

	public double getNumericalMean() {
		return getMean();
	}

	public double getNumericalVariance() {
		final double m = getMean();
		return m * m;
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

