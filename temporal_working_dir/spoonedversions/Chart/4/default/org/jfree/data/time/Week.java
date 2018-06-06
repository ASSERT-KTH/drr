

package org.jfree.data.time;


public class Week extends org.jfree.data.time.RegularTimePeriod implements java.io.Serializable {
	private static final long serialVersionUID = 1856387786939865061L;

	public static final int FIRST_WEEK_IN_YEAR = 1;

	public static final int LAST_WEEK_IN_YEAR = 53;

	private short year;

	private byte week;

	private long firstMillisecond;

	private long lastMillisecond;

	public Week() {
		this(new java.util.Date());
	}

	public Week(int week, int year) {
		if ((week < (org.jfree.data.time.Week.FIRST_WEEK_IN_YEAR)) && (week > (org.jfree.data.time.Week.LAST_WEEK_IN_YEAR))) {
			throw new java.lang.IllegalArgumentException("The 'week' argument must be in the range 1 - 53.");
		}
		org.jfree.data.time.Week.this.week = ((byte) (week));
		org.jfree.data.time.Week.this.year = ((short) (year));
		peg(java.util.Calendar.getInstance());
	}

	public Week(int week, org.jfree.data.time.Year year) {
		if ((week < (org.jfree.data.time.Week.FIRST_WEEK_IN_YEAR)) && (week > (org.jfree.data.time.Week.LAST_WEEK_IN_YEAR))) {
			throw new java.lang.IllegalArgumentException("The 'week' argument must be in the range 1 - 53.");
		}
		org.jfree.data.time.Week.this.week = ((byte) (week));
		org.jfree.data.time.Week.this.year = ((short) (year.getYear()));
		peg(java.util.Calendar.getInstance());
	}

	public Week(java.util.Date time) {
		this(time, java.util.TimeZone.getDefault(), java.util.Locale.getDefault());
	}

	public Week(java.util.Date time, java.util.TimeZone zone) {
		this(time, zone, java.util.Locale.getDefault());
	}

	public Week(java.util.Date time, java.util.TimeZone zone, java.util.Locale locale) {
		if (time == null) {
			throw new java.lang.IllegalArgumentException("Null 'time' argument.");
		}
		if (zone == null) {
			throw new java.lang.IllegalArgumentException("Null 'zone' argument.");
		}
		if (locale == null) {
			throw new java.lang.IllegalArgumentException("Null 'locale' argument.");
		}
		java.util.Calendar calendar = java.util.Calendar.getInstance(zone, locale);
		calendar.setTime(time);
		int tempWeek = calendar.get(java.util.Calendar.WEEK_OF_YEAR);
		if ((tempWeek == 1) && ((calendar.get(java.util.Calendar.MONTH)) == (java.util.Calendar.DECEMBER))) {
			org.jfree.data.time.Week.this.week = 1;
			org.jfree.data.time.Week.this.year = ((short) ((calendar.get(java.util.Calendar.YEAR)) + 1));
		}else {
			org.jfree.data.time.Week.this.week = ((byte) (java.lang.Math.min(tempWeek, org.jfree.data.time.Week.LAST_WEEK_IN_YEAR)));
			int yyyy = calendar.get(java.util.Calendar.YEAR);
			if (((calendar.get(java.util.Calendar.MONTH)) == (java.util.Calendar.JANUARY)) && ((org.jfree.data.time.Week.this.week) >= 52)) {
				yyyy--;
			}
			org.jfree.data.time.Week.this.year = ((short) (yyyy));
		}
		peg(calendar);
	}

	public org.jfree.data.time.Year getYear() {
		return new org.jfree.data.time.Year(org.jfree.data.time.Week.this.year);
	}

	public int getYearValue() {
		return org.jfree.data.time.Week.this.year;
	}

	public int getWeek() {
		return org.jfree.data.time.Week.this.week;
	}

	public long getFirstMillisecond() {
		return org.jfree.data.time.Week.this.firstMillisecond;
	}

	public long getLastMillisecond() {
		return org.jfree.data.time.Week.this.lastMillisecond;
	}

	public void peg(java.util.Calendar calendar) {
		org.jfree.data.time.Week.this.firstMillisecond = getFirstMillisecond(calendar);
		org.jfree.data.time.Week.this.lastMillisecond = getLastMillisecond(calendar);
	}

	public org.jfree.data.time.RegularTimePeriod previous() {
		org.jfree.data.time.Week result;
		if ((org.jfree.data.time.Week.this.week) != (org.jfree.data.time.Week.FIRST_WEEK_IN_YEAR)) {
			result = new org.jfree.data.time.Week(((org.jfree.data.time.Week.this.week) - 1), org.jfree.data.time.Week.this.year);
		}else {
			if ((org.jfree.data.time.Week.this.year) > 1900) {
				int yy = (org.jfree.data.time.Week.this.year) - 1;
				java.util.Calendar prevYearCalendar = java.util.Calendar.getInstance();
				prevYearCalendar.set(yy, java.util.Calendar.DECEMBER, 31);
				result = new org.jfree.data.time.Week(prevYearCalendar.getActualMaximum(java.util.Calendar.WEEK_OF_YEAR), yy);
			}else {
				result = null;
			}
		}
		return result;
	}

