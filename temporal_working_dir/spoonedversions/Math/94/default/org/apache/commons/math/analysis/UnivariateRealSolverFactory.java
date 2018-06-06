

package org.apache.commons.math.analysis;


public abstract class UnivariateRealSolverFactory {
	protected UnivariateRealSolverFactory() {
	}

	public static org.apache.commons.math.analysis.UnivariateRealSolverFactory newInstance() {
		return new org.apache.commons.math.analysis.UnivariateRealSolverFactoryImpl();
	}

	public abstract org.apache.commons.math.analysis.UnivariateRealSolver newDefaultSolver();

	public abstract org.apache.commons.math.analysis.UnivariateRealSolver newBisectionSolver();

	public abstract org.apache.commons.math.analysis.UnivariateRealSolver newBrentSolver();

	public abstract org.apache.commons.math.analysis.UnivariateRealSolver newNewtonSolver();

	public abstract org.apache.commons.math.analysis.UnivariateRealSolver newSecantSolver();
}

