

package org.apache.commons.math3.analysis.interpolation;


public class NevilleInterpolator implements java.io.Serializable , org.apache.commons.math3.analysis.interpolation.UnivariateInterpolator {
	static final long serialVersionUID = 3003707660147873733L;

	public org.apache.commons.math3.analysis.polynomials.PolynomialFunctionLagrangeForm interpolate(double[] x, double[] y) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.NonMonotonicSequenceException, org.apache.commons.math3.exception.NumberIsTooSmallException {
		return new org.apache.commons.math3.analysis.polynomials.PolynomialFunctionLagrangeForm(x, y);
	}
}

