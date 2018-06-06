

package org.apache.commons.math.distribution;


public interface HypergeometricDistribution extends org.apache.commons.math.distribution.IntegerDistribution {
	int getNumberOfSuccesses();

	int getPopulationSize();

	int getSampleSize();

	void setNumberOfSuccesses(int num);

	void setPopulationSize(int size);

	void setSampleSize(int size);
}

