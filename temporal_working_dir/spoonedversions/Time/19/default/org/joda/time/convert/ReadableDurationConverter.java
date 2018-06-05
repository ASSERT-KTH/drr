

package org.joda.time.convert;


class ReadableDurationConverter extends org.joda.time.convert.AbstractConverter implements org.joda.time.convert.DurationConverter , org.joda.time.convert.PeriodConverter {
	static final org.joda.time.convert.ReadableDurationConverter INSTANCE = new org.joda.time.convert.ReadableDurationConverter();

	protected ReadableDurationConverter() {
		super();
	}

	public long getDurationMillis(java.lang.Object object) {
		return ((org.joda.time.ReadableDuration) (object)).getMillis();
	}

	public void setInto(org.joda.time.ReadWritablePeriod writablePeriod, java.lang.Object object, org.joda.time.Chronology chrono) {
		org.joda.time.ReadableDuration dur = ((org.joda.time.ReadableDuration) (object));
		chrono = org.joda.time.DateTimeUtils.getChronology(chrono);
		long duration = dur.getMillis();
		int[] values = chrono.get(writablePeriod, duration);
		for (int i = 0; i < (values.length); i++) {
			writablePeriod.setValue(i, values[i]);
		}
	}

	public java.lang.Class<?> getSupportedType() {
		return org.joda.time.ReadableDuration.class;
	}
}

