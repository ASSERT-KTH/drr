

package org.apache.commons.math3.ode.sampling;


public abstract class AbstractStepInterpolator implements org.apache.commons.math3.ode.sampling.StepInterpolator {
	protected double h;

	protected double[] currentState;

	protected double interpolatedTime;

	protected double[] interpolatedState;

	protected double[] interpolatedDerivatives;

	protected double[] interpolatedPrimaryState;

	protected double[] interpolatedPrimaryDerivatives;

	protected double[][] interpolatedSecondaryState;

	protected double[][] interpolatedSecondaryDerivatives;

	private double globalPreviousTime;

	private double globalCurrentTime;

	private double softPreviousTime;

	private double softCurrentTime;

	private boolean finalized;

	private boolean forward;

	private boolean dirtyState;

	private org.apache.commons.math3.ode.EquationsMapper primaryMapper;

	private org.apache.commons.math3.ode.EquationsMapper[] secondaryMappers;

	protected AbstractStepInterpolator() {
		globalPreviousTime = java.lang.Double.NaN;
		globalCurrentTime = java.lang.Double.NaN;
		softPreviousTime = java.lang.Double.NaN;
		softCurrentTime = java.lang.Double.NaN;
		h = java.lang.Double.NaN;
		interpolatedTime = java.lang.Double.NaN;
		currentState = null;
		finalized = false;
		org.apache.commons.math3.ode.sampling.AbstractStepInterpolator.this.forward = true;
		org.apache.commons.math3.ode.sampling.AbstractStepInterpolator.this.dirtyState = true;
		primaryMapper = null;
		secondaryMappers = null;
		allocateInterpolatedArrays((-1));
	}

	protected AbstractStepInterpolator(final double[] y, final boolean forward, final org.apache.commons.math3.ode.EquationsMapper primaryMapper, final org.apache.commons.math3.ode.EquationsMapper[] secondaryMappers) {
		globalPreviousTime = java.lang.Double.NaN;
		globalCurrentTime = java.lang.Double.NaN;
		softPreviousTime = java.lang.Double.NaN;
		softCurrentTime = java.lang.Double.NaN;
		h = java.lang.Double.NaN;
		interpolatedTime = java.lang.Double.NaN;
		currentState = y;
		finalized = false;
		org.apache.commons.math3.ode.sampling.AbstractStepInterpolator.this.forward = forward;
		org.apache.commons.math3.ode.sampling.AbstractStepInterpolator.this.dirtyState = true;
		org.apache.commons.math3.ode.sampling.AbstractStepInterpolator.this.primaryMapper = primaryMapper;
		org.apache.commons.math3.ode.sampling.AbstractStepInterpolator.this.secondaryMappers = (secondaryMappers == null) ? null : secondaryMappers.clone();
		allocateInterpolatedArrays(y.length);
	}

	protected AbstractStepInterpolator(final org.apache.commons.math3.ode.sampling.AbstractStepInterpolator interpolator) {
		globalPreviousTime = interpolator.globalPreviousTime;
		globalCurrentTime = interpolator.globalCurrentTime;
		softPreviousTime = interpolator.softPreviousTime;
		softCurrentTime = interpolator.softCurrentTime;
		h = interpolator.h;
		interpolatedTime = interpolator.interpolatedTime;
		if ((interpolator.currentState) == null) {
			currentState = null;
			primaryMapper = null;
			secondaryMappers = null;
			allocateInterpolatedArrays((-1));
		}else {
			currentState = interpolator.currentState.clone();
			interpolatedState = interpolator.interpolatedState.clone();
			interpolatedDerivatives = interpolator.interpolatedDerivatives.clone();
			interpolatedPrimaryState = interpolator.interpolatedPrimaryState.clone();
			interpolatedPrimaryDerivatives = interpolator.interpolatedPrimaryDerivatives.clone();
			interpolatedSecondaryState = new double[interpolator.interpolatedSecondaryState.length][];
			interpolatedSecondaryDerivatives = new double[interpolator.interpolatedSecondaryDerivatives.length][];
			for (int i = 0; i < (interpolatedSecondaryState.length); ++i) {
				interpolatedSecondaryState[i] = interpolator.interpolatedSecondaryState[i].clone();
				interpolatedSecondaryDerivatives[i] = interpolator.interpolatedSecondaryDerivatives[i].clone();
			}
		}
		finalized = interpolator.finalized;
		forward = interpolator.forward;
		dirtyState = interpolator.dirtyState;
		primaryMapper = interpolator.primaryMapper;
		secondaryMappers = ((interpolator.secondaryMappers) == null) ? null : interpolator.secondaryMappers.clone();
	}

	private void allocateInterpolatedArrays(final int dimension) {
		if (dimension < 0) {
			interpolatedState = null;
			interpolatedDerivatives = null;
			interpolatedPrimaryState = null;
			interpolatedPrimaryDerivatives = null;
			interpolatedSecondaryState = null;
			interpolatedSecondaryDerivatives = null;
		}else {
			interpolatedState = new double[dimension];
			interpolatedDerivatives = new double[dimension];
			interpolatedPrimaryState = new double[primaryMapper.getDimension()];
			interpolatedPrimaryDerivatives = new double[primaryMapper.getDimension()];
			if ((secondaryMappers) == null) {
				interpolatedSecondaryState = null;
				interpolatedSecondaryDerivatives = null;
			}else {
				interpolatedSecondaryState = new double[secondaryMappers.length][];
				interpolatedSecondaryDerivatives = new double[secondaryMappers.length][];
				for (int i = 0; i < (secondaryMappers.length); ++i) {
					interpolatedSecondaryState[i] = new double[secondaryMappers[i].getDimension()];
					interpolatedSecondaryDerivatives[i] = new double[secondaryMappers[i].getDimension()];
				}
			}
		}
	}

