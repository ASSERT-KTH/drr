

package org.apache.commons.math.analysis.function;


public class Sinc implements org.apache.commons.math.analysis.UnivariateRealFunction {
	public double value(double x) {
		return (org.apache.commons.math.util.FastMath.abs(x)) < 1.0E-9 ? 1 : (org.apache.commons.math.util.FastMath.sin(x)) / x;
	}
}

