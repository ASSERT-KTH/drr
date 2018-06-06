

package org.apache.commons.math3.special;


public class Gamma {
	public static final double GAMMA = 0.5772156649015329;

	public static final double LANCZOS_G = 607.0 / 128.0;

	private static final double DEFAULT_EPSILON = 1.0E-14;

	private static final double[] LANCZOS = new double[]{ 0.9999999999999971 , 57.15623566586292 , -59.59796035547549 , 14.136097974741746 , -0.4919138160976202 , 3.399464998481189E-5 , 4.652362892704858E-5 , -9.837447530487956E-5 , 1.580887032249125E-4 , -2.1026444172410488E-4 , 2.1743961811521265E-4 , -1.643181065367639E-4 , 8.441822398385275E-5 , -2.6190838401581408E-5 , 3.6899182659531625E-6 };

	private static final double HALF_LOG_2_PI = 0.5 * (org.apache.commons.math3.util.FastMath.log((2.0 * (org.apache.commons.math3.util.FastMath.PI))));

	private static final double SQRT_TWO_PI = 2.5066282746310007;

	private static final double C_LIMIT = 49;

	private static final double S_LIMIT = 1.0E-5;

	private static final double INV_GAMMA1P_M1_A0 = 6.116095104481416E-9;

	private static final double INV_GAMMA1P_M1_A1 = 6.247308301164655E-9;

	private static final double INV_GAMMA1P_M1_B1 = 0.203610414066807;

	private static final double INV_GAMMA1P_M1_B2 = 0.026620534842894922;

	private static final double INV_GAMMA1P_M1_B3 = 4.939449793824468E-4;

	private static final double INV_GAMMA1P_M1_B4 = -8.514194324403149E-6;

	private static final double INV_GAMMA1P_M1_B5 = -6.4304548177935305E-6;

	private static final double INV_GAMMA1P_M1_B6 = 9.926418406727737E-7;

	private static final double INV_GAMMA1P_M1_B7 = -6.077618957228252E-8;

	private static final double INV_GAMMA1P_M1_B8 = 1.9575583661463974E-10;

	private static final double INV_GAMMA1P_M1_P0 = 6.116095104481416E-9;

	private static final double INV_GAMMA1P_M1_P1 = 6.8716741130671986E-9;

	private static final double INV_GAMMA1P_M1_P2 = 6.820161668496171E-10;

	private static final double INV_GAMMA1P_M1_P3 = 4.686843322948848E-11;

	private static final double INV_GAMMA1P_M1_P4 = 1.5728330277104463E-12;

	private static final double INV_GAMMA1P_M1_P5 = -1.2494415722763663E-13;

	private static final double INV_GAMMA1P_M1_P6 = 4.343529937408594E-15;

	private static final double INV_GAMMA1P_M1_Q1 = 0.3056961078365221;

	private static final double INV_GAMMA1P_M1_Q2 = 0.054642130860422966;

	private static final double INV_GAMMA1P_M1_Q3 = 0.004956830093825887;

	private static final double INV_GAMMA1P_M1_Q4 = 2.6923694661863613E-4;

	private static final double INV_GAMMA1P_M1_C = -0.42278433509846713;

	private static final double INV_GAMMA1P_M1_C0 = 0.5772156649015329;

	private static final double INV_GAMMA1P_M1_C1 = -0.6558780715202539;

	private static final double INV_GAMMA1P_M1_C2 = -0.04200263503409524;

	private static final double INV_GAMMA1P_M1_C3 = 0.16653861138229148;

	private static final double INV_GAMMA1P_M1_C4 = -0.04219773455554433;

	private static final double INV_GAMMA1P_M1_C5 = -0.009621971527876973;

	private static final double INV_GAMMA1P_M1_C6 = 0.0072189432466631;

	private static final double INV_GAMMA1P_M1_C7 = -0.0011651675918590652;

	private static final double INV_GAMMA1P_M1_C8 = -2.1524167411495098E-4;

	private static final double INV_GAMMA1P_M1_C9 = 1.280502823881162E-4;

	private static final double INV_GAMMA1P_M1_C10 = -2.013485478078824E-5;

	private static final double INV_GAMMA1P_M1_C11 = -1.2504934821426706E-6;

	private static final double INV_GAMMA1P_M1_C12 = 1.133027231981696E-6;

	private static final double INV_GAMMA1P_M1_C13 = -2.056338416977607E-7;

	private Gamma() {
	}

