

package org.apache.commons.math.analysis.integration;


@java.lang.Deprecated
public abstract class ConvergingAlgorithmImpl implements org.apache.commons.math.analysis.integration.ConvergingAlgorithm {
	protected double absoluteAccuracy;

	protected double relativeAccuracy;

	protected int maximalIterationCount;

	protected double defaultAbsoluteAccuracy;

	protected double defaultRelativeAccuracy;

	protected int defaultMaximalIterationCount;

	protected int iterationCount;

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

	protected void incrementIterationsCounter() {
		if ((++(iterationCount)) > (maximalIterationCount)) {
			throw new org.apache.commons.math.exception.MaxCountExceededException(maximalIterationCount);
		}
	}
}

