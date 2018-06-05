

package org.apache.commons.math3.stat.descriptive;


public interface WeightedEvaluation {
	double evaluate(double[] values, double[] weights) throws org.apache.commons.math3.exception.MathIllegalArgumentException;

	double evaluate(double[] values, double[] weights, int begin, int length) throws org.apache.commons.math3.exception.MathIllegalArgumentException;
}

