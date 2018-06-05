

package org.apache.commons.math.transform;


public class FastFourierTransformer implements java.io.Serializable {
	static final long serialVersionUID = 5138259215438106000L;

	private org.apache.commons.math.transform.FastFourierTransformer.RootsOfUnity roots = new org.apache.commons.math.transform.FastFourierTransformer.RootsOfUnity();

	public FastFourierTransformer() {
		super();
	}

	public org.apache.commons.math.complex.Complex[] transform(double[] f) throws java.lang.IllegalArgumentException {
		return fft(f, false);
	}

	public org.apache.commons.math.complex.Complex[] transform(org.apache.commons.math.analysis.UnivariateRealFunction f, double min, double max, int n) throws java.lang.IllegalArgumentException, org.apache.commons.math.FunctionEvaluationException {
		double[] data = org.apache.commons.math.transform.FastFourierTransformer.sample(f, min, max, n);
		return fft(data, false);
	}

	public org.apache.commons.math.complex.Complex[] transform(org.apache.commons.math.complex.Complex[] f) throws java.lang.IllegalArgumentException {
		roots.computeOmega(f.length);
		return fft(f);
	}

	public org.apache.commons.math.complex.Complex[] transform2(double[] f) throws java.lang.IllegalArgumentException {
		double scaling_coefficient = 1.0 / (java.lang.Math.sqrt(f.length));
		return org.apache.commons.math.transform.FastFourierTransformer.scaleArray(fft(f, false), scaling_coefficient);
	}

	public org.apache.commons.math.complex.Complex[] transform2(org.apache.commons.math.analysis.UnivariateRealFunction f, double min, double max, int n) throws java.lang.IllegalArgumentException, org.apache.commons.math.FunctionEvaluationException {
		double[] data = org.apache.commons.math.transform.FastFourierTransformer.sample(f, min, max, n);
		double scaling_coefficient = 1.0 / (java.lang.Math.sqrt(n));
		return org.apache.commons.math.transform.FastFourierTransformer.scaleArray(fft(data, false), scaling_coefficient);
	}

	public org.apache.commons.math.complex.Complex[] transform2(org.apache.commons.math.complex.Complex[] f) throws java.lang.IllegalArgumentException {
		roots.computeOmega(f.length);
		double scaling_coefficient = 1.0 / (java.lang.Math.sqrt(f.length));
		return org.apache.commons.math.transform.FastFourierTransformer.scaleArray(fft(f), scaling_coefficient);
	}

	public org.apache.commons.math.complex.Complex[] inversetransform(double[] f) throws java.lang.IllegalArgumentException {
		double scaling_coefficient = 1.0 / (f.length);
		return org.apache.commons.math.transform.FastFourierTransformer.scaleArray(fft(f, true), scaling_coefficient);
	}

	public org.apache.commons.math.complex.Complex[] inversetransform(org.apache.commons.math.analysis.UnivariateRealFunction f, double min, double max, int n) throws java.lang.IllegalArgumentException, org.apache.commons.math.FunctionEvaluationException {
		double[] data = org.apache.commons.math.transform.FastFourierTransformer.sample(f, min, max, n);
		double scaling_coefficient = 1.0 / n;
		return org.apache.commons.math.transform.FastFourierTransformer.scaleArray(fft(data, true), scaling_coefficient);
	}

	public org.apache.commons.math.complex.Complex[] inversetransform(org.apache.commons.math.complex.Complex[] f) throws java.lang.IllegalArgumentException {
		roots.computeOmega((-(f.length)));
		double scaling_coefficient = 1.0 / (f.length);
		return org.apache.commons.math.transform.FastFourierTransformer.scaleArray(fft(f), scaling_coefficient);
	}

	public org.apache.commons.math.complex.Complex[] inversetransform2(double[] f) throws java.lang.IllegalArgumentException {
		double scaling_coefficient = 1.0 / (java.lang.Math.sqrt(f.length));
		return org.apache.commons.math.transform.FastFourierTransformer.scaleArray(fft(f, true), scaling_coefficient);
	}

