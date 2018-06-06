

package org.apache.commons.math.special;


public class Gamma {
	public static final double GAMMA = 0.5772156649015329;

	private static final double DEFAULT_EPSILON = 1.0E-14;

	private static final double[] LANCZOS = new double[]{ 0.9999999999999971 , 57.15623566586292 , -59.59796035547549 , 14.136097974741746 , -0.4919138160976202 , 3.399464998481189E-5 , 4.652362892704858E-5 , -9.837447530487956E-5 , 1.580887032249125E-4 , -2.1026444172410488E-4 , 2.1743961811521265E-4 , -1.643181065367639E-4 , 8.441822398385275E-5 , -2.6190838401581408E-5 , 3.6899182659531625E-6 };

	private static final double HALF_LOG_2_PI = 0.5 * (org.apache.commons.math.util.FastMath.log((2.0 * (org.apache.commons.math.util.FastMath.PI))));

	private static final double C_LIMIT = 49;

	private static final double S_LIMIT = 1.0E-5;

	private Gamma() {
	}

	public static double logGamma(double x) {
		double ret;
		if ((java.lang.Double.isNaN(x)) || (x <= 0.0)) {
			ret = java.lang.Double.NaN;
		}else {
			double g = 607.0 / 128.0;
			double sum = 0.0;
			for (int i = (org.apache.commons.math.special.Gamma.LANCZOS.length) - 1; i > 0; --i) {
				sum = sum + ((org.apache.commons.math.special.Gamma.LANCZOS[i]) / (x + i));
			}
			sum = sum + (org.apache.commons.math.special.Gamma.LANCZOS[0]);
			double tmp = (x + g) + 0.5;
			ret = ((((x + 0.5) * (org.apache.commons.math.util.FastMath.log(tmp))) - tmp) + (org.apache.commons.math.special.Gamma.HALF_LOG_2_PI)) + (org.apache.commons.math.util.FastMath.log((sum / x)));
		}
		return ret;
	}

	public static double regularizedGammaP(double a, double x) {
		return org.apache.commons.math.special.Gamma.regularizedGammaP(a, x, org.apache.commons.math.special.Gamma.DEFAULT_EPSILON, java.lang.Integer.MAX_VALUE);
	}

	public static double regularizedGammaP(double a, double x, double epsilon, int maxIterations) {
		double ret;
		if ((((java.lang.Double.isNaN(a)) || (java.lang.Double.isNaN(x))) || (a <= 0.0)) || (x < 0.0)) {
			ret = java.lang.Double.NaN;
		}else
			if (x == 0.0) {
				ret = 0.0;
			}else
				if (x >= (a + 1)) {
					ret = 1.0 - (org.apache.commons.math.special.Gamma.regularizedGammaQ(a, x, epsilon, maxIterations));
				}else {
					double n = 0.0;
					double an = 1.0 / a;
					double sum = an;
					while ((((org.apache.commons.math.util.FastMath.abs((an / sum))) > epsilon) && (n < maxIterations)) && (sum < (java.lang.Double.POSITIVE_INFINITY))) {
						n = n + 1.0;
						an = an * (x / (a + n));
						sum = sum + an;
					} 
					if (n >= maxIterations) {
						throw new org.apache.commons.math.exception.MaxCountExceededException(maxIterations);
					}else
						if (java.lang.Double.isInfinite(sum)) {
							ret = 1.0;
						}else {
							ret = (org.apache.commons.math.util.FastMath.exp((((-x) + (a * (org.apache.commons.math.util.FastMath.log(x)))) - (org.apache.commons.math.special.Gamma.logGamma(a))))) * sum;
						}
					
				}
			
		
		return ret;
	}

	public static double regularizedGammaQ(double a, double x) {
		return org.apache.commons.math.special.Gamma.regularizedGammaQ(a, x, org.apache.commons.math.special.Gamma.DEFAULT_EPSILON, java.lang.Integer.MAX_VALUE);
	}

	public static double regularizedGammaQ(final double a, double x, double epsilon, int maxIterations) {
		double ret;
		if ((((java.lang.Double.isNaN(a)) || (java.lang.Double.isNaN(x))) || (a <= 0.0)) || (x < 0.0)) {
			ret = java.lang.Double.NaN;
		}else
			if (x == 0.0) {
				ret = 1.0;
			}else
				if (x < (a + 1.0)) {
					ret = 1.0 - (org.apache.commons.math.special.Gamma.regularizedGammaP(a, x, epsilon, maxIterations));
				}else {
					org.apache.commons.math.util.ContinuedFraction cf = new org.apache.commons.math.util.ContinuedFraction() {
						@java.lang.Override
						protected double getA(int n, double x) {
							return (((2.0 * n) + 1.0) - a) + x;
						}

						@java.lang.Override
						protected double getB(int n, double x) {
							return n * (a - n);
						}
					};
					ret = 1.0 / (cf.evaluate(x, epsilon, maxIterations));
					ret = (org.apache.commons.math.util.FastMath.exp((((-x) + (a * (org.apache.commons.math.util.FastMath.log(x)))) - (org.apache.commons.math.special.Gamma.logGamma(a))))) * ret;
				}
			
		
		return ret;
	}

	public static double digamma(double x) {
		if ((x > 0) && (x <= (org.apache.commons.math.special.Gamma.S_LIMIT))) {
			return (-(org.apache.commons.math.special.Gamma.GAMMA)) - (1 / x);
		}
		if (x >= (org.apache.commons.math.special.Gamma.C_LIMIT)) {
			double inv = 1 / (x * x);
			return ((org.apache.commons.math.util.FastMath.log(x)) - (0.5 / x)) - (inv * ((1.0 / 12) + (inv * ((1.0 / 120) - (inv / 252)))));
		}
		return (org.apache.commons.math.special.Gamma.digamma((x + 1))) - (1 / x);
	}

	public static double trigamma(double x) {
		if ((x > 0) && (x <= (org.apache.commons.math.special.Gamma.S_LIMIT))) {
			return 1 / (x * x);
		}
		if (x >= (org.apache.commons.math.special.Gamma.C_LIMIT)) {
			double inv = 1 / (x * x);
			return ((1 / x) + (inv / 2)) + ((inv / x) * ((1.0 / 6) - (inv * ((1.0 / 30) + (inv / 42)))));
		}
		return (org.apache.commons.math.special.Gamma.trigamma((x + 1))) + (1 / (x * x));
	}
}

