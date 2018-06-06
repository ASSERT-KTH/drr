

package org.apache.commons.math3.optimization.fitting;


public class CurveFitter<T extends org.apache.commons.math3.analysis.ParametricUnivariateFunction> {
	private final org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer optimizer;

	private final java.util.List<org.apache.commons.math3.optimization.fitting.WeightedObservedPoint> observations;

	public CurveFitter(final org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer optimizer) {
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
		org.apache.commons.math3.optimization.PointVectorValuePair optimum = optimizer.optimize(maxEval, new TheoreticalValuesFunction(f), target, weights, initialGuess);
		return optimum.getPointRef();
	}

	private class TheoreticalValuesFunction implements org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction {
		private final org.apache.commons.math3.analysis.ParametricUnivariateFunction f;

		public TheoreticalValuesFunction(final org.apache.commons.math3.analysis.ParametricUnivariateFunction f) {
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
}

