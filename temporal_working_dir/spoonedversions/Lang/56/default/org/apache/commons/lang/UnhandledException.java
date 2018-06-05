

package org.apache.commons.lang;


public class UnhandledException extends org.apache.commons.lang.exception.NestableRuntimeException {
	private static final long serialVersionUID = 1832101364842773720L;

	public UnhandledException(java.lang.Throwable cause) {
		super(cause);
	}

	public UnhandledException(java.lang.String message, java.lang.Throwable cause) {
		super(message, cause);
	}
}

