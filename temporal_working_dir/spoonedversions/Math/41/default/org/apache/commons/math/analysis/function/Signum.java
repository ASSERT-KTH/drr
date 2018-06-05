

package org.apache.commons.math.analysis.function;


public class Signum implements org.apache.commons.math.analysis.UnivariateFunction {
	public double value(double x) {
		return org.apache.commons.math.util.FastMath.signum(x);
	}
}

