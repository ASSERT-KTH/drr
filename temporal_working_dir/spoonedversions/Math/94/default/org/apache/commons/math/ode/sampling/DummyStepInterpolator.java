

package org.apache.commons.math.ode.sampling;


public class DummyStepInterpolator extends org.apache.commons.math.ode.sampling.AbstractStepInterpolator {
	public DummyStepInterpolator() {
		super();
	}

	public DummyStepInterpolator(final double[] y, final boolean forward) {
		super(y, forward);
	}

	public DummyStepInterpolator(final org.apache.commons.math.ode.sampling.DummyStepInterpolator interpolator) {
		super(interpolator);
	}

	protected org.apache.commons.math.ode.sampling.StepInterpolator doCopy() {
		return new org.apache.commons.math.ode.sampling.DummyStepInterpolator(org.apache.commons.math.ode.sampling.DummyStepInterpolator.this);
	}

	protected void computeInterpolatedState(final double theta, final double oneMinusThetaH) throws org.apache.commons.math.ode.DerivativeException {
		java.lang.System.arraycopy(currentState, 0, interpolatedState, 0, currentState.length);
	}

	public void writeExternal(final java.io.ObjectOutput out) throws java.io.IOException {
		writeBaseExternal(out);
	}

	public void readExternal(final java.io.ObjectInput in) throws java.io.IOException {
		final double t = readBaseExternal(in);
		try {
			setInterpolatedTime(t);
		} catch (org.apache.commons.math.ode.DerivativeException e) {
			throw org.apache.commons.math.MathRuntimeException.createIOException(e);
		}
	}

	private static final long serialVersionUID = 1708010296707839488L;
}

