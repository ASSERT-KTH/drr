

package org.apache.commons.math3.fitting;


public class CurveFitter<T extends org.apache.commons.math3.analysis.ParametricUnivariateFunction> {
	private final org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer optimizer;

	private final java.util.List<org.apache.commons.math3.fitting.WeightedObservedPoint> observations;

	public CurveFitter(final org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer optimizer) {
		this.optimizer = optimizer;
		observations = new java.util.ArrayList<org.apache.commons.math3.fitting.WeightedObservedPoint>();
	}

	public void addObservedPoint(double x, double y) {
		addObservedPoint(1.0, x, y);
	}

	public void addObservedPoint(double weight, double x, double y) {
		observations.add(new org.apache.commons.math3.fitting.WeightedObservedPoint(weight, x, y));
	}

	public void addObservedPoint(org.apache.commons.math3.fitting.WeightedObservedPoint observed) {
		observations.add(observed);
	}

	public org.apache.commons.math3.fitting.WeightedObservedPoint[] getObservations() {
		return observations.toArray(new org.apache.commons.math3.fitting.WeightedObservedPoint[observations.size()]);
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
		for (org.apache.commons.math3.fitting.WeightedObservedPoint point : observations) {
			target[i] = point.getY();
			weights[i] = point.getWeight();
			++i;
		}
		final org.apache.commons.math3.fitting.CurveFitter<T>.TheoreticalValuesFunction model = new TheoreticalValuesFunction(f);
		final org.apache.commons.math3.optim.PointVectorValuePair optimum = optimizer.optimize(new org.apache.commons.math3.optim.MaxEval(maxEval), model.getModelFunction(), model.getModelFunctionJacobian(), new org.apache.commons.math3.optim.nonlinear.vector.Target(target), new org.apache.commons.math3.optim.nonlinear.vector.Weight(weights), new org.apache.commons.math3.optim.InitialGuess(initialGuess));
		return optimum.getPointRef();
	}

	private class TheoreticalValuesFunction {
		private final org.apache.commons.math3.analysis.ParametricUnivariateFunction f;

		public TheoreticalValuesFunction(final org.apache.commons.math3.analysis.ParametricUnivariateFunction f) {
			this.f = f;
		}

		public org.apache.commons.math3.optim.nonlinear.vector.ModelFunction getModelFunction() {
			return new org.apache.commons.math3.optim.nonlinear.vector.ModelFunction(new org.apache.commons.math3.analysis.MultivariateVectorFunction() {
				public double[] value(double[] point) {
					final double[] values = new double[observations.size()];
					int i = 0;
					for (org.apache.commons.math3.fitting.WeightedObservedPoint observed : observations) {
						values[(i++)] = f.value(observed.getX(), point);
					}
					return values;
				}
			});
		}

		public org.apache.commons.math3.optim.nonlinear.vector.ModelFunctionJacobian getModelFunctionJacobian() {
			return new org.apache.commons.math3.optim.nonlinear.vector.ModelFunctionJacobian(new org.apache.commons.math3.analysis.MultivariateMatrixFunction() {
				public double[][] value(double[] point) {
					final double[][] jacobian = new double[observations.size()][];
					int i = 0;
					for (org.apache.commons.math3.fitting.WeightedObservedPoint observed : observations) {
						jacobian[(i++)] = f.gradient(observed.getX(), point);
					}
					return jacobian;
				}
			});
		}
	}
}

