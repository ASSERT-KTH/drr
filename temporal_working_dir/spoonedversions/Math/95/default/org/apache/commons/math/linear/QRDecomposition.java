

package org.apache.commons.math.linear;


public interface QRDecomposition extends org.apache.commons.math.linear.DecompositionSolver {
	org.apache.commons.math.linear.RealMatrix getR() throws java.lang.IllegalStateException;

	org.apache.commons.math.linear.RealMatrix getQ() throws java.lang.IllegalStateException;

	org.apache.commons.math.linear.RealMatrix getH() throws java.lang.IllegalStateException;

	boolean isFullRank() throws java.lang.IllegalStateException;
}

