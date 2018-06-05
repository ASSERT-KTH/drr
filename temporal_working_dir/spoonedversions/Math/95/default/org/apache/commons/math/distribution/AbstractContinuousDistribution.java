

package org.apache.commons.math.distribution;


public abstract class AbstractContinuousDistribution extends org.apache.commons.math.distribution.AbstractDistribution implements java.io.Serializable , org.apache.commons.math.distribution.ContinuousDistribution {
	private static final long serialVersionUID = -38038050983108802L;

	protected AbstractContinuousDistribution() {
		super();
	}

	public double inverseCumulativeProbability(final double p) throws org.apache.commons.math.MathException {
		if ((p < 0.0) || (p > 1.0)) {
			throw new java.lang.IllegalArgumentException("p must be between 0.0 and 1.0, inclusive.");
		}
		org.apache.commons.math.analysis.UnivariateRealFunction rootFindingFunction = new org.apache.commons.math.analysis.UnivariateRealFunction() {
			public double value(double x) throws org.apache.commons.math.FunctionEvaluationException {
				try {
					return (cumulativeProbability(x)) - p;
				} catch (org.apache.commons.math.MathException ex) {
					throw new org.apache.commons.math.FunctionEvaluationException(x, ex.getPattern(), ex.getArguments(), ex);
				}
			}
		};
		double lowerBound = getDomainLowerBound(p);
		double upperBound = getDomainUpperBound(p);
		double[] bracket = null;
		try {
			bracket = org.apache.commons.math.analysis.UnivariateRealSolverUtils.bracket(rootFindingFunction, getInitialDomain(p), lowerBound, upperBound);
		} catch (org.apache.commons.math.ConvergenceException ex) {
			if ((java.lang.Math.abs(rootFindingFunction.value(lowerBound))) < 1.0E-6) {
				return lowerBound;
			}
			if ((java.lang.Math.abs(rootFindingFunction.value(upperBound))) < 1.0E-6) {
				return upperBound;
			}
			throw new org.apache.commons.math.MathException(ex);
		}
		double root = org.apache.commons.math.analysis.UnivariateRealSolverUtils.solve(rootFindingFunction, bracket[0], bracket[1]);
		return root;
	}

	protected abstract double getInitialDomain(double p);

	protected abstract double getDomainLowerBound(double p);

	protected abstract double getDomainUpperBound(double p);
}

