

package org.apache.commons.math3.transform;


public class FastHadamardTransformer implements java.io.Serializable , org.apache.commons.math3.transform.RealTransformer {
	static final long serialVersionUID = 20120211L;

	public double[] transform(final double[] f, final org.apache.commons.math3.transform.TransformType type) {
		if (type == (org.apache.commons.math3.transform.TransformType.FORWARD)) {
			return fht(f);
		}
		return org.apache.commons.math3.transform.TransformUtils.scaleArray(fht(f), (1.0 / (f.length)));
	}

	public double[] transform(final org.apache.commons.math3.analysis.UnivariateFunction f, final double min, final double max, final int n, final org.apache.commons.math3.transform.TransformType type) {
		return transform(org.apache.commons.math3.analysis.FunctionUtils.sample(f, min, max, n), type);
	}

	public int[] transform(final int[] f) {
		return fht(f);
	}

	protected double[] fht(double[] x) throws org.apache.commons.math3.exception.MathIllegalArgumentException {
		final int n = x.length;
		final int halfN = n / 2;
		if (!(org.apache.commons.math3.util.ArithmeticUtils.isPowerOfTwo(n))) {
			throw new org.apache.commons.math3.exception.MathIllegalArgumentException(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POWER_OF_TWO, java.lang.Integer.valueOf(n));
		}
		double[] yPrevious = new double[n];
		double[] yCurrent = x.clone();
		for (int j = 1; j < n; j <<= 1) {
			final double[] yTmp = yCurrent;
			yCurrent = yPrevious;
			yPrevious = yTmp;
			for (int i = 0; i < halfN; ++i) {
				final int twoI = 2 * i;
				yCurrent[i] = (yPrevious[twoI]) + (yPrevious[(twoI + 1)]);
			}
			for (int i = halfN; i < n; ++i) {
				final int twoI = 2 * i;
				yCurrent[i] = (yPrevious[(twoI - n)]) - (yPrevious[((twoI - n) + 1)]);
			}
		}
		return yCurrent;
	}

	protected int[] fht(int[] x) throws org.apache.commons.math3.exception.MathIllegalArgumentException {
		final int n = x.length;
		final int halfN = n / 2;
		if (!(org.apache.commons.math3.util.ArithmeticUtils.isPowerOfTwo(n))) {
			throw new org.apache.commons.math3.exception.MathIllegalArgumentException(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POWER_OF_TWO, java.lang.Integer.valueOf(n));
		}
		int[] yPrevious = new int[n];
		int[] yCurrent = x.clone();
		for (int j = 1; j < n; j <<= 1) {
			final int[] yTmp = yCurrent;
			yCurrent = yPrevious;
			yPrevious = yTmp;
			for (int i = 0; i < halfN; ++i) {
				final int twoI = 2 * i;
				yCurrent[i] = (yPrevious[twoI]) + (yPrevious[(twoI + 1)]);
			}
			for (int i = halfN; i < n; ++i) {
				final int twoI = 2 * i;
				yCurrent[i] = (yPrevious[(twoI - n)]) - (yPrevious[((twoI - n) + 1)]);
			}
		}
		return yCurrent;
	}
}

