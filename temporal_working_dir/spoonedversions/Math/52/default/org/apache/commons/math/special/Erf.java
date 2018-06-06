

package org.apache.commons.math.special;


public class Erf {
	private Erf() {
	}

	public static double erf(double x) {
		if ((org.apache.commons.math.util.FastMath.abs(x)) > 40) {
			return x > 0 ? 1 : -1;
		}
		double ret = org.apache.commons.math.special.Gamma.regularizedGammaP(0.5, (x * x), 1.0E-15, 10000);
		if (x < 0) {
			ret = -ret;
		}
		return ret;
	}

	public static double erfc(double x) {
		if ((org.apache.commons.math.util.FastMath.abs(x)) > 40) {
			return x > 0 ? 0 : 2;
		}
		final double ret = org.apache.commons.math.special.Gamma.regularizedGammaQ(0.5, (x * x), 1.0E-15, 10000);
		return x < 0 ? 2 - ret : ret;
	}
}

