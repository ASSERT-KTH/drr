

package org.apache.commons.math3.stat.inference;


public class GTest {
	public double g(final double[] expected, final long[] observed) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.NotPositiveException, org.apache.commons.math3.exception.NotStrictlyPositiveException {
		if ((expected.length) < 2) {
			throw new org.apache.commons.math3.exception.DimensionMismatchException(expected.length, 2);
		}
		if ((expected.length) != (observed.length)) {
			throw new org.apache.commons.math3.exception.DimensionMismatchException(expected.length, observed.length);
		}
		org.apache.commons.math3.util.MathArrays.checkPositive(expected);
		org.apache.commons.math3.util.MathArrays.checkNonNegative(observed);
		double sumExpected = 0.0;
		double sumObserved = 0.0;
		for (int i = 0; i < (observed.length); i++) {
			sumExpected += expected[i];
			sumObserved += observed[i];
		}
		double ratio = 1.0;
		boolean rescale = false;
		if ((java.lang.Math.abs((sumExpected - sumObserved))) > 1.0E-5) {
			ratio = sumObserved / sumExpected;
			rescale = true;
		}
		double sum = 0.0;
		for (int i = 0; i < (observed.length); i++) {
			final double dev = rescale ? org.apache.commons.math3.util.FastMath.log((((double) (observed[i])) / (ratio * (expected[i])))) : org.apache.commons.math3.util.FastMath.log((((double) (observed[i])) / (expected[i])));
			sum += ((double) (observed[i])) * dev;
		}
		return 2.0 * sum;
	}

	public double gTest(final double[] expected, final long[] observed) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.MaxCountExceededException, org.apache.commons.math3.exception.NotPositiveException, org.apache.commons.math3.exception.NotStrictlyPositiveException {
		final org.apache.commons.math3.distribution.ChiSquaredDistribution distribution = new org.apache.commons.math3.distribution.ChiSquaredDistribution(((expected.length) - 1.0));
		return 1.0 - (distribution.cumulativeProbability(g(expected, observed)));
	}

	public double gTestIntrinsic(final double[] expected, final long[] observed) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.MaxCountExceededException, org.apache.commons.math3.exception.NotPositiveException, org.apache.commons.math3.exception.NotStrictlyPositiveException {
		final org.apache.commons.math3.distribution.ChiSquaredDistribution distribution = new org.apache.commons.math3.distribution.ChiSquaredDistribution(((expected.length) - 2.0));
		return 1.0 - (distribution.cumulativeProbability(g(expected, observed)));
	}

	public boolean gTest(final double[] expected, final long[] observed, final double alpha) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.MaxCountExceededException, org.apache.commons.math3.exception.NotPositiveException, org.apache.commons.math3.exception.NotStrictlyPositiveException, org.apache.commons.math3.exception.OutOfRangeException {
		if ((alpha <= 0) || (alpha > 0.5)) {
			throw new org.apache.commons.math3.exception.OutOfRangeException(org.apache.commons.math3.exception.util.LocalizedFormats.OUT_OF_BOUND_SIGNIFICANCE_LEVEL, alpha, 0, 0.5);
		}
		return (gTest(expected, observed)) < alpha;
	}

	private double entropy(final long[][] k) {
		double h = 0.0;
		double sum_k = 0.0;
		for (int i = 0; i < (k.length); i++) {
			for (int j = 0; j < (k[i].length); j++) {
				sum_k += ((double) (k[i][j]));
			}
		}
		for (int i = 0; i < (k.length); i++) {
			for (int j = 0; j < (k[i].length); j++) {
				if ((k[i][j]) != 0) {
					final double p_ij = ((double) (k[i][j])) / sum_k;
					h += p_ij * (java.lang.Math.log(p_ij));
				}
			}
		}
		return -h;
	}

	private double entropy(final long[] k) {
		double h = 0.0;
		double sum_k = 0.0;
		for (int i = 0; i < (k.length); i++) {
			sum_k += ((double) (k[i]));
		}
		for (int i = 0; i < (k.length); i++) {
			if ((k[i]) != 0) {
				final double p_i = ((double) (k[i])) / sum_k;
				h += p_i * (java.lang.Math.log(p_i));
			}
		}
		return -h;
	}

	public double gDataSetsComparison(final long[] observed1, final long[] observed2) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.NotPositiveException, org.apache.commons.math3.exception.ZeroException {
		if ((observed1.length) < 2) {
			throw new org.apache.commons.math3.exception.DimensionMismatchException(observed1.length, 2);
		}
		if ((observed1.length) != (observed2.length)) {
			throw new org.apache.commons.math3.exception.DimensionMismatchException(observed1.length, observed2.length);
		}
		org.apache.commons.math3.util.MathArrays.checkNonNegative(observed1);
		org.apache.commons.math3.util.MathArrays.checkNonNegative(observed2);
		long countSum1 = 0;
		long countSum2 = 0;
		final long[] collSums = new long[observed1.length];
		final long[][] k = new long[2][observed1.length];
		for (int i = 0; i < (observed1.length); i++) {
			if (((observed1[i]) == 0) && ((observed2[i]) == 0)) {
				throw new org.apache.commons.math3.exception.ZeroException(org.apache.commons.math3.exception.util.LocalizedFormats.OBSERVED_COUNTS_BOTTH_ZERO_FOR_ENTRY, i);
			}else {
				countSum1 += observed1[i];
				countSum2 += observed2[i];
				collSums[i] = (observed1[i]) + (observed2[i]);
				k[0][i] = observed1[i];
				k[1][i] = observed2[i];
			}
		}
		if ((countSum1 == 0) || (countSum2 == 0)) {
			throw new org.apache.commons.math3.exception.ZeroException();
		}
		final long[] rowSums = new long[]{ countSum1 , countSum2 };
		final double sum = ((double) (countSum1)) + ((double) (countSum2));
		return (2 * sum) * (((entropy(rowSums)) + (entropy(collSums))) - (entropy(k)));
	}

	public double rootLogLikelihoodRatio(final long k11, long k12, final long k21, final long k22) {
		final double llr = gDataSetsComparison(new long[]{ k11 , k12 }, new long[]{ k21 , k22 });
		double sqrt = org.apache.commons.math3.util.FastMath.sqrt(llr);
		if ((((double) (k11)) / (k11 + k12)) < (((double) (k21)) / (k21 + k22))) {
			sqrt = -sqrt;
		}
		return sqrt;
	}

	public double gTestDataSetsComparison(final long[] observed1, final long[] observed2) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.MaxCountExceededException, org.apache.commons.math3.exception.NotPositiveException, org.apache.commons.math3.exception.ZeroException {
		final org.apache.commons.math3.distribution.ChiSquaredDistribution distribution = new org.apache.commons.math3.distribution.ChiSquaredDistribution((((double) (observed1.length)) - 1));
		return 1 - (distribution.cumulativeProbability(gDataSetsComparison(observed1, observed2)));
	}

	public boolean gTestDataSetsComparison(final long[] observed1, final long[] observed2, final double alpha) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.MaxCountExceededException, org.apache.commons.math3.exception.NotPositiveException, org.apache.commons.math3.exception.OutOfRangeException, org.apache.commons.math3.exception.ZeroException {
		if ((alpha <= 0) || (alpha > 0.5)) {
			throw new org.apache.commons.math3.exception.OutOfRangeException(org.apache.commons.math3.exception.util.LocalizedFormats.OUT_OF_BOUND_SIGNIFICANCE_LEVEL, alpha, 0, 0.5);
		}
		return (gTestDataSetsComparison(observed1, observed2)) < alpha;
	}
}

