

package org.apache.commons.math.analysis.solvers;


public abstract class UnivariateRealSolverImpl extends org.apache.commons.math.ConvergingAlgorithmImpl implements org.apache.commons.math.analysis.solvers.UnivariateRealSolver {
	protected double functionValueAccuracy;

	protected double defaultFunctionValueAccuracy;

	protected boolean resultComputed = false;

	protected double result;

	protected double functionValue;

	@java.lang.Deprecated
	protected org.apache.commons.math.analysis.UnivariateRealFunction f;

	@java.lang.Deprecated
	protected UnivariateRealSolverImpl(final org.apache.commons.math.analysis.UnivariateRealFunction f, final int defaultMaximalIterationCount, final double defaultAbsoluteAccuracy) {
		super(defaultMaximalIterationCount, defaultAbsoluteAccuracy);
		if (f == null) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("function to solve cannot be null");
		}
		org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.this.f = f;
		org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.this.defaultFunctionValueAccuracy = 1.0E-15;
		org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.this.functionValueAccuracy = defaultFunctionValueAccuracy;
	}

	protected UnivariateRealSolverImpl(final int defaultMaximalIterationCount, final double defaultAbsoluteAccuracy) {
		super(defaultMaximalIterationCount, defaultAbsoluteAccuracy);
		org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.this.defaultFunctionValueAccuracy = 1.0E-15;
		org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.this.functionValueAccuracy = defaultFunctionValueAccuracy;
	}

	protected void checkResultComputed() throws java.lang.IllegalStateException {
		if (!(resultComputed)) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalStateException("no result available");
		}
	}

	public double getResult() {
		checkResultComputed();
		return result;
	}

	public double getFunctionValue() {
		checkResultComputed();
		return functionValue;
	}

	public void setFunctionValueAccuracy(final double accuracy) {
		functionValueAccuracy = accuracy;
	}

	public double getFunctionValueAccuracy() {
		return functionValueAccuracy;
	}

	public void resetFunctionValueAccuracy() {
		functionValueAccuracy = defaultFunctionValueAccuracy;
	}

	protected final void setResult(final double result, final int iterationCount) {
		org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.this.result = result;
		org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.this.iterationCount = iterationCount;
		org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.this.resultComputed = true;
	}

	protected final void setResult(final double x, final double fx, final int iterationCount) {
		org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.this.result = x;
		org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.this.functionValue = fx;
		org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.this.iterationCount = iterationCount;
		org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.this.resultComputed = true;
	}

	protected final void clearResult() {
		org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.this.iterationCount = 0;
		org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.this.resultComputed = false;
	}

	protected boolean isBracketing(final double lower, final double upper, final org.apache.commons.math.analysis.UnivariateRealFunction f) throws org.apache.commons.math.FunctionEvaluationException {
		final double f1 = f.value(lower);
		final double f2 = f.value(upper);
		return ((f1 > 0) && (f2 < 0)) || ((f1 < 0) && (f2 > 0));
	}

	protected boolean isSequence(final double start, final double mid, final double end) {
		return (start < mid) && (mid < end);
	}

	protected void verifyInterval(final double lower, final double upper) {
		if (lower >= upper) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("endpoints do not specify an interval: [{0}, {1}]", lower, upper);
		}
	}

	protected void verifySequence(final double lower, final double initial, final double upper) {
		if (!(isSequence(lower, initial, upper))) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("invalid interval, initial value parameters:  lower={0}, initial={1}, upper={2}", lower, initial, upper);
		}
	}

	protected void verifyBracketing(final double lower, final double upper, final org.apache.commons.math.analysis.UnivariateRealFunction f) throws org.apache.commons.math.FunctionEvaluationException {
		verifyInterval(lower, upper);
		if (!(isBracketing(lower, upper, f))) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(("function values at endpoints do not have different signs.  " + "Endpoints: [{0}, {1}], Values: [{2}, {3}]"), lower, upper, f.value(lower), f.value(upper));
		}
	}
}

