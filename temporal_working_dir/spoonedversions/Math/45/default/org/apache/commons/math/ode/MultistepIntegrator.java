

package org.apache.commons.math.ode;


public abstract class MultistepIntegrator extends org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator {
	protected double[] scaled;

	protected org.apache.commons.math.linear.Array2DRowRealMatrix nordsieck;

	private org.apache.commons.math.ode.FirstOrderIntegrator starter;

	private final int nSteps;

	private double exp;

	private double safety;

	private double minReduction;

	private double maxGrowth;

	protected MultistepIntegrator(final java.lang.String name, final int nSteps, final int order, final double minStep, final double maxStep, final double scalAbsoluteTolerance, final double scalRelativeTolerance) {
		super(name, minStep, maxStep, scalAbsoluteTolerance, scalRelativeTolerance);
		if (nSteps <= 1) {
			throw new org.apache.commons.math.exception.MathIllegalArgumentException(org.apache.commons.math.exception.util.LocalizedFormats.INTEGRATION_METHOD_NEEDS_AT_LEAST_TWO_PREVIOUS_POINTS, name);
		}
		starter = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator(minStep, maxStep, scalAbsoluteTolerance, scalRelativeTolerance);
		this.nSteps = nSteps;
		exp = (-1.0) / order;
		setSafety(0.9);
		setMinReduction(0.2);
		setMaxGrowth(org.apache.commons.math.util.FastMath.pow(2.0, (-(exp))));
	}

	protected MultistepIntegrator(final java.lang.String name, final int nSteps, final int order, final double minStep, final double maxStep, final double[] vecAbsoluteTolerance, final double[] vecRelativeTolerance) {
		super(name, minStep, maxStep, vecAbsoluteTolerance, vecRelativeTolerance);
		starter = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator(minStep, maxStep, vecAbsoluteTolerance, vecRelativeTolerance);
		this.nSteps = nSteps;
		exp = (-1.0) / order;
		setSafety(0.9);
		setMinReduction(0.2);
		setMaxGrowth(org.apache.commons.math.util.FastMath.pow(2.0, (-(exp))));
	}

	public org.apache.commons.math.ode.ODEIntegrator getStarterIntegrator() {
		return starter;
	}

	public void setStarterIntegrator(org.apache.commons.math.ode.FirstOrderIntegrator starterIntegrator) {
		org.apache.commons.math.ode.MultistepIntegrator.this.starter = starterIntegrator;
	}

	protected void start(final double t0, final double[] y0, final double t) throws org.apache.commons.math.exception.MathIllegalStateException {
		starter.clearEventHandlers();
		starter.clearStepHandlers();
		starter.addStepHandler(new org.apache.commons.math.ode.MultistepIntegrator.NordsieckInitializer(nSteps, y0.length));
		try {
			starter.integrate(new org.apache.commons.math.ode.MultistepIntegrator.CountingDifferentialEquations(y0.length), t0, y0, t, new double[y0.length]);
		} catch (org.apache.commons.math.ode.MultistepIntegrator.InitializationCompletedMarkerException icme) {
		}
		starter.clearStepHandlers();
	}

	protected abstract org.apache.commons.math.linear.Array2DRowRealMatrix initializeHighOrderDerivatives(final double h, final double[] t, final double[][] y, final double[][] yDot);

	public double getMinReduction() {
		return minReduction;
	}

	public void setMinReduction(final double minReduction) {
		org.apache.commons.math.ode.MultistepIntegrator.this.minReduction = minReduction;
	}

	public double getMaxGrowth() {
		return maxGrowth;
	}

	public void setMaxGrowth(final double maxGrowth) {
		org.apache.commons.math.ode.MultistepIntegrator.this.maxGrowth = maxGrowth;
	}

	public double getSafety() {
		return safety;
	}

	public void setSafety(final double safety) {
		org.apache.commons.math.ode.MultistepIntegrator.this.safety = safety;
	}

	protected double computeStepGrowShrinkFactor(final double error) {
		return org.apache.commons.math.util.FastMath.min(maxGrowth, org.apache.commons.math.util.FastMath.max(minReduction, ((safety) * (org.apache.commons.math.util.FastMath.pow(error, exp)))));
	}

	public interface NordsieckTransformer {
		org.apache.commons.math.linear.Array2DRowRealMatrix initializeHighOrderDerivatives(final double h, final double[] t, final double[][] y, final double[][] yDot);
	}

	private class NordsieckInitializer implements org.apache.commons.math.ode.sampling.StepHandler {
		private int count;

		private final double[] t;

		private final double[][] y;

		private final double[][] yDot;

		public NordsieckInitializer(final int nSteps, final int n) {
			org.apache.commons.math.ode.MultistepIntegrator.NordsieckInitializer.this.count = 0;
			this.t = new double[nSteps];
			this.y = new double[nSteps][n];
			this.yDot = new double[nSteps][n];
		}

		public void handleStep(org.apache.commons.math.ode.sampling.StepInterpolator interpolator, boolean isLast) {
			final double prev = interpolator.getPreviousTime();
			final double curr = interpolator.getCurrentTime();
			if ((count) == 0) {
				interpolator.setInterpolatedTime(prev);
				t[0] = prev;
				java.lang.System.arraycopy(interpolator.getInterpolatedState(), 0, y[0], 0, y[0].length);
				java.lang.System.arraycopy(interpolator.getInterpolatedDerivatives(), 0, yDot[0], 0, yDot[0].length);
			}
			++(count);
			interpolator.setInterpolatedTime(curr);
			t[count] = curr;
			java.lang.System.arraycopy(interpolator.getInterpolatedState(), 0, y[count], 0, y[count].length);
			java.lang.System.arraycopy(interpolator.getInterpolatedDerivatives(), 0, yDot[count], 0, yDot[count].length);
			if ((count) == ((t.length) - 1)) {
				stepStart = t[0];
				stepSize = ((t[((t.length) - 1)]) - (t[0])) / ((t.length) - 1);
				scaled = yDot[0].clone();
				for (int j = 0; j < (scaled.length); ++j) {
					scaled[j] *= stepSize;
				}
				nordsieck = initializeHighOrderDerivatives(stepSize, t, y, yDot);
				throw new org.apache.commons.math.ode.MultistepIntegrator.InitializationCompletedMarkerException();
			}
		}

		public void reset() {
		}
	}

	private static class InitializationCompletedMarkerException extends java.lang.RuntimeException {
		private static final long serialVersionUID = -1914085471038046418L;

		public InitializationCompletedMarkerException() {
			super(((java.lang.Throwable) (null)));
		}
	}

	private class CountingDifferentialEquations implements org.apache.commons.math.ode.FirstOrderDifferentialEquations {
		private final int dimension;

		public CountingDifferentialEquations(final int dimension) {
			this.dimension = dimension;
		}

		public void computeDerivatives(double t, double[] y, double[] dot) {
			org.apache.commons.math.ode.MultistepIntegrator.this.computeDerivatives(t, y, dot);
		}

		public int getDimension() {
			return dimension;
		}
	}
}

