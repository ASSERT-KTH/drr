

package org.apache.commons.math3.transform;


public class TransformUtils {
	private static final int[] POWERS_OF_TWO = new int[]{ 1 , 2 , 4 , 8 , 16 , 32 , 64 , 128 , 256 , 512 , 1024 , 2048 , 4096 , 8192 , 16384 , 32768 , 65536 , 131072 , 262144 , 524288 , 1048576 , 2097152 , 4194304 , 8388608 , 16777216 , 33554432 , 67108864 , 134217728 , 268435456 , 536870912 , 1073741824 };

	private TransformUtils() {
		super();
	}

	public static double[] scaleArray(double[] f, double d) {
		for (int i = 0; i < (f.length); i++) {
			f[i] *= d;
		}
		return f;
	}

	public static org.apache.commons.math3.complex.Complex[] scaleArray(org.apache.commons.math3.complex.Complex[] f, double d) {
		for (int i = 0; i < (f.length); i++) {
			f[i] = new org.apache.commons.math3.complex.Complex((d * (f[i].getReal())), (d * (f[i].getImaginary())));
		}
		return f;
	}

	public static double[][] createRealImaginaryArray(final org.apache.commons.math3.complex.Complex[] dataC) {
		final double[][] dataRI = new double[2][dataC.length];
		final double[] dataR = dataRI[0];
		final double[] dataI = dataRI[1];
		for (int i = 0; i < (dataC.length); i++) {
			final org.apache.commons.math3.complex.Complex c = dataC[i];
			dataR[i] = c.getReal();
			dataI[i] = c.getImaginary();
		}
		return dataRI;
	}

	public static org.apache.commons.math3.complex.Complex[] createComplexArray(final double[][] dataRI) throws org.apache.commons.math3.exception.DimensionMismatchException {
		if ((dataRI.length) != 2) {
			throw new org.apache.commons.math3.exception.DimensionMismatchException(dataRI.length, 2);
		}
		final double[] dataR = dataRI[0];
		final double[] dataI = dataRI[1];
		if ((dataR.length) != (dataI.length)) {
			throw new org.apache.commons.math3.exception.DimensionMismatchException(dataI.length, dataR.length);
		}
		final int n = dataR.length;
		final org.apache.commons.math3.complex.Complex[] c = new org.apache.commons.math3.complex.Complex[n];
		for (int i = 0; i < n; i++) {
			c[i] = new org.apache.commons.math3.complex.Complex(dataR[i], dataI[i]);
		}
		return c;
	}

	public static int exactLog2(final int n) throws org.apache.commons.math3.exception.MathIllegalArgumentException {
		int index = java.util.Arrays.binarySearch(org.apache.commons.math3.transform.TransformUtils.POWERS_OF_TWO, n);
		if (index < 0) {
			throw new org.apache.commons.math3.exception.MathIllegalArgumentException(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POWER_OF_TWO_CONSIDER_PADDING, java.lang.Integer.valueOf(n));
		}
		return index;
	}
}

