

package org.apache.commons.math3.optimization;


public interface BaseOptimizer<PAIR> {
	int getMaxEvaluations();

	int getEvaluations();

	org.apache.commons.math3.optimization.ConvergenceChecker<PAIR> getConvergenceChecker();
}

