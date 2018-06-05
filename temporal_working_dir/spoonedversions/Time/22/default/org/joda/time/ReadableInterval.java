

package org.joda.time;


public interface ReadableInterval {
	org.joda.time.Chronology getChronology();

	long getStartMillis();

	org.joda.time.DateTime getStart();

	long getEndMillis();

	org.joda.time.DateTime getEnd();

	boolean contains(org.joda.time.ReadableInstant instant);

	boolean contains(org.joda.time.ReadableInterval interval);

	boolean overlaps(org.joda.time.ReadableInterval interval);

	boolean isAfter(org.joda.time.ReadableInstant instant);

	boolean isAfter(org.joda.time.ReadableInterval interval);

	boolean isBefore(org.joda.time.ReadableInstant instant);

	boolean isBefore(org.joda.time.ReadableInterval interval);

	org.joda.time.Interval toInterval();

	org.joda.time.MutableInterval toMutableInterval();

	org.joda.time.Duration toDuration();

	long toDurationMillis();

	org.joda.time.Period toPeriod();

	org.joda.time.Period toPeriod(org.joda.time.PeriodType type);

	boolean equals(java.lang.Object readableInterval);

	int hashCode();

	java.lang.String toString();
}

