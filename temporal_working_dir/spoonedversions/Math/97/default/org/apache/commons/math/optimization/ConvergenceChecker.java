

package org.apache.commons.math.optimization;


public interface ConvergenceChecker {
	public boolean converged(org.apache.commons.math.optimization.PointCostPair[] simplex);
}

