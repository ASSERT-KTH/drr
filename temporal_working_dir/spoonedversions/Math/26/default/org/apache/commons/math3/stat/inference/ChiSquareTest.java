

package org.apache.commons.math3.stat.inference;


public class ChiSquareTest {
	public ChiSquareTest() {
		super();
	}

	public double chiSquare(final double[] expected, final long[] observed) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.NotPositiveException, org.apache.commons.math3.exception.NotStrictlyPositiveException {
		if ((expected.length) < 2) {
			throw new org.apache.commons.math3.exception.DimensionMismatchException(expected.length, 2);
		}
		if ((expected.length) != (observed.length)) {
			throw new org.apache.commons.math3.exception.DimensionMismatchException(expected.length, observed.length);
		}
		checkPositive(expected);
		checkNonNegative(observed);
		double sumExpected = 0.0;
		double sumObserved = 0.0;
		for (int i = 0; i < (observed.length); i++) {
			sumExpected += expected[i];
			sumObserved += observed[i];
		}
		double ratio = 1.0;
		boolean rescale = false;
		if ((org.apache.commons.math3.util.FastMath.abs((sumExpected - sumObserved))) > 1.0E-5) {
			ratio = sumObserved / sumExpected;
			rescale = true;
		}
		double sumSq = 0.0;
		for (int i = 0; i < (observed.length); i++) {
			if (rescale) {
				final double dev = (observed[i]) - (ratio * (expected[i]));
				sumSq += (dev * dev) / (ratio * (expected[i]));
			}else {
				final double dev = (observed[i]) - (expected[i]);
				sumSq += (dev * dev) / (expected[i]);
			}
		}
		return sumSq;
	}

	public double chiSquareTest(final double[] expected, final long[] observed) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.MaxCountExceededException, org.apache.commons.math3.exception.NotPositiveException, org.apache.commons.math3.exception.NotStrictlyPositiveException {
		org.apache.commons.math3.distribution.ChiSquaredDistribution distribution = new org.apache.commons.math3.distribution.ChiSquaredDistribution(((expected.length) - 1.0));
		return 1.0 - (distribution.cumulativeProbability(chiSquare(expected, observed)));
	}

	public boolean chiSquareTest(final double[] expected, final long[] observed, final double alpha) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.MaxCountExceededException, org.apache.commons.math3.exception.NotPositiveException, org.apache.commons.math3.exception.NotStrictlyPositiveException, org.apache.commons.math3.exception.OutOfRangeException {
		if ((alpha <= 0) || (alpha > 0.5)) {
			throw new org.apache.commons.math3.exception.OutOfRangeException(org.apache.commons.math3.exception.util.LocalizedFormats.OUT_OF_BOUND_SIGNIFICANCE_LEVEL, alpha, 0, 0.5);
		}
		return (chiSquareTest(expected, observed)) < alpha;
	}

	public double chiSquare(final long[][] counts) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.NotPositiveException, org.apache.commons.math3.exception.NullArgumentException {
		checkArray(counts);
		int nRows = counts.length;
		int nCols = counts[0].length;
		double[] rowSum = new double[nRows];
		double[] colSum = new double[nCols];
		double total = 0.0;
		for (int row = 0; row < nRows; row++) {
			for (int col = 0; col < nCols; col++) {
				rowSum[row] += counts[row][col];
				colSum[col] += counts[row][col];
				total += counts[row][col];
			}
		}
		double sumSq = 0.0;
		double expected = 0.0;
		for (int row = 0; row < nRows; row++) {
			for (int col = 0; col < nCols; col++) {
				expected = ((rowSum[row]) * (colSum[col])) / total;
				sumSq += (((counts[row][col]) - expected) * ((counts[row][col]) - expected)) / expected;
			}
		}
		return sumSq;
	}

	public double chiSquareTest(final long[][] counts) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.MaxCountExceededException, org.apache.commons.math3.exception.NotPositiveException, org.apache.commons.math3.exception.NullArgumentException {
		checkArray(counts);
		double df = (((double) (counts.length)) - 1) * (((double) (counts[0].length)) - 1);
		org.apache.commons.math3.distribution.ChiSquaredDistribution distribution;
		distribution = new org.apache.commons.math3.distribution.ChiSquaredDistribution(df);
		return 1 - (distribution.cumulativeProbability(chiSquare(counts)));
	}

	public boolean chiSquareTest(final long[][] counts, final double alpha) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.MaxCountExceededException, org.apache.commons.math3.exception.NotPositiveException, org.apache.commons.math3.exception.NullArgumentException, org.apache.commons.math3.exception.OutOfRangeException {
		if ((alpha <= 0) || (alpha > 0.5)) {
			throw new org.apache.commons.math3.exception.OutOfRangeException(org.apache.commons.math3.exception.util.LocalizedFormats.OUT_OF_BOUND_SIGNIFICANCE_LEVEL, alpha, 0, 0.5);
		}
		return (chiSquareTest(counts)) < alpha;
	}

