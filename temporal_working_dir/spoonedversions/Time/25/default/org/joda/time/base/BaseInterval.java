

package org.joda.time.base;


public abstract class BaseInterval extends org.joda.time.base.AbstractInterval implements java.io.Serializable , org.joda.time.ReadableInterval {
	private static final long serialVersionUID = 576586928732749278L;

	private org.joda.time.Chronology iChronology;

	private long iStartMillis;

	private long iEndMillis;

	protected BaseInterval(long startInstant, long endInstant, org.joda.time.Chronology chrono) {
		super();
		iChronology = org.joda.time.DateTimeUtils.getChronology(chrono);
		checkInterval(startInstant, endInstant);
		iStartMillis = startInstant;
		iEndMillis = endInstant;
	}

	protected BaseInterval(org.joda.time.ReadableInstant start, org.joda.time.ReadableInstant end) {
		super();
		if ((start == null) && (end == null)) {
			iStartMillis = iEndMillis = org.joda.time.DateTimeUtils.currentTimeMillis();
			iChronology = org.joda.time.chrono.ISOChronology.getInstance();
		}else {
			iChronology = org.joda.time.DateTimeUtils.getInstantChronology(start);
			iStartMillis = org.joda.time.DateTimeUtils.getInstantMillis(start);
			iEndMillis = org.joda.time.DateTimeUtils.getInstantMillis(end);
			checkInterval(iStartMillis, iEndMillis);
		}
	}

	protected BaseInterval(org.joda.time.ReadableInstant start, org.joda.time.ReadableDuration duration) {
		super();
		iChronology = org.joda.time.DateTimeUtils.getInstantChronology(start);
		iStartMillis = org.joda.time.DateTimeUtils.getInstantMillis(start);
		long durationMillis = org.joda.time.DateTimeUtils.getDurationMillis(duration);
		iEndMillis = org.joda.time.field.FieldUtils.safeAdd(iStartMillis, durationMillis);
		checkInterval(iStartMillis, iEndMillis);
	}

	protected BaseInterval(org.joda.time.ReadableDuration duration, org.joda.time.ReadableInstant end) {
		super();
		iChronology = org.joda.time.DateTimeUtils.getInstantChronology(end);
		iEndMillis = org.joda.time.DateTimeUtils.getInstantMillis(end);
		long durationMillis = org.joda.time.DateTimeUtils.getDurationMillis(duration);
		iStartMillis = org.joda.time.field.FieldUtils.safeAdd(iEndMillis, (-durationMillis));
		checkInterval(iStartMillis, iEndMillis);
	}

	protected BaseInterval(org.joda.time.ReadableInstant start, org.joda.time.ReadablePeriod period) {
		super();
		org.joda.time.Chronology chrono = org.joda.time.DateTimeUtils.getInstantChronology(start);
		iChronology = chrono;
		iStartMillis = org.joda.time.DateTimeUtils.getInstantMillis(start);
		if (period == null) {
			iEndMillis = iStartMillis;
		}else {
			iEndMillis = chrono.add(period, iStartMillis, 1);
		}
		checkInterval(iStartMillis, iEndMillis);
	}

	protected BaseInterval(org.joda.time.ReadablePeriod period, org.joda.time.ReadableInstant end) {
		super();
		org.joda.time.Chronology chrono = org.joda.time.DateTimeUtils.getInstantChronology(end);
		iChronology = chrono;
		iEndMillis = org.joda.time.DateTimeUtils.getInstantMillis(end);
		if (period == null) {
			iStartMillis = iEndMillis;
		}else {
			iStartMillis = chrono.add(period, iEndMillis, (-1));
		}
		checkInterval(iStartMillis, iEndMillis);
	}

	protected BaseInterval(java.lang.Object interval, org.joda.time.Chronology chrono) {
		super();
		org.joda.time.convert.IntervalConverter converter = org.joda.time.convert.ConverterManager.getInstance().getIntervalConverter(interval);
		if (converter.isReadableInterval(interval, chrono)) {
			org.joda.time.ReadableInterval input = ((org.joda.time.ReadableInterval) (interval));
			iChronology = (chrono != null) ? chrono : input.getChronology();
			iStartMillis = input.getStartMillis();
			iEndMillis = input.getEndMillis();
		}else
			if ((org.joda.time.base.BaseInterval.this) instanceof org.joda.time.ReadWritableInterval) {
				converter.setInto(((org.joda.time.ReadWritableInterval) (org.joda.time.base.BaseInterval.this)), interval, chrono);
			}else {
				org.joda.time.MutableInterval mi = new org.joda.time.MutableInterval();
				converter.setInto(mi, interval, chrono);
				iChronology = mi.getChronology();
				iStartMillis = mi.getStartMillis();
				iEndMillis = mi.getEndMillis();
			}
		
		checkInterval(iStartMillis, iEndMillis);
	}

	public org.joda.time.Chronology getChronology() {
		return iChronology;
	}

	public long getStartMillis() {
		return iStartMillis;
	}

	public long getEndMillis() {
		return iEndMillis;
	}

	protected void setInterval(long startInstant, long endInstant, org.joda.time.Chronology chrono) {
		checkInterval(startInstant, endInstant);
		iStartMillis = startInstant;
		iEndMillis = endInstant;
		iChronology = org.joda.time.DateTimeUtils.getChronology(chrono);
	}
}

