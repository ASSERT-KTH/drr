

package org.apache.commons.math.transform;


public class FastSineTransformer implements java.io.Serializable , org.apache.commons.math.transform.RealTransformer {
	static final long serialVersionUID = 20120211L;

	private final org.apache.commons.math.transform.DstNormalization normalization;

	public FastSineTransformer(final org.apache.commons.math.transform.DstNormalization normalization) {
		this.normalization = normalization;
	}

	public double[] transform(final double[] f, final org.apache.commons.math.transform.TransformType type) {
		if ((normalization) == (org.apache.commons.math.transform.DstNormalization.ORTHOGONAL_DST_I)) {
			final double s = org.apache.commons.math.util.FastMath.sqrt((2.0 / (f.length)));
			return org.apache.commons.math.transform.TransformUtils.scaleArray(fst(f), s);
		}
		if (type == (org.apache.commons.math.transform.TransformType.FORWARD)) {
			return fst(f);
		}
		final double s = 2.0 / (f.length);
		return org.apache.commons.math.transform.TransformUtils.scaleArray(fst(f), s);
	}

	public double[] transform(final org.apache.commons.math.analysis.UnivariateFunction f, final double min, final double max, final int n, final org.apache.commons.math.transform.TransformType type) {
		final double[] data = org.apache.commons.math.analysis.FunctionUtils.sample(f, min, max, n);
		data[0] = 0.0;
		return transform(data, type);
	}

	protected double[] fst(double[] f) throws org.apache.commons.math.exception.MathIllegalArgumentException {
		final double[] transformed = new double[f.length];
		if (!(org.apache.commons.math.util.ArithmeticUtils.isPowerOfTwo(f.length))) {
			throw new org.apache.commons.math.exception.MathIllegalArgumentException(org.apache.commons.math.exception.util.LocalizedFormats.NOT_POWER_OF_TWO_CONSIDER_PADDING, java.lang.Integer.valueOf(f.length));
		}
		if ((f[0]) != 0.0) {
			throw new org.apache.commons.math.exception.MathIllegalArgumentException(org.apache.commons.math.exception.util.LocalizedFormats.FIRST_ELEMENT_NOT_ZERO, java.lang.Double.valueOf(f[0]));
		}
		final int n = f.length;
		if (n == 1) {
			transformed[0] = 0.0;
			return transformed;
		}
		final double[] x = new double[n];
		x[0] = 0.0;
		x[(n >> 1)] = 2.0 * (f[(n >> 1)]);
		for (int i = 1; i < (n >> 1); i++) {
			final double a = (org.apache.commons.math.util.FastMath.sin(((i * (org.apache.commons.math.util.FastMath.PI)) / n))) * ((f[i]) + (f[(n - i)]));
			final double b = 0.5 * ((f[i]) - (f[(n - i)]));
			x[i] = a + b;
			x[(n - i)] = a - b;
		}
		org.apache.commons.math.transform.FastFourierTransformer transformer;
		transformer = new org.apache.commons.math.transform.FastFourierTransformer(org.apache.commons.math.transform.DftNormalization.STANDARD);
		org.apache.commons.math.complex.Complex[] y = transformer.transform(x, org.apache.commons.math.transform.TransformType.FORWARD);
		transformed[0] = 0.0;
		transformed[1] = 0.5 * (y[0].getReal());
		for (int i = 1; i < (n >> 1); i++) {
			transformed[(2 * i)] = -(y[i].getImaginary());
			transformed[((2 * i) + 1)] = (y[i].getReal()) + (transformed[((2 * i) - 1)]);
		}
		return transformed;
	}
}

