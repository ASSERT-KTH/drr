

package org.apache.commons.math.optimization.fitting;


public class GaussianDerivativeFunction implements java.io.Serializable , org.apache.commons.math.analysis.UnivariateRealFunction {
	private static final long serialVersionUID = -6500229089670174766L;

	private final double b;

	private final double c;

	private final double d2;

	public GaussianDerivativeFunction(double b, double c, double d) {
		if (d == 0.0) {
			throw new org.apache.commons.math.exception.ZeroNotAllowedException();
		}
		this.b = b;
		this.c = c;
		this.d2 = d * d;
	}

	public GaussianDerivativeFunction(double[] parameters) {
		if (parameters == null) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(org.apache.commons.math.exception.LocalizedFormats.NULL_INPUT_ARRAY);
		}
		if ((parameters.length) != 3) {
			throw new org.apache.commons.math.exception.DimensionMismatchException(3, parameters.length);
		}
		if ((parameters[2]) == 0.0) {
			throw new org.apache.commons.math.exception.ZeroNotAllowedException();
		}
		this.b = parameters[0];
		this.c = parameters[1];
		this.d2 = (parameters[2]) * (parameters[2]);
	}

	public double value(double x) throws org.apache.commons.math.FunctionEvaluationException {
		final double xMc = x - (c);
		return (((-(b)) / (d2)) * xMc) * (java.lang.Math.exp(((-(xMc * xMc)) / (2.0 * (d2)))));
	}
}

