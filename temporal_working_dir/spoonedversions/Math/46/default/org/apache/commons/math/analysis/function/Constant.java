

package org.apache.commons.math.analysis.function;


public class Constant implements org.apache.commons.math.analysis.UnivariateRealFunction {
	private final double c;

	public Constant(double c) {
		this.c = c;
	}

	public double value(double x) {
		return c;
	}
}

