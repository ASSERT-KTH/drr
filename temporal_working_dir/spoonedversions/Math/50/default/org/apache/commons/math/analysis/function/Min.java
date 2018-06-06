

package org.apache.commons.math.analysis.function;


public class Min implements org.apache.commons.math.analysis.BivariateRealFunction {
	public double value(double x, double y) {
		return org.apache.commons.math.util.FastMath.min(x, y);
	}
}

