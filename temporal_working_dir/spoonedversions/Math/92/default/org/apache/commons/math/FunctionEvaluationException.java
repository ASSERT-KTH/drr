

package org.apache.commons.math;


public class FunctionEvaluationException extends org.apache.commons.math.MathException {
	private static final long serialVersionUID = -2193260774031645876L;

	private double argument = java.lang.Double.NaN;

	public FunctionEvaluationException(double argument) {
		super("Evaluation failed for argument = {0}", new java.lang.Object[]{ java.lang.Double.valueOf(argument) });
		org.apache.commons.math.FunctionEvaluationException.this.argument = argument;
	}

	public FunctionEvaluationException(double argument, java.lang.String pattern, java.lang.Object[] arguments) {
		super(pattern, arguments);
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

