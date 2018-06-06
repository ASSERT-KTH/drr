

package org.joda.time;


public final class Weeks extends org.joda.time.base.BaseSingleFieldPeriod {
	public static final org.joda.time.Weeks ZERO = new org.joda.time.Weeks(0);

	public static final org.joda.time.Weeks ONE = new org.joda.time.Weeks(1);

	public static final org.joda.time.Weeks TWO = new org.joda.time.Weeks(2);

	public static final org.joda.time.Weeks THREE = new org.joda.time.Weeks(3);

	public static final org.joda.time.Weeks MAX_VALUE = new org.joda.time.Weeks(java.lang.Integer.MAX_VALUE);

	public static final org.joda.time.Weeks MIN_VALUE = new org.joda.time.Weeks(java.lang.Integer.MIN_VALUE);

	private static final org.joda.time.format.PeriodFormatter PARSER = org.joda.time.format.ISOPeriodFormat.standard().withParseType(org.joda.time.PeriodType.weeks());

	private static final long serialVersionUID = 87525275727380866L;

	public static org.joda.time.Weeks weeks(int weeks) {
		switch (weeks) {
			case 0 :
				return org.joda.time.Weeks.ZERO;
			case 1 :
				return org.joda.time.Weeks.ONE;
			case 2 :
				return org.joda.time.Weeks.TWO;
			case 3 :
				return org.joda.time.Weeks.THREE;
			case java.lang.Integer.MAX_VALUE :
				return org.joda.time.Weeks.MAX_VALUE;
			case java.lang.Integer.MIN_VALUE :
				return org.joda.time.Weeks.MIN_VALUE;
			default :
				return new org.joda.time.Weeks(weeks);
		}
	}

	public static org.joda.time.Weeks weeksBetween(org.joda.time.ReadableInstant start, org.joda.time.ReadableInstant end) {
		int amount = org.joda.time.base.BaseSingleFieldPeriod.between(start, end, org.joda.time.DurationFieldType.weeks());
		return org.joda.time.Weeks.weeks(amount);
	}

	public static org.joda.time.Weeks weeksBetween(org.joda.time.ReadablePartial start, org.joda.time.ReadablePartial end) {
		if ((start instanceof org.joda.time.LocalDate) && (end instanceof org.joda.time.LocalDate)) {
			org.joda.time.Chronology chrono = org.joda.time.DateTimeUtils.getChronology(start.getChronology());
			int weeks = chrono.weeks().getDifference(((org.joda.time.LocalDate) (end)).getLocalMillis(), ((org.joda.time.LocalDate) (start)).getLocalMillis());
			return org.joda.time.Weeks.weeks(weeks);
		}
		int amount = org.joda.time.base.BaseSingleFieldPeriod.between(start, end, org.joda.time.Weeks.ZERO);
		return org.joda.time.Weeks.weeks(amount);
	}

	public static org.joda.time.Weeks weeksIn(org.joda.time.ReadableInterval interval) {
		if (interval == null) {
			return org.joda.time.Weeks.ZERO;
		}
		int amount = org.joda.time.base.BaseSingleFieldPeriod.between(interval.getStart(), interval.getEnd(), org.joda.time.DurationFieldType.weeks());
		return org.joda.time.Weeks.weeks(amount);
	}

	public static org.joda.time.Weeks standardWeeksIn(org.joda.time.ReadablePeriod period) {
		int amount = org.joda.time.base.BaseSingleFieldPeriod.standardPeriodIn(period, org.joda.time.DateTimeConstants.MILLIS_PER_WEEK);
		return org.joda.time.Weeks.weeks(amount);
	}

	public static org.joda.time.Weeks parseWeeks(java.lang.String periodStr) {
		if (periodStr == null) {
			return org.joda.time.Weeks.ZERO;
		}
		org.joda.time.Period p = org.joda.time.Weeks.PARSER.parsePeriod(periodStr);
		return org.joda.time.Weeks.weeks(p.getWeeks());
	}

	private Weeks(int weeks) {
		super(weeks);
	}

	private java.lang.Object readResolve() {
		return org.joda.time.Weeks.weeks(getValue());
	}

	public org.joda.time.DurationFieldType getFieldType() {
		return org.joda.time.DurationFieldType.weeks();
	}

	public org.joda.time.PeriodType getPeriodType() {
		return org.joda.time.PeriodType.weeks();
	}

	public org.joda.time.Days toStandardDays() {
		return org.joda.time.Days.days(org.joda.time.field.FieldUtils.safeMultiply(getValue(), org.joda.time.DateTimeConstants.DAYS_PER_WEEK));
	}

	public org.joda.time.Hours toStandardHours() {
		return org.joda.time.Hours.hours(org.joda.time.field.FieldUtils.safeMultiply(getValue(), org.joda.time.DateTimeConstants.HOURS_PER_WEEK));
	}

	public org.joda.time.Minutes toStandardMinutes() {
		return org.joda.time.Minutes.minutes(org.joda.time.field.FieldUtils.safeMultiply(getValue(), org.joda.time.DateTimeConstants.MINUTES_PER_WEEK));
	}

	public org.joda.time.Seconds toStandardSeconds() {
		return org.joda.time.Seconds.seconds(org.joda.time.field.FieldUtils.safeMultiply(getValue(), org.joda.time.DateTimeConstants.SECONDS_PER_WEEK));
	}

	public org.joda.time.Duration toStandardDuration() {
		long weeks = getValue();
		return new org.joda.time.Duration((weeks * (org.joda.time.DateTimeConstants.MILLIS_PER_WEEK)));
	}

	public int getWeeks() {
		return getValue();
	}

	public org.joda.time.Weeks plus(int weeks) {
		if (weeks == 0) {
			return org.joda.time.Weeks.this;
		}
		return org.joda.time.Weeks.weeks(org.joda.time.field.FieldUtils.safeAdd(getValue(), weeks));
	}

	public org.joda.time.Weeks plus(org.joda.time.Weeks weeks) {
		if (weeks == null) {
			return org.joda.time.Weeks.this;
		}
		return plus(weeks.getValue());
	}

	public org.joda.time.Weeks minus(int weeks) {
		return plus(org.joda.time.field.FieldUtils.safeNegate(weeks));
	}

	public org.joda.time.Weeks minus(org.joda.time.Weeks weeks) {
		if (weeks == null) {
			return org.joda.time.Weeks.this;
		}
		return minus(weeks.getValue());
	}

	public org.joda.time.Weeks multipliedBy(int scalar) {
		return org.joda.time.Weeks.weeks(org.joda.time.field.FieldUtils.safeMultiply(getValue(), scalar));
	}

	public org.joda.time.Weeks dividedBy(int divisor) {
		if (divisor == 1) {
			return org.joda.time.Weeks.this;
		}
		return org.joda.time.Weeks.weeks(((getValue()) / divisor));
	}

	public org.joda.time.Weeks negated() {
		return org.joda.time.Weeks.weeks(org.joda.time.field.FieldUtils.safeNegate(getValue()));
	}

	public boolean isGreaterThan(org.joda.time.Weeks other) {
		if (other == null) {
			return (getValue()) > 0;
		}
		return (getValue()) > (other.getValue());
	}

	public boolean isLessThan(org.joda.time.Weeks other) {
		if (other == null) {
			return (getValue()) < 0;
		}
		return (getValue()) < (other.getValue());
	}

	public java.lang.String toString() {
		return ("P" + (java.lang.String.valueOf(getValue()))) + "W";
	}
}

