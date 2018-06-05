

package org.apache.commons.math.stat.inference;


public class MannWhitneyUTestImpl implements org.apache.commons.math.stat.inference.MannWhitneyUTest {
	private org.apache.commons.math.stat.ranking.NaturalRanking naturalRanking;

	public MannWhitneyUTestImpl() {
		naturalRanking = new org.apache.commons.math.stat.ranking.NaturalRanking(org.apache.commons.math.stat.ranking.NaNStrategy.FIXED, org.apache.commons.math.stat.ranking.TiesStrategy.AVERAGE);
	}

	public MannWhitneyUTestImpl(org.apache.commons.math.stat.ranking.NaNStrategy nanStrategy, org.apache.commons.math.stat.ranking.TiesStrategy tiesStrategy) {
		naturalRanking = new org.apache.commons.math.stat.ranking.NaturalRanking(nanStrategy, tiesStrategy);
	}

	private void ensureDataConformance(final double[] x, final double[] y) throws java.lang.IllegalArgumentException {
		if (x == null) {
			throw new java.lang.IllegalArgumentException("x must not be null");
		}
		if (y == null) {
			throw new java.lang.IllegalArgumentException("y must not be null");
		}
		if ((x.length) == 0) {
			throw new java.lang.IllegalArgumentException("x must contain at least one element");
		}
		if ((y.length) == 0) {
			throw new java.lang.IllegalArgumentException("y must contain at least one element");
		}
	}

	private double[] concatinateSamples(final double[] x, final double[] y) {
		final double[] z = new double[(x.length) + (y.length)];
		java.lang.System.arraycopy(x, 0, z, 0, x.length);
		java.lang.System.arraycopy(y, 0, z, x.length, y.length);
		return z;
	}

	public double mannWhitneyU(final double[] x, final double[] y) throws java.lang.IllegalArgumentException {
		ensureDataConformance(x, y);
		final double[] z = concatinateSamples(x, y);
		final double[] ranks = naturalRanking.rank(z);
		double sumRankX = 0;
		for (int i = 0; i < (x.length); ++i) {
			sumRankX += ranks[i];
		}
		final double U1 = sumRankX - (((x.length) * ((x.length) + 1)) / 2);
		final double U2 = ((x.length) * (y.length)) - U1;
		return org.apache.commons.math.util.FastMath.max(U1, U2);
	}

	private double calculateAsymptoticPValue(final double Umin, final int n1, final int n2) throws org.apache.commons.math.MathException {
		final int n1n2prod = n1 * n2;
		final double EU = ((double) (n1n2prod)) / 2.0;
		final double VarU = ((double) (n1n2prod * ((n1 + n2) + 1))) / 12.0;
		final double z = (Umin - EU) / (org.apache.commons.math.util.FastMath.sqrt(VarU));
		final org.apache.commons.math.distribution.NormalDistributionImpl standardNormal = new org.apache.commons.math.distribution.NormalDistributionImpl(0, 1);
		return 2 * (standardNormal.cumulativeProbability(z));
	}

	public double mannWhitneyUTest(final double[] x, final double[] y) throws java.lang.IllegalArgumentException, org.apache.commons.math.MathException {
		ensureDataConformance(x, y);
		final double Umax = mannWhitneyU(x, y);
		final double Umin = ((x.length) * (y.length)) - Umax;
		return calculateAsymptoticPValue(Umin, x.length, y.length);
	}
}

