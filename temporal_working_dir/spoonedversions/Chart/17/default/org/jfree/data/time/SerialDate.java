

package org.jfree.data.time;


public abstract class SerialDate implements java.io.Serializable , java.lang.Comparable , org.jfree.data.time.MonthConstants {
	private static final long serialVersionUID = -293716040467423637L;

	public static final java.text.DateFormatSymbols DATE_FORMAT_SYMBOLS = new java.text.SimpleDateFormat().getDateFormatSymbols();

	public static final int SERIAL_LOWER_BOUND = 2;

	public static final int SERIAL_UPPER_BOUND = 2958465;

	public static final int MINIMUM_YEAR_SUPPORTED = 1900;

	public static final int MAXIMUM_YEAR_SUPPORTED = 9999;

	public static final int MONDAY = java.util.Calendar.MONDAY;

	public static final int TUESDAY = java.util.Calendar.TUESDAY;

	public static final int WEDNESDAY = java.util.Calendar.WEDNESDAY;

	public static final int THURSDAY = java.util.Calendar.THURSDAY;

	public static final int FRIDAY = java.util.Calendar.FRIDAY;

	public static final int SATURDAY = java.util.Calendar.SATURDAY;

	public static final int SUNDAY = java.util.Calendar.SUNDAY;

	static final int[] LAST_DAY_OF_MONTH = new int[]{ 0 , 31 , 28 , 31 , 30 , 31 , 30 , 31 , 31 , 30 , 31 , 30 , 31 };

	static final int[] AGGREGATE_DAYS_TO_END_OF_MONTH = new int[]{ 0 , 31 , 59 , 90 , 120 , 151 , 181 , 212 , 243 , 273 , 304 , 334 , 365 };

	static final int[] AGGREGATE_DAYS_TO_END_OF_PRECEDING_MONTH = new int[]{ 0 , 0 , 31 , 59 , 90 , 120 , 151 , 181 , 212 , 243 , 273 , 304 , 334 , 365 };

	static final int[] LEAP_YEAR_AGGREGATE_DAYS_TO_END_OF_MONTH = new int[]{ 0 , 31 , 60 , 91 , 121 , 152 , 182 , 213 , 244 , 274 , 305 , 335 , 366 };

	static final int[] LEAP_YEAR_AGGREGATE_DAYS_TO_END_OF_PRECEDING_MONTH = new int[]{ 0 , 0 , 31 , 60 , 91 , 121 , 152 , 182 , 213 , 244 , 274 , 305 , 335 , 366 };

	public static final int FIRST_WEEK_IN_MONTH = 1;

	public static final int SECOND_WEEK_IN_MONTH = 2;

	public static final int THIRD_WEEK_IN_MONTH = 3;

	public static final int FOURTH_WEEK_IN_MONTH = 4;

	public static final int LAST_WEEK_IN_MONTH = 0;

	public static final int INCLUDE_NONE = 0;

	public static final int INCLUDE_FIRST = 1;

	public static final int INCLUDE_SECOND = 2;

	public static final int INCLUDE_BOTH = 3;

	public static final int PRECEDING = -1;

	public static final int NEAREST = 0;

	public static final int FOLLOWING = 1;

	private java.lang.String description;

	protected SerialDate() {
	}

	public static boolean isValidWeekdayCode(final int code) {
		switch (code) {
			case org.jfree.data.time.SerialDate.SUNDAY :
			case org.jfree.data.time.SerialDate.MONDAY :
			case org.jfree.data.time.SerialDate.TUESDAY :
			case org.jfree.data.time.SerialDate.WEDNESDAY :
			case org.jfree.data.time.SerialDate.THURSDAY :
			case org.jfree.data.time.SerialDate.FRIDAY :
			case org.jfree.data.time.SerialDate.SATURDAY :
				return true;
			default :
				return false;
		}
	}

	public static int stringToWeekdayCode(java.lang.String s) {
		final java.lang.String[] shortWeekdayNames = org.jfree.data.time.SerialDate.DATE_FORMAT_SYMBOLS.getShortWeekdays();
		final java.lang.String[] weekDayNames = org.jfree.data.time.SerialDate.DATE_FORMAT_SYMBOLS.getWeekdays();
		int result = -1;
		s = s.trim();
		for (int i = 0; i < (weekDayNames.length); i++) {
			if (s.equals(shortWeekdayNames[i])) {
				result = i;
				break;
			}
			if (s.equals(weekDayNames[i])) {
				result = i;
				break;
			}
		}
		return result;
	}

