

package org.apache.commons.math.analysis.interpolation;


public interface BivariateGridInterpolator {
	org.apache.commons.math.analysis.BivariateFunction interpolate(double[] xval, double[] yval, double[][] fval);
}

