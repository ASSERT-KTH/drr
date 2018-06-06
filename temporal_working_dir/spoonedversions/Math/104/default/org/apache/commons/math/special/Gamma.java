

package org.apache.commons.math.special;


public class Gamma implements java.io.Serializable {
	private static final long serialVersionUID = -6587513359895466954L;

	private static final double DEFAULT_EPSILON = 1.0E-8;

	private static double[] lanczos = new double[]{ 0.9999999999999971 , 57.15623566586292 , -59.59796035547549 , 14.136097974741746 , -0.4919138160976202 , 3.399464998481189E-5 , 4.652362892704858E-5 , -9.837447530487956E-5 , 1.580887032249125E-4 , -2.1026444172410488E-4 , 2.1743961811521265E-4 , -1.643181065367639E-4 , 8.441822398385275E-5 , -2.6190838401581408E-5 , 3.6899182659531625E-6 };

	private static final double HALF_LOG_2_PI = 0.5 * (java.lang.Math.log((2.0 * (java.lang.Math.PI))));

	private Gamma() {
		super();
	}

	public static double logGamma(double x) {
		double ret;
		if ((java.lang.Double.isNaN(x)) || (x <= 0.0)) {
			ret = java.lang.Double.NaN;
		}else {
			double g = 607.0 / 128.0;
			double sum = 0.0;
			for (int i = (org.apache.commons.math.special.Gamma.lanczos.length) - 1; i > 0; --i) {
				sum = sum + ((org.apache.commons.math.special.Gamma.lanczos[i]) / (x + i));
			}
			sum = sum + (org.apache.commons.math.special.Gamma.lanczos[0]);
			double tmp = (x + g) + 0.5;
			ret = ((((x + 0.5) * (java.lang.Math.log(tmp))) - tmp) + (org.apache.commons.math.special.Gamma.HALF_LOG_2_PI)) + (java.lang.Math.log((sum / x)));
		}
		return ret;
	}

	public static double regularizedGammaP(double a, double x) throws org.apache.commons.math.MathException {
		return org.apache.commons.math.special.Gamma.regularizedGammaP(a, x, org.apache.commons.math.special.Gamma.DEFAULT_EPSILON, java.lang.Integer.MAX_VALUE);
	}

	public static double regularizedGammaP(double a, double x, double epsilon, int maxIterations) throws org.apache.commons.math.MathException {
		double ret;
		if ((((java.lang.Double.isNaN(a)) || (java.lang.Double.isNaN(x))) || (a <= 0.0)) || (x < 0.0)) {
			ret = java.lang.Double.NaN;
		}else
			if (x == 0.0) {
				ret = 0.0;
			}else
				if ((a >= 1.0) && (x > a)) {
					ret = 1.0 - (org.apache.commons.math.special.Gamma.regularizedGammaQ(a, x, epsilon, maxIterations));
				}else {
					double n = 0.0;
					double an = 1.0 / a;
					double sum = an;
					while (((java.lang.Math.abs(an)) > epsilon) && (n < maxIterations)) {
						n = n + 1.0;
						an = an * (x / (a + n));
						sum = sum + an;
					} 
					if (n >= maxIterations) {
						throw new org.apache.commons.math.MaxIterationsExceededException(maxIterations);
					}else {
						ret = (java.lang.Math.exp((((-x) + (a * (java.lang.Math.log(x)))) - (org.apache.commons.math.special.Gamma.logGamma(a))))) * sum;
					}
				}
			
		
		return ret;
	}

	public static double regularizedGammaQ(double a, double x) throws org.apache.commons.math.MathException {
		return org.apache.commons.math.special.Gamma.regularizedGammaQ(a, x, org.apache.commons.math.special.Gamma.DEFAULT_EPSILON, java.lang.Integer.MAX_VALUE);
	}

	public static double regularizedGammaQ(final double a, double x, double epsilon, int maxIterations) throws org.apache.commons.math.MathException {
		double ret;
		if ((((java.lang.Double.isNaN(a)) || (java.lang.Double.isNaN(x))) || (a <= 0.0)) || (x < 0.0)) {
			ret = java.lang.Double.NaN;
		}else
			if (x == 0.0) {
				ret = 1.0;
			}else
				if ((x < a) || (a < 1.0)) {
					ret = 1.0 - (org.apache.commons.math.special.Gamma.regularizedGammaP(a, x, epsilon, maxIterations));
				}else {
					org.apache.commons.math.util.ContinuedFraction cf = new org.apache.commons.math.util.ContinuedFraction() {
						private static final long serialVersionUID = 5378525034886164398L;

						protected double getA(int n, double x) {
							return (((2.0 * n) + 1.0) - a) + x;
						}

						protected double getB(int n, double x) {
							return n * (a - n);
						}
					};
					ret = 1.0 / (cf.evaluate(x, epsilon, maxIterations));
					ret = (java.lang.Math.exp((((-x) + (a * (java.lang.Math.log(x)))) - (org.apache.commons.math.special.Gamma.logGamma(a))))) * ret;
				}
			
		
		return ret;
	}
}

