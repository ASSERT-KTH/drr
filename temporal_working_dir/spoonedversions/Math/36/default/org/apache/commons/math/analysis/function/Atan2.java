

package org.apache.commons.math.analysis.function;


public class Atan2 implements org.apache.commons.math.analysis.BivariateFunction {
	public double value(double x, double y) {
		return org.apache.commons.math.util.FastMath.atan2(x, y);
	}
}

