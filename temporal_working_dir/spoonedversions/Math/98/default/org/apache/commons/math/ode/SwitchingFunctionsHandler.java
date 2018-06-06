

package org.apache.commons.math.ode;


public class SwitchingFunctionsHandler {
	public SwitchingFunctionsHandler() {
		functions = new java.util.ArrayList<org.apache.commons.math.ode.SwitchState>();
		first = null;
		initialized = false;
	}

	public void addSwitchingFunction(org.apache.commons.math.ode.SwitchingFunction function, double maxCheckInterval, double convergence, int maxIterationCount) {
		functions.add(new org.apache.commons.math.ode.SwitchState(function, maxCheckInterval, convergence, maxIterationCount));
	}

	public java.util.Collection<org.apache.commons.math.ode.SwitchState> getSwitchingFunctions() {
		return java.util.Collections.unmodifiableCollection(functions);
	}

	public void clearSwitchingFunctions() {
		functions.clear();
	}

	public boolean isEmpty() {
		return functions.isEmpty();
	}

	public boolean evaluateStep(org.apache.commons.math.ode.StepInterpolator interpolator) throws org.apache.commons.math.ode.DerivativeException, org.apache.commons.math.ode.IntegratorException {
		try {
			first = null;
			if (functions.isEmpty()) {
				return false;
			}
			if (!(initialized)) {
				double t0 = interpolator.getPreviousTime();
				interpolator.setInterpolatedTime(t0);
				double[] y = interpolator.getInterpolatedState();
				for (org.apache.commons.math.ode.SwitchState state : functions) {
					state.reinitializeBegin(t0, y);
				}
				initialized = true;
			}
			for (org.apache.commons.math.ode.SwitchState state : functions) {
				if (state.evaluateStep(interpolator)) {
					if ((first) == null) {
						first = state;
					}else {
						if (interpolator.isForward()) {
							if ((state.getEventTime()) < (first.getEventTime())) {
								first = state;
							}
						}else {
							if ((state.getEventTime()) > (first.getEventTime())) {
								first = state;
							}
						}
					}
				}
			}
			return (first) != null;
		} catch (org.apache.commons.math.ode.SwitchException se) {
			throw new org.apache.commons.math.ode.IntegratorException(se);
		} catch (org.apache.commons.math.ConvergenceException ce) {
			throw new org.apache.commons.math.ode.IntegratorException(ce);
		}
	}

	public double getEventTime() {
		return (first) == null ? java.lang.Double.NaN : first.getEventTime();
	}

	public void stepAccepted(double t, double[] y) throws org.apache.commons.math.ode.IntegratorException {
		try {
			for (org.apache.commons.math.ode.SwitchState state : functions) {
				state.stepAccepted(t, y);
			}
		} catch (org.apache.commons.math.ode.SwitchException se) {
			throw new org.apache.commons.math.ode.IntegratorException(se);
		}
	}

	public boolean stop() {
		for (org.apache.commons.math.ode.SwitchState state : functions) {
			if (state.stop()) {
				return true;
			}
		}
		return false;
	}

	public boolean reset(double t, double[] y) throws org.apache.commons.math.ode.IntegratorException {
		try {
			boolean resetDerivatives = false;
			for (org.apache.commons.math.ode.SwitchState state : functions) {
				if (state.reset(t, y)) {
					resetDerivatives = true;
				}
			}
			return resetDerivatives;
		} catch (org.apache.commons.math.ode.SwitchException se) {
			throw new org.apache.commons.math.ode.IntegratorException(se);
		}
	}

	private java.util.List<org.apache.commons.math.ode.SwitchState> functions;

	private org.apache.commons.math.ode.SwitchState first;

	private boolean initialized;
}

