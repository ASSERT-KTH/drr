

package org.apache.commons.math.analysis;


public class UnivariateRealSolverFactoryImpl extends org.apache.commons.math.analysis.UnivariateRealSolverFactory {
	public UnivariateRealSolverFactoryImpl() {
	}

	public org.apache.commons.math.analysis.UnivariateRealSolver newDefaultSolver(org.apache.commons.math.analysis.UnivariateRealFunction f) {
		return newBrentSolver(f);
	}

	public org.apache.commons.math.analysis.UnivariateRealSolver newBisectionSolver(org.apache.commons.math.analysis.UnivariateRealFunction f) {
		return new org.apache.commons.math.analysis.BisectionSolver(f);
	}

	public org.apache.commons.math.analysis.UnivariateRealSolver newBrentSolver(org.apache.commons.math.analysis.UnivariateRealFunction f) {
		return new org.apache.commons.math.analysis.BrentSolver(f);
	}

	public org.apache.commons.math.analysis.UnivariateRealSolver newNewtonSolver(org.apache.commons.math.analysis.DifferentiableUnivariateRealFunction f) {
		return new org.apache.commons.math.analysis.NewtonSolver(f);
	}

	public org.apache.commons.math.analysis.UnivariateRealSolver newSecantSolver(org.apache.commons.math.analysis.UnivariateRealFunction f) {
		return new org.apache.commons.math.analysis.SecantSolver(f);
	}
}

