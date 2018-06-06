

package org.apache.commons.math.analysis.function;


public class Sigmoid implements org.apache.commons.math.analysis.UnivariateRealFunction {
	public double value(double x) {
		return 1 / (1 + (org.apache.commons.math.util.FastMath.exp((-x))));
	}
}

