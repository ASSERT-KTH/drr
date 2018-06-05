

package org.apache.commons.math3.stat.inference;


public class TestUtils {
	private static final org.apache.commons.math3.stat.inference.TTest T_TEST = new org.apache.commons.math3.stat.inference.TTest();

	private static final org.apache.commons.math3.stat.inference.ChiSquareTest CHI_SQUARE_TEST = new org.apache.commons.math3.stat.inference.ChiSquareTest();

	private static final org.apache.commons.math3.stat.inference.OneWayAnova ONE_WAY_ANANOVA = new org.apache.commons.math3.stat.inference.OneWayAnova();

	private static final org.apache.commons.math3.stat.inference.GTest G_TEST = new org.apache.commons.math3.stat.inference.GTest();

	private TestUtils() {
		super();
	}

	public static double homoscedasticT(final double[] sample1, final double[] sample2) throws org.apache.commons.math3.exception.NullArgumentException, org.apache.commons.math3.exception.NumberIsTooSmallException {
		return org.apache.commons.math3.stat.inference.TestUtils.T_TEST.homoscedasticT(sample1, sample2);
	}

	public static double homoscedasticT(final org.apache.commons.math3.stat.descriptive.StatisticalSummary sampleStats1, final org.apache.commons.math3.stat.descriptive.StatisticalSummary sampleStats2) throws org.apache.commons.math3.exception.NullArgumentException, org.apache.commons.math3.exception.NumberIsTooSmallException {
		return org.apache.commons.math3.stat.inference.TestUtils.T_TEST.homoscedasticT(sampleStats1, sampleStats2);
	}

	public static boolean homoscedasticTTest(final double[] sample1, final double[] sample2, final double alpha) throws org.apache.commons.math3.exception.MaxCountExceededException, org.apache.commons.math3.exception.NullArgumentException, org.apache.commons.math3.exception.NumberIsTooSmallException, org.apache.commons.math3.exception.OutOfRangeException {
		return org.apache.commons.math3.stat.inference.TestUtils.T_TEST.homoscedasticTTest(sample1, sample2, alpha);
	}

	public static double homoscedasticTTest(final double[] sample1, final double[] sample2) throws org.apache.commons.math3.exception.MaxCountExceededException, org.apache.commons.math3.exception.NullArgumentException, org.apache.commons.math3.exception.NumberIsTooSmallException {
		return org.apache.commons.math3.stat.inference.TestUtils.T_TEST.homoscedasticTTest(sample1, sample2);
	}

	public static double homoscedasticTTest(final org.apache.commons.math3.stat.descriptive.StatisticalSummary sampleStats1, final org.apache.commons.math3.stat.descriptive.StatisticalSummary sampleStats2) throws org.apache.commons.math3.exception.MaxCountExceededException, org.apache.commons.math3.exception.NullArgumentException, org.apache.commons.math3.exception.NumberIsTooSmallException {
		return org.apache.commons.math3.stat.inference.TestUtils.T_TEST.homoscedasticTTest(sampleStats1, sampleStats2);
	}

	public static double pairedT(final double[] sample1, final double[] sample2) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.NoDataException, org.apache.commons.math3.exception.NullArgumentException, org.apache.commons.math3.exception.NumberIsTooSmallException {
		return org.apache.commons.math3.stat.inference.TestUtils.T_TEST.pairedT(sample1, sample2);
	}

	public static boolean pairedTTest(final double[] sample1, final double[] sample2, final double alpha) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.MaxCountExceededException, org.apache.commons.math3.exception.NoDataException, org.apache.commons.math3.exception.NullArgumentException, org.apache.commons.math3.exception.NumberIsTooSmallException, org.apache.commons.math3.exception.OutOfRangeException {
		return org.apache.commons.math3.stat.inference.TestUtils.T_TEST.pairedTTest(sample1, sample2, alpha);
	}

	public static double pairedTTest(final double[] sample1, final double[] sample2) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.MaxCountExceededException, org.apache.commons.math3.exception.NoDataException, org.apache.commons.math3.exception.NullArgumentException, org.apache.commons.math3.exception.NumberIsTooSmallException {
		return org.apache.commons.math3.stat.inference.TestUtils.T_TEST.pairedTTest(sample1, sample2);
	}

