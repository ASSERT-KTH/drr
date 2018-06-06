

package org.apache.commons.math3.stat.descriptive;


public interface WeightedEvaluation {
	double evaluate(double[] values, double[] weights);

	double evaluate(double[] values, double[] weights, int begin, int length);
}

