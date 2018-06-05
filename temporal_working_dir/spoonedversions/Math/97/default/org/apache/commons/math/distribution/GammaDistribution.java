

package org.apache.commons.math.distribution;


public interface GammaDistribution extends org.apache.commons.math.distribution.ContinuousDistribution {
	void setAlpha(double alpha);

	double getAlpha();

	void setBeta(double beta);

	double getBeta();
}

