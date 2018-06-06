

package org.joda.time.convert;


class NullConverter extends org.joda.time.convert.AbstractConverter implements org.joda.time.convert.DurationConverter , org.joda.time.convert.InstantConverter , org.joda.time.convert.IntervalConverter , org.joda.time.convert.PartialConverter , org.joda.time.convert.PeriodConverter {
	static final org.joda.time.convert.NullConverter INSTANCE = new org.joda.time.convert.NullConverter();

	protected NullConverter() {
		super();
	}

	public long getDurationMillis(java.lang.Object object) {
		return 0L;
	}

	public void setInto(org.joda.time.ReadWritablePeriod duration, java.lang.Object object, org.joda.time.Chronology chrono) {
		duration.setPeriod(((org.joda.time.Period) (null)));
	}

	public void setInto(org.joda.time.ReadWritableInterval writableInterval, java.lang.Object object, org.joda.time.Chronology chrono) {
		writableInterval.setChronology(chrono);
		long now = org.joda.time.DateTimeUtils.currentTimeMillis();
		writableInterval.setInterval(now, now);
	}

	public java.lang.Class<?> getSupportedType() {
		return null;
	}
}

