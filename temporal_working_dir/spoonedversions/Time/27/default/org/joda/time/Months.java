

package org.joda.time;


public final class Months extends org.joda.time.base.BaseSingleFieldPeriod {
	public static final org.joda.time.Months ZERO = new org.joda.time.Months(0);

	public static final org.joda.time.Months ONE = new org.joda.time.Months(1);

	public static final org.joda.time.Months TWO = new org.joda.time.Months(2);

	public static final org.joda.time.Months THREE = new org.joda.time.Months(3);

	public static final org.joda.time.Months FOUR = new org.joda.time.Months(4);

	public static final org.joda.time.Months FIVE = new org.joda.time.Months(5);

	public static final org.joda.time.Months SIX = new org.joda.time.Months(6);

	public static final org.joda.time.Months SEVEN = new org.joda.time.Months(7);

	public static final org.joda.time.Months EIGHT = new org.joda.time.Months(8);

	public static final org.joda.time.Months NINE = new org.joda.time.Months(9);

	public static final org.joda.time.Months TEN = new org.joda.time.Months(10);

	public static final org.joda.time.Months ELEVEN = new org.joda.time.Months(11);

	public static final org.joda.time.Months TWELVE = new org.joda.time.Months(12);

	public static final org.joda.time.Months MAX_VALUE = new org.joda.time.Months(java.lang.Integer.MAX_VALUE);

	public static final org.joda.time.Months MIN_VALUE = new org.joda.time.Months(java.lang.Integer.MIN_VALUE);

	private static final org.joda.time.format.PeriodFormatter PARSER = org.joda.time.format.ISOPeriodFormat.standard().withParseType(org.joda.time.PeriodType.months());

	private static final long serialVersionUID = 87525275727380867L;

	public static org.joda.time.Months months(int months) {
		switch (months) {
			case 0 :
				return org.joda.time.Months.ZERO;
			case 1 :
				return org.joda.time.Months.ONE;
			case 2 :
				return org.joda.time.Months.TWO;
			case 3 :
				return org.joda.time.Months.THREE;
			case 4 :
				return org.joda.time.Months.FOUR;
			case 5 :
				return org.joda.time.Months.FIVE;
			case 6 :
				return org.joda.time.Months.SIX;
			case 7 :
				return org.joda.time.Months.SEVEN;
			case 8 :
				return org.joda.time.Months.EIGHT;
			case 9 :
				return org.joda.time.Months.NINE;
			case 10 :
				return org.joda.time.Months.TEN;
			case 11 :
				return org.joda.time.Months.ELEVEN;
			case 12 :
				return org.joda.time.Months.TWELVE;
			case java.lang.Integer.MAX_VALUE :
				return org.joda.time.Months.MAX_VALUE;
			case java.lang.Integer.MIN_VALUE :
				return org.joda.time.Months.MIN_VALUE;
			default :
				return new org.joda.time.Months(months);
		}
	}

	public static org.joda.time.Months monthsBetween(org.joda.time.ReadableInstant start, org.joda.time.ReadableInstant end) {
		int amount = org.joda.time.base.BaseSingleFieldPeriod.between(start, end, org.joda.time.DurationFieldType.months());
		return org.joda.time.Months.months(amount);
	}

	public static org.joda.time.Months monthsBetween(org.joda.time.ReadablePartial start, org.joda.time.ReadablePartial end) {
		if ((start instanceof org.joda.time.LocalDate) && (end instanceof org.joda.time.LocalDate)) {
			org.joda.time.Chronology chrono = org.joda.time.DateTimeUtils.getChronology(start.getChronology());
			int months = chrono.months().getDifference(((org.joda.time.LocalDate) (end)).getLocalMillis(), ((org.joda.time.LocalDate) (start)).getLocalMillis());
			return org.joda.time.Months.months(months);
		}
		int amount = org.joda.time.base.BaseSingleFieldPeriod.between(start, end, org.joda.time.Months.ZERO);
		return org.joda.time.Months.months(amount);
	}

	public static org.joda.time.Months monthsIn(org.joda.time.ReadableInterval interval) {
		if (interval == null) {
			return org.joda.time.Months.ZERO;
		}
		int amount = org.joda.time.base.BaseSingleFieldPeriod.between(interval.getStart(), interval.getEnd(), org.joda.time.DurationFieldType.months());
		return org.joda.time.Months.months(amount);
	}

	public static org.joda.time.Months parseMonths(java.lang.String periodStr) {
		if (periodStr == null) {
			return org.joda.time.Months.ZERO;
		}
		org.joda.time.Period p = org.joda.time.Months.PARSER.parsePeriod(periodStr);
		return org.joda.time.Months.months(p.getMonths());
	}

	private Months(int months) {
		super(months);
	}

	private java.lang.Object readResolve() {
		return org.joda.time.Months.months(getValue());
	}

	public org.joda.time.DurationFieldType getFieldType() {
		return org.joda.time.DurationFieldType.months();
	}

	public org.joda.time.PeriodType getPeriodType() {
		return org.joda.time.PeriodType.months();
	}

	public int getMonths() {
		return getValue();
	}

	public org.joda.time.Months plus(int months) {
		if (months == 0) {
			return org.joda.time.Months.this;
		}
		return org.joda.time.Months.months(org.joda.time.field.FieldUtils.safeAdd(getValue(), months));
	}

	public org.joda.time.Months plus(org.joda.time.Months months) {
		if (months == null) {
			return org.joda.time.Months.this;
		}
		return plus(months.getValue());
	}

	public org.joda.time.Months minus(int months) {
		return plus(org.joda.time.field.FieldUtils.safeNegate(months));
	}

	public org.joda.time.Months minus(org.joda.time.Months months) {
		if (months == null) {
			return org.joda.time.Months.this;
		}
		return minus(months.getValue());
	}

	public org.joda.time.Months multipliedBy(int scalar) {
		return org.joda.time.Months.months(org.joda.time.field.FieldUtils.safeMultiply(getValue(), scalar));
	}

	public org.joda.time.Months dividedBy(int divisor) {
		if (divisor == 1) {
			return org.joda.time.Months.this;
		}
		return org.joda.time.Months.months(((getValue()) / divisor));
	}

	public org.joda.time.Months negated() {
		return org.joda.time.Months.months(org.joda.time.field.FieldUtils.safeNegate(getValue()));
	}

	public boolean isGreaterThan(org.joda.time.Months other) {
		if (other == null) {
			return (getValue()) > 0;
		}
		return (getValue()) > (other.getValue());
	}

	public boolean isLessThan(org.joda.time.Months other) {
		if (other == null) {
			return (getValue()) < 0;
		}
		return (getValue()) < (other.getValue());
	}

	public java.lang.String toString() {
		return ("P" + (java.lang.String.valueOf(getValue()))) + "M";
	}
}

