

package org.apache.commons.math3.analysis.interpolation;


public interface TrivariateGridInterpolator {
	org.apache.commons.math3.analysis.TrivariateFunction interpolate(double[] xval, double[] yval, double[] zval, double[][][] fval);
}

