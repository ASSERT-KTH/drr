

package org.jfree.data.time;


public class SpreadsheetDate extends org.jfree.data.time.SerialDate {
	private static final long serialVersionUID = -2039586705374454461L;

	private final int serial;

	private final int day;

	private final int month;

	private final int year;

	public SpreadsheetDate(final int day, final int month, final int year) {
		if ((year >= 1900) && (year <= 9999)) {
			this.year = year;
		}else {
			throw new java.lang.IllegalArgumentException("The 'year' argument must be in range 1900 to 9999.");
		}
		if ((month >= (org.jfree.data.time.MonthConstants.JANUARY)) && (month <= (org.jfree.data.time.MonthConstants.DECEMBER))) {
			this.month = month;
		}else {
			throw new java.lang.IllegalArgumentException("The 'month' argument must be in the range 1 to 12.");
		}
		if ((day >= 1) && (day <= (org.jfree.data.time.SerialDate.lastDayOfMonth(month, year)))) {
			this.day = day;
		}else {
			throw new java.lang.IllegalArgumentException("Invalid 'day' argument.");
		}
		this.serial = calcSerial(day, month, year);
	}

	public SpreadsheetDate(final int serial) {
		if ((serial >= (org.jfree.data.time.SerialDate.SERIAL_LOWER_BOUND)) && (serial <= (org.jfree.data.time.SerialDate.SERIAL_UPPER_BOUND))) {
			this.serial = serial;
		}else {
			throw new java.lang.IllegalArgumentException("SpreadsheetDate: Serial must be in range 2 to 2958465.");
		}
		final int days = (org.jfree.data.time.SpreadsheetDate.this.serial) - (org.jfree.data.time.SerialDate.SERIAL_LOWER_BOUND);
		final int overestimatedYYYY = 1900 + (days / 365);
		final int leaps = org.jfree.data.time.SerialDate.leapYearCount(overestimatedYYYY);
		final int nonleapdays = days - leaps;
		int underestimatedYYYY = 1900 + (nonleapdays / 365);
		if (underestimatedYYYY == overestimatedYYYY) {
			this.year = underestimatedYYYY;
		}else {
			int ss1 = calcSerial(1, 1, underestimatedYYYY);
			while (ss1 <= (org.jfree.data.time.SpreadsheetDate.this.serial)) {
				underestimatedYYYY = underestimatedYYYY + 1;
				ss1 = calcSerial(1, 1, underestimatedYYYY);
			} 
			this.year = underestimatedYYYY - 1;
		}
		final int ss2 = calcSerial(1, 1, org.jfree.data.time.SpreadsheetDate.this.year);
		int[] daysToEndOfPrecedingMonth = org.jfree.data.time.SerialDate.AGGREGATE_DAYS_TO_END_OF_PRECEDING_MONTH;
		if (org.jfree.data.time.SerialDate.isLeapYear(org.jfree.data.time.SpreadsheetDate.this.year)) {
			daysToEndOfPrecedingMonth = org.jfree.data.time.SerialDate.LEAP_YEAR_AGGREGATE_DAYS_TO_END_OF_PRECEDING_MONTH;
		}
		int mm = 1;
		int sss = (ss2 + (daysToEndOfPrecedingMonth[mm])) - 1;
		while (sss < (org.jfree.data.time.SpreadsheetDate.this.serial)) {
			mm = mm + 1;
			sss = (ss2 + (daysToEndOfPrecedingMonth[mm])) - 1;
		} 
		this.month = mm - 1;
		this.day = (((org.jfree.data.time.SpreadsheetDate.this.serial) - ss2) - (daysToEndOfPrecedingMonth[org.jfree.data.time.SpreadsheetDate.this.month])) + 1;
	}

	public int toSerial() {
		return org.jfree.data.time.SpreadsheetDate.this.serial;
	}

