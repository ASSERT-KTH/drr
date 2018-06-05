

package org.apache.commons.math3.stat.descriptive;


public interface StorelessUnivariateStatistic extends org.apache.commons.math3.stat.descriptive.UnivariateStatistic {
	void increment(double d);

	void incrementAll(double[] values) throws org.apache.commons.math3.exception.MathIllegalArgumentException;

	void incrementAll(double[] values, int start, int length) throws org.apache.commons.math3.exception.MathIllegalArgumentException;

	double getResult();

	long getN();

	void clear();

	org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic copy();
}

