

package org.apache.commons.math.analysis.function;


public class HarmonicOscillator implements org.apache.commons.math.analysis.DifferentiableUnivariateRealFunction {
	private final double amplitude;

	private final double omega;

	private final double phase;

	public HarmonicOscillator(double amplitude, double omega, double phase) {
		this.amplitude = amplitude;
		this.omega = omega;
		this.phase = phase;
	}

	public double value(double x) {
		return org.apache.commons.math.analysis.function.HarmonicOscillator.value((((omega) * x) + (phase)), amplitude);
	}

	public org.apache.commons.math.analysis.UnivariateRealFunction derivative() {
		return new org.apache.commons.math.analysis.UnivariateRealFunction() {
			public double value(double x) {
				return ((-(amplitude)) * (omega)) * (org.apache.commons.math.util.FastMath.sin((((omega) * x) + (phase))));
			}
		};
	}

	public static class Parametric implements org.apache.commons.math.analysis.ParametricUnivariateRealFunction {
		public double value(double x, double[] param) {
			validateParameters(param);
			return org.apache.commons.math.analysis.function.HarmonicOscillator.value(((x * (param[1])) + (param[2])), param[0]);
		}

		public double[] gradient(double x, double[] param) {
			validateParameters(param);
			final double amplitude = param[0];
			final double omega = param[1];
			final double phase = param[2];
			final double xTimesOmegaPlusPhase = (omega * x) + phase;
			final double a = org.apache.commons.math.analysis.function.HarmonicOscillator.value(xTimesOmegaPlusPhase, 1);
			final double p = (-amplitude) * (org.apache.commons.math.util.FastMath.sin(xTimesOmegaPlusPhase));
			final double w = p * x;
			return new double[]{ a , w , p };
		}

		private void validateParameters(double[] param) {
			if (param == null) {
				throw new org.apache.commons.math.exception.NullArgumentException();
			}
			if ((param.length) != 3) {
				throw new org.apache.commons.math.exception.DimensionMismatchException(param.length, 3);
			}
		}
	}

	private static double value(double xTimesOmegaPlusPhase, double amplitude) {
		return amplitude * (org.apache.commons.math.util.FastMath.cos(xTimesOmegaPlusPhase));
	}
}

