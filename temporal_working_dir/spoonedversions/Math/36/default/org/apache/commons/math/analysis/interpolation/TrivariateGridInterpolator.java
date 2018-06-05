

package org.apache.commons.math.analysis.interpolation;


public interface TrivariateGridInterpolator {
	org.apache.commons.math.analysis.TrivariateFunction interpolate(double[] xval, double[] yval, double[] zval, double[][][] fval);
}

