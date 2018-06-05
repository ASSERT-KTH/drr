

package org.joda.time;


public interface ReadWritableInstant extends org.joda.time.ReadableInstant {
	void setMillis(long instant);

	void setMillis(org.joda.time.ReadableInstant instant);

	void setChronology(org.joda.time.Chronology chronology);

	void setZone(org.joda.time.DateTimeZone zone);

	void setZoneRetainFields(org.joda.time.DateTimeZone zone);

	void add(long duration);

	void add(org.joda.time.ReadableDuration duration);

	void add(org.joda.time.ReadableDuration duration, int scalar);

	void add(org.joda.time.ReadablePeriod period);

	void add(org.joda.time.ReadablePeriod period, int scalar);

	void set(org.joda.time.DateTimeFieldType type, int value);

	void add(org.joda.time.DurationFieldType type, int amount);
}

