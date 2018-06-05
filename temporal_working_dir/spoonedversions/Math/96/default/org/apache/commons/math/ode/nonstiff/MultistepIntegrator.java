

package org.apache.commons.math.ode.nonstiff;


public abstract class MultistepIntegrator extends org.apache.commons.math.ode.AbstractIntegrator {
	private org.apache.commons.math.ode.FirstOrderIntegrator starter;

	protected double[] previousT;

	protected double[][] previousF;

	private double resetTime;

	protected org.apache.commons.math.ode.nonstiff.MultistepStepInterpolator prototype;

	protected MultistepIntegrator(final java.lang.String name, final int k, final org.apache.commons.math.ode.nonstiff.MultistepStepInterpolator prototype) {
		super(name);
		starter = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator(1.0E-6, 1000000.0, 1.0E-5, 1.0E-6);
		previousT = new double[k];
		previousF = new double[k][];
		org.apache.commons.math.ode.nonstiff.MultistepIntegrator.this.prototype = prototype;
	}

	public org.apache.commons.math.ode.ODEIntegrator getStarterIntegrator() {
		return starter;
	}

	public void setStarterIntegrator(org.apache.commons.math.ode.FirstOrderIntegrator starter) {
		org.apache.commons.math.ode.nonstiff.MultistepIntegrator.this.starter = starter;
	}

	protected double start(final int n, final double h, final org.apache.commons.math.ode.events.CombinedEventsManager manager, final org.apache.commons.math.ode.FirstOrderDifferentialEquations equations, final double t0, final double[] y) throws org.apache.commons.math.ode.DerivativeException, org.apache.commons.math.ode.IntegratorException {
		java.util.Arrays.fill(previousT, java.lang.Double.NaN);
		java.util.Arrays.fill(previousF, null);
		starter.clearEventHandlers();
		for (org.apache.commons.math.ode.events.EventState state : manager.getEventsStates()) {
			starter.addEventHandler(new org.apache.commons.math.ode.nonstiff.MultistepIntegrator.ResetCheckingWrapper(state.getEventHandler()), state.getMaxCheckInterval(), state.getConvergence(), state.getMaxIterationCount());
		}
		starter.clearStepHandlers();
		for (final org.apache.commons.math.ode.sampling.StepHandler handler : stepHandlers) {
			starter.addStepHandler(new org.apache.commons.math.ode.nonstiff.MultistepIntegrator.FilteringWrapper(handler));
		}
		final org.apache.commons.math.ode.nonstiff.MultistepIntegrator.StoringStepHandler store = new org.apache.commons.math.ode.nonstiff.MultistepIntegrator.StoringStepHandler(n);
		starter.addStepHandler(new org.apache.commons.math.ode.sampling.StepNormalizer(h, store));
		double t = t0;
		double stopTime = java.lang.Double.NaN;
		do {
			resetTime = java.lang.Double.NaN;
			store.restart();
			stopTime = starter.integrate(equations, t, y, (t + ((n - 0.9999) * h)), y);
			if (!(java.lang.Double.isNaN(resetTime))) {
				t = resetTime;
			}
		} while (!(java.lang.Double.isNaN(resetTime)) );
		starter.clearEventHandlers();
		starter.clearStepHandlers();
		if ((store.getFinalState()) != null) {
			java.lang.System.arraycopy(store.getFinalState(), 0, y, 0, y.length);
		}
		return stopTime;
	}

	protected void rotatePreviousSteps() {
		final double[] rolled = previousF[((previousT.length) - 1)];
		for (int k = (previousF.length) - 1; k > 0; --k) {
			previousT[k] = previousT[(k - 1)];
			previousF[k] = previousF[(k - 1)];
		}
		previousF[0] = rolled;
	}

	private class ResetCheckingWrapper implements org.apache.commons.math.ode.events.EventHandler {
		private static final long serialVersionUID = 4922660285376467937L;

		private final org.apache.commons.math.ode.events.EventHandler handler;

		public ResetCheckingWrapper(final org.apache.commons.math.ode.events.EventHandler handler) {
			this.handler = handler;
		}

		public int eventOccurred(double t, double[] y) throws org.apache.commons.math.ode.events.EventException {
			final int action = handler.eventOccurred(t, y);
			if ((action == (org.apache.commons.math.ode.events.EventHandler.RESET_DERIVATIVES)) || (action == (org.apache.commons.math.ode.events.EventHandler.RESET_STATE))) {
				resetTime = t;
				return org.apache.commons.math.ode.events.EventHandler.STOP;
			}
			return action;
		}

		public double g(double t, double[] y) throws org.apache.commons.math.ode.events.EventException {
			return handler.g(t, y);
		}

		public void resetState(double t, double[] y) throws org.apache.commons.math.ode.events.EventException {
			handler.resetState(t, y);
		}
	}

	private class FilteringWrapper implements org.apache.commons.math.ode.sampling.StepHandler {
		private static final long serialVersionUID = 4607975253344802232L;

		private final org.apache.commons.math.ode.sampling.StepHandler handler;

		public FilteringWrapper(final org.apache.commons.math.ode.sampling.StepHandler handler) {
			this.handler = handler;
		}

		public void handleStep(org.apache.commons.math.ode.sampling.StepInterpolator interpolator, boolean isLast) throws org.apache.commons.math.ode.DerivativeException {
			handler.handleStep(interpolator, eventsHandlersManager.stop());
		}

		public boolean requiresDenseOutput() {
			return handler.requiresDenseOutput();
		}

		public void reset() {
			handler.reset();
		}
	}

	private class StoringStepHandler implements org.apache.commons.math.ode.sampling.FixedStepHandler {
		private static final long serialVersionUID = 4592974435520688797L;

		private final int n;

		private int count;

		private double[] finalState;

		public StoringStepHandler(final int n) {
			this.n = n;
			restart();
		}

		public void restart() {
			count = 0;
			finalState = null;
		}

		public double[] getFinalState() {
			return finalState;
		}

		public void handleStep(final double t, final double[] y, final double[] yDot, final boolean isLast) {
			if (((count)++) < (n)) {
				previousT[((n) - (count))] = t;
				previousF[((n) - (count))] = yDot.clone();
				if ((count) == (n)) {
					finalState = y.clone();
				}
			}
		}
	}
}

