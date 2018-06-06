

package org.apache.commons.math.transform;


public class FastFourierTransformer implements java.io.Serializable {
	static final long serialVersionUID = 20120210L;

	private static final double[] W_SUB_N_R = new double[]{ 1.0 , -1.0 , 6.123233995736766E-17 , 0.7071067811865476 , 0.9238795325112867 , 0.9807852804032304 , 0.9951847266721969 , 0.9987954562051724 , 0.9996988186962042 , 0.9999247018391445 , 0.9999811752826011 , 0.9999952938095762 , 0.9999988234517019 , 0.9999997058628822 , 0.9999999264657179 , 0.9999999816164293 , 0.9999999954041073 , 0.9999999988510269 , 0.9999999997127567 , 0.9999999999281892 , 0.9999999999820472 , 0.9999999999955118 , 0.999999999998878 , 0.9999999999997194 , 0.9999999999999298 , 0.9999999999999825 , 0.9999999999999957 , 0.9999999999999989 , 0.9999999999999998 , 0.9999999999999999 , 1.0 , 1.0 , 1.0 , 1.0 , 1.0 , 1.0 , 1.0 , 1.0 , 1.0 , 1.0 , 1.0 , 1.0 , 1.0 , 1.0 , 1.0 , 1.0 , 1.0 , 1.0 , 1.0 , 1.0 , 1.0 , 1.0 , 1.0 , 1.0 , 1.0 , 1.0 , 1.0 , 1.0 , 1.0 , 1.0 , 1.0 , 1.0 , 1.0 };

	private static final double[] W_SUB_N_I = new double[]{ 2.4492935982947064E-16 , -1.2246467991473532E-16 , -1.0 , -0.7071067811865475 , -0.3826834323650898 , -0.19509032201612825 , -0.0980171403295606 , -0.049067674327418015 , -0.024541228522912288 , -0.012271538285719925 , -0.006135884649154475 , -0.003067956762965976 , -0.0015339801862847655 , -7.669903187427045E-4 , -3.8349518757139556E-4 , -1.917475973107033E-4 , -9.587379909597734E-5 , -4.793689960306688E-5 , -2.396844980841822E-5 , -1.1984224905069705E-5 , -5.9921124526424275E-6 , -2.996056226334661E-6 , -1.4980281131690111E-6 , -7.490140565847157E-7 , -3.7450702829238413E-7 , -1.8725351414619535E-7 , -9.362675707309808E-8 , -4.681337853654909E-8 , -2.340668926827455E-8 , -1.1703344634137277E-8 , -5.8516723170686385E-9 , -2.9258361585343192E-9 , -1.4629180792671596E-9 , -7.314590396335798E-10 , -3.657295198167899E-10 , -1.8286475990839495E-10 , -9.143237995419748E-11 , -4.571618997709874E-11 , -2.285809498854937E-11 , -1.1429047494274685E-11 , -5.714523747137342E-12 , -2.857261873568671E-12 , -1.4286309367843356E-12 , -7.143154683921678E-13 , -3.571577341960839E-13 , -1.7857886709804195E-13 , -8.928943354902097E-14 , -4.4644716774510487E-14 , -2.2322358387255243E-14 , -1.1161179193627622E-14 , -5.580589596813811E-15 , -2.7902947984069054E-15 , -1.3951473992034527E-15 , -6.975736996017264E-16 , -3.487868498008632E-16 , -1.743934249004316E-16 , -8.71967124502158E-17 , -4.35983562251079E-17 , -2.179917811255395E-17 , -1.0899589056276974E-17 , -5.449794528138487E-18 , -2.7248972640692436E-18 , -1.3624486320346218E-18 };

	private final org.apache.commons.math.transform.DftNormalization normalization;

	public FastFourierTransformer(final org.apache.commons.math.transform.DftNormalization normalization) {
		this.normalization = normalization;
	}

	private static void bitReversalShuffle2(double[] a, double[] b) {
		final int n = a.length;
		assert (b.length) == n;
		final int halfOfN = n >> 1;
		int j = 0;
		for (int i = 0; i < n; i++) {
			if (i < j) {
				double temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				temp = b[i];
				b[i] = b[j];
				b[j] = temp;
			}
			int k = halfOfN;
			while ((k <= j) && (k > 0)) {
				j -= k;
				k >>= 1;
			} 
			j += k;
		}
	}

