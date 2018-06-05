

package org.apache.commons.math.transform;


public class FastSineTransformer implements org.apache.commons.math.transform.RealTransformer {
	private static final long serialVersionUID = -7557024407476823001L;

	public FastSineTransformer() {
		super();
	}

	public double[] transform(double[] f) throws java.lang.IllegalArgumentException {
		return fst(f);
	}

	public double[] transform(org.apache.commons.math.analysis.UnivariateRealFunction f, double min, double max, int n) throws java.lang.IllegalArgumentException, org.apache.commons.math.FunctionEvaluationException {
		double[] data = org.apache.commons.math.transform.FastFourierTransformer.sample(f, min, max, n);
		data[0] = 0.0;
		return fst(data);
	}

	public double[] transform2(double[] f) throws java.lang.IllegalArgumentException {
		double scaling_coefficient = java.lang.Math.sqrt((2.0 / (f.length)));
		return org.apache.commons.math.transform.FastFourierTransformer.scaleArray(fst(f), scaling_coefficient);
	}

	public double[] transform2(org.apache.commons.math.analysis.UnivariateRealFunction f, double min, double max, int n) throws java.lang.IllegalArgumentException, org.apache.commons.math.FunctionEvaluationException {
		double[] data = org.apache.commons.math.transform.FastFourierTransformer.sample(f, min, max, n);
		data[0] = 0.0;
		double scaling_coefficient = java.lang.Math.sqrt((2.0 / n));
		return org.apache.commons.math.transform.FastFourierTransformer.scaleArray(fst(data), scaling_coefficient);
	}

	public double[] inversetransform(double[] f) throws java.lang.IllegalArgumentException {
		double scaling_coefficient = 2.0 / (f.length);
		return org.apache.commons.math.transform.FastFourierTransformer.scaleArray(fst(f), scaling_coefficient);
	}

	public double[] inversetransform(org.apache.commons.math.analysis.UnivariateRealFunction f, double min, double max, int n) throws java.lang.IllegalArgumentException, org.apache.commons.math.FunctionEvaluationException {
		double[] data = org.apache.commons.math.transform.FastFourierTransformer.sample(f, min, max, n);
		data[0] = 0.0;
		double scaling_coefficient = 2.0 / n;
		return org.apache.commons.math.transform.FastFourierTransformer.scaleArray(fst(data), scaling_coefficient);
	}

	public double[] inversetransform2(double[] f) throws java.lang.IllegalArgumentException {
		return transform2(f);
	}

	public double[] inversetransform2(org.apache.commons.math.analysis.UnivariateRealFunction f, double min, double max, int n) throws java.lang.IllegalArgumentException, org.apache.commons.math.FunctionEvaluationException {
		return transform2(f, min, max, n);
	}

	protected double[] fst(double[] f) throws java.lang.IllegalArgumentException {
		double A;
		double B;
		double[] x;
		double[] F = new double[f.length];
		org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(f);
		if ((f[0]) != 0.0) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("first element is not 0: {0}", f[0]);
		}
		int N = f.length;
		if (N == 1) {
			F[0] = 0.0;
			return F;
		}
		x = new double[N];
		x[0] = 0.0;
		x[(N >> 1)] = 2.0 * (f[(N >> 1)]);
		for (int i = 1; i < (N >> 1); i++) {
			A = (java.lang.Math.sin(((i * (java.lang.Math.PI)) / N))) * ((f[i]) + (f[(N - i)]));
			B = 0.5 * ((f[i]) - (f[(N - i)]));
			x[i] = A + B;
			x[(N - i)] = A - B;
		}
		org.apache.commons.math.transform.FastFourierTransformer transformer = new org.apache.commons.math.transform.FastFourierTransformer();
		org.apache.commons.math.complex.Complex[] y = transformer.transform(x);
		F[0] = 0.0;
		F[1] = 0.5 * (y[0].getReal());
		for (int i = 1; i < (N >> 1); i++) {
			F[(2 * i)] = -(y[i].getImaginary());
			F[((2 * i) + 1)] = (y[i].getReal()) + (F[((2 * i) - 1)]);
		}
		return F;
	}
}