	public org.apache.commons.math.complex.Complex[] inversetransform2(org.apache.commons.math.analysis.UnivariateRealFunction f, double min, double max, int n) throws java.lang.IllegalArgumentException, org.apache.commons.math.FunctionEvaluationException {
		double[] data = org.apache.commons.math.transform.FastFourierTransformer.sample(f, min, max, n);
		double scaling_coefficient = 1.0 / (java.lang.Math.sqrt(n));
		return org.apache.commons.math.transform.FastFourierTransformer.scaleArray(fft(data, true), scaling_coefficient);
	}

	public org.apache.commons.math.complex.Complex[] inversetransform2(org.apache.commons.math.complex.Complex[] f) throws java.lang.IllegalArgumentException {
		roots.computeOmega((-(f.length)));
		double scaling_coefficient = 1.0 / (java.lang.Math.sqrt(f.length));
		return org.apache.commons.math.transform.FastFourierTransformer.scaleArray(fft(f), scaling_coefficient);
	}

	protected org.apache.commons.math.complex.Complex[] fft(double[] f, boolean isInverse) throws java.lang.IllegalArgumentException {
		org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(f);
		org.apache.commons.math.complex.Complex[] F = new org.apache.commons.math.complex.Complex[f.length];
		if ((f.length) == 1) {
			F[0] = new org.apache.commons.math.complex.Complex(f[0], 0.0);
			return F;
		}
		int N = (f.length) >> 1;
		org.apache.commons.math.complex.Complex[] c = new org.apache.commons.math.complex.Complex[N];
		for (int i = 0; i < N; i++) {
			c[i] = new org.apache.commons.math.complex.Complex(f[(2 * i)], f[((2 * i) + 1)]);
		}
		roots.computeOmega((isInverse ? -N : N));
		org.apache.commons.math.complex.Complex[] z = fft(c);
		roots.computeOmega((isInverse ? (-2) * N : 2 * N));
		F[0] = new org.apache.commons.math.complex.Complex((2 * ((z[0].getReal()) + (z[0].getImaginary()))), 0.0);
		F[N] = new org.apache.commons.math.complex.Complex((2 * ((z[0].getReal()) - (z[0].getImaginary()))), 0.0);
		for (int i = 1; i < N; i++) {
			org.apache.commons.math.complex.Complex A = z[(N - i)].conjugate();
			org.apache.commons.math.complex.Complex B = z[i].add(A);
			org.apache.commons.math.complex.Complex C = z[i].subtract(A);
			org.apache.commons.math.complex.Complex D = new org.apache.commons.math.complex.Complex((-(roots.getOmegaImaginary(i))), roots.getOmegaReal(i));
			F[i] = B.subtract(C.multiply(D));
			F[((2 * N) - i)] = F[i].conjugate();
		}
		return org.apache.commons.math.transform.FastFourierTransformer.scaleArray(F, 0.5);
	}

	protected org.apache.commons.math.complex.Complex[] fft(org.apache.commons.math.complex.Complex[] data) throws java.lang.IllegalArgumentException {
		int i;
		int j;
		int k;
		int m;
		int N = data.length;
		org.apache.commons.math.complex.Complex A;
		org.apache.commons.math.complex.Complex B;
		org.apache.commons.math.complex.Complex C;
		org.apache.commons.math.complex.Complex D;
		org.apache.commons.math.complex.Complex E;
		org.apache.commons.math.complex.Complex F;
		org.apache.commons.math.complex.Complex z;
		org.apache.commons.math.complex.Complex[] f = new org.apache.commons.math.complex.Complex[N];
		org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(data);
		if (N == 1) {
			f[0] = data[0];
			return f;
		}
		if (N == 2) {
			f[0] = data[0].add(data[1]);
			f[1] = data[0].subtract(data[1]);
			return f;
		}
		j = 0;
		for (i = 0; i < N; i++) {
			f[i] = data[j];
			k = N >> 1;
			while ((j >= k) && (k > 0)) {
				j -= k;
				k >>= 1;
			} 
			j += k;
		}
		for (i = 0; i < N; i += 4) {
			A = f[i].add(f[(i + 1)]);
			B = f[(i + 2)].add(f[(i + 3)]);
			C = f[i].subtract(f[(i + 1)]);
			D = f[(i + 2)].subtract(f[(i + 3)]);
			E = C.add(D.multiply(org.apache.commons.math.complex.Complex.I));
			F = C.subtract(D.multiply(org.apache.commons.math.complex.Complex.I));
			f[i] = A.add(B);
			f[(i + 2)] = A.subtract(B);
			f[(i + 1)] = (roots.isForward()) ? F : E;
			f[(i + 3)] = (roots.isForward()) ? E : F;
		}
		for (i = 4; i < N; i <<= 1) {
			m = N / (i << 1);
			for (j = 0; j < N; j += i << 1) {
				for (k = 0; k < i; k++) {
					final int k_times_m = k * m;
					final double omega_k_times_m_real = roots.getOmegaReal(k_times_m);
					final double omega_k_times_m_imaginary = roots.getOmegaImaginary(k_times_m);
					z = new org.apache.commons.math.complex.Complex((((f[((i + j) + k)].getReal()) * omega_k_times_m_real) - ((f[((i + j) + k)].getImaginary()) * omega_k_times_m_imaginary)), (((f[((i + j) + k)].getReal()) * omega_k_times_m_imaginary) + ((f[((i + j) + k)].getImaginary()) * omega_k_times_m_real)));
					f[((i + j) + k)] = f[(j + k)].subtract(z);
					f[(j + k)] = f[(j + k)].add(z);
				}
			}
		}
		return f;
	}

