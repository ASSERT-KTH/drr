

package org.apache.commons.math3.optimization;


@java.lang.Deprecated
public class Target implements org.apache.commons.math3.optimization.OptimizationData {
	private final double[] target;

	public Target(double[] observations) {
		target = observations.clone();
	}

	public double[] getTarget() {
		return target.clone();
	}
}

