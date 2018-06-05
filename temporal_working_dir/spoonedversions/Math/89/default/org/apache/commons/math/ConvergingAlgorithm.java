

package org.apache.commons.math;


public interface ConvergingAlgorithm extends java.io.Serializable {
	public abstract void setMaximalIterationCount(int count);

	public abstract int getMaximalIterationCount();

	public abstract void resetMaximalIterationCount();

	public abstract void setAbsoluteAccuracy(double accuracy);

	public abstract double getAbsoluteAccuracy();

	public abstract void resetAbsoluteAccuracy();

	public abstract void setRelativeAccuracy(double accuracy);

	public abstract double getRelativeAccuracy();

	public abstract void resetRelativeAccuracy();

	public abstract int getIterationCount();
}

