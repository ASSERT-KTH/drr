

package org.apache.commons.math.analysis.interpolation;


public interface UnivariateInterpolator {
	org.apache.commons.math.analysis.UnivariateFunction interpolate(double[] xval, double[] yval);
}

