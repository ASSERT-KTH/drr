

package org.apache.commons.math3.analysis.function;


public class Atan2 implements org.apache.commons.math3.analysis.BivariateFunction {
	public double value(double x, double y) {
		return org.apache.commons.math3.util.FastMath.atan2(x, y);
	}
}

