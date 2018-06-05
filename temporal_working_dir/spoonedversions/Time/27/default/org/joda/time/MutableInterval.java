

package org.joda.time;


public class MutableInterval extends org.joda.time.base.BaseInterval implements java.io.Serializable , java.lang.Cloneable , org.joda.time.ReadWritableInterval {
	private static final long serialVersionUID = -5982824024992428470L;

	public MutableInterval() {
		super(0L, 0L, null);
	}

	public MutableInterval(long startInstant, long endInstant) {
		super(startInstant, endInstant, null);
	}

	public MutableInterval(long startInstant, long endInstant, org.joda.time.Chronology chronology) {
		super(startInstant, endInstant, chronology);
	}

	public MutableInterval(org.joda.time.ReadableInstant start, org.joda.time.ReadableInstant end) {
		super(start, end);
	}

	public MutableInterval(org.joda.time.ReadableInstant start, org.joda.time.ReadableDuration duration) {
		super(start, duration);
	}

	public MutableInterval(org.joda.time.ReadableDuration duration, org.joda.time.ReadableInstant end) {
		super(duration, end);
	}

	public MutableInterval(org.joda.time.ReadableInstant start, org.joda.time.ReadablePeriod period) {
		super(start, period);
	}

	public MutableInterval(org.joda.time.ReadablePeriod period, org.joda.time.ReadableInstant end) {
		super(period, end);
	}

	public MutableInterval(java.lang.Object interval) {
		super(interval, null);
	}

	public MutableInterval(java.lang.Object interval, org.joda.time.Chronology chronology) {
		super(interval, chronology);
	}

	public void setInterval(long startInstant, long endInstant) {
		super.setInterval(startInstant, endInstant, getChronology());
	}

	public void setInterval(org.joda.time.ReadableInterval interval) {
		if (interval == null) {
			throw new java.lang.IllegalArgumentException("Interval must not be null");
		}
		long startMillis = interval.getStartMillis();
		long endMillis = interval.getEndMillis();
		org.joda.time.Chronology chrono = interval.getChronology();
		super.setInterval(startMillis, endMillis, chrono);
	}

	public void setInterval(org.joda.time.ReadableInstant start, org.joda.time.ReadableInstant end) {
		if ((start == null) && (end == null)) {
			long now = org.joda.time.DateTimeUtils.currentTimeMillis();
			setInterval(now, now);
		}else {
			long startMillis = org.joda.time.DateTimeUtils.getInstantMillis(start);
			long endMillis = org.joda.time.DateTimeUtils.getInstantMillis(end);
			org.joda.time.Chronology chrono = org.joda.time.DateTimeUtils.getInstantChronology(start);
			super.setInterval(startMillis, endMillis, chrono);
		}
	}

	public void setChronology(org.joda.time.Chronology chrono) {
		super.setInterval(getStartMillis(), getEndMillis(), chrono);
	}

	public void setStartMillis(long startInstant) {
		super.setInterval(startInstant, getEndMillis(), getChronology());
	}

	public void setStart(org.joda.time.ReadableInstant start) {
		long startMillis = org.joda.time.DateTimeUtils.getInstantMillis(start);
		super.setInterval(startMillis, getEndMillis(), getChronology());
	}

	public void setEndMillis(long endInstant) {
		super.setInterval(getStartMillis(), endInstant, getChronology());
	}

	public void setEnd(org.joda.time.ReadableInstant end) {
		long endMillis = org.joda.time.DateTimeUtils.getInstantMillis(end);
		super.setInterval(getStartMillis(), endMillis, getChronology());
	}

	public void setDurationAfterStart(long duration) {
		setEndMillis(org.joda.time.field.FieldUtils.safeAdd(getStartMillis(), duration));
	}

	public void setDurationBeforeEnd(long duration) {
		setStartMillis(org.joda.time.field.FieldUtils.safeAdd(getEndMillis(), (-duration)));
	}

	public void setDurationAfterStart(org.joda.time.ReadableDuration duration) {
		long durationMillis = org.joda.time.DateTimeUtils.getDurationMillis(duration);
		setEndMillis(org.joda.time.field.FieldUtils.safeAdd(getStartMillis(), durationMillis));
	}

	public void setDurationBeforeEnd(org.joda.time.ReadableDuration duration) {
		long durationMillis = org.joda.time.DateTimeUtils.getDurationMillis(duration);
		setStartMillis(org.joda.time.field.FieldUtils.safeAdd(getEndMillis(), (-durationMillis)));
	}

	public void setPeriodAfterStart(org.joda.time.ReadablePeriod period) {
		if (period == null) {
			setEndMillis(getStartMillis());
		}else {
			setEndMillis(getChronology().add(period, getStartMillis(), 1));
		}
	}

	public void setPeriodBeforeEnd(org.joda.time.ReadablePeriod period) {
		if (period == null) {
			setStartMillis(getEndMillis());
		}else {
			setStartMillis(getChronology().add(period, getEndMillis(), (-1)));
		}
	}

	public org.joda.time.MutableInterval copy() {
		return ((org.joda.time.MutableInterval) (clone()));
	}

	public java.lang.Object clone() {
		try {
			return super.clone();
		} catch (java.lang.CloneNotSupportedException ex) {
			throw new java.lang.InternalError("Clone error");
		}
	}
}

