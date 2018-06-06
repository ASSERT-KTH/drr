

package org.apache.commons.math.stat.inference;


public interface ChiSquareTest {
	double chiSquare(double[] expected, long[] observed) throws java.lang.IllegalArgumentException;

	double chiSquareTest(double[] expected, long[] observed) throws java.lang.IllegalArgumentException, org.apache.commons.math.MathException;

	boolean chiSquareTest(double[] expected, long[] observed, double alpha) throws java.lang.IllegalArgumentException, org.apache.commons.math.MathException;

	double chiSquare(long[][] counts) throws java.lang.IllegalArgumentException;

	double chiSquareTest(long[][] counts) throws java.lang.IllegalArgumentException, org.apache.commons.math.MathException;

	boolean chiSquareTest(long[][] counts, double alpha) throws java.lang.IllegalArgumentException, org.apache.commons.math.MathException;

	double chiSquareDataSetsComparison(long[] observed1, long[] observed2) throws java.lang.IllegalArgumentException;

	double chiSquareTestDataSetsComparison(long[] observed1, long[] observed2) throws java.lang.IllegalArgumentException, org.apache.commons.math.MathException;

	boolean chiSquareTestDataSetsComparison(long[] observed1, long[] observed2, double alpha) throws java.lang.IllegalArgumentException, org.apache.commons.math.MathException;
}

