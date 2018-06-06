

package org.apache.commons.math3.ode.nonstiff;


abstract class RungeKuttaStepInterpolator extends org.apache.commons.math3.ode.sampling.AbstractStepInterpolator {
	protected double[] previousState;

	protected double[][] yDotK;

	protected org.apache.commons.math3.ode.AbstractIntegrator integrator;

	protected RungeKuttaStepInterpolator() {
		previousState = null;
		yDotK = null;
		integrator = null;
	}

	public RungeKuttaStepInterpolator(final org.apache.commons.math3.ode.nonstiff.RungeKuttaStepInterpolator interpolator) {
		super(interpolator);
		if ((interpolator.currentState) != null) {
			previousState = interpolator.previousState.clone();
			yDotK = new double[interpolator.yDotK.length][];
			for (int k = 0; k < (interpolator.yDotK.length); ++k) {
				yDotK[k] = interpolator.yDotK[k].clone();
			}
		}else {
			previousState = null;
			yDotK = null;
		}
		integrator = null;
	}

	public void reinitialize(final org.apache.commons.math3.ode.AbstractIntegrator rkIntegrator, final double[] y, final double[][] yDotArray, final boolean forward, final org.apache.commons.math3.ode.EquationsMapper primaryMapper, final org.apache.commons.math3.ode.EquationsMapper[] secondaryMappers) {
		reinitialize(y, forward, primaryMapper, secondaryMappers);
		org.apache.commons.math3.ode.nonstiff.RungeKuttaStepInterpolator.this.previousState = null;
		org.apache.commons.math3.ode.nonstiff.RungeKuttaStepInterpolator.this.yDotK = yDotArray;
		org.apache.commons.math3.ode.nonstiff.RungeKuttaStepInterpolator.this.integrator = rkIntegrator;
	}

	@java.lang.Override
	public void shift() {
		previousState = currentState.clone();
		super.shift();
	}

	@java.lang.Override
	public void writeExternal(final java.io.ObjectOutput out) throws java.io.IOException {
		writeBaseExternal(out);
		final int n = (currentState) == null ? -1 : currentState.length;
		for (int i = 0; i < n; ++i) {
			out.writeDouble(previousState[i]);
		}
		final int kMax = (yDotK) == null ? -1 : yDotK.length;
		out.writeInt(kMax);
		for (int k = 0; k < kMax; ++k) {
			for (int i = 0; i < n; ++i) {
				out.writeDouble(yDotK[k][i]);
			}
		}
	}

	@java.lang.Override
	public void readExternal(final java.io.ObjectInput in) throws java.io.IOException, java.lang.ClassNotFoundException {
		final double t = readBaseExternal(in);
		final int n = (currentState) == null ? -1 : currentState.length;
		if (n < 0) {
			previousState = null;
		}else {
			previousState = new double[n];
			for (int i = 0; i < n; ++i) {
				previousState[i] = in.readDouble();
			}
		}
		final int kMax = in.readInt();
		yDotK = (kMax < 0) ? null : new double[kMax][];
		for (int k = 0; k < kMax; ++k) {
			yDotK[k] = (n < 0) ? null : new double[n];
			for (int i = 0; i < n; ++i) {
				yDotK[k][i] = in.readDouble();
			}
		}
		integrator = null;
		if ((currentState) != null) {
			setInterpolatedTime(t);
		}else {
			interpolatedTime = t;
		}
	}
}

