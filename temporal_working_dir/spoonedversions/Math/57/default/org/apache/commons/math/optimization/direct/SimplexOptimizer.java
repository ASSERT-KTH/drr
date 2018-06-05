

package org.apache.commons.math.optimization.direct;


public class SimplexOptimizer extends org.apache.commons.math.optimization.direct.BaseAbstractScalarOptimizer<org.apache.commons.math.analysis.MultivariateRealFunction> implements org.apache.commons.math.optimization.MultivariateRealOptimizer {
	private org.apache.commons.math.optimization.direct.AbstractSimplex simplex;

	public SimplexOptimizer() {
		setConvergenceChecker(new org.apache.commons.math.optimization.SimpleScalarValueChecker());
	}

	public SimplexOptimizer(double rel, double abs) {
		setConvergenceChecker(new org.apache.commons.math.optimization.SimpleScalarValueChecker(rel, abs));
	}

	public void setSimplex(org.apache.commons.math.optimization.direct.AbstractSimplex simplex) {
		org.apache.commons.math.optimization.direct.SimplexOptimizer.this.simplex = simplex;
	}

	@java.lang.Override
	protected org.apache.commons.math.optimization.RealPointValuePair doOptimize() throws org.apache.commons.math.exception.MathUserException {
		if ((simplex) == null) {
			throw new org.apache.commons.math.exception.NullArgumentException();
		}
		final org.apache.commons.math.analysis.MultivariateRealFunction evalFunc = new org.apache.commons.math.analysis.MultivariateRealFunction() {
			public double value(double[] point) throws org.apache.commons.math.exception.MathUserException {
				return computeObjectiveValue(point);
			}
		};
		final boolean isMinim = (getGoalType()) == (org.apache.commons.math.optimization.GoalType.MINIMIZE);
		final java.util.Comparator<org.apache.commons.math.optimization.RealPointValuePair> comparator = new java.util.Comparator<org.apache.commons.math.optimization.RealPointValuePair>() {
			public int compare(final org.apache.commons.math.optimization.RealPointValuePair o1, final org.apache.commons.math.optimization.RealPointValuePair o2) {
				final double v1 = o1.getValue();
				final double v2 = o2.getValue();
				return isMinim ? java.lang.Double.compare(v1, v2) : java.lang.Double.compare(v2, v1);
			}
		};
		simplex.build(getStartPoint());
		simplex.evaluate(evalFunc, comparator);
		org.apache.commons.math.optimization.RealPointValuePair[] previous = null;
		int iteration = 0;
		final org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> checker = getConvergenceChecker();
		while (true) {
			if (iteration > 0) {
				boolean converged = true;
				for (int i = 0; i < (simplex.getSize()); i++) {
					@java.lang.SuppressWarnings(value = "null")
					org.apache.commons.math.optimization.RealPointValuePair prev = previous[i];
					converged &= checker.converged(iteration, prev, simplex.getPoint(i));
				}
				if (converged) {
					return simplex.getPoint(0);
				}
			}
			previous = simplex.getPoints();
			simplex.iterate(evalFunc, comparator);
			++iteration;
		} 
	}
}

