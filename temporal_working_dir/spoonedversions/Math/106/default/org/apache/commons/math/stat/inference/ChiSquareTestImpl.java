

package org.apache.commons.math.stat.inference;


public class ChiSquareTestImpl implements org.apache.commons.math.stat.inference.ChiSquareTest {
	private org.apache.commons.math.distribution.DistributionFactory distributionFactory = null;

	public ChiSquareTestImpl() {
		super();
	}

	public double chiSquare(double[] expected, long[] observed) throws java.lang.IllegalArgumentException {
		double sumSq = 0.0;
		double dev = 0.0;
		if (((expected.length) < 2) || ((expected.length) != (observed.length))) {
			throw new java.lang.IllegalArgumentException("observed, expected array lengths incorrect");
		}
		if ((!(isPositive(expected))) || (!(isNonNegative(observed)))) {
			throw new java.lang.IllegalArgumentException("observed counts must be non-negative and expected counts must be postive");
		}
		for (int i = 0; i < (observed.length); i++) {
			dev = ((double) (observed[i])) - (expected[i]);
			sumSq += (dev * dev) / (expected[i]);
		}
		return sumSq;
	}

	public double chiSquareTest(double[] expected, long[] observed) throws java.lang.IllegalArgumentException, org.apache.commons.math.MathException {
		org.apache.commons.math.distribution.ChiSquaredDistribution chiSquaredDistribution = getDistributionFactory().createChiSquareDistribution((((double) (expected.length)) - 1));
		return 1 - (chiSquaredDistribution.cumulativeProbability(chiSquare(expected, observed)));
	}

	public boolean chiSquareTest(double[] expected, long[] observed, double alpha) throws java.lang.IllegalArgumentException, org.apache.commons.math.MathException {
		if ((alpha <= 0) || (alpha > 0.5)) {
			throw new java.lang.IllegalArgumentException(("bad significance level: " + alpha));
		}
		return (chiSquareTest(expected, observed)) < alpha;
	}

	public double chiSquare(long[][] counts) throws java.lang.IllegalArgumentException {
		checkArray(counts);
		int nRows = counts.length;
		int nCols = counts[0].length;
		double[] rowSum = new double[nRows];
		double[] colSum = new double[nCols];
		double total = 0.0;
		for (int row = 0; row < nRows; row++) {
			for (int col = 0; col < nCols; col++) {
				rowSum[row] += ((double) (counts[row][col]));
				colSum[col] += ((double) (counts[row][col]));
				total += ((double) (counts[row][col]));
			}
		}
		double sumSq = 0.0;
		double expected = 0.0;
		for (int row = 0; row < nRows; row++) {
			for (int col = 0; col < nCols; col++) {
				expected = ((rowSum[row]) * (colSum[col])) / total;
				sumSq += ((((double) (counts[row][col])) - expected) * (((double) (counts[row][col])) - expected)) / expected;
			}
		}
		return sumSq;
	}

	public double chiSquareTest(long[][] counts) throws java.lang.IllegalArgumentException, org.apache.commons.math.MathException {
		checkArray(counts);
		double df = (((double) (counts.length)) - 1) * (((double) (counts[0].length)) - 1);
		org.apache.commons.math.distribution.ChiSquaredDistribution chiSquaredDistribution = getDistributionFactory().createChiSquareDistribution(df);
		return 1 - (chiSquaredDistribution.cumulativeProbability(chiSquare(counts)));
	}

	public boolean chiSquareTest(long[][] counts, double alpha) throws java.lang.IllegalArgumentException, org.apache.commons.math.MathException {
		if ((alpha <= 0) || (alpha > 0.5)) {
			throw new java.lang.IllegalArgumentException(("bad significance level: " + alpha));
		}
		return (chiSquareTest(counts)) < alpha;
	}

	private void checkArray(long[][] in) throws java.lang.IllegalArgumentException {
		if ((in.length) < 2) {
			throw new java.lang.IllegalArgumentException("Input table must have at least two rows");
		}
		if ((in[0].length) < 2) {
			throw new java.lang.IllegalArgumentException("Input table must have at least two columns");
		}
		if (!(isRectangular(in))) {
			throw new java.lang.IllegalArgumentException("Input table must be rectangular");
		}
		if (!(isNonNegative(in))) {
			throw new java.lang.IllegalArgumentException("All entries in input 2-way table must be non-negative");
		}
	}

	protected org.apache.commons.math.distribution.DistributionFactory getDistributionFactory() {
		if ((distributionFactory) == null) {
			distributionFactory = org.apache.commons.math.distribution.DistributionFactory.newInstance();
		}
		return distributionFactory;
	}

	private boolean isRectangular(long[][] in) {
		for (int i = 1; i < (in.length); i++) {
			if ((in[i].length) != (in[0].length)) {
				return false;
			}
		}
		return true;
	}

	private boolean isPositive(double[] in) {
		for (int i = 0; i < (in.length); i++) {
			if ((in[i]) <= 0) {
				return false;
			}
		}
		return true;
	}

	private boolean isNonNegative(long[] in) {
		for (int i = 0; i < (in.length); i++) {
			if ((in[i]) < 0) {
				return false;
			}
		}
		return true;
	}

	private boolean isNonNegative(long[][] in) {
		for (int i = 0; i < (in.length); i++) {
			for (int j = 0; j < (in[i].length); j++) {
				if ((in[i][j]) < 0) {
					return false;
				}
			}
		}
		return true;
	}
}

