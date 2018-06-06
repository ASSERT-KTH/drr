

package org.apache.commons.math.transform;


public class FastSineTransformer implements org.apache.commons.math.transform.RealTransformer {
	private final boolean orthogonal;

	private FastSineTransformer(final boolean orthogonal) {
		this.orthogonal = orthogonal;
	}

	public static org.apache.commons.math.transform.FastSineTransformer create() {
		return new org.apache.commons.math.transform.FastSineTransformer(false);
	}

	public static org.apache.commons.math.transform.FastSineTransformer createOrthogonal() {
		return new org.apache.commons.math.transform.FastSineTransformer(true);
	}

	public double[] transform(double[] f) throws java.lang.IllegalArgumentException {
		if (orthogonal) {
			final double s = org.apache.commons.math.util.FastMath.sqrt((2.0 / (f.length)));
			return org.apache.commons.math.transform.FastFourierTransformer.scaleArray(fst(f), s);
		}
		return fst(f);
	}

	public double[] transform(org.apache.commons.math.analysis.UnivariateFunction f, double min, double max, int n) throws java.lang.IllegalArgumentException {
		final double[] data = org.apache.commons.math.transform.FastFourierTransformer.sample(f, min, max, n);
		data[0] = 0.0;
		if (orthogonal) {
			final double s = org.apache.commons.math.util.FastMath.sqrt((2.0 / n));
			return org.apache.commons.math.transform.FastFourierTransformer.scaleArray(fst(data), s);
		}
		return fst(data);
	}

	public double[] inverseTransform(double[] f) throws java.lang.IllegalArgumentException {
		if (orthogonal) {
			return transform(f);
		}
		final double s = 2.0 / (f.length);
		return org.apache.commons.math.transform.FastFourierTransformer.scaleArray(fst(f), s);
	}

	public double[] inverseTransform(org.apache.commons.math.analysis.UnivariateFunction f, double min, double max, int n) throws java.lang.IllegalArgumentException {
		if (orthogonal) {
			return transform(f, min, max, n);
		}
		final double[] data = org.apache.commons.math.transform.FastFourierTransformer.sample(f, min, max, n);
		data[0] = 0.0;
		final double s = 2.0 / n;
		return org.apache.commons.math.transform.FastFourierTransformer.scaleArray(fst(data), s);
	}

	protected double[] fst(double[] f) throws java.lang.IllegalArgumentException {
		final double[] transformed = new double[f.length];
		org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(f);
		if ((f[0]) != 0.0) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(org.apache.commons.math.exception.util.LocalizedFormats.FIRST_ELEMENT_NOT_ZERO, f[0]);
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
		org.apache.commons.math.transform.FastFourierTransformer transformer = org.apache.commons.math.transform.FastFourierTransformer.create();
		org.apache.commons.math.complex.Complex[] y = transformer.transform(x);
		transformed[0] = 0.0;
		transformed[1] = 0.5 * (y[0].getReal());
		for (int i = 1; i < (n >> 1); i++) {
			transformed[(2 * i)] = -(y[i].getImaginary());
			transformed[((2 * i) + 1)] = (y[i].getReal()) + (transformed[((2 * i) - 1)]);
		}
		return transformed;
	}
}

