

package org.apache.commons.math.linear;


public interface LUDecomposition extends org.apache.commons.math.linear.DecompositionSolver {
	void decompose(org.apache.commons.math.linear.RealMatrix matrix, double singularityThreshold);

	org.apache.commons.math.linear.RealMatrix getL() throws java.lang.IllegalStateException;

	org.apache.commons.math.linear.RealMatrix getU() throws java.lang.IllegalStateException;

	org.apache.commons.math.linear.RealMatrix getP() throws java.lang.IllegalStateException;

	int[] getPivot() throws java.lang.IllegalStateException;

	boolean isNonSingular() throws java.lang.IllegalStateException;

	double getDeterminant() throws java.lang.IllegalStateException;
}

