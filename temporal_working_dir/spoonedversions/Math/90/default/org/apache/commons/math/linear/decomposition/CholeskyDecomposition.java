

package org.apache.commons.math.linear.decomposition;


public interface CholeskyDecomposition extends java.io.Serializable {
	org.apache.commons.math.linear.RealMatrix getL();

	org.apache.commons.math.linear.RealMatrix getLT();

	double getDeterminant();

	org.apache.commons.math.linear.decomposition.DecompositionSolver getSolver();
}

