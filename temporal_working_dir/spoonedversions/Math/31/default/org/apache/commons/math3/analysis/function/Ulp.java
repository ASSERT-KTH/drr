

package org.apache.commons.math3.analysis.function;


public class Ulp implements org.apache.commons.math3.analysis.UnivariateFunction {
	public double value(double x) {
		return org.apache.commons.math3.util.FastMath.ulp(x);
	}
}

