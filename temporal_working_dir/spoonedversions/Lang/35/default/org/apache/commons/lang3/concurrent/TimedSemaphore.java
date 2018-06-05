

package org.apache.commons.lang3.concurrent;


public class TimedSemaphore {
	public static final int NO_LIMIT = 0;

	private static final int THREAD_POOL_SIZE = 1;

	private final java.util.concurrent.ScheduledExecutorService executorService;

	private final long period;

	private final java.util.concurrent.TimeUnit unit;

	private final boolean ownExecutor;

	private java.util.concurrent.ScheduledFuture<?> task;

	private long totalAcquireCount;

	private long periodCount;

	private int limit;

	private int acquireCount;

	private int lastCallsPerPeriod;

	private boolean shutdown;

	public TimedSemaphore(long timePeriod, java.util.concurrent.TimeUnit timeUnit, int limit) {
		this(null, timePeriod, timeUnit, limit);
	}

	public TimedSemaphore(java.util.concurrent.ScheduledExecutorService service, long timePeriod, java.util.concurrent.TimeUnit timeUnit, int limit) {
		if (timePeriod <= 0) {
			throw new java.lang.IllegalArgumentException("Time period must be greater 0!");
		}
		period = timePeriod;
		unit = timeUnit;
		if (service != null) {
			executorService = service;
			ownExecutor = false;
		}else {
			java.util.concurrent.ScheduledThreadPoolExecutor s = new java.util.concurrent.ScheduledThreadPoolExecutor(org.apache.commons.lang3.concurrent.TimedSemaphore.THREAD_POOL_SIZE);
			s.setContinueExistingPeriodicTasksAfterShutdownPolicy(false);
			s.setExecuteExistingDelayedTasksAfterShutdownPolicy(false);
			executorService = s;
			ownExecutor = true;
		}
		setLimit(limit);
	}

	public final synchronized int getLimit() {
		return limit;
	}

	public final synchronized void setLimit(int limit) {
		org.apache.commons.lang3.concurrent.TimedSemaphore.this.limit = limit;
	}

	public synchronized void shutdown() {
		if (!(shutdown)) {
			if (ownExecutor) {
				getExecutorService().shutdownNow();
			}
			if ((task) != null) {
				task.cancel(false);
			}
			shutdown = true;
		}
	}

	public synchronized boolean isShutdown() {
		return shutdown;
	}

	public synchronized void acquire() throws java.lang.InterruptedException {
		if (isShutdown()) {
			throw new java.lang.IllegalStateException("TimedSemaphore is shut down!");
		}
		if ((task) == null) {
			task = startTimer();
		}
		boolean canPass = false;
		do {
			canPass = ((getLimit()) <= (org.apache.commons.lang3.concurrent.TimedSemaphore.NO_LIMIT)) || ((acquireCount) < (getLimit()));
			if (!canPass) {
				wait();
			}else {
				(acquireCount)++;
			}
		} while (!canPass );
	}

	public synchronized int getLastAcquiresPerPeriod() {
		return lastCallsPerPeriod;
	}

	public synchronized int getAcquireCount() {
		return acquireCount;
	}

	public synchronized int getAvailablePermits() {
		return (getLimit()) - (getAcquireCount());
	}

	public synchronized double getAverageCallsPerPeriod() {
		return (periodCount) == 0 ? 0 : ((double) (totalAcquireCount)) / ((double) (periodCount));
	}

	public long getPeriod() {
		return period;
	}

	public java.util.concurrent.TimeUnit getUnit() {
		return unit;
	}

	protected java.util.concurrent.ScheduledExecutorService getExecutorService() {
		return executorService;
	}

	protected java.util.concurrent.ScheduledFuture<?> startTimer() {
		return getExecutorService().scheduleAtFixedRate(new java.lang.Runnable() {
			public void run() {
				endOfPeriod();
			}
		}, getPeriod(), getPeriod(), getUnit());
	}

	synchronized void endOfPeriod() {
		lastCallsPerPeriod = acquireCount;
		totalAcquireCount += acquireCount;
		(periodCount)++;
		acquireCount = 0;
		notifyAll();
	}
}

