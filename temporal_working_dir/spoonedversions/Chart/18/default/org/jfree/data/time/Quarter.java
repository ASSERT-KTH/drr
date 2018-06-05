

package org.jfree.data.time;


public class Quarter extends org.jfree.data.time.RegularTimePeriod implements java.io.Serializable {
	private static final long serialVersionUID = 3810061714380888671L;

	public static final int FIRST_QUARTER = 1;

	public static final int LAST_QUARTER = 4;

	public static final int[] FIRST_MONTH_IN_QUARTER = new int[]{ 0 , org.jfree.data.time.MonthConstants.JANUARY , org.jfree.data.time.MonthConstants.APRIL , org.jfree.data.time.MonthConstants.JULY , org.jfree.data.time.MonthConstants.OCTOBER };

	public static final int[] LAST_MONTH_IN_QUARTER = new int[]{ 0 , org.jfree.data.time.MonthConstants.MARCH , org.jfree.data.time.MonthConstants.JUNE , org.jfree.data.time.MonthConstants.SEPTEMBER , org.jfree.data.time.MonthConstants.DECEMBER };

	private short year;

	private byte quarter;

	private long firstMillisecond;

	private long lastMillisecond;

	public Quarter() {
		this(new java.util.Date());
	}

	public Quarter(int quarter, int year) {
		if ((quarter < (org.jfree.data.time.Quarter.FIRST_QUARTER)) || (quarter > (org.jfree.data.time.Quarter.LAST_QUARTER))) {
			throw new java.lang.IllegalArgumentException("Quarter outside valid range.");
		}
		org.jfree.data.time.Quarter.this.year = ((short) (year));
		org.jfree.data.time.Quarter.this.quarter = ((byte) (quarter));
		peg(java.util.Calendar.getInstance());
	}

	public Quarter(int quarter, org.jfree.data.time.Year year) {
		if ((quarter < (org.jfree.data.time.Quarter.FIRST_QUARTER)) || (quarter > (org.jfree.data.time.Quarter.LAST_QUARTER))) {
			throw new java.lang.IllegalArgumentException("Quarter outside valid range.");
		}
		org.jfree.data.time.Quarter.this.year = ((short) (year.getYear()));
		org.jfree.data.time.Quarter.this.quarter = ((byte) (quarter));
		peg(java.util.Calendar.getInstance());
	}

	public Quarter(java.util.Date time) {
		this(time, org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE);
	}

	public Quarter(java.util.Date time, java.util.TimeZone zone) {
		java.util.Calendar calendar = java.util.Calendar.getInstance(zone);
		calendar.setTime(time);
		int month = (calendar.get(java.util.Calendar.MONTH)) + 1;
		org.jfree.data.time.Quarter.this.quarter = ((byte) (org.jfree.data.time.SerialDate.monthCodeToQuarter(month)));
		org.jfree.data.time.Quarter.this.year = ((short) (calendar.get(java.util.Calendar.YEAR)));
		peg(calendar);
	}

	public int getQuarter() {
		return org.jfree.data.time.Quarter.this.quarter;
	}

	public org.jfree.data.time.Year getYear() {
		return new org.jfree.data.time.Year(org.jfree.data.time.Quarter.this.year);
	}

	public int getYearValue() {
		return org.jfree.data.time.Quarter.this.year;
	}

	public long getFirstMillisecond() {
		return org.jfree.data.time.Quarter.this.firstMillisecond;
	}

	public long getLastMillisecond() {
		return org.jfree.data.time.Quarter.this.lastMillisecond;
	}

	public void peg(java.util.Calendar calendar) {
		org.jfree.data.time.Quarter.this.firstMillisecond = getFirstMillisecond(calendar);
		org.jfree.data.time.Quarter.this.lastMillisecond = getLastMillisecond(calendar);
	}

	public org.jfree.data.time.RegularTimePeriod previous() {
		org.jfree.data.time.Quarter result;
		if ((org.jfree.data.time.Quarter.this.quarter) > (org.jfree.data.time.Quarter.FIRST_QUARTER)) {
			result = new org.jfree.data.time.Quarter(((org.jfree.data.time.Quarter.this.quarter) - 1), org.jfree.data.time.Quarter.this.year);
		}else {
			if ((org.jfree.data.time.Quarter.this.year) > 1900) {
				result = new org.jfree.data.time.Quarter(org.jfree.data.time.Quarter.LAST_QUARTER, ((org.jfree.data.time.Quarter.this.year) - 1));
			}else {
				result = null;
			}
		}
		return result;
	}

