

package org.apache.commons.math.transform;


public class FastHadamardTransformer implements java.io.Serializable , org.apache.commons.math.transform.RealTransformer {
	static final long serialVersionUID = 20120501L;

	public double[] transform(double[] f) throws org.apache.commons.math.exception.MathIllegalArgumentException {
		return fht(f);
	}

	public double[] transform(org.apache.commons.math.analysis.UnivariateFunction f, double min, double max, int n) throws org.apache.commons.math.exception.MathIllegalArgumentException, org.apache.commons.math.exception.NonMonotonicSequenceException, org.apache.commons.math.exception.NotStrictlyPositiveException {
		return fht(org.apache.commons.math.analysis.FunctionUtils.sample(f, min, max, n));
	}

	public double[] inverseTransform(double[] f) throws java.lang.IllegalArgumentException {
		return org.apache.commons.math.transform.TransformUtils.scaleArray(fht(f), (1.0 / (f.length)));
	}

	public double[] inverseTransform(org.apache.commons.math.analysis.UnivariateFunction f, double min, double max, int n) throws org.apache.commons.math.exception.MathIllegalArgumentException, org.apache.commons.math.exception.NonMonotonicSequenceException, org.apache.commons.math.exception.NotStrictlyPositiveException {
		final double[] unscaled = fht(org.apache.commons.math.analysis.FunctionUtils.sample(f, min, max, n));
		return org.apache.commons.math.transform.TransformUtils.scaleArray(unscaled, (1.0 / n));
	}

	public int[] transform(int[] f) throws org.apache.commons.math.exception.MathIllegalArgumentException {
		return fht(f);
	}

	protected double[] fht(double[] x) throws org.apache.commons.math.exception.MathIllegalArgumentException {
		final int n = x.length;
		final int halfN = n / 2;
		if (!(org.apache.commons.math.util.ArithmeticUtils.isPowerOfTwo(n))) {
			throw new org.apache.commons.math.exception.MathIllegalArgumentException(org.apache.commons.math.exception.util.LocalizedFormats.NOT_POWER_OF_TWO, java.lang.Integer.valueOf(n));
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

	protected int[] fht(int[] x) throws org.apache.commons.math.exception.MathIllegalArgumentException {
		final int n = x.length;
		final int halfN = n / 2;
		if (!(org.apache.commons.math.util.ArithmeticUtils.isPowerOfTwo(n))) {
			throw new org.apache.commons.math.exception.MathIllegalArgumentException(org.apache.commons.math.exception.util.LocalizedFormats.NOT_POWER_OF_TWO, java.lang.Integer.valueOf(n));
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

