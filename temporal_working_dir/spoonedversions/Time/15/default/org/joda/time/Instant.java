

package org.joda.time;


public final class Instant extends org.joda.time.base.AbstractInstant implements java.io.Serializable , org.joda.time.ReadableInstant {
	private static final long serialVersionUID = 3299096530934209741L;

	private final long iMillis;

	public static org.joda.time.Instant now() {
		return new org.joda.time.Instant();
	}

	@org.joda.convert.FromString
	public static org.joda.time.Instant parse(java.lang.String str) {
		return org.joda.time.Instant.parse(str, org.joda.time.format.ISODateTimeFormat.dateTimeParser());
	}

	public static org.joda.time.Instant parse(java.lang.String str, org.joda.time.format.DateTimeFormatter formatter) {
		return formatter.parseDateTime(str).toInstant();
	}

	public Instant() {
		super();
		iMillis = org.joda.time.DateTimeUtils.currentTimeMillis();
	}

	public Instant(long instant) {
		super();
		iMillis = instant;
	}

	public Instant(java.lang.Object instant) {
		super();
		org.joda.time.convert.InstantConverter converter = org.joda.time.convert.ConverterManager.getInstance().getInstantConverter(instant);
		iMillis = converter.getInstantMillis(instant, org.joda.time.chrono.ISOChronology.getInstanceUTC());
	}

	public org.joda.time.Instant toInstant() {
		return org.joda.time.Instant.this;
	}

	public org.joda.time.Instant withMillis(long newMillis) {
		return newMillis == (iMillis) ? org.joda.time.Instant.this : new org.joda.time.Instant(newMillis);
	}

	public org.joda.time.Instant withDurationAdded(long durationToAdd, int scalar) {
		if ((durationToAdd == 0) || (scalar == 0)) {
			return org.joda.time.Instant.this;
		}
		long instant = getChronology().add(getMillis(), durationToAdd, scalar);
		return withMillis(instant);
	}

	public org.joda.time.Instant withDurationAdded(org.joda.time.ReadableDuration durationToAdd, int scalar) {
		if ((durationToAdd == null) || (scalar == 0)) {
			return org.joda.time.Instant.this;
		}
		return withDurationAdded(durationToAdd.getMillis(), scalar);
	}

	public org.joda.time.Instant plus(long duration) {
		return withDurationAdded(duration, 1);
	}

	public org.joda.time.Instant plus(org.joda.time.ReadableDuration duration) {
		return withDurationAdded(duration, 1);
	}

	public org.joda.time.Instant minus(long duration) {
		return withDurationAdded(duration, (-1));
	}

	public org.joda.time.Instant minus(org.joda.time.ReadableDuration duration) {
		return withDurationAdded(duration, (-1));
	}

	public long getMillis() {
		return iMillis;
	}

	public org.joda.time.Chronology getChronology() {
		return org.joda.time.chrono.ISOChronology.getInstanceUTC();
	}

	public org.joda.time.DateTime toDateTime() {
		return new org.joda.time.DateTime(getMillis(), org.joda.time.chrono.ISOChronology.getInstance());
	}

	@java.lang.Deprecated
	public org.joda.time.DateTime toDateTimeISO() {
		return toDateTime();
	}

	public org.joda.time.MutableDateTime toMutableDateTime() {
		return new org.joda.time.MutableDateTime(getMillis(), org.joda.time.chrono.ISOChronology.getInstance());
	}

	@java.lang.Deprecated
	public org.joda.time.MutableDateTime toMutableDateTimeISO() {
		return toMutableDateTime();
	}
}

