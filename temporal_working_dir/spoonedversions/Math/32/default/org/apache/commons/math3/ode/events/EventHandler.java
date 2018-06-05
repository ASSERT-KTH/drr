

package org.apache.commons.math3.ode.events;


public interface EventHandler {
	public enum Action {
STOP, RESET_STATE, RESET_DERIVATIVES, CONTINUE;	}

	void init(double t0, double[] y0, double t);

	double g(double t, double[] y);

	org.apache.commons.math3.ode.events.EventHandler.Action eventOccurred(double t, double[] y, boolean increasing);

	void resetState(double t, double[] y);
}

