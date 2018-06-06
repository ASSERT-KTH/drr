

package org.joda.time;


public interface ReadablePeriod {
	org.joda.time.PeriodType getPeriodType();

	int size();

	org.joda.time.DurationFieldType getFieldType(int index);

	int getValue(int index);

	int get(org.joda.time.DurationFieldType field);

	boolean isSupported(org.joda.time.DurationFieldType field);

	org.joda.time.Period toPeriod();

	org.joda.time.MutablePeriod toMutablePeriod();

	boolean equals(java.lang.Object readablePeriod);

	int hashCode();

	java.lang.String toString();
}

