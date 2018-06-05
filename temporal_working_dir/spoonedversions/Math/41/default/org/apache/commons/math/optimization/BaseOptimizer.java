

package org.apache.commons.math.optimization;


public interface BaseOptimizer<PAIR> {
	int getMaxEvaluations();

	int getEvaluations();

	org.apache.commons.math.optimization.ConvergenceChecker<PAIR> getConvergenceChecker();
}

