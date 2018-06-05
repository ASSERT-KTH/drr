

package org.apache.commons.math.stat.inference;


public interface WilcoxonSignedRankTest {
	double wilcoxonSignedRank(final double[] x, final double[] y) throws java.lang.IllegalArgumentException;

	double wilcoxonSignedRankTest(final double[] x, final double[] y, boolean exactPValue) throws java.lang.IllegalArgumentException, org.apache.commons.math.MathException;
}

