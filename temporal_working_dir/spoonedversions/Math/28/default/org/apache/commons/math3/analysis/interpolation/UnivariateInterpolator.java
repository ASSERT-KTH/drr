

package org.apache.commons.math3.analysis.interpolation;


public interface UnivariateInterpolator {
	org.apache.commons.math3.analysis.UnivariateFunction interpolate(double[] xval, double[] yval);
}

