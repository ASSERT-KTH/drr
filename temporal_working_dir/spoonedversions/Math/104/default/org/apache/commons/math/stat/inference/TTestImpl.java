

package org.apache.commons.math.stat.inference;


public class TTestImpl implements org.apache.commons.math.stat.inference.TTest {
	private org.apache.commons.math.distribution.TDistribution distribution;

	public TTestImpl() {
		this(new org.apache.commons.math.distribution.TDistributionImpl(1.0));
	}

	public TTestImpl(org.apache.commons.math.distribution.TDistribution t) {
		super();
		setDistribution(t);
	}

	public double pairedT(double[] sample1, double[] sample2) throws java.lang.IllegalArgumentException, org.apache.commons.math.MathException {
		if ((sample1 == null) || ((sample2 == null) || ((java.lang.Math.min(sample1.length, sample2.length)) < 2))) {
			throw new java.lang.IllegalArgumentException("insufficient data for t statistic");
		}
		double meanDifference = org.apache.commons.math.stat.StatUtils.meanDifference(sample1, sample2);
		return t(meanDifference, 0, org.apache.commons.math.stat.StatUtils.varianceDifference(sample1, sample2, meanDifference), ((double) (sample1.length)));
	}

	public double pairedTTest(double[] sample1, double[] sample2) throws java.lang.IllegalArgumentException, org.apache.commons.math.MathException {
		double meanDifference = org.apache.commons.math.stat.StatUtils.meanDifference(sample1, sample2);
		return tTest(meanDifference, 0, org.apache.commons.math.stat.StatUtils.varianceDifference(sample1, sample2, meanDifference), ((double) (sample1.length)));
	}

	public boolean pairedTTest(double[] sample1, double[] sample2, double alpha) throws java.lang.IllegalArgumentException, org.apache.commons.math.MathException {
		if ((alpha <= 0) || (alpha > 0.5)) {
			throw new java.lang.IllegalArgumentException(("bad significance level: " + alpha));
		}
		return (pairedTTest(sample1, sample2)) < alpha;
	}

	public double t(double mu, double[] observed) throws java.lang.IllegalArgumentException {
		if ((observed == null) || ((observed.length) < 2)) {
			throw new java.lang.IllegalArgumentException("insufficient data for t statistic");
		}
		return t(org.apache.commons.math.stat.StatUtils.mean(observed), mu, org.apache.commons.math.stat.StatUtils.variance(observed), observed.length);
	}

	public double t(double mu, org.apache.commons.math.stat.descriptive.StatisticalSummary sampleStats) throws java.lang.IllegalArgumentException {
		if ((sampleStats == null) || ((sampleStats.getN()) < 2)) {
			throw new java.lang.IllegalArgumentException("insufficient data for t statistic");
		}
		return t(sampleStats.getMean(), mu, sampleStats.getVariance(), sampleStats.getN());
	}

	public double homoscedasticT(double[] sample1, double[] sample2) throws java.lang.IllegalArgumentException {
		if ((sample1 == null) || ((sample2 == null) || ((java.lang.Math.min(sample1.length, sample2.length)) < 2))) {
			throw new java.lang.IllegalArgumentException("insufficient data for t statistic");
		}
		return homoscedasticT(org.apache.commons.math.stat.StatUtils.mean(sample1), org.apache.commons.math.stat.StatUtils.mean(sample2), org.apache.commons.math.stat.StatUtils.variance(sample1), org.apache.commons.math.stat.StatUtils.variance(sample2), ((double) (sample1.length)), ((double) (sample2.length)));
	}

	public double t(double[] sample1, double[] sample2) throws java.lang.IllegalArgumentException {
		if ((sample1 == null) || ((sample2 == null) || ((java.lang.Math.min(sample1.length, sample2.length)) < 2))) {
			throw new java.lang.IllegalArgumentException("insufficient data for t statistic");
		}
		return t(org.apache.commons.math.stat.StatUtils.mean(sample1), org.apache.commons.math.stat.StatUtils.mean(sample2), org.apache.commons.math.stat.StatUtils.variance(sample1), org.apache.commons.math.stat.StatUtils.variance(sample2), ((double) (sample1.length)), ((double) (sample2.length)));
	}

	public double t(org.apache.commons.math.stat.descriptive.StatisticalSummary sampleStats1, org.apache.commons.math.stat.descriptive.StatisticalSummary sampleStats2) throws java.lang.IllegalArgumentException {
		if ((sampleStats1 == null) || ((sampleStats2 == null) || ((java.lang.Math.min(sampleStats1.getN(), sampleStats2.getN())) < 2))) {
			throw new java.lang.IllegalArgumentException("insufficient data for t statistic");
		}
		return t(sampleStats1.getMean(), sampleStats2.getMean(), sampleStats1.getVariance(), sampleStats2.getVariance(), ((double) (sampleStats1.getN())), ((double) (sampleStats2.getN())));
	}

