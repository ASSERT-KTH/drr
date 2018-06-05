

package org.apache.commons.math.optimization;


public interface ConvergenceChecker<PAIR> {
	boolean converged(int iteration, PAIR previous, PAIR current);
}

