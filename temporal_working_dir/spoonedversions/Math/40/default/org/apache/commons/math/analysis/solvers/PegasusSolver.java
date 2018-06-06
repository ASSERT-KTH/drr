

package org.apache.commons.math.analysis.solvers;


public class PegasusSolver extends org.apache.commons.math.analysis.solvers.BaseSecantSolver {
	public PegasusSolver() {
		super(org.apache.commons.math.analysis.solvers.BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY, org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method.PEGASUS);
	}

	public PegasusSolver(final double absoluteAccuracy) {
		super(absoluteAccuracy, org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method.PEGASUS);
	}

	public PegasusSolver(final double relativeAccuracy, final double absoluteAccuracy) {
		super(relativeAccuracy, absoluteAccuracy, org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method.PEGASUS);
	}

	public PegasusSolver(final double relativeAccuracy, final double absoluteAccuracy, final double functionValueAccuracy) {
		super(relativeAccuracy, absoluteAccuracy, functionValueAccuracy, org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method.PEGASUS);
	}
}

