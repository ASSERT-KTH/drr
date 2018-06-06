

package org.apache.commons.math3.distribution;


public class TriangularDistribution extends org.apache.commons.math3.distribution.AbstractRealDistribution {
	private static final long serialVersionUID = 20120112L;

	private final double a;

	private final double b;

	private final double c;

	private final double solverAbsoluteAccuracy;

	public TriangularDistribution(double a, double c, double b) throws org.apache.commons.math3.exception.NumberIsTooLargeException, org.apache.commons.math3.exception.NumberIsTooSmallException {
		this(new org.apache.commons.math3.random.Well19937c(), a, c, b);
	}

	public TriangularDistribution(org.apache.commons.math3.random.RandomGenerator rng, double a, double c, double b) throws org.apache.commons.math3.exception.NumberIsTooLargeException, org.apache.commons.math3.exception.NumberIsTooSmallException {
		super(rng);
		if (a >= b) {
			throw new org.apache.commons.math3.exception.NumberIsTooLargeException(org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_BOUND_NOT_BELOW_UPPER_BOUND, a, b, false);
		}
		if (c < a) {
			throw new org.apache.commons.math3.exception.NumberIsTooSmallException(org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_TOO_SMALL, c, a, true);
		}
		if (c > b) {
			throw new org.apache.commons.math3.exception.NumberIsTooLargeException(org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_TOO_LARGE, c, b, true);
		}
		this.a = a;
		this.c = c;
		this.b = b;
		solverAbsoluteAccuracy = org.apache.commons.math3.util.FastMath.max(org.apache.commons.math3.util.FastMath.ulp(a), org.apache.commons.math3.util.FastMath.ulp(b));
	}

	public double getMode() {
		return c;
	}

	@java.lang.Override
	protected double getSolverAbsoluteAccuracy() {
		return solverAbsoluteAccuracy;
	}

	public double density(double x) {
		if (x < (a)) {
			return 0;
		}
		if (((a) <= x) && (x < (c))) {
			double divident = 2 * (x - (a));
			double divisor = ((b) - (a)) * ((c) - (a));
			return divident / divisor;
		}
		if (x == (c)) {
			return 2 / ((b) - (a));
		}
		if (((c) < x) && (x <= (b))) {
			double divident = 2 * ((b) - x);
			double divisor = ((b) - (a)) * ((b) - (c));
			return divident / divisor;
		}
		return 0;
	}

	public double cumulativeProbability(double x) {
		if (x < (a)) {
			return 0;
		}
		if (((a) <= x) && (x < (c))) {
			double divident = (x - (a)) * (x - (a));
			double divisor = ((b) - (a)) * ((c) - (a));
			return divident / divisor;
		}
		if (x == (c)) {
			return ((c) - (a)) / ((b) - (a));
		}
		if (((c) < x) && (x <= (b))) {
			double divident = ((b) - x) * ((b) - x);
			double divisor = ((b) - (a)) * ((b) - (c));
			return 1 - (divident / divisor);
		}
		return 1;
	}

	public double getNumericalMean() {
		return (((a) + (b)) + (c)) / 3;
	}

	public double getNumericalVariance() {
		return (((((((a) * (a)) + ((b) * (b))) + ((c) * (c))) - ((a) * (b))) - ((a) * (c))) - ((b) * (c))) / 18;
	}

	public double getSupportLowerBound() {
		return a;
	}

	public double getSupportUpperBound() {
		return b;
	}

	public boolean isSupportLowerBoundInclusive() {
		return true;
	}

	public boolean isSupportUpperBoundInclusive() {
		return true;
	}

	public boolean isSupportConnected() {
		return true;
	}

	@java.lang.Override
	public double inverseCumulativeProbability(double p) throws org.apache.commons.math3.exception.OutOfRangeException {
		if ((p < 0) || (p > 1)) {
			throw new org.apache.commons.math3.exception.OutOfRangeException(p, 0, 1);
		}
		if (p == 0) {
			return a;
		}
		if (p == 1) {
			return b;
		}
		if (p < (((c) - (a)) / ((b) - (a)))) {
			return (a) + (org.apache.commons.math3.util.FastMath.sqrt(((p * ((b) - (a))) * ((c) - (a)))));
		}
		return (b) - (org.apache.commons.math3.util.FastMath.sqrt((((1 - p) * ((b) - (a))) * ((b) - (c)))));
	}
}

