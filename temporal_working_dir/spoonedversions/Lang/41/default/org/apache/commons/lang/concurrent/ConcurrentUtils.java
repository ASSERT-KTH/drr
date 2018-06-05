

package org.apache.commons.lang.concurrent;


public class ConcurrentUtils {
	private ConcurrentUtils() {
	}

	public static org.apache.commons.lang.concurrent.ConcurrentException extractCause(java.util.concurrent.ExecutionException ex) {
		if ((ex == null) || ((ex.getCause()) == null)) {
			return null;
		}
		org.apache.commons.lang.concurrent.ConcurrentUtils.throwCause(ex);
		return new org.apache.commons.lang.concurrent.ConcurrentException(ex.getMessage(), ex.getCause());
	}

	public static void handleCause(java.util.concurrent.ExecutionException ex) throws org.apache.commons.lang.concurrent.ConcurrentException {
		org.apache.commons.lang.concurrent.ConcurrentException cex = org.apache.commons.lang.concurrent.ConcurrentUtils.extractCause(ex);
		if (cex != null) {
			throw cex;
		}
	}

	static java.lang.Throwable checkedException(java.lang.Throwable ex) {
		if (((ex != null) && (!(ex instanceof java.lang.RuntimeException))) && (!(ex instanceof java.lang.Error))) {
			return ex;
		}else {
			throw new java.lang.IllegalArgumentException(("Not a checked exception: " + ex));
		}
	}

	private static void throwCause(java.util.concurrent.ExecutionException ex) {
		if ((ex.getCause()) instanceof java.lang.RuntimeException) {
			throw ((java.lang.RuntimeException) (ex.getCause()));
		}
		if ((ex.getCause()) instanceof java.lang.Error) {
			throw ((java.lang.Error) (ex.getCause()));
		}
	}
}

