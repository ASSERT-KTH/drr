

package org.apache.commons.math.ode.sampling;


public abstract class AbstractStepInterpolator implements org.apache.commons.math.ode.sampling.StepInterpolator {
	protected double previousTime;

	protected double currentTime;

	protected double h;

	protected double[] currentState;

	protected double interpolatedTime;

	protected double[] interpolatedState;

	protected double[] interpolatedDerivatives;

	private boolean finalized;

	private boolean forward;

	protected AbstractStepInterpolator() {
		previousTime = java.lang.Double.NaN;
		currentTime = java.lang.Double.NaN;
		h = java.lang.Double.NaN;
		interpolatedTime = java.lang.Double.NaN;
		currentState = null;
		interpolatedState = null;
		interpolatedDerivatives = null;
		finalized = false;
		org.apache.commons.math.ode.sampling.AbstractStepInterpolator.this.forward = true;
	}

	protected AbstractStepInterpolator(final double[] y, final boolean forward) {
		previousTime = java.lang.Double.NaN;
		currentTime = java.lang.Double.NaN;
		h = java.lang.Double.NaN;
		interpolatedTime = java.lang.Double.NaN;
		currentState = y;
		interpolatedState = new double[y.length];
		interpolatedDerivatives = new double[y.length];
		finalized = false;
		org.apache.commons.math.ode.sampling.AbstractStepInterpolator.this.forward = forward;
	}

	protected AbstractStepInterpolator(final org.apache.commons.math.ode.sampling.AbstractStepInterpolator interpolator) {
		previousTime = interpolator.previousTime;
		currentTime = interpolator.currentTime;
		h = interpolator.h;
		interpolatedTime = interpolator.interpolatedTime;
		if ((interpolator.currentState) != null) {
			currentState = interpolator.currentState.clone();
			interpolatedState = interpolator.interpolatedState.clone();
			interpolatedDerivatives = interpolator.interpolatedDerivatives.clone();
		}else {
			currentState = null;
			interpolatedState = null;
			interpolatedDerivatives = null;
		}
		finalized = interpolator.finalized;
		forward = interpolator.forward;
	}

	protected void reinitialize(final double[] y, final boolean forward) {
		previousTime = java.lang.Double.NaN;
		currentTime = java.lang.Double.NaN;
		h = java.lang.Double.NaN;
		interpolatedTime = java.lang.Double.NaN;
		currentState = y;
		interpolatedState = new double[y.length];
		interpolatedDerivatives = new double[y.length];
		finalized = false;
		org.apache.commons.math.ode.sampling.AbstractStepInterpolator.this.forward = forward;
	}

	public org.apache.commons.math.ode.sampling.StepInterpolator copy() throws org.apache.commons.math.ode.DerivativeException {
		finalizeStep();
		return doCopy();
	}

	protected abstract org.apache.commons.math.ode.sampling.StepInterpolator doCopy();

	public void shift() {
		previousTime = currentTime;
	}

	public void storeTime(final double t) {
		currentTime = t;
		h = (currentTime) - (previousTime);
		interpolatedTime = t;
		java.lang.System.arraycopy(currentState, 0, interpolatedState, 0, currentState.length);
		finalized = false;
	}

	public double getPreviousTime() {
		return previousTime;
	}

	public double getCurrentTime() {
		return currentTime;
	}

	public double getInterpolatedTime() {
		return interpolatedTime;
	}

	public void setInterpolatedTime(final double time) throws org.apache.commons.math.ode.DerivativeException {
		interpolatedTime = time;
		final double oneMinusThetaH = (currentTime) - (interpolatedTime);
		final double theta = (h) == 0 ? 0 : ((h) - oneMinusThetaH) / (h);
		computeInterpolatedState(theta, oneMinusThetaH);
	}

	public boolean isForward() {
		return forward;
	}

	protected abstract void computeInterpolatedState(double theta, double oneMinusThetaH) throws org.apache.commons.math.ode.DerivativeException;

	public double[] getInterpolatedState() {
		return interpolatedState;
	}

	public double[] getInterpolatedDerivatives() {
		return interpolatedDerivatives;
	}

	public final void finalizeStep() throws org.apache.commons.math.ode.DerivativeException {
		if (!(finalized)) {
			doFinalize();
			finalized = true;
		}
	}

	protected void doFinalize() throws org.apache.commons.math.ode.DerivativeException {
	}

	public abstract void writeExternal(java.io.ObjectOutput out) throws java.io.IOException;

	public abstract void readExternal(java.io.ObjectInput in) throws java.io.IOException;

	protected void writeBaseExternal(final java.io.ObjectOutput out) throws java.io.IOException {
		if ((currentState) == null) {
			out.writeInt((-1));
		}else {
			out.writeInt(currentState.length);
		}
		out.writeDouble(previousTime);
		out.writeDouble(currentTime);
		out.writeDouble(h);
		out.writeBoolean(forward);
		if ((currentState) != null) {
			for (int i = 0; i < (currentState.length); ++i) {
				out.writeDouble(currentState[i]);
			}
		}
		out.writeDouble(interpolatedTime);
		try {
			finalizeStep();
		} catch (org.apache.commons.math.ode.DerivativeException e) {
			throw org.apache.commons.math.MathRuntimeException.createIOException(e);
		}
	}

	protected double readBaseExternal(final java.io.ObjectInput in) throws java.io.IOException {
		final int dimension = in.readInt();
		previousTime = in.readDouble();
		currentTime = in.readDouble();
		h = in.readDouble();
		forward = in.readBoolean();
		if (dimension < 0) {
			currentState = null;
		}else {
			currentState = new double[dimension];
			for (int i = 0; i < (currentState.length); ++i) {
				currentState[i] = in.readDouble();
			}
		}
		interpolatedTime = java.lang.Double.NaN;
		interpolatedState = (dimension < 0) ? null : new double[dimension];
		interpolatedDerivatives = (dimension < 0) ? null : new double[dimension];
		finalized = true;
		return in.readDouble();
	}
}

