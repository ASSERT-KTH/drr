

package org.apache.commons.math.optimization;


public interface RealConvergenceChecker extends java.io.Serializable {
	boolean converged(int iteration, org.apache.commons.math.optimization.RealPointValuePair previous, org.apache.commons.math.optimization.RealPointValuePair current);
}

