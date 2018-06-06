

package org.apache.commons.math3.analysis.solvers;


public class IllinoisSolver extends org.apache.commons.math3.analysis.solvers.BaseSecantSolver {
	public IllinoisSolver() {
		super(org.apache.commons.math3.analysis.solvers.BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY, org.apache.commons.math3.analysis.solvers.BaseSecantSolver.Method.ILLINOIS);
	}

	public IllinoisSolver(final double absoluteAccuracy) {
		super(absoluteAccuracy, org.apache.commons.math3.analysis.solvers.BaseSecantSolver.Method.ILLINOIS);
	}

	public IllinoisSolver(final double relativeAccuracy, final double absoluteAccuracy) {
		super(relativeAccuracy, absoluteAccuracy, org.apache.commons.math3.analysis.solvers.BaseSecantSolver.Method.ILLINOIS);
	}

	public IllinoisSolver(final double relativeAccuracy, final double absoluteAccuracy, final double functionValueAccuracy) {
		super(relativeAccuracy, absoluteAccuracy, functionValueAccuracy, org.apache.commons.math3.analysis.solvers.BaseSecantSolver.Method.PEGASUS);
	}
}

