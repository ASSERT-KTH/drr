

package org.apache.commons.math3.optim;


public class InitialGuess implements org.apache.commons.math3.optim.OptimizationData {
	private final double[] init;

	public InitialGuess(double[] startPoint) {
		init = startPoint.clone();
	}

	public double[] getInitialGuess() {
		return init.clone();
	}
}

