

package org.apache.commons.math.linear;


public interface DecompositionSolver extends java.io.Serializable {
	double[] solve(double[] b) throws java.lang.IllegalArgumentException, org.apache.commons.math.linear.InvalidMatrixException;

	org.apache.commons.math.linear.RealVector solve(org.apache.commons.math.linear.RealVector b) throws java.lang.IllegalArgumentException, org.apache.commons.math.linear.InvalidMatrixException;

	org.apache.commons.math.linear.RealMatrix solve(org.apache.commons.math.linear.RealMatrix b) throws java.lang.IllegalArgumentException, org.apache.commons.math.linear.InvalidMatrixException;
}

