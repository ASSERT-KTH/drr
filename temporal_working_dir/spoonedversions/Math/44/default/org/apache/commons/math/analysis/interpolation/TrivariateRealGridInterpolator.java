

package org.apache.commons.math.analysis.interpolation;


public interface TrivariateRealGridInterpolator {
	org.apache.commons.math.analysis.TrivariateRealFunction interpolate(double[] xval, double[] yval, double[] zval, double[][][] fval);
}