	public static double t(final double mu, final double[] observed) throws org.apache.commons.math3.exception.NullArgumentException, org.apache.commons.math3.exception.NumberIsTooSmallException {
		return org.apache.commons.math3.stat.inference.TestUtils.T_TEST.t(mu, observed);
	}

	public static double t(final double mu, final org.apache.commons.math3.stat.descriptive.StatisticalSummary sampleStats) throws org.apache.commons.math3.exception.NullArgumentException, org.apache.commons.math3.exception.NumberIsTooSmallException {
		return org.apache.commons.math3.stat.inference.TestUtils.T_TEST.t(mu, sampleStats);
	}

	public static double t(final double[] sample1, final double[] sample2) throws org.apache.commons.math3.exception.NullArgumentException, org.apache.commons.math3.exception.NumberIsTooSmallException {
		return org.apache.commons.math3.stat.inference.TestUtils.T_TEST.t(sample1, sample2);
	}

	public static double t(final org.apache.commons.math3.stat.descriptive.StatisticalSummary sampleStats1, final org.apache.commons.math3.stat.descriptive.StatisticalSummary sampleStats2) throws org.apache.commons.math3.exception.NullArgumentException, org.apache.commons.math3.exception.NumberIsTooSmallException {
		return org.apache.commons.math3.stat.inference.TestUtils.T_TEST.t(sampleStats1, sampleStats2);
	}

	public static boolean tTest(final double mu, final double[] sample, final double alpha) throws org.apache.commons.math3.exception.MaxCountExceededException, org.apache.commons.math3.exception.NullArgumentException, org.apache.commons.math3.exception.NumberIsTooSmallException, org.apache.commons.math3.exception.OutOfRangeException {
		return org.apache.commons.math3.stat.inference.TestUtils.T_TEST.tTest(mu, sample, alpha);
	}

	public static double tTest(final double mu, final double[] sample) throws org.apache.commons.math3.exception.MaxCountExceededException, org.apache.commons.math3.exception.NullArgumentException, org.apache.commons.math3.exception.NumberIsTooSmallException {
		return org.apache.commons.math3.stat.inference.TestUtils.T_TEST.tTest(mu, sample);
	}

	public static boolean tTest(final double mu, final org.apache.commons.math3.stat.descriptive.StatisticalSummary sampleStats, final double alpha) throws org.apache.commons.math3.exception.MaxCountExceededException, org.apache.commons.math3.exception.NullArgumentException, org.apache.commons.math3.exception.NumberIsTooSmallException, org.apache.commons.math3.exception.OutOfRangeException {
		return org.apache.commons.math3.stat.inference.TestUtils.T_TEST.tTest(mu, sampleStats, alpha);
	}

	public static double tTest(final double mu, final org.apache.commons.math3.stat.descriptive.StatisticalSummary sampleStats) throws org.apache.commons.math3.exception.MaxCountExceededException, org.apache.commons.math3.exception.NullArgumentException, org.apache.commons.math3.exception.NumberIsTooSmallException {
		return org.apache.commons.math3.stat.inference.TestUtils.T_TEST.tTest(mu, sampleStats);
	}

	public static boolean tTest(final double[] sample1, final double[] sample2, final double alpha) throws org.apache.commons.math3.exception.MaxCountExceededException, org.apache.commons.math3.exception.NullArgumentException, org.apache.commons.math3.exception.NumberIsTooSmallException, org.apache.commons.math3.exception.OutOfRangeException {
		return org.apache.commons.math3.stat.inference.TestUtils.T_TEST.tTest(sample1, sample2, alpha);
	}

	public static double tTest(final double[] sample1, final double[] sample2) throws org.apache.commons.math3.exception.MaxCountExceededException, org.apache.commons.math3.exception.NullArgumentException, org.apache.commons.math3.exception.NumberIsTooSmallException {
		return org.apache.commons.math3.stat.inference.TestUtils.T_TEST.tTest(sample1, sample2);
	}

