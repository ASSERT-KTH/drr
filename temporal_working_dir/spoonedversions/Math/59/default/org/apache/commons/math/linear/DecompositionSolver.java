

package org.apache.commons.math.linear;


public interface DecompositionSolver {
	double[] solve(final double[] b);

	org.apache.commons.math.linear.RealVector solve(final org.apache.commons.math.linear.RealVector b);

	org.apache.commons.math.linear.RealMatrix solve(final org.apache.commons.math.linear.RealMatrix b);

	boolean isNonSingular();

	org.apache.commons.math.linear.RealMatrix getInverse();
}

