

package org.apache.commons.math.ode.nonstiff;


public abstract class EmbeddedRungeKuttaIntegrator extends org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator {
	private final boolean fsal;

	private final double[] c;

	private final double[][] a;

	private final double[] b;

	private final org.apache.commons.math.ode.nonstiff.RungeKuttaStepInterpolator prototype;

	private final double exp;

	private double safety;

	private double minReduction;

	private double maxGrowth;

	protected EmbeddedRungeKuttaIntegrator(final java.lang.String name, final boolean fsal, final double[] c, final double[][] a, final double[] b, final org.apache.commons.math.ode.nonstiff.RungeKuttaStepInterpolator prototype, final double minStep, final double maxStep, final double scalAbsoluteTolerance, final double scalRelativeTolerance) {
		super(name, minStep, maxStep, scalAbsoluteTolerance, scalRelativeTolerance);
		this.fsal = fsal;
		this.c = c;
		this.a = a;
		this.b = b;
		this.prototype = prototype;
		exp = (-1.0) / (getOrder());
		setSafety(0.9);
		setMinReduction(0.2);
		setMaxGrowth(10.0);
	}

	protected EmbeddedRungeKuttaIntegrator(final java.lang.String name, final boolean fsal, final double[] c, final double[][] a, final double[] b, final org.apache.commons.math.ode.nonstiff.RungeKuttaStepInterpolator prototype, final double minStep, final double maxStep, final double[] vecAbsoluteTolerance, final double[] vecRelativeTolerance) {
		super(name, minStep, maxStep, vecAbsoluteTolerance, vecRelativeTolerance);
		this.fsal = fsal;
		this.c = c;
		this.a = a;
		this.b = b;
		this.prototype = prototype;
		exp = (-1.0) / (getOrder());
		setSafety(0.9);
		setMinReduction(0.2);
		setMaxGrowth(10.0);
	}

	public abstract int getOrder();

	public double getSafety() {
		return safety;
	}

	public void setSafety(final double safety) {
		org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.this.safety = safety;
	}

	@java.lang.Override
	public void integrate(final org.apache.commons.math.ode.ExpandableStatefulODE equations, final double t) throws org.apache.commons.math.exception.MathIllegalArgumentException, org.apache.commons.math.exception.MathIllegalStateException {
		sanityChecks(equations, t);
		setEquations(equations);
		final boolean forward = t > (equations.getTime());
		final double[] y0 = equations.getCompleteState();
		final double[] y = y0.clone();
		final int stages = (c.length) + 1;
		final double[][] yDotK = new double[stages][y.length];
		final double[] yTmp = y0.clone();
		final double[] yDotTmp = new double[y.length];
		final org.apache.commons.math.ode.nonstiff.RungeKuttaStepInterpolator interpolator = ((org.apache.commons.math.ode.nonstiff.RungeKuttaStepInterpolator) (prototype.copy()));
		interpolator.reinitialize(org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.this, yTmp, yDotK, forward, equations.getPrimaryMapper(), equations.getSecondaryMappers());
		interpolator.storeTime(equations.getTime());
		stepStart = equations.getTime();
		double hNew = 0;
		boolean firstTime = true;
		initIntegration(equations.getTime(), y0, t);
		isLastStep = false;
		do {
			interpolator.shift();
			double error = 10;
			while (error >= 1.0) {
				if (firstTime || (!(fsal))) {
					computeDerivatives(stepStart, y, yDotK[0]);
				}
				if (firstTime) {
					final double[] scale = new double[mainSetDimension];
					if ((vecAbsoluteTolerance) == null) {
						for (int i = 0; i < (scale.length); ++i) {
							scale[i] = (scalAbsoluteTolerance) + ((scalRelativeTolerance) * (org.apache.commons.math.util.FastMath.abs(y[i])));
						}
					}else {
						for (int i = 0; i < (scale.length); ++i) {
							scale[i] = (vecAbsoluteTolerance[i]) + ((vecRelativeTolerance[i]) * (org.apache.commons.math.util.FastMath.abs(y[i])));
						}
					}
					hNew = initializeStep(forward, getOrder(), scale, stepStart, y, yDotK[0], yTmp, yDotK[1]);
					firstTime = false;
				}
				stepSize = hNew;
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
				error = estimateError(yDotK, y, yTmp, stepSize);
				if (error >= 1.0) {
					final double factor = org.apache.commons.math.util.FastMath.min(maxGrowth, org.apache.commons.math.util.FastMath.max(minReduction, ((safety) * (org.apache.commons.math.util.FastMath.pow(error, exp)))));
					hNew = filterStep(((stepSize) * factor), forward, false);
				}
			} 
			interpolator.storeTime(((stepStart) + (stepSize)));
			java.lang.System.arraycopy(yTmp, 0, y, 0, y0.length);
			java.lang.System.arraycopy(yDotK[(stages - 1)], 0, yDotTmp, 0, y0.length);
			stepStart = acceptStep(interpolator, y, yDotTmp, t);
			java.lang.System.arraycopy(y, 0, yTmp, 0, y.length);
			if (!(isLastStep)) {
				interpolator.storeTime(stepStart);
				if (fsal) {
					java.lang.System.arraycopy(yDotTmp, 0, yDotK[0], 0, y0.length);
				}
				final double factor = org.apache.commons.math.util.FastMath.min(maxGrowth, org.apache.commons.math.util.FastMath.max(minReduction, ((safety) * (org.apache.commons.math.util.FastMath.pow(error, exp)))));
				final double scaledH = (stepSize) * factor;
				final double nextT = (stepStart) + scaledH;
				final boolean nextIsLast = forward ? nextT >= t : nextT <= t;
				hNew = filterStep(scaledH, forward, nextIsLast);
				final double filteredNextT = (stepStart) + hNew;
				final boolean filteredNextIsLast = forward ? filteredNextT >= t : filteredNextT <= t;
				if (filteredNextIsLast) {
					hNew = t - (stepStart);
				}
			}
		} while (!(isLastStep) );
		equations.setTime(stepStart);
		equations.setCompleteState(y);
		resetInternalState();
	}

	public double getMinReduction() {
		return minReduction;
	}

	public void setMinReduction(final double minReduction) {
		org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.this.minReduction = minReduction;
	}

	public double getMaxGrowth() {
		return maxGrowth;
	}

	public void setMaxGrowth(final double maxGrowth) {
		org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.this.maxGrowth = maxGrowth;
	}

	protected abstract double estimateError(double[][] yDotK, double[] y0, double[] y1, double h);
}

