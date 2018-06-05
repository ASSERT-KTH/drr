

package org.apache.commons.math.analysis.function;


public class Sinc implements org.apache.commons.math.analysis.UnivariateRealFunction {
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
			return org.apache.commons.math.analysis.function.Sinc.sinc(piTimesX);
		}else {
			return org.apache.commons.math.analysis.function.Sinc.sinc(x);
		}
	}

	private static double sinc(double x) {
		return (org.apache.commons.math.util.FastMath.abs(x)) < 1.0E-9 ? 1 : (org.apache.commons.math.util.FastMath.sin(x)) / x;
	}
}

