

package org.apache.commons.math3.special;


public class Beta {
	private static final double DEFAULT_EPSILON = 1.0E-14;

	private static final double HALF_LOG_TWO_PI = 0.9189385332046727;

	private static final double[] DELTA = new double[]{ 0.08333333333333333 , -2.777777777777778E-5 , 7.936507936507937E-8 , -5.952380952380953E-10 , 8.417508417508329E-12 , -1.917526917518546E-13 , 6.410256405103255E-15 , -2.955065141253382E-16 , 1.7964371635940225E-17 , -1.3922896466162779E-18 , 1.338028550140209E-19 , -1.542460098679661E-20 , 1.9770199298095743E-21 , -2.3406566479399704E-22 , 1.713480149663986E-23 };

	private Beta() {
	}

	public static double regularizedBeta(double x, double a, double b) {
		return org.apache.commons.math3.special.Beta.regularizedBeta(x, a, b, org.apache.commons.math3.special.Beta.DEFAULT_EPSILON, java.lang.Integer.MAX_VALUE);
	}

	public static double regularizedBeta(double x, double a, double b, double epsilon) {
		return org.apache.commons.math3.special.Beta.regularizedBeta(x, a, b, epsilon, java.lang.Integer.MAX_VALUE);
	}

	public static double regularizedBeta(double x, double a, double b, int maxIterations) {
		return org.apache.commons.math3.special.Beta.regularizedBeta(x, a, b, org.apache.commons.math3.special.Beta.DEFAULT_EPSILON, maxIterations);
	}

	public static double regularizedBeta(double x, final double a, final double b, double epsilon, int maxIterations) {
		double ret;
		if (((((((java.lang.Double.isNaN(x)) || (java.lang.Double.isNaN(a))) || (java.lang.Double.isNaN(b))) || (x < 0)) || (x > 1)) || (a <= 0.0)) || (b <= 0.0)) {
			ret = java.lang.Double.NaN;
		}else
			if (x > ((a + 1.0) / ((a + b) + 2.0))) {
				ret = 1.0 - (org.apache.commons.math3.special.Beta.regularizedBeta((1.0 - x), b, a, epsilon, maxIterations));
			}else {
				org.apache.commons.math3.util.ContinuedFraction fraction = new org.apache.commons.math3.util.ContinuedFraction() {
					@java.lang.Override
					protected double getB(int n, double x) {
						double ret;
						double m;
						if ((n % 2) == 0) {
							m = n / 2.0;
							ret = ((m * (b - m)) * x) / (((a + (2 * m)) - 1) * (a + (2 * m)));
						}else {
							m = (n - 1.0) / 2.0;
							ret = (-(((a + m) * ((a + b) + m)) * x)) / ((a + (2 * m)) * ((a + (2 * m)) + 1.0));
						}
						return ret;
					}

					@java.lang.Override
					protected double getA(int n, double x) {
						return 1.0;
					}
				};
				ret = ((org.apache.commons.math3.util.FastMath.exp(((((a * (org.apache.commons.math3.util.FastMath.log(x))) + (b * (org.apache.commons.math3.util.FastMath.log((1.0 - x))))) - (org.apache.commons.math3.util.FastMath.log(a))) - (org.apache.commons.math3.special.Beta.logBeta(a, b))))) * 1.0) / (fraction.evaluate(x, epsilon, maxIterations));
			}
		
		return ret;
	}

	@java.lang.Deprecated
	public static double logBeta(double a, double b, double epsilon, int maxIterations) {
		return org.apache.commons.math3.special.Beta.logBeta(a, b);
	}

	private static double logGammaSum(final double a, final double b) throws org.apache.commons.math3.exception.OutOfRangeException {
		if ((a < 1.0) || (a > 2.0)) {
			throw new org.apache.commons.math3.exception.OutOfRangeException(a, 1.0, 2.0);
		}
		if ((b < 1.0) || (b > 2.0)) {
			throw new org.apache.commons.math3.exception.OutOfRangeException(b, 1.0, 2.0);
		}
		final double x = (a - 1.0) + (b - 1.0);
		if (x <= 0.5) {
			return org.apache.commons.math3.special.Gamma.logGamma1p((1.0 + x));
		}else
			if (x <= 1.5) {
				return (org.apache.commons.math3.special.Gamma.logGamma1p(x)) + (org.apache.commons.math3.util.FastMath.log1p(x));
			}else {
				return (org.apache.commons.math3.special.Gamma.logGamma1p((x - 1.0))) + (org.apache.commons.math3.util.FastMath.log((x * (1.0 + x))));
			}
		
	}

