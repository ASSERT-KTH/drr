

package org.joda.time;


public abstract class DurationField implements java.lang.Comparable<org.joda.time.DurationField> {
	public abstract org.joda.time.DurationFieldType getType();

	public abstract java.lang.String getName();

	public abstract boolean isSupported();

	public abstract boolean isPrecise();

	public abstract long getUnitMillis();

	public abstract int getValue(long duration);

	public abstract long getValueAsLong(long duration);

	public abstract int getValue(long duration, long instant);

	public abstract long getValueAsLong(long duration, long instant);

	public abstract long getMillis(int value);

	public abstract long getMillis(long value);

	public abstract long getMillis(int value, long instant);

	public abstract long getMillis(long value, long instant);

	public abstract long add(long instant, int value);

	public abstract long add(long instant, long value);

	public long subtract(long instant, int value) {
		if (value == (java.lang.Integer.MIN_VALUE)) {
			return subtract(instant, ((long) (value)));
		}
		return add(instant, (-value));
	}

	public long subtract(long instant, long value) {
		if (value == (java.lang.Long.MIN_VALUE)) {
			throw new java.lang.ArithmeticException("Long.MIN_VALUE cannot be negated");
		}
		return add(instant, (-value));
	}

	public abstract int getDifference(long minuendInstant, long subtrahendInstant);

	public abstract long getDifferenceAsLong(long minuendInstant, long subtrahendInstant);

	public abstract java.lang.String toString();
}

