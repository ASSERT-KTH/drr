

package org.apache.commons.math3.analysis.function;


public class Sinc implements org.apache.commons.math3.analysis.DifferentiableUnivariateFunction {
	private static final double SHORTCUT = 1.0E-9;

	private final boolean normalized;

	public Sinc() {
		this(false);
	}

	public Sinc(boolean normalized) {
		this.normalized = normalized;
	}

	public double value(double x) {
		if (normalized) {
			final double piTimesX = (java.lang.Math.PI) * x;
			return org.apache.commons.math3.analysis.function.Sinc.sinc(piTimesX);
		}else {
			return org.apache.commons.math3.analysis.function.Sinc.sinc(x);
		}
	}

	public org.apache.commons.math3.analysis.UnivariateFunction derivative() {
		if (normalized) {
			return new org.apache.commons.math3.analysis.UnivariateFunction() {
				public double value(double x) {
					final double piTimesX = (java.lang.Math.PI) * x;
					return org.apache.commons.math3.analysis.function.Sinc.sincDerivative(piTimesX);
				}
			};
		}else {
			return new org.apache.commons.math3.analysis.UnivariateFunction() {
				public double value(double x) {
					return org.apache.commons.math3.analysis.function.Sinc.sincDerivative(x);
				}
			};
		}
	}

	private static double sinc(double x) {
		return (org.apache.commons.math3.util.FastMath.abs(x)) < (org.apache.commons.math3.analysis.function.Sinc.SHORTCUT) ? 1 : (org.apache.commons.math3.util.FastMath.sin(x)) / x;
	}

	private static double sincDerivative(double x) {
		return (org.apache.commons.math3.util.FastMath.abs(x)) < (org.apache.commons.math3.analysis.function.Sinc.SHORTCUT) ? 0 : ((org.apache.commons.math3.util.FastMath.cos(x)) - ((org.apache.commons.math3.util.FastMath.sin(x)) / x)) / x;
	}
}

