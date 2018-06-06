

package org.apache.commons.math.linear.decomposition;


public interface QRDecomposition extends java.io.Serializable {
	org.apache.commons.math.linear.RealMatrix getR();

	org.apache.commons.math.linear.RealMatrix getQ();

	org.apache.commons.math.linear.RealMatrix getQT();

	org.apache.commons.math.linear.RealMatrix getH();

	org.apache.commons.math.linear.decomposition.DecompositionSolver getSolver();
}

