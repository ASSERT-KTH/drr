

package org.apache.commons.math.analysis.function;


public class Pow implements org.apache.commons.math.analysis.BivariateFunction {
	public double value(double x, double y) {
		return org.apache.commons.math.util.FastMath.pow(x, y);
	}
}

