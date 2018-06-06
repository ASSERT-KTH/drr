

package org.apache.commons.math3.analysis.solvers;


public abstract class BaseAbstractUnivariateSolver<FUNC extends org.apache.commons.math3.analysis.UnivariateFunction> implements org.apache.commons.math3.analysis.solvers.BaseUnivariateSolver<FUNC> {
	private static final double DEFAULT_RELATIVE_ACCURACY = 1.0E-14;

	private static final double DEFAULT_FUNCTION_VALUE_ACCURACY = 1.0E-15;

	private final double functionValueAccuracy;

	private final double absoluteAccuracy;

	private final double relativeAccuracy;

	private final org.apache.commons.math3.util.Incrementor evaluations = new org.apache.commons.math3.util.Incrementor();

	private double searchMin;

	private double searchMax;

	private double searchStart;

	private FUNC function;

	protected BaseAbstractUnivariateSolver(final double absoluteAccuracy) {
		this(org.apache.commons.math3.analysis.solvers.BaseAbstractUnivariateSolver.DEFAULT_RELATIVE_ACCURACY, absoluteAccuracy, org.apache.commons.math3.analysis.solvers.BaseAbstractUnivariateSolver.DEFAULT_FUNCTION_VALUE_ACCURACY);
	}

	protected BaseAbstractUnivariateSolver(final double relativeAccuracy, final double absoluteAccuracy) {
		this(relativeAccuracy, absoluteAccuracy, org.apache.commons.math3.analysis.solvers.BaseAbstractUnivariateSolver.DEFAULT_FUNCTION_VALUE_ACCURACY);
	}

	protected BaseAbstractUnivariateSolver(final double relativeAccuracy, final double absoluteAccuracy, final double functionValueAccuracy) {
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

	protected double computeObjectiveValue(double point) throws org.apache.commons.math3.exception.TooManyEvaluationsException {
		incrementEvaluationCount();
		return function.value(point);
	}

	protected void setup(int maxEval, FUNC f, double min, double max, double startValue) {
		org.apache.commons.math3.util.MathUtils.checkNotNull(f);
		searchMin = min;
		searchMax = max;
		searchStart = startValue;
		function = f;
		evaluations.setMaximalCount(maxEval);
		evaluations.resetCount();
	}

	public double solve(int maxEval, FUNC f, double min, double max, double startValue) throws org.apache.commons.math3.exception.NoBracketingException, org.apache.commons.math3.exception.TooManyEvaluationsException {
		setup(maxEval, f, min, max, startValue);
		return doSolve();
	}

	public double solve(int maxEval, FUNC f, double min, double max) {
		return solve(maxEval, f, min, max, (min + (0.5 * (max - min))));
	}

	public double solve(int maxEval, FUNC f, double startValue) throws org.apache.commons.math3.exception.NoBracketingException, org.apache.commons.math3.exception.TooManyEvaluationsException {
		return solve(maxEval, f, java.lang.Double.NaN, java.lang.Double.NaN, startValue);
	}

	protected abstract double doSolve() throws org.apache.commons.math3.exception.NoBracketingException, org.apache.commons.math3.exception.TooManyEvaluationsException;

	protected boolean isBracketing(final double lower, final double upper) {
		return org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils.isBracketing(function, lower, upper);
	}

	protected boolean isSequence(final double start, final double mid, final double end) {
		return org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils.isSequence(start, mid, end);
	}

	protected void verifyInterval(final double lower, final double upper) throws org.apache.commons.math3.exception.NumberIsTooLargeException {
		org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils.verifyInterval(lower, upper);
	}

	protected void verifySequence(final double lower, final double initial, final double upper) throws org.apache.commons.math3.exception.NumberIsTooLargeException {
		org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils.verifySequence(lower, initial, upper);
	}

	protected void verifyBracketing(final double lower, final double upper) throws org.apache.commons.math3.exception.NoBracketingException, org.apache.commons.math3.exception.NullArgumentException {
		org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils.verifyBracketing(function, lower, upper);
	}

	protected void incrementEvaluationCount() throws org.apache.commons.math3.exception.TooManyEvaluationsException {
		try {
			evaluations.incrementCount();
		} catch (org.apache.commons.math3.exception.MaxCountExceededException e) {
			throw new org.apache.commons.math3.exception.TooManyEvaluationsException(e.getMax());
		}
	}
}

