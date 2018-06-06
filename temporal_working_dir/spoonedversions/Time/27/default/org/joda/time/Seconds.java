

package org.joda.time;


public final class Seconds extends org.joda.time.base.BaseSingleFieldPeriod {
	public static final org.joda.time.Seconds ZERO = new org.joda.time.Seconds(0);

	public static final org.joda.time.Seconds ONE = new org.joda.time.Seconds(1);

	public static final org.joda.time.Seconds TWO = new org.joda.time.Seconds(2);

	public static final org.joda.time.Seconds THREE = new org.joda.time.Seconds(3);

	public static final org.joda.time.Seconds MAX_VALUE = new org.joda.time.Seconds(java.lang.Integer.MAX_VALUE);

	public static final org.joda.time.Seconds MIN_VALUE = new org.joda.time.Seconds(java.lang.Integer.MIN_VALUE);

	private static final org.joda.time.format.PeriodFormatter PARSER = org.joda.time.format.ISOPeriodFormat.standard().withParseType(org.joda.time.PeriodType.seconds());

	private static final long serialVersionUID = 87525275727380862L;

	public static org.joda.time.Seconds seconds(int seconds) {
		switch (seconds) {
			case 0 :
				return org.joda.time.Seconds.ZERO;
			case 1 :
				return org.joda.time.Seconds.ONE;
			case 2 :
				return org.joda.time.Seconds.TWO;
			case 3 :
				return org.joda.time.Seconds.THREE;
			case java.lang.Integer.MAX_VALUE :
				return org.joda.time.Seconds.MAX_VALUE;
			case java.lang.Integer.MIN_VALUE :
				return org.joda.time.Seconds.MIN_VALUE;
			default :
				return new org.joda.time.Seconds(seconds);
		}
	}

	public static org.joda.time.Seconds secondsBetween(org.joda.time.ReadableInstant start, org.joda.time.ReadableInstant end) {
		int amount = org.joda.time.base.BaseSingleFieldPeriod.between(start, end, org.joda.time.DurationFieldType.seconds());
		return org.joda.time.Seconds.seconds(amount);
	}

	public static org.joda.time.Seconds secondsBetween(org.joda.time.ReadablePartial start, org.joda.time.ReadablePartial end) {
		if ((start instanceof org.joda.time.LocalTime) && (end instanceof org.joda.time.LocalTime)) {
			org.joda.time.Chronology chrono = org.joda.time.DateTimeUtils.getChronology(start.getChronology());
			int seconds = chrono.seconds().getDifference(((org.joda.time.LocalTime) (end)).getLocalMillis(), ((org.joda.time.LocalTime) (start)).getLocalMillis());
			return org.joda.time.Seconds.seconds(seconds);
		}
		int amount = org.joda.time.base.BaseSingleFieldPeriod.between(start, end, org.joda.time.Seconds.ZERO);
		return org.joda.time.Seconds.seconds(amount);
	}

	public static org.joda.time.Seconds secondsIn(org.joda.time.ReadableInterval interval) {
		if (interval == null) {
			return org.joda.time.Seconds.ZERO;
		}
		int amount = org.joda.time.base.BaseSingleFieldPeriod.between(interval.getStart(), interval.getEnd(), org.joda.time.DurationFieldType.seconds());
		return org.joda.time.Seconds.seconds(amount);
	}

	public static org.joda.time.Seconds standardSecondsIn(org.joda.time.ReadablePeriod period) {
		int amount = org.joda.time.base.BaseSingleFieldPeriod.standardPeriodIn(period, org.joda.time.DateTimeConstants.MILLIS_PER_SECOND);
		return org.joda.time.Seconds.seconds(amount);
	}

	public static org.joda.time.Seconds parseSeconds(java.lang.String periodStr) {
		if (periodStr == null) {
			return org.joda.time.Seconds.ZERO;
		}
		org.joda.time.Period p = org.joda.time.Seconds.PARSER.parsePeriod(periodStr);
		return org.joda.time.Seconds.seconds(p.getSeconds());
	}

	private Seconds(int seconds) {
		super(seconds);
	}

	private java.lang.Object readResolve() {
		return org.joda.time.Seconds.seconds(getValue());
	}

	public org.joda.time.DurationFieldType getFieldType() {
		return org.joda.time.DurationFieldType.seconds();
	}

	public org.joda.time.PeriodType getPeriodType() {
		return org.joda.time.PeriodType.seconds();
	}

	public org.joda.time.Weeks toStandardWeeks() {
		return org.joda.time.Weeks.weeks(((getValue()) / (org.joda.time.DateTimeConstants.SECONDS_PER_WEEK)));
	}

	public org.joda.time.Days toStandardDays() {
		return org.joda.time.Days.days(((getValue()) / (org.joda.time.DateTimeConstants.SECONDS_PER_DAY)));
	}

	public org.joda.time.Hours toStandardHours() {
		return org.joda.time.Hours.hours(((getValue()) / (org.joda.time.DateTimeConstants.SECONDS_PER_HOUR)));
	}

	public org.joda.time.Minutes toStandardMinutes() {
		return org.joda.time.Minutes.minutes(((getValue()) / (org.joda.time.DateTimeConstants.SECONDS_PER_MINUTE)));
	}

	public org.joda.time.Duration toStandardDuration() {
		long seconds = getValue();
		return new org.joda.time.Duration((seconds * (org.joda.time.DateTimeConstants.MILLIS_PER_SECOND)));
	}

	public int getSeconds() {
		return getValue();
	}

	public org.joda.time.Seconds plus(int seconds) {
		if (seconds == 0) {
			return org.joda.time.Seconds.this;
		}
		return org.joda.time.Seconds.seconds(org.joda.time.field.FieldUtils.safeAdd(getValue(), seconds));
	}

	public org.joda.time.Seconds plus(org.joda.time.Seconds seconds) {
		if (seconds == null) {
			return org.joda.time.Seconds.this;
		}
		return plus(seconds.getValue());
	}

	public org.joda.time.Seconds minus(int seconds) {
		return plus(org.joda.time.field.FieldUtils.safeNegate(seconds));
	}

	public org.joda.time.Seconds minus(org.joda.time.Seconds seconds) {
		if (seconds == null) {
			return org.joda.time.Seconds.this;
		}
		return minus(seconds.getValue());
	}

	public org.joda.time.Seconds multipliedBy(int scalar) {
		return org.joda.time.Seconds.seconds(org.joda.time.field.FieldUtils.safeMultiply(getValue(), scalar));
	}

	public org.joda.time.Seconds dividedBy(int divisor) {
		if (divisor == 1) {
			return org.joda.time.Seconds.this;
		}
		return org.joda.time.Seconds.seconds(((getValue()) / divisor));
	}

	public org.joda.time.Seconds negated() {
		return org.joda.time.Seconds.seconds(org.joda.time.field.FieldUtils.safeNegate(getValue()));
	}

	public boolean isGreaterThan(org.joda.time.Seconds other) {
		if (other == null) {
			return (getValue()) > 0;
		}
		return (getValue()) > (other.getValue());
	}

	public boolean isLessThan(org.joda.time.Seconds other) {
		if (other == null) {
			return (getValue()) < 0;
		}
		return (getValue()) < (other.getValue());
	}

	public java.lang.String toString() {
		return ("PT" + (java.lang.String.valueOf(getValue()))) + "S";
	}
}

