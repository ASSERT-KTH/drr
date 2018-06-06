

package org.apache.commons.math.analysis;


public class NevilleInterpolator implements java.io.Serializable , org.apache.commons.math.analysis.UnivariateRealInterpolator {
	static final long serialVersionUID = 3003707660147873733L;

	public org.apache.commons.math.analysis.UnivariateRealFunction interpolate(double[] x, double[] y) throws org.apache.commons.math.MathException {
		org.apache.commons.math.analysis.PolynomialFunctionLagrangeForm p;
		p = new org.apache.commons.math.analysis.PolynomialFunctionLagrangeForm(x, y);
		return p;
	}
}

