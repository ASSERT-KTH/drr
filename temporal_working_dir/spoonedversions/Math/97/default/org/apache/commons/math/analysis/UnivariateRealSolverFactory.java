

package org.apache.commons.math.analysis;


public abstract class UnivariateRealSolverFactory {
	protected UnivariateRealSolverFactory() {
	}

	public static org.apache.commons.math.analysis.UnivariateRealSolverFactory newInstance() {
		return new org.apache.commons.math.analysis.UnivariateRealSolverFactoryImpl();
	}

	public abstract org.apache.commons.math.analysis.UnivariateRealSolver newDefaultSolver(org.apache.commons.math.analysis.UnivariateRealFunction f);

	public abstract org.apache.commons.math.analysis.UnivariateRealSolver newBisectionSolver(org.apache.commons.math.analysis.UnivariateRealFunction f);

	public abstract org.apache.commons.math.analysis.UnivariateRealSolver newBrentSolver(org.apache.commons.math.analysis.UnivariateRealFunction f);

	public abstract org.apache.commons.math.analysis.UnivariateRealSolver newNewtonSolver(org.apache.commons.math.analysis.DifferentiableUnivariateRealFunction f);

	public abstract org.apache.commons.math.analysis.UnivariateRealSolver newSecantSolver(org.apache.commons.math.analysis.UnivariateRealFunction f);
}

