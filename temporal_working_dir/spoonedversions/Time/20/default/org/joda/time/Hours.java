

package org.joda.time;


public final class Hours extends org.joda.time.base.BaseSingleFieldPeriod {
	public static final org.joda.time.Hours ZERO = new org.joda.time.Hours(0);

	public static final org.joda.time.Hours ONE = new org.joda.time.Hours(1);

	public static final org.joda.time.Hours TWO = new org.joda.time.Hours(2);

	public static final org.joda.time.Hours THREE = new org.joda.time.Hours(3);

	public static final org.joda.time.Hours FOUR = new org.joda.time.Hours(4);

	public static final org.joda.time.Hours FIVE = new org.joda.time.Hours(5);

	public static final org.joda.time.Hours SIX = new org.joda.time.Hours(6);

	public static final org.joda.time.Hours SEVEN = new org.joda.time.Hours(7);

	public static final org.joda.time.Hours EIGHT = new org.joda.time.Hours(8);

	public static final org.joda.time.Hours MAX_VALUE = new org.joda.time.Hours(java.lang.Integer.MAX_VALUE);

	public static final org.joda.time.Hours MIN_VALUE = new org.joda.time.Hours(java.lang.Integer.MIN_VALUE);

	private static final org.joda.time.format.PeriodFormatter PARSER = org.joda.time.format.ISOPeriodFormat.standard().withParseType(org.joda.time.PeriodType.hours());

	private static final long serialVersionUID = 87525275727380864L;

	public static org.joda.time.Hours hours(int hours) {
		switch (hours) {
			case 0 :
				return org.joda.time.Hours.ZERO;
			case 1 :
				return org.joda.time.Hours.ONE;
			case 2 :
				return org.joda.time.Hours.TWO;
			case 3 :
				return org.joda.time.Hours.THREE;
			case 4 :
				return org.joda.time.Hours.FOUR;
			case 5 :
				return org.joda.time.Hours.FIVE;
			case 6 :
				return org.joda.time.Hours.SIX;
			case 7 :
				return org.joda.time.Hours.SEVEN;
			case 8 :
				return org.joda.time.Hours.EIGHT;
			case java.lang.Integer.MAX_VALUE :
				return org.joda.time.Hours.MAX_VALUE;
			case java.lang.Integer.MIN_VALUE :
				return org.joda.time.Hours.MIN_VALUE;
			default :
				return new org.joda.time.Hours(hours);
		}
	}

	public static org.joda.time.Hours hoursBetween(org.joda.time.ReadableInstant start, org.joda.time.ReadableInstant end) {
		int amount = org.joda.time.base.BaseSingleFieldPeriod.between(start, end, org.joda.time.DurationFieldType.hours());
		return org.joda.time.Hours.hours(amount);
	}

	public static org.joda.time.Hours hoursBetween(org.joda.time.ReadablePartial start, org.joda.time.ReadablePartial end) {
		if ((start instanceof org.joda.time.LocalTime) && (end instanceof org.joda.time.LocalTime)) {
			org.joda.time.Chronology chrono = org.joda.time.DateTimeUtils.getChronology(start.getChronology());
			int hours = chrono.hours().getDifference(((org.joda.time.LocalTime) (end)).getLocalMillis(), ((org.joda.time.LocalTime) (start)).getLocalMillis());
			return org.joda.time.Hours.hours(hours);
		}
		int amount = org.joda.time.base.BaseSingleFieldPeriod.between(start, end, org.joda.time.Hours.ZERO);
		return org.joda.time.Hours.hours(amount);
	}

	public static org.joda.time.Hours hoursIn(org.joda.time.ReadableInterval interval) {
		if (interval == null) {
			return org.joda.time.Hours.ZERO;
		}
		int amount = org.joda.time.base.BaseSingleFieldPeriod.between(interval.getStart(), interval.getEnd(), org.joda.time.DurationFieldType.hours());
		return org.joda.time.Hours.hours(amount);
	}