	public static double[] sample(org.apache.commons.math.analysis.UnivariateRealFunction f, double min, double max, int n) throws java.lang.IllegalArgumentException, org.apache.commons.math.FunctionEvaluationException {
		if (n <= 0) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("number of sample is not positive: {0}", n);
		}
		org.apache.commons.math.transform.FastFourierTransformer.verifyInterval(min, max);
		double[] s = new double[n];
		double h = (max - min) / n;
		for (int i = 0; i < n; i++) {
			s[i] = f.value((min + (i * h)));
		}
		return s;
	}

	public static double[] scaleArray(double[] f, double d) {
		for (int i = 0; i < (f.length); i++) {
			f[i] *= d;
		}
		return f;
	}

	public static org.apache.commons.math.complex.Complex[] scaleArray(org.apache.commons.math.complex.Complex[] f, double d) {
		for (int i = 0; i < (f.length); i++) {
			f[i] = new org.apache.commons.math.complex.Complex((d * (f[i].getReal())), (d * (f[i].getImaginary())));
		}
		return f;
	}

	public static boolean isPowerOf2(long n) {
		return (n > 0) && ((n & (n - 1)) == 0);
	}

	public static void verifyDataSet(double[] d) throws java.lang.IllegalArgumentException {
		if (!(org.apache.commons.math.transform.FastFourierTransformer.isPowerOf2(d.length))) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("{0} is not a power of 2, consider padding for fix", d.length);
		}
	}

	public static void verifyDataSet(java.lang.Object[] o) throws java.lang.IllegalArgumentException {
		if (!(org.apache.commons.math.transform.FastFourierTransformer.isPowerOf2(o.length))) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("{0} is not a power of 2, consider padding for fix", o.length);
		}
	}

	public static void verifyInterval(double lower, double upper) throws java.lang.IllegalArgumentException {
		if (lower >= upper) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("endpoints do not specify an interval: [{0}, {1}]", lower, upper);
		}
	}

	public java.lang.Object mdfft(java.lang.Object mdca, boolean forward) throws java.lang.IllegalArgumentException {
		org.apache.commons.math.transform.FastFourierTransformer.MultiDimensionalComplexMatrix mdcm = ((org.apache.commons.math.transform.FastFourierTransformer.MultiDimensionalComplexMatrix) (new org.apache.commons.math.transform.FastFourierTransformer.MultiDimensionalComplexMatrix(mdca).clone()));
		int[] dimensionSize = mdcm.getDimensionSizes();
		for (int i = 0; i < (dimensionSize.length); i++) {
			mdfft(mdcm, forward, i, new int[0]);
		}
		return mdcm.getArray();
	}

	private void mdfft(org.apache.commons.math.transform.FastFourierTransformer.MultiDimensionalComplexMatrix mdcm, boolean forward, int d, int[] subVector) throws java.lang.IllegalArgumentException {
		int[] dimensionSize = mdcm.getDimensionSizes();
		if ((subVector.length) == (dimensionSize.length)) {
			org.apache.commons.math.complex.Complex[] temp = new org.apache.commons.math.complex.Complex[dimensionSize[d]];
			for (int i = 0; i < (dimensionSize[d]); i++) {
				subVector[d] = i;
				temp[i] = mdcm.get(subVector);
			}
			if (forward)
				temp = transform2(temp);
			else
				temp = inversetransform2(temp);
			
			for (int i = 0; i < (dimensionSize[d]); i++) {
				subVector[d] = i;
				mdcm.set(temp[i], subVector);
			}
		}else {
			int[] vector = new int[(subVector.length) + 1];
			java.lang.System.arraycopy(subVector, 0, vector, 0, subVector.length);
			if ((subVector.length) == d) {
				vector[d] = 0;
				mdfft(mdcm, forward, d, vector);
			}else {
				for (int i = 0; i < (dimensionSize[subVector.length]); i++) {
					vector[subVector.length] = i;
					mdfft(mdcm, forward, d, vector);
				}
			}
		}
		return ;
	}

	private class MultiDimensionalComplexMatrix implements java.io.Serializable , java.lang.Cloneable {
		private static final long serialVersionUID = 6219415319201978011L;

		protected int[] dimensionSize = new int[1];

		protected java.lang.Object multiDimensionalComplexArray;

		public MultiDimensionalComplexMatrix(java.lang.Object multiDimensionalComplexArray) {
			org.apache.commons.math.transform.FastFourierTransformer.MultiDimensionalComplexMatrix.this.multiDimensionalComplexArray = multiDimensionalComplexArray;
			int numOfDimensions = 0;
			java.lang.Object lastDimension = multiDimensionalComplexArray;
			while (lastDimension instanceof java.lang.Object[]) {
				numOfDimensions++;
				if ((dimensionSize.length) < numOfDimensions) {
					int[] newDimensionSize = new int[((int) (java.lang.Math.ceil(((dimensionSize.length) * 1.6))))];
					java.lang.System.arraycopy(dimensionSize, 0, newDimensionSize, 0, dimensionSize.length);
					dimensionSize = newDimensionSize;
				}
				dimensionSize[(numOfDimensions - 1)] = ((java.lang.Object[]) (lastDimension)).length;
				lastDimension = ((java.lang.Object[]) (lastDimension))[0];
			} 
			if ((dimensionSize.length) > numOfDimensions) {
				int[] newDimensionSize = new int[numOfDimensions];
				java.lang.System.arraycopy(dimensionSize, 0, newDimensionSize, 0, numOfDimensions);
				dimensionSize = newDimensionSize;
			}
		}

		public org.apache.commons.math.complex.Complex get(int... vector) throws java.lang.IllegalArgumentException {
			if ((vector == null) && ((dimensionSize.length) > 1)) {
				throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("some dimensions don't math: {0} != {1}", 0, dimensionSize.length);
			}
			if ((vector != null) && ((vector.length) != (dimensionSize.length))) {
				throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("some dimensions don't math: {0} != {1}", vector.length, dimensionSize.length);
			}
			java.lang.Object lastDimension = multiDimensionalComplexArray;
			for (int i = 0; i < (dimensionSize.length); i++) {
				lastDimension = ((java.lang.Object[]) (lastDimension))[vector[i]];
			}
			return ((org.apache.commons.math.complex.Complex) (lastDimension));
		}

		public org.apache.commons.math.complex.Complex set(org.apache.commons.math.complex.Complex magnitude, int... vector) throws java.lang.IllegalArgumentException {
			if (vector == null) {
				if ((dimensionSize.length) > 1) {
					throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("some dimensions don't math: {0} != {1}", 0, dimensionSize.length);
				}
				return null;
			}
			if ((vector != null) && ((vector.length) != (dimensionSize.length))) {
				throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("some dimensions don't math: {0} != {1}", vector.length, dimensionSize.length);
			}
			java.lang.Object[] lastDimension = ((java.lang.Object[]) (multiDimensionalComplexArray));
			for (int i = 0; i < ((dimensionSize.length) - 1); i++) {
				lastDimension = ((java.lang.Object[]) (lastDimension[vector[i]]));
			}
			org.apache.commons.math.complex.Complex lastValue = ((org.apache.commons.math.complex.Complex) (lastDimension[vector[((dimensionSize.length) - 1)]]));
			lastDimension[vector[((dimensionSize.length) - 1)]] = magnitude;
			return lastValue;
		}

		public int[] getDimensionSizes() {
			return dimensionSize.clone();
		}

		public java.lang.Object getArray() {
			return multiDimensionalComplexArray;
		}

		@java.lang.Override
		public java.lang.Object clone() {
			org.apache.commons.math.transform.FastFourierTransformer.MultiDimensionalComplexMatrix mdcm = new org.apache.commons.math.transform.FastFourierTransformer.MultiDimensionalComplexMatrix(java.lang.reflect.Array.newInstance(org.apache.commons.math.complex.Complex.class, dimensionSize));
			clone(mdcm);
			return mdcm;
		}

		private void clone(org.apache.commons.math.transform.FastFourierTransformer.MultiDimensionalComplexMatrix mdcm) {
			int[] vector = new int[dimensionSize.length];
			int size = 1;
			for (int i = 0; i < (dimensionSize.length); i++) {
				size *= dimensionSize[i];
			}
			int[][] vectorList = new int[size][dimensionSize.length];
			for (int[] nextVector : vectorList) {
				java.lang.System.arraycopy(vector, 0, nextVector, 0, dimensionSize.length);
				for (int i = 0; i < (dimensionSize.length); i++) {
					(vector[i])++;
					if ((vector[i]) < (dimensionSize[i])) {
						break;
					}else {
						vector[i] = 0;
					}
				}
			}
			for (int[] nextVector : vectorList) {
				mdcm.set(get(nextVector), nextVector);
			}
		}
	}

	private static class RootsOfUnity implements java.io.Serializable {
		private static final long serialVersionUID = 6404784357747329667L;

		private int omegaCount;

		private double[] omegaReal;

		private double[] omegaImaginaryForward;

		private double[] omegaImaginaryInverse;

		private boolean isForward;

		public RootsOfUnity() {
			omegaCount = 0;
			omegaReal = null;
			omegaImaginaryForward = null;
			omegaImaginaryInverse = null;
			isForward = true;
		}

		public synchronized boolean isForward() throws java.lang.IllegalStateException {
			if ((omegaCount) == 0) {
				throw org.apache.commons.math.MathRuntimeException.createIllegalStateException("roots of unity have not been computed yet");
			}
			return isForward;
		}

		public synchronized void computeOmega(int n) throws java.lang.IllegalArgumentException {
			if (n == 0) {
				throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("cannot compute 0-th root of unity, indefinite result");
			}
			isForward = n > 0;
			final int absN = java.lang.Math.abs(n);
			if (absN == (omegaCount)) {
				return ;
			}
			final double t = (2.0 * (java.lang.Math.PI)) / absN;
			final double cosT = java.lang.Math.cos(t);
			final double sinT = java.lang.Math.sin(t);
			omegaReal = new double[absN];
			omegaImaginaryForward = new double[absN];
			omegaImaginaryInverse = new double[absN];
			omegaReal[0] = 1.0;
			omegaImaginaryForward[0] = 0.0;
			omegaImaginaryInverse[0] = 0.0;
			for (int i = 1; i < absN; i++) {
				omegaReal[i] = ((omegaReal[(i - 1)]) * cosT) + ((omegaImaginaryForward[(i - 1)]) * sinT);
				omegaImaginaryForward[i] = ((omegaImaginaryForward[(i - 1)]) * cosT) - ((omegaReal[(i - 1)]) * sinT);
				omegaImaginaryInverse[i] = -(omegaImaginaryForward[i]);
			}
			omegaCount = absN;
		}

		public synchronized double getOmegaReal(int k) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException {
			if ((omegaCount) == 0) {
				throw org.apache.commons.math.MathRuntimeException.createIllegalStateException("roots of unity have not been computed yet");
			}
			if ((k < 0) || (k >= (omegaCount))) {
				throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("out of range root of unity index {0} (must be in [{1};{2}])", k, 0, ((omegaCount) - 1));
			}
			return omegaReal[k];
		}

		public synchronized double getOmegaImaginary(int k) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException {
			if ((omegaCount) == 0) {
				throw org.apache.commons.math.MathRuntimeException.createIllegalStateException("roots of unity have not been computed yet");
			}
			if ((k < 0) || (k >= (omegaCount))) {
				throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("out of range root of unity index {0} (must be in [{1};{2}])", k, 0, ((omegaCount) - 1));
			}
			return isForward ? omegaImaginaryForward[k] : omegaImaginaryInverse[k];
		}
	}
}

