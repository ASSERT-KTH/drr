

package org.apache.commons.math.linear;


public interface LUDecomposition extends org.apache.commons.math.linear.DecompositionSolver {
	org.apache.commons.math.linear.RealMatrix getL();

	org.apache.commons.math.linear.RealMatrix getU();

	org.apache.commons.math.linear.RealMatrix getP();

	int[] getPivot();

	boolean isNonSingular();

	double getDeterminant();
}

