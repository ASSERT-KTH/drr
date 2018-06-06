

package org.apache.commons.math.analysis;


public abstract class UnivariateRealSolverFactory {
	protected UnivariateRealSolverFactory() {
	}

	public static org.apache.commons.math.analysis.UnivariateRealSolverFactory newInstance() {
		org.apache.commons.math.analysis.UnivariateRealSolverFactory factory = null;
		try {
			org.apache.commons.discovery.tools.DiscoverClass dc = new org.apache.commons.discovery.tools.DiscoverClass();
			factory = ((org.apache.commons.math.analysis.UnivariateRealSolverFactory) (dc.newInstance(org.apache.commons.math.analysis.UnivariateRealSolverFactory.class, "org.apache.commons.math.analysis.UnivariateRealSolverFactoryImpl")));
		} catch (java.lang.Throwable t) {
			return new org.apache.commons.math.analysis.UnivariateRealSolverFactoryImpl();
		}
		return factory;
	}

	public abstract org.apache.commons.math.analysis.UnivariateRealSolver newDefaultSolver(org.apache.commons.math.analysis.UnivariateRealFunction f);

	public abstract org.apache.commons.math.analysis.UnivariateRealSolver newBisectionSolver(org.apache.commons.math.analysis.UnivariateRealFunction f);

	public abstract org.apache.commons.math.analysis.UnivariateRealSolver newBrentSolver(org.apache.commons.math.analysis.UnivariateRealFunction f);

	public abstract org.apache.commons.math.analysis.UnivariateRealSolver newNewtonSolver(org.apache.commons.math.analysis.DifferentiableUnivariateRealFunction f);

	public abstract org.apache.commons.math.analysis.UnivariateRealSolver newSecantSolver(org.apache.commons.math.analysis.UnivariateRealFunction f);
}

