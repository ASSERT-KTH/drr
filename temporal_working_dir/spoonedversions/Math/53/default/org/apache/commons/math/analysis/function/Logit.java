

package org.apache.commons.math.analysis.function;


public class Logit implements org.apache.commons.math.analysis.DifferentiableUnivariateRealFunction {
	private final double lo;

	private final double hi;

	public Logit() {
		this(0, 1);
	}

	public Logit(double lo, double hi) {
		this.lo = lo;
		this.hi = hi;
	}

	public double value(double x) {
		return org.apache.commons.math.analysis.function.Logit.value(x, lo, hi);
	}

	public org.apache.commons.math.analysis.UnivariateRealFunction derivative() {
		return new org.apache.commons.math.analysis.UnivariateRealFunction() {
			public double value(double x) {
				return ((hi) - (lo)) / ((x - (lo)) * ((hi) - x));
			}
		};
	}

	public static class Parametric implements org.apache.commons.math.analysis.ParametricUnivariateRealFunction {
		public double value(double x, double... param) {
			validateParameters(param);
			return org.apache.commons.math.analysis.function.Logit.value(x, param[0], param[1]);
		}

		public double[] gradient(double x, double... param) {
			validateParameters(param);
			final double lo = param[0];
			final double hi = param[1];
			return new double[]{ 1 / (lo - x) , 1 / (hi - x) };
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
		if ((x < lo) || (x > hi)) {
			throw new org.apache.commons.math.exception.OutOfRangeException(x, lo, hi);
		}
		return org.apache.commons.math.util.FastMath.log(((x - lo) / (hi - x)));
	}
}

