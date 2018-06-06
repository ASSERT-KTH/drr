

package org.jfree.data.function;


public class PolynomialFunction2D implements java.io.Serializable , org.jfree.data.function.Function2D {
	private double[] coefficients;

	public PolynomialFunction2D(double[] coefficients) {
		if (coefficients == null) {
			throw new java.lang.IllegalArgumentException("Null 'coefficients' argument");
		}
		org.jfree.data.function.PolynomialFunction2D.this.coefficients = ((double[]) (coefficients.clone()));
	}

	public double[] getCoefficients() {
		return ((double[]) (org.jfree.data.function.PolynomialFunction2D.this.coefficients.clone()));
	}

	public int getOrder() {
		return (org.jfree.data.function.PolynomialFunction2D.this.coefficients.length) - 1;
	}

	public double getValue(double x) {
		double y = 0;
		for (int i = 0; i < (coefficients.length); i++) {
			y += (coefficients[i]) * (java.lang.Math.pow(x, i));
		}
		return y;
	}

	public boolean equals(java.lang.Object obj) {
		if (!(obj instanceof org.jfree.data.function.PolynomialFunction2D)) {
			return false;
		}
		org.jfree.data.function.PolynomialFunction2D that = ((org.jfree.data.function.PolynomialFunction2D) (obj));
		return java.util.Arrays.equals(org.jfree.data.function.PolynomialFunction2D.this.coefficients, that.coefficients);
	}

	public int hashCode() {
		return org.jfree.chart.util.HashUtilities.hashCodeForDoubleArray(org.jfree.data.function.PolynomialFunction2D.this.coefficients);
	}
}

