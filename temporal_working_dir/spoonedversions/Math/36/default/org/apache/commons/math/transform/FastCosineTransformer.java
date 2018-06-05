

package org.apache.commons.math.transform;


public class FastCosineTransformer implements java.io.Serializable , org.apache.commons.math.transform.RealTransformer {
	static final long serialVersionUID = 20120212L;

	private final org.apache.commons.math.transform.DctNormalization normalization;

	public FastCosineTransformer(final org.apache.commons.math.transform.DctNormalization normalization) {
		this.normalization = normalization;
	}

	public double[] transform(final double[] f, final org.apache.commons.math.transform.TransformType type) {
		if (type == (org.apache.commons.math.transform.TransformType.FORWARD)) {
			if ((normalization) == (org.apache.commons.math.transform.DctNormalization.ORTHOGONAL_DCT_I)) {
				final double s = org.apache.commons.math.util.FastMath.sqrt((2.0 / ((f.length) - 1)));
				return org.apache.commons.math.transform.TransformUtils.scaleArray(fct(f), s);
			}
			return fct(f);
		}
		final double s2 = 2.0 / ((f.length) - 1);
		final double s1;
		if ((normalization) == (org.apache.commons.math.transform.DctNormalization.ORTHOGONAL_DCT_I)) {
			s1 = org.apache.commons.math.util.FastMath.sqrt(s2);
		}else {
			s1 = s2;
		}
		return org.apache.commons.math.transform.TransformUtils.scaleArray(fct(f), s1);
	}

	public double[] transform(final org.apache.commons.math.analysis.UnivariateFunction f, final double min, final double max, final int n, final org.apache.commons.math.transform.TransformType type) {
		final double[] data = org.apache.commons.math.analysis.FunctionUtils.sample(f, min, max, n);
		return transform(data, type);
	}

	protected double[] fct(double[] f) throws org.apache.commons.math.exception.MathIllegalArgumentException {
		final double[] transformed = new double[f.length];
		final int n = (f.length) - 1;
		if (!(org.apache.commons.math.util.ArithmeticUtils.isPowerOfTwo(n))) {
			throw new org.apache.commons.math.exception.MathIllegalArgumentException(org.apache.commons.math.exception.util.LocalizedFormats.NOT_POWER_OF_TWO_PLUS_ONE, java.lang.Integer.valueOf(f.length));
		}
		if (n == 1) {
			transformed[0] = 0.5 * ((f[0]) + (f[1]));
			transformed[1] = 0.5 * ((f[0]) - (f[1]));
			return transformed;
		}
		final double[] x = new double[n];
		x[0] = 0.5 * ((f[0]) + (f[n]));
		x[(n >> 1)] = f[(n >> 1)];
		double t1 = 0.5 * ((f[0]) - (f[n]));
		for (int i = 1; i < (n >> 1); i++) {
			final double a = 0.5 * ((f[i]) + (f[(n - i)]));
			final double b = (org.apache.commons.math.util.FastMath.sin(((i * (org.apache.commons.math.util.FastMath.PI)) / n))) * ((f[i]) - (f[(n - i)]));
			final double c = (org.apache.commons.math.util.FastMath.cos(((i * (org.apache.commons.math.util.FastMath.PI)) / n))) * ((f[i]) - (f[(n - i)]));
			x[i] = a - b;
			x[(n - i)] = a + b;
			t1 += c;
		}
		org.apache.commons.math.transform.FastFourierTransformer transformer;
		transformer = new org.apache.commons.math.transform.FastFourierTransformer(org.apache.commons.math.transform.DftNormalization.STANDARD);
		org.apache.commons.math.complex.Complex[] y = transformer.transform(x, org.apache.commons.math.transform.TransformType.FORWARD);
		transformed[0] = y[0].getReal();
		transformed[1] = t1;
		for (int i = 1; i < (n >> 1); i++) {
			transformed[(2 * i)] = y[i].getReal();
			transformed[((2 * i) + 1)] = (transformed[((2 * i) - 1)]) - (y[i].getImaginary());
		}
		transformed[n] = y[(n >> 1)].getReal();
		return transformed;
	}
}