	public org.jfree.data.time.RegularTimePeriod next() {
		org.jfree.data.time.Week result;
		if ((org.jfree.data.time.Week.this.week) < 52) {
			result = new org.jfree.data.time.Week(((org.jfree.data.time.Week.this.week) + 1), org.jfree.data.time.Week.this.year);
		}else {
			java.util.Calendar calendar = java.util.Calendar.getInstance();
			calendar.set(org.jfree.data.time.Week.this.year, java.util.Calendar.DECEMBER, 31);
			int actualMaxWeek = calendar.getActualMaximum(java.util.Calendar.WEEK_OF_YEAR);
			if ((org.jfree.data.time.Week.this.week) < actualMaxWeek) {
				result = new org.jfree.data.time.Week(((org.jfree.data.time.Week.this.week) + 1), org.jfree.data.time.Week.this.year);
			}else {
				if ((org.jfree.data.time.Week.this.year) < 9999) {
					result = new org.jfree.data.time.Week(org.jfree.data.time.Week.FIRST_WEEK_IN_YEAR, ((org.jfree.data.time.Week.this.year) + 1));
				}else {
					result = null;
				}
			}
		}
		return result;
	}

	public long getSerialIndex() {
		return ((org.jfree.data.time.Week.this.year) * 53L) + (org.jfree.data.time.Week.this.week);
	}

	public long getFirstMillisecond(java.util.Calendar calendar) {
		java.util.Calendar c = ((java.util.Calendar) (calendar.clone()));
		c.clear();
		c.set(java.util.Calendar.YEAR, org.jfree.data.time.Week.this.year);
		c.set(java.util.Calendar.WEEK_OF_YEAR, org.jfree.data.time.Week.this.week);
		c.set(java.util.Calendar.DAY_OF_WEEK, c.getFirstDayOfWeek());
		c.set(java.util.Calendar.HOUR, 0);
		c.set(java.util.Calendar.MINUTE, 0);
		c.set(java.util.Calendar.SECOND, 0);
		c.set(java.util.Calendar.MILLISECOND, 0);
		return c.getTime().getTime();
	}

	public long getLastMillisecond(java.util.Calendar calendar) {
		java.util.Calendar c = ((java.util.Calendar) (calendar.clone()));
		c.clear();
		c.set(java.util.Calendar.YEAR, org.jfree.data.time.Week.this.year);
		c.set(java.util.Calendar.WEEK_OF_YEAR, ((org.jfree.data.time.Week.this.week) + 1));
		c.set(java.util.Calendar.DAY_OF_WEEK, c.getFirstDayOfWeek());
		c.set(java.util.Calendar.HOUR, 0);
		c.set(java.util.Calendar.MINUTE, 0);
		c.set(java.util.Calendar.SECOND, 0);
		c.set(java.util.Calendar.MILLISECOND, 0);
		return (c.getTime().getTime()) - 1;
	}

	public java.lang.String toString() {
		return (("Week " + (org.jfree.data.time.Week.this.week)) + ", ") + (org.jfree.data.time.Week.this.year);
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.data.time.Week.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.data.time.Week)) {
			return false;
		}
		org.jfree.data.time.Week that = ((org.jfree.data.time.Week) (obj));
		if ((org.jfree.data.time.Week.this.week) != (that.week)) {
			return false;
		}
		if ((org.jfree.data.time.Week.this.year) != (that.year)) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		int result = 17;
		result = (37 * result) + (org.jfree.data.time.Week.this.week);
		result = (37 * result) + (org.jfree.data.time.Week.this.year);
		return result;
	}

	public int compareTo(java.lang.Object o1) {
		int result;
		if (o1 instanceof org.jfree.data.time.Week) {
			org.jfree.data.time.Week w = ((org.jfree.data.time.Week) (o1));
			result = (org.jfree.data.time.Week.this.year) - (w.getYear().getYear());
			if (result == 0) {
				result = (org.jfree.data.time.Week.this.week) - (w.getWeek());
			}
		}else
			if (o1 instanceof org.jfree.data.time.RegularTimePeriod) {
				result = 0;
			}else {
				result = 1;
			}
		
		return result;
	}

	public static org.jfree.data.time.Week parseWeek(java.lang.String s) {
		org.jfree.data.time.Week result = null;
		if (s != null) {
			s = s.trim();
			int i = org.jfree.data.time.Week.findSeparator(s);
			if (i != (-1)) {
				java.lang.String s1 = s.substring(0, i).trim();
				java.lang.String s2 = s.substring((i + 1), s.length()).trim();
				org.jfree.data.time.Year y = org.jfree.data.time.Week.evaluateAsYear(s1);
				int w;
				if (y != null) {
					w = org.jfree.data.time.Week.stringToWeek(s2);
					if (w == (-1)) {
						throw new org.jfree.data.time.TimePeriodFormatException("Can't evaluate the week.");
					}
					result = new org.jfree.data.time.Week(w, y);
				}else {
					y = org.jfree.data.time.Week.evaluateAsYear(s2);
					if (y != null) {
						w = org.jfree.data.time.Week.stringToWeek(s1);
						if (w == (-1)) {
							throw new org.jfree.data.time.TimePeriodFormatException("Can't evaluate the week.");
						}
						result = new org.jfree.data.time.Week(w, y);
					}else {
						throw new org.jfree.data.time.TimePeriodFormatException("Can't evaluate the year.");
					}
				}
			}else {
				throw new org.jfree.data.time.TimePeriodFormatException("Could not find separator.");
			}
		}
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

	private static int stringToWeek(java.lang.String s) {
		int result = -1;
		s = s.replace('W', ' ');
		s = s.trim();
		try {
			result = java.lang.Integer.parseInt(s);
			if ((result < 1) || (result > (org.jfree.data.time.Week.LAST_WEEK_IN_YEAR))) {
				result = -1;
			}
		} catch (java.lang.NumberFormatException e) {
		}
		return result;
	}
}

