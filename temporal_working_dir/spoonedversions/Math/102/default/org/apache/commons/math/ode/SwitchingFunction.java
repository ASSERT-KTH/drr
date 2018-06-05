

package org.apache.commons.math.ode;


public interface SwitchingFunction extends java.io.Serializable {
	public static final int STOP = 0;

	public static final int RESET_STATE = 1;

	public static final int RESET_DERIVATIVES = 2;

	public static final int CONTINUE = 3;

	public double g(double t, double[] y) throws org.apache.commons.math.FunctionEvaluationException;

	public int eventOccurred(double t, double[] y);

	public void resetState(double t, double[] y);
}