	public double homoscedasticT(org.apache.commons.math.stat.descriptive.StatisticalSummary sampleStats1, org.apache.commons.math.stat.descriptive.StatisticalSummary sampleStats2) throws java.lang.IllegalArgumentException {
		if ((sampleStats1 == null) || ((sampleStats2 == null) || ((java.lang.Math.min(sampleStats1.getN(), sampleStats2.getN())) < 2))) {
			throw new java.lang.IllegalArgumentException("insufficient data for t statistic");
		}
		return homoscedasticT(sampleStats1.getMean(), sampleStats2.getMean(), sampleStats1.getVariance(), sampleStats2.getVariance(), ((double) (sampleStats1.getN())), ((double) (sampleStats2.getN())));
	}

	public double tTest(double mu, double[] sample) throws java.lang.IllegalArgumentException, org.apache.commons.math.MathException {
		if ((sample == null) || ((sample.length) < 2)) {
			throw new java.lang.IllegalArgumentException("insufficient data for t statistic");
		}
		return tTest(org.apache.commons.math.stat.StatUtils.mean(sample), mu, org.apache.commons.math.stat.StatUtils.variance(sample), sample.length);
	}

	public boolean tTest(double mu, double[] sample, double alpha) throws java.lang.IllegalArgumentException, org.apache.commons.math.MathException {
		if ((alpha <= 0) || (alpha > 0.5)) {
			throw new java.lang.IllegalArgumentException(("bad significance level: " + alpha));
		}
		return (tTest(mu, sample)) < alpha;
	}

	public double tTest(double mu, org.apache.commons.math.stat.descriptive.StatisticalSummary sampleStats) throws java.lang.IllegalArgumentException, org.apache.commons.math.MathException {
		if ((sampleStats == null) || ((sampleStats.getN()) < 2)) {
			throw new java.lang.IllegalArgumentException("insufficient data for t statistic");
		}
		return tTest(sampleStats.getMean(), mu, sampleStats.getVariance(), sampleStats.getN());
	}

	public boolean tTest(double mu, org.apache.commons.math.stat.descriptive.StatisticalSummary sampleStats, double alpha) throws java.lang.IllegalArgumentException, org.apache.commons.math.MathException {
		if ((alpha <= 0) || (alpha > 0.5)) {
			throw new java.lang.IllegalArgumentException(("bad significance level: " + alpha));
		}
		return (tTest(mu, sampleStats)) < alpha;
	}

	public double tTest(double[] sample1, double[] sample2) throws java.lang.IllegalArgumentException, org.apache.commons.math.MathException {
		if ((sample1 == null) || ((sample2 == null) || ((java.lang.Math.min(sample1.length, sample2.length)) < 2))) {
			throw new java.lang.IllegalArgumentException("insufficient data");
		}
		return tTest(org.apache.commons.math.stat.StatUtils.mean(sample1), org.apache.commons.math.stat.StatUtils.mean(sample2), org.apache.commons.math.stat.StatUtils.variance(sample1), org.apache.commons.math.stat.StatUtils.variance(sample2), ((double) (sample1.length)), ((double) (sample2.length)));
	}

	public double homoscedasticTTest(double[] sample1, double[] sample2) throws java.lang.IllegalArgumentException, org.apache.commons.math.MathException {
		if ((sample1 == null) || ((sample2 == null) || ((java.lang.Math.min(sample1.length, sample2.length)) < 2))) {
			throw new java.lang.IllegalArgumentException("insufficient data");
		}
		return homoscedasticTTest(org.apache.commons.math.stat.StatUtils.mean(sample1), org.apache.commons.math.stat.StatUtils.mean(sample2), org.apache.commons.math.stat.StatUtils.variance(sample1), org.apache.commons.math.stat.StatUtils.variance(sample2), ((double) (sample1.length)), ((double) (sample2.length)));
	}

	public boolean tTest(double[] sample1, double[] sample2, double alpha) throws java.lang.IllegalArgumentException, org.apache.commons.math.MathException {
		if ((alpha <= 0) || (alpha > 0.5)) {
			throw new java.lang.IllegalArgumentException(("bad significance level: " + alpha));
		}
		return (tTest(sample1, sample2)) < alpha;
	}

	public boolean homoscedasticTTest(double[] sample1, double[] sample2, double alpha) throws java.lang.IllegalArgumentException, org.apache.commons.math.MathException {
		if ((alpha <= 0) || (alpha > 0.5)) {
			throw new java.lang.IllegalArgumentException(("bad significance level: " + alpha));
		}
		return (homoscedasticTTest(sample1, sample2)) < alpha;
	}