	public static boolean tTest(final org.apache.commons.math3.stat.descriptive.StatisticalSummary sampleStats1, final org.apache.commons.math3.stat.descriptive.StatisticalSummary sampleStats2, final double alpha) throws org.apache.commons.math3.exception.MaxCountExceededException, org.apache.commons.math3.exception.NullArgumentException, org.apache.commons.math3.exception.NumberIsTooSmallException, org.apache.commons.math3.exception.OutOfRangeException {
		return org.apache.commons.math3.stat.inference.TestUtils.T_TEST.tTest(sampleStats1, sampleStats2, alpha);
	}

	public static double tTest(final org.apache.commons.math3.stat.descriptive.StatisticalSummary sampleStats1, final org.apache.commons.math3.stat.descriptive.StatisticalSummary sampleStats2) throws org.apache.commons.math3.exception.MaxCountExceededException, org.apache.commons.math3.exception.NullArgumentException, org.apache.commons.math3.exception.NumberIsTooSmallException {
		return org.apache.commons.math3.stat.inference.TestUtils.T_TEST.tTest(sampleStats1, sampleStats2);
	}

	public static double chiSquare(final double[] expected, final long[] observed) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.NotPositiveException, org.apache.commons.math3.exception.NotStrictlyPositiveException {
		return org.apache.commons.math3.stat.inference.TestUtils.CHI_SQUARE_TEST.chiSquare(expected, observed);
	}

	public static double chiSquare(final long[][] counts) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.NotPositiveException, org.apache.commons.math3.exception.NullArgumentException {
		return org.apache.commons.math3.stat.inference.TestUtils.CHI_SQUARE_TEST.chiSquare(counts);
	}

	public static boolean chiSquareTest(final double[] expected, final long[] observed, final double alpha) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.MaxCountExceededException, org.apache.commons.math3.exception.NotPositiveException, org.apache.commons.math3.exception.NotStrictlyPositiveException, org.apache.commons.math3.exception.OutOfRangeException {
		return org.apache.commons.math3.stat.inference.TestUtils.CHI_SQUARE_TEST.chiSquareTest(expected, observed, alpha);
	}

	public static double chiSquareTest(final double[] expected, final long[] observed) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.MaxCountExceededException, org.apache.commons.math3.exception.NotPositiveException, org.apache.commons.math3.exception.NotStrictlyPositiveException {
		return org.apache.commons.math3.stat.inference.TestUtils.CHI_SQUARE_TEST.chiSquareTest(expected, observed);
	}

	public static boolean chiSquareTest(final long[][] counts, final double alpha) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.MaxCountExceededException, org.apache.commons.math3.exception.NotPositiveException, org.apache.commons.math3.exception.NullArgumentException, org.apache.commons.math3.exception.OutOfRangeException {
		return org.apache.commons.math3.stat.inference.TestUtils.CHI_SQUARE_TEST.chiSquareTest(counts, alpha);
	}

	public static double chiSquareTest(final long[][] counts) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.MaxCountExceededException, org.apache.commons.math3.exception.NotPositiveException, org.apache.commons.math3.exception.NullArgumentException {
		return org.apache.commons.math3.stat.inference.TestUtils.CHI_SQUARE_TEST.chiSquareTest(counts);
	}

	public static double chiSquareDataSetsComparison(final long[] observed1, final long[] observed2) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.NotPositiveException, org.apache.commons.math3.exception.ZeroException {
		return org.apache.commons.math3.stat.inference.TestUtils.CHI_SQUARE_TEST.chiSquareDataSetsComparison(observed1, observed2);
	}

	public static double chiSquareTestDataSetsComparison(final long[] observed1, final long[] observed2) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.MaxCountExceededException, org.apache.commons.math3.exception.NotPositiveException, org.apache.commons.math3.exception.ZeroException {
		return org.apache.commons.math3.stat.inference.TestUtils.CHI_SQUARE_TEST.chiSquareTestDataSetsComparison(observed1, observed2);
	}

