

package org.joda.time.chrono;


class BasicYearDateTimeField extends org.joda.time.field.ImpreciseDateTimeField {
	private static final long serialVersionUID = -98628754872287L;

	protected final org.joda.time.chrono.BasicChronology iChronology;

	BasicYearDateTimeField(org.joda.time.chrono.BasicChronology chronology) {
		super(org.joda.time.DateTimeFieldType.year(), chronology.getAverageMillisPerYear());
		iChronology = chronology;
	}

	public boolean isLenient() {
		return false;
	}

	public int get(long instant) {
		return iChronology.getYear(instant);
	}

	public long add(long instant, int years) {
		if (years == 0) {
			return instant;
		}
		int thisYear = get(instant);
		int newYear = org.joda.time.field.FieldUtils.safeAdd(thisYear, years);
		return set(instant, newYear);
	}

	public long add(long instant, long years) {
		return add(instant, org.joda.time.field.FieldUtils.safeToInt(years));
	}

	public long addWrapField(long instant, int years) {
		if (years == 0) {
			return instant;
		}
		int thisYear = iChronology.getYear(instant);
		int wrappedYear = org.joda.time.field.FieldUtils.getWrappedValue(thisYear, years, iChronology.getMinYear(), iChronology.getMaxYear());
		return set(instant, wrappedYear);
	}

	public long set(long instant, int year) {
		org.joda.time.field.FieldUtils.verifyValueBounds(org.joda.time.chrono.BasicYearDateTimeField.this, year, iChronology.getMinYear(), iChronology.getMaxYear());
		return iChronology.setYear(instant, year);
	}

	public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {
		if (minuendInstant < subtrahendInstant) {
			return -(iChronology.getYearDifference(subtrahendInstant, minuendInstant));
		}
		return iChronology.getYearDifference(minuendInstant, subtrahendInstant);
	}

	public org.joda.time.DurationField getRangeDurationField() {
		return null;
	}

	public boolean isLeap(long instant) {
		return iChronology.isLeapYear(get(instant));
	}

	public int getLeapAmount(long instant) {
		if (iChronology.isLeapYear(get(instant))) {
			return 1;
		}else {
			return 0;
		}
	}

	public org.joda.time.DurationField getLeapDurationField() {
		return iChronology.days();
	}

	public int getMinimumValue() {
		return iChronology.getMinYear();
	}

	public int getMaximumValue() {
		return iChronology.getMaxYear();
	}

	public long roundFloor(long instant) {
		return iChronology.getYearMillis(get(instant));
	}

	public long roundCeiling(long instant) {
		int year = get(instant);
		long yearStartMillis = iChronology.getYearMillis(year);
		if (instant != yearStartMillis) {
			instant = iChronology.getYearMillis((year + 1));
		}
		return instant;
	}

	public long remainder(long instant) {
		return instant - (roundFloor(instant));
	}

	private java.lang.Object readResolve() {
		return iChronology.year();
	}
}

