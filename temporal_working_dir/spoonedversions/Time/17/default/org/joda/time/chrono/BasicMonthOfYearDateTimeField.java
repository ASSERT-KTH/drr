

package org.joda.time.chrono;


class BasicMonthOfYearDateTimeField extends org.joda.time.field.ImpreciseDateTimeField {
	private static final long serialVersionUID = -8258715387168736L;

	private static final int MIN = org.joda.time.DateTimeConstants.JANUARY;

	private final org.joda.time.chrono.BasicChronology iChronology;

	private final int iMax;

	private final int iLeapMonth;

	BasicMonthOfYearDateTimeField(org.joda.time.chrono.BasicChronology chronology, int leapMonth) {
		super(org.joda.time.DateTimeFieldType.monthOfYear(), chronology.getAverageMillisPerMonth());
		iChronology = chronology;
		iMax = iChronology.getMaxMonth();
		iLeapMonth = leapMonth;
	}

	public boolean isLenient() {
		return false;
	}

	public int get(long instant) {
		return iChronology.getMonthOfYear(instant);
	}

	public long add(long instant, int months) {
		if (months == 0) {
			return instant;
		}
		long timePart = iChronology.getMillisOfDay(instant);
		int thisYear = iChronology.getYear(instant);
		int thisMonth = iChronology.getMonthOfYear(instant, thisYear);
		int yearToUse;
		int monthToUse = (thisMonth - 1) + months;
		if (monthToUse >= 0) {
			yearToUse = thisYear + (monthToUse / (iMax));
			monthToUse = (monthToUse % (iMax)) + 1;
		}else {
			yearToUse = (thisYear + (monthToUse / (iMax))) - 1;
			monthToUse = java.lang.Math.abs(monthToUse);
			int remMonthToUse = monthToUse % (iMax);
			if (remMonthToUse == 0) {
				remMonthToUse = iMax;
			}
			monthToUse = ((iMax) - remMonthToUse) + 1;
			if (monthToUse == 1) {
				yearToUse += 1;
			}
		}
		int dayToUse = iChronology.getDayOfMonth(instant, thisYear, thisMonth);
		int maxDay = iChronology.getDaysInYearMonth(yearToUse, monthToUse);
		if (dayToUse > maxDay) {
			dayToUse = maxDay;
		}
		long datePart = iChronology.getYearMonthDayMillis(yearToUse, monthToUse, dayToUse);
		return datePart + timePart;
	}

	public long add(long instant, long months) {
		int i_months = ((int) (months));
		if (i_months == months) {
			return add(instant, i_months);
		}
		long timePart = iChronology.getMillisOfDay(instant);
		int thisYear = iChronology.getYear(instant);
		int thisMonth = iChronology.getMonthOfYear(instant, thisYear);
		long yearToUse;
		long monthToUse = (thisMonth - 1) + months;
		if (monthToUse >= 0) {
			yearToUse = thisYear + (monthToUse / (iMax));
			monthToUse = (monthToUse % (iMax)) + 1;
		}else {
			yearToUse = (thisYear + (monthToUse / (iMax))) - 1;
			monthToUse = java.lang.Math.abs(monthToUse);
			int remMonthToUse = ((int) (monthToUse % (iMax)));
			if (remMonthToUse == 0) {
				remMonthToUse = iMax;
			}
			monthToUse = ((iMax) - remMonthToUse) + 1;
			if (monthToUse == 1) {
				yearToUse += 1;
			}
		}
		if ((yearToUse < (iChronology.getMinYear())) || (yearToUse > (iChronology.getMaxYear()))) {
			throw new java.lang.IllegalArgumentException(("Magnitude of add amount is too large: " + months));
		}
		int i_yearToUse = ((int) (yearToUse));
		int i_monthToUse = ((int) (monthToUse));
		int dayToUse = iChronology.getDayOfMonth(instant, thisYear, thisMonth);
		int maxDay = iChronology.getDaysInYearMonth(i_yearToUse, i_monthToUse);
		if (dayToUse > maxDay) {
			dayToUse = maxDay;
		}
		long datePart = iChronology.getYearMonthDayMillis(i_yearToUse, i_monthToUse, dayToUse);
		return datePart + timePart;
	}

