

package org.apache.commons.math;


public class MathException extends java.lang.Exception {
	private static final long serialVersionUID = -8594613561393443827L;

	private static final boolean JDK_SUPPORTS_NESTED;

	static {
		boolean flag = false;
		try {
			java.lang.Throwable.class.getDeclaredMethod("getCause", new java.lang.Class[0]);
			flag = true;
		} catch (java.lang.NoSuchMethodException ex) {
			flag = false;
		}
		JDK_SUPPORTS_NESTED = flag;
	}

	private final java.lang.Throwable rootCause;

	public MathException() {
		super();
		this.rootCause = null;
	}

	public MathException(java.lang.String msg) {
		super(msg);
		this.rootCause = null;
	}

	public MathException(java.lang.Throwable rootCause) {
		super((rootCause == null ? null : rootCause.getMessage()));
		this.rootCause = rootCause;
	}

	public MathException(java.lang.String msg, java.lang.Throwable rootCause) {
		super(msg);
		this.rootCause = rootCause;
	}

	public java.lang.Throwable getCause() {
		return rootCause;
	}

	public void printStackTrace() {
		printStackTrace(java.lang.System.err);
	}

	public void printStackTrace(java.io.PrintStream out) {
		synchronized(out) {
			java.io.PrintWriter pw = new java.io.PrintWriter(out, false);
			printStackTrace(pw);
			pw.flush();
		}
	}

	public void printStackTrace(java.io.PrintWriter out) {
		synchronized(out) {
			super.printStackTrace(out);
			if (((rootCause) != null) && ((org.apache.commons.math.MathException.JDK_SUPPORTS_NESTED) == false)) {
				out.print("Caused by: ");
				rootCause.printStackTrace(out);
			}
		}
	}
}

