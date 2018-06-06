

package org.apache.commons.math.stat.inference;


public class TestUtils {
	private static final org.apache.commons.math.stat.inference.TTest T_TEST = new org.apache.commons.math.stat.inference.TTestImpl();

	private static final org.apache.commons.math.stat.inference.ChiSquareTest CHI_SQUARE_TEST = new org.apache.commons.math.stat.inference.ChiSquareTestImpl();

	private static final org.apache.commons.math.stat.inference.UnknownDistributionChiSquareTest UNKNOWN_DISTRIBUTION_CHI_SQUARE_TEST = new org.apache.commons.math.stat.inference.ChiSquareTestImpl();

	private static final org.apache.commons.math.stat.inference.OneWayAnova ONE_WAY_ANANOVA = new org.apache.commons.math.stat.inference.OneWayAnovaImpl();

	private TestUtils() {
		super();
	}

	public static double homoscedasticT(double[] sample1, double[] sample2) throws java.lang.IllegalArgumentException {
		return org.apache.commons.math.stat.inference.TestUtils.T_TEST.homoscedasticT(sample1, sample2);
	}

	public static double homoscedasticT(org.apache.commons.math.stat.descriptive.StatisticalSummary sampleStats1, org.apache.commons.math.stat.descriptive.StatisticalSummary sampleStats2) throws java.lang.IllegalArgumentException {
		return org.apache.commons.math.stat.inference.TestUtils.T_TEST.homoscedasticT(sampleStats1, sampleStats2);
	}

	public static boolean homoscedasticTTest(double[] sample1, double[] sample2, double alpha) throws java.lang.IllegalArgumentException, org.apache.commons.math.MathException {
		return org.apache.commons.math.stat.inference.TestUtils.T_TEST.homoscedasticTTest(sample1, sample2, alpha);
	}

	public static double homoscedasticTTest(double[] sample1, double[] sample2) throws java.lang.IllegalArgumentException, org.apache.commons.math.MathException {
		return org.apache.commons.math.stat.inference.TestUtils.T_TEST.homoscedasticTTest(sample1, sample2);
	}

	public static double homoscedasticTTest(org.apache.commons.math.stat.descriptive.StatisticalSummary sampleStats1, org.apache.commons.math.stat.descriptive.StatisticalSummary sampleStats2) throws java.lang.IllegalArgumentException, org.apache.commons.math.MathException {
		return org.apache.commons.math.stat.inference.TestUtils.T_TEST.homoscedasticTTest(sampleStats1, sampleStats2);
	}

	public static double pairedT(double[] sample1, double[] sample2) throws java.lang.IllegalArgumentException, org.apache.commons.math.MathException {
		return org.apache.commons.math.stat.inference.TestUtils.T_TEST.pairedT(sample1, sample2);
	}

	public static boolean pairedTTest(double[] sample1, double[] sample2, double alpha) throws java.lang.IllegalArgumentException, org.apache.commons.math.MathException {
		return org.apache.commons.math.stat.inference.TestUtils.T_TEST.pairedTTest(sample1, sample2, alpha);
	}

	public static double pairedTTest(double[] sample1, double[] sample2) throws java.lang.IllegalArgumentException, org.apache.commons.math.MathException {
		return org.apache.commons.math.stat.inference.TestUtils.T_TEST.pairedTTest(sample1, sample2);
	}

	public static double t(double mu, double[] observed) throws java.lang.IllegalArgumentException {
		return org.apache.commons.math.stat.inference.TestUtils.T_TEST.t(mu, observed);
	}

	public static double t(double mu, org.apache.commons.math.stat.descriptive.StatisticalSummary sampleStats) throws java.lang.IllegalArgumentException {
		return org.apache.commons.math.stat.inference.TestUtils.T_TEST.t(mu, sampleStats);
	}

	public static double t(double[] sample1, double[] sample2) throws java.lang.IllegalArgumentException {
		return org.apache.commons.math.stat.inference.TestUtils.T_TEST.t(sample1, sample2);
	}

	public static double t(org.apache.commons.math.stat.descriptive.StatisticalSummary sampleStats1, org.apache.commons.math.stat.descriptive.StatisticalSummary sampleStats2) throws java.lang.IllegalArgumentException {
		return org.apache.commons.math.stat.inference.TestUtils.T_TEST.t(sampleStats1, sampleStats2);
	}

	public static boolean tTest(double mu, double[] sample, double alpha) throws java.lang.IllegalArgumentException, org.apache.commons.math.MathException {
		return org.apache.commons.math.stat.inference.TestUtils.T_TEST.tTest(mu, sample, alpha);
	}

	public static double tTest(double mu, double[] sample) throws java.lang.IllegalArgumentException, org.apache.commons.math.MathException {
		return org.apache.commons.math.stat.inference.TestUtils.T_TEST.tTest(mu, sample);
	}

	public static boolean tTest(double mu, org.apache.commons.math.stat.descriptive.StatisticalSummary sampleStats, double alpha) throws java.lang.IllegalArgumentException, org.apache.commons.math.MathException {
		return org.apache.commons.math.stat.inference.TestUtils.T_TEST.tTest(mu, sampleStats, alpha);
	}