	protected void reinitialize(final double[] y, final boolean isForward, final org.apache.commons.math3.ode.EquationsMapper primary, final org.apache.commons.math3.ode.EquationsMapper[] secondary) {
		globalPreviousTime = java.lang.Double.NaN;
		globalCurrentTime = java.lang.Double.NaN;
		softPreviousTime = java.lang.Double.NaN;
		softCurrentTime = java.lang.Double.NaN;
		h = java.lang.Double.NaN;
		interpolatedTime = java.lang.Double.NaN;
		currentState = y;
		finalized = false;
		org.apache.commons.math3.ode.sampling.AbstractStepInterpolator.this.forward = isForward;
		org.apache.commons.math3.ode.sampling.AbstractStepInterpolator.this.dirtyState = true;
		org.apache.commons.math3.ode.sampling.AbstractStepInterpolator.this.primaryMapper = primary;
		org.apache.commons.math3.ode.sampling.AbstractStepInterpolator.this.secondaryMappers = secondary.clone();
		allocateInterpolatedArrays(y.length);
	}

	public org.apache.commons.math3.ode.sampling.StepInterpolator copy() {
		finalizeStep();
		return doCopy();
	}

	protected abstract org.apache.commons.math3.ode.sampling.StepInterpolator doCopy();

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
		org.apache.commons.math3.ode.sampling.AbstractStepInterpolator.this.softPreviousTime = softPreviousTime;
	}

	public void setSoftCurrentTime(final double softCurrentTime) {
		org.apache.commons.math3.ode.sampling.AbstractStepInterpolator.this.softCurrentTime = softCurrentTime;
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

	protected abstract void computeInterpolatedStateAndDerivatives(double theta, double oneMinusThetaH);

	private void evaluateCompleteInterpolatedState() {
		if (dirtyState) {
			final double oneMinusThetaH = (globalCurrentTime) - (interpolatedTime);
			final double theta = (h) == 0 ? 0 : ((h) - oneMinusThetaH) / (h);
			computeInterpolatedStateAndDerivatives(theta, oneMinusThetaH);
			dirtyState = false;
		}
	}

	public double[] getInterpolatedState() {
		evaluateCompleteInterpolatedState();
		primaryMapper.extractEquationData(interpolatedState, interpolatedPrimaryState);
		return interpolatedPrimaryState;
	}

	public double[] getInterpolatedDerivatives() {
		evaluateCompleteInterpolatedState();
		primaryMapper.extractEquationData(interpolatedDerivatives, interpolatedPrimaryDerivatives);
		return interpolatedPrimaryDerivatives;
	}

	public double[] getInterpolatedSecondaryState(final int index) {
		evaluateCompleteInterpolatedState();
		secondaryMappers[index].extractEquationData(interpolatedState, interpolatedSecondaryState[index]);
		return interpolatedSecondaryState[index];
	}

	public double[] getInterpolatedSecondaryDerivatives(final int index) {
		evaluateCompleteInterpolatedState();
		secondaryMappers[index].extractEquationData(interpolatedDerivatives, interpolatedSecondaryDerivatives[index]);
		return interpolatedSecondaryDerivatives[index];
	}

	public final void finalizeStep() {
		if (!(finalized)) {
			doFinalize();
			finalized = true;
		}
	}

	protected void doFinalize() {
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
		out.writeObject(primaryMapper);
		out.write(secondaryMappers.length);
		for (final org.apache.commons.math3.ode.EquationsMapper mapper : secondaryMappers) {
			out.writeObject(mapper);
		}
		if ((currentState) != null) {
			for (int i = 0; i < (currentState.length); ++i) {
				out.writeDouble(currentState[i]);
			}
		}
		out.writeDouble(interpolatedTime);
		finalizeStep();
	}

	protected double readBaseExternal(final java.io.ObjectInput in) throws java.io.IOException, java.lang.ClassNotFoundException {
		final int dimension = in.readInt();
		globalPreviousTime = in.readDouble();
		globalCurrentTime = in.readDouble();
		softPreviousTime = in.readDouble();
		softCurrentTime = in.readDouble();
		h = in.readDouble();
		forward = in.readBoolean();
		primaryMapper = ((org.apache.commons.math3.ode.EquationsMapper) (in.readObject()));
		secondaryMappers = new org.apache.commons.math3.ode.EquationsMapper[in.read()];
		for (int i = 0; i < (secondaryMappers.length); ++i) {
			secondaryMappers[i] = ((org.apache.commons.math3.ode.EquationsMapper) (in.readObject()));
		}
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
		allocateInterpolatedArrays(dimension);
		finalized = true;
		return in.readDouble();
	}
}

