

package org.apache.commons.math.linear;


public interface QRDecomposition extends org.apache.commons.math.linear.DecompositionSolver {
	org.apache.commons.math.linear.RealMatrix getR();

	org.apache.commons.math.linear.RealMatrix getQ();

	org.apache.commons.math.linear.RealMatrix getH();

	boolean isFullRank();
}

