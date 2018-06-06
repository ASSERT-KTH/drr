

package org.apache.commons.math.analysis.function;


public class Floor implements org.apache.commons.math.analysis.UnivariateFunction {
	public double value(double x) {
		return org.apache.commons.math.util.FastMath.floor(x);
	}
}

