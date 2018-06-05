

package org.joda.time.chrono;


abstract class BasicFixedMonthChronology extends org.joda.time.chrono.BasicChronology {
	private static final long serialVersionUID = 261387371998L;

	static final int MONTH_LENGTH = 30;

	static final long MILLIS_PER_YEAR = ((long) (365.25 * (org.joda.time.DateTimeConstants.MILLIS_PER_DAY)));

	static final long MILLIS_PER_MONTH = ((long) (org.joda.time.chrono.BasicFixedMonthChronology.MONTH_LENGTH)) * (org.joda.time.DateTimeConstants.MILLIS_PER_DAY);

	BasicFixedMonthChronology(org.joda.time.Chronology base, java.lang.Object param, int minDaysInFirstWeek) {
		super(base, param, minDaysInFirstWeek);
	}

	long setYear(long instant, int year) {
		int thisYear = getYear(instant);
		int dayOfYear = getDayOfYear(instant, thisYear);
		int millisOfDay = getMillisOfDay(instant);
		if (dayOfYear > 365) {
			if (!(isLeapYear(year))) {
				dayOfYear--;
			}
		}
		instant = getYearMonthDayMillis(year, 1, dayOfYear);
		instant += millisOfDay;
		return instant;
	}

	long getYearDifference(long minuendInstant, long subtrahendInstant) {
		int minuendYear = getYear(minuendInstant);
		int subtrahendYear = getYear(subtrahendInstant);
		long minuendRem = minuendInstant - (getYearMillis(minuendYear));
		long subtrahendRem = subtrahendInstant - (getYearMillis(subtrahendYear));
		int difference = minuendYear - subtrahendYear;
		if (minuendRem < subtrahendRem) {
			difference--;
		}
		return difference;
	}

	long getTotalMillisByYearMonth(int year, int month) {
		return (month - 1) * (org.joda.time.chrono.BasicFixedMonthChronology.MILLIS_PER_MONTH);
	}

	int getDayOfMonth(long millis) {
		return (((getDayOfYear(millis)) - 1) % (org.joda.time.chrono.BasicFixedMonthChronology.MONTH_LENGTH)) + 1;
	}

	boolean isLeapYear(int year) {
		return (year & 3) == 3;
	}

	int getDaysInYearMonth(int year, int month) {
		return month != 13 ? org.joda.time.chrono.BasicFixedMonthChronology.MONTH_LENGTH : isLeapYear(year) ? 6 : 5;
	}

	int getDaysInMonthMax() {
		return org.joda.time.chrono.BasicFixedMonthChronology.MONTH_LENGTH;
	}

	int getDaysInMonthMax(int month) {
		return month != 13 ? org.joda.time.chrono.BasicFixedMonthChronology.MONTH_LENGTH : 6;
	}

	int getMonthOfYear(long millis) {
		return (((getDayOfYear(millis)) - 1) / (org.joda.time.chrono.BasicFixedMonthChronology.MONTH_LENGTH)) + 1;
	}

	int getMonthOfYear(long millis, int year) {
		long monthZeroBased = (millis - (getYearMillis(year))) / (org.joda.time.chrono.BasicFixedMonthChronology.MILLIS_PER_MONTH);
		return ((int) (monthZeroBased)) + 1;
	}

	int getMaxMonth() {
		return 13;
	}

	long getAverageMillisPerYear() {
		return org.joda.time.chrono.BasicFixedMonthChronology.MILLIS_PER_YEAR;
	}

	long getAverageMillisPerYearDividedByTwo() {
		return (org.joda.time.chrono.BasicFixedMonthChronology.MILLIS_PER_YEAR) / 2;
	}

	long getAverageMillisPerMonth() {
		return org.joda.time.chrono.BasicFixedMonthChronology.MILLIS_PER_MONTH;
	}
}

