

package org.apache.commons.math3.optimization;


@java.lang.Deprecated
public class InitialGuess implements org.apache.commons.math3.optimization.OptimizationData {
	private final double[] init;

	public InitialGuess(double[] startPoint) {
		init = startPoint.clone();
	}

	public double[] getInitialGuess() {
		return init.clone();
	}
}