	public double tTest(org.apache.commons.math.stat.descriptive.StatisticalSummary sampleStats1, org.apache.commons.math.stat.descriptive.StatisticalSummary sampleStats2) throws java.lang.IllegalArgumentException, org.apache.commons.math.MathException {
		if ((sampleStats1 == null) || ((sampleStats2 == null) || ((java.lang.Math.min(sampleStats1.getN(), sampleStats2.getN())) < 2))) {
			throw new java.lang.IllegalArgumentException("insufficient data for t statistic");
		}
		return tTest(sampleStats1.getMean(), sampleStats2.getMean(), sampleStats1.getVariance(), sampleStats2.getVariance(), ((double) (sampleStats1.getN())), ((double) (sampleStats2.getN())));
	}

	public double homoscedasticTTest(org.apache.commons.math.stat.descriptive.StatisticalSummary sampleStats1, org.apache.commons.math.stat.descriptive.StatisticalSummary sampleStats2) throws java.lang.IllegalArgumentException, org.apache.commons.math.MathException {
		if ((sampleStats1 == null) || ((sampleStats2 == null) || ((java.lang.Math.min(sampleStats1.getN(), sampleStats2.getN())) < 2))) {
			throw new java.lang.IllegalArgumentException("insufficient data for t statistic");
		}
		return homoscedasticTTest(sampleStats1.getMean(), sampleStats2.getMean(), sampleStats1.getVariance(), sampleStats2.getVariance(), ((double) (sampleStats1.getN())), ((double) (sampleStats2.getN())));
	}

	public boolean tTest(org.apache.commons.math.stat.descriptive.StatisticalSummary sampleStats1, org.apache.commons.math.stat.descriptive.StatisticalSummary sampleStats2, double alpha) throws java.lang.IllegalArgumentException, org.apache.commons.math.MathException {
		if ((alpha <= 0) || (alpha > 0.5)) {
			throw new java.lang.IllegalArgumentException(("bad significance level: " + alpha));
		}
		return (tTest(sampleStats1, sampleStats2)) < alpha;
	}

	protected org.apache.commons.math.distribution.DistributionFactory getDistributionFactory() {
		return org.apache.commons.math.distribution.DistributionFactory.newInstance();
	}

	protected double df(double v1, double v2, double n1, double n2) {
		return (((v1 / n1) + (v2 / n2)) * ((v1 / n1) + (v2 / n2))) / (((v1 * v1) / ((n1 * n1) * (n1 - 1.0))) + ((v2 * v2) / ((n2 * n2) * (n2 - 1.0))));
	}

	protected double t(double m, double mu, double v, double n) {
		return (m - mu) / (java.lang.Math.sqrt((v / n)));
	}

	protected double t(double m1, double m2, double v1, double v2, double n1, double n2) {
		return (m1 - m2) / (java.lang.Math.sqrt(((v1 / n1) + (v2 / n2))));
	}

	protected double homoscedasticT(double m1, double m2, double v1, double v2, double n1, double n2) {
		double pooledVariance = (((n1 - 1) * v1) + ((n2 - 1) * v2)) / ((n1 + n2) - 2);
		return (m1 - m2) / (java.lang.Math.sqrt((pooledVariance * ((1.0 / n1) + (1.0 / n2)))));
	}

	protected double tTest(double m, double mu, double v, double n) throws org.apache.commons.math.MathException {
		double t = java.lang.Math.abs(t(m, mu, v, n));
		distribution.setDegreesOfFreedom((n - 1));
		return 1.0 - (distribution.cumulativeProbability((-t), t));
	}

	protected double tTest(double m1, double m2, double v1, double v2, double n1, double n2) throws org.apache.commons.math.MathException {
		double t = java.lang.Math.abs(t(m1, m2, v1, v2, n1, n2));
		double degreesOfFreedom = 0;
		degreesOfFreedom = df(v1, v2, n1, n2);
		distribution.setDegreesOfFreedom(degreesOfFreedom);
		return 1.0 - (distribution.cumulativeProbability((-t), t));
	}

	protected double homoscedasticTTest(double m1, double m2, double v1, double v2, double n1, double n2) throws org.apache.commons.math.MathException {
		double t = java.lang.Math.abs(homoscedasticT(m1, m2, v1, v2, n1, n2));
		double degreesOfFreedom = ((double) ((n1 + n2) - 2));
		distribution.setDegreesOfFreedom(degreesOfFreedom);
		return 1.0 - (distribution.cumulativeProbability((-t), t));
	}

	public void setDistribution(org.apache.commons.math.distribution.TDistribution value) {
		distribution = value;
	}
}

