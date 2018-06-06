

package org.apache.commons.math3.optimization;


public interface ConvergenceChecker<PAIR> {
	boolean converged(int iteration, PAIR previous, PAIR current);
}

