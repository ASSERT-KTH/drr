

package org.apache.commons.math.optimization;


public class OptimizationException extends org.apache.commons.math.ConvergenceException {
	private static final long serialVersionUID = -4605887730798282127L;

	@java.lang.Deprecated
	public OptimizationException(java.lang.String specifier, java.lang.Object... parts) {
		this(new org.apache.commons.math.exception.util.DummyLocalizable(specifier), parts);
	}

	public OptimizationException(org.apache.commons.math.exception.util.Localizable specifier, java.lang.Object... parts) {
		super(specifier, parts);
	}

	public OptimizationException(java.lang.Throwable cause) {
		super(cause);
	}
}

