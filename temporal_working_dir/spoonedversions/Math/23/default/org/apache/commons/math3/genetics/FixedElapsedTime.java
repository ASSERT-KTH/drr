

package org.apache.commons.math3.genetics;


public class FixedElapsedTime implements org.apache.commons.math3.genetics.StoppingCondition {
	private final long maxTimePeriod;

	private long endTime = -1;

	public FixedElapsedTime(final long maxTime) {
		this(maxTime, java.util.concurrent.TimeUnit.SECONDS);
	}

	public FixedElapsedTime(final long maxTime, final java.util.concurrent.TimeUnit unit) {
		if (maxTime < 0) {
			throw new org.apache.commons.math3.exception.NumberIsTooSmallException(maxTime, 0, true);
		}
		maxTimePeriod = unit.toNanos(maxTime);
	}

	public boolean isSatisfied(final org.apache.commons.math3.genetics.Population population) {
		if ((endTime) < 0) {
			endTime = (java.lang.System.nanoTime()) + (maxTimePeriod);
		}
		return (java.lang.System.nanoTime()) >= (endTime);
	}
}

