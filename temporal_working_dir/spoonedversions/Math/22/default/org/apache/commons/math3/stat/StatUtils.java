

package org.apache.commons.math3.stat;


public final class StatUtils {
	private static final org.apache.commons.math3.stat.descriptive.UnivariateStatistic SUM = new org.apache.commons.math3.stat.descriptive.summary.Sum();

	private static final org.apache.commons.math3.stat.descriptive.UnivariateStatistic SUM_OF_SQUARES = new org.apache.commons.math3.stat.descriptive.summary.SumOfSquares();

	private static final org.apache.commons.math3.stat.descriptive.UnivariateStatistic PRODUCT = new org.apache.commons.math3.stat.descriptive.summary.Product();

	private static final org.apache.commons.math3.stat.descriptive.UnivariateStatistic SUM_OF_LOGS = new org.apache.commons.math3.stat.descriptive.summary.SumOfLogs();

	private static final org.apache.commons.math3.stat.descriptive.UnivariateStatistic MIN = new org.apache.commons.math3.stat.descriptive.rank.Min();

	private static final org.apache.commons.math3.stat.descriptive.UnivariateStatistic MAX = new org.apache.commons.math3.stat.descriptive.rank.Max();

	private static final org.apache.commons.math3.stat.descriptive.UnivariateStatistic MEAN = new org.apache.commons.math3.stat.descriptive.moment.Mean();

	private static final org.apache.commons.math3.stat.descriptive.moment.Variance VARIANCE = new org.apache.commons.math3.stat.descriptive.moment.Variance();

	private static final org.apache.commons.math3.stat.descriptive.rank.Percentile PERCENTILE = new org.apache.commons.math3.stat.descriptive.rank.Percentile();

	private static final org.apache.commons.math3.stat.descriptive.moment.GeometricMean GEOMETRIC_MEAN = new org.apache.commons.math3.stat.descriptive.moment.GeometricMean();

	private StatUtils() {
	}

	public static double sum(final double[] values) throws org.apache.commons.math3.exception.MathIllegalArgumentException {
		return org.apache.commons.math3.stat.StatUtils.SUM.evaluate(values);
	}

	public static double sum(final double[] values, final int begin, final int length) throws org.apache.commons.math3.exception.MathIllegalArgumentException {
		return org.apache.commons.math3.stat.StatUtils.SUM.evaluate(values, begin, length);
	}

	public static double sumSq(final double[] values) throws org.apache.commons.math3.exception.MathIllegalArgumentException {
		return org.apache.commons.math3.stat.StatUtils.SUM_OF_SQUARES.evaluate(values);
	}

	public static double sumSq(final double[] values, final int begin, final int length) throws org.apache.commons.math3.exception.MathIllegalArgumentException {
		return org.apache.commons.math3.stat.StatUtils.SUM_OF_SQUARES.evaluate(values, begin, length);
	}

	public static double product(final double[] values) throws org.apache.commons.math3.exception.MathIllegalArgumentException {
		return org.apache.commons.math3.stat.StatUtils.PRODUCT.evaluate(values);
	}

	public static double product(final double[] values, final int begin, final int length) throws org.apache.commons.math3.exception.MathIllegalArgumentException {
		return org.apache.commons.math3.stat.StatUtils.PRODUCT.evaluate(values, begin, length);
	}

	public static double sumLog(final double[] values) throws org.apache.commons.math3.exception.MathIllegalArgumentException {
		return org.apache.commons.math3.stat.StatUtils.SUM_OF_LOGS.evaluate(values);
	}

	public static double sumLog(final double[] values, final int begin, final int length) throws org.apache.commons.math3.exception.MathIllegalArgumentException {
		return org.apache.commons.math3.stat.StatUtils.SUM_OF_LOGS.evaluate(values, begin, length);
	}

	public static double mean(final double[] values) throws org.apache.commons.math3.exception.MathIllegalArgumentException {
		return org.apache.commons.math3.stat.StatUtils.MEAN.evaluate(values);
	}

	public static double mean(final double[] values, final int begin, final int length) throws org.apache.commons.math3.exception.MathIllegalArgumentException {
		return org.apache.commons.math3.stat.StatUtils.MEAN.evaluate(values, begin, length);
	}

	public static double geometricMean(final double[] values) throws org.apache.commons.math3.exception.MathIllegalArgumentException {
		return org.apache.commons.math3.stat.StatUtils.GEOMETRIC_MEAN.evaluate(values);
	}

	public static double geometricMean(final double[] values, final int begin, final int length) throws org.apache.commons.math3.exception.MathIllegalArgumentException {
		return org.apache.commons.math3.stat.StatUtils.GEOMETRIC_MEAN.evaluate(values, begin, length);
	}

