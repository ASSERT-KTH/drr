

package org.apache.commons.math.analysis.solvers;


public abstract class BaseAbstractUnivariateRealSolver<FUNC extends org.apache.commons.math.analysis.UnivariateRealFunction> implements org.apache.commons.math.analysis.solvers.BaseUnivariateRealSolver<FUNC> {
	private static final double DEFAULT_RELATIVE_ACCURACY = 1.0E-14;

	private static final double DEFAULT_FUNCTION_VALUE_ACCURACY = 1.0E-15;

	private final double functionValueAccuracy;

	private final double absoluteAccuracy;

	private final double relativeAccuracy;

	private final org.apache.commons.math.util.Incrementor evaluations = new org.apache.commons.math.util.Incrementor();

	private double searchMin;

	private double searchMax;

	private double searchStart;

	private FUNC function;

	protected BaseAbstractUnivariateRealSolver(final double absoluteAccuracy) {
		this(org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.DEFAULT_RELATIVE_ACCURACY, absoluteAccuracy, org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.DEFAULT_FUNCTION_VALUE_ACCURACY);
	}

	protected BaseAbstractUnivariateRealSolver(final double relativeAccuracy, final double absoluteAccuracy) {
		this(relativeAccuracy, absoluteAccuracy, org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.DEFAULT_FUNCTION_VALUE_ACCURACY);
	}

	protected BaseAbstractUnivariateRealSolver(final double relativeAccuracy, final double absoluteAccuracy, final double functionValueAccuracy) {
		this.absoluteAccuracy = absoluteAccuracy;
		this.relativeAccuracy = relativeAccuracy;
		this.functionValueAccuracy = functionValueAccuracy;
	}

	public int getMaxEvaluations() {
		return evaluations.getMaximalCount();
	}

	public int getEvaluations() {
		return evaluations.getCount();
	}

	public double getMin() {
		return searchMin;
	}

	public double getMax() {
		return searchMax;
	}

	public double getStartValue() {
		return searchStart;
	}

	public double getAbsoluteAccuracy() {
		return absoluteAccuracy;
	}

	public double getRelativeAccuracy() {
		return relativeAccuracy;
	}

	public double getFunctionValueAccuracy() {
		return functionValueAccuracy;
	}

	protected double computeObjectiveValue(double point) {
		incrementEvaluationCount();
		return function.value(point);
	}

	protected void setup(int maxEval, FUNC f, double min, double max, double startValue) {
		if (f == null) {
			throw new org.apache.commons.math.exception.NullArgumentException();
		}
		searchMin = min;
		searchMax = max;
		searchStart = startValue;
		function = f;
		evaluations.setMaximalCount(maxEval);
		evaluations.resetCount();
	}

	public double solve(int maxEval, FUNC f, double min, double max, double startValue) {
		setup(maxEval, f, min, max, startValue);
		return doSolve();
	}

	public double solve(int maxEval, FUNC f, double min, double max) {
		return solve(maxEval, f, min, max, (min + (0.5 * (max - min))));
	}

	public double solve(int maxEval, FUNC f, double startValue) {
		return solve(maxEval, f, java.lang.Double.NaN, java.lang.Double.NaN, startValue);
	}

	protected abstract double doSolve();

	protected boolean isBracketing(final double lower, final double upper) {
		return org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(function, lower, upper);
	}

	protected boolean isSequence(final double start, final double mid, final double end) {
		return org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(start, mid, end);
	}

	protected void verifyInterval(final double lower, final double upper) {
		org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(lower, upper);
	}

	protected void verifySequence(final double lower, final double initial, final double upper) {
		org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(lower, initial, upper);
	}

	protected void verifyBracketing(final double lower, final double upper) {
		org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(function, lower, upper);
	}

	protected void incrementEvaluationCount() {
		try {
			evaluations.incrementCount();
		} catch (org.apache.commons.math.exception.MaxCountExceededException e) {
			throw new org.apache.commons.math.exception.TooManyEvaluationsException(e.getMax());
		}
	}
}

