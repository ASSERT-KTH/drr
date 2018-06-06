

package org.apache.commons.math.complex;


public class RootsOfUnity implements java.io.Serializable {
	private static final long serialVersionUID = 20120201L;

	private int omegaCount;

	private double[] omegaReal;

	private double[] omegaImaginaryCounterClockwise;

	private double[] omegaImaginaryClockwise;

	private boolean isCounterClockWise;

	public RootsOfUnity() {
		omegaCount = 0;
		omegaReal = null;
		omegaImaginaryCounterClockwise = null;
		omegaImaginaryClockwise = null;
		isCounterClockWise = true;
	}

	public synchronized boolean isCounterClockWise() throws org.apache.commons.math.exception.MathIllegalStateException {
		if ((omegaCount) == 0) {
			throw new org.apache.commons.math.exception.MathIllegalStateException(org.apache.commons.math.exception.util.LocalizedFormats.ROOTS_OF_UNITY_NOT_COMPUTED_YET);
		}
		return isCounterClockWise;
	}

	public synchronized void computeRoots(int n) throws org.apache.commons.math.exception.ZeroException {
		if (n == 0) {
			throw new org.apache.commons.math.exception.ZeroException(org.apache.commons.math.exception.util.LocalizedFormats.CANNOT_COMPUTE_0TH_ROOT_OF_UNITY);
		}
		isCounterClockWise = n > 0;
		final int absN = org.apache.commons.math.util.FastMath.abs(n);
		if (absN == (omegaCount)) {
			return ;
		}
		final double t = (2.0 * (org.apache.commons.math.util.FastMath.PI)) / absN;
		final double cosT = org.apache.commons.math.util.FastMath.cos(t);
		final double sinT = org.apache.commons.math.util.FastMath.sin(t);
		omegaReal = new double[absN];
		omegaImaginaryCounterClockwise = new double[absN];
		omegaImaginaryClockwise = new double[absN];
		omegaReal[0] = 1.0;
		omegaImaginaryCounterClockwise[0] = 0.0;
		omegaImaginaryClockwise[0] = 0.0;
		for (int i = 1; i < absN; i++) {
			omegaReal[i] = ((omegaReal[(i - 1)]) * cosT) - ((omegaImaginaryCounterClockwise[(i - 1)]) * sinT);
			omegaImaginaryCounterClockwise[i] = ((omegaReal[(i - 1)]) * sinT) + ((omegaImaginaryCounterClockwise[(i - 1)]) * cosT);
			omegaImaginaryClockwise[i] = -(omegaImaginaryCounterClockwise[i]);
		}
		omegaCount = absN;
	}

	public synchronized double getReal(int k) throws org.apache.commons.math.exception.MathIllegalArgumentException, org.apache.commons.math.exception.MathIllegalStateException {
		if ((omegaCount) == 0) {
			throw new org.apache.commons.math.exception.MathIllegalStateException(org.apache.commons.math.exception.util.LocalizedFormats.ROOTS_OF_UNITY_NOT_COMPUTED_YET);
		}
		if ((k < 0) || (k >= (omegaCount))) {
			throw new org.apache.commons.math.exception.OutOfRangeException(org.apache.commons.math.exception.util.LocalizedFormats.OUT_OF_RANGE_ROOT_OF_UNITY_INDEX, java.lang.Integer.valueOf(k), java.lang.Integer.valueOf(0), java.lang.Integer.valueOf(((omegaCount) - 1)));
		}
		return omegaReal[k];
	}

	public synchronized double getImaginary(int k) throws org.apache.commons.math.exception.MathIllegalStateException, org.apache.commons.math.exception.OutOfRangeException {
		if ((omegaCount) == 0) {
			throw new org.apache.commons.math.exception.MathIllegalStateException(org.apache.commons.math.exception.util.LocalizedFormats.ROOTS_OF_UNITY_NOT_COMPUTED_YET);
		}
		if ((k < 0) || (k >= (omegaCount))) {
			throw new org.apache.commons.math.exception.OutOfRangeException(org.apache.commons.math.exception.util.LocalizedFormats.OUT_OF_RANGE_ROOT_OF_UNITY_INDEX, java.lang.Integer.valueOf(k), java.lang.Integer.valueOf(0), java.lang.Integer.valueOf(((omegaCount) - 1)));
		}
		return isCounterClockWise ? omegaImaginaryCounterClockwise[k] : omegaImaginaryClockwise[k];
	}

	public synchronized int getNumberOfRoots() {
		return omegaCount;
	}
}

