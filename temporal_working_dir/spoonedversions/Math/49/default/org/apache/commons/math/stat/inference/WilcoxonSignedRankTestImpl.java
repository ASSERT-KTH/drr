

package org.apache.commons.math.stat.inference;


public class WilcoxonSignedRankTestImpl implements org.apache.commons.math.stat.inference.WilcoxonSignedRankTest {
	private org.apache.commons.math.stat.ranking.NaturalRanking naturalRanking;

	public WilcoxonSignedRankTestImpl() {
		naturalRanking = new org.apache.commons.math.stat.ranking.NaturalRanking(org.apache.commons.math.stat.ranking.NaNStrategy.FIXED, org.apache.commons.math.stat.ranking.TiesStrategy.AVERAGE);
	}

	public WilcoxonSignedRankTestImpl(org.apache.commons.math.stat.ranking.NaNStrategy nanStrategy, org.apache.commons.math.stat.ranking.TiesStrategy tiesStrategy) {
		naturalRanking = new org.apache.commons.math.stat.ranking.NaturalRanking(nanStrategy, tiesStrategy);
	}

	private void ensureDataConformance(final double[] x, final double[] y) throws java.lang.IllegalArgumentException {
		if (x == null) {
			throw new java.lang.IllegalArgumentException("x must not be null");
		}
		if (y == null) {
			throw new java.lang.IllegalArgumentException("y must not be null");
		}
		if ((x.length) != (y.length)) {
			throw new java.lang.IllegalArgumentException("x and y must contain the same number of elements");
		}
		if ((x.length) == 0) {
			throw new java.lang.IllegalArgumentException("x and y must contain at least one element");
		}
	}

	private double[] calculateDifferences(final double[] x, final double[] y) {
		final double[] z = new double[x.length];
		for (int i = 0; i < (x.length); ++i) {
			z[i] = (y[i]) - (x[i]);
		}
		return z;
	}

	private double[] calculateAbsoluteDifferences(final double[] z) throws java.lang.IllegalArgumentException {
		if (z == null) {
			throw new java.lang.IllegalArgumentException("z must not be null");
		}
		if ((z.length) == 0) {
			throw new java.lang.IllegalArgumentException("z must contain at least one element");
		}
		final double[] zAbs = new double[z.length];
		for (int i = 0; i < (z.length); ++i) {
			zAbs[i] = org.apache.commons.math.util.FastMath.abs(z[i]);
		}
		return zAbs;
	}

	public double wilcoxonSignedRank(final double[] x, final double[] y) throws java.lang.IllegalArgumentException {
		ensureDataConformance(x, y);
		final double[] z = calculateDifferences(x, y);
		final double[] zAbs = calculateAbsoluteDifferences(z);
		final double[] ranks = naturalRanking.rank(zAbs);
		double Wplus = 0;
		for (int i = 0; i < (z.length); ++i) {
			if ((z[i]) > 0) {
				Wplus += ranks[i];
			}
		}
		final int N = x.length;
		final double Wminus = (((double) (N * (N + 1))) / 2.0) - Wplus;
		return org.apache.commons.math.util.FastMath.max(Wplus, Wminus);
	}

	private double calculateExactPValue(final double Wmax, final int N) {
		final int m = 1 << N;
		int largerRankSums = 0;
		for (int i = 0; i < m; ++i) {
			int rankSum = 0;
			for (int j = 0; j < N; ++j) {
				if (((i >> j) & 1) == 1) {
					rankSum += j + 1;
				}
			}
			if (rankSum >= Wmax) {
				++largerRankSums;
			}
		}
		return (2 * ((double) (largerRankSums))) / ((double) (m));
	}

	private double calculateAsymptoticPValue(final double Wmin, final int N) throws org.apache.commons.math.MathException {
		final double ES = ((double) (N * (N + 1))) / 4.0;
		final double VarS = ES * (((double) ((2 * N) + 1)) / 6.0);
		final double z = ((Wmin - ES) - 0.5) / (org.apache.commons.math.util.FastMath.sqrt(VarS));
		final org.apache.commons.math.distribution.NormalDistributionImpl standardNormal = new org.apache.commons.math.distribution.NormalDistributionImpl(0, 1);
		return 2 * (standardNormal.cumulativeProbability(z));
	}

	public double wilcoxonSignedRankTest(final double[] x, final double[] y, boolean exactPValue) throws java.lang.IllegalArgumentException, org.apache.commons.math.MathException {
		ensureDataConformance(x, y);
		final int N = x.length;
		final double Wmax = wilcoxonSignedRank(x, y);
		if (exactPValue && (N > 30)) {
			throw new java.lang.IllegalArgumentException("Exact test can only be made for N <= 30.");
		}
		if (exactPValue) {
			return calculateExactPValue(Wmax, N);
		}else {
			final double Wmin = (((double) (N * (N + 1))) / 2.0) - Wmax;
			return calculateAsymptoticPValue(Wmin, N);
		}
	}
}

