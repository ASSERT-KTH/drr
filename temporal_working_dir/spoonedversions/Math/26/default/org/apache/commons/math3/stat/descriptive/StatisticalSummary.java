

package org.apache.commons.math3.stat.descriptive;


public interface StatisticalSummary {
	double getMean();

	double getVariance();

	double getStandardDeviation();

	double getMax();

	double getMin();

	long getN();

	double getSum();
}

