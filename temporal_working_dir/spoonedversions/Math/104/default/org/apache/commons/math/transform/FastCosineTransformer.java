

package org.apache.commons.math.transform;


public class FastCosineTransformer implements java.io.Serializable {
	static final long serialVersionUID = -7673941545134707766L;

	public FastCosineTransformer() {
		super();
	}

	public double[] transform(double[] f) throws java.lang.IllegalArgumentException, org.apache.commons.math.MathException {
		return fct(f);
	}

	public double[] transform(org.apache.commons.math.analysis.UnivariateRealFunction f, double min, double max, int n) throws java.lang.IllegalArgumentException, org.apache.commons.math.MathException {
		double[] data = org.apache.commons.math.transform.FastFourierTransformer.sample(f, min, max, n);
		return fct(data);
	}

	public double[] transform2(double[] f) throws java.lang.IllegalArgumentException, org.apache.commons.math.MathException {
		double scaling_coefficient = java.lang.Math.sqrt((2.0 / ((f.length) - 1)));
		return org.apache.commons.math.transform.FastFourierTransformer.scaleArray(fct(f), scaling_coefficient);
	}

	public double[] transform2(org.apache.commons.math.analysis.UnivariateRealFunction f, double min, double max, int n) throws java.lang.IllegalArgumentException, org.apache.commons.math.MathException {
		double[] data = org.apache.commons.math.transform.FastFourierTransformer.sample(f, min, max, n);
		double scaling_coefficient = java.lang.Math.sqrt((2.0 / (n - 1)));
		return org.apache.commons.math.transform.FastFourierTransformer.scaleArray(fct(data), scaling_coefficient);
	}

	public double[] inversetransform(double[] f) throws java.lang.IllegalArgumentException, org.apache.commons.math.MathException {
		double scaling_coefficient = 2.0 / ((f.length) - 1);
		return org.apache.commons.math.transform.FastFourierTransformer.scaleArray(fct(f), scaling_coefficient);
	}

	public double[] inversetransform(org.apache.commons.math.analysis.UnivariateRealFunction f, double min, double max, int n) throws java.lang.IllegalArgumentException, org.apache.commons.math.MathException {
		double[] data = org.apache.commons.math.transform.FastFourierTransformer.sample(f, min, max, n);
		double scaling_coefficient = 2.0 / (n - 1);
		return org.apache.commons.math.transform.FastFourierTransformer.scaleArray(fct(data), scaling_coefficient);
	}

	public double[] inversetransform2(double[] f) throws java.lang.IllegalArgumentException, org.apache.commons.math.MathException {
		return transform2(f);
	}

	public double[] inversetransform2(org.apache.commons.math.analysis.UnivariateRealFunction f, double min, double max, int n) throws java.lang.IllegalArgumentException, org.apache.commons.math.MathException {
		return transform2(f, min, max, n);
	}

	protected double[] fct(double[] f) throws java.lang.IllegalArgumentException, org.apache.commons.math.MathException {
		double A;
		double B;
		double C;
		double F1;
		double[] x;
		double[] F = new double[f.length];
		int N = (f.length) - 1;
		if (!(org.apache.commons.math.transform.FastFourierTransformer.isPowerOf2(N))) {
			throw new java.lang.IllegalArgumentException(("Number of samples not power of 2 plus one: " + (f.length)));
		}
		if (N == 1) {
			F[0] = 0.5 * ((f[0]) + (f[1]));
			F[1] = 0.5 * ((f[0]) - (f[1]));
			return F;
		}
		x = new double[N];
		x[0] = 0.5 * ((f[0]) + (f[N]));
		x[(N >> 1)] = f[(N >> 1)];
		F1 = 0.5 * ((f[0]) - (f[N]));
		for (int i = 1; i < (N >> 1); i++) {
			A = 0.5 * ((f[i]) + (f[(N - i)]));
			B = (java.lang.Math.sin(((i * (java.lang.Math.PI)) / N))) * ((f[i]) - (f[(N - i)]));
			C = (java.lang.Math.cos(((i * (java.lang.Math.PI)) / N))) * ((f[i]) - (f[(N - i)]));
			x[i] = A - B;
			x[(N - i)] = A + B;
			F1 += C;
		}
		org.apache.commons.math.transform.FastFourierTransformer transformer = new org.apache.commons.math.transform.FastFourierTransformer();
		org.apache.commons.math.complex.Complex[] y = transformer.transform(x);
		F[0] = y[0].getReal();
		F[1] = F1;
		for (int i = 1; i < (N >> 1); i++) {
			F[(2 * i)] = y[i].getReal();
			F[((2 * i) + 1)] = (F[((2 * i) - 1)]) - (y[i].getImaginary());
		}
		F[N] = y[(N >> 1)].getReal();
		return F;
	}
}

