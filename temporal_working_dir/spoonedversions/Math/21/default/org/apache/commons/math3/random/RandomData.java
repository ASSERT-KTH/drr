

package org.apache.commons.math3.random;


public interface RandomData {
	java.lang.String nextHexString(int len) throws org.apache.commons.math3.exception.NotStrictlyPositiveException;

	int nextInt(int lower, int upper) throws org.apache.commons.math3.exception.NumberIsTooLargeException;

	long nextLong(long lower, long upper) throws org.apache.commons.math3.exception.NumberIsTooLargeException;

	java.lang.String nextSecureHexString(int len) throws org.apache.commons.math3.exception.NotStrictlyPositiveException;

	int nextSecureInt(int lower, int upper) throws org.apache.commons.math3.exception.NumberIsTooLargeException;

	long nextSecureLong(long lower, long upper) throws org.apache.commons.math3.exception.NumberIsTooLargeException;

	long nextPoisson(double mean) throws org.apache.commons.math3.exception.NotStrictlyPositiveException;

	double nextGaussian(double mu, double sigma) throws org.apache.commons.math3.exception.NotStrictlyPositiveException;

	double nextExponential(double mean) throws org.apache.commons.math3.exception.NotStrictlyPositiveException;

	double nextUniform(double lower, double upper) throws org.apache.commons.math3.exception.NotANumberException, org.apache.commons.math3.exception.NotFiniteNumberException, org.apache.commons.math3.exception.NumberIsTooLargeException;

	double nextUniform(double lower, double upper, boolean lowerInclusive) throws org.apache.commons.math3.exception.NotANumberException, org.apache.commons.math3.exception.NotFiniteNumberException, org.apache.commons.math3.exception.NumberIsTooLargeException;

	int[] nextPermutation(int n, int k) throws org.apache.commons.math3.exception.NotStrictlyPositiveException, org.apache.commons.math3.exception.NumberIsTooLargeException;

	java.lang.Object[] nextSample(java.util.Collection<?> c, int k) throws org.apache.commons.math3.exception.NotStrictlyPositiveException, org.apache.commons.math3.exception.NumberIsTooLargeException;
}

