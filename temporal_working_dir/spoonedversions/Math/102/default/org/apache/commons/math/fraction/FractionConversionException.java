

package org.apache.commons.math.fraction;


public class FractionConversionException extends org.apache.commons.math.MaxIterationsExceededException {
	private static final long serialVersionUID = 4588659344016668813L;

	public FractionConversionException(double value, int maxIterations) {
		super(maxIterations, "Unable to convert {0} to fraction after {1} iterations", new java.lang.Object[]{ new java.lang.Double(value) , new java.lang.Integer(maxIterations) });
	}
}