	public static double variance(final double[] values) {
		return org.apache.commons.math3.stat.StatUtils.VARIANCE.evaluate(values);
	}

	public static double variance(final double[] values, final int begin, final int length) {
		return org.apache.commons.math3.stat.StatUtils.VARIANCE.evaluate(values, begin, length);
	}

	public static double variance(final double[] values, final double mean, final int begin, final int length) {
		return org.apache.commons.math3.stat.StatUtils.VARIANCE.evaluate(values, mean, begin, length);
	}

	public static double variance(final double[] values, final double mean) {
		return org.apache.commons.math3.stat.StatUtils.VARIANCE.evaluate(values, mean);
	}

	public static double populationVariance(final double[] values) {
		return new org.apache.commons.math3.stat.descriptive.moment.Variance(false).evaluate(values);
	}

	public static double populationVariance(final double[] values, final int begin, final int length) {
		return new org.apache.commons.math3.stat.descriptive.moment.Variance(false).evaluate(values, begin, length);
	}

	public static double populationVariance(final double[] values, final double mean, final int begin, final int length) {
		return new org.apache.commons.math3.stat.descriptive.moment.Variance(false).evaluate(values, mean, begin, length);
	}

	public static double populationVariance(final double[] values, final double mean) {
		return new org.apache.commons.math3.stat.descriptive.moment.Variance(false).evaluate(values, mean);
	}

	public static double max(final double[] values) {
		return org.apache.commons.math3.stat.StatUtils.MAX.evaluate(values);
	}

	public static double max(final double[] values, final int begin, final int length) {
		return org.apache.commons.math3.stat.StatUtils.MAX.evaluate(values, begin, length);
	}

	public static double min(final double[] values) {
		return org.apache.commons.math3.stat.StatUtils.MIN.evaluate(values);
	}

	public static double min(final double[] values, final int begin, final int length) {
		return org.apache.commons.math3.stat.StatUtils.MIN.evaluate(values, begin, length);
	}

	public static double percentile(final double[] values, final double p) {
		return org.apache.commons.math3.stat.StatUtils.PERCENTILE.evaluate(values, p);
	}

	public static double percentile(final double[] values, final int begin, final int length, final double p) {
		return org.apache.commons.math3.stat.StatUtils.PERCENTILE.evaluate(values, begin, length, p);
	}

	public static double sumDifference(final double[] sample1, final double[] sample2) {
		int n = sample1.length;
		if (n != (sample2.length)) {
			throw new org.apache.commons.math3.exception.DimensionMismatchException(n, sample2.length);
		}
		if (n <= 0) {
			throw new org.apache.commons.math3.exception.NoDataException(org.apache.commons.math3.exception.util.LocalizedFormats.INSUFFICIENT_DIMENSION);
		}
		double result = 0;
		for (int i = 0; i < n; i++) {
			result += (sample1[i]) - (sample2[i]);
		}
		return result;
	}

	public static double meanDifference(final double[] sample1, final double[] sample2) {
		return (org.apache.commons.math3.stat.StatUtils.sumDifference(sample1, sample2)) / (sample1.length);
	}

	public static double varianceDifference(final double[] sample1, final double[] sample2, double meanDifference) {
		double sum1 = 0.0;
		double sum2 = 0.0;
		double diff = 0.0;
		int n = sample1.length;
		if (n != (sample2.length)) {
			throw new org.apache.commons.math3.exception.DimensionMismatchException(n, sample2.length);
		}
		if (n < 2) {
			throw new org.apache.commons.math3.exception.NumberIsTooSmallException(n, 2, true);
		}
		for (int i = 0; i < n; i++) {
			diff = (sample1[i]) - (sample2[i]);
			sum1 += (diff - meanDifference) * (diff - meanDifference);
			sum2 += diff - meanDifference;
		}
		return (sum1 - ((sum2 * sum2) / n)) / (n - 1);
	}

	public static double[] normalize(final double[] sample) {
		org.apache.commons.math3.stat.descriptive.DescriptiveStatistics stats = new org.apache.commons.math3.stat.descriptive.DescriptiveStatistics();
		for (int i = 0; i < (sample.length); i++) {
			stats.addValue(sample[i]);
		}
		double mean = stats.getMean();
		double standardDeviation = stats.getStandardDeviation();
		double[] standardizedSample = new double[sample.length];
		for (int i = 0; i < (sample.length); i++) {
			standardizedSample[i] = ((sample[i]) - mean) / standardDeviation;
		}
		return standardizedSample;
	}
}