	public static java.lang.String weekdayCodeToString(final int weekday) {
		final java.lang.String[] weekdays = org.jfree.data.time.SerialDate.DATE_FORMAT_SYMBOLS.getWeekdays();
		return weekdays[weekday];
	}

	public static java.lang.String[] getMonths() {
		return org.jfree.data.time.SerialDate.getMonths(false);
	}

	public static java.lang.String[] getMonths(final boolean shortened) {
		if (shortened) {
			return org.jfree.data.time.SerialDate.DATE_FORMAT_SYMBOLS.getShortMonths();
		}else {
			return org.jfree.data.time.SerialDate.DATE_FORMAT_SYMBOLS.getMonths();
		}
	}

	public static boolean isValidMonthCode(final int code) {
		switch (code) {
			case org.jfree.data.time.MonthConstants.JANUARY :
			case org.jfree.data.time.MonthConstants.FEBRUARY :
			case org.jfree.data.time.MonthConstants.MARCH :
			case org.jfree.data.time.MonthConstants.APRIL :
			case org.jfree.data.time.MonthConstants.MAY :
			case org.jfree.data.time.MonthConstants.JUNE :
			case org.jfree.data.time.MonthConstants.JULY :
			case org.jfree.data.time.MonthConstants.AUGUST :
			case org.jfree.data.time.MonthConstants.SEPTEMBER :
			case org.jfree.data.time.MonthConstants.OCTOBER :
			case org.jfree.data.time.MonthConstants.NOVEMBER :
			case org.jfree.data.time.MonthConstants.DECEMBER :
				return true;
			default :
				return false;
		}
	}

	public static int monthCodeToQuarter(final int code) {
		switch (code) {
			case org.jfree.data.time.MonthConstants.JANUARY :
			case org.jfree.data.time.MonthConstants.FEBRUARY :
			case org.jfree.data.time.MonthConstants.MARCH :
				return 1;
			case org.jfree.data.time.MonthConstants.APRIL :
			case org.jfree.data.time.MonthConstants.MAY :
			case org.jfree.data.time.MonthConstants.JUNE :
				return 2;
			case org.jfree.data.time.MonthConstants.JULY :
			case org.jfree.data.time.MonthConstants.AUGUST :
			case org.jfree.data.time.MonthConstants.SEPTEMBER :
				return 3;
			case org.jfree.data.time.MonthConstants.OCTOBER :
			case org.jfree.data.time.MonthConstants.NOVEMBER :
			case org.jfree.data.time.MonthConstants.DECEMBER :
				return 4;
			default :
				throw new java.lang.IllegalArgumentException("SerialDate.monthCodeToQuarter: invalid month code.");
		}
	}

	public static java.lang.String monthCodeToString(final int month) {
		return org.jfree.data.time.SerialDate.monthCodeToString(month, false);
	}

	public static java.lang.String monthCodeToString(final int month, final boolean shortened) {
		if (!(org.jfree.data.time.SerialDate.isValidMonthCode(month))) {
			throw new java.lang.IllegalArgumentException("SerialDate.monthCodeToString: month outside valid range.");
		}
		final java.lang.String[] months;
		if (shortened) {
			months = org.jfree.data.time.SerialDate.DATE_FORMAT_SYMBOLS.getShortMonths();
		}else {
			months = org.jfree.data.time.SerialDate.DATE_FORMAT_SYMBOLS.getMonths();
		}
		return months[(month - 1)];
	}

	public static int stringToMonthCode(java.lang.String s) {
		final java.lang.String[] shortMonthNames = org.jfree.data.time.SerialDate.DATE_FORMAT_SYMBOLS.getShortMonths();
		final java.lang.String[] monthNames = org.jfree.data.time.SerialDate.DATE_FORMAT_SYMBOLS.getMonths();
		int result = -1;
		s = s.trim();
		try {
			result = java.lang.Integer.parseInt(s);
		} catch (java.lang.NumberFormatException e) {
		}
		if ((result < 1) || (result > 12)) {
			for (int i = 0; i < (monthNames.length); i++) {
				if (s.equals(shortMonthNames[i])) {
					result = i + 1;
					break;
				}
				if (s.equals(monthNames[i])) {
					result = i + 1;
					break;
				}
			}
		}
		return result;
	}

	public static boolean isValidWeekInMonthCode(final int code) {
		switch (code) {
			case org.jfree.data.time.SerialDate.FIRST_WEEK_IN_MONTH :
			case org.jfree.data.time.SerialDate.SECOND_WEEK_IN_MONTH :
			case org.jfree.data.time.SerialDate.THIRD_WEEK_IN_MONTH :
			case org.jfree.data.time.SerialDate.FOURTH_WEEK_IN_MONTH :
			case org.jfree.data.time.SerialDate.LAST_WEEK_IN_MONTH :
				return true;
			default :
				return false;
		}
	}

