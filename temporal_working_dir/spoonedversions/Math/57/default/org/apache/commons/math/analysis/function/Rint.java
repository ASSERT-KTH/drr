

package org.apache.commons.math.analysis.function;


public class Rint implements org.apache.commons.math.analysis.UnivariateRealFunction {
	public double value(double x) {
		return org.apache.commons.math.util.FastMath.rint(x);
	}
}

