

package org.apache.commons.math.analysis.function;


public class Abs implements org.apache.commons.math.analysis.UnivariateRealFunction {
	public double value(double x) {
		return org.apache.commons.math.util.FastMath.abs(x);
	}
}

