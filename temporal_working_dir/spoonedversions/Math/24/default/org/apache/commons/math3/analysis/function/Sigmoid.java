

package org.apache.commons.math3.analysis.function;


public class Sigmoid implements org.apache.commons.math3.analysis.DifferentiableUnivariateFunction , org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiable {
	private final double lo;

	private final double hi;

	public Sigmoid() {
		this(0, 1);
	}

	public Sigmoid(double lo, double hi) {
		this.lo = lo;
		this.hi = hi;
	}

	@java.lang.Deprecated
	public org.apache.commons.math3.analysis.UnivariateFunction derivative() {
		return org.apache.commons.math3.analysis.FunctionUtils.toDifferentiableUnivariateFunction(org.apache.commons.math3.analysis.function.Sigmoid.this).derivative();
	}

	public double value(double x) {
		return org.apache.commons.math3.analysis.function.Sigmoid.value(x, lo, hi);
	}

	public static class Parametric implements org.apache.commons.math3.analysis.ParametricUnivariateFunction {
		public double value(double x, double... param) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.NullArgumentException {
			validateParameters(param);
			return org.apache.commons.math3.analysis.function.Sigmoid.value(x, param[0], param[1]);
		}

		public double[] gradient(double x, double... param) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.NullArgumentException {
			validateParameters(param);
			final double invExp1 = 1 / (1 + (org.apache.commons.math3.util.FastMath.exp((-x))));
			return new double[]{ 1 - invExp1 , invExp1 };
		}

		private void validateParameters(double[] param) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.NullArgumentException {
			if (param == null) {
				throw new org.apache.commons.math3.exception.NullArgumentException();
			}
			if ((param.length) != 2) {
				throw new org.apache.commons.math3.exception.DimensionMismatchException(param.length, 2);
			}
		}
	}

	private static double value(double x, double lo, double hi) {
		return lo + ((hi - lo) / (1 + (org.apache.commons.math3.util.FastMath.exp((-x)))));
	}

	public org.apache.commons.math3.analysis.differentiation.DerivativeStructure value(final org.apache.commons.math3.analysis.differentiation.DerivativeStructure t) {
		double[] f = new double[(t.getOrder()) + 1];
		final double exp = org.apache.commons.math3.util.FastMath.exp((-(t.getValue())));
		if (java.lang.Double.isInfinite(exp)) {
			f[0] = lo;
			java.util.Arrays.fill(f, 1, f.length, 0.0);
		}else {
			final double[] p = new double[f.length];
			final double inv = 1 / (1 + exp);
			double coeff = (hi) - (lo);
			for (int n = 0; n < (f.length); ++n) {
				double v = 0;
				p[n] = 1;
				for (int k = n; k >= 0; --k) {
					v = (v * exp) + (p[k]);
					if (k > 1) {
						p[(k - 1)] = (((n - k) + 2) * (p[(k - 2)])) - ((k - 1) * (p[(k - 1)]));
					}else {
						p[0] = 0;
					}
				}
				coeff *= inv;
				f[n] = coeff * v;
			}
			f[0] += lo;
		}
		return t.compose(f);
	}
}

