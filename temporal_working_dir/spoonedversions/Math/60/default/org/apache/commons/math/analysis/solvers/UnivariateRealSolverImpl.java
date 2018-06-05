

package org.apache.commons.math.analysis.solvers;


@java.lang.Deprecated
public abstract class UnivariateRealSolverImpl extends org.apache.commons.math.ConvergingAlgorithmImpl {
	protected double functionValueAccuracy;

	protected double defaultFunctionValueAccuracy;

	protected boolean resultComputed = false;

	protected double result;

	protected double functionValue;

	protected UnivariateRealSolverImpl(final int defaultMaximalIterationCount, final double defaultAbsoluteAccuracy) {
		super(defaultMaximalIterationCount, defaultAbsoluteAccuracy);
		org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.this.defaultFunctionValueAccuracy = 1.0E-15;
		org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.this.functionValueAccuracy = defaultFunctionValueAccuracy;
	}

	protected void checkResultComputed() throws java.lang.IllegalStateException {
		if (!(resultComputed)) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalStateException(org.apache.commons.math.exception.util.LocalizedFormats.NO_RESULT_AVAILABLE);
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

	protected final void setResult(final double newResult, final int iterationCount) {
		org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.this.result = newResult;
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

	protected boolean isBracketing(final double lower, final double upper, final org.apache.commons.math.analysis.UnivariateRealFunction function) throws org.apache.commons.math.exception.MathUserException {
		final double f1 = function.value(lower);
		final double f2 = function.value(upper);
		return ((f1 > 0) && (f2 < 0)) || ((f1 < 0) && (f2 > 0));
	}

	protected boolean isSequence(final double start, final double mid, final double end) {
		return (start < mid) && (mid < end);
	}

	protected void verifyInterval(final double lower, final double upper) {
		if (lower >= upper) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(org.apache.commons.math.exception.util.LocalizedFormats.ENDPOINTS_NOT_AN_INTERVAL, lower, upper);
		}
	}

	protected void verifySequence(final double lower, final double initial, final double upper) {
		if (!(isSequence(lower, initial, upper))) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(org.apache.commons.math.exception.util.LocalizedFormats.INVALID_INTERVAL_INITIAL_VALUE_PARAMETERS, lower, initial, upper);
		}
	}

	protected void verifyBracketing(final double lower, final double upper, final org.apache.commons.math.analysis.UnivariateRealFunction function) throws org.apache.commons.math.exception.MathUserException {
		verifyInterval(lower, upper);
		if (!(isBracketing(lower, upper, function))) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(org.apache.commons.math.exception.util.LocalizedFormats.SAME_SIGN_AT_ENDPOINTS, lower, upper, function.value(lower), function.value(upper));
		}
	}
}

