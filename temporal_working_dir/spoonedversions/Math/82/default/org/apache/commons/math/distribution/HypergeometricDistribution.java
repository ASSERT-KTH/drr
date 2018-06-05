

package org.apache.commons.math.distribution;


public interface HypergeometricDistribution extends org.apache.commons.math.distribution.IntegerDistribution {
	public abstract int getNumberOfSuccesses();

	public abstract int getPopulationSize();

	public abstract int getSampleSize();

	public abstract void setNumberOfSuccesses(int num);

	public abstract void setPopulationSize(int size);

	public abstract void setSampleSize(int size);
}

