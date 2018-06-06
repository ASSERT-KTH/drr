

package org.apache.commons.math.analysis.solvers;


public class RegulaFalsiSolver extends org.apache.commons.math.analysis.solvers.BaseSecantSolver {
	public RegulaFalsiSolver() {
		super(org.apache.commons.math.analysis.solvers.BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY, org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method.REGULA_FALSI);
	}

	public RegulaFalsiSolver(final double absoluteAccuracy) {
		super(absoluteAccuracy, org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method.REGULA_FALSI);
	}

	public RegulaFalsiSolver(final double relativeAccuracy, final double absoluteAccuracy) {
		super(relativeAccuracy, absoluteAccuracy, org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method.REGULA_FALSI);
	}

	public RegulaFalsiSolver(final double relativeAccuracy, final double absoluteAccuracy, final double functionValueAccuracy) {
		super(relativeAccuracy, absoluteAccuracy, functionValueAccuracy, org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method.REGULA_FALSI);
	}
}

