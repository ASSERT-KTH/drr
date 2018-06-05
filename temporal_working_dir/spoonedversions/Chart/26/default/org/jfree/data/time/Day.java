

package org.jfree.data.time;


public class Day extends org.jfree.data.time.RegularTimePeriod implements java.io.Serializable {
	private static final long serialVersionUID = -7082667380758962755L;

	protected static final java.text.DateFormat DATE_FORMAT = new java.text.SimpleDateFormat("yyyy-MM-dd");

	protected static final java.text.DateFormat DATE_FORMAT_SHORT = java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT);

	protected static final java.text.DateFormat DATE_FORMAT_MEDIUM = java.text.DateFormat.getDateInstance(java.text.DateFormat.MEDIUM);

	protected static final java.text.DateFormat DATE_FORMAT_LONG = java.text.DateFormat.getDateInstance(java.text.DateFormat.LONG);

	private org.jfree.data.time.SerialDate serialDate;

	private long firstMillisecond;

	private long lastMillisecond;

	public Day() {
		this(new java.util.Date());
	}

	public Day(int day, int month, int year) {
		org.jfree.data.time.Day.this.serialDate = org.jfree.data.time.SerialDate.createInstance(day, month, year);
		peg(java.util.Calendar.getInstance());
	}

	public Day(org.jfree.data.time.SerialDate serialDate) {
		if (serialDate == null) {
			throw new java.lang.IllegalArgumentException("Null 'serialDate' argument.");
		}
		org.jfree.data.time.Day.this.serialDate = serialDate;
		peg(java.util.Calendar.getInstance());
	}

	public Day(java.util.Date time) {
		this(time, org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE);
	}

	public Day(java.util.Date time, java.util.TimeZone zone) {
		if (time == null) {
			throw new java.lang.IllegalArgumentException("Null 'time' argument.");
		}
		if (zone == null) {
			throw new java.lang.IllegalArgumentException("Null 'zone' argument.");
		}
		java.util.Calendar calendar = java.util.Calendar.getInstance(zone);
		calendar.setTime(time);
		int d = calendar.get(java.util.Calendar.DAY_OF_MONTH);
		int m = (calendar.get(java.util.Calendar.MONTH)) + 1;
		int y = calendar.get(java.util.Calendar.YEAR);
		org.jfree.data.time.Day.this.serialDate = org.jfree.data.time.SerialDate.createInstance(d, m, y);
		peg(calendar);
	}

	public org.jfree.data.time.SerialDate getSerialDate() {
		return org.jfree.data.time.Day.this.serialDate;
	}

	public int getYear() {
		return org.jfree.data.time.Day.this.serialDate.getYYYY();
	}

	public int getMonth() {
		return org.jfree.data.time.Day.this.serialDate.getMonth();
	}

	public int getDayOfMonth() {
		return org.jfree.data.time.Day.this.serialDate.getDayOfMonth();
	}

	public long getFirstMillisecond() {
		return org.jfree.data.time.Day.this.firstMillisecond;
	}

	public long getLastMillisecond() {
		return org.jfree.data.time.Day.this.lastMillisecond;
	}

	public void peg(java.util.Calendar calendar) {
		org.jfree.data.time.Day.this.firstMillisecond = getFirstMillisecond(calendar);
		org.jfree.data.time.Day.this.lastMillisecond = getLastMillisecond(calendar);
	}

	public org.jfree.data.time.RegularTimePeriod previous() {
		org.jfree.data.time.Day result;
		int serial = org.jfree.data.time.Day.this.serialDate.toSerial();
		if (serial > (org.jfree.data.time.SerialDate.SERIAL_LOWER_BOUND)) {
			org.jfree.data.time.SerialDate yesterday = org.jfree.data.time.SerialDate.createInstance((serial - 1));
			return new org.jfree.data.time.Day(yesterday);
		}else {
			result = null;
		}
		return result;
	}

	public org.jfree.data.time.RegularTimePeriod next() {
		org.jfree.data.time.Day result;
		int serial = org.jfree.data.time.Day.this.serialDate.toSerial();
		if (serial < (org.jfree.data.time.SerialDate.SERIAL_UPPER_BOUND)) {
			org.jfree.data.time.SerialDate tomorrow = org.jfree.data.time.SerialDate.createInstance((serial + 1));
			return new org.jfree.data.time.Day(tomorrow);
		}else {
			result = null;
		}
		return result;
	}

	public long getSerialIndex() {
		return org.jfree.data.time.Day.this.serialDate.toSerial();
	}

	public long getFirstMillisecond(java.util.Calendar calendar) {
		int year = org.jfree.data.time.Day.this.serialDate.getYYYY();
		int month = org.jfree.data.time.Day.this.serialDate.getMonth();
		int day = org.jfree.data.time.Day.this.serialDate.getDayOfMonth();
		calendar.clear();
		calendar.set(year, (month - 1), day, 0, 0, 0);
		calendar.set(java.util.Calendar.MILLISECOND, 0);
		return calendar.getTime().getTime();
	}

	public long getLastMillisecond(java.util.Calendar calendar) {
		int year = org.jfree.data.time.Day.this.serialDate.getYYYY();
		int month = org.jfree.data.time.Day.this.serialDate.getMonth();
		int day = org.jfree.data.time.Day.this.serialDate.getDayOfMonth();
		calendar.clear();
		calendar.set(year, (month - 1), day, 23, 59, 59);
		calendar.set(java.util.Calendar.MILLISECOND, 999);
		return calendar.getTime().getTime();
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.data.time.Day.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.data.time.Day)) {
			return false;
		}
		org.jfree.data.time.Day that = ((org.jfree.data.time.Day) (obj));
		if (!(org.jfree.data.time.Day.this.serialDate.equals(that.getSerialDate()))) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		return org.jfree.data.time.Day.this.serialDate.hashCode();
	}

	public int compareTo(java.lang.Object o1) {
		int result;
		if (o1 instanceof org.jfree.data.time.Day) {
			org.jfree.data.time.Day d = ((org.jfree.data.time.Day) (o1));
			result = -(d.getSerialDate().compare(org.jfree.data.time.Day.this.serialDate));
		}else
			if (o1 instanceof org.jfree.data.time.RegularTimePeriod) {
				result = 0;
			}else {
				result = 1;
			}
		
		return result;
	}

	public java.lang.String toString() {
		return org.jfree.data.time.Day.this.serialDate.toString();
	}

	public static org.jfree.data.time.Day parseDay(java.lang.String s) {
		try {
			return new org.jfree.data.time.Day(org.jfree.data.time.Day.DATE_FORMAT.parse(s));
		} catch (java.text.ParseException e1) {
			try {
				return new org.jfree.data.time.Day(org.jfree.data.time.Day.DATE_FORMAT_SHORT.parse(s));
			} catch (java.text.ParseException e2) {
			}
		}
		return null;
	}
}

