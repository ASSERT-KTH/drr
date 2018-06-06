

package org.apache.commons.lang.exception;


public class NestableRuntimeException extends java.lang.RuntimeException implements org.apache.commons.lang.exception.Nestable {
	private static final long serialVersionUID = 1L;

	protected org.apache.commons.lang.exception.NestableDelegate delegate = new org.apache.commons.lang.exception.NestableDelegate(org.apache.commons.lang.exception.NestableRuntimeException.this);

	private java.lang.Throwable cause = null;

	public NestableRuntimeException() {
		super();
	}

	public NestableRuntimeException(java.lang.String msg) {
		super(msg);
	}

	public NestableRuntimeException(java.lang.Throwable cause) {
		super();
		org.apache.commons.lang.exception.NestableRuntimeException.this.cause = cause;
	}

	public NestableRuntimeException(java.lang.String msg, java.lang.Throwable cause) {
		super(msg);
		org.apache.commons.lang.exception.NestableRuntimeException.this.cause = cause;
	}

	public java.lang.Throwable getCause() {
		return cause;
	}

	public java.lang.String getMessage() {
		if ((super.getMessage()) != null) {
			return super.getMessage();
		}else
			if ((cause) != null) {
				return cause.toString();
			}else {
				return null;
			}
		
	}

	public java.lang.String getMessage(int index) {
		if (index == 0) {
			return super.getMessage();
		}
		return delegate.getMessage(index);
	}

	public java.lang.String[] getMessages() {
		return delegate.getMessages();
	}

	public java.lang.Throwable getThrowable(int index) {
		return delegate.getThrowable(index);
	}

	public int getThrowableCount() {
		return delegate.getThrowableCount();
	}

	public java.lang.Throwable[] getThrowables() {
		return delegate.getThrowables();
	}

	public int indexOfThrowable(java.lang.Class type) {
		return delegate.indexOfThrowable(type, 0);
	}

	public int indexOfThrowable(java.lang.Class type, int fromIndex) {
		return delegate.indexOfThrowable(type, fromIndex);
	}

	public void printStackTrace() {
		delegate.printStackTrace();
	}

	public void printStackTrace(java.io.PrintStream out) {
		delegate.printStackTrace(out);
	}

	public void printStackTrace(java.io.PrintWriter out) {
		delegate.printStackTrace(out);
	}

	public final void printPartialStackTrace(java.io.PrintWriter out) {
		super.printStackTrace(out);
	}
}

