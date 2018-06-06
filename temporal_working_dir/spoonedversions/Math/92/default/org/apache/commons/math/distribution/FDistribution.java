

package org.apache.commons.math.distribution;


public interface FDistribution extends org.apache.commons.math.distribution.ContinuousDistribution {
	void setNumeratorDegreesOfFreedom(double degreesOfFreedom);

	double getNumeratorDegreesOfFreedom();

	void setDenominatorDegreesOfFreedom(double degreesOfFreedom);

	double getDenominatorDegreesOfFreedom();
}

