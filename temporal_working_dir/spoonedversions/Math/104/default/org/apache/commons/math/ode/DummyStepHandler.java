

package org.apache.commons.math.ode;


public class DummyStepHandler implements org.apache.commons.math.ode.StepHandler {
	private DummyStepHandler() {
	}

	public static org.apache.commons.math.ode.DummyStepHandler getInstance() {
		if ((org.apache.commons.math.ode.DummyStepHandler.instance) == null) {
			org.apache.commons.math.ode.DummyStepHandler.instance = new org.apache.commons.math.ode.DummyStepHandler();
		}
		return org.apache.commons.math.ode.DummyStepHandler.instance;
	}

	public boolean requiresDenseOutput() {
		return false;
	}

	public void reset() {
	}

	public void handleStep(org.apache.commons.math.ode.StepInterpolator interpolator, boolean isLast) {
	}

	private static org.apache.commons.math.ode.DummyStepHandler instance = null;
}