	public static double tTest(double mu, org.apache.commons.math.stat.descriptive.StatisticalSummary sampleStats) throws java.lang.IllegalArgumentException, org.apache.commons.math.MathException {
		return org.apache.commons.math.stat.inference.TestUtils.T_TEST.tTest(mu, sampleStats);
	}

	public static boolean tTest(double[] sample1, double[] sample2, double alpha) throws java.lang.IllegalArgumentException, org.apache.commons.math.MathException {
		return org.apache.commons.math.stat.inference.TestUtils.T_TEST.tTest(sample1, sample2, alpha);
	}

	public static double tTest(double[] sample1, double[] sample2) throws java.lang.IllegalArgumentException, org.apache.commons.math.MathException {
		return org.apache.commons.math.stat.inference.TestUtils.T_TEST.tTest(sample1, sample2);
	}

	public static boolean tTest(org.apache.commons.math.stat.descriptive.StatisticalSummary sampleStats1, org.apache.commons.math.stat.descriptive.StatisticalSummary sampleStats2, double alpha) throws java.lang.IllegalArgumentException, org.apache.commons.math.MathException {
		return org.apache.commons.math.stat.inference.TestUtils.T_TEST.tTest(sampleStats1, sampleStats2, alpha);
	}

	public static double tTest(org.apache.commons.math.stat.descriptive.StatisticalSummary sampleStats1, org.apache.commons.math.stat.descriptive.StatisticalSummary sampleStats2) throws java.lang.IllegalArgumentException, org.apache.commons.math.MathException {
		return org.apache.commons.math.stat.inference.TestUtils.T_TEST.tTest(sampleStats1, sampleStats2);
	}

	public static double chiSquare(double[] expected, long[] observed) throws java.lang.IllegalArgumentException {
		return org.apache.commons.math.stat.inference.TestUtils.CHI_SQUARE_TEST.chiSquare(expected, observed);
	}

	public static double chiSquare(long[][] counts) throws java.lang.IllegalArgumentException {
		return org.apache.commons.math.stat.inference.TestUtils.CHI_SQUARE_TEST.chiSquare(counts);
	}

	public static boolean chiSquareTest(double[] expected, long[] observed, double alpha) throws java.lang.IllegalArgumentException, org.apache.commons.math.MathException {
		return org.apache.commons.math.stat.inference.TestUtils.CHI_SQUARE_TEST.chiSquareTest(expected, observed, alpha);
	}

	public static double chiSquareTest(double[] expected, long[] observed) throws java.lang.IllegalArgumentException, org.apache.commons.math.MathException {
		return org.apache.commons.math.stat.inference.TestUtils.CHI_SQUARE_TEST.chiSquareTest(expected, observed);
	}

	public static boolean chiSquareTest(long[][] counts, double alpha) throws java.lang.IllegalArgumentException, org.apache.commons.math.MathException {
		return org.apache.commons.math.stat.inference.TestUtils.CHI_SQUARE_TEST.chiSquareTest(counts, alpha);
	}

	public static double chiSquareTest(long[][] counts) throws java.lang.IllegalArgumentException, org.apache.commons.math.MathException {
		return org.apache.commons.math.stat.inference.TestUtils.CHI_SQUARE_TEST.chiSquareTest(counts);
	}

	public static double chiSquareDataSetsComparison(long[] observed1, long[] observed2) throws java.lang.IllegalArgumentException {
		return org.apache.commons.math.stat.inference.TestUtils.UNKNOWN_DISTRIBUTION_CHI_SQUARE_TEST.chiSquareDataSetsComparison(observed1, observed2);
	}

	public static double chiSquareTestDataSetsComparison(long[] observed1, long[] observed2) throws java.lang.IllegalArgumentException, org.apache.commons.math.MathException {
		return org.apache.commons.math.stat.inference.TestUtils.UNKNOWN_DISTRIBUTION_CHI_SQUARE_TEST.chiSquareTestDataSetsComparison(observed1, observed2);
	}

	public static boolean chiSquareTestDataSetsComparison(long[] observed1, long[] observed2, double alpha) throws java.lang.IllegalArgumentException, org.apache.commons.math.MathException {
		return org.apache.commons.math.stat.inference.TestUtils.UNKNOWN_DISTRIBUTION_CHI_SQUARE_TEST.chiSquareTestDataSetsComparison(observed1, observed2, alpha);
	}

	public static double oneWayAnovaFValue(java.util.Collection<double[]> categoryData) throws java.lang.IllegalArgumentException, org.apache.commons.math.MathException {
		return org.apache.commons.math.stat.inference.TestUtils.ONE_WAY_ANANOVA.anovaFValue(categoryData);
	}

	public static double oneWayAnovaPValue(java.util.Collection<double[]> categoryData) throws java.lang.IllegalArgumentException, org.apache.commons.math.MathException {
		return org.apache.commons.math.stat.inference.TestUtils.ONE_WAY_ANANOVA.anovaPValue(categoryData);
	}

	public static boolean oneWayAnovaTest(java.util.Collection<double[]> categoryData, double alpha) throws java.lang.IllegalArgumentException, org.apache.commons.math.MathException {
		return org.apache.commons.math.stat.inference.TestUtils.ONE_WAY_ANANOVA.anovaTest(categoryData, alpha);
	}
}

