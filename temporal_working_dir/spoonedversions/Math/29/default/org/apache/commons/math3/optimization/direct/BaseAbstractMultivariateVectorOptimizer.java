

package org.apache.commons.math3.optimization.direct;


public abstract class BaseAbstractMultivariateVectorOptimizer<FUNC extends org.apache.commons.math3.analysis.MultivariateVectorFunction> implements org.apache.commons.math3.optimization.BaseMultivariateVectorOptimizer<FUNC> {
	protected final org.apache.commons.math3.util.Incrementor evaluations = new org.apache.commons.math3.util.Incrementor();

	private org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointVectorValuePair> checker;

	private double[] target;

	private double[] weight;

	private double[] start;

	private org.apache.commons.math3.analysis.MultivariateVectorFunction function;

	@java.lang.Deprecated
	protected BaseAbstractMultivariateVectorOptimizer() {
		this(new org.apache.commons.math3.optimization.SimpleVectorValueChecker());
	}

	protected BaseAbstractMultivariateVectorOptimizer(org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointVectorValuePair> checker) {
		org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.this.checker = checker;
	}

	public int getMaxEvaluations() {
		return evaluations.getMaximalCount();
	}

	public int getEvaluations() {
		return evaluations.getCount();
	}

	public org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointVectorValuePair> getConvergenceChecker() {
		return checker;
	}

	protected double[] computeObjectiveValue(double[] point) {
		try {
			evaluations.incrementCount();
		} catch (org.apache.commons.math3.exception.MaxCountExceededException e) {
			throw new org.apache.commons.math3.exception.TooManyEvaluationsException(e.getMax());
		}
		return function.value(point);
	}

	public org.apache.commons.math3.optimization.PointVectorValuePair optimize(int maxEval, FUNC f, double[] t, double[] w, double[] startPoint) {
		if (f == null) {
			throw new org.apache.commons.math3.exception.NullArgumentException();
		}
		if (t == null) {
			throw new org.apache.commons.math3.exception.NullArgumentException();
		}
		if (w == null) {
			throw new org.apache.commons.math3.exception.NullArgumentException();
		}
		if (startPoint == null) {
			throw new org.apache.commons.math3.exception.NullArgumentException();
		}
		if ((t.length) != (w.length)) {
			throw new org.apache.commons.math3.exception.DimensionMismatchException(t.length, w.length);
		}
		evaluations.setMaximalCount(maxEval);
		evaluations.resetCount();
		function = f;
		target = t.clone();
		weight = w.clone();
		start = startPoint.clone();
		return doOptimize();
	}

	public double[] getStartPoint() {
		return start.clone();
	}

	protected abstract org.apache.commons.math3.optimization.PointVectorValuePair doOptimize();

	protected double[] getTargetRef() {
		return target;
	}

	protected double[] getWeightRef() {
		return weight;
	}
}