	public static boolean chiSquareTestDataSetsComparison(final long[] observed1, final long[] observed2, final double alpha) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.MaxCountExceededException, org.apache.commons.math3.exception.NotPositiveException, org.apache.commons.math3.exception.OutOfRangeException, org.apache.commons.math3.exception.ZeroException {
		return org.apache.commons.math3.stat.inference.TestUtils.CHI_SQUARE_TEST.chiSquareTestDataSetsComparison(observed1, observed2, alpha);
	}

	public static double oneWayAnovaFValue(final java.util.Collection<double[]> categoryData) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.NullArgumentException {
		return org.apache.commons.math3.stat.inference.TestUtils.ONE_WAY_ANANOVA.anovaFValue(categoryData);
	}

	public static double oneWayAnovaPValue(final java.util.Collection<double[]> categoryData) throws org.apache.commons.math3.exception.ConvergenceException, org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.MaxCountExceededException, org.apache.commons.math3.exception.NullArgumentException {
		return org.apache.commons.math3.stat.inference.TestUtils.ONE_WAY_ANANOVA.anovaPValue(categoryData);
	}

	public static boolean oneWayAnovaTest(final java.util.Collection<double[]> categoryData, final double alpha) throws org.apache.commons.math3.exception.ConvergenceException, org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.MaxCountExceededException, org.apache.commons.math3.exception.NullArgumentException, org.apache.commons.math3.exception.OutOfRangeException {
		return org.apache.commons.math3.stat.inference.TestUtils.ONE_WAY_ANANOVA.anovaTest(categoryData, alpha);
	}

	public static double g(final double[] expected, final long[] observed) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.NotPositiveException, org.apache.commons.math3.exception.NotStrictlyPositiveException {
		return org.apache.commons.math3.stat.inference.TestUtils.G_TEST.g(expected, observed);
	}

	public static double gTest(final double[] expected, final long[] observed) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.MaxCountExceededException, org.apache.commons.math3.exception.NotPositiveException, org.apache.commons.math3.exception.NotStrictlyPositiveException {
		return org.apache.commons.math3.stat.inference.TestUtils.G_TEST.gTest(expected, observed);
	}

	public static double gTestIntrinsic(final double[] expected, final long[] observed) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.MaxCountExceededException, org.apache.commons.math3.exception.NotPositiveException, org.apache.commons.math3.exception.NotStrictlyPositiveException {
		return org.apache.commons.math3.stat.inference.TestUtils.G_TEST.gTestIntrinsic(expected, observed);
	}

	public static boolean gTest(final double[] expected, final long[] observed, final double alpha) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.MaxCountExceededException, org.apache.commons.math3.exception.NotPositiveException, org.apache.commons.math3.exception.NotStrictlyPositiveException, org.apache.commons.math3.exception.OutOfRangeException {
		return org.apache.commons.math3.stat.inference.TestUtils.G_TEST.gTest(expected, observed, alpha);
	}

	public static double gDataSetsComparison(final long[] observed1, final long[] observed2) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.NotPositiveException, org.apache.commons.math3.exception.ZeroException {
		return org.apache.commons.math3.stat.inference.TestUtils.G_TEST.gDataSetsComparison(observed1, observed2);
	}

	public static double rootLogLikelihoodRatio(final long k11, final long k12, final long k21, final long k22) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.NotPositiveException, org.apache.commons.math3.exception.ZeroException {
		return org.apache.commons.math3.stat.inference.TestUtils.G_TEST.rootLogLikelihoodRatio(k11, k12, k21, k22);
	}

	public static double gTestDataSetsComparison(final long[] observed1, final long[] observed2) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.MaxCountExceededException, org.apache.commons.math3.exception.NotPositiveException, org.apache.commons.math3.exception.ZeroException {
		return org.apache.commons.math3.stat.inference.TestUtils.G_TEST.gTestDataSetsComparison(observed1, observed2);
	}

	public static boolean gTestDataSetsComparison(final long[] observed1, final long[] observed2, final double alpha) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.MaxCountExceededException, org.apache.commons.math3.exception.NotPositiveException, org.apache.commons.math3.exception.OutOfRangeException, org.apache.commons.math3.exception.ZeroException {
		return org.apache.commons.math3.stat.inference.TestUtils.G_TEST.gTestDataSetsComparison(observed1, observed2, alpha);
	}
}

