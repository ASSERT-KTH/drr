

package org.apache.commons.lang3.exception;


public class CloneFailedException extends java.lang.RuntimeException {
	private static final long serialVersionUID = 20091223L;

	public CloneFailedException(final java.lang.String message) {
		super(message);
	}

	public CloneFailedException(final java.lang.Throwable cause) {
		super(cause);
	}

	public CloneFailedException(final java.lang.String message, final java.lang.Throwable cause) {
		super(message, cause);
	}
}

