

package org.apache.commons.math.ode.events;


public interface EventHandler {
	int STOP = 0;

	int RESET_STATE = 1;

	int RESET_DERIVATIVES = 2;

	int CONTINUE = 3;

	double g(double t, double[] y);

	int eventOccurred(double t, double[] y, boolean increasing);

	void resetState(double t, double[] y);
}

