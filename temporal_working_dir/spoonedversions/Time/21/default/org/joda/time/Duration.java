

package org.joda.time;


public final class Duration extends org.joda.time.base.BaseDuration implements java.io.Serializable , org.joda.time.ReadableDuration {
	public static final org.joda.time.Duration ZERO = new org.joda.time.Duration(0L);

	private static final long serialVersionUID = 2471658376918L;

	@org.joda.convert.FromString
	public static org.joda.time.Duration parse(java.lang.String str) {
		return new org.joda.time.Duration(str);
	}

	public static org.joda.time.Duration standardDays(long days) {
		if (days == 0) {
			return org.joda.time.Duration.ZERO;
		}
		return new org.joda.time.Duration(org.joda.time.field.FieldUtils.safeMultiply(days, org.joda.time.DateTimeConstants.MILLIS_PER_DAY));
	}

	public static org.joda.time.Duration standardHours(long hours) {
		if (hours == 0) {
			return org.joda.time.Duration.ZERO;
		}
		return new org.joda.time.Duration(org.joda.time.field.FieldUtils.safeMultiply(hours, org.joda.time.DateTimeConstants.MILLIS_PER_HOUR));
	}

	public static org.joda.time.Duration standardMinutes(long minutes) {
		if (minutes == 0) {
			return org.joda.time.Duration.ZERO;
		}
		return new org.joda.time.Duration(org.joda.time.field.FieldUtils.safeMultiply(minutes, org.joda.time.DateTimeConstants.MILLIS_PER_MINUTE));
	}

	public static org.joda.time.Duration standardSeconds(long seconds) {
		if (seconds == 0) {
			return org.joda.time.Duration.ZERO;
		}
		return new org.joda.time.Duration(org.joda.time.field.FieldUtils.safeMultiply(seconds, org.joda.time.DateTimeConstants.MILLIS_PER_SECOND));
	}

	public static org.joda.time.Duration millis(long millis) {
		if (millis == 0) {
			return org.joda.time.Duration.ZERO;
		}
		return new org.joda.time.Duration(millis);
	}

	public Duration(long duration) {
		super(duration);
	}

	public Duration(long startInstant, long endInstant) {
		super(startInstant, endInstant);
	}

	public Duration(org.joda.time.ReadableInstant start, org.joda.time.ReadableInstant end) {
		super(start, end);
	}

	public Duration(java.lang.Object duration) {
		super(duration);
	}

	public long getStandardDays() {
		return (getMillis()) / (org.joda.time.DateTimeConstants.MILLIS_PER_DAY);
	}

	public long getStandardHours() {
		return (getMillis()) / (org.joda.time.DateTimeConstants.MILLIS_PER_HOUR);
	}

	public long getStandardMinutes() {
		return (getMillis()) / (org.joda.time.DateTimeConstants.MILLIS_PER_MINUTE);
	}

	public long getStandardSeconds() {
		return (getMillis()) / (org.joda.time.DateTimeConstants.MILLIS_PER_SECOND);
	}

	public org.joda.time.Duration toDuration() {
		return org.joda.time.Duration.this;
	}

	public org.joda.time.Days toStandardDays() {
		long days = getStandardDays();
		return org.joda.time.Days.days(org.joda.time.field.FieldUtils.safeToInt(days));
	}

	public org.joda.time.Hours toStandardHours() {
		long hours = getStandardHours();
		return org.joda.time.Hours.hours(org.joda.time.field.FieldUtils.safeToInt(hours));
	}

	public org.joda.time.Minutes toStandardMinutes() {
		long minutes = getStandardMinutes();
		return org.joda.time.Minutes.minutes(org.joda.time.field.FieldUtils.safeToInt(minutes));
	}

	public org.joda.time.Seconds toStandardSeconds() {
		long seconds = getStandardSeconds();
		return org.joda.time.Seconds.seconds(org.joda.time.field.FieldUtils.safeToInt(seconds));
	}

	public org.joda.time.Duration withMillis(long duration) {
		if (duration == (getMillis())) {
			return org.joda.time.Duration.this;
		}
		return new org.joda.time.Duration(duration);
	}

	public org.joda.time.Duration withDurationAdded(long durationToAdd, int scalar) {
		if ((durationToAdd == 0) || (scalar == 0)) {
			return org.joda.time.Duration.this;
		}
		long add = org.joda.time.field.FieldUtils.safeMultiply(durationToAdd, scalar);
		long duration = org.joda.time.field.FieldUtils.safeAdd(getMillis(), add);
		return new org.joda.time.Duration(duration);
	}

	public org.joda.time.Duration withDurationAdded(org.joda.time.ReadableDuration durationToAdd, int scalar) {
		if ((durationToAdd == null) || (scalar == 0)) {
			return org.joda.time.Duration.this;
		}
		return withDurationAdded(durationToAdd.getMillis(), scalar);
	}

	public org.joda.time.Duration plus(long amount) {
		return withDurationAdded(amount, 1);
	}

	public org.joda.time.Duration plus(org.joda.time.ReadableDuration amount) {
		if (amount == null) {
			return org.joda.time.Duration.this;
		}
		return withDurationAdded(amount.getMillis(), 1);
	}

	public org.joda.time.Duration minus(long amount) {
		return withDurationAdded(amount, (-1));
	}

	public org.joda.time.Duration minus(org.joda.time.ReadableDuration amount) {
		if (amount == null) {
			return org.joda.time.Duration.this;
		}
		return withDurationAdded(amount.getMillis(), (-1));
	}
}

