

package org.apache.commons.math3.ode.sampling;


public class DummyStepHandler implements org.apache.commons.math3.ode.sampling.StepHandler {
	private DummyStepHandler() {
	}

	public static org.apache.commons.math3.ode.sampling.DummyStepHandler getInstance() {
		return org.apache.commons.math3.ode.sampling.DummyStepHandler.LazyHolder.INSTANCE;
	}

	public void init(double t0, double[] y0, double t) {
	}

	public void handleStep(final org.apache.commons.math3.ode.sampling.StepInterpolator interpolator, final boolean isLast) {
	}

	private static class LazyHolder {
		private static final org.apache.commons.math3.ode.sampling.DummyStepHandler INSTANCE = new org.apache.commons.math3.ode.sampling.DummyStepHandler();
	}

	private java.lang.Object readResolve() {
		return org.apache.commons.math3.ode.sampling.DummyStepHandler.LazyHolder.INSTANCE;
	}
}

