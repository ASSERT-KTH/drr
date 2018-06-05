

package org.apache.commons.math3.analysis.function;


public class Pow implements org.apache.commons.math3.analysis.BivariateFunction {
	public double value(double x, double y) {
		return org.apache.commons.math3.util.FastMath.pow(x, y);
	}
}

