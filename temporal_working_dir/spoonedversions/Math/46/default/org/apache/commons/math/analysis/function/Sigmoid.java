

package org.apache.commons.math.analysis.function;


public class Sigmoid implements org.apache.commons.math.analysis.DifferentiableUnivariateRealFunction {
	private final double lo;

	private final double hi;

	public Sigmoid() {
		this(0, 1);
	}

	public Sigmoid(double lo, double hi) {
		this.lo = lo;
		this.hi = hi;
	}

	public org.apache.commons.math.analysis.UnivariateRealFunction derivative() {
		return new org.apache.commons.math.analysis.UnivariateRealFunction() {
			public double value(double x) {
				final double exp = org.apache.commons.math.util.FastMath.exp((-x));
				if (java.lang.Double.isInfinite(exp)) {
					return 0;
				}
				final double exp1 = 1 + exp;
				return (((hi) - (lo)) * exp) / (exp1 * exp1);
			}
		};
	}

	public double value(double x) {
		return org.apache.commons.math.analysis.function.Sigmoid.value(x, lo, hi);
	}

	public static class Parametric implements org.apache.commons.math.analysis.ParametricUnivariateRealFunction {
		public double value(double x, double... param) {
			validateParameters(param);
			return org.apache.commons.math.analysis.function.Sigmoid.value(x, param[0], param[1]);
		}

		public double[] gradient(double x, double... param) {
			validateParameters(param);
			final double invExp1 = 1 / (1 + (org.apache.commons.math.util.FastMath.exp((-x))));
			return new double[]{ 1 - invExp1 , invExp1 };
		}

		private void validateParameters(double[] param) {
			if (param == null) {
				throw new org.apache.commons.math.exception.NullArgumentException();
			}
			if ((param.length) != 2) {
				throw new org.apache.commons.math.exception.DimensionMismatchException(param.length, 2);
			}
		}
	}

	private static double value(double x, double lo, double hi) {
		return lo + ((hi - lo) / (1 + (org.apache.commons.math.util.FastMath.exp((-x)))));
	}
}

