

package org.apache.commons.math;


public class MathConfigurationException extends org.apache.commons.math.MathException implements java.io.Serializable {
	private static final long serialVersionUID = -7958299004965931723L;

	public MathConfigurationException() {
		this(null, null);
	}

	public MathConfigurationException(final java.lang.String message) {
		this(message, null);
	}

	public MathConfigurationException(final java.lang.String message, final java.lang.Throwable throwable) {
		super(message, throwable);
	}

	public MathConfigurationException(final java.lang.Throwable throwable) {
		this(null, throwable);
	}
}

