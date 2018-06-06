

package org.apache.commons.math.ode.sampling;


public class DummyStepHandler implements java.io.Serializable , org.apache.commons.math.ode.sampling.StepHandler {
	private DummyStepHandler() {
	}

	public static org.apache.commons.math.ode.sampling.DummyStepHandler getInstance() {
		return org.apache.commons.math.ode.sampling.DummyStepHandler.instance;
	}

	public boolean requiresDenseOutput() {
		return false;
	}

	public void reset() {
	}

	public void handleStep(final org.apache.commons.math.ode.sampling.StepInterpolator interpolator, final boolean isLast) {
	}

	private static org.apache.commons.math.ode.sampling.DummyStepHandler instance = new org.apache.commons.math.ode.sampling.DummyStepHandler();

	private static final long serialVersionUID = 2731635121223090252L;
}

