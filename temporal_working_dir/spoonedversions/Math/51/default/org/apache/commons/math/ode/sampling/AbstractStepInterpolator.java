

package org.apache.commons.math.ode.sampling;


public abstract class AbstractStepInterpolator implements org.apache.commons.math.ode.sampling.StepInterpolator {
	protected double h;

	protected double[] currentState;

	protected double interpolatedTime;

	protected double[] interpolatedState;

	protected double[] interpolatedDerivatives;

	private double globalPreviousTime;

	private double globalCurrentTime;

	private double softPreviousTime;

	private double softCurrentTime;

	private boolean finalized;

	private boolean forward;

	private boolean dirtyState;

	protected AbstractStepInterpolator() {
		globalPreviousTime = java.lang.Double.NaN;
		globalCurrentTime = java.lang.Double.NaN;
		softPreviousTime = java.lang.Double.NaN;
		softCurrentTime = java.lang.Double.NaN;
		h = java.lang.Double.NaN;
		interpolatedTime = java.lang.Double.NaN;
		currentState = null;
		interpolatedState = null;
		interpolatedDerivatives = null;
		finalized = false;
		org.apache.commons.math.ode.sampling.AbstractStepInterpolator.this.forward = true;
		org.apache.commons.math.ode.sampling.AbstractStepInterpolator.this.dirtyState = true;
	}

	protected AbstractStepInterpolator(final double[] y, final boolean forward) {
		globalPreviousTime = java.lang.Double.NaN;
		globalCurrentTime = java.lang.Double.NaN;
		softPreviousTime = java.lang.Double.NaN;
		softCurrentTime = java.lang.Double.NaN;
		h = java.lang.Double.NaN;
		interpolatedTime = java.lang.Double.NaN;
		currentState = y;
		interpolatedState = new double[y.length];
		interpolatedDerivatives = new double[y.length];
		finalized = false;
		org.apache.commons.math.ode.sampling.AbstractStepInterpolator.this.forward = forward;
		org.apache.commons.math.ode.sampling.AbstractStepInterpolator.this.dirtyState = true;
	}

	protected AbstractStepInterpolator(final org.apache.commons.math.ode.sampling.AbstractStepInterpolator interpolator) {
		globalPreviousTime = interpolator.globalPreviousTime;
		globalCurrentTime = interpolator.globalCurrentTime;
		softPreviousTime = interpolator.softPreviousTime;
		softCurrentTime = interpolator.softCurrentTime;
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
		dirtyState = interpolator.dirtyState;
	}

	protected void reinitialize(final double[] y, final boolean isForward) {
		globalPreviousTime = java.lang.Double.NaN;
		globalCurrentTime = java.lang.Double.NaN;
		softPreviousTime = java.lang.Double.NaN;
		softCurrentTime = java.lang.Double.NaN;
		h = java.lang.Double.NaN;
		interpolatedTime = java.lang.Double.NaN;
		currentState = y;
		interpolatedState = new double[y.length];
		interpolatedDerivatives = new double[y.length];
		finalized = false;
		org.apache.commons.math.ode.sampling.AbstractStepInterpolator.this.forward = isForward;
		org.apache.commons.math.ode.sampling.AbstractStepInterpolator.this.dirtyState = true;
	}

	public org.apache.commons.math.ode.sampling.StepInterpolator copy() throws org.apache.commons.math.exception.MathUserException {
		finalizeStep();
		return doCopy();
	}

	protected abstract org.apache.commons.math.ode.sampling.StepInterpolator doCopy();

	public void shift() {
		globalPreviousTime = globalCurrentTime;
		softPreviousTime = globalPreviousTime;
		softCurrentTime = globalCurrentTime;
	}

	public void storeTime(final double t) {
		globalCurrentTime = t;
		softCurrentTime = globalCurrentTime;
		h = (globalCurrentTime) - (globalPreviousTime);
		setInterpolatedTime(t);
		finalized = false;
	}

	public void setSoftPreviousTime(final double softPreviousTime) {
		org.apache.commons.math.ode.sampling.AbstractStepInterpolator.this.softPreviousTime = softPreviousTime;
	}

	public void setSoftCurrentTime(final double softCurrentTime) {
		org.apache.commons.math.ode.sampling.AbstractStepInterpolator.this.softCurrentTime = softCurrentTime;
	}

	public double getGlobalPreviousTime() {
		return globalPreviousTime;
	}

	public double getGlobalCurrentTime() {
		return globalCurrentTime;
	}

	public double getPreviousTime() {
		return softPreviousTime;
	}

	public double getCurrentTime() {
		return softCurrentTime;
	}

	public double getInterpolatedTime() {
		return interpolatedTime;
	}

	public void setInterpolatedTime(final double time) {
		interpolatedTime = time;
		dirtyState = true;
	}

	public boolean isForward() {
		return forward;
	}

	protected abstract void computeInterpolatedStateAndDerivatives(double theta, double oneMinusThetaH) throws org.apache.commons.math.exception.MathUserException;

	public double[] getInterpolatedState() throws org.apache.commons.math.exception.MathUserException {
		if (dirtyState) {
			final double oneMinusThetaH = (globalCurrentTime) - (interpolatedTime);
			final double theta = (h) == 0 ? 0 : ((h) - oneMinusThetaH) / (h);
			computeInterpolatedStateAndDerivatives(theta, oneMinusThetaH);
			dirtyState = false;
		}
		return interpolatedState;
	}

	public double[] getInterpolatedDerivatives() throws org.apache.commons.math.exception.MathUserException {
		if (dirtyState) {
			final double oneMinusThetaH = (globalCurrentTime) - (interpolatedTime);
			final double theta = (h) == 0 ? 0 : ((h) - oneMinusThetaH) / (h);
			computeInterpolatedStateAndDerivatives(theta, oneMinusThetaH);
			dirtyState = false;
		}
		return interpolatedDerivatives;
	}

	public final void finalizeStep() throws org.apache.commons.math.exception.MathUserException {
		if (!(finalized)) {
			doFinalize();
			finalized = true;
		}
	}

	protected void doFinalize() throws org.apache.commons.math.exception.MathUserException {
	}

	public abstract void writeExternal(java.io.ObjectOutput out) throws java.io.IOException;

	public abstract void readExternal(java.io.ObjectInput in) throws java.io.IOException, java.lang.ClassNotFoundException;

	protected void writeBaseExternal(final java.io.ObjectOutput out) throws java.io.IOException {
		if ((currentState) == null) {
			out.writeInt((-1));
		}else {
			out.writeInt(currentState.length);
		}
		out.writeDouble(globalPreviousTime);
		out.writeDouble(globalCurrentTime);
		out.writeDouble(softPreviousTime);
		out.writeDouble(softCurrentTime);
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
		} catch (org.apache.commons.math.exception.MathUserException e) {
			java.io.IOException ioe = new java.io.IOException(e.getLocalizedMessage());
			ioe.initCause(e);
			throw ioe;
		}
	}

	protected double readBaseExternal(final java.io.ObjectInput in) throws java.io.IOException {
		final int dimension = in.readInt();
		globalPreviousTime = in.readDouble();
		globalCurrentTime = in.readDouble();
		softPreviousTime = in.readDouble();
		softCurrentTime = in.readDouble();
		h = in.readDouble();
		forward = in.readBoolean();
		dirtyState = true;
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

