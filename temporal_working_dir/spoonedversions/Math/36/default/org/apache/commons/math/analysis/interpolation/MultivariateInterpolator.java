

package org.apache.commons.math.analysis.interpolation;


public interface MultivariateInterpolator {
	org.apache.commons.math.analysis.MultivariateFunction interpolate(double[][] xval, double[] yval);
}

