

package org.apache.commons.math3.stat.inference;


public class TTest {
	public double pairedT(final double[] sample1, final double[] sample2) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.NoDataException, org.apache.commons.math3.exception.NullArgumentException, org.apache.commons.math3.exception.NumberIsTooSmallException {
		checkSampleData(sample1);
		checkSampleData(sample2);
		double meanDifference = org.apache.commons.math3.stat.StatUtils.meanDifference(sample1, sample2);
		return t(meanDifference, 0, org.apache.commons.math3.stat.StatUtils.varianceDifference(sample1, sample2, meanDifference), sample1.length);
	}

	public double pairedTTest(final double[] sample1, final double[] sample2) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.MaxCountExceededException, org.apache.commons.math3.exception.NoDataException, org.apache.commons.math3.exception.NullArgumentException, org.apache.commons.math3.exception.NumberIsTooSmallException {
		double meanDifference = org.apache.commons.math3.stat.StatUtils.meanDifference(sample1, sample2);
		return tTest(meanDifference, 0, org.apache.commons.math3.stat.StatUtils.varianceDifference(sample1, sample2, meanDifference), sample1.length);
	}

	public boolean pairedTTest(final double[] sample1, final double[] sample2, final double alpha) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.MaxCountExceededException, org.apache.commons.math3.exception.NoDataException, org.apache.commons.math3.exception.NullArgumentException, org.apache.commons.math3.exception.NumberIsTooSmallException, org.apache.commons.math3.exception.OutOfRangeException {
		checkSignificanceLevel(alpha);
		return (pairedTTest(sample1, sample2)) < alpha;
	}

	public double t(final double mu, final double[] observed) throws org.apache.commons.math3.exception.NullArgumentException, org.apache.commons.math3.exception.NumberIsTooSmallException {
		checkSampleData(observed);
		return t(org.apache.commons.math3.stat.StatUtils.mean(observed), mu, org.apache.commons.math3.stat.StatUtils.variance(observed), observed.length);
	}

	public double t(final double mu, final org.apache.commons.math3.stat.descriptive.StatisticalSummary sampleStats) throws org.apache.commons.math3.exception.NullArgumentException, org.apache.commons.math3.exception.NumberIsTooSmallException {
		checkSampleData(sampleStats);
		return t(sampleStats.getMean(), mu, sampleStats.getVariance(), sampleStats.getN());
	}

	public double homoscedasticT(final double[] sample1, final double[] sample2) throws org.apache.commons.math3.exception.NullArgumentException, org.apache.commons.math3.exception.NumberIsTooSmallException {
		checkSampleData(sample1);
		checkSampleData(sample2);
		return homoscedasticT(org.apache.commons.math3.stat.StatUtils.mean(sample1), org.apache.commons.math3.stat.StatUtils.mean(sample2), org.apache.commons.math3.stat.StatUtils.variance(sample1), org.apache.commons.math3.stat.StatUtils.variance(sample2), sample1.length, sample2.length);
	}

	public double t(final double[] sample1, final double[] sample2) throws org.apache.commons.math3.exception.NullArgumentException, org.apache.commons.math3.exception.NumberIsTooSmallException {
		checkSampleData(sample1);
		checkSampleData(sample2);
		return t(org.apache.commons.math3.stat.StatUtils.mean(sample1), org.apache.commons.math3.stat.StatUtils.mean(sample2), org.apache.commons.math3.stat.StatUtils.variance(sample1), org.apache.commons.math3.stat.StatUtils.variance(sample2), sample1.length, sample2.length);
	}

	public double t(final org.apache.commons.math3.stat.descriptive.StatisticalSummary sampleStats1, final org.apache.commons.math3.stat.descriptive.StatisticalSummary sampleStats2) throws org.apache.commons.math3.exception.NullArgumentException, org.apache.commons.math3.exception.NumberIsTooSmallException {
		checkSampleData(sampleStats1);
		checkSampleData(sampleStats2);
		return t(sampleStats1.getMean(), sampleStats2.getMean(), sampleStats1.getVariance(), sampleStats2.getVariance(), sampleStats1.getN(), sampleStats2.getN());
	}

	public double homoscedasticT(final org.apache.commons.math3.stat.descriptive.StatisticalSummary sampleStats1, final org.apache.commons.math3.stat.descriptive.StatisticalSummary sampleStats2) throws org.apache.commons.math3.exception.NullArgumentException, org.apache.commons.math3.exception.NumberIsTooSmallException {
		checkSampleData(sampleStats1);
		checkSampleData(sampleStats2);
		return homoscedasticT(sampleStats1.getMean(), sampleStats2.getMean(), sampleStats1.getVariance(), sampleStats2.getVariance(), sampleStats1.getN(), sampleStats2.getN());
	}

	public double tTest(final double mu, final double[] sample) throws org.apache.commons.math3.exception.MaxCountExceededException, org.apache.commons.math3.exception.NullArgumentException, org.apache.commons.math3.exception.NumberIsTooSmallException {
		checkSampleData(sample);
		return tTest(org.apache.commons.math3.stat.StatUtils.mean(sample), mu, org.apache.commons.math3.stat.StatUtils.variance(sample), sample.length);
	}

