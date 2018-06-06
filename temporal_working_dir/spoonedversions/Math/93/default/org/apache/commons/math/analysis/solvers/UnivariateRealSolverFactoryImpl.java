

package org.apache.commons.math.analysis.solvers;


public class UnivariateRealSolverFactoryImpl extends org.apache.commons.math.analysis.solvers.UnivariateRealSolverFactory {
	public UnivariateRealSolverFactoryImpl() {
	}

	public org.apache.commons.math.analysis.solvers.UnivariateRealSolver newDefaultSolver() {
		return newBrentSolver();
	}

	public org.apache.commons.math.analysis.solvers.UnivariateRealSolver newBisectionSolver() {
		return new org.apache.commons.math.analysis.solvers.BisectionSolver();
	}

	public org.apache.commons.math.analysis.solvers.UnivariateRealSolver newBrentSolver() {
		return new org.apache.commons.math.analysis.solvers.BrentSolver();
	}

	public org.apache.commons.math.analysis.solvers.UnivariateRealSolver newNewtonSolver() {
		return new org.apache.commons.math.analysis.solvers.NewtonSolver();
	}

	public org.apache.commons.math.analysis.solvers.UnivariateRealSolver newSecantSolver() {
		return new org.apache.commons.math.analysis.solvers.SecantSolver();
	}
}

