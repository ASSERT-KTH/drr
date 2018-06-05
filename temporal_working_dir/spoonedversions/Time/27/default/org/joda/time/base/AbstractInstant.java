

package org.joda.time.base;


public abstract class AbstractInstant implements org.joda.time.ReadableInstant {
	protected AbstractInstant() {
		super();
	}

	public org.joda.time.DateTimeZone getZone() {
		return getChronology().getZone();
	}

	public int get(org.joda.time.DateTimeFieldType type) {
		if (type == null) {
			throw new java.lang.IllegalArgumentException("The DateTimeFieldType must not be null");
		}
		return type.getField(getChronology()).get(getMillis());
	}

	public boolean isSupported(org.joda.time.DateTimeFieldType type) {
		if (type == null) {
			return false;
		}
		return type.getField(getChronology()).isSupported();
	}

	public int get(org.joda.time.DateTimeField field) {
		if (field == null) {
			throw new java.lang.IllegalArgumentException("The DateTimeField must not be null");
		}
		return field.get(getMillis());
	}

	public org.joda.time.Instant toInstant() {
		return new org.joda.time.Instant(getMillis());
	}

	public org.joda.time.DateTime toDateTime() {
		return new org.joda.time.DateTime(getMillis(), getZone());
	}

	public org.joda.time.DateTime toDateTimeISO() {
		return new org.joda.time.DateTime(getMillis(), org.joda.time.chrono.ISOChronology.getInstance(getZone()));
	}

	public org.joda.time.DateTime toDateTime(org.joda.time.DateTimeZone zone) {
		org.joda.time.Chronology chrono = org.joda.time.DateTimeUtils.getChronology(getChronology());
		chrono = chrono.withZone(zone);
		return new org.joda.time.DateTime(getMillis(), chrono);
	}

	public org.joda.time.DateTime toDateTime(org.joda.time.Chronology chronology) {
		return new org.joda.time.DateTime(getMillis(), chronology);
	}

	public org.joda.time.MutableDateTime toMutableDateTime() {
		return new org.joda.time.MutableDateTime(getMillis(), getZone());
	}

	public org.joda.time.MutableDateTime toMutableDateTimeISO() {
		return new org.joda.time.MutableDateTime(getMillis(), org.joda.time.chrono.ISOChronology.getInstance(getZone()));
	}

	public org.joda.time.MutableDateTime toMutableDateTime(org.joda.time.DateTimeZone zone) {
		org.joda.time.Chronology chrono = org.joda.time.DateTimeUtils.getChronology(getChronology());
		chrono = chrono.withZone(zone);
		return new org.joda.time.MutableDateTime(getMillis(), chrono);
	}

	public org.joda.time.MutableDateTime toMutableDateTime(org.joda.time.Chronology chronology) {
		return new org.joda.time.MutableDateTime(getMillis(), chronology);
	}

	public java.util.Date toDate() {
		return new java.util.Date(getMillis());
	}

	public boolean equals(java.lang.Object readableInstant) {
		if ((org.joda.time.base.AbstractInstant.this) == readableInstant) {
			return true;
		}
		if ((readableInstant instanceof org.joda.time.ReadableInstant) == false) {
			return false;
		}
		org.joda.time.ReadableInstant otherInstant = ((org.joda.time.ReadableInstant) (readableInstant));
		return ((getMillis()) == (otherInstant.getMillis())) && (org.joda.time.field.FieldUtils.equals(getChronology(), otherInstant.getChronology()));
	}

	public int hashCode() {
		return ((int) ((getMillis()) ^ ((getMillis()) >>> 32))) + (getChronology().hashCode());
	}

	public int compareTo(org.joda.time.ReadableInstant other) {
		if ((org.joda.time.base.AbstractInstant.this) == other) {
			return 0;
		}
		long otherMillis = other.getMillis();
		long thisMillis = getMillis();
		if (thisMillis == otherMillis) {
			return 0;
		}
		if (thisMillis < otherMillis) {
			return -1;
		}else {
			return 1;
		}
	}

	public boolean isAfter(long instant) {
		return (getMillis()) > instant;
	}

	public boolean isAfterNow() {
		return isAfter(org.joda.time.DateTimeUtils.currentTimeMillis());
	}

	public boolean isAfter(org.joda.time.ReadableInstant instant) {
		long instantMillis = org.joda.time.DateTimeUtils.getInstantMillis(instant);
		return isAfter(instantMillis);
	}

	public boolean isBefore(long instant) {
		return (getMillis()) < instant;
	}

	public boolean isBeforeNow() {
		return isBefore(org.joda.time.DateTimeUtils.currentTimeMillis());
	}

	public boolean isBefore(org.joda.time.ReadableInstant instant) {
		long instantMillis = org.joda.time.DateTimeUtils.getInstantMillis(instant);
		return isBefore(instantMillis);
	}

	public boolean isEqual(long instant) {
		return (getMillis()) == instant;
	}

	public boolean isEqualNow() {
		return isEqual(org.joda.time.DateTimeUtils.currentTimeMillis());
	}

	public boolean isEqual(org.joda.time.ReadableInstant instant) {
		long instantMillis = org.joda.time.DateTimeUtils.getInstantMillis(instant);
		return isEqual(instantMillis);
	}

	public java.lang.String toString() {
		return org.joda.time.format.ISODateTimeFormat.dateTime().print(org.joda.time.base.AbstractInstant.this);
	}

	public java.lang.String toString(org.joda.time.format.DateTimeFormatter formatter) {
		if (formatter == null) {
			return toString();
		}
		return formatter.print(org.joda.time.base.AbstractInstant.this);
	}
}

