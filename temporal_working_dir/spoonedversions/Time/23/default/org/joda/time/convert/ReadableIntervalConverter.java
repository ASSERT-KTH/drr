

package org.joda.time.convert;


class ReadableIntervalConverter extends org.joda.time.convert.AbstractConverter implements org.joda.time.convert.DurationConverter , org.joda.time.convert.IntervalConverter , org.joda.time.convert.PeriodConverter {
	static final org.joda.time.convert.ReadableIntervalConverter INSTANCE = new org.joda.time.convert.ReadableIntervalConverter();

	protected ReadableIntervalConverter() {
		super();
	}

	public long getDurationMillis(java.lang.Object object) {
		return ((org.joda.time.ReadableInterval) (object)).toDurationMillis();
	}

	public void setInto(org.joda.time.ReadWritablePeriod writablePeriod, java.lang.Object object, org.joda.time.Chronology chrono) {
		org.joda.time.ReadableInterval interval = ((org.joda.time.ReadableInterval) (object));
		chrono = (chrono != null) ? chrono : org.joda.time.DateTimeUtils.getIntervalChronology(interval);
		long start = interval.getStartMillis();
		long end = interval.getEndMillis();
		int[] values = chrono.get(writablePeriod, start, end);
		for (int i = 0; i < (values.length); i++) {
			writablePeriod.setValue(i, values[i]);
		}
	}

	public boolean isReadableInterval(java.lang.Object object, org.joda.time.Chronology chrono) {
		return true;
	}

	public void setInto(org.joda.time.ReadWritableInterval writableInterval, java.lang.Object object, org.joda.time.Chronology chrono) {
		org.joda.time.ReadableInterval input = ((org.joda.time.ReadableInterval) (object));
		writableInterval.setInterval(input);
		if (chrono != null) {
			writableInterval.setChronology(chrono);
		}else {
			writableInterval.setChronology(input.getChronology());
		}
	}

	public java.lang.Class<?> getSupportedType() {
		return org.joda.time.ReadableInterval.class;
	}
}

