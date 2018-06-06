

package org.apache.commons.math3.stat.descriptive;


public interface StorelessUnivariateStatistic extends org.apache.commons.math3.stat.descriptive.UnivariateStatistic {
	void increment(double d);

	void incrementAll(double[] values);

	void incrementAll(double[] values, int start, int length);

	double getResult();

	long getN();

	void clear();

	org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic copy();
}

