

package org.apache.commons.math3.analysis.interpolation;


public interface MultivariateInterpolator {
	org.apache.commons.math3.analysis.MultivariateFunction interpolate(double[][] xval, double[] yval);
}

