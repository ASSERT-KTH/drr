

package org.apache.commons.math.ode;


public class DummyStepInterpolator extends org.apache.commons.math.ode.AbstractStepInterpolator {
	public DummyStepInterpolator() {
		super();
	}

	protected DummyStepInterpolator(double[] y, boolean forward) {
		super(y, forward);
	}

	public DummyStepInterpolator(org.apache.commons.math.ode.DummyStepInterpolator interpolator) {
		super(interpolator);
	}

	protected org.apache.commons.math.ode.StepInterpolator doCopy() {
		return new org.apache.commons.math.ode.DummyStepInterpolator(org.apache.commons.math.ode.DummyStepInterpolator.this);
	}

	protected void computeInterpolatedState(double theta, double oneMinusThetaH) throws org.apache.commons.math.ode.DerivativeException {
		java.lang.System.arraycopy(currentState, 0, interpolatedState, 0, currentState.length);
	}

	public void writeExternal(java.io.ObjectOutput out) throws java.io.IOException {
		writeBaseExternal(out);
	}

	public void readExternal(java.io.ObjectInput in) throws java.io.IOException {
		double t = readBaseExternal(in);
		try {
			setInterpolatedTime(t);
		} catch (org.apache.commons.math.ode.DerivativeException e) {
			throw new java.io.IOException(e.getMessage());
		}
	}

	private static final long serialVersionUID = 1708010296707839488L;
}

