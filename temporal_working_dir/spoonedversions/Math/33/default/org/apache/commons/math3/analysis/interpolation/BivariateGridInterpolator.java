

package org.apache.commons.math3.analysis.interpolation;


public interface BivariateGridInterpolator {
	org.apache.commons.math3.analysis.BivariateFunction interpolate(double[] xval, double[] yval, double[][] fval);
}

