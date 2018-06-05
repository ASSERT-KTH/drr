

package org.apache.commons.math.analysis;


public class UnivariateRealSolverFactoryImpl extends org.apache.commons.math.analysis.UnivariateRealSolverFactory {
	public UnivariateRealSolverFactoryImpl() {
	}

	public org.apache.commons.math.analysis.UnivariateRealSolver newDefaultSolver() {
		return newBrentSolver();
	}

	public org.apache.commons.math.analysis.UnivariateRealSolver newBisectionSolver() {
		return new org.apache.commons.math.analysis.BisectionSolver();
	}

	public org.apache.commons.math.analysis.UnivariateRealSolver newBrentSolver() {
		return new org.apache.commons.math.analysis.BrentSolver();
	}

	public org.apache.commons.math.analysis.UnivariateRealSolver newNewtonSolver() {
		return new org.apache.commons.math.analysis.NewtonSolver();
	}

	public org.apache.commons.math.analysis.UnivariateRealSolver newSecantSolver() {
		return new org.apache.commons.math.analysis.SecantSolver();
	}
}

