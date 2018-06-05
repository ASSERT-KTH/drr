

package org.apache.commons.math3.optimization.fitting;


@java.lang.Deprecated
public class CurveFitter<T extends org.apache.commons.math3.analysis.ParametricUnivariateFunction> {
	@java.lang.Deprecated
	private final org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer oldOptimizer;

	private final org.apache.commons.math3.optimization.MultivariateDifferentiableVectorOptimizer optimizer;

	private final java.util.List<org.apache.commons.math3.optimization.fitting.WeightedObservedPoint> observations;

	public CurveFitter(final org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer optimizer) {
		this.oldOptimizer = optimizer;
		this.optimizer = null;
		observations = new java.util.ArrayList<org.apache.commons.math3.optimization.fitting.WeightedObservedPoint>();
	}

	public CurveFitter(final org.apache.commons.math3.optimization.MultivariateDifferentiableVectorOptimizer optimizer) {
		this.oldOptimizer = null;
		this.optimizer = optimizer;
		observations = new java.util.ArrayList<org.apache.commons.math3.optimization.fitting.WeightedObservedPoint>();
	}

	public void addObservedPoint(double x, double y) {
		addObservedPoint(1.0, x, y);
	}

	public void addObservedPoint(double weight, double x, double y) {
		observations.add(new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint(weight, x, y));
	}

	public void addObservedPoint(org.apache.commons.math3.optimization.fitting.WeightedObservedPoint observed) {
		observations.add(observed);
	}

	public org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] getObservations() {
		return observations.toArray(new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[observations.size()]);
	}

	public void clearObservations() {
		observations.clear();
	}

	public double[] fit(T f, final double[] initialGuess) {
		return fit(java.lang.Integer.MAX_VALUE, f, initialGuess);
	}

	public double[] fit(int maxEval, T f, final double[] initialGuess) {
		double[] target = new double[observations.size()];
		double[] weights = new double[observations.size()];
		int i = 0;
		for (org.apache.commons.math3.optimization.fitting.WeightedObservedPoint point : observations) {
			target[i] = point.getY();
			weights[i] = point.getWeight();
			++i;
		}
		final org.apache.commons.math3.optimization.PointVectorValuePair optimum;
		if ((optimizer) == null) {
			optimum = oldOptimizer.optimize(maxEval, new OldTheoreticalValuesFunction(f), target, weights, initialGuess);
		}else {
			optimum = optimizer.optimize(maxEval, new TheoreticalValuesFunction(f), target, weights, initialGuess);
		}
		return optimum.getPointRef();
	}

	@java.lang.Deprecated
	private class OldTheoreticalValuesFunction implements org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction {
		private final org.apache.commons.math3.analysis.ParametricUnivariateFunction f;

		public OldTheoreticalValuesFunction(final org.apache.commons.math3.analysis.ParametricUnivariateFunction f) {
			this.f = f;
		}

		public org.apache.commons.math3.analysis.MultivariateMatrixFunction jacobian() {
			return new org.apache.commons.math3.analysis.MultivariateMatrixFunction() {
				public double[][] value(double[] point) {
					final double[][] jacobian = new double[observations.size()][];
					int i = 0;
					for (org.apache.commons.math3.optimization.fitting.WeightedObservedPoint observed : observations) {
						jacobian[(i++)] = f.gradient(observed.getX(), point);
					}
					return jacobian;
				}
			};
		}

		public double[] value(double[] point) {
			final double[] values = new double[observations.size()];
			int i = 0;
			for (org.apache.commons.math3.optimization.fitting.WeightedObservedPoint observed : observations) {
				values[(i++)] = f.value(observed.getX(), point);
			}
			return values;
		}
	}

	private class TheoreticalValuesFunction implements org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction {
		private final org.apache.commons.math3.analysis.ParametricUnivariateFunction f;

		public TheoreticalValuesFunction(final org.apache.commons.math3.analysis.ParametricUnivariateFunction f) {
			this.f = f;
		}

		public double[] value(double[] point) {
			final double[] values = new double[observations.size()];
			int i = 0;
			for (org.apache.commons.math3.optimization.fitting.WeightedObservedPoint observed : observations) {
				values[(i++)] = f.value(observed.getX(), point);
			}
			return values;
		}

		public org.apache.commons.math3.analysis.differentiation.DerivativeStructure[] value(org.apache.commons.math3.analysis.differentiation.DerivativeStructure[] point) {
			final double[] parameters = new double[point.length];
			for (int k = 0; k < (point.length); ++k) {
				parameters[k] = point[k].getValue();
			}
			final org.apache.commons.math3.analysis.differentiation.DerivativeStructure[] values = new org.apache.commons.math3.analysis.differentiation.DerivativeStructure[observations.size()];
			int i = 0;
			for (org.apache.commons.math3.optimization.fitting.WeightedObservedPoint observed : observations) {
				org.apache.commons.math3.analysis.differentiation.DerivativeStructure vi = new org.apache.commons.math3.analysis.differentiation.DerivativeStructure(point.length, 1, f.value(observed.getX(), parameters));
				for (int k = 0; k < (point.length); ++k) {
					vi = vi.add(new org.apache.commons.math3.analysis.differentiation.DerivativeStructure(point.length, 1, k, 0.0));
				}
				values[(i++)] = vi;
			}
			return values;
		}
	}
}

