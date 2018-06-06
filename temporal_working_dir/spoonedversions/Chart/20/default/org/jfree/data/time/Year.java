

package org.jfree.data.time;


public class Year extends org.jfree.data.time.RegularTimePeriod implements java.io.Serializable {
	private static final long serialVersionUID = -7659990929736074836L;

	private short year;

	private long firstMillisecond;

	private long lastMillisecond;

	public Year() {
		this(new java.util.Date());
	}

	public Year(int year) {
		if ((year < (org.jfree.data.time.SerialDate.MINIMUM_YEAR_SUPPORTED)) || (year > (org.jfree.data.time.SerialDate.MAXIMUM_YEAR_SUPPORTED))) {
			throw new java.lang.IllegalArgumentException((("Year constructor: year (" + year) + ") outside valid range."));
		}
		org.jfree.data.time.Year.this.year = ((short) (year));
		peg(java.util.Calendar.getInstance());
	}

	public Year(java.util.Date time) {
		this(time, org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE);
	}

	public Year(java.util.Date time, java.util.TimeZone zone) {
		java.util.Calendar calendar = java.util.Calendar.getInstance(zone);
		calendar.setTime(time);
		org.jfree.data.time.Year.this.year = ((short) (calendar.get(java.util.Calendar.YEAR)));
		peg(calendar);
	}

	public int getYear() {
		return org.jfree.data.time.Year.this.year;
	}

	public long getFirstMillisecond() {
		return org.jfree.data.time.Year.this.firstMillisecond;
	}

	public long getLastMillisecond() {
		return org.jfree.data.time.Year.this.lastMillisecond;
	}

	public void peg(java.util.Calendar calendar) {
		org.jfree.data.time.Year.this.firstMillisecond = getFirstMillisecond(calendar);
		org.jfree.data.time.Year.this.lastMillisecond = getLastMillisecond(calendar);
	}

	public org.jfree.data.time.RegularTimePeriod previous() {
		if ((org.jfree.data.time.Year.this.year) > (org.jfree.data.time.SerialDate.MINIMUM_YEAR_SUPPORTED)) {
			return new org.jfree.data.time.Year(((org.jfree.data.time.Year.this.year) - 1));
		}else {
			return null;
		}
	}

	public org.jfree.data.time.RegularTimePeriod next() {
		if ((org.jfree.data.time.Year.this.year) < (org.jfree.data.time.SerialDate.MAXIMUM_YEAR_SUPPORTED)) {
			return new org.jfree.data.time.Year(((org.jfree.data.time.Year.this.year) + 1));
		}else {
			return null;
		}
	}

	public long getSerialIndex() {
		return org.jfree.data.time.Year.this.year;
	}

	public long getFirstMillisecond(java.util.Calendar calendar) {
		calendar.set(org.jfree.data.time.Year.this.year, java.util.Calendar.JANUARY, 1, 0, 0, 0);
		calendar.set(java.util.Calendar.MILLISECOND, 0);
		return calendar.getTime().getTime();
	}

	public long getLastMillisecond(java.util.Calendar calendar) {
		calendar.set(org.jfree.data.time.Year.this.year, java.util.Calendar.DECEMBER, 31, 23, 59, 59);
		calendar.set(java.util.Calendar.MILLISECOND, 999);
		return calendar.getTime().getTime();
	}

	public boolean equals(java.lang.Object object) {
		if (object != null) {
			if (object instanceof org.jfree.data.time.Year) {
				org.jfree.data.time.Year target = ((org.jfree.data.time.Year) (object));
				return (org.jfree.data.time.Year.this.year) == (target.getYear());
			}else {
				return false;
			}
		}else {
			return false;
		}
	}

	public int hashCode() {
		int result = 17;
		int c = org.jfree.data.time.Year.this.year;
		result = (37 * result) + c;
		return result;
	}

	public int compareTo(java.lang.Object o1) {
		int result;
		if (o1 instanceof org.jfree.data.time.Year) {
			org.jfree.data.time.Year y = ((org.jfree.data.time.Year) (o1));
			result = (org.jfree.data.time.Year.this.year) - (y.getYear());
		}else
			if (o1 instanceof org.jfree.data.time.RegularTimePeriod) {
				result = 0;
			}else {
				result = 1;
			}
		
		return result;
	}

	public java.lang.String toString() {
		return java.lang.Integer.toString(org.jfree.data.time.Year.this.year);
	}

	public static org.jfree.data.time.Year parseYear(java.lang.String s) {
		int y;
		try {
			y = java.lang.Integer.parseInt(s.trim());
		} catch (java.lang.NumberFormatException e) {
			throw new org.jfree.data.time.TimePeriodFormatException("Cannot parse string.");
		}
		try {
			return new org.jfree.data.time.Year(y);
		} catch (java.lang.IllegalArgumentException e) {
			throw new org.jfree.data.time.TimePeriodFormatException("Year outside valid range.");
		}
	}
}

