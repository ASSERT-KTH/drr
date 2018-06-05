

package org.apache.commons.math;


public class FunctionEvaluationException extends org.apache.commons.math.MathException {
	private static final long serialVersionUID = -7619974756160279127L;

	private double argument = java.lang.Double.NaN;

	public FunctionEvaluationException(double argument) {
		super("Evaluation failed for argument = {0}", new java.lang.Object[]{ new java.lang.Double(argument) });
		org.apache.commons.math.FunctionEvaluationException.this.argument = argument;
	}

	public FunctionEvaluationException(double argument, java.lang.String message) {
		super(message);
		org.apache.commons.math.FunctionEvaluationException.this.argument = argument;
	}

	public FunctionEvaluationException(double argument, java.lang.String pattern, java.lang.Object[] arguments) {
		super(pattern, arguments);
		org.apache.commons.math.FunctionEvaluationException.this.argument = argument;
	}

	public FunctionEvaluationException(double argument, java.lang.String message, java.lang.Throwable cause) {
		super(message, cause);
		org.apache.commons.math.FunctionEvaluationException.this.argument = argument;
	}

	public FunctionEvaluationException(double argument, java.lang.Throwable cause) {
		super(cause);
		org.apache.commons.math.FunctionEvaluationException.this.argument = argument;
	}

	public FunctionEvaluationException(double argument, java.lang.String pattern, java.lang.Object[] arguments, java.lang.Throwable cause) {
		super(pattern, arguments, cause);
		org.apache.commons.math.FunctionEvaluationException.this.argument = argument;
	}

	public double getArgument() {
		return org.apache.commons.math.FunctionEvaluationException.this.argument;
	}
}