	private static double logGammaMinusLogGammaSum(final double a, final double b) throws org.apache.commons.math3.exception.NumberIsTooSmallException {
		if (a < 0.0) {
			throw new org.apache.commons.math3.exception.NumberIsTooSmallException(a, 0.0, true);
		}
		if (b < 10.0) {
			throw new org.apache.commons.math3.exception.NumberIsTooSmallException(b, 10.0, true);
		}
		final double d;
		final double w;
		if (a <= b) {
			d = b + (a - 0.5);
			w = org.apache.commons.math3.special.Beta.deltaMinusDeltaSum(a, b);
		}else {
			d = a + (b - 0.5);
			w = org.apache.commons.math3.special.Beta.deltaMinusDeltaSum(b, a);
		}
		final double u = d * (org.apache.commons.math3.util.FastMath.log1p((a / b)));
		final double v = a * ((org.apache.commons.math3.util.FastMath.log(b)) - 1.0);
		return u <= v ? (w - u) - v : (w - v) - u;
	}

	private static double deltaMinusDeltaSum(final double a, final double b) throws org.apache.commons.math3.exception.NumberIsTooSmallException, org.apache.commons.math3.exception.OutOfRangeException {
		if ((a < 0) || (a > b)) {
			throw new org.apache.commons.math3.exception.OutOfRangeException(a, 0, b);
		}
		if (b < 10) {
			throw new org.apache.commons.math3.exception.NumberIsTooSmallException(b, 10, true);
		}
		final double h = a / b;
		final double p = h / (1.0 + h);
		final double q = 1.0 / (1.0 + h);
		final double q2 = q * q;
		final double[] s = new double[org.apache.commons.math3.special.Beta.DELTA.length];
		s[0] = 1.0;
		for (int i = 1; i < (s.length); i++) {
			s[i] = 1.0 + (q + (q2 * (s[(i - 1)])));
		}
		final double sqrtT = 10.0 / b;
		final double t = sqrtT * sqrtT;
		double w = (org.apache.commons.math3.special.Beta.DELTA[((org.apache.commons.math3.special.Beta.DELTA.length) - 1)]) * (s[((s.length) - 1)]);
		for (int i = (org.apache.commons.math3.special.Beta.DELTA.length) - 2; i >= 0; i--) {
			w = (t * w) + ((org.apache.commons.math3.special.Beta.DELTA[i]) * (s[i]));
		}
		return (w * p) / b;
	}

	private static double sumDeltaMinusDeltaSum(final double p, final double q) {
		if (p < 10.0) {
			throw new org.apache.commons.math3.exception.NumberIsTooSmallException(p, 10.0, true);
		}
		if (q < 10.0) {
			throw new org.apache.commons.math3.exception.NumberIsTooSmallException(q, 10.0, true);
		}
		final double a = org.apache.commons.math3.util.FastMath.min(p, q);
		final double b = org.apache.commons.math3.util.FastMath.max(p, q);
		final double sqrtT = 10.0 / a;
		final double t = sqrtT * sqrtT;
		double z = org.apache.commons.math3.special.Beta.DELTA[((org.apache.commons.math3.special.Beta.DELTA.length) - 1)];
		for (int i = (org.apache.commons.math3.special.Beta.DELTA.length) - 2; i >= 0; i--) {
			z = (t * z) + (org.apache.commons.math3.special.Beta.DELTA[i]);
		}
		return (z / a) + (org.apache.commons.math3.special.Beta.deltaMinusDeltaSum(a, b));
	}