	public java.util.Date toDate() {
		final java.util.Calendar calendar = java.util.Calendar.getInstance();
		calendar.set(getYYYY(), ((getMonth()) - 1), getDayOfMonth(), 0, 0, 0);
		return calendar.getTime();
	}

	public int getYYYY() {
		return org.jfree.data.time.SpreadsheetDate.this.year;
	}

	public int getMonth() {
		return org.jfree.data.time.SpreadsheetDate.this.month;
	}

	public int getDayOfMonth() {
		return org.jfree.data.time.SpreadsheetDate.this.day;
	}

	public int getDayOfWeek() {
		return (((org.jfree.data.time.SpreadsheetDate.this.serial) + 6) % 7) + 1;
	}

	public boolean equals(final java.lang.Object object) {
		if (object instanceof org.jfree.data.time.SerialDate) {
			final org.jfree.data.time.SerialDate s = ((org.jfree.data.time.SerialDate) (object));
			return (s.toSerial()) == (org.jfree.data.time.SpreadsheetDate.this.toSerial());
		}else {
			return false;
		}
	}

	public int hashCode() {
		return toSerial();
	}

	public int compare(final org.jfree.data.time.SerialDate other) {
		return (org.jfree.data.time.SpreadsheetDate.this.serial) - (other.toSerial());
	}

	public int compareTo(final java.lang.Object other) {
		return compare(((org.jfree.data.time.SerialDate) (other)));
	}

	public boolean isOn(final org.jfree.data.time.SerialDate other) {
		return (org.jfree.data.time.SpreadsheetDate.this.serial) == (other.toSerial());
	}

	public boolean isBefore(final org.jfree.data.time.SerialDate other) {
		return (org.jfree.data.time.SpreadsheetDate.this.serial) < (other.toSerial());
	}

	public boolean isOnOrBefore(final org.jfree.data.time.SerialDate other) {
		return (org.jfree.data.time.SpreadsheetDate.this.serial) <= (other.toSerial());
	}

	public boolean isAfter(final org.jfree.data.time.SerialDate other) {
		return (org.jfree.data.time.SpreadsheetDate.this.serial) > (other.toSerial());
	}

	public boolean isOnOrAfter(final org.jfree.data.time.SerialDate other) {
		return (org.jfree.data.time.SpreadsheetDate.this.serial) >= (other.toSerial());
	}

	public boolean isInRange(final org.jfree.data.time.SerialDate d1, final org.jfree.data.time.SerialDate d2) {
		return isInRange(d1, d2, org.jfree.data.time.SerialDate.INCLUDE_BOTH);
	}

	public boolean isInRange(final org.jfree.data.time.SerialDate d1, final org.jfree.data.time.SerialDate d2, final int include) {
		final int s1 = d1.toSerial();
		final int s2 = d2.toSerial();
		final int start = java.lang.Math.min(s1, s2);
		final int end = java.lang.Math.max(s1, s2);
		final int s = toSerial();
		if (include == (org.jfree.data.time.SerialDate.INCLUDE_BOTH)) {
			return (s >= start) && (s <= end);
		}else
			if (include == (org.jfree.data.time.SerialDate.INCLUDE_FIRST)) {
				return (s >= start) && (s < end);
			}else
				if (include == (org.jfree.data.time.SerialDate.INCLUDE_SECOND)) {
					return (s > start) && (s <= end);
				}else {
					return (s > start) && (s < end);
				}
			
		
	}

	private int calcSerial(final int d, final int m, final int y) {
		final int yy = ((y - 1900) * 365) + (org.jfree.data.time.SerialDate.leapYearCount((y - 1)));
		int mm = org.jfree.data.time.SerialDate.AGGREGATE_DAYS_TO_END_OF_PRECEDING_MONTH[m];
		if (m > (org.jfree.data.time.MonthConstants.FEBRUARY)) {
			if (org.jfree.data.time.SerialDate.isLeapYear(y)) {
				mm = mm + 1;
			}
		}
		final int dd = d;
		return ((yy + mm) + dd) + 1;
	}
}