	public double chiSquareDataSetsComparison(long[] observed1, long[] observed2) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.NotPositiveException, org.apache.commons.math3.exception.ZeroException {
		if ((observed1.length) < 2) {
			throw new org.apache.commons.math3.exception.DimensionMismatchException(observed1.length, 2);
		}
		if ((observed1.length) != (observed2.length)) {
			throw new org.apache.commons.math3.exception.DimensionMismatchException(observed1.length, observed2.length);
		}
		checkNonNegative(observed1);
		checkNonNegative(observed2);
		long countSum1 = 0;
		long countSum2 = 0;
		boolean unequalCounts = false;
		double weight = 0.0;
		for (int i = 0; i < (observed1.length); i++) {
			countSum1 += observed1[i];
			countSum2 += observed2[i];
		}
		if ((countSum1 == 0) || (countSum2 == 0)) {
			throw new org.apache.commons.math3.exception.ZeroException();
		}
		unequalCounts = countSum1 != countSum2;
		if (unequalCounts) {
			weight = org.apache.commons.math3.util.FastMath.sqrt((((double) (countSum1)) / ((double) (countSum2))));
		}
		double sumSq = 0.0;
		double dev = 0.0;
		double obs1 = 0.0;
		double obs2 = 0.0;
		for (int i = 0; i < (observed1.length); i++) {
			if (((observed1[i]) == 0) && ((observed2[i]) == 0)) {
				throw new org.apache.commons.math3.exception.ZeroException(org.apache.commons.math3.exception.util.LocalizedFormats.OBSERVED_COUNTS_BOTTH_ZERO_FOR_ENTRY, i);
			}else {
				obs1 = observed1[i];
				obs2 = observed2[i];
				if (unequalCounts) {
					dev = (obs1 / weight) - (obs2 * weight);
				}else {
					dev = obs1 - obs2;
				}
				sumSq += (dev * dev) / (obs1 + obs2);
			}
		}
		return sumSq;
	}

	public double chiSquareTestDataSetsComparison(long[] observed1, long[] observed2) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.MaxCountExceededException, org.apache.commons.math3.exception.NotPositiveException, org.apache.commons.math3.exception.ZeroException {
		org.apache.commons.math3.distribution.ChiSquaredDistribution distribution;
		distribution = new org.apache.commons.math3.distribution.ChiSquaredDistribution((((double) (observed1.length)) - 1));
		return 1 - (distribution.cumulativeProbability(chiSquareDataSetsComparison(observed1, observed2)));
	}

	public boolean chiSquareTestDataSetsComparison(final long[] observed1, final long[] observed2, final double alpha) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.MaxCountExceededException, org.apache.commons.math3.exception.NotPositiveException, org.apache.commons.math3.exception.OutOfRangeException, org.apache.commons.math3.exception.ZeroException {
		if ((alpha <= 0) || (alpha > 0.5)) {
			throw new org.apache.commons.math3.exception.OutOfRangeException(org.apache.commons.math3.exception.util.LocalizedFormats.OUT_OF_BOUND_SIGNIFICANCE_LEVEL, alpha, 0, 0.5);
		}
		return (chiSquareTestDataSetsComparison(observed1, observed2)) < alpha;
	}

	private void checkArray(final long[][] in) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.NotPositiveException, org.apache.commons.math3.exception.NullArgumentException {
		if ((in.length) < 2) {
			throw new org.apache.commons.math3.exception.DimensionMismatchException(in.length, 2);
		}
		if ((in[0].length) < 2) {
			throw new org.apache.commons.math3.exception.DimensionMismatchException(in[0].length, 2);
		}
		checkRectangular(in);
		checkNonNegative(in);
	}

	private void checkRectangular(final long[][] in) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.NullArgumentException {
		org.apache.commons.math3.util.MathUtils.checkNotNull(in);
		for (int i = 1; i < (in.length); i++) {
			if ((in[i].length) != (in[0].length)) {
				throw new org.apache.commons.math3.exception.DimensionMismatchException(org.apache.commons.math3.exception.util.LocalizedFormats.DIFFERENT_ROWS_LENGTHS, in[i].length, in[0].length);
			}
		}
	}

	private void checkPositive(final double[] in) throws org.apache.commons.math3.exception.NotStrictlyPositiveException {
		for (int i = 0; i < (in.length); i++) {
			if ((in[i]) <= 0) {
				throw new org.apache.commons.math3.exception.NotStrictlyPositiveException(in[i]);
			}
		}
	}

	private void checkNonNegative(final long[] in) throws org.apache.commons.math3.exception.NotPositiveException {
		for (int i = 0; i < (in.length); i++) {
			if ((in[i]) < 0) {
				throw new org.apache.commons.math3.exception.NotPositiveException(in[i]);
			}
		}
	}

	private void checkNonNegative(final long[][] in) throws org.apache.commons.math3.exception.NotPositiveException {
		for (int i = 0; i < (in.length); i++) {
			for (int j = 0; j < (in[i].length); j++) {
				if ((in[i][j]) < 0) {
					throw new org.apache.commons.math3.exception.NotPositiveException(in[i][j]);
				}
			}
		}
	}
}

