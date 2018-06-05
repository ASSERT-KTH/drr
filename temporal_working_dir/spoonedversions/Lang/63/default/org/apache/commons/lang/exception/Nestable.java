

package org.apache.commons.lang.exception;


public interface Nestable {
	public java.lang.Throwable getCause();

	public java.lang.String getMessage();

	public java.lang.String getMessage(int index);

	public java.lang.String[] getMessages();

	public java.lang.Throwable getThrowable(int index);

	public int getThrowableCount();

	public java.lang.Throwable[] getThrowables();

	public int indexOfThrowable(java.lang.Class type);

	public int indexOfThrowable(java.lang.Class type, int fromIndex);

	public void printStackTrace(java.io.PrintWriter out);

	public void printStackTrace(java.io.PrintStream out);

	public void printPartialStackTrace(java.io.PrintWriter out);
}

