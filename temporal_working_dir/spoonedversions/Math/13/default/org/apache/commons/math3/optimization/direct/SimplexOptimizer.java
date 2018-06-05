

package org.apache.commons.math3.optimization.direct;


@java.lang.Deprecated
public class SimplexOptimizer extends org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer<org.apache.commons.math3.analysis.MultivariateFunction> implements org.apache.commons.math3.optimization.MultivariateOptimizer {
	private org.apache.commons.math3.optimization.direct.AbstractSimplex simplex;

	@java.lang.Deprecated
	public SimplexOptimizer() {
		this(new org.apache.commons.math3.optimization.SimpleValueChecker());
	}

	public SimplexOptimizer(org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> checker) {
		super(checker);
	}

	public SimplexOptimizer(double rel, double abs) {
		this(new org.apache.commons.math3.optimization.SimpleValueChecker(rel, abs));
	}

	@java.lang.Deprecated
	public void setSimplex(org.apache.commons.math3.optimization.direct.AbstractSimplex simplex) {
		parseOptimizationData(simplex);
	}

	@java.lang.Override
	protected org.apache.commons.math3.optimization.PointValuePair optimizeInternal(int maxEval, org.apache.commons.math3.analysis.MultivariateFunction f, org.apache.commons.math3.optimization.GoalType goalType, org.apache.commons.math3.optimization.OptimizationData... optData) {
		parseOptimizationData(optData);
		return super.optimizeInternal(maxEval, f, goalType, optData);
	}

	private void parseOptimizationData(org.apache.commons.math3.optimization.OptimizationData... optData) {
		for (org.apache.commons.math3.optimization.OptimizationData data : optData) {
			if (data instanceof org.apache.commons.math3.optimization.direct.AbstractSimplex) {
				simplex = ((org.apache.commons.math3.optimization.direct.AbstractSimplex) (data));
				continue;
			}
		}
	}

	@java.lang.Override
	protected org.apache.commons.math3.optimization.PointValuePair doOptimize() {
		if ((simplex) == null) {
			throw new org.apache.commons.math3.exception.NullArgumentException();
		}
		final org.apache.commons.math3.analysis.MultivariateFunction evalFunc = new org.apache.commons.math3.analysis.MultivariateFunction() {
			public double value(double[] point) {
				return computeObjectiveValue(point);
			}
		};
		final boolean isMinim = (getGoalType()) == (org.apache.commons.math3.optimization.GoalType.MINIMIZE);
		final java.util.Comparator<org.apache.commons.math3.optimization.PointValuePair> comparator = new java.util.Comparator<org.apache.commons.math3.optimization.PointValuePair>() {
			public int compare(final org.apache.commons.math3.optimization.PointValuePair o1, final org.apache.commons.math3.optimization.PointValuePair o2) {
				final double v1 = o1.getValue();
				final double v2 = o2.getValue();
				return isMinim ? java.lang.Double.compare(v1, v2) : java.lang.Double.compare(v2, v1);
			}
		};
		simplex.build(getStartPoint());
		simplex.evaluate(evalFunc, comparator);
		org.apache.commons.math3.optimization.PointValuePair[] previous = null;
		int iteration = 0;
		final org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> checker = getConvergenceChecker();
		while (true) {
			if (iteration > 0) {
				boolean converged = true;
				for (int i = 0; i < (simplex.getSize()); i++) {
					org.apache.commons.math3.optimization.PointValuePair prev = previous[i];
					converged = converged && (checker.converged(iteration, prev, simplex.getPoint(i)));
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