	public boolean tTest(final double mu, final double[] sample, final double alpha) throws org.apache.commons.math3.exception.MaxCountExceededException, org.apache.commons.math3.exception.NullArgumentException, org.apache.commons.math3.exception.NumberIsTooSmallException, org.apache.commons.math3.exception.OutOfRangeException {
		checkSignificanceLevel(alpha);
		return (tTest(mu, sample)) < alpha;
	}

	public double tTest(final double mu, final org.apache.commons.math3.stat.descriptive.StatisticalSummary sampleStats) throws org.apache.commons.math3.exception.MaxCountExceededException, org.apache.commons.math3.exception.NullArgumentException, org.apache.commons.math3.exception.NumberIsTooSmallException {
		checkSampleData(sampleStats);
		return tTest(sampleStats.getMean(), mu, sampleStats.getVariance(), sampleStats.getN());
	}

	public boolean tTest(final double mu, final org.apache.commons.math3.stat.descriptive.StatisticalSummary sampleStats, final double alpha) throws org.apache.commons.math3.exception.MaxCountExceededException, org.apache.commons.math3.exception.NullArgumentException, org.apache.commons.math3.exception.NumberIsTooSmallException, org.apache.commons.math3.exception.OutOfRangeException {
		checkSignificanceLevel(alpha);
		return (tTest(mu, sampleStats)) < alpha;
	}

	public double tTest(final double[] sample1, final double[] sample2) throws org.apache.commons.math3.exception.MaxCountExceededException, org.apache.commons.math3.exception.NullArgumentException, org.apache.commons.math3.exception.NumberIsTooSmallException {
		checkSampleData(sample1);
		checkSampleData(sample2);
		return tTest(org.apache.commons.math3.stat.StatUtils.mean(sample1), org.apache.commons.math3.stat.StatUtils.mean(sample2), org.apache.commons.math3.stat.StatUtils.variance(sample1), org.apache.commons.math3.stat.StatUtils.variance(sample2), sample1.length, sample2.length);
	}

	public double homoscedasticTTest(final double[] sample1, final double[] sample2) throws org.apache.commons.math3.exception.MaxCountExceededException, org.apache.commons.math3.exception.NullArgumentException, org.apache.commons.math3.exception.NumberIsTooSmallException {
		checkSampleData(sample1);
		checkSampleData(sample2);
		return homoscedasticTTest(org.apache.commons.math3.stat.StatUtils.mean(sample1), org.apache.commons.math3.stat.StatUtils.mean(sample2), org.apache.commons.math3.stat.StatUtils.variance(sample1), org.apache.commons.math3.stat.StatUtils.variance(sample2), sample1.length, sample2.length);
	}

	public boolean tTest(final double[] sample1, final double[] sample2, final double alpha) throws org.apache.commons.math3.exception.MaxCountExceededException, org.apache.commons.math3.exception.NullArgumentException, org.apache.commons.math3.exception.NumberIsTooSmallException, org.apache.commons.math3.exception.OutOfRangeException {
		checkSignificanceLevel(alpha);
		return (tTest(sample1, sample2)) < alpha;
	}

	public boolean homoscedasticTTest(final double[] sample1, final double[] sample2, final double alpha) throws org.apache.commons.math3.exception.MaxCountExceededException, org.apache.commons.math3.exception.NullArgumentException, org.apache.commons.math3.exception.NumberIsTooSmallException, org.apache.commons.math3.exception.OutOfRangeException {
		checkSignificanceLevel(alpha);
		return (homoscedasticTTest(sample1, sample2)) < alpha;
	}

	public double tTest(final org.apache.commons.math3.stat.descriptive.StatisticalSummary sampleStats1, final org.apache.commons.math3.stat.descriptive.StatisticalSummary sampleStats2) throws org.apache.commons.math3.exception.MaxCountExceededException, org.apache.commons.math3.exception.NullArgumentException, org.apache.commons.math3.exception.NumberIsTooSmallException {
		checkSampleData(sampleStats1);
		checkSampleData(sampleStats2);
		return tTest(sampleStats1.getMean(), sampleStats2.getMean(), sampleStats1.getVariance(), sampleStats2.getVariance(), sampleStats1.getN(), sampleStats2.getN());
	}

	public double homoscedasticTTest(final org.apache.commons.math3.stat.descriptive.StatisticalSummary sampleStats1, final org.apache.commons.math3.stat.descriptive.StatisticalSummary sampleStats2) throws org.apache.commons.math3.exception.MaxCountExceededException, org.apache.commons.math3.exception.NullArgumentException, org.apache.commons.math3.exception.NumberIsTooSmallException {
		checkSampleData(sampleStats1);
		checkSampleData(sampleStats2);
		return homoscedasticTTest(sampleStats1.getMean(), sampleStats2.getMean(), sampleStats1.getVariance(), sampleStats2.getVariance(), sampleStats1.getN(), sampleStats2.getN());
	}

