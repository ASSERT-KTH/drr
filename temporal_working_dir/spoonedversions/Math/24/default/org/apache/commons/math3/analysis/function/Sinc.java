

package org.apache.commons.math3.analysis.function;


public class Sinc implements org.apache.commons.math3.analysis.DifferentiableUnivariateFunction , org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiable {
	private static final double SHORTCUT = 0.006;

	private final boolean normalized;

	public Sinc() {
		this(false);
	}

	public Sinc(boolean normalized) {
		this.normalized = normalized;
	}

	public double value(final double x) {
		final double scaledX = normalized ? (org.apache.commons.math3.util.FastMath.PI) * x : x;
		if ((org.apache.commons.math3.util.FastMath.abs(scaledX)) <= (org.apache.commons.math3.analysis.function.Sinc.SHORTCUT)) {
			final double scaledX2 = scaledX * scaledX;
			return (((scaledX2 - 20) * scaledX2) + 120) / 120;
		}else {
			return (org.apache.commons.math3.util.FastMath.sin(scaledX)) / scaledX;
		}
	}

	@java.lang.Deprecated
	public org.apache.commons.math3.analysis.UnivariateFunction derivative() {
		return org.apache.commons.math3.analysis.FunctionUtils.toDifferentiableUnivariateFunction(org.apache.commons.math3.analysis.function.Sinc.this).derivative();
	}

	public org.apache.commons.math3.analysis.differentiation.DerivativeStructure value(final org.apache.commons.math3.analysis.differentiation.DerivativeStructure t) {
		final double scaledX = (normalized ? org.apache.commons.math3.util.FastMath.PI : 1) * (t.getValue());
		final double scaledX2 = scaledX * scaledX;
		double[] f = new double[(t.getOrder()) + 1];
		if ((org.apache.commons.math3.util.FastMath.abs(scaledX)) <= (org.apache.commons.math3.analysis.function.Sinc.SHORTCUT)) {
			for (int i = 0; i < (f.length); ++i) {
				final int k = i / 2;
				if ((i & 1) == 0) {
					f[i] = ((k & 1) == 0 ? 1 : -1) * ((1.0 / (i + 1)) - (scaledX2 * ((1.0 / ((2 * i) + 6)) - (scaledX2 / ((24 * i) + 120)))));
				}else {
					f[i] = ((k & 1) == 0 ? -scaledX : scaledX) * ((1.0 / (i + 2)) - (scaledX2 * ((1.0 / ((6 * i) + 24)) - (scaledX2 / ((120 * i) + 720)))));
				}
			}
		}else {
			final double inv = 1 / scaledX;
			final double cos = org.apache.commons.math3.util.FastMath.cos(scaledX);
			final double sin = org.apache.commons.math3.util.FastMath.sin(scaledX);
			f[0] = inv * sin;
			final double[] sc = new double[f.length];
			sc[0] = 1;
			double coeff = inv;
			for (int n = 1; n < (f.length); ++n) {
				double s = 0;
				double c = 0;
				final int kStart;
				if ((n & 1) == 0) {
					sc[n] = 0;
					kStart = n;
				}else {
					sc[n] = sc[(n - 1)];
					c = sc[n];
					kStart = n - 1;
				}
				for (int k = kStart; k > 1; k -= 2) {
					sc[k] = ((k - n) * (sc[k])) - (sc[(k - 1)]);
					s = (s * scaledX2) + (sc[k]);
					sc[(k - 1)] = (((k - 1) - n) * (sc[(k - 1)])) + (sc[(k - 2)]);
					c = (c * scaledX2) + (sc[(k - 1)]);
				}
				sc[0] *= -n;
				s = (s * scaledX2) + (sc[0]);
				coeff *= inv;
				f[n] = coeff * ((s * sin) + ((c * scaledX) * cos));
			}
		}
		if (normalized) {
			double scale = org.apache.commons.math3.util.FastMath.PI;
			for (int i = 1; i < (f.length); ++i) {
				f[i] *= scale;
				scale *= org.apache.commons.math3.util.FastMath.PI;
			}
		}
		return t.compose(f);
	}
}

