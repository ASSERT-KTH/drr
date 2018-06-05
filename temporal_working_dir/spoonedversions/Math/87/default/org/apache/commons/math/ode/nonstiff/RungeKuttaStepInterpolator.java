

package org.apache.commons.math.ode.nonstiff;


abstract class RungeKuttaStepInterpolator extends org.apache.commons.math.ode.sampling.AbstractStepInterpolator {
	protected RungeKuttaStepInterpolator() {
		super();
		yDotK = null;
		equations = null;
	}

	public RungeKuttaStepInterpolator(final org.apache.commons.math.ode.nonstiff.RungeKuttaStepInterpolator interpolator) {
		super(interpolator);
		if ((interpolator.currentState) != null) {
			final int dimension = currentState.length;
			yDotK = new double[interpolator.yDotK.length][];
			for (int k = 0; k < (interpolator.yDotK.length); ++k) {
				yDotK[k] = new double[dimension];
				java.lang.System.arraycopy(interpolator.yDotK[k], 0, yDotK[k], 0, dimension);
			}
		}else {
			yDotK = null;
		}
		equations = null;
	}

	public void reinitialize(final org.apache.commons.math.ode.FirstOrderDifferentialEquations equations, final double[] y, final double[][] yDotK, final boolean forward) {
		reinitialize(y, forward);
		org.apache.commons.math.ode.nonstiff.RungeKuttaStepInterpolator.this.yDotK = yDotK;
		org.apache.commons.math.ode.nonstiff.RungeKuttaStepInterpolator.this.equations = equations;
	}

	@java.lang.Override
	public void writeExternal(final java.io.ObjectOutput out) throws java.io.IOException {
		writeBaseExternal(out);
		final int n = (currentState) == null ? -1 : currentState.length;
		final int kMax = (yDotK) == null ? -1 : yDotK.length;
		out.writeInt(kMax);
		for (int k = 0; k < kMax; ++k) {
			for (int i = 0; i < n; ++i) {
				out.writeDouble(yDotK[k][i]);
			}
		}
	}

	@java.lang.Override
	public void readExternal(final java.io.ObjectInput in) throws java.io.IOException {
		final double t = readBaseExternal(in);
		final int n = (currentState) == null ? -1 : currentState.length;
		final int kMax = in.readInt();
		yDotK = (kMax < 0) ? null : new double[kMax][];
		for (int k = 0; k < kMax; ++k) {
			yDotK[k] = (n < 0) ? null : new double[n];
			for (int i = 0; i < n; ++i) {
				yDotK[k][i] = in.readDouble();
			}
		}
		equations = null;
		if ((currentState) != null) {
			try {
				setInterpolatedTime(t);
			} catch (org.apache.commons.math.ode.DerivativeException e) {
				throw org.apache.commons.math.MathRuntimeException.createIOException(e);
			}
		}else {
			interpolatedTime = t;
		}
	}

	protected double[][] yDotK;

	protected org.apache.commons.math.ode.FirstOrderDifferentialEquations equations;
}