	public static org.joda.time.Hours standardHoursIn(org.joda.time.ReadablePeriod period) {
		int amount = org.joda.time.base.BaseSingleFieldPeriod.standardPeriodIn(period, org.joda.time.DateTimeConstants.MILLIS_PER_HOUR);
		return org.joda.time.Hours.hours(amount);
	}

	@org.joda.convert.FromString
	public static org.joda.time.Hours parseHours(java.lang.String periodStr) {
		if (periodStr == null) {
			return org.joda.time.Hours.ZERO;
		}
		org.joda.time.Period p = org.joda.time.Hours.PARSER.parsePeriod(periodStr);
		return org.joda.time.Hours.hours(p.getHours());
	}

	private Hours(int hours) {
		super(hours);
	}

	private java.lang.Object readResolve() {
		return org.joda.time.Hours.hours(getValue());
	}

	public org.joda.time.DurationFieldType getFieldType() {
		return org.joda.time.DurationFieldType.hours();
	}

	public org.joda.time.PeriodType getPeriodType() {
		return org.joda.time.PeriodType.hours();
	}

	public org.joda.time.Weeks toStandardWeeks() {
		return org.joda.time.Weeks.weeks(((getValue()) / (org.joda.time.DateTimeConstants.HOURS_PER_WEEK)));
	}

	public org.joda.time.Days toStandardDays() {
		return org.joda.time.Days.days(((getValue()) / (org.joda.time.DateTimeConstants.HOURS_PER_DAY)));
	}

	public org.joda.time.Minutes toStandardMinutes() {
		return org.joda.time.Minutes.minutes(org.joda.time.field.FieldUtils.safeMultiply(getValue(), org.joda.time.DateTimeConstants.MINUTES_PER_HOUR));
	}

	public org.joda.time.Seconds toStandardSeconds() {
		return org.joda.time.Seconds.seconds(org.joda.time.field.FieldUtils.safeMultiply(getValue(), org.joda.time.DateTimeConstants.SECONDS_PER_HOUR));
	}

	public org.joda.time.Duration toStandardDuration() {
		long hours = getValue();
		return new org.joda.time.Duration((hours * (org.joda.time.DateTimeConstants.MILLIS_PER_HOUR)));
	}

	public int getHours() {
		return getValue();
	}

	public org.joda.time.Hours plus(int hours) {
		if (hours == 0) {
			return org.joda.time.Hours.this;
		}
		return org.joda.time.Hours.hours(org.joda.time.field.FieldUtils.safeAdd(getValue(), hours));
	}

	public org.joda.time.Hours plus(org.joda.time.Hours hours) {
		if (hours == null) {
			return org.joda.time.Hours.this;
		}
		return plus(hours.getValue());
	}

	public org.joda.time.Hours minus(int hours) {
		return plus(org.joda.time.field.FieldUtils.safeNegate(hours));
	}

	public org.joda.time.Hours minus(org.joda.time.Hours hours) {
		if (hours == null) {
			return org.joda.time.Hours.this;
		}
		return minus(hours.getValue());
	}

	public org.joda.time.Hours multipliedBy(int scalar) {
		return org.joda.time.Hours.hours(org.joda.time.field.FieldUtils.safeMultiply(getValue(), scalar));
	}

	public org.joda.time.Hours dividedBy(int divisor) {
		if (divisor == 1) {
			return org.joda.time.Hours.this;
		}
		return org.joda.time.Hours.hours(((getValue()) / divisor));
	}

	public org.joda.time.Hours negated() {
		return org.joda.time.Hours.hours(org.joda.time.field.FieldUtils.safeNegate(getValue()));
	}

	public boolean isGreaterThan(org.joda.time.Hours other) {
		if (other == null) {
			return (getValue()) > 0;
		}
		return (getValue()) > (other.getValue());
	}

	public boolean isLessThan(org.joda.time.Hours other) {
		if (other == null) {
			return (getValue()) < 0;
		}
		return (getValue()) < (other.getValue());
	}

	@org.joda.convert.ToString
	public java.lang.String toString() {
		return ("PT" + (java.lang.String.valueOf(getValue()))) + "H";
	}
}

