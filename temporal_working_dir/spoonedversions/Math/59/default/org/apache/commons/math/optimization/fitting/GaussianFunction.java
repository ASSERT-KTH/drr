

package org.apache.commons.math.optimization.fitting;


public class GaussianFunction implements java.io.Serializable , org.apache.commons.math.analysis.DifferentiableUnivariateRealFunction {
	private static final long serialVersionUID = -3195385616125629512L;

	private final double a;

	private final double b;

	private final double c;

	private final double d;

	public GaussianFunction(double a, double b, double c, double d) {
		if (d == 0.0) {
			throw new org.apache.commons.math.exception.ZeroException();
		}
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	public GaussianFunction(double[] parameters) {
		if (parameters == null) {
			throw new org.apache.commons.math.exception.NullArgumentException(org.apache.commons.math.exception.util.LocalizedFormats.INPUT_ARRAY);
		}
		if ((parameters.length) != 4) {
			throw new org.apache.commons.math.exception.DimensionMismatchException(4, parameters.length);
		}
		if ((parameters[3]) == 0.0) {
			throw new org.apache.commons.math.exception.ZeroException();
		}
		this.a = parameters[0];
		this.b = parameters[1];
		this.c = parameters[2];
		this.d = parameters[3];
	}

	public org.apache.commons.math.analysis.UnivariateRealFunction derivative() {
		return new org.apache.commons.math.optimization.fitting.GaussianDerivativeFunction(b, c, d);
	}

	public double value(double x) {
		final double xMc = x - (c);
		return (a) + ((b) * (java.lang.Math.exp((((-xMc) * xMc) / (2.0 * ((d) * (d)))))));
	}

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}

	public double getD() {
		return d;
	}
}

