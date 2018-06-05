

package org.apache.commons.math.optimization;


public interface ConvergenceChecker<PAIR> {
	boolean converged(int iteration, PAIR... points);

	double getRelativeThreshold();

	double getAbsoluteThreshold();
}

