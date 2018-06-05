

package org.apache.commons.math.ode;


public abstract class AbstractStepInterpolator implements org.apache.commons.math.ode.StepInterpolator {
	protected double previousTime;

	protected double currentTime;

	protected double h;

	protected double[] currentState;

	protected double interpolatedTime;

	protected double[] interpolatedState;

	private boolean finalized;

	private boolean forward;

	protected AbstractStepInterpolator() {
		previousTime = java.lang.Double.NaN;
		currentTime = java.lang.Double.NaN;
		h = java.lang.Double.NaN;
		interpolatedTime = java.lang.Double.NaN;
		currentState = null;
		interpolatedState = null;
		finalized = false;
		org.apache.commons.math.ode.AbstractStepInterpolator.this.forward = true;
	}

	protected AbstractStepInterpolator(double[] y, boolean forward) {
		previousTime = java.lang.Double.NaN;
		currentTime = java.lang.Double.NaN;
		h = java.lang.Double.NaN;
		interpolatedTime = java.lang.Double.NaN;
		currentState = y;
		interpolatedState = new double[y.length];
		finalized = false;
		org.apache.commons.math.ode.AbstractStepInterpolator.this.forward = forward;
	}

	protected AbstractStepInterpolator(org.apache.commons.math.ode.AbstractStepInterpolator interpolator) {
		previousTime = interpolator.previousTime;
		currentTime = interpolator.currentTime;
		h = interpolator.h;
		interpolatedTime = interpolator.interpolatedTime;
		if ((interpolator.currentState) != null) {
			currentState = ((double[]) (interpolator.currentState.clone()));
			interpolatedState = ((double[]) (interpolator.interpolatedState.clone()));
		}else {
			currentState = null;
			interpolatedState = null;
		}
		finalized = interpolator.finalized;
		forward = interpolator.forward;
	}

	protected void reinitialize(double[] y, boolean forward) {
		previousTime = java.lang.Double.NaN;
		currentTime = java.lang.Double.NaN;
		h = java.lang.Double.NaN;
		interpolatedTime = java.lang.Double.NaN;
		currentState = y;
		interpolatedState = new double[y.length];
		finalized = false;
		org.apache.commons.math.ode.AbstractStepInterpolator.this.forward = forward;
	}

	public org.apache.commons.math.ode.StepInterpolator copy() throws org.apache.commons.math.ode.DerivativeException {
		finalizeStep();
		return doCopy();
	}

	protected abstract org.apache.commons.math.ode.StepInterpolator doCopy();

	public void shift() {
		previousTime = currentTime;
	}

	public void storeTime(double t) {
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

	public void setInterpolatedTime(double time) throws org.apache.commons.math.ode.DerivativeException {
		interpolatedTime = time;
		double oneMinusThetaH = (currentTime) - (interpolatedTime);
		computeInterpolatedState((((h) - oneMinusThetaH) / (h)), oneMinusThetaH);
	}

	public boolean isForward() {
		return forward;
	}

	protected abstract void computeInterpolatedState(double theta, double oneMinusThetaH) throws org.apache.commons.math.ode.DerivativeException;

	public double[] getInterpolatedState() {
		return ((double[]) (interpolatedState.clone()));
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

	protected void writeBaseExternal(java.io.ObjectOutput out) throws java.io.IOException {
		out.writeInt(currentState.length);
		out.writeDouble(previousTime);
		out.writeDouble(currentTime);
		out.writeDouble(h);
		out.writeBoolean(forward);
		for (int i = 0; i < (currentState.length); ++i) {
			out.writeDouble(currentState[i]);
		}
		out.writeDouble(interpolatedTime);
		try {
			finalizeStep();
		} catch (org.apache.commons.math.ode.DerivativeException e) {
			throw new java.io.IOException(e.getMessage());
		}
	}

	protected double readBaseExternal(java.io.ObjectInput in) throws java.io.IOException {
		int dimension = in.readInt();
		previousTime = in.readDouble();
		currentTime = in.readDouble();
		h = in.readDouble();
		forward = in.readBoolean();
		currentState = new double[dimension];
		for (int i = 0; i < (currentState.length); ++i) {
			currentState[i] = in.readDouble();
		}
		interpolatedTime = java.lang.Double.NaN;
		interpolatedState = new double[dimension];
		finalized = true;
		return in.readDouble();
	}
}

