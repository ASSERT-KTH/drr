

package org.joda.time;


public interface ReadablePartial extends java.lang.Comparable<org.joda.time.ReadablePartial> {
	int size();

	org.joda.time.DateTimeFieldType getFieldType(int index);

	org.joda.time.DateTimeField getField(int index);

	int getValue(int index);

	org.joda.time.Chronology getChronology();

	int get(org.joda.time.DateTimeFieldType field);

	boolean isSupported(org.joda.time.DateTimeFieldType field);

	org.joda.time.DateTime toDateTime(org.joda.time.ReadableInstant baseInstant);

	boolean equals(java.lang.Object partial);

	int hashCode();

	java.lang.String toString();
}

