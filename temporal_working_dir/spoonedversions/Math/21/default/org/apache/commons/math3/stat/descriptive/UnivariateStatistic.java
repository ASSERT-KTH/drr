

package org.apache.commons.math3.stat.descriptive;


public interface UnivariateStatistic {
	double evaluate(double[] values) throws org.apache.commons.math3.exception.MathIllegalArgumentException;

	double evaluate(double[] values, int begin, int length) throws org.apache.commons.math3.exception.MathIllegalArgumentException;

	org.apache.commons.math3.stat.descriptive.UnivariateStatistic copy();
}

