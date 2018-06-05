

package org.apache.commons.math.optimization.univariate;


public abstract class AbstractUnivariateRealOptimizer extends org.apache.commons.math.ConvergingAlgorithmImpl implements org.apache.commons.math.optimization.UnivariateRealOptimizer {
	private static final long serialVersionUID = 4543031162377070699L;

	protected boolean resultComputed;

	protected double result;

	protected double functionValue;

	protected AbstractUnivariateRealOptimizer(final int defaultMaximalIterationCount, final double defaultAbsoluteAccuracy) {
		super(defaultMaximalIterationCount, defaultAbsoluteAccuracy);
		resultComputed = false;
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

	protected final void setResult(final double result, final int iterationCount) {
		org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.this.result = result;
		org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.this.iterationCount = iterationCount;
		org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.this.resultComputed = true;
	}

	protected final void setResult(final double x, final double fx, final int iterationCount) {
		org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.this.result = x;
		org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.this.functionValue = fx;
		org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.this.iterationCount = iterationCount;
		org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.this.resultComputed = true;
	}

	protected final void clearResult() {
		org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.this.resultComputed = false;
	}
}

