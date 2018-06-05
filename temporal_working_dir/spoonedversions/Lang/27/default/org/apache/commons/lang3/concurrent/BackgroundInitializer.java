

package org.apache.commons.lang3.concurrent;


public abstract class BackgroundInitializer<T> implements org.apache.commons.lang3.concurrent.ConcurrentInitializer<T> {
	private java.util.concurrent.ExecutorService externalExecutor;

	private java.util.concurrent.ExecutorService executor;

	private java.util.concurrent.Future<T> future;

	protected BackgroundInitializer() {
		this(null);
	}

	protected BackgroundInitializer(java.util.concurrent.ExecutorService exec) {
		setExternalExecutor(exec);
	}

	public final synchronized java.util.concurrent.ExecutorService getExternalExecutor() {
		return externalExecutor;
	}

	public synchronized boolean isStarted() {
		return (future) != null;
	}

	public final synchronized void setExternalExecutor(java.util.concurrent.ExecutorService externalExecutor) {
		if (isStarted()) {
			throw new java.lang.IllegalStateException("Cannot set ExecutorService after start()!");
		}
		org.apache.commons.lang3.concurrent.BackgroundInitializer.this.externalExecutor = externalExecutor;
	}

	public synchronized boolean start() {
		if (!(isStarted())) {
			java.util.concurrent.ExecutorService tempExec;
			executor = getExternalExecutor();
			if ((executor) == null) {
				executor = tempExec = createExecutor();
			}else {
				tempExec = null;
			}
			future = executor.submit(createTask(tempExec));
			return true;
		}
		return false;
	}

	public T get() throws org.apache.commons.lang3.concurrent.ConcurrentException {
		try {
			return getFuture().get();
		} catch (java.util.concurrent.ExecutionException execex) {
			org.apache.commons.lang3.concurrent.ConcurrentUtils.handleCause(execex);
			return null;
		} catch (java.lang.InterruptedException iex) {
			java.lang.Thread.currentThread().interrupt();
			throw new org.apache.commons.lang3.concurrent.ConcurrentException(iex);
		}
	}

	public synchronized java.util.concurrent.Future<T> getFuture() {
		if ((future) == null) {
			throw new java.lang.IllegalStateException("start() must be called first!");
		}
		return future;
	}

	protected final synchronized java.util.concurrent.ExecutorService getActiveExecutor() {
		return executor;
	}

	protected int getTaskCount() {
		return 1;
	}

	protected abstract T initialize() throws java.lang.Exception;

	private java.util.concurrent.Callable<T> createTask(java.util.concurrent.ExecutorService execDestroy) {
		return new InitializationTask(execDestroy);
	}

	private java.util.concurrent.ExecutorService createExecutor() {
		return java.util.concurrent.Executors.newFixedThreadPool(getTaskCount());
	}

	private class InitializationTask implements java.util.concurrent.Callable<T> {
		private final java.util.concurrent.ExecutorService execFinally;

		public InitializationTask(java.util.concurrent.ExecutorService exec) {
			execFinally = exec;
		}

		public T call() throws java.lang.Exception {
			try {
				return initialize();
			} finally {
				if ((execFinally) != null) {
					execFinally.shutdown();
				}
			}
		}
	}
}

