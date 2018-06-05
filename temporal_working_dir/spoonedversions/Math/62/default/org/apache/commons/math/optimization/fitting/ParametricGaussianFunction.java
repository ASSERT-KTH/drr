

package org.apache.commons.math.optimization.fitting;


public class ParametricGaussianFunction implements java.io.Serializable , org.apache.commons.math.optimization.fitting.ParametricRealFunction {
	private static final long serialVersionUID = -3875578602503903233L;

	public ParametricGaussianFunction() {
	}

	public double value(double x, double[] parameters) throws org.apache.commons.math.FunctionEvaluationException {
		validateParameters(parameters);
		final double a = parameters[0];
		final double b = parameters[1];
		final double c = parameters[2];
		final double d = parameters[3];
		final double xMc = x - c;
		return a + (b * (java.lang.Math.exp((((-xMc) * xMc) / (2.0 * (d * d))))));
	}

	public double[] gradient(double x, double[] parameters) throws org.apache.commons.math.FunctionEvaluationException {
		validateParameters(parameters);
		final double b = parameters[1];
		final double c = parameters[2];
		final double d = parameters[3];
		final double xMc = x - c;
		final double d2 = d * d;
		final double exp = java.lang.Math.exp((((-xMc) * xMc) / (2 * d2)));
		final double f = ((b * exp) * xMc) / d2;
		return new double[]{ 1.0 , exp , f , (f * xMc) / d };
	}

	private void validateParameters(double[] parameters) throws org.apache.commons.math.FunctionEvaluationException {
		if (parameters == null) {
			throw new org.apache.commons.math.exception.NullArgumentException(org.apache.commons.math.exception.util.LocalizedFormats.INPUT_ARRAY);
		}
		if ((parameters.length) != 4) {
			throw new org.apache.commons.math.exception.DimensionMismatchException(4, parameters.length);
		}
		if ((parameters[3]) == 0.0) {
			throw new org.apache.commons.math.exception.ZeroException();
		}
	}
}

