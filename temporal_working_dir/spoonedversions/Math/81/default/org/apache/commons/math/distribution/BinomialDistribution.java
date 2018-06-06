

package org.apache.commons.math.distribution;


public interface BinomialDistribution extends org.apache.commons.math.distribution.IntegerDistribution {
	int getNumberOfTrials();

	double getProbabilityOfSuccess();

	void setNumberOfTrials(int trials);

	void setProbabilityOfSuccess(double p);
}

