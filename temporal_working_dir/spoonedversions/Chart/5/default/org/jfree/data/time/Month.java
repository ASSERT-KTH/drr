

package org.jfree.data.time;


public class Month extends org.jfree.data.time.RegularTimePeriod implements java.io.Serializable {
	private static final long serialVersionUID = -5090216912548722570L;

	private int month;

	private int year;

	private long firstMillisecond;

	private long lastMillisecond;

	public Month() {
		this(new java.util.Date());
	}

	public Month(int month, int year) {
		if ((month < 1) || (month > 12)) {
			throw new java.lang.IllegalArgumentException("Month outside valid range.");
		}
		org.jfree.data.time.Month.this.month = month;
		org.jfree.data.time.Month.this.year = year;
		peg(java.util.Calendar.getInstance());
	}

	public Month(int month, org.jfree.data.time.Year year) {
		if ((month < 1) || (month > 12)) {
			throw new java.lang.IllegalArgumentException("Month outside valid range.");
		}
		org.jfree.data.time.Month.this.month = month;
		org.jfree.data.time.Month.this.year = year.getYear();
		peg(java.util.Calendar.getInstance());
	}

	public Month(java.util.Date time) {
		this(time, java.util.TimeZone.getDefault());
	}

	public Month(java.util.Date time, java.util.TimeZone zone) {
		java.util.Calendar calendar = java.util.Calendar.getInstance(zone);
		calendar.setTime(time);
		org.jfree.data.time.Month.this.month = (calendar.get(java.util.Calendar.MONTH)) + 1;
		org.jfree.data.time.Month.this.year = calendar.get(java.util.Calendar.YEAR);
		peg(calendar);
	}

	public org.jfree.data.time.Year getYear() {
		return new org.jfree.data.time.Year(org.jfree.data.time.Month.this.year);
	}

	public int getYearValue() {
		return org.jfree.data.time.Month.this.year;
	}

	public int getMonth() {
		return org.jfree.data.time.Month.this.month;
	}

	public long getFirstMillisecond() {
		return org.jfree.data.time.Month.this.firstMillisecond;
	}

	public long getLastMillisecond() {
		return org.jfree.data.time.Month.this.lastMillisecond;
	}

	public void peg(java.util.Calendar calendar) {
		org.jfree.data.time.Month.this.firstMillisecond = getFirstMillisecond(calendar);
		org.jfree.data.time.Month.this.lastMillisecond = getLastMillisecond(calendar);
	}

	public org.jfree.data.time.RegularTimePeriod previous() {
		org.jfree.data.time.Month result;
		if ((org.jfree.data.time.Month.this.month) != (org.jfree.data.time.MonthConstants.JANUARY)) {
			result = new org.jfree.data.time.Month(((org.jfree.data.time.Month.this.month) - 1), org.jfree.data.time.Month.this.year);
		}else {
			if ((org.jfree.data.time.Month.this.year) > 1900) {
				result = new org.jfree.data.time.Month(org.jfree.data.time.MonthConstants.DECEMBER, ((org.jfree.data.time.Month.this.year) - 1));
			}else {
				result = null;
			}
		}
		return result;
	}

	public org.jfree.data.time.RegularTimePeriod next() {
		org.jfree.data.time.Month result;
		if ((org.jfree.data.time.Month.this.month) != (org.jfree.data.time.MonthConstants.DECEMBER)) {
			result = new org.jfree.data.time.Month(((org.jfree.data.time.Month.this.month) + 1), org.jfree.data.time.Month.this.year);
		}else {
			if ((org.jfree.data.time.Month.this.year) < 9999) {
				result = new org.jfree.data.time.Month(org.jfree.data.time.MonthConstants.JANUARY, ((org.jfree.data.time.Month.this.year) + 1));
			}else {
				result = null;
			}
		}
		return result;
	}

	public long getSerialIndex() {
		return ((org.jfree.data.time.Month.this.year) * 12L) + (org.jfree.data.time.Month.this.month);
	}

	public java.lang.String toString() {
		return ((org.jfree.data.time.SerialDate.monthCodeToString(org.jfree.data.time.Month.this.month)) + " ") + (org.jfree.data.time.Month.this.year);
	}

