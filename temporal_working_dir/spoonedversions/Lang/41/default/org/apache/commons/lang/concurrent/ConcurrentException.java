

package org.apache.commons.lang.concurrent;


public class ConcurrentException extends java.lang.Exception {
	private static final long serialVersionUID = 6622707671812226130L;

	protected ConcurrentException() {
		super();
	}

	public ConcurrentException(java.lang.Throwable cause) {
		super(org.apache.commons.lang.concurrent.ConcurrentUtils.checkedException(cause));
	}

	public ConcurrentException(java.lang.String msg, java.lang.Throwable cause) {
		super(msg, org.apache.commons.lang.concurrent.ConcurrentUtils.checkedException(cause));
	}
}

