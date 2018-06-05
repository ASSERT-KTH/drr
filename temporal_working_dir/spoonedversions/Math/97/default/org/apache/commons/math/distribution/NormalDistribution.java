

package org.apache.commons.math.distribution;


public interface NormalDistribution extends org.apache.commons.math.distribution.ContinuousDistribution {
	double getMean();

	void setMean(double mean);

	double getStandardDeviation();

	void setStandardDeviation(double sd);
}

