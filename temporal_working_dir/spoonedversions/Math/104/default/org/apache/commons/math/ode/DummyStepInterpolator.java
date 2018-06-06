

package org.apache.commons.math.ode;


public class DummyStepInterpolator extends org.apache.commons.math.ode.AbstractStepInterpolator {
	public DummyStepInterpolator() {
		super();
	}

	protected DummyStepInterpolator(double[] y, boolean forward) {
		super(y, forward);
	}

	protected DummyStepInterpolator(org.apache.commons.math.ode.DummyStepInterpolator interpolator) {
		super(interpolator);
	}

	protected void computeInterpolatedState(double theta, double oneMinusThetaH) throws org.apache.commons.math.ode.DerivativeException {
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

