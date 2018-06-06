

package org.apache.commons.math.special;


public class Erf implements java.io.Serializable {
	private static final long serialVersionUID = 490960015010326571L;

	private Erf() {
		super();
	}

	public static double erf(double x) throws org.apache.commons.math.MathException {
		double ret = org.apache.commons.math.special.Gamma.regularizedGammaP(0.5, (x * x), 1.0E-15, 10000);
		if (x < 0) {
			ret = -ret;
		}
		return ret;
	}
}

