

package org.apache.commons.math3.stat.inference;


public class MannWhitneyUTest {
	private org.apache.commons.math3.stat.ranking.NaturalRanking naturalRanking;

	public MannWhitneyUTest() {
		naturalRanking = new org.apache.commons.math3.stat.ranking.NaturalRanking(org.apache.commons.math3.stat.ranking.NaNStrategy.FIXED, org.apache.commons.math3.stat.ranking.TiesStrategy.AVERAGE);
	}

	public MannWhitneyUTest(final org.apache.commons.math3.stat.ranking.NaNStrategy nanStrategy, final org.apache.commons.math3.stat.ranking.TiesStrategy tiesStrategy) {
		naturalRanking = new org.apache.commons.math3.stat.ranking.NaturalRanking(nanStrategy, tiesStrategy);
	}

	private void ensureDataConformance(final double[] x, final double[] y) throws org.apache.commons.math3.exception.NoDataException, org.apache.commons.math3.exception.NullArgumentException {
		if ((x == null) || (y == null)) {
			throw new org.apache.commons.math3.exception.NullArgumentException();
		}
		if (((x.length) == 0) || ((y.length) == 0)) {
			throw new org.apache.commons.math3.exception.NoDataException();
		}
	}

	private double[] concatenateSamples(final double[] x, final double[] y) {
		final double[] z = new double[(x.length) + (y.length)];
		java.lang.System.arraycopy(x, 0, z, 0, x.length);
		java.lang.System.arraycopy(y, 0, z, x.length, y.length);
		return z;
	}

	public double mannWhitneyU(final double[] x, final double[] y) throws org.apache.commons.math3.exception.NoDataException, org.apache.commons.math3.exception.NullArgumentException {
		ensureDataConformance(x, y);
		final double[] z = concatenateSamples(x, y);
		final double[] ranks = naturalRanking.rank(z);
		double sumRankX = 0;
		for (int i = 0; i < (x.length); ++i) {
			sumRankX += ranks[i];
		}
		final double U1 = sumRankX - (((x.length) * ((x.length) + 1)) / 2);
		final double U2 = ((x.length) * (y.length)) - U1;
		return org.apache.commons.math3.util.FastMath.max(U1, U2);
	}

	private double calculateAsymptoticPValue(final double Umin, final int n1, final int n2) throws org.apache.commons.math3.exception.ConvergenceException, org.apache.commons.math3.exception.MaxCountExceededException {
		final long n1n2prod = ((long) (n1)) * n2;
		final double EU = n1n2prod / 2.0;
		final double VarU = (n1n2prod * ((n1 + n2) + 1)) / 12.0;
		final double z = (Umin - EU) / (org.apache.commons.math3.util.FastMath.sqrt(VarU));
		final org.apache.commons.math3.distribution.NormalDistribution standardNormal = new org.apache.commons.math3.distribution.NormalDistribution(0, 1);
		return 2 * (standardNormal.cumulativeProbability(z));
	}

	public double mannWhitneyUTest(final double[] x, final double[] y) throws org.apache.commons.math3.exception.ConvergenceException, org.apache.commons.math3.exception.MaxCountExceededException, org.apache.commons.math3.exception.NoDataException, org.apache.commons.math3.exception.NullArgumentException {
		ensureDataConformance(x, y);
		final double Umax = mannWhitneyU(x, y);
		final double Umin = ((x.length) * (y.length)) - Umax;
		return calculateAsymptoticPValue(Umin, x.length, y.length);
	}
}