	public static double logGamma(double x) {
		double ret;
		if ((java.lang.Double.isNaN(x)) || (x <= 0.0)) {
			ret = java.lang.Double.NaN;
		}else
			if (x < 0.5) {
				return (org.apache.commons.math3.special.Gamma.logGamma1p(x)) - (org.apache.commons.math3.util.FastMath.log(x));
			}else
				if (x <= 2.5) {
					return org.apache.commons.math3.special.Gamma.logGamma1p(((x - 0.5) - 0.5));
				}else
					if (x <= 8.0) {
						final int n = ((int) (org.apache.commons.math3.util.FastMath.floor((x - 1.5))));
						double prod = 1.0;
						for (int i = 1; i <= n; i++) {
							prod *= x - i;
						}
						return (org.apache.commons.math3.special.Gamma.logGamma1p((x - (n + 1)))) + (org.apache.commons.math3.util.FastMath.log(prod));
					}else {
						double sum = org.apache.commons.math3.special.Gamma.lanczos(x);
						double tmp = (x + (org.apache.commons.math3.special.Gamma.LANCZOS_G)) + 0.5;
						ret = ((((x + 0.5) * (org.apache.commons.math3.util.FastMath.log(tmp))) - tmp) + (org.apache.commons.math3.special.Gamma.HALF_LOG_2_PI)) + (org.apache.commons.math3.util.FastMath.log((sum / x)));
					}
				
			
		
		return ret;
	}

