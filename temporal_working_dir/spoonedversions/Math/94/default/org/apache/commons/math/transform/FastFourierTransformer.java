

package org.apache.commons.math.transform;


public class FastFourierTransformer implements java.io.Serializable {
	static final long serialVersionUID = 5138259215438106000L;

	private org.apache.commons.math.complex.Complex[] omega = new org.apache.commons.math.complex.Complex[0];

	private int omegaCount = 0;

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
		computeOmega(f.length);
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
		computeOmega(f.length);
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
		computeOmega((-(f.length)));
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
		computeOmega((-(f.length)));
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
		computeOmega((isInverse ? -N : N));
		org.apache.commons.math.complex.Complex[] z = fft(c);
		computeOmega((isInverse ? (-2) * N : 2 * N));
		F[0] = new org.apache.commons.math.complex.Complex((2 * ((z[0].getReal()) + (z[0].getImaginary()))), 0.0);
		F[N] = new org.apache.commons.math.complex.Complex((2 * ((z[0].getReal()) - (z[0].getImaginary()))), 0.0);
		for (int i = 1; i < N; i++) {
			org.apache.commons.math.complex.Complex A = z[(N - i)].conjugate();
			org.apache.commons.math.complex.Complex B = z[i].add(A);
			org.apache.commons.math.complex.Complex C = z[i].subtract(A);
			org.apache.commons.math.complex.Complex D = omega[i].multiply(org.apache.commons.math.complex.Complex.I);
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
			f[(i + 1)] = ((omegaCount) < 0) ? E : F;
			f[(i + 3)] = ((omegaCount) > 0) ? E : F;
		}
		for (i = 4; i < N; i <<= 1) {
			m = N / (i << 1);
			for (j = 0; j < N; j += i << 1) {
				for (k = 0; k < i; k++) {
					z = f[((i + j) + k)].multiply(omega[(k * m)]);
					f[((i + j) + k)] = f[(j + k)].subtract(z);
					f[(j + k)] = f[(j + k)].add(z);
				}
			}
		}
		return f;
	}

	protected void computeOmega(int n) throws java.lang.IllegalArgumentException {
		if (n == 0) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("cannot compute 0-th root of unity, indefinite result", null);
		}
		if (n == (omegaCount)) {
			return ;
		}
		if ((n + (omegaCount)) == 0) {
			for (int i = 0; i < (java.lang.Math.abs(omegaCount)); i++) {
				omega[i] = omega[i].conjugate();
			}
			omegaCount = n;
			return ;
		}
		omega = new org.apache.commons.math.complex.Complex[java.lang.Math.abs(n)];
		double t = (2.0 * (java.lang.Math.PI)) / n;
		double cost = java.lang.Math.cos(t);
		double sint = java.lang.Math.sin(t);
		omega[0] = new org.apache.commons.math.complex.Complex(1.0, 0.0);
		for (int i = 1; i < (java.lang.Math.abs(n)); i++) {
			omega[i] = new org.apache.commons.math.complex.Complex((((omega[(i - 1)].getReal()) * cost) + ((omega[(i - 1)].getImaginary()) * sint)), (((omega[(i - 1)].getImaginary()) * cost) - ((omega[(i - 1)].getReal()) * sint)));
		}
		omegaCount = n;
	}

	public static double[] sample(org.apache.commons.math.analysis.UnivariateRealFunction f, double min, double max, int n) throws java.lang.IllegalArgumentException, org.apache.commons.math.FunctionEvaluationException {
		if (n <= 0) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("number of sample is not positive: {0}", new java.lang.Object[]{ n });
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
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("{0} is not a power of 2, consider padding for fix", new java.lang.Object[]{ d.length });
		}
	}

	public static void verifyDataSet(java.lang.Object[] o) throws java.lang.IllegalArgumentException {
		if (!(org.apache.commons.math.transform.FastFourierTransformer.isPowerOf2(o.length))) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("{0} is not a power of 2, consider padding for fix", new java.lang.Object[]{ o.length });
		}
	}

	public static void verifyInterval(double lower, double upper) throws java.lang.IllegalArgumentException {
		if (lower >= upper) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("endpoints do not specify an interval: [{0}, {1}]", new java.lang.Object[]{ lower , upper });
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
				throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("some dimensions don't math: {0} != {1}", new java.lang.Object[]{ 0 , dimensionSize.length });
			}
			if ((vector != null) && ((vector.length) != (dimensionSize.length))) {
				throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("some dimensions don't math: {0} != {1}", new java.lang.Object[]{ vector.length , dimensionSize.length });
			}
			java.lang.Object lastDimension = multiDimensionalComplexArray;
			for (int i = 0; i < (dimensionSize.length); i++) {
				lastDimension = ((java.lang.Object[]) (lastDimension))[vector[i]];
			}
			return ((org.apache.commons.math.complex.Complex) (lastDimension));
		}

		public org.apache.commons.math.complex.Complex set(org.apache.commons.math.complex.Complex magnitude, int... vector) throws java.lang.IllegalArgumentException {
			if ((vector == null) && ((dimensionSize.length) > 1)) {
				throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("some dimensions don't math: {0} != {1}", new java.lang.Object[]{ 0 , dimensionSize.length });
			}
			if ((vector != null) && ((vector.length) != (dimensionSize.length))) {
				throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("some dimensions don't math: {0} != {1}", new java.lang.Object[]{ vector.length , dimensionSize.length });
			}
			java.lang.Object lastDimension = multiDimensionalComplexArray;
			for (int i = 0; i < ((dimensionSize.length) - 1); i++) {
				lastDimension = ((java.lang.Object[]) (lastDimension))[vector[i]];
			}
			org.apache.commons.math.complex.Complex lastValue = ((org.apache.commons.math.complex.Complex) (((java.lang.Object[]) (lastDimension))[vector[((dimensionSize.length) - 1)]]));
			((java.lang.Object[]) (lastDimension))[vector[((dimensionSize.length) - 1)]] = magnitude;
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
}

