

package org.apache.commons.math3.stat.descriptive;


public interface UnivariateStatistic {
	double evaluate(double[] values);

	double evaluate(double[] values, int begin, int length);

	org.apache.commons.math3.stat.descriptive.UnivariateStatistic copy();
}