	public static boolean isLeapYear(final int yyyy) {
		if ((yyyy % 4) != 0) {
			return false;
		}else
			if ((yyyy % 400) == 0) {
				return true;
			}else
				if ((yyyy % 100) == 0) {
					return false;
				}else {
					return true;
				}
			
		
	}

	public static int leapYearCount(final int yyyy) {
		final int leap4 = (yyyy - 1896) / 4;
		final int leap100 = (yyyy - 1800) / 100;
		final int leap400 = (yyyy - 1600) / 400;
		return (leap4 - leap100) + leap400;
	}

	public static int lastDayOfMonth(final int month, final int yyyy) {
		final int result = org.jfree.data.time.SerialDate.LAST_DAY_OF_MONTH[month];
		if (month != (org.jfree.data.time.MonthConstants.FEBRUARY)) {
			return result;
		}else
			if (org.jfree.data.time.SerialDate.isLeapYear(yyyy)) {
				return result + 1;
			}else {
				return result;
			}
		
	}

	public static org.jfree.data.time.SerialDate addDays(final int days, final org.jfree.data.time.SerialDate base) {
		final int serialDayNumber = (base.toSerial()) + days;
		return org.jfree.data.time.SerialDate.createInstance(serialDayNumber);
	}

	public static org.jfree.data.time.SerialDate addMonths(final int months, final org.jfree.data.time.SerialDate base) {
		final int yy = ((((12 * (base.getYYYY())) + (base.getMonth())) + months) - 1) / 12;
		final int mm = (((((12 * (base.getYYYY())) + (base.getMonth())) + months) - 1) % 12) + 1;
		final int dd = java.lang.Math.min(base.getDayOfMonth(), org.jfree.data.time.SerialDate.lastDayOfMonth(mm, yy));
		return org.jfree.data.time.SerialDate.createInstance(dd, mm, yy);
	}

	public static org.jfree.data.time.SerialDate addYears(final int years, final org.jfree.data.time.SerialDate base) {
		final int baseY = base.getYYYY();
		final int baseM = base.getMonth();
		final int baseD = base.getDayOfMonth();
		final int targetY = baseY + years;
		final int targetD = java.lang.Math.min(baseD, org.jfree.data.time.SerialDate.lastDayOfMonth(baseM, targetY));
		return org.jfree.data.time.SerialDate.createInstance(targetD, baseM, targetY);
	}

	public static org.jfree.data.time.SerialDate getPreviousDayOfWeek(final int targetWeekday, final org.jfree.data.time.SerialDate base) {
		if (!(org.jfree.data.time.SerialDate.isValidWeekdayCode(targetWeekday))) {
			throw new java.lang.IllegalArgumentException("Invalid day-of-the-week code.");
		}
		final int adjust;
		final int baseDOW = base.getDayOfWeek();
		if (baseDOW > targetWeekday) {
			adjust = java.lang.Math.min(0, (targetWeekday - baseDOW));
		}else {
			adjust = (-7) + (java.lang.Math.max(0, (targetWeekday - baseDOW)));
		}
		return org.jfree.data.time.SerialDate.addDays(adjust, base);
	}

	public static org.jfree.data.time.SerialDate getFollowingDayOfWeek(final int targetWeekday, final org.jfree.data.time.SerialDate base) {
		if (!(org.jfree.data.time.SerialDate.isValidWeekdayCode(targetWeekday))) {
			throw new java.lang.IllegalArgumentException("Invalid day-of-the-week code.");
		}
		final int adjust;
		final int baseDOW = base.getDayOfWeek();
		if (baseDOW > targetWeekday) {
			adjust = 7 + (java.lang.Math.min(0, (targetWeekday - baseDOW)));
		}else {
			adjust = java.lang.Math.max(0, (targetWeekday - baseDOW));
		}
		return org.jfree.data.time.SerialDate.addDays(adjust, base);
	}

	public static org.jfree.data.time.SerialDate getNearestDayOfWeek(final int targetDOW, final org.jfree.data.time.SerialDate base) {
		if (!(org.jfree.data.time.SerialDate.isValidWeekdayCode(targetDOW))) {
			throw new java.lang.IllegalArgumentException("Invalid day-of-the-week code.");
		}
		final int baseDOW = base.getDayOfWeek();
		int adjust = -(java.lang.Math.abs((targetDOW - baseDOW)));
		if (adjust >= 4) {
			adjust = 7 - adjust;
		}
		if (adjust <= (-4)) {
			adjust = 7 + adjust;
		}
		return org.jfree.data.time.SerialDate.addDays(adjust, base);
	}

