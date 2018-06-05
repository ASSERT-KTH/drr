

package org.apache.commons.math.stat;


public final class StatUtils {
	private static final org.apache.commons.math.stat.descriptive.UnivariateStatistic sum = new org.apache.commons.math.stat.descriptive.summary.Sum();

	private static final org.apache.commons.math.stat.descriptive.UnivariateStatistic sumSq = new org.apache.commons.math.stat.descriptive.summary.SumOfSquares();

	private static final org.apache.commons.math.stat.descriptive.UnivariateStatistic prod = new org.apache.commons.math.stat.descriptive.summary.Product();

	private static final org.apache.commons.math.stat.descriptive.UnivariateStatistic sumLog = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();

	private static final org.apache.commons.math.stat.descriptive.UnivariateStatistic min = new org.apache.commons.math.stat.descriptive.rank.Min();

	private static final org.apache.commons.math.stat.descriptive.UnivariateStatistic max = new org.apache.commons.math.stat.descriptive.rank.Max();

	private static final org.apache.commons.math.stat.descriptive.UnivariateStatistic mean = new org.apache.commons.math.stat.descriptive.moment.Mean();

	private static final org.apache.commons.math.stat.descriptive.moment.Variance variance = new org.apache.commons.math.stat.descriptive.moment.Variance();

	private static final org.apache.commons.math.stat.descriptive.rank.Percentile percentile = new org.apache.commons.math.stat.descriptive.rank.Percentile();

	private static final org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean = new org.apache.commons.math.stat.descriptive.moment.GeometricMean();

	private StatUtils() {
	}

	public static double sum(final double[] values) {
		return org.apache.commons.math.stat.StatUtils.sum.evaluate(values);
	}

	public static double sum(final double[] values, final int begin, final int length) {
		return org.apache.commons.math.stat.StatUtils.sum.evaluate(values, begin, length);
	}

	public static double sumSq(final double[] values) {
		return org.apache.commons.math.stat.StatUtils.sumSq.evaluate(values);
	}

	public static double sumSq(final double[] values, final int begin, final int length) {
		return org.apache.commons.math.stat.StatUtils.sumSq.evaluate(values, begin, length);
	}

	public static double product(final double[] values) {
		return org.apache.commons.math.stat.StatUtils.prod.evaluate(values);
	}

	public static double product(final double[] values, final int begin, final int length) {
		return org.apache.commons.math.stat.StatUtils.prod.evaluate(values, begin, length);
	}

	public static double sumLog(final double[] values) {
		return org.apache.commons.math.stat.StatUtils.sumLog.evaluate(values);
	}

	public static double sumLog(final double[] values, final int begin, final int length) {
		return org.apache.commons.math.stat.StatUtils.sumLog.evaluate(values, begin, length);
	}

	public static double mean(final double[] values) {
		return org.apache.commons.math.stat.StatUtils.mean.evaluate(values);
	}

	public static double mean(final double[] values, final int begin, final int length) {
		return org.apache.commons.math.stat.StatUtils.mean.evaluate(values, begin, length);
	}

	public static double geometricMean(final double[] values) {
		return org.apache.commons.math.stat.StatUtils.geometricMean.evaluate(values);
	}

	public static double geometricMean(final double[] values, final int begin, final int length) {
		return org.apache.commons.math.stat.StatUtils.geometricMean.evaluate(values, begin, length);
	}

	public static double variance(final double[] values) {
		return org.apache.commons.math.stat.StatUtils.variance.evaluate(values);
	}

	public static double variance(final double[] values, final int begin, final int length) {
		return org.apache.commons.math.stat.StatUtils.variance.evaluate(values, begin, length);
	}

	public static double variance(final double[] values, final double mean, final int begin, final int length) {
		return org.apache.commons.math.stat.StatUtils.variance.evaluate(values, mean, begin, length);
	}

	public static double variance(final double[] values, final double mean) {
		return org.apache.commons.math.stat.StatUtils.variance.evaluate(values, mean);
	}

	public static double max(final double[] values) {
		return org.apache.commons.math.stat.StatUtils.max.evaluate(values);
	}

	public static double max(final double[] values, final int begin, final int length) {
		return org.apache.commons.math.stat.StatUtils.max.evaluate(values, begin, length);
	}

	public static double min(final double[] values) {
		return org.apache.commons.math.stat.StatUtils.min.evaluate(values);
	}

	public static double min(final double[] values, final int begin, final int length) {
		return org.apache.commons.math.stat.StatUtils.min.evaluate(values, begin, length);
	}

	public static double percentile(final double[] values, final double p) {
		return org.apache.commons.math.stat.StatUtils.percentile.evaluate(values, p);
	}

	public static double percentile(final double[] values, final int begin, final int length, final double p) {
		return org.apache.commons.math.stat.StatUtils.percentile.evaluate(values, begin, length, p);
	}

	public static double sumDifference(final double[] sample1, final double[] sample2) throws java.lang.IllegalArgumentException {
		int n = sample1.length;
		if ((n != (sample2.length)) || (n < 1)) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("input arrays must have the same positive length ({0} and {1})", n, sample2.length);
		}
		double result = 0;
		for (int i = 0; i < n; i++) {
			result += (sample1[i]) - (sample2[i]);
		}
		return result;
	}

	public static double meanDifference(final double[] sample1, final double[] sample2) throws java.lang.IllegalArgumentException {
		return (org.apache.commons.math.stat.StatUtils.sumDifference(sample1, sample2)) / (sample1.length);
	}

	public static double varianceDifference(final double[] sample1, final double[] sample2, double meanDifference) throws java.lang.IllegalArgumentException {
		double sum1 = 0.0;
		double sum2 = 0.0;
		double diff = 0.0;
		int n = sample1.length;
		if ((n < 2) || (n != (sample2.length))) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("input arrays must have the same length and at least two elements ({0} and {1})", n, sample2.length);
		}
		for (int i = 0; i < n; i++) {
			diff = (sample1[i]) - (sample2[i]);
			sum1 += (diff - meanDifference) * (diff - meanDifference);
			sum2 += diff - meanDifference;
		}
		return (sum1 - ((sum2 * sum2) / n)) / (n - 1);
	}
}

