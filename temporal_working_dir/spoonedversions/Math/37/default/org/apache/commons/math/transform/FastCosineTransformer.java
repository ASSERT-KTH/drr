

package org.apache.commons.math.transform;


public class FastCosineTransformer implements java.io.Serializable , org.apache.commons.math.transform.RealTransformer {
	static final long serialVersionUID = 20120501L;

	private final boolean orthogonal;

	private FastCosineTransformer(final boolean orthogonal) {
		this.orthogonal = orthogonal;
	}

	public static org.apache.commons.math.transform.FastCosineTransformer create() {
		return new org.apache.commons.math.transform.FastCosineTransformer(false);
	}

	public static org.apache.commons.math.transform.FastCosineTransformer createOrthogonal() {
		return new org.apache.commons.math.transform.FastCosineTransformer(true);
	}

	public double[] transform(double[] f) throws org.apache.commons.math.exception.MathIllegalArgumentException {
		if (orthogonal) {
			final double s = org.apache.commons.math.util.FastMath.sqrt((2.0 / ((f.length) - 1)));
			return org.apache.commons.math.transform.TransformUtils.scaleArray(fct(f), s);
		}
		return fct(f);
	}

	public double[] transform(org.apache.commons.math.analysis.UnivariateFunction f, double min, double max, int n) throws org.apache.commons.math.exception.MathIllegalArgumentException, org.apache.commons.math.exception.NonMonotonicSequenceException, org.apache.commons.math.exception.NotStrictlyPositiveException {
		final double[] data = org.apache.commons.math.analysis.FunctionUtils.sample(f, min, max, n);
		return transform(data);
	}

	public double[] inverseTransform(double[] f) throws org.apache.commons.math.exception.MathIllegalArgumentException {
		final double s2 = 2.0 / ((f.length) - 1);
		final double s1 = orthogonal ? org.apache.commons.math.util.FastMath.sqrt(s2) : s2;
		return org.apache.commons.math.transform.TransformUtils.scaleArray(fct(f), s1);
	}

	public double[] inverseTransform(org.apache.commons.math.analysis.UnivariateFunction f, double min, double max, int n) throws org.apache.commons.math.exception.MathIllegalArgumentException, org.apache.commons.math.exception.NonMonotonicSequenceException, org.apache.commons.math.exception.NotStrictlyPositiveException {
		final double[] data = org.apache.commons.math.analysis.FunctionUtils.sample(f, min, max, n);
		return inverseTransform(data);
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
		org.apache.commons.math.transform.FastFourierTransformer transformer = org.apache.commons.math.transform.FastFourierTransformer.create();
		org.apache.commons.math.complex.Complex[] y = transformer.transform(x);
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

