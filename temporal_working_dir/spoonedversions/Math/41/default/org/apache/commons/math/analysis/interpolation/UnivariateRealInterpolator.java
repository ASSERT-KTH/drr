

package org.apache.commons.math.analysis.interpolation;


public interface UnivariateRealInterpolator {
	org.apache.commons.math.analysis.UnivariateFunction interpolate(double[] xval, double[] yval);
}

