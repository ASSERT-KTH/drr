

package org.apache.commons.math3.ode.nonstiff;


public abstract class RungeKuttaIntegrator extends org.apache.commons.math3.ode.AbstractIntegrator {
	private final double[] c;

	private final double[][] a;

	private final double[] b;

	private final org.apache.commons.math3.ode.nonstiff.RungeKuttaStepInterpolator prototype;

	private final double step;

	protected RungeKuttaIntegrator(final java.lang.String name, final double[] c, final double[][] a, final double[] b, final org.apache.commons.math3.ode.nonstiff.RungeKuttaStepInterpolator prototype, final double step) {
		super(name);
		this.c = c;
		this.a = a;
		this.b = b;
		this.prototype = prototype;
		this.step = org.apache.commons.math3.util.FastMath.abs(step);
	}

	@java.lang.Override
	public void integrate(final org.apache.commons.math3.ode.ExpandableStatefulODE equations, final double t) throws org.apache.commons.math3.exception.MathIllegalArgumentException, org.apache.commons.math3.exception.MathIllegalStateException {
		sanityChecks(equations, t);
		setEquations(equations);
		final boolean forward = t > (equations.getTime());
		final double[] y0 = equations.getCompleteState();
		final double[] y = y0.clone();
		final int stages = (c.length) + 1;
		final double[][] yDotK = new double[stages][];
		for (int i = 0; i < stages; ++i) {
			yDotK[i] = new double[y0.length];
		}
		final double[] yTmp = y0.clone();
		final double[] yDotTmp = new double[y0.length];
		final org.apache.commons.math3.ode.nonstiff.RungeKuttaStepInterpolator interpolator = ((org.apache.commons.math3.ode.nonstiff.RungeKuttaStepInterpolator) (prototype.copy()));
		interpolator.reinitialize(org.apache.commons.math3.ode.nonstiff.RungeKuttaIntegrator.this, yTmp, yDotK, forward, equations.getPrimaryMapper(), equations.getSecondaryMappers());
		interpolator.storeTime(equations.getTime());
		stepStart = equations.getTime();
		stepSize = (forward) ? step : -(step);
		initIntegration(equations.getTime(), y0, t);
		isLastStep = false;
		do {
			interpolator.shift();
			computeDerivatives(stepStart, y, yDotK[0]);
			for (int k = 1; k < stages; ++k) {
				for (int j = 0; j < (y0.length); ++j) {
					double sum = (a[(k - 1)][0]) * (yDotK[0][j]);
					for (int l = 1; l < k; ++l) {
						sum += (a[(k - 1)][l]) * (yDotK[l][j]);
					}
					yTmp[j] = (y[j]) + ((stepSize) * sum);
				}
				computeDerivatives(((stepStart) + ((c[(k - 1)]) * (stepSize))), yTmp, yDotK[k]);
			}
			for (int j = 0; j < (y0.length); ++j) {
				double sum = (b[0]) * (yDotK[0][j]);
				for (int l = 1; l < stages; ++l) {
					sum += (b[l]) * (yDotK[l][j]);
				}
				yTmp[j] = (y[j]) + ((stepSize) * sum);
			}
			interpolator.storeTime(((stepStart) + (stepSize)));
			java.lang.System.arraycopy(yTmp, 0, y, 0, y0.length);
			java.lang.System.arraycopy(yDotK[(stages - 1)], 0, yDotTmp, 0, y0.length);
			stepStart = acceptStep(interpolator, y, yDotTmp, t);
			if (!(isLastStep)) {
				interpolator.storeTime(stepStart);
				final double nextT = (stepStart) + (stepSize);
				final boolean nextIsLast = forward ? nextT >= t : nextT <= t;
				if (nextIsLast) {
					stepSize = t - (stepStart);
				}
			}
		} while (!(isLastStep) );
		equations.setTime(stepStart);
		equations.setCompleteState(y);
		stepStart = java.lang.Double.NaN;
		stepSize = java.lang.Double.NaN;
	}
}

