

package org.apache.commons.math3.analysis.function;


public class Logistic implements org.apache.commons.math3.analysis.DifferentiableUnivariateFunction {
	private final double a;

	private final double k;

	private final double b;

	private final double oneOverN;

	private final double q;

	private final double m;

	public Logistic(double k, double m, double b, double q, double a, double n) {
		if (n <= 0) {
			throw new org.apache.commons.math3.exception.NotStrictlyPositiveException(n);
		}
		this.k = k;
		this.m = m;
		this.b = b;
		this.q = q;
		this.a = a;
		oneOverN = 1 / n;
	}

	public double value(double x) {
		return org.apache.commons.math3.analysis.function.Logistic.value(((m) - x), k, b, q, a, oneOverN);
	}

	public org.apache.commons.math3.analysis.UnivariateFunction derivative() {
		return new org.apache.commons.math3.analysis.UnivariateFunction() {
			public double value(double x) {
				final double exp = (q) * (org.apache.commons.math3.util.FastMath.exp(((b) * ((m) - x))));
				if (java.lang.Double.isInfinite(exp)) {
					return 0;
				}
				final double exp1 = exp + 1;
				return (((b) * (oneOverN)) * exp) / (org.apache.commons.math3.util.FastMath.pow(exp1, ((oneOverN) + 1)));
			}
		};
	}

	public static class Parametric implements org.apache.commons.math3.analysis.ParametricUnivariateFunction {
		public double value(double x, double... param) {
			validateParameters(param);
			return org.apache.commons.math3.analysis.function.Logistic.value(((param[1]) - x), param[0], param[2], param[3], param[4], (1 / (param[5])));
		}

		public double[] gradient(double x, double... param) {
			validateParameters(param);
			final double b = param[2];
			final double q = param[3];
			final double mMinusX = (param[1]) - x;
			final double oneOverN = 1 / (param[5]);
			final double exp = org.apache.commons.math3.util.FastMath.exp((b * mMinusX));
			final double qExp = q * exp;
			final double qExp1 = qExp + 1;
			final double factor1 = (((param[0]) - (param[4])) * oneOverN) / (org.apache.commons.math3.util.FastMath.pow(qExp1, oneOverN));
			final double factor2 = (-factor1) / qExp1;
			final double gk = org.apache.commons.math3.analysis.function.Logistic.value(mMinusX, 1, b, q, 0, oneOverN);
			final double gm = (factor2 * b) * qExp;
			final double gb = (factor2 * mMinusX) * qExp;
			final double gq = factor2 * exp;
			final double ga = org.apache.commons.math3.analysis.function.Logistic.value(mMinusX, 0, b, q, 1, oneOverN);
			final double gn = (factor1 * (java.lang.Math.log(qExp1))) * oneOverN;
			return new double[]{ gk , gm , gb , gq , ga , gn };
		}

		private void validateParameters(double[] param) {
			if (param == null) {
				throw new org.apache.commons.math3.exception.NullArgumentException();
			}
			if ((param.length) != 6) {
				throw new org.apache.commons.math3.exception.DimensionMismatchException(param.length, 6);
			}
			if ((param[5]) <= 0) {
				throw new org.apache.commons.math3.exception.NotStrictlyPositiveException(param[5]);
			}
		}
	}

	private static double value(double mMinusX, double k, double b, double q, double a, double oneOverN) {
		return a + ((k - a) / (org.apache.commons.math3.util.FastMath.pow((1 + (q * (org.apache.commons.math3.util.FastMath.exp((b * mMinusX))))), oneOverN)));
	}
}

