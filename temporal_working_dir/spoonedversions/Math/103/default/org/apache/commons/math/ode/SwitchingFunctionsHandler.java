

package org.apache.commons.math.ode;


public class SwitchingFunctionsHandler {
	public SwitchingFunctionsHandler() {
		functions = new java.util.ArrayList();
		first = null;
		initialized = false;
	}

	public void add(org.apache.commons.math.ode.SwitchingFunction function, double maxCheckInterval, double convergence) {
		functions.add(new org.apache.commons.math.ode.SwitchState(function, maxCheckInterval, convergence));
	}

	public boolean isEmpty() {
		return functions.isEmpty();
	}

	public boolean evaluateStep(org.apache.commons.math.ode.StepInterpolator interpolator) {
		try {
			first = null;
			if (functions.isEmpty()) {
				return false;
			}
			if (!(initialized)) {
				double t0 = interpolator.getPreviousTime();
				interpolator.setInterpolatedTime(t0);
				double[] y = interpolator.getInterpolatedState();
				for (java.util.Iterator iter = functions.iterator(); iter.hasNext();) {
					((org.apache.commons.math.ode.SwitchState) (iter.next())).reinitializeBegin(t0, y);
				}
				initialized = true;
			}
			for (java.util.Iterator iter = functions.iterator(); iter.hasNext();) {
				org.apache.commons.math.ode.SwitchState state = ((org.apache.commons.math.ode.SwitchState) (iter.next()));
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
		} catch (org.apache.commons.math.ode.DerivativeException e) {
			throw new java.lang.RuntimeException(("unexpected exception: " + (e.getMessage())));
		}
	}

	public double getEventTime() {
		return (first) == null ? java.lang.Double.NaN : first.getEventTime();
	}

	public void stepAccepted(double t, double[] y) {
		for (java.util.Iterator iter = functions.iterator(); iter.hasNext();) {
			((org.apache.commons.math.ode.SwitchState) (iter.next())).stepAccepted(t, y);
		}
	}

	public boolean stop() {
		for (java.util.Iterator iter = functions.iterator(); iter.hasNext();) {
			if (((org.apache.commons.math.ode.SwitchState) (iter.next())).stop()) {
				return true;
			}
		}
		return false;
	}

	public boolean reset(double t, double[] y) {
		boolean resetDerivatives = false;
		for (java.util.Iterator iter = functions.iterator(); iter.hasNext();) {
			if (((org.apache.commons.math.ode.SwitchState) (iter.next())).reset(t, y)) {
				resetDerivatives = true;
			}
		}
		return resetDerivatives;
	}

	private java.util.ArrayList functions;

	private org.apache.commons.math.ode.SwitchState first;

	private boolean initialized;
}

