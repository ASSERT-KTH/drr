

package org.joda.time;


public interface ReadableDuration extends java.lang.Comparable<org.joda.time.ReadableDuration> {
	long getMillis();

	org.joda.time.Duration toDuration();

	org.joda.time.Period toPeriod();

	boolean isEqual(org.joda.time.ReadableDuration duration);

	boolean isLongerThan(org.joda.time.ReadableDuration duration);

	boolean isShorterThan(org.joda.time.ReadableDuration duration);

	boolean equals(java.lang.Object readableDuration);

	int hashCode();

	java.lang.String toString();
}

