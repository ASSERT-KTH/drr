

package org.joda.time;


public final class Minutes extends org.joda.time.base.BaseSingleFieldPeriod {
	public static final org.joda.time.Minutes ZERO = new org.joda.time.Minutes(0);

	public static final org.joda.time.Minutes ONE = new org.joda.time.Minutes(1);

	public static final org.joda.time.Minutes TWO = new org.joda.time.Minutes(2);

	public static final org.joda.time.Minutes THREE = new org.joda.time.Minutes(3);

	public static final org.joda.time.Minutes MAX_VALUE = new org.joda.time.Minutes(java.lang.Integer.MAX_VALUE);

	public static final org.joda.time.Minutes MIN_VALUE = new org.joda.time.Minutes(java.lang.Integer.MIN_VALUE);

	private static final org.joda.time.format.PeriodFormatter PARSER = org.joda.time.format.ISOPeriodFormat.standard().withParseType(org.joda.time.PeriodType.minutes());

	private static final long serialVersionUID = 87525275727380863L;

	public static org.joda.time.Minutes minutes(int minutes) {
		switch (minutes) {
			case 0 :
				return org.joda.time.Minutes.ZERO;
			case 1 :
				return org.joda.time.Minutes.ONE;
			case 2 :
				return org.joda.time.Minutes.TWO;
			case 3 :
				return org.joda.time.Minutes.THREE;
			case java.lang.Integer.MAX_VALUE :
				return org.joda.time.Minutes.MAX_VALUE;
			case java.lang.Integer.MIN_VALUE :
				return org.joda.time.Minutes.MIN_VALUE;
			default :
				return new org.joda.time.Minutes(minutes);
		}
	}

	public static org.joda.time.Minutes minutesBetween(org.joda.time.ReadableInstant start, org.joda.time.ReadableInstant end) {
		int amount = org.joda.time.base.BaseSingleFieldPeriod.between(start, end, org.joda.time.DurationFieldType.minutes());
		return org.joda.time.Minutes.minutes(amount);
	}

	public static org.joda.time.Minutes minutesBetween(org.joda.time.ReadablePartial start, org.joda.time.ReadablePartial end) {
		if ((start instanceof org.joda.time.LocalTime) && (end instanceof org.joda.time.LocalTime)) {
			org.joda.time.Chronology chrono = org.joda.time.DateTimeUtils.getChronology(start.getChronology());
			int minutes = chrono.minutes().getDifference(((org.joda.time.LocalTime) (end)).getLocalMillis(), ((org.joda.time.LocalTime) (start)).getLocalMillis());
			return org.joda.time.Minutes.minutes(minutes);
		}
		int amount = org.joda.time.base.BaseSingleFieldPeriod.between(start, end, org.joda.time.Minutes.ZERO);
		return org.joda.time.Minutes.minutes(amount);
	}

	public static org.joda.time.Minutes minutesIn(org.joda.time.ReadableInterval interval) {
		if (interval == null) {
			return org.joda.time.Minutes.ZERO;
		}
		int amount = org.joda.time.base.BaseSingleFieldPeriod.between(interval.getStart(), interval.getEnd(), org.joda.time.DurationFieldType.minutes());
		return org.joda.time.Minutes.minutes(amount);
	}

	public static org.joda.time.Minutes standardMinutesIn(org.joda.time.ReadablePeriod period) {
		int amount = org.joda.time.base.BaseSingleFieldPeriod.standardPeriodIn(period, org.joda.time.DateTimeConstants.MILLIS_PER_MINUTE);
		return org.joda.time.Minutes.minutes(amount);
	}

	@org.joda.convert.FromString
	public static org.joda.time.Minutes parseMinutes(java.lang.String periodStr) {
		if (periodStr == null) {
			return org.joda.time.Minutes.ZERO;
		}
		org.joda.time.Period p = org.joda.time.Minutes.PARSER.parsePeriod(periodStr);
		return org.joda.time.Minutes.minutes(p.getMinutes());
	}

	private Minutes(int minutes) {
		super(minutes);
	}

	private java.lang.Object readResolve() {
		return org.joda.time.Minutes.minutes(getValue());
	}

	public org.joda.time.DurationFieldType getFieldType() {
		return org.joda.time.DurationFieldType.minutes();
	}

	public org.joda.time.PeriodType getPeriodType() {
		return org.joda.time.PeriodType.minutes();
	}

	public org.joda.time.Weeks toStandardWeeks() {
		return org.joda.time.Weeks.weeks(((getValue()) / (org.joda.time.DateTimeConstants.MINUTES_PER_WEEK)));
	}

	public org.joda.time.Days toStandardDays() {
		return org.joda.time.Days.days(((getValue()) / (org.joda.time.DateTimeConstants.MINUTES_PER_DAY)));
	}

	public org.joda.time.Hours toStandardHours() {
		return org.joda.time.Hours.hours(((getValue()) / (org.joda.time.DateTimeConstants.MINUTES_PER_HOUR)));
	}

	public org.joda.time.Seconds toStandardSeconds() {
		return org.joda.time.Seconds.seconds(org.joda.time.field.FieldUtils.safeMultiply(getValue(), org.joda.time.DateTimeConstants.SECONDS_PER_MINUTE));
	}

	public org.joda.time.Duration toStandardDuration() {
		long minutes = getValue();
		return new org.joda.time.Duration((minutes * (org.joda.time.DateTimeConstants.MILLIS_PER_MINUTE)));
	}

	public int getMinutes() {
		return getValue();
	}

	public org.joda.time.Minutes plus(int minutes) {
		if (minutes == 0) {
			return org.joda.time.Minutes.this;
		}
		return org.joda.time.Minutes.minutes(org.joda.time.field.FieldUtils.safeAdd(getValue(), minutes));
	}

	public org.joda.time.Minutes plus(org.joda.time.Minutes minutes) {
		if (minutes == null) {
			return org.joda.time.Minutes.this;
		}
		return plus(minutes.getValue());
	}

	public org.joda.time.Minutes minus(int minutes) {
		return plus(org.joda.time.field.FieldUtils.safeNegate(minutes));
	}

	public org.joda.time.Minutes minus(org.joda.time.Minutes minutes) {
		if (minutes == null) {
			return org.joda.time.Minutes.this;
		}
		return minus(minutes.getValue());
	}

	public org.joda.time.Minutes multipliedBy(int scalar) {
		return org.joda.time.Minutes.minutes(org.joda.time.field.FieldUtils.safeMultiply(getValue(), scalar));
	}

	public org.joda.time.Minutes dividedBy(int divisor) {
		if (divisor == 1) {
			return org.joda.time.Minutes.this;
		}
		return org.joda.time.Minutes.minutes(((getValue()) / divisor));
	}

	public org.joda.time.Minutes negated() {
		return org.joda.time.Minutes.minutes(org.joda.time.field.FieldUtils.safeNegate(getValue()));
	}

	public boolean isGreaterThan(org.joda.time.Minutes other) {
		if (other == null) {
			return (getValue()) > 0;
		}
		return (getValue()) > (other.getValue());
	}

	public boolean isLessThan(org.joda.time.Minutes other) {
		if (other == null) {
			return (getValue()) < 0;
		}
		return (getValue()) < (other.getValue());
	}

	@org.joda.convert.ToString
	public java.lang.String toString() {
		return ("PT" + (java.lang.String.valueOf(getValue()))) + "M";
	}
}