	private static void normalizeTransformedData(final double[][] dataRI, final org.apache.commons.math.transform.DftNormalization normalization, final org.apache.commons.math.transform.TransformType type) {
		final double[] dataR = dataRI[0];
		final double[] dataI = dataRI[1];
		final int n = dataR.length;
		assert (dataI.length) == n;
		switch (normalization) {
			case STANDARD :
				if (type == (org.apache.commons.math.transform.TransformType.INVERSE)) {
					final double scaleFactor = 1.0 / ((double) (n));
					for (int i = 0; i < n; i++) {
						dataR[i] *= scaleFactor;
						dataI[i] *= scaleFactor;
					}
				}
				break;
			case UNITARY :
				final double scaleFactor = 1.0 / (org.apache.commons.math.util.FastMath.sqrt(n));
				for (int i = 0; i < n; i++) {
					dataR[i] *= scaleFactor;
					dataI[i] *= scaleFactor;
				}
				break;
			default :
				throw new org.apache.commons.math.exception.MathIllegalStateException();
		}
	}

	public static void transformInPlace(final double[][] dataRI, final org.apache.commons.math.transform.DftNormalization normalization, final org.apache.commons.math.transform.TransformType type) {
		if ((dataRI.length) != 2) {
			throw new org.apache.commons.math.exception.DimensionMismatchException(dataRI.length, 2);
		}
		final double[] dataR = dataRI[0];
		final double[] dataI = dataRI[1];
		if ((dataR.length) != (dataI.length)) {
			throw new org.apache.commons.math.exception.DimensionMismatchException(dataI.length, dataR.length);
		}
		final int n = dataR.length;
		if (!(org.apache.commons.math.util.ArithmeticUtils.isPowerOfTwo(n))) {
			throw new org.apache.commons.math.exception.MathIllegalArgumentException(org.apache.commons.math.exception.util.LocalizedFormats.NOT_POWER_OF_TWO_CONSIDER_PADDING, java.lang.Integer.valueOf(n));
		}
		if (n == 1) {
			return ;
		}else
			if (n == 2) {
				final double srcR0 = dataR[0];
				final double srcI0 = dataI[0];
				final double srcR1 = dataR[1];
				final double srcI1 = dataI[1];
				dataR[0] = srcR0 + srcR1;
				dataI[0] = srcI0 + srcI1;
				dataR[1] = srcR0 - srcR1;
				dataI[1] = srcI0 - srcI1;
				org.apache.commons.math.transform.FastFourierTransformer.normalizeTransformedData(dataRI, normalization, type);
				return ;
			}
		
		org.apache.commons.math.transform.FastFourierTransformer.bitReversalShuffle2(dataR, dataI);
		if (type == (org.apache.commons.math.transform.TransformType.INVERSE)) {
			for (int i0 = 0; i0 < n; i0 += 4) {
				final int i1 = i0 + 1;
				final int i2 = i0 + 2;
				final int i3 = i0 + 3;
				final double srcR0 = dataR[i0];
				final double srcI0 = dataI[i0];
				final double srcR1 = dataR[i2];
				final double srcI1 = dataI[i2];
				final double srcR2 = dataR[i1];
				final double srcI2 = dataI[i1];
				final double srcR3 = dataR[i3];
				final double srcI3 = dataI[i3];
				dataR[i0] = ((srcR0 + srcR1) + srcR2) + srcR3;
				dataI[i0] = ((srcI0 + srcI1) + srcI2) + srcI3;
				dataR[i1] = (srcR0 - srcR2) + (srcI3 - srcI1);
				dataI[i1] = (srcI0 - srcI2) + (srcR1 - srcR3);
				dataR[i2] = ((srcR0 - srcR1) + srcR2) - srcR3;
				dataI[i2] = ((srcI0 - srcI1) + srcI2) - srcI3;
				dataR[i3] = (srcR0 - srcR2) + (srcI1 - srcI3);
				dataI[i3] = (srcI0 - srcI2) + (srcR3 - srcR1);
			}
		}else {
			for (int i0 = 0; i0 < n; i0 += 4) {
				final int i1 = i0 + 1;
				final int i2 = i0 + 2;
				final int i3 = i0 + 3;
				final double srcR0 = dataR[i0];
				final double srcI0 = dataI[i0];
				final double srcR1 = dataR[i2];
				final double srcI1 = dataI[i2];
				final double srcR2 = dataR[i1];
				final double srcI2 = dataI[i1];
				final double srcR3 = dataR[i3];
				final double srcI3 = dataI[i3];
				dataR[i0] = ((srcR0 + srcR1) + srcR2) + srcR3;
				dataI[i0] = ((srcI0 + srcI1) + srcI2) + srcI3;
				dataR[i1] = (srcR0 - srcR2) + (srcI1 - srcI3);
				dataI[i1] = (srcI0 - srcI2) + (srcR3 - srcR1);
				dataR[i2] = ((srcR0 - srcR1) + srcR2) - srcR3;
				dataI[i2] = ((srcI0 - srcI1) + srcI2) - srcI3;
				dataR[i3] = (srcR0 - srcR2) + (srcI3 - srcI1);
				dataI[i3] = (srcI0 - srcI2) + (srcR1 - srcR3);
			}
		}
		int lastN0 = 4;
		int lastLogN0 = 2;
		while (lastN0 < n) {
			int n0 = lastN0 << 1;
			int logN0 = lastLogN0 + 1;
			double wSubN0R = org.apache.commons.math.transform.FastFourierTransformer.W_SUB_N_R[logN0];
			double wSubN0I = org.apache.commons.math.transform.FastFourierTransformer.W_SUB_N_I[logN0];
			if (type == (org.apache.commons.math.transform.TransformType.INVERSE)) {
				wSubN0I = -wSubN0I;
			}
			for (int destEvenStartIndex = 0; destEvenStartIndex < n; destEvenStartIndex += n0) {
				int destOddStartIndex = destEvenStartIndex + lastN0;
				double wSubN0ToRR = 1;
				double wSubN0ToRI = 0;
				for (int r = 0; r < lastN0; r++) {
					double grR = dataR[(destEvenStartIndex + r)];
					double grI = dataI[(destEvenStartIndex + r)];
					double hrR = dataR[(destOddStartIndex + r)];
					double hrI = dataI[(destOddStartIndex + r)];
					dataR[(destEvenStartIndex + r)] = (grR + (wSubN0ToRR * hrR)) - (wSubN0ToRI * hrI);
					dataI[(destEvenStartIndex + r)] = (grI + (wSubN0ToRR * hrI)) + (wSubN0ToRI * hrR);
					dataR[(destOddStartIndex + r)] = grR - ((wSubN0ToRR * hrR) - (wSubN0ToRI * hrI));
					dataI[(destOddStartIndex + r)] = grI - ((wSubN0ToRR * hrI) + (wSubN0ToRI * hrR));
					double nextWsubN0ToRR = (wSubN0ToRR * wSubN0R) - (wSubN0ToRI * wSubN0I);
					double nextWsubN0ToRI = (wSubN0ToRR * wSubN0I) + (wSubN0ToRI * wSubN0R);
					wSubN0ToRR = nextWsubN0ToRR;
					wSubN0ToRI = nextWsubN0ToRI;
				}
			}
			lastN0 = n0;
			lastLogN0 = logN0;
		} 
		org.apache.commons.math.transform.FastFourierTransformer.normalizeTransformedData(dataRI, normalization, type);
	}

