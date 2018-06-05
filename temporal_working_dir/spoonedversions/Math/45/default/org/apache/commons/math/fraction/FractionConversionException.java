

package org.apache.commons.math.fraction;


public class FractionConversionException extends org.apache.commons.math.exception.ConvergenceException {
	private static final long serialVersionUID = -4661812640132576263L;

	public FractionConversionException(double value, int maxIterations) {
		super(org.apache.commons.math.exception.util.LocalizedFormats.FAILED_FRACTION_CONVERSION, value, maxIterations);
	}

	public FractionConversionException(double value, long p, long q) {
		super(org.apache.commons.math.exception.util.LocalizedFormats.FRACTION_CONVERSION_OVERFLOW, value, p, q);
	}
}

