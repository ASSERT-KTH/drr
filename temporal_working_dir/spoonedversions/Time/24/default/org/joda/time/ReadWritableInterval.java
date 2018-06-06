

package org.joda.time;


public interface ReadWritableInterval extends org.joda.time.ReadableInterval {
	void setInterval(long startInstant, long endInstant);

	void setInterval(org.joda.time.ReadableInterval interval);

	void setInterval(org.joda.time.ReadableInstant startInstant, org.joda.time.ReadableInstant endInstant);

	void setChronology(org.joda.time.Chronology chrono);

	void setStartMillis(long millisInstant);

	void setStart(org.joda.time.ReadableInstant instant);

	void setEndMillis(long millisInstant);

	void setEnd(org.joda.time.ReadableInstant instant);

	void setDurationAfterStart(org.joda.time.ReadableDuration duration);

	void setDurationBeforeEnd(org.joda.time.ReadableDuration duration);

	void setPeriodAfterStart(org.joda.time.ReadablePeriod period);

	void setPeriodBeforeEnd(org.joda.time.ReadablePeriod period);
}

