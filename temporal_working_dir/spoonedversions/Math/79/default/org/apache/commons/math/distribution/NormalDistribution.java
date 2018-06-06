

package org.apache.commons.math.distribution;


public interface NormalDistribution extends org.apache.commons.math.distribution.ContinuousDistribution , org.apache.commons.math.distribution.HasDensity<java.lang.Double> {
	double getMean();

	void setMean(double mean);

	double getStandardDeviation();

	void setStandardDeviation(double sd);

	double density(java.lang.Double x);
}

