

package org.apache.commons.math3.linear;


public interface DecompositionSolver {
	org.apache.commons.math3.linear.RealVector solve(final org.apache.commons.math3.linear.RealVector b);

	org.apache.commons.math3.linear.RealMatrix solve(final org.apache.commons.math3.linear.RealMatrix b);

	boolean isNonSingular();

	org.apache.commons.math3.linear.RealMatrix getInverse();
}

