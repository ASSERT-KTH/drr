

package org.apache.commons.math.analysis.function;


public class Power implements org.apache.commons.math.analysis.UnivariateRealFunction {
	private final double p;

	public Power(double p) {
		this.p = p;
	}

	public double value(double x) {
		return org.apache.commons.math.util.FastMath.pow(x, p);
	}
}

