

package org.apache.commons.math.distribution;


public class HypergeometricDistributionImpl extends org.apache.commons.math.distribution.AbstractIntegerDistribution implements java.io.Serializable , org.apache.commons.math.distribution.HypergeometricDistribution {
	private static final long serialVersionUID = -436928820673516179L;

	private int numberOfSuccesses;

	private int populationSize;

	private int sampleSize;

	public HypergeometricDistributionImpl(int populationSize, int numberOfSuccesses, int sampleSize) {
		super();
		if (numberOfSuccesses > populationSize) {
			throw new java.lang.IllegalArgumentException(("number of successes must be less than or equal to " + "population size"));
		}
		if (sampleSize > populationSize) {
			throw new java.lang.IllegalArgumentException("sample size must be less than or equal to population size");
		}
		setPopulationSize(populationSize);
		setSampleSize(sampleSize);
		setNumberOfSuccesses(numberOfSuccesses);
	}

	public double cumulativeProbability(int x) {
		double ret;
		int n = getPopulationSize();
		int m = getNumberOfSuccesses();
		int k = getSampleSize();
		int[] domain = getDomain(n, m, k);
		if (x < (domain[0])) {
			ret = 0.0;
		}else
			if (x >= (domain[1])) {
				ret = 1.0;
			}else {
				ret = innerCumulativeProbability(domain[0], x, 1, n, m, k);
			}
		
		return ret;
	}

	private int[] getDomain(int n, int m, int k) {
		return new int[]{ getLowerDomain(n, m, k) , getUpperDomain(m, k) };
	}

	protected int getDomainLowerBound(double p) {
		return getLowerDomain(getPopulationSize(), getNumberOfSuccesses(), getSampleSize());
	}

	protected int getDomainUpperBound(double p) {
		return getUpperDomain(getSampleSize(), getNumberOfSuccesses());
	}

	private int getLowerDomain(int n, int m, int k) {
		return java.lang.Math.max(0, (m - (n - k)));
	}

	public int getNumberOfSuccesses() {
		return numberOfSuccesses;
	}

	public int getPopulationSize() {
		return populationSize;
	}

	public int getSampleSize() {
		return sampleSize;
	}

	private int getUpperDomain(int m, int k) {
		return java.lang.Math.min(k, m);
	}

	public double probability(int x) {
		double ret;
		int n = getPopulationSize();
		int m = getNumberOfSuccesses();
		int k = getSampleSize();
		int[] domain = getDomain(n, m, k);
		if ((x < (domain[0])) || (x > (domain[1]))) {
			ret = 0.0;
		}else {
			ret = probability(n, m, k, x);
		}
		return ret;
	}

	private double probability(int n, int m, int k, int x) {
		return java.lang.Math.exp((((org.apache.commons.math.util.MathUtils.binomialCoefficientLog(m, x)) + (org.apache.commons.math.util.MathUtils.binomialCoefficientLog((n - m), (k - x)))) - (org.apache.commons.math.util.MathUtils.binomialCoefficientLog(n, k))));
	}

	public void setNumberOfSuccesses(int num) {
		if (num < 0) {
			throw new java.lang.IllegalArgumentException("number of successes must be non-negative.");
		}
		numberOfSuccesses = num;
	}

	public void setPopulationSize(int size) {
		if (size <= 0) {
			throw new java.lang.IllegalArgumentException("population size must be positive.");
		}
		populationSize = size;
	}

	public void setSampleSize(int size) {
		if (size < 0) {
			throw new java.lang.IllegalArgumentException("sample size must be non-negative.");
		}
		sampleSize = size;
	}

	public double upperCumulativeProbability(int x) {
		double ret;
		int n = getPopulationSize();
		int m = getNumberOfSuccesses();
		int k = getSampleSize();
		int[] domain = getDomain(n, m, k);
		if (x < (domain[0])) {
			ret = 1.0;
		}else
			if (x > (domain[1])) {
				ret = 0.0;
			}else {
				ret = innerCumulativeProbability(domain[1], x, (-1), n, m, k);
			}
		
		return ret;
	}

	private double innerCumulativeProbability(int x0, int x1, int dx, int n, int m, int k) {
		double ret = probability(n, m, k, x0);
		while (x0 != x1) {
			x0 += dx;
			ret += probability(n, m, k, x0);
		} 
		return ret;
	}
}

