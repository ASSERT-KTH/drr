

package org.apache.commons.math3.analysis.function;


public class HarmonicOscillator implements org.apache.commons.math3.analysis.DifferentiableUnivariateFunction , org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction {
	private final double amplitude;

	private final double omega;

	private final double phase;

	public HarmonicOscillator(double amplitude, double omega, double phase) {
		this.amplitude = amplitude;
		this.omega = omega;
		this.phase = phase;
	}

	public double value(double x) {
		return org.apache.commons.math3.analysis.function.HarmonicOscillator.value((((omega) * x) + (phase)), amplitude);
	}

	@java.lang.Deprecated
	public org.apache.commons.math3.analysis.UnivariateFunction derivative() {
		return org.apache.commons.math3.analysis.FunctionUtils.toDifferentiableUnivariateFunction(org.apache.commons.math3.analysis.function.HarmonicOscillator.this).derivative();
	}

	public static class Parametric implements org.apache.commons.math3.analysis.ParametricUnivariateFunction {
		public double value(double x, double... param) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.NullArgumentException {
			validateParameters(param);
			return org.apache.commons.math3.analysis.function.HarmonicOscillator.value(((x * (param[1])) + (param[2])), param[0]);
		}

		public double[] gradient(double x, double... param) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.NullArgumentException {
			validateParameters(param);
			final double amplitude = param[0];
			final double omega = param[1];
			final double phase = param[2];
			final double xTimesOmegaPlusPhase = (omega * x) + phase;
			final double a = org.apache.commons.math3.analysis.function.HarmonicOscillator.value(xTimesOmegaPlusPhase, 1);
			final double p = (-amplitude) * (org.apache.commons.math3.util.FastMath.sin(xTimesOmegaPlusPhase));
			final double w = p * x;
			return new double[]{ a , w , p };
		}

		private void validateParameters(double[] param) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.NullArgumentException {
			if (param == null) {
				throw new org.apache.commons.math3.exception.NullArgumentException();
			}
			if ((param.length) != 3) {
				throw new org.apache.commons.math3.exception.DimensionMismatchException(param.length, 3);
			}
		}
	}

	private static double value(double xTimesOmegaPlusPhase, double amplitude) {
		return amplitude * (org.apache.commons.math3.util.FastMath.cos(xTimesOmegaPlusPhase));
	}

	public org.apache.commons.math3.analysis.differentiation.DerivativeStructure value(final org.apache.commons.math3.analysis.differentiation.DerivativeStructure t) {
		final double x = t.getValue();
		double[] f = new double[(t.getOrder()) + 1];
		final double alpha = ((omega) * x) + (phase);
		f[0] = (amplitude) * (org.apache.commons.math3.util.FastMath.cos(alpha));
		if ((f.length) > 1) {
			f[1] = ((-(amplitude)) * (omega)) * (org.apache.commons.math3.util.FastMath.sin(alpha));
			final double mo2 = (-(omega)) * (omega);
			for (int i = 2; i < (f.length); ++i) {
				f[i] = mo2 * (f[(i - 2)]);
			}
		}
		return t.compose(f);
	}
}

