

package org.joda.time.base;


public abstract class AbstractInterval implements org.joda.time.ReadableInterval {
	protected AbstractInterval() {
		super();
	}

	protected void checkInterval(long start, long end) {
		if (end < start) {
			throw new java.lang.IllegalArgumentException("The end instant must be greater or equal to the start");
		}
	}

	public org.joda.time.DateTime getStart() {
		return new org.joda.time.DateTime(getStartMillis(), getChronology());
	}

	public org.joda.time.DateTime getEnd() {
		return new org.joda.time.DateTime(getEndMillis(), getChronology());
	}

	public boolean contains(long millisInstant) {
		long thisStart = getStartMillis();
		long thisEnd = getEndMillis();
		return (millisInstant >= thisStart) && (millisInstant < thisEnd);
	}

	public boolean containsNow() {
		return contains(org.joda.time.DateTimeUtils.currentTimeMillis());
	}

	public boolean contains(org.joda.time.ReadableInstant instant) {
		if (instant == null) {
			return containsNow();
		}
		return contains(instant.getMillis());
	}

	public boolean contains(org.joda.time.ReadableInterval interval) {
		if (interval == null) {
			return containsNow();
		}
		long otherStart = interval.getStartMillis();
		long otherEnd = interval.getEndMillis();
		long thisStart = getStartMillis();
		long thisEnd = getEndMillis();
		return ((thisStart <= otherStart) && (otherStart < thisEnd)) && (otherEnd <= thisEnd);
	}

	public boolean overlaps(org.joda.time.ReadableInterval interval) {
		long thisStart = getStartMillis();
		long thisEnd = getEndMillis();
		if (interval == null) {
			long now = org.joda.time.DateTimeUtils.currentTimeMillis();
			return (thisStart < now) && (now < thisEnd);
		}else {
			long otherStart = interval.getStartMillis();
			long otherEnd = interval.getEndMillis();
			return (thisStart < otherEnd) && (otherStart < thisEnd);
		}
	}

	public boolean isBefore(long millisInstant) {
		return (getEndMillis()) <= millisInstant;
	}

	public boolean isBeforeNow() {
		return isBefore(org.joda.time.DateTimeUtils.currentTimeMillis());
	}

	public boolean isBefore(org.joda.time.ReadableInstant instant) {
		if (instant == null) {
			return isBeforeNow();
		}
		return isBefore(instant.getMillis());
	}

	public boolean isBefore(org.joda.time.ReadableInterval interval) {
		if (interval == null) {
			return isBeforeNow();
		}
		return isBefore(interval.getStartMillis());
	}

	public boolean isAfter(long millisInstant) {
		return (getStartMillis()) > millisInstant;
	}

	public boolean isAfterNow() {
		return isAfter(org.joda.time.DateTimeUtils.currentTimeMillis());
	}

	public boolean isAfter(org.joda.time.ReadableInstant instant) {
		if (instant == null) {
			return isAfterNow();
		}
		return isAfter(instant.getMillis());
	}

	public boolean isAfter(org.joda.time.ReadableInterval interval) {
		long endMillis;
		if (interval == null) {
			endMillis = org.joda.time.DateTimeUtils.currentTimeMillis();
		}else {
			endMillis = interval.getEndMillis();
		}
		return (getStartMillis()) >= endMillis;
	}

	public org.joda.time.Interval toInterval() {
		return new org.joda.time.Interval(getStartMillis(), getEndMillis(), getChronology());
	}

	public org.joda.time.MutableInterval toMutableInterval() {
		return new org.joda.time.MutableInterval(getStartMillis(), getEndMillis(), getChronology());
	}

	public long toDurationMillis() {
		return org.joda.time.field.FieldUtils.safeAdd(getEndMillis(), (-(getStartMillis())));
	}

	public org.joda.time.Duration toDuration() {
		long durMillis = toDurationMillis();
		if (durMillis == 0) {
			return org.joda.time.Duration.ZERO;
		}else {
			return new org.joda.time.Duration(durMillis);
		}
	}

	public org.joda.time.Period toPeriod() {
		return new org.joda.time.Period(getStartMillis(), getEndMillis(), getChronology());
	}

	public org.joda.time.Period toPeriod(org.joda.time.PeriodType type) {
		return new org.joda.time.Period(getStartMillis(), getEndMillis(), type, getChronology());
	}

	public boolean equals(java.lang.Object readableInterval) {
		if ((org.joda.time.base.AbstractInterval.this) == readableInterval) {
			return true;
		}
		if ((readableInterval instanceof org.joda.time.ReadableInterval) == false) {
			return false;
		}
		org.joda.time.ReadableInterval other = ((org.joda.time.ReadableInterval) (readableInterval));
		return (((getStartMillis()) == (other.getStartMillis())) && ((getEndMillis()) == (other.getEndMillis()))) && (org.joda.time.field.FieldUtils.equals(getChronology(), other.getChronology()));
	}

	public int hashCode() {
		long start = getStartMillis();
		long end = getEndMillis();
		int result = 97;
		result = (31 * result) + ((int) (start ^ (start >>> 32)));
		result = (31 * result) + ((int) (end ^ (end >>> 32)));
		result = (31 * result) + (getChronology().hashCode());
		return result;
	}

	public java.lang.String toString() {
		org.joda.time.format.DateTimeFormatter printer = org.joda.time.format.ISODateTimeFormat.dateTime();
		printer = printer.withChronology(getChronology());
		java.lang.StringBuffer buf = new java.lang.StringBuffer(48);
		printer.printTo(buf, getStartMillis());
		buf.append('/');
		printer.printTo(buf, getEndMillis());
		return buf.toString();
	}
}

