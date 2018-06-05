

package org.joda.time;


public final class Years extends org.joda.time.base.BaseSingleFieldPeriod {
	public static final org.joda.time.Years ZERO = new org.joda.time.Years(0);

	public static final org.joda.time.Years ONE = new org.joda.time.Years(1);

	public static final org.joda.time.Years TWO = new org.joda.time.Years(2);

	public static final org.joda.time.Years THREE = new org.joda.time.Years(3);

	public static final org.joda.time.Years MAX_VALUE = new org.joda.time.Years(java.lang.Integer.MAX_VALUE);

	public static final org.joda.time.Years MIN_VALUE = new org.joda.time.Years(java.lang.Integer.MIN_VALUE);

	private static final org.joda.time.format.PeriodFormatter PARSER = org.joda.time.format.ISOPeriodFormat.standard().withParseType(org.joda.time.PeriodType.years());

	private static final long serialVersionUID = 87525275727380868L;

	public static org.joda.time.Years years(int years) {
		switch (years) {
			case 0 :
				return org.joda.time.Years.ZERO;
			case 1 :
				return org.joda.time.Years.ONE;
			case 2 :
				return org.joda.time.Years.TWO;
			case 3 :
				return org.joda.time.Years.THREE;
			case java.lang.Integer.MAX_VALUE :
				return org.joda.time.Years.MAX_VALUE;
			case java.lang.Integer.MIN_VALUE :
				return org.joda.time.Years.MIN_VALUE;
			default :
				return new org.joda.time.Years(years);
		}
	}

	public static org.joda.time.Years yearsBetween(org.joda.time.ReadableInstant start, org.joda.time.ReadableInstant end) {
		int amount = org.joda.time.base.BaseSingleFieldPeriod.between(start, end, org.joda.time.DurationFieldType.years());
		return org.joda.time.Years.years(amount);
	}

	public static org.joda.time.Years yearsBetween(org.joda.time.ReadablePartial start, org.joda.time.ReadablePartial end) {
		if ((start instanceof org.joda.time.LocalDate) && (end instanceof org.joda.time.LocalDate)) {
			org.joda.time.Chronology chrono = org.joda.time.DateTimeUtils.getChronology(start.getChronology());
			int years = chrono.years().getDifference(((org.joda.time.LocalDate) (end)).getLocalMillis(), ((org.joda.time.LocalDate) (start)).getLocalMillis());
			return org.joda.time.Years.years(years);
		}
		int amount = org.joda.time.base.BaseSingleFieldPeriod.between(start, end, org.joda.time.Years.ZERO);
		return org.joda.time.Years.years(amount);
	}

	public static org.joda.time.Years yearsIn(org.joda.time.ReadableInterval interval) {
		if (interval == null) {
			return org.joda.time.Years.ZERO;
		}
		int amount = org.joda.time.base.BaseSingleFieldPeriod.between(interval.getStart(), interval.getEnd(), org.joda.time.DurationFieldType.years());
		return org.joda.time.Years.years(amount);
	}

	@org.joda.convert.FromString
	public static org.joda.time.Years parseYears(java.lang.String periodStr) {
		if (periodStr == null) {
			return org.joda.time.Years.ZERO;
		}
		org.joda.time.Period p = org.joda.time.Years.PARSER.parsePeriod(periodStr);
		return org.joda.time.Years.years(p.getYears());
	}

	private Years(int years) {
		super(years);
	}

	private java.lang.Object readResolve() {
		return org.joda.time.Years.years(getValue());
	}

	public org.joda.time.DurationFieldType getFieldType() {
		return org.joda.time.DurationFieldType.years();
	}

	public org.joda.time.PeriodType getPeriodType() {
		return org.joda.time.PeriodType.years();
	}

	public int getYears() {
		return getValue();
	}

	public org.joda.time.Years plus(int years) {
		if (years == 0) {
			return org.joda.time.Years.this;
		}
		return org.joda.time.Years.years(org.joda.time.field.FieldUtils.safeAdd(getValue(), years));
	}

	public org.joda.time.Years plus(org.joda.time.Years years) {
		if (years == null) {
			return org.joda.time.Years.this;
		}
		return plus(years.getValue());
	}

	public org.joda.time.Years minus(int years) {
		return plus(org.joda.time.field.FieldUtils.safeNegate(years));
	}

	public org.joda.time.Years minus(org.joda.time.Years years) {
		if (years == null) {
			return org.joda.time.Years.this;
		}
		return minus(years.getValue());
	}

	public org.joda.time.Years multipliedBy(int scalar) {
		return org.joda.time.Years.years(org.joda.time.field.FieldUtils.safeMultiply(getValue(), scalar));
	}

	public org.joda.time.Years dividedBy(int divisor) {
		if (divisor == 1) {
			return org.joda.time.Years.this;
		}
		return org.joda.time.Years.years(((getValue()) / divisor));
	}

	public org.joda.time.Years negated() {
		return org.joda.time.Years.years(org.joda.time.field.FieldUtils.safeNegate(getValue()));
	}

	public boolean isGreaterThan(org.joda.time.Years other) {
		if (other == null) {
			return (getValue()) > 0;
		}
		return (getValue()) > (other.getValue());
	}

	public boolean isLessThan(org.joda.time.Years other) {
		if (other == null) {
			return (getValue()) < 0;
		}
		return (getValue()) < (other.getValue());
	}

	@org.joda.convert.ToString
	public java.lang.String toString() {
		return ("P" + (java.lang.String.valueOf(getValue()))) + "Y";
	}
}

