

package org.apache.commons.math;


public class MathConfigurationException extends org.apache.commons.math.MathException implements java.io.Serializable {
	private static final long serialVersionUID = 5261476508226103366L;

	public MathConfigurationException() {
		super();
	}

	public MathConfigurationException(java.lang.String pattern, java.lang.Object... arguments) {
		this(new org.apache.commons.math.util.DummyLocalizable(pattern), arguments);
	}

	public MathConfigurationException(org.apache.commons.math.util.Localizable pattern, java.lang.Object... arguments) {
		super(pattern, arguments);
	}

	public MathConfigurationException(java.lang.Throwable cause) {
		super(cause);
	}

	public MathConfigurationException(java.lang.Throwable cause, java.lang.String pattern, java.lang.Object... arguments) {
		this(cause, new org.apache.commons.math.util.DummyLocalizable(pattern), arguments);
	}

	public MathConfigurationException(java.lang.Throwable cause, org.apache.commons.math.util.Localizable pattern, java.lang.Object... arguments) {
		super(cause, pattern, arguments);
	}
}

