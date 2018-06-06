

package org.apache.commons.math;


public class FunctionEvaluationException extends org.apache.commons.math.MathException {
	private static final long serialVersionUID = -4305020489115478365L;

	private double[] argument;

	public FunctionEvaluationException(double argument) {
		super("evaluation failed for argument = {0}", argument);
		org.apache.commons.math.FunctionEvaluationException.this.argument = new double[]{ argument };
	}

	public FunctionEvaluationException(double[] argument) {
		super("evaluation failed for argument = {0}", new org.apache.commons.math.linear.ArrayRealVector(argument));
		org.apache.commons.math.FunctionEvaluationException.this.argument = argument.clone();
	}

	public FunctionEvaluationException(double argument, java.lang.String pattern, java.lang.Object... arguments) {
		super(pattern, arguments);
		org.apache.commons.math.FunctionEvaluationException.this.argument = new double[]{ argument };
	}

	public FunctionEvaluationException(double[] argument, java.lang.String pattern, java.lang.Object... arguments) {
		super(pattern, arguments);
		org.apache.commons.math.FunctionEvaluationException.this.argument = argument.clone();
	}

	public FunctionEvaluationException(java.lang.Throwable cause, double argument) {
		super(cause);
		org.apache.commons.math.FunctionEvaluationException.this.argument = new double[]{ argument };
	}

	public FunctionEvaluationException(java.lang.Throwable cause, double[] argument) {
		super(cause);
		org.apache.commons.math.FunctionEvaluationException.this.argument = argument.clone();
	}

	public FunctionEvaluationException(java.lang.Throwable cause, double argument, java.lang.String pattern, java.lang.Object... arguments) {
		super(cause, pattern, arguments);
		org.apache.commons.math.FunctionEvaluationException.this.argument = new double[]{ argument };
	}

	public FunctionEvaluationException(java.lang.Throwable cause, double[] argument, java.lang.String pattern, java.lang.Object... arguments) {
		super(cause, pattern, arguments);
		org.apache.commons.math.FunctionEvaluationException.this.argument = argument.clone();
	}

	public double[] getArgument() {
		return argument.clone();
	}
}