	public org.jfree.data.time.RegularTimePeriod next() {
		org.jfree.data.time.Quarter result;
		if ((org.jfree.data.time.Quarter.this.quarter) < (org.jfree.data.time.Quarter.LAST_QUARTER)) {
			result = new org.jfree.data.time.Quarter(((org.jfree.data.time.Quarter.this.quarter) + 1), org.jfree.data.time.Quarter.this.year);
		}else {
			if ((org.jfree.data.time.Quarter.this.year) < 9999) {
				result = new org.jfree.data.time.Quarter(org.jfree.data.time.Quarter.FIRST_QUARTER, ((org.jfree.data.time.Quarter.this.year) + 1));
			}else {
				result = null;
			}
		}
		return result;
	}

	public long getSerialIndex() {
		return ((org.jfree.data.time.Quarter.this.year) * 4L) + (org.jfree.data.time.Quarter.this.quarter);
	}

	public boolean equals(java.lang.Object obj) {
		if (obj != null) {
			if (obj instanceof org.jfree.data.time.Quarter) {
				org.jfree.data.time.Quarter target = ((org.jfree.data.time.Quarter) (obj));
				return ((org.jfree.data.time.Quarter.this.quarter) == (target.getQuarter())) && ((org.jfree.data.time.Quarter.this.year) == (target.getYearValue()));
			}else {
				return false;
			}
		}else {
			return false;
		}
	}

	public int hashCode() {
		int result = 17;
		result = (37 * result) + (org.jfree.data.time.Quarter.this.quarter);
		result = (37 * result) + (org.jfree.data.time.Quarter.this.year);
		return result;
	}

	public int compareTo(java.lang.Object o1) {
		int result;
		if (o1 instanceof org.jfree.data.time.Quarter) {
			org.jfree.data.time.Quarter q = ((org.jfree.data.time.Quarter) (o1));
			result = (org.jfree.data.time.Quarter.this.year) - (q.getYearValue());
			if (result == 0) {
				result = (org.jfree.data.time.Quarter.this.quarter) - (q.getQuarter());
			}
		}else
			if (o1 instanceof org.jfree.data.time.RegularTimePeriod) {
				result = 0;
			}else {
				result = 1;
			}
		
		return result;
	}

	public java.lang.String toString() {
		return (("Q" + (org.jfree.data.time.Quarter.this.quarter)) + "/") + (org.jfree.data.time.Quarter.this.year);
	}

	public long getFirstMillisecond(java.util.Calendar calendar) {
		int month = org.jfree.data.time.Quarter.FIRST_MONTH_IN_QUARTER[org.jfree.data.time.Quarter.this.quarter];
		calendar.set(org.jfree.data.time.Quarter.this.year, (month - 1), 1, 0, 0, 0);
		calendar.set(java.util.Calendar.MILLISECOND, 0);
		return calendar.getTime().getTime();
	}

	public long getLastMillisecond(java.util.Calendar calendar) {
		int month = org.jfree.data.time.Quarter.LAST_MONTH_IN_QUARTER[org.jfree.data.time.Quarter.this.quarter];
		int eom = org.jfree.data.time.SerialDate.lastDayOfMonth(month, org.jfree.data.time.Quarter.this.year);
		calendar.set(org.jfree.data.time.Quarter.this.year, (month - 1), eom, 23, 59, 59);
		calendar.set(java.util.Calendar.MILLISECOND, 999);
		return calendar.getTime().getTime();
	}

	public static org.jfree.data.time.Quarter parseQuarter(java.lang.String s) {
		int i = s.indexOf("Q");
		if (i == (-1)) {
			throw new org.jfree.data.time.TimePeriodFormatException("Missing Q.");
		}
		if (i == ((s.length()) - 1)) {
			throw new org.jfree.data.time.TimePeriodFormatException("Q found at end of string.");
		}
		java.lang.String qstr = s.substring((i + 1), (i + 2));
		int quarter = java.lang.Integer.parseInt(qstr);
		java.lang.String remaining = (s.substring(0, i)) + (s.substring((i + 2), s.length()));
		remaining = remaining.replace('/', ' ');
		remaining = remaining.replace(',', ' ');
		remaining = remaining.replace('-', ' ');
		org.jfree.data.time.Year year = org.jfree.data.time.Year.parseYear(remaining.trim());
		org.jfree.data.time.Quarter result = new org.jfree.data.time.Quarter(quarter, year);
		return result;
	}
}

