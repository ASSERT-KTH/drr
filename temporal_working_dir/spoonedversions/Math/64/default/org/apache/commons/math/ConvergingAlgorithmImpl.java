

package org.apache.commons.math;


public abstract class ConvergingAlgorithmImpl implements org.apache.commons.math.ConvergingAlgorithm {
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

	protected ConvergingAlgorithmImpl() {
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

	protected void resetIterationsCounter() {
		iterationCount = 0;
	}

	protected void incrementIterationsCounter() throws org.apache.commons.math.MaxIterationsExceededException {
		if ((++(iterationCount)) > (maximalIterationCount)) {
			throw new org.apache.commons.math.MaxIterationsExceededException(maximalIterationCount);
		}
	}
}

