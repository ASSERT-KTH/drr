

package org.apache.commons.math.distribution;


public interface ChiSquaredDistribution extends org.apache.commons.math.distribution.ContinuousDistribution {
	void setDegreesOfFreedom(double degreesOfFreedom);

	double getDegreesOfFreedom();
}

