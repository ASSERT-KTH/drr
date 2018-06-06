

package org.apache.commons.math.optimization;


public interface VectorialConvergenceChecker extends java.io.Serializable {
	boolean converged(int iteration, org.apache.commons.math.optimization.VectorialPointValuePair previous, org.apache.commons.math.optimization.VectorialPointValuePair current);
}

