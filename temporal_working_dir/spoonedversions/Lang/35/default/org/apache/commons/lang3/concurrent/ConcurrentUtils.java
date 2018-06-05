

package org.apache.commons.lang3.concurrent;


public class ConcurrentUtils {
	private ConcurrentUtils() {
	}

	public static org.apache.commons.lang3.concurrent.ConcurrentException extractCause(java.util.concurrent.ExecutionException ex) {
		if ((ex == null) || ((ex.getCause()) == null)) {
			return null;
		}
		org.apache.commons.lang3.concurrent.ConcurrentUtils.throwCause(ex);
		return new org.apache.commons.lang3.concurrent.ConcurrentException(ex.getMessage(), ex.getCause());
	}

	public static void handleCause(java.util.concurrent.ExecutionException ex) throws org.apache.commons.lang3.concurrent.ConcurrentException {
		org.apache.commons.lang3.concurrent.ConcurrentException cex = org.apache.commons.lang3.concurrent.ConcurrentUtils.extractCause(ex);
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

	public static <T> java.util.concurrent.Future<T> constantFuture(T value) {
		return new org.apache.commons.lang3.concurrent.ConcurrentUtils.ConstantFuture<T>(value);
	}

	static final class ConstantFuture<T> implements java.util.concurrent.Future<T> {
		private final T value;

		ConstantFuture(T value) {
			this.value = value;
		}

		public boolean isDone() {
			return true;
		}

		public T get() {
			return value;
		}

		public T get(long timeout, java.util.concurrent.TimeUnit unit) {
			return value;
		}

		public boolean isCancelled() {
			return false;
		}

		public boolean cancel(boolean mayInterruptIfRunning) {
			return false;
		}
	}
}

