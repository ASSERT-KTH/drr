

package org.apache.commons.math.distribution;


public interface PascalDistribution extends org.apache.commons.math.distribution.IntegerDistribution {
	int getNumberOfSuccesses();

	double getProbabilityOfSuccess();

	void setNumberOfSuccesses(int successes);

	void setProbabilityOfSuccess(double p);
}

