

package org.apache.commons.math;


public class FunctionEvaluationException extends org.apache.commons.math.MathException {
	private static final long serialVersionUID = -317289374378977972L;

	private double argument = java.lang.Double.NaN;

	public FunctionEvaluationException(double argument) {
		this(argument, ("Evaluation failed for argument = " + argument));
	}

	public FunctionEvaluationException(double argument, java.lang.String message) {
		this(argument, message, null);
	}

	public FunctionEvaluationException(double argument, java.lang.String message, java.lang.Throwable cause) {
		super(((message + " Evaluation failed for argument=") + argument), cause);
		org.apache.commons.math.FunctionEvaluationException.this.argument = argument;
	}

	public double getArgument() {
		return org.apache.commons.math.FunctionEvaluationException.this.argument;
	}
}

