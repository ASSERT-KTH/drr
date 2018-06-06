

package org.apache.commons.math3.optim;


public interface ConvergenceChecker<PAIR> {
	boolean converged(int iteration, PAIR previous, PAIR current);
}

