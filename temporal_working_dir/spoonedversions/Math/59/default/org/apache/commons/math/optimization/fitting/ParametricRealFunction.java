

package org.apache.commons.math.optimization.fitting;


public interface ParametricRealFunction {
	double value(double x, double[] parameters);

	double[] gradient(double x, double[] parameters);
}