	public boolean tTest(final org.apache.commons.math3.stat.descriptive.StatisticalSummary sampleStats1, final org.apache.commons.math3.stat.descriptive.StatisticalSummary sampleStats2, final double alpha) throws org.apache.commons.math3.exception.MaxCountExceededException, org.apache.commons.math3.exception.NullArgumentException, org.apache.commons.math3.exception.NumberIsTooSmallException, org.apache.commons.math3.exception.OutOfRangeException {
		checkSignificanceLevel(alpha);
		return (tTest(sampleStats1, sampleStats2)) < alpha;
	}

	protected double df(double v1, double v2, double n1, double n2) {
		return (((v1 / n1) + (v2 / n2)) * ((v1 / n1) + (v2 / n2))) / (((v1 * v1) / ((n1 * n1) * (n1 - 1.0))) + ((v2 * v2) / ((n2 * n2) * (n2 - 1.0))));
	}

	protected double t(final double m, final double mu, final double v, final double n) {
		return (m - mu) / (org.apache.commons.math3.util.FastMath.sqrt((v / n)));
	}

	protected double t(final double m1, final double m2, final double v1, final double v2, final double n1, final double n2) {
		return (m1 - m2) / (org.apache.commons.math3.util.FastMath.sqrt(((v1 / n1) + (v2 / n2))));
	}

	protected double homoscedasticT(final double m1, final double m2, final double v1, final double v2, final double n1, final double n2) {
		final double pooledVariance = (((n1 - 1) * v1) + ((n2 - 1) * v2)) / ((n1 + n2) - 2);
		return (m1 - m2) / (org.apache.commons.math3.util.FastMath.sqrt((pooledVariance * ((1.0 / n1) + (1.0 / n2)))));
	}

	protected double tTest(final double m, final double mu, final double v, final double n) throws org.apache.commons.math3.exception.MathIllegalArgumentException, org.apache.commons.math3.exception.MaxCountExceededException {
		double t = org.apache.commons.math3.util.FastMath.abs(t(m, mu, v, n));
		org.apache.commons.math3.distribution.TDistribution distribution = new org.apache.commons.math3.distribution.TDistribution((n - 1));
		return 2.0 * (distribution.cumulativeProbability((-t)));
	}

	protected double tTest(final double m1, final double m2, final double v1, final double v2, final double n1, final double n2) throws org.apache.commons.math3.exception.MaxCountExceededException, org.apache.commons.math3.exception.NotStrictlyPositiveException {
		final double t = org.apache.commons.math3.util.FastMath.abs(t(m1, m2, v1, v2, n1, n2));
		final double degreesOfFreedom = df(v1, v2, n1, n2);
		org.apache.commons.math3.distribution.TDistribution distribution = new org.apache.commons.math3.distribution.TDistribution(degreesOfFreedom);
		return 2.0 * (distribution.cumulativeProbability((-t)));
	}

	protected double homoscedasticTTest(double m1, double m2, double v1, double v2, double n1, double n2) throws org.apache.commons.math3.exception.MaxCountExceededException, org.apache.commons.math3.exception.NotStrictlyPositiveException {
		final double t = org.apache.commons.math3.util.FastMath.abs(homoscedasticT(m1, m2, v1, v2, n1, n2));
		final double degreesOfFreedom = (n1 + n2) - 2;
		org.apache.commons.math3.distribution.TDistribution distribution = new org.apache.commons.math3.distribution.TDistribution(degreesOfFreedom);
		return 2.0 * (distribution.cumulativeProbability((-t)));
	}

	private void checkSignificanceLevel(final double alpha) throws org.apache.commons.math3.exception.OutOfRangeException {
		if ((alpha <= 0) || (alpha > 0.5)) {
			throw new org.apache.commons.math3.exception.OutOfRangeException(org.apache.commons.math3.exception.util.LocalizedFormats.SIGNIFICANCE_LEVEL, alpha, 0.0, 0.5);
		}
	}

	private void checkSampleData(final double[] data) throws org.apache.commons.math3.exception.NullArgumentException, org.apache.commons.math3.exception.NumberIsTooSmallException {
		if (data == null) {
			throw new org.apache.commons.math3.exception.NullArgumentException();
		}
		if ((data.length) < 2) {
			throw new org.apache.commons.math3.exception.NumberIsTooSmallException(org.apache.commons.math3.exception.util.LocalizedFormats.INSUFFICIENT_DATA_FOR_T_STATISTIC, data.length, 2, true);
		}
	}

	private void checkSampleData(final org.apache.commons.math3.stat.descriptive.StatisticalSummary stat) throws org.apache.commons.math3.exception.NullArgumentException, org.apache.commons.math3.exception.NumberIsTooSmallException {
		if (stat == null) {
			throw new org.apache.commons.math3.exception.NullArgumentException();
		}
		if ((stat.getN()) < 2) {
			throw new org.apache.commons.math3.exception.NumberIsTooSmallException(org.apache.commons.math3.exception.util.LocalizedFormats.INSUFFICIENT_DATA_FOR_T_STATISTIC, stat.getN(), 2, true);
		}
	}
}

