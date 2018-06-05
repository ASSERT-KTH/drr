

package org.apache.commons.math.stat.inference;


public interface MannWhitneyUTest {
	double mannWhitneyU(final double[] x, final double[] y) throws java.lang.IllegalArgumentException;

	double mannWhitneyUTest(final double[] x, final double[] y) throws java.lang.IllegalArgumentException, org.apache.commons.math.MathException;
}

