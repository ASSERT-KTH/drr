

package org.apache.commons.math3.optimization.direct;


@java.lang.Deprecated
public abstract class BaseAbstractMultivariateVectorOptimizer<FUNC extends org.apache.commons.math3.analysis.MultivariateVectorFunction> implements org.apache.commons.math3.optimization.BaseMultivariateVectorOptimizer<FUNC> {
	protected final org.apache.commons.math3.util.Incrementor evaluations = new org.apache.commons.math3.util.Incrementor();

	private org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointVectorValuePair> checker;

	private double[] target;

	private org.apache.commons.math3.linear.RealMatrix weightMatrix;

	private double[] weight;

	private double[] start;

	private FUNC function;

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

	@java.lang.Deprecated
	public org.apache.commons.math3.optimization.PointVectorValuePair optimize(int maxEval, FUNC f, double[] t, double[] w, double[] startPoint) {
		return optimizeInternal(maxEval, f, t, w, startPoint);
	}

	protected org.apache.commons.math3.optimization.PointVectorValuePair optimize(int maxEval, FUNC f, org.apache.commons.math3.optimization.OptimizationData... optData) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.TooManyEvaluationsException {
		return optimizeInternal(maxEval, f, optData);
	}

	@java.lang.Deprecated
	protected org.apache.commons.math3.optimization.PointVectorValuePair optimizeInternal(final int maxEval, final FUNC f, final double[] t, final double[] w, final double[] startPoint) {
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
		return optimizeInternal(maxEval, f, new org.apache.commons.math3.optimization.Target(t), new org.apache.commons.math3.optimization.Weight(w), new org.apache.commons.math3.optimization.InitialGuess(startPoint));
	}

	protected org.apache.commons.math3.optimization.PointVectorValuePair optimizeInternal(int maxEval, FUNC f, org.apache.commons.math3.optimization.OptimizationData... optData) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.TooManyEvaluationsException {
		evaluations.setMaximalCount(maxEval);
		evaluations.resetCount();
		function = f;
		parseOptimizationData(optData);
		checkParameters();
		setUp();
		return doOptimize();
	}

	public double[] getStartPoint() {
		return start.clone();
	}

	public org.apache.commons.math3.linear.RealMatrix getWeight() {
		return weightMatrix.copy();
	}

	public double[] getTarget() {
		return target.clone();
	}

	protected FUNC getObjectiveFunction() {
		return function;
	}

	protected abstract org.apache.commons.math3.optimization.PointVectorValuePair doOptimize();

	@java.lang.Deprecated
	protected double[] getTargetRef() {
		return target;
	}

	@java.lang.Deprecated
	protected double[] getWeightRef() {
		return weight;
	}

	protected void setUp() {
		final int dim = target.length;
		weight = new double[dim];
		for (int i = 0; i < dim; i++) {
			weight[i] = weightMatrix.getEntry(i, i);
		}
	}

	private void parseOptimizationData(org.apache.commons.math3.optimization.OptimizationData... optData) {
		for (org.apache.commons.math3.optimization.OptimizationData data : optData) {
			if (data instanceof org.apache.commons.math3.optimization.Target) {
				target = ((org.apache.commons.math3.optimization.Target) (data)).getTarget();
				continue;
			}
			if (data instanceof org.apache.commons.math3.optimization.Weight) {
				weightMatrix = ((org.apache.commons.math3.optimization.Weight) (data)).getWeight();
				continue;
			}
			if (data instanceof org.apache.commons.math3.optimization.InitialGuess) {
				start = ((org.apache.commons.math3.optimization.InitialGuess) (data)).getInitialGuess();
				continue;
			}
		}
	}

	private void checkParameters() {
		if ((target.length) != (weightMatrix.getColumnDimension())) {
			throw new org.apache.commons.math3.exception.DimensionMismatchException(target.length, weightMatrix.getColumnDimension());
		}
	}
}