	public static double regularizedGammaP(double a, double x) {
		return org.apache.commons.math3.special.Gamma.regularizedGammaP(a, x, org.apache.commons.math3.special.Gamma.DEFAULT_EPSILON, java.lang.Integer.MAX_VALUE);
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
					ret = 1.0 - (org.apache.commons.math3.special.Gamma.regularizedGammaQ(a, x, epsilon, maxIterations));
				}else {
					double n = 0.0;
					double an = 1.0 / a;
					double sum = an;
					while ((((org.apache.commons.math3.util.FastMath.abs((an / sum))) > epsilon) && (n < maxIterations)) && (sum < (java.lang.Double.POSITIVE_INFINITY))) {
						n = n + 1.0;
						an = an * (x / (a + n));
						sum = sum + an;
					} 
					if (n >= maxIterations) {
						throw new org.apache.commons.math3.exception.MaxCountExceededException(maxIterations);
					}else
						if (java.lang.Double.isInfinite(sum)) {
							ret = 1.0;
						}else {
							ret = (org.apache.commons.math3.util.FastMath.exp((((-x) + (a * (org.apache.commons.math3.util.FastMath.log(x)))) - (org.apache.commons.math3.special.Gamma.logGamma(a))))) * sum;
						}
					
				}
			
		
		return ret;
	}

	public static double regularizedGammaQ(double a, double x) {
		return org.apache.commons.math3.special.Gamma.regularizedGammaQ(a, x, org.apache.commons.math3.special.Gamma.DEFAULT_EPSILON, java.lang.Integer.MAX_VALUE);
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
					ret = 1.0 - (org.apache.commons.math3.special.Gamma.regularizedGammaP(a, x, epsilon, maxIterations));
				}else {
					org.apache.commons.math3.util.ContinuedFraction cf = new org.apache.commons.math3.util.ContinuedFraction() {
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
					ret = (org.apache.commons.math3.util.FastMath.exp((((-x) + (a * (org.apache.commons.math3.util.FastMath.log(x)))) - (org.apache.commons.math3.special.Gamma.logGamma(a))))) * ret;
				}
			
		
		return ret;
	}

	public static double digamma(double x) {
		if ((x > 0) && (x <= (org.apache.commons.math3.special.Gamma.S_LIMIT))) {
			return (-(org.apache.commons.math3.special.Gamma.GAMMA)) - (1 / x);
		}
		if (x >= (org.apache.commons.math3.special.Gamma.C_LIMIT)) {
			double inv = 1 / (x * x);
			return ((org.apache.commons.math3.util.FastMath.log(x)) - (0.5 / x)) - (inv * ((1.0 / 12) + (inv * ((1.0 / 120) - (inv / 252)))));
		}
		return (org.apache.commons.math3.special.Gamma.digamma((x + 1))) - (1 / x);
	}

	public static double trigamma(double x) {
		if ((x > 0) && (x <= (org.apache.commons.math3.special.Gamma.S_LIMIT))) {
			return 1 / (x * x);
		}
		if (x >= (org.apache.commons.math3.special.Gamma.C_LIMIT)) {
			double inv = 1 / (x * x);
			return ((1 / x) + (inv / 2)) + ((inv / x) * ((1.0 / 6) - (inv * ((1.0 / 30) + (inv / 42)))));
		}
		return (org.apache.commons.math3.special.Gamma.trigamma((x + 1))) + (1 / (x * x));
	}

	public static double lanczos(final double x) {
		double sum = 0.0;
		for (int i = (org.apache.commons.math3.special.Gamma.LANCZOS.length) - 1; i > 0; --i) {
			sum = sum + ((org.apache.commons.math3.special.Gamma.LANCZOS[i]) / (x + i));
		}
		return sum + (org.apache.commons.math3.special.Gamma.LANCZOS[0]);
	}

	public static double invGamma1pm1(final double x) {
		if (x < (-0.5)) {
			throw new org.apache.commons.math3.exception.NumberIsTooSmallException(x, (-0.5), true);
		}
		if (x > 1.5) {
			throw new org.apache.commons.math3.exception.NumberIsTooLargeException(x, 1.5, true);
		}
		final double ret;
		final double t = x <= 0.5 ? x : (x - 0.5) - 0.5;
		if (t < 0.0) {
			final double a = (org.apache.commons.math3.special.Gamma.INV_GAMMA1P_M1_A0) + (t * (org.apache.commons.math3.special.Gamma.INV_GAMMA1P_M1_A1));
			double b = org.apache.commons.math3.special.Gamma.INV_GAMMA1P_M1_B8;
			b = (org.apache.commons.math3.special.Gamma.INV_GAMMA1P_M1_B7) + (t * b);
			b = (org.apache.commons.math3.special.Gamma.INV_GAMMA1P_M1_B6) + (t * b);
			b = (org.apache.commons.math3.special.Gamma.INV_GAMMA1P_M1_B5) + (t * b);
			b = (org.apache.commons.math3.special.Gamma.INV_GAMMA1P_M1_B4) + (t * b);
			b = (org.apache.commons.math3.special.Gamma.INV_GAMMA1P_M1_B3) + (t * b);
			b = (org.apache.commons.math3.special.Gamma.INV_GAMMA1P_M1_B2) + (t * b);
			b = (org.apache.commons.math3.special.Gamma.INV_GAMMA1P_M1_B1) + (t * b);
			b = 1.0 + (t * b);
			double c = (org.apache.commons.math3.special.Gamma.INV_GAMMA1P_M1_C13) + (t * (a / b));
			c = (org.apache.commons.math3.special.Gamma.INV_GAMMA1P_M1_C12) + (t * c);
			c = (org.apache.commons.math3.special.Gamma.INV_GAMMA1P_M1_C11) + (t * c);
			c = (org.apache.commons.math3.special.Gamma.INV_GAMMA1P_M1_C10) + (t * c);
			c = (org.apache.commons.math3.special.Gamma.INV_GAMMA1P_M1_C9) + (t * c);
			c = (org.apache.commons.math3.special.Gamma.INV_GAMMA1P_M1_C8) + (t * c);
			c = (org.apache.commons.math3.special.Gamma.INV_GAMMA1P_M1_C7) + (t * c);
			c = (org.apache.commons.math3.special.Gamma.INV_GAMMA1P_M1_C6) + (t * c);
			c = (org.apache.commons.math3.special.Gamma.INV_GAMMA1P_M1_C5) + (t * c);
			c = (org.apache.commons.math3.special.Gamma.INV_GAMMA1P_M1_C4) + (t * c);
			c = (org.apache.commons.math3.special.Gamma.INV_GAMMA1P_M1_C3) + (t * c);
			c = (org.apache.commons.math3.special.Gamma.INV_GAMMA1P_M1_C2) + (t * c);
			c = (org.apache.commons.math3.special.Gamma.INV_GAMMA1P_M1_C1) + (t * c);
			c = (org.apache.commons.math3.special.Gamma.INV_GAMMA1P_M1_C) + (t * c);
			if (x > 0.5) {
				ret = (t * c) / x;
			}else {
				ret = x * ((c + 0.5) + 0.5);
			}
		}else {
			double p = org.apache.commons.math3.special.Gamma.INV_GAMMA1P_M1_P6;
			p = (org.apache.commons.math3.special.Gamma.INV_GAMMA1P_M1_P5) + (t * p);
			p = (org.apache.commons.math3.special.Gamma.INV_GAMMA1P_M1_P4) + (t * p);
			p = (org.apache.commons.math3.special.Gamma.INV_GAMMA1P_M1_P3) + (t * p);
			p = (org.apache.commons.math3.special.Gamma.INV_GAMMA1P_M1_P2) + (t * p);
			p = (org.apache.commons.math3.special.Gamma.INV_GAMMA1P_M1_P1) + (t * p);
			p = (org.apache.commons.math3.special.Gamma.INV_GAMMA1P_M1_P0) + (t * p);
			double q = org.apache.commons.math3.special.Gamma.INV_GAMMA1P_M1_Q4;
			q = (org.apache.commons.math3.special.Gamma.INV_GAMMA1P_M1_Q3) + (t * q);
			q = (org.apache.commons.math3.special.Gamma.INV_GAMMA1P_M1_Q2) + (t * q);
			q = (org.apache.commons.math3.special.Gamma.INV_GAMMA1P_M1_Q1) + (t * q);
			q = 1.0 + (t * q);
			double c = (org.apache.commons.math3.special.Gamma.INV_GAMMA1P_M1_C13) + ((p / q) * t);
			c = (org.apache.commons.math3.special.Gamma.INV_GAMMA1P_M1_C12) + (t * c);
			c = (org.apache.commons.math3.special.Gamma.INV_GAMMA1P_M1_C11) + (t * c);
			c = (org.apache.commons.math3.special.Gamma.INV_GAMMA1P_M1_C10) + (t * c);
			c = (org.apache.commons.math3.special.Gamma.INV_GAMMA1P_M1_C9) + (t * c);
			c = (org.apache.commons.math3.special.Gamma.INV_GAMMA1P_M1_C8) + (t * c);
			c = (org.apache.commons.math3.special.Gamma.INV_GAMMA1P_M1_C7) + (t * c);
			c = (org.apache.commons.math3.special.Gamma.INV_GAMMA1P_M1_C6) + (t * c);
			c = (org.apache.commons.math3.special.Gamma.INV_GAMMA1P_M1_C5) + (t * c);
			c = (org.apache.commons.math3.special.Gamma.INV_GAMMA1P_M1_C4) + (t * c);
			c = (org.apache.commons.math3.special.Gamma.INV_GAMMA1P_M1_C3) + (t * c);
			c = (org.apache.commons.math3.special.Gamma.INV_GAMMA1P_M1_C2) + (t * c);
			c = (org.apache.commons.math3.special.Gamma.INV_GAMMA1P_M1_C1) + (t * c);
			c = (org.apache.commons.math3.special.Gamma.INV_GAMMA1P_M1_C0) + (t * c);
			if (x > 0.5) {
				ret = (t / x) * ((c - 0.5) - 0.5);
			}else {
				ret = x * c;
			}
		}
		return ret;
	}

	public static double logGamma1p(final double x) throws org.apache.commons.math3.exception.NumberIsTooLargeException, org.apache.commons.math3.exception.NumberIsTooSmallException {
		if (x < (-0.5)) {
			throw new org.apache.commons.math3.exception.NumberIsTooSmallException(x, (-0.5), true);
		}
		if (x > 1.5) {
			throw new org.apache.commons.math3.exception.NumberIsTooLargeException(x, 1.5, true);
		}
		return -(org.apache.commons.math3.util.FastMath.log1p(org.apache.commons.math3.special.Gamma.invGamma1pm1(x)));
	}

	public static double gamma(final double x) {
		if ((x == (org.apache.commons.math3.util.FastMath.rint(x))) && (x <= 0.0)) {
			return java.lang.Double.NaN;
		}
		final double ret;
		final double absX = org.apache.commons.math3.util.FastMath.abs(x);
		if (absX <= 20.0) {
			if (x >= 1.0) {
				double prod = 1.0;
				double t = x;
				while (t > 2.5) {
					t = t - 1.0;
					prod *= t;
				} 
				ret = prod / (1.0 + (org.apache.commons.math3.special.Gamma.invGamma1pm1((t - 1.0))));
			}else {
				double prod = x;
				double t = x;
				while (t < (-0.5)) {
					t = t + 1.0;
					prod *= t;
				} 
				ret = 1.0 / (prod * (1.0 + (org.apache.commons.math3.special.Gamma.invGamma1pm1(t))));
			}
		}else {
			final double y = (absX + (org.apache.commons.math3.special.Gamma.LANCZOS_G)) + 0.5;
			final double gammaAbs = ((((org.apache.commons.math3.special.Gamma.SQRT_TWO_PI) / x) * (org.apache.commons.math3.util.FastMath.pow(y, (absX + 0.5)))) * (org.apache.commons.math3.util.FastMath.exp((-y)))) * (org.apache.commons.math3.special.Gamma.lanczos(absX));
			if (x > 0.0) {
				ret = gammaAbs;
			}else {
				ret = (-(org.apache.commons.math3.util.FastMath.PI)) / ((x * (org.apache.commons.math3.util.FastMath.sin(((org.apache.commons.math3.util.FastMath.PI) * x)))) * gammaAbs);
			}
		}
		return ret;
	}
}