	public org.apache.commons.math.complex.Complex[] transform(final double[] f, final org.apache.commons.math.transform.TransformType type) {
		final double[][] dataRI = new double[][]{ org.apache.commons.math.util.MathArrays.copyOf(f, f.length) , new double[f.length] };
		org.apache.commons.math.transform.FastFourierTransformer.transformInPlace(dataRI, normalization, type);
		return org.apache.commons.math.transform.TransformUtils.createComplexArray(dataRI);
	}

	public org.apache.commons.math.complex.Complex[] transform(final org.apache.commons.math.analysis.UnivariateFunction f, final double min, final double max, final int n, final org.apache.commons.math.transform.TransformType type) {
		final double[] data = org.apache.commons.math.analysis.FunctionUtils.sample(f, min, max, n);
		return transform(data, type);
	}

	public org.apache.commons.math.complex.Complex[] transform(final org.apache.commons.math.complex.Complex[] f, final org.apache.commons.math.transform.TransformType type) {
		final double[][] dataRI = org.apache.commons.math.transform.TransformUtils.createRealImaginaryArray(f);
		org.apache.commons.math.transform.FastFourierTransformer.transformInPlace(dataRI, normalization, type);
		return org.apache.commons.math.transform.TransformUtils.createComplexArray(dataRI);
	}

