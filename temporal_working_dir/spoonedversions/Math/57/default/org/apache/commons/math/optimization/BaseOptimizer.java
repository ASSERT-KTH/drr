

package org.apache.commons.math.optimization;


public interface BaseOptimizer<PAIR> {
	int getMaxEvaluations();

	int getEvaluations();

	void setConvergenceChecker(org.apache.commons.math.optimization.ConvergenceChecker<PAIR> checker);

	org.apache.commons.math.optimization.ConvergenceChecker<PAIR> getConvergenceChecker();
}

