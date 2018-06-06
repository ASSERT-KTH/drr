

package org.apache.commons.math;


public abstract class ConvergingAlgorithmImpl implements org.apache.commons.math.ConvergingAlgorithm {
	private static final long serialVersionUID = 4059567655915789396L;

	protected double absoluteAccuracy;

	protected double relativeAccuracy;

	protected int maximalIterationCount;

	protected double defaultAbsoluteAccuracy;

	protected double defaultRelativeAccuracy;

	protected int defaultMaximalIterationCount;

	protected int iterationCount;

	protected ConvergingAlgorithmImpl(final int defaultMaximalIterationCount, final double defaultAbsoluteAccuracy) {
		org.apache.commons.math.ConvergingAlgorithmImpl.this.defaultAbsoluteAccuracy = defaultAbsoluteAccuracy;
		org.apache.commons.math.ConvergingAlgorithmImpl.this.defaultRelativeAccuracy = 1.0E-14;
		org.apache.commons.math.ConvergingAlgorithmImpl.this.absoluteAccuracy = defaultAbsoluteAccuracy;
		org.apache.commons.math.ConvergingAlgorithmImpl.this.relativeAccuracy = defaultRelativeAccuracy;
		org.apache.commons.math.ConvergingAlgorithmImpl.this.defaultMaximalIterationCount = defaultMaximalIterationCount;
		org.apache.commons.math.ConvergingAlgorithmImpl.this.maximalIterationCount = defaultMaximalIterationCount;
		org.apache.commons.math.ConvergingAlgorithmImpl.this.iterationCount = 0;
	}

	public int getIterationCount() {
		return iterationCount;
	}

	public void setAbsoluteAccuracy(double accuracy) {
		absoluteAccuracy = accuracy;
	}

	public double getAbsoluteAccuracy() {
		return absoluteAccuracy;
	}

	public void resetAbsoluteAccuracy() {
		absoluteAccuracy = defaultAbsoluteAccuracy;
	}

	public void setMaximalIterationCount(int count) {
		maximalIterationCount = count;
	}

	public int getMaximalIterationCount() {
		return maximalIterationCount;
	}

	public void resetMaximalIterationCount() {
		maximalIterationCount = defaultMaximalIterationCount;
	}

	public void setRelativeAccuracy(double accuracy) {
		relativeAccuracy = accuracy;
	}

	public double getRelativeAccuracy() {
		return relativeAccuracy;
	}

	public void resetRelativeAccuracy() {
		relativeAccuracy = defaultRelativeAccuracy;
	}
}

