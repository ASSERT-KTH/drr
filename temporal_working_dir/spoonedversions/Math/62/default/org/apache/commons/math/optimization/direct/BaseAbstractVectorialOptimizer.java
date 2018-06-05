

package org.apache.commons.math.optimization.direct;


public abstract class BaseAbstractVectorialOptimizer<FUNC extends org.apache.commons.math.analysis.MultivariateVectorialFunction> implements org.apache.commons.math.optimization.BaseMultivariateVectorialOptimizer<FUNC> {
	protected final org.apache.commons.math.util.Incrementor evaluations = new org.apache.commons.math.util.Incrementor();

	private org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> checker;

	private double[] target;

	private double[] weight;

	private double[] start;

	private org.apache.commons.math.analysis.MultivariateVectorialFunction function;

	protected BaseAbstractVectorialOptimizer() {
		this(new org.apache.commons.math.optimization.SimpleVectorialValueChecker(), java.lang.Integer.MAX_VALUE);
	}

	protected BaseAbstractVectorialOptimizer(org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> checker, int maxEvaluations) {
		org.apache.commons.math.optimization.direct.BaseAbstractVectorialOptimizer.this.checker = checker;
		evaluations.setMaximalCount(maxEvaluations);
	}

	public void setMaxEvaluations(int maxEvaluations) {
		evaluations.setMaximalCount(maxEvaluations);
	}

	public int getMaxEvaluations() {
		return evaluations.getMaximalCount();
	}

	public int getEvaluations() {
		return evaluations.getCount();
	}

	public void setConvergenceChecker(org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> convergenceChecker) {
		org.apache.commons.math.optimization.direct.BaseAbstractVectorialOptimizer.this.checker = convergenceChecker;
	}

	public org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> getConvergenceChecker() {
		return checker;
	}

	protected double[] computeObjectiveValue(double[] point) throws org.apache.commons.math.FunctionEvaluationException {
		try {
			evaluations.incrementCount();
		} catch (org.apache.commons.math.exception.MaxCountExceededException e) {
			throw new org.apache.commons.math.exception.TooManyEvaluationsException(e.getMax());
		}
		return function.value(point);
	}

	public org.apache.commons.math.optimization.VectorialPointValuePair optimize(FUNC f, double[] t, double[] w, double[] startPoint) throws org.apache.commons.math.FunctionEvaluationException {
		if (f == null) {
			throw new org.apache.commons.math.exception.NullArgumentException();
		}
		if (t == null) {
			throw new org.apache.commons.math.exception.NullArgumentException();
		}
		if (w == null) {
			throw new org.apache.commons.math.exception.NullArgumentException();
		}
		if (startPoint == null) {
			throw new org.apache.commons.math.exception.NullArgumentException();
		}
		if ((t.length) != (w.length)) {
			throw new org.apache.commons.math.exception.DimensionMismatchException(t.length, w.length);
		}
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

	protected abstract org.apache.commons.math.optimization.VectorialPointValuePair doOptimize() throws org.apache.commons.math.FunctionEvaluationException;

	protected double[] getTargetRef() {
		return target;
	}

	protected double[] getWeightRef() {
		return weight;
	}
}

