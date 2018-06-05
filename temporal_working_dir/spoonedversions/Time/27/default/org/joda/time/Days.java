

package org.joda.time;


public final class Days extends org.joda.time.base.BaseSingleFieldPeriod {
	public static final org.joda.time.Days ZERO = new org.joda.time.Days(0);

	public static final org.joda.time.Days ONE = new org.joda.time.Days(1);

	public static final org.joda.time.Days TWO = new org.joda.time.Days(2);

	public static final org.joda.time.Days THREE = new org.joda.time.Days(3);

	public static final org.joda.time.Days FOUR = new org.joda.time.Days(4);

	public static final org.joda.time.Days FIVE = new org.joda.time.Days(5);

	public static final org.joda.time.Days SIX = new org.joda.time.Days(6);

	public static final org.joda.time.Days SEVEN = new org.joda.time.Days(7);

	public static final org.joda.time.Days MAX_VALUE = new org.joda.time.Days(java.lang.Integer.MAX_VALUE);

	public static final org.joda.time.Days MIN_VALUE = new org.joda.time.Days(java.lang.Integer.MIN_VALUE);

	private static final org.joda.time.format.PeriodFormatter PARSER = org.joda.time.format.ISOPeriodFormat.standard().withParseType(org.joda.time.PeriodType.days());

	private static final long serialVersionUID = 87525275727380865L;

	public static org.joda.time.Days days(int days) {
		switch (days) {
			case 0 :
				return org.joda.time.Days.ZERO;
			case 1 :
				return org.joda.time.Days.ONE;
			case 2 :
				return org.joda.time.Days.TWO;
			case 3 :
				return org.joda.time.Days.THREE;
			case 4 :
				return org.joda.time.Days.FOUR;
			case 5 :
				return org.joda.time.Days.FIVE;
			case 6 :
				return org.joda.time.Days.SIX;
			case 7 :
				return org.joda.time.Days.SEVEN;
			case java.lang.Integer.MAX_VALUE :
				return org.joda.time.Days.MAX_VALUE;
			case java.lang.Integer.MIN_VALUE :
				return org.joda.time.Days.MIN_VALUE;
			default :
				return new org.joda.time.Days(days);
		}
	}

	public static org.joda.time.Days daysBetween(org.joda.time.ReadableInstant start, org.joda.time.ReadableInstant end) {
		int amount = org.joda.time.base.BaseSingleFieldPeriod.between(start, end, org.joda.time.DurationFieldType.days());
		return org.joda.time.Days.days(amount);
	}

	public static org.joda.time.Days daysBetween(org.joda.time.ReadablePartial start, org.joda.time.ReadablePartial end) {
		if ((start instanceof org.joda.time.LocalDate) && (end instanceof org.joda.time.LocalDate)) {
			org.joda.time.Chronology chrono = org.joda.time.DateTimeUtils.getChronology(start.getChronology());
			int days = chrono.days().getDifference(((org.joda.time.LocalDate) (end)).getLocalMillis(), ((org.joda.time.LocalDate) (start)).getLocalMillis());
			return org.joda.time.Days.days(days);
		}
		int amount = org.joda.time.base.BaseSingleFieldPeriod.between(start, end, org.joda.time.Days.ZERO);
		return org.joda.time.Days.days(amount);
	}

	public static org.joda.time.Days daysIn(org.joda.time.ReadableInterval interval) {
		if (interval == null) {
			return org.joda.time.Days.ZERO;
		}
		int amount = org.joda.time.base.BaseSingleFieldPeriod.between(interval.getStart(), interval.getEnd(), org.joda.time.DurationFieldType.days());
		return org.joda.time.Days.days(amount);
	}

	public static org.joda.time.Days standardDaysIn(org.joda.time.ReadablePeriod period) {
		int amount = org.joda.time.base.BaseSingleFieldPeriod.standardPeriodIn(period, org.joda.time.DateTimeConstants.MILLIS_PER_DAY);
		return org.joda.time.Days.days(amount);
	}

	public static org.joda.time.Days parseDays(java.lang.String periodStr) {
		if (periodStr == null) {
			return org.joda.time.Days.ZERO;
		}
		org.joda.time.Period p = org.joda.time.Days.PARSER.parsePeriod(periodStr);
		return org.joda.time.Days.days(p.getDays());
	}

	private Days(int days) {
		super(days);
	}

	private java.lang.Object readResolve() {
		return org.joda.time.Days.days(getValue());
	}

	public org.joda.time.DurationFieldType getFieldType() {
		return org.joda.time.DurationFieldType.days();
	}

	public org.joda.time.PeriodType getPeriodType() {
		return org.joda.time.PeriodType.days();
	}

	public org.joda.time.Weeks toStandardWeeks() {
		return org.joda.time.Weeks.weeks(((getValue()) / (org.joda.time.DateTimeConstants.DAYS_PER_WEEK)));
	}

	public org.joda.time.Hours toStandardHours() {
		return org.joda.time.Hours.hours(org.joda.time.field.FieldUtils.safeMultiply(getValue(), org.joda.time.DateTimeConstants.HOURS_PER_DAY));
	}

	public org.joda.time.Minutes toStandardMinutes() {
		return org.joda.time.Minutes.minutes(org.joda.time.field.FieldUtils.safeMultiply(getValue(), org.joda.time.DateTimeConstants.MINUTES_PER_DAY));
	}

	public org.joda.time.Seconds toStandardSeconds() {
		return org.joda.time.Seconds.seconds(org.joda.time.field.FieldUtils.safeMultiply(getValue(), org.joda.time.DateTimeConstants.SECONDS_PER_DAY));
	}

	public org.joda.time.Duration toStandardDuration() {
		long days = getValue();
		return new org.joda.time.Duration((days * (org.joda.time.DateTimeConstants.MILLIS_PER_DAY)));
	}

	public int getDays() {
		return getValue();
	}

	public org.joda.time.Days plus(int days) {
		if (days == 0) {
			return org.joda.time.Days.this;
		}
		return org.joda.time.Days.days(org.joda.time.field.FieldUtils.safeAdd(getValue(), days));
	}

	public org.joda.time.Days plus(org.joda.time.Days days) {
		if (days == null) {
			return org.joda.time.Days.this;
		}
		return plus(days.getValue());
	}

	public org.joda.time.Days minus(int days) {
		return plus(org.joda.time.field.FieldUtils.safeNegate(days));
	}

	public org.joda.time.Days minus(org.joda.time.Days days) {
		if (days == null) {
			return org.joda.time.Days.this;
		}
		return minus(days.getValue());
	}

	public org.joda.time.Days multipliedBy(int scalar) {
		return org.joda.time.Days.days(org.joda.time.field.FieldUtils.safeMultiply(getValue(), scalar));
	}

	public org.joda.time.Days dividedBy(int divisor) {
		if (divisor == 1) {
			return org.joda.time.Days.this;
		}
		return org.joda.time.Days.days(((getValue()) / divisor));
	}

	public org.joda.time.Days negated() {
		return org.joda.time.Days.days(org.joda.time.field.FieldUtils.safeNegate(getValue()));
	}

	public boolean isGreaterThan(org.joda.time.Days other) {
		if (other == null) {
			return (getValue()) > 0;
		}
		return (getValue()) > (other.getValue());
	}

	public boolean isLessThan(org.joda.time.Days other) {
		if (other == null) {
			return (getValue()) < 0;
		}
		return (getValue()) < (other.getValue());
	}

	public java.lang.String toString() {
		return ("P" + (java.lang.String.valueOf(getValue()))) + "D";
	}
}

