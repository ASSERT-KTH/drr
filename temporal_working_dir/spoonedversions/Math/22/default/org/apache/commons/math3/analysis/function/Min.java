

package org.apache.commons.math3.analysis.function;


public class Min implements org.apache.commons.math3.analysis.BivariateFunction {
	public double value(double x, double y) {
		return org.apache.commons.math3.util.FastMath.min(x, y);
	}
}

