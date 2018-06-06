

package org.joda.time;


public interface ReadWritablePeriod extends org.joda.time.ReadablePeriod {
	void clear();

	void setValue(int index, int value);

	void set(org.joda.time.DurationFieldType field, int value);

	void setPeriod(org.joda.time.ReadablePeriod period);

	void setPeriod(int years, int months, int weeks, int days, int hours, int minutes, int seconds, int millis);

	void setPeriod(org.joda.time.ReadableInterval interval);

	void add(org.joda.time.DurationFieldType field, int value);

	void add(org.joda.time.ReadablePeriod period);

	void add(int years, int months, int weeks, int days, int hours, int minutes, int seconds, int millis);

	void add(org.joda.time.ReadableInterval interval);

	void setYears(int years);

	void addYears(int years);

	void setMonths(int months);

	void addMonths(int months);

	void setWeeks(int weeks);

	void addWeeks(int weeks);

	void setDays(int days);

	void addDays(int days);

	void setHours(int hours);

	void addHours(int hours);

	void setMinutes(int minutes);

	void addMinutes(int minutes);

	void setSeconds(int seconds);

	void addSeconds(int seconds);

	void setMillis(int millis);

	void addMillis(int millis);
}

