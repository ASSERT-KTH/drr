

package org.joda.time;


public final class Interval extends org.joda.time.base.BaseInterval implements java.io.Serializable , org.joda.time.ReadableInterval {
	private static final long serialVersionUID = 4922451897541386752L;

	public Interval(long startInstant, long endInstant) {
		super(startInstant, endInstant, null);
	}

	public Interval(long startInstant, long endInstant, org.joda.time.DateTimeZone zone) {
		super(startInstant, endInstant, org.joda.time.chrono.ISOChronology.getInstance(zone));
	}

	public Interval(long startInstant, long endInstant, org.joda.time.Chronology chronology) {
		super(startInstant, endInstant, chronology);
	}

	public Interval(org.joda.time.ReadableInstant start, org.joda.time.ReadableInstant end) {
		super(start, end);
	}

	public Interval(org.joda.time.ReadableInstant start, org.joda.time.ReadableDuration duration) {
		super(start, duration);
	}

	public Interval(org.joda.time.ReadableDuration duration, org.joda.time.ReadableInstant end) {
		super(duration, end);
	}

	public Interval(org.joda.time.ReadableInstant start, org.joda.time.ReadablePeriod period) {
		super(start, period);
	}

	public Interval(org.joda.time.ReadablePeriod period, org.joda.time.ReadableInstant end) {
		super(period, end);
	}

	public Interval(java.lang.Object interval) {
		super(interval, null);
	}

	public Interval(java.lang.Object interval, org.joda.time.Chronology chronology) {
		super(interval, chronology);
	}

	public org.joda.time.Interval toInterval() {
		return org.joda.time.Interval.this;
	}

	public org.joda.time.Interval overlap(org.joda.time.ReadableInterval interval) {
		interval = org.joda.time.DateTimeUtils.getReadableInterval(interval);
		if ((overlaps(interval)) == false) {
			return null;
		}
		long start = java.lang.Math.max(getStartMillis(), interval.getStartMillis());
		long end = java.lang.Math.min(getEndMillis(), interval.getEndMillis());
		return new org.joda.time.Interval(start, end, getChronology());
	}

	public org.joda.time.Interval gap(org.joda.time.ReadableInterval interval) {
		interval = org.joda.time.DateTimeUtils.getReadableInterval(interval);
		long otherStart = interval.getStartMillis();
		long otherEnd = interval.getEndMillis();
		long thisStart = getStartMillis();
		long thisEnd = getEndMillis();
		if (thisStart > otherEnd) {
			return new org.joda.time.Interval(otherEnd, thisStart, getChronology());
		}else
			if (otherStart > thisEnd) {
				return new org.joda.time.Interval(thisEnd, otherStart, getChronology());
			}else {
				return null;
			}
		
	}

	public boolean abuts(org.joda.time.ReadableInterval interval) {
		if (interval == null) {
			long now = org.joda.time.DateTimeUtils.currentTimeMillis();
			return ((getStartMillis()) == now) || ((getEndMillis()) == now);
		}else {
			return ((interval.getEndMillis()) == (getStartMillis())) || ((getEndMillis()) == (interval.getStartMillis()));
		}
	}

	public org.joda.time.Interval withChronology(org.joda.time.Chronology chronology) {
		if ((getChronology()) == chronology) {
			return org.joda.time.Interval.this;
		}
		return new org.joda.time.Interval(getStartMillis(), getEndMillis(), chronology);
	}

	public org.joda.time.Interval withStartMillis(long startInstant) {
		if (startInstant == (getStartMillis())) {
			return org.joda.time.Interval.this;
		}
		return new org.joda.time.Interval(startInstant, getEndMillis(), getChronology());
	}

	public org.joda.time.Interval withStart(org.joda.time.ReadableInstant start) {
		long startMillis = org.joda.time.DateTimeUtils.getInstantMillis(start);
		return withStartMillis(startMillis);
	}

	public org.joda.time.Interval withEndMillis(long endInstant) {
		if (endInstant == (getEndMillis())) {
			return org.joda.time.Interval.this;
		}
		return new org.joda.time.Interval(getStartMillis(), endInstant, getChronology());
	}

	public org.joda.time.Interval withEnd(org.joda.time.ReadableInstant end) {
		long endMillis = org.joda.time.DateTimeUtils.getInstantMillis(end);
		return withEndMillis(endMillis);
	}

	public org.joda.time.Interval withDurationAfterStart(org.joda.time.ReadableDuration duration) {
		long durationMillis = org.joda.time.DateTimeUtils.getDurationMillis(duration);
		if (durationMillis == (toDurationMillis())) {
			return org.joda.time.Interval.this;
		}
		org.joda.time.Chronology chrono = getChronology();
		long startMillis = getStartMillis();
		long endMillis = chrono.add(startMillis, durationMillis, 1);
		return new org.joda.time.Interval(startMillis, endMillis, chrono);
	}

	public org.joda.time.Interval withDurationBeforeEnd(org.joda.time.ReadableDuration duration) {
		long durationMillis = org.joda.time.DateTimeUtils.getDurationMillis(duration);
		if (durationMillis == (toDurationMillis())) {
			return org.joda.time.Interval.this;
		}
		org.joda.time.Chronology chrono = getChronology();
		long endMillis = getEndMillis();
		long startMillis = chrono.add(endMillis, durationMillis, (-1));
		return new org.joda.time.Interval(startMillis, endMillis, chrono);
	}

	public org.joda.time.Interval withPeriodAfterStart(org.joda.time.ReadablePeriod period) {
		if (period == null) {
			return withDurationAfterStart(null);
		}
		org.joda.time.Chronology chrono = getChronology();
		long startMillis = getStartMillis();
		long endMillis = chrono.add(period, startMillis, 1);
		return new org.joda.time.Interval(startMillis, endMillis, chrono);
	}

	public org.joda.time.Interval withPeriodBeforeEnd(org.joda.time.ReadablePeriod period) {
		if (period == null) {
			return withDurationBeforeEnd(null);
		}
		org.joda.time.Chronology chrono = getChronology();
		long endMillis = getEndMillis();
		long startMillis = chrono.add(period, endMillis, (-1));
		return new org.joda.time.Interval(startMillis, endMillis, chrono);
	}
}

