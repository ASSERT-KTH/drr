

package org.apache.commons.math3.analysis;


public interface ParametricUnivariateFunction {
	double value(double x, double... parameters);

	double[] gradient(double x, double... parameters);
}

