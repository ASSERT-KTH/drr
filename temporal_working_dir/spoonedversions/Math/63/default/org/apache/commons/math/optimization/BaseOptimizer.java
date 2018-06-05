

package org.apache.commons.math.optimization;


public interface BaseOptimizer<PAIR> {
	void setMaxEvaluations(int maxEvaluations);

	int getMaxEvaluations();

	int getEvaluations();

	void setConvergenceChecker(org.apache.commons.math.optimization.ConvergenceChecker<PAIR> checker);

	org.apache.commons.math.optimization.ConvergenceChecker<PAIR> getConvergenceChecker();
}

