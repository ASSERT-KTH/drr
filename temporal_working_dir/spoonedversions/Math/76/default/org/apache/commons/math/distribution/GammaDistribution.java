

package org.apache.commons.math.distribution;


public interface GammaDistribution extends org.apache.commons.math.distribution.ContinuousDistribution , org.apache.commons.math.distribution.HasDensity<java.lang.Double> {
	void setAlpha(double alpha);

	double getAlpha();

	void setBeta(double beta);

	double getBeta();

	double density(java.lang.Double x);
}

