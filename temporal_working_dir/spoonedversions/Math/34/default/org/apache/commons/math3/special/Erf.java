

package org.apache.commons.math3.special;


public class Erf {
	private static final double X_CRIT = 0.4769362762044697;

	private Erf() {
	}

	public static double erf(double x) {
		if ((org.apache.commons.math3.util.FastMath.abs(x)) > 40) {
			return x > 0 ? 1 : -1;
		}
		final double ret = org.apache.commons.math3.special.Gamma.regularizedGammaP(0.5, (x * x), 1.0E-15, 10000);
		return x < 0 ? -ret : ret;
	}

	public static double erfc(double x) {
		if ((org.apache.commons.math3.util.FastMath.abs(x)) > 40) {
			return x > 0 ? 0 : 2;
		}
		final double ret = org.apache.commons.math3.special.Gamma.regularizedGammaQ(0.5, (x * x), 1.0E-15, 10000);
		return x < 0 ? 2 - ret : ret;
	}

	public static double erf(double x1, double x2) {
		if (x1 > x2) {
			return -(org.apache.commons.math3.special.Erf.erf(x2, x1));
		}
		return x1 < (-(org.apache.commons.math3.special.Erf.X_CRIT)) ? x2 < 0.0 ? (org.apache.commons.math3.special.Erf.erfc((-x2))) - (org.apache.commons.math3.special.Erf.erfc((-x1))) : (org.apache.commons.math3.special.Erf.erf(x2)) - (org.apache.commons.math3.special.Erf.erf(x1)) : (x2 > (org.apache.commons.math3.special.Erf.X_CRIT)) && (x1 > 0.0) ? (org.apache.commons.math3.special.Erf.erfc(x1)) - (org.apache.commons.math3.special.Erf.erfc(x2)) : (org.apache.commons.math3.special.Erf.erf(x2)) - (org.apache.commons.math3.special.Erf.erf(x1));
	}
}

