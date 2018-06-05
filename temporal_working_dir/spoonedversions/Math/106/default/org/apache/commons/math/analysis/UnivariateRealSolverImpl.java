

package org.apache.commons.math.analysis;


public abstract class UnivariateRealSolverImpl implements java.io.Serializable , org.apache.commons.math.analysis.UnivariateRealSolver {
	private static final long serialVersionUID = 1112491292565386596L;

	protected double absoluteAccuracy;

	protected double relativeAccuracy;

	protected double functionValueAccuracy;

	protected int maximalIterationCount;

	protected double defaultAbsoluteAccuracy;

	protected double defaultRelativeAccuracy;

	protected double defaultFunctionValueAccuracy;

	protected int defaultMaximalIterationCount;

	protected boolean resultComputed = false;

	protected double result;

	protected int iterationCount;

	protected org.apache.commons.math.analysis.UnivariateRealFunction f;

	protected UnivariateRealSolverImpl(org.apache.commons.math.analysis.UnivariateRealFunction f, int defaultMaximalIterationCount, double defaultAbsoluteAccuracy) {
		super();
		if (f == null) {
			throw new java.lang.IllegalArgumentException("function can not be null.");
		}
		org.apache.commons.math.analysis.UnivariateRealSolverImpl.this.f = f;
		org.apache.commons.math.analysis.UnivariateRealSolverImpl.this.defaultAbsoluteAccuracy = defaultAbsoluteAccuracy;
		org.apache.commons.math.analysis.UnivariateRealSolverImpl.this.defaultRelativeAccuracy = 1.0E-14;
		org.apache.commons.math.analysis.UnivariateRealSolverImpl.this.defaultFunctionValueAccuracy = 1.0E-15;
		org.apache.commons.math.analysis.UnivariateRealSolverImpl.this.absoluteAccuracy = defaultAbsoluteAccuracy;
		org.apache.commons.math.analysis.UnivariateRealSolverImpl.this.relativeAccuracy = defaultRelativeAccuracy;
		org.apache.commons.math.analysis.UnivariateRealSolverImpl.this.functionValueAccuracy = defaultFunctionValueAccuracy;
		org.apache.commons.math.analysis.UnivariateRealSolverImpl.this.defaultMaximalIterationCount = defaultMaximalIterationCount;
		org.apache.commons.math.analysis.UnivariateRealSolverImpl.this.maximalIterationCount = defaultMaximalIterationCount;
	}

	public double getResult() {
		if (resultComputed) {
			return result;
		}else {
			throw new java.lang.IllegalStateException("No result available");
		}
	}

	public int getIterationCount() {
		if (resultComputed) {
			return iterationCount;
		}else {
			throw new java.lang.IllegalStateException("No result available");
		}
	}

	protected final void setResult(double result, int iterationCount) {
		org.apache.commons.math.analysis.UnivariateRealSolverImpl.this.result = result;
		org.apache.commons.math.analysis.UnivariateRealSolverImpl.this.iterationCount = iterationCount;
		org.apache.commons.math.analysis.UnivariateRealSolverImpl.this.resultComputed = true;
	}

	protected final void clearResult() {
		org.apache.commons.math.analysis.UnivariateRealSolverImpl.this.resultComputed = false;
	}

	public void setAbsoluteAccuracy(double accuracy) {
		absoluteAccuracy = accuracy;
	}

	public double getAbsoluteAccuracy() {
		return absoluteAccuracy;
	}

	public void resetAbsoluteAccuracy() {
		absoluteAccuracy = defaultAbsoluteAccuracy;
	}

	public void setMaximalIterationCount(int count) {
		maximalIterationCount = count;
	}

	public int getMaximalIterationCount() {
		return maximalIterationCount;
	}

	public void resetMaximalIterationCount() {
		maximalIterationCount = defaultMaximalIterationCount;
	}

	public void setRelativeAccuracy(double accuracy) {
		relativeAccuracy = accuracy;
	}

	public double getRelativeAccuracy() {
		return relativeAccuracy;
	}

	public void resetRelativeAccuracy() {
		relativeAccuracy = defaultRelativeAccuracy;
	}

	public void setFunctionValueAccuracy(double accuracy) {
		functionValueAccuracy = accuracy;
	}

	public double getFunctionValueAccuracy() {
		return functionValueAccuracy;
	}

	public void resetFunctionValueAccuracy() {
		functionValueAccuracy = defaultFunctionValueAccuracy;
	}

	protected boolean isBracketing(double lower, double upper, org.apache.commons.math.analysis.UnivariateRealFunction f) throws org.apache.commons.math.FunctionEvaluationException {
		double f1 = f.value(lower);
		double f2 = f.value(upper);
		return ((f1 > 0) && (f2 < 0)) || ((f1 < 0) && (f2 > 0));
	}

	protected boolean isSequence(double start, double mid, double end) {
		return (start < mid) && (mid < end);
	}

	protected void verifyInterval(double lower, double upper) {
		if (lower >= upper) {
			throw new java.lang.IllegalArgumentException((((("Endpoints do not specify an interval: [" + lower) + ",") + upper) + "]"));
		}
	}

	protected void verifySequence(double lower, double initial, double upper) {
		if (!(isSequence(lower, initial, upper))) {
			throw new java.lang.IllegalArgumentException(((((("Invalid interval, initial value parameters:  lower=" + lower) + " initial=") + initial) + " upper=") + upper));
		}
	}

	protected void verifyBracketing(double lower, double upper, org.apache.commons.math.analysis.UnivariateRealFunction f) throws org.apache.commons.math.FunctionEvaluationException {
		verifyInterval(lower, upper);
		if (!(isBracketing(lower, upper, f))) {
			throw new java.lang.IllegalArgumentException((((((((((("Function values at endpoints do not have different signs." + "  Endpoints: [") + lower) + ",") + upper) + "]") + "  Values: [") + (f.value(lower))) + ",") + (f.value(upper))) + "]"));
		}
	}
}