	@java.lang.Deprecated
	public java.lang.Object mdfft(java.lang.Object mdca, org.apache.commons.math.transform.TransformType type) {
		org.apache.commons.math.transform.FastFourierTransformer.MultiDimensionalComplexMatrix mdcm = ((org.apache.commons.math.transform.FastFourierTransformer.MultiDimensionalComplexMatrix) (new org.apache.commons.math.transform.FastFourierTransformer.MultiDimensionalComplexMatrix(mdca).clone()));
		int[] dimensionSize = mdcm.getDimensionSizes();
		for (int i = 0; i < (dimensionSize.length); i++) {
			mdfft(mdcm, type, i, new int[0]);
		}
		return mdcm.getArray();
	}

	@java.lang.Deprecated
	private void mdfft(org.apache.commons.math.transform.FastFourierTransformer.MultiDimensionalComplexMatrix mdcm, org.apache.commons.math.transform.TransformType type, int d, int[] subVector) {
		int[] dimensionSize = mdcm.getDimensionSizes();
		if ((subVector.length) == (dimensionSize.length)) {
			org.apache.commons.math.complex.Complex[] temp = new org.apache.commons.math.complex.Complex[dimensionSize[d]];
			for (int i = 0; i < (dimensionSize[d]); i++) {
				subVector[d] = i;
				temp[i] = mdcm.get(subVector);
			}
			temp = transform(temp, type);
			for (int i = 0; i < (dimensionSize[d]); i++) {
				subVector[d] = i;
				mdcm.set(temp[i], subVector);
			}
		}else {
			int[] vector = new int[(subVector.length) + 1];
			java.lang.System.arraycopy(subVector, 0, vector, 0, subVector.length);
			if ((subVector.length) == d) {
				vector[d] = 0;
				mdfft(mdcm, type, d, vector);
			}else {
				for (int i = 0; i < (dimensionSize[subVector.length]); i++) {
					vector[subVector.length] = i;
					mdfft(mdcm, type, d, vector);
				}
			}
		}
		return ;
	}

	@java.lang.Deprecated
	private static class MultiDimensionalComplexMatrix implements java.lang.Cloneable {
		protected int[] dimensionSize;

		protected java.lang.Object multiDimensionalComplexArray;

		public MultiDimensionalComplexMatrix(java.lang.Object multiDimensionalComplexArray) {
			org.apache.commons.math.transform.FastFourierTransformer.MultiDimensionalComplexMatrix.this.multiDimensionalComplexArray = multiDimensionalComplexArray;
			int numOfDimensions = 0;
			for (java.lang.Object lastDimension = multiDimensionalComplexArray; lastDimension instanceof java.lang.Object[];) {
				final java.lang.Object[] array = ((java.lang.Object[]) (lastDimension));
				numOfDimensions++;
				lastDimension = array[0];
			}
			dimensionSize = new int[numOfDimensions];
			numOfDimensions = 0;
			for (java.lang.Object lastDimension = multiDimensionalComplexArray; lastDimension instanceof java.lang.Object[];) {
				final java.lang.Object[] array = ((java.lang.Object[]) (lastDimension));
				dimensionSize[(numOfDimensions++)] = array.length;
				lastDimension = array[0];
			}
		}

		public org.apache.commons.math.complex.Complex get(int... vector) throws org.apache.commons.math.exception.DimensionMismatchException {
			if (vector == null) {
				if ((dimensionSize.length) > 0) {
					throw new org.apache.commons.math.exception.DimensionMismatchException(0, dimensionSize.length);
				}
				return null;
			}
			if ((vector.length) != (dimensionSize.length)) {
				throw new org.apache.commons.math.exception.DimensionMismatchException(vector.length, dimensionSize.length);
			}
			java.lang.Object lastDimension = multiDimensionalComplexArray;
			for (int i = 0; i < (dimensionSize.length); i++) {
				lastDimension = ((java.lang.Object[]) (lastDimension))[vector[i]];
			}
			return ((org.apache.commons.math.complex.Complex) (lastDimension));
		}

		public org.apache.commons.math.complex.Complex set(org.apache.commons.math.complex.Complex magnitude, int... vector) throws org.apache.commons.math.exception.DimensionMismatchException {
			if (vector == null) {
				if ((dimensionSize.length) > 0) {
					throw new org.apache.commons.math.exception.DimensionMismatchException(0, dimensionSize.length);
				}
				return null;
			}
			if ((vector.length) != (dimensionSize.length)) {
				throw new org.apache.commons.math.exception.DimensionMismatchException(vector.length, dimensionSize.length);
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
}

