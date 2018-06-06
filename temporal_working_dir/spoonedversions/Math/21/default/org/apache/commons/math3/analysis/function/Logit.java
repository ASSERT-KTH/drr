

package org.apache.commons.math3.analysis.function;


public class Logit implements org.apache.commons.math3.analysis.DifferentiableUnivariateFunction , org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction {
	private final double lo;

	private final double hi;

	public Logit() {
		this(0, 1);
	}

	public Logit(double lo, double hi) {
		this.lo = lo;
		this.hi = hi;
	}

	public double value(double x) throws org.apache.commons.math3.exception.OutOfRangeException {
		return org.apache.commons.math3.analysis.function.Logit.value(x, lo, hi);
	}

	@java.lang.Deprecated
	public org.apache.commons.math3.analysis.UnivariateFunction derivative() {
		return org.apache.commons.math3.analysis.FunctionUtils.toDifferentiableUnivariateFunction(org.apache.commons.math3.analysis.function.Logit.this).derivative();
	}

	public static class Parametric implements org.apache.commons.math3.analysis.ParametricUnivariateFunction {
		public double value(double x, double... param) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.NullArgumentException {
			validateParameters(param);
			return org.apache.commons.math3.analysis.function.Logit.value(x, param[0], param[1]);
		}

		public double[] gradient(double x, double... param) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.NullArgumentException {
			validateParameters(param);
			final double lo = param[0];
			final double hi = param[1];
			return new double[]{ 1 / (lo - x) , 1 / (hi - x) };
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

	private static double value(double x, double lo, double hi) throws org.apache.commons.math3.exception.OutOfRangeException {
		if ((x < lo) || (x > hi)) {
			throw new org.apache.commons.math3.exception.OutOfRangeException(x, lo, hi);
		}
		return org.apache.commons.math3.util.FastMath.log(((x - lo) / (hi - x)));
	}

	public org.apache.commons.math3.analysis.differentiation.DerivativeStructure value(final org.apache.commons.math3.analysis.differentiation.DerivativeStructure t) throws org.apache.commons.math3.exception.OutOfRangeException {
		final double x = t.getValue();
		if ((x < (lo)) || (x > (hi))) {
			throw new org.apache.commons.math3.exception.OutOfRangeException(x, lo, hi);
		}
		double[] f = new double[(t.getOrder()) + 1];
		f[0] = org.apache.commons.math3.util.FastMath.log(((x - (lo)) / ((hi) - x)));
		if (java.lang.Double.isInfinite(f[0])) {
			if ((f.length) > 1) {
				f[1] = java.lang.Double.POSITIVE_INFINITY;
			}
			for (int i = 2; i < (f.length); ++i) {
				f[i] = f[(i - 2)];
			}
		}else {
			final double invL = 1.0 / (x - (lo));
			double xL = invL;
			final double invH = 1.0 / ((hi) - x);
			double xH = invH;
			for (int i = 1; i < (f.length); ++i) {
				f[i] = xL + xH;
				xL *= (-i) * invL;
				xH *= i * invH;
			}
		}
		return t.compose(f);
	}
}