	public int[] add(org.joda.time.ReadablePartial partial, int fieldIndex, int[] values, int valueToAdd) {
		if (valueToAdd == 0) {
			return values;
		}
		if (org.joda.time.DateTimeUtils.isContiguous(partial)) {
			long instant = 0L;
			for (int i = 0, isize = partial.size(); i < isize; i++) {
				instant = partial.getFieldType(i).getField(iChronology).set(instant, values[i]);
			}
			instant = add(instant, valueToAdd);
			return iChronology.get(partial, instant);
		}else {
			return super.add(partial, fieldIndex, values, valueToAdd);
		}
	}

	public long addWrapField(long instant, int months) {
		return set(instant, org.joda.time.field.FieldUtils.getWrappedValue(get(instant), months, org.joda.time.chrono.BasicMonthOfYearDateTimeField.MIN, iMax));
	}

	public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {
		if (minuendInstant < subtrahendInstant) {
			return -(getDifference(subtrahendInstant, minuendInstant));
		}
		int minuendYear = iChronology.getYear(minuendInstant);
		int minuendMonth = iChronology.getMonthOfYear(minuendInstant, minuendYear);
		int subtrahendYear = iChronology.getYear(subtrahendInstant);
		int subtrahendMonth = iChronology.getMonthOfYear(subtrahendInstant, subtrahendYear);
		long difference = (((minuendYear - subtrahendYear) * ((long) (iMax))) + minuendMonth) - subtrahendMonth;
		int minuendDom = iChronology.getDayOfMonth(minuendInstant, minuendYear, minuendMonth);
		if (minuendDom == (iChronology.getDaysInYearMonth(minuendYear, minuendMonth))) {
			int subtrahendDom = iChronology.getDayOfMonth(subtrahendInstant, subtrahendYear, subtrahendMonth);
			if (subtrahendDom > minuendDom) {
				subtrahendInstant = iChronology.dayOfMonth().set(subtrahendInstant, minuendDom);
			}
		}
		long minuendRem = minuendInstant - (iChronology.getYearMonthMillis(minuendYear, minuendMonth));
		long subtrahendRem = subtrahendInstant - (iChronology.getYearMonthMillis(subtrahendYear, subtrahendMonth));
		if (minuendRem < subtrahendRem) {
			difference--;
		}
		return difference;
	}

	public long set(long instant, int month) {
		org.joda.time.field.FieldUtils.verifyValueBounds(org.joda.time.chrono.BasicMonthOfYearDateTimeField.this, month, org.joda.time.chrono.BasicMonthOfYearDateTimeField.MIN, iMax);
		int thisYear = iChronology.getYear(instant);
		int thisDom = iChronology.getDayOfMonth(instant, thisYear);
		int maxDom = iChronology.getDaysInYearMonth(thisYear, month);
		if (thisDom > maxDom) {
			thisDom = maxDom;
		}
		return (iChronology.getYearMonthDayMillis(thisYear, month, thisDom)) + (iChronology.getMillisOfDay(instant));
	}

	public org.joda.time.DurationField getRangeDurationField() {
		return iChronology.years();
	}

	public boolean isLeap(long instant) {
		int thisYear = iChronology.getYear(instant);
		if (iChronology.isLeapYear(thisYear)) {
			return (iChronology.getMonthOfYear(instant, thisYear)) == (iLeapMonth);
		}
		return false;
	}

	public int getLeapAmount(long instant) {
		return isLeap(instant) ? 1 : 0;
	}

	public org.joda.time.DurationField getLeapDurationField() {
		return iChronology.days();
	}

	public int getMinimumValue() {
		return org.joda.time.chrono.BasicMonthOfYearDateTimeField.MIN;
	}

	public int getMaximumValue() {
		return iMax;
	}

	public long roundFloor(long instant) {
		int year = iChronology.getYear(instant);
		int month = iChronology.getMonthOfYear(instant, year);
		return iChronology.getYearMonthMillis(year, month);
	}

	public long remainder(long instant) {
		return instant - (roundFloor(instant));
	}

	private java.lang.Object readResolve() {
		return iChronology.monthOfYear();
	}
}