	public org.jfree.data.time.SerialDate getEndOfCurrentMonth(final org.jfree.data.time.SerialDate base) {
		final int last = org.jfree.data.time.SerialDate.lastDayOfMonth(base.getMonth(), base.getYYYY());
		return org.jfree.data.time.SerialDate.createInstance(last, base.getMonth(), base.getYYYY());
	}

	public static java.lang.String weekInMonthToString(final int count) {
		switch (count) {
			case org.jfree.data.time.SerialDate.FIRST_WEEK_IN_MONTH :
				return "First";
			case org.jfree.data.time.SerialDate.SECOND_WEEK_IN_MONTH :
				return "Second";
			case org.jfree.data.time.SerialDate.THIRD_WEEK_IN_MONTH :
				return "Third";
			case org.jfree.data.time.SerialDate.FOURTH_WEEK_IN_MONTH :
				return "Fourth";
			case org.jfree.data.time.SerialDate.LAST_WEEK_IN_MONTH :
				return "Last";
			default :
				return "SerialDate.weekInMonthToString(): invalid code.";
		}
	}

	public static java.lang.String relativeToString(final int relative) {
		switch (relative) {
			case org.jfree.data.time.SerialDate.PRECEDING :
				return "Preceding";
			case org.jfree.data.time.SerialDate.NEAREST :
				return "Nearest";
			case org.jfree.data.time.SerialDate.FOLLOWING :
				return "Following";
			default :
				return "ERROR : Relative To String";
		}
	}

	public static org.jfree.data.time.SerialDate createInstance(final int day, final int month, final int yyyy) {
		return new org.jfree.data.time.SpreadsheetDate(day, month, yyyy);
	}

	public static org.jfree.data.time.SerialDate createInstance(final int serial) {
		return new org.jfree.data.time.SpreadsheetDate(serial);
	}

	public static org.jfree.data.time.SerialDate createInstance(final java.util.Date date) {
		final java.util.GregorianCalendar calendar = new java.util.GregorianCalendar();
		calendar.setTime(date);
		return new org.jfree.data.time.SpreadsheetDate(calendar.get(java.util.Calendar.DATE), ((calendar.get(java.util.Calendar.MONTH)) + 1), calendar.get(java.util.Calendar.YEAR));
	}

	public abstract int toSerial();

	public abstract java.util.Date toDate();

	public java.lang.String getDescription() {
		return org.jfree.data.time.SerialDate.this.description;
	}

	public void setDescription(final java.lang.String description) {
		org.jfree.data.time.SerialDate.this.description = description;
	}

	public java.lang.String toString() {
		return ((((getDayOfMonth()) + "-") + (org.jfree.data.time.SerialDate.monthCodeToString(getMonth()))) + "-") + (getYYYY());
	}

	public abstract int getYYYY();

	public abstract int getMonth();

	public abstract int getDayOfMonth();

	public abstract int getDayOfWeek();

	public abstract int compare(org.jfree.data.time.SerialDate other);

	public abstract boolean isOn(org.jfree.data.time.SerialDate other);

	public abstract boolean isBefore(org.jfree.data.time.SerialDate other);

	public abstract boolean isOnOrBefore(org.jfree.data.time.SerialDate other);

	public abstract boolean isAfter(org.jfree.data.time.SerialDate other);

	public abstract boolean isOnOrAfter(org.jfree.data.time.SerialDate other);

	public abstract boolean isInRange(org.jfree.data.time.SerialDate d1, org.jfree.data.time.SerialDate d2);

	public abstract boolean isInRange(org.jfree.data.time.SerialDate d1, org.jfree.data.time.SerialDate d2, int include);

	public org.jfree.data.time.SerialDate getPreviousDayOfWeek(final int targetDOW) {
		return org.jfree.data.time.SerialDate.getPreviousDayOfWeek(targetDOW, org.jfree.data.time.SerialDate.this);
	}

	public org.jfree.data.time.SerialDate getFollowingDayOfWeek(final int targetDOW) {
		return org.jfree.data.time.SerialDate.getFollowingDayOfWeek(targetDOW, org.jfree.data.time.SerialDate.this);
	}

	public org.jfree.data.time.SerialDate getNearestDayOfWeek(final int targetDOW) {
		return org.jfree.data.time.SerialDate.getNearestDayOfWeek(targetDOW, org.jfree.data.time.SerialDate.this);
	}
}