	public boolean equals(java.lang.Object obj) {
		if (obj != null) {
			if (obj instanceof org.jfree.data.time.Month) {
				org.jfree.data.time.Month target = ((org.jfree.data.time.Month) (obj));
				return ((org.jfree.data.time.Month.this.month) == (target.getMonth())) && ((org.jfree.data.time.Month.this.year) == (target.getYearValue()));
			}else {
				return false;
			}
		}else {
			return false;
		}
	}

	public int hashCode() {
		int result = 17;
		result = (37 * result) + (org.jfree.data.time.Month.this.month);
		result = (37 * result) + (org.jfree.data.time.Month.this.year);
		return result;
	}

	public int compareTo(java.lang.Object o1) {
		int result;
		if (o1 instanceof org.jfree.data.time.Month) {
			org.jfree.data.time.Month m = ((org.jfree.data.time.Month) (o1));
			result = (org.jfree.data.time.Month.this.year) - (m.getYearValue());
			if (result == 0) {
				result = (org.jfree.data.time.Month.this.month) - (m.getMonth());
			}
		}else
			if (o1 instanceof org.jfree.data.time.RegularTimePeriod) {
				result = 0;
			}else {
				result = 1;
			}
		
		return result;
	}

	public long getFirstMillisecond(java.util.Calendar calendar) {
		calendar.set(org.jfree.data.time.Month.this.year, ((org.jfree.data.time.Month.this.month) - 1), 1, 0, 0, 0);
		calendar.set(java.util.Calendar.MILLISECOND, 0);
		return calendar.getTime().getTime();
	}

	public long getLastMillisecond(java.util.Calendar calendar) {
		int eom = org.jfree.data.time.SerialDate.lastDayOfMonth(org.jfree.data.time.Month.this.month, org.jfree.data.time.Month.this.year);
		calendar.set(org.jfree.data.time.Month.this.year, ((org.jfree.data.time.Month.this.month) - 1), eom, 23, 59, 59);
		calendar.set(java.util.Calendar.MILLISECOND, 999);
		return calendar.getTime().getTime();
	}

	public static org.jfree.data.time.Month parseMonth(java.lang.String s) {
		org.jfree.data.time.Month result = null;
		if (s == null) {
			return result;
		}
		s = s.trim();
		int i = org.jfree.data.time.Month.findSeparator(s);
		java.lang.String s1;
		java.lang.String s2;
		boolean yearIsFirst;
		if (i == (-1)) {
			yearIsFirst = true;
			s1 = s.substring(0, 5);
			s2 = s.substring(5);
		}else {
			s1 = s.substring(0, i).trim();
			s2 = s.substring((i + 1), s.length()).trim();
			org.jfree.data.time.Year y1 = org.jfree.data.time.Month.evaluateAsYear(s1);
			if (y1 == null) {
				yearIsFirst = false;
			}else {
				org.jfree.data.time.Year y2 = org.jfree.data.time.Month.evaluateAsYear(s2);
				if (y2 == null) {
					yearIsFirst = true;
				}else {
					yearIsFirst = (s1.length()) > (s2.length());
				}
			}
		}
		org.jfree.data.time.Year year;
		int month;
		if (yearIsFirst) {
			year = org.jfree.data.time.Month.evaluateAsYear(s1);
			month = org.jfree.data.time.SerialDate.stringToMonthCode(s2);
		}else {
			year = org.jfree.data.time.Month.evaluateAsYear(s2);
			month = org.jfree.data.time.SerialDate.stringToMonthCode(s1);
		}
		if (month == (-1)) {
			throw new org.jfree.data.time.TimePeriodFormatException("Can't evaluate the month.");
		}
		if (year == null) {
			throw new org.jfree.data.time.TimePeriodFormatException("Can't evaluate the year.");
		}
		result = new org.jfree.data.time.Month(month, year);
		return result;
	}

	private static int findSeparator(java.lang.String s) {
		int result = s.indexOf('-');
		if (result == (-1)) {
			result = s.indexOf(',');
		}
		if (result == (-1)) {
			result = s.indexOf(' ');
		}
		if (result == (-1)) {
			result = s.indexOf('.');
		}
		return result;
	}

	private static org.jfree.data.time.Year evaluateAsYear(java.lang.String s) {
		org.jfree.data.time.Year result = null;
		try {
			result = org.jfree.data.time.Year.parseYear(s);
		} catch (org.jfree.data.time.TimePeriodFormatException e) {
		}
		return result;
	}
}

