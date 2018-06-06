

package org.apache.commons.math.analysis;


public interface ParametricUnivariateRealFunction {
	double value(double x, double... parameters);

	double[] gradient(double x, double... parameters);
}

