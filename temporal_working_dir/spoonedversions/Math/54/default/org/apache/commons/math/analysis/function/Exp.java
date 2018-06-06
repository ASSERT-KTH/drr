

package org.apache.commons.math.analysis.function;


public class Exp implements org.apache.commons.math.analysis.UnivariateRealFunction {
	public double value(double x) {
		return org.apache.commons.math.util.FastMath.exp(x);
	}
}

