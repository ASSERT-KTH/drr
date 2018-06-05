

package org.joda.time;


public interface ReadableInstant extends java.lang.Comparable<org.joda.time.ReadableInstant> {
	long getMillis();

	org.joda.time.Chronology getChronology();

	org.joda.time.DateTimeZone getZone();

	int get(org.joda.time.DateTimeFieldType type);

	boolean isSupported(org.joda.time.DateTimeFieldType field);

	org.joda.time.Instant toInstant();

	boolean isEqual(org.joda.time.ReadableInstant instant);

	boolean isAfter(org.joda.time.ReadableInstant instant);

	boolean isBefore(org.joda.time.ReadableInstant instant);

	boolean equals(java.lang.Object readableInstant);

	int hashCode();

	java.lang.String toString();
}