	public static double logBeta(final double p, final double q) {
		if ((((java.lang.Double.isNaN(p)) || (java.lang.Double.isNaN(q))) || (p <= 0.0)) || (q <= 0.0)) {
			return java.lang.Double.NaN;
		}
		final double a = org.apache.commons.math3.util.FastMath.min(p, q);
		final double b = org.apache.commons.math3.util.FastMath.max(p, q);
		if (a >= 10.0) {
			final double w = org.apache.commons.math3.special.Beta.sumDeltaMinusDeltaSum(a, b);
			final double h = a / b;
			final double c = h / (1.0 + h);
			final double u = (-(a - 0.5)) * (org.apache.commons.math3.util.FastMath.log(c));
			final double v = b * (org.apache.commons.math3.util.FastMath.log1p(h));
			if (u <= v) {
				return (((((-0.5) * (org.apache.commons.math3.util.FastMath.log(b))) + (org.apache.commons.math3.special.Beta.HALF_LOG_TWO_PI)) + w) - u) - v;
			}else {
				return (((((-0.5) * (org.apache.commons.math3.util.FastMath.log(b))) + (org.apache.commons.math3.special.Beta.HALF_LOG_TWO_PI)) + w) - v) - u;
			}
		}else
			if (a > 2.0) {
				if (b > 1000.0) {
					final int n = ((int) (org.apache.commons.math3.util.FastMath.floor((a - 1.0))));
					double prod = 1.0;
					double ared = a;
					for (int i = 0; i < n; i++) {
						ared -= 1.0;
						prod *= ared / (1.0 + (ared / b));
					}
					return ((org.apache.commons.math3.util.FastMath.log(prod)) - (n * (org.apache.commons.math3.util.FastMath.log(b)))) + ((org.apache.commons.math3.special.Gamma.logGamma(ared)) + (org.apache.commons.math3.special.Beta.logGammaMinusLogGammaSum(ared, b)));
				}else {
					double prod1 = 1.0;
					double ared = a;
					while (ared > 2.0) {
						ared -= 1.0;
						final double h = ared / b;
						prod1 *= h / (1.0 + h);
					} 
					if (b < 10.0) {
						double prod2 = 1.0;
						double bred = b;
						while (bred > 2.0) {
							bred -= 1.0;
							prod2 *= bred / (ared + bred);
						} 
						return ((org.apache.commons.math3.util.FastMath.log(prod1)) + (org.apache.commons.math3.util.FastMath.log(prod2))) + ((org.apache.commons.math3.special.Gamma.logGamma(ared)) + ((org.apache.commons.math3.special.Gamma.logGamma(bred)) - (org.apache.commons.math3.special.Beta.logGammaSum(ared, bred))));
					}else {
						return ((org.apache.commons.math3.util.FastMath.log(prod1)) + (org.apache.commons.math3.special.Gamma.logGamma(ared))) + (org.apache.commons.math3.special.Beta.logGammaMinusLogGammaSum(ared, b));
					}
				}
			}else
				if (a >= 1.0) {
					if (b > 2.0) {
						if (b < 10.0) {
							double prod = 1.0;
							double bred = b;
							while (bred > 2.0) {
								bred -= 1.0;
								prod *= bred / (a + bred);
							} 
							return (org.apache.commons.math3.util.FastMath.log(prod)) + ((org.apache.commons.math3.special.Gamma.logGamma(a)) + ((org.apache.commons.math3.special.Gamma.logGamma(bred)) - (org.apache.commons.math3.special.Beta.logGammaSum(a, bred))));
						}else {
							return (org.apache.commons.math3.special.Gamma.logGamma(a)) + (org.apache.commons.math3.special.Beta.logGammaMinusLogGammaSum(a, b));
						}
					}else {
						return ((org.apache.commons.math3.special.Gamma.logGamma(a)) + (org.apache.commons.math3.special.Gamma.logGamma(b))) - (org.apache.commons.math3.special.Beta.logGammaSum(a, b));
					}
				}else {
					if (b >= 10.0) {
						return (org.apache.commons.math3.special.Gamma.logGamma(a)) + (org.apache.commons.math3.special.Beta.logGammaMinusLogGammaSum(a, b));
					}else {
						return org.apache.commons.math3.util.FastMath.log((((org.apache.commons.math3.special.Gamma.gamma(a)) * (org.apache.commons.math3.special.Gamma.gamma(b))) / (org.apache.commons.math3.special.Gamma.gamma((a + b)))));
					}
				}
			
		
	}
}

