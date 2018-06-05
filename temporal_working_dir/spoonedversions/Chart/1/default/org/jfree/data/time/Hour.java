

package org.jfree.data.time;


public class Hour extends org.jfree.data.time.RegularTimePeriod implements java.io.Serializable {
	private static final long serialVersionUID = -835471579831937652L;

	public static final int FIRST_HOUR_IN_DAY = 0;

	public static final int LAST_HOUR_IN_DAY = 23;

	private org.jfree.data.time.Day day;

	private byte hour;

	private long firstMillisecond;

	private long lastMillisecond;

	public Hour() {
		this(new java.util.Date());
	}

	public Hour(int hour, org.jfree.data.time.Day day) {
		if (day == null) {
			throw new java.lang.IllegalArgumentException("Null 'day' argument.");
		}
		org.jfree.data.time.Hour.this.hour = ((byte) (hour));
		org.jfree.data.time.Hour.this.day = day;
		peg(java.util.Calendar.getInstance());
	}

	public Hour(int hour, int day, int month, int year) {
		this(hour, new org.jfree.data.time.Day(day, month, year));
	}

	public Hour(java.util.Date time) {
		this(time, java.util.TimeZone.getDefault());
	}

	public Hour(java.util.Date time, java.util.TimeZone zone) {
		if (time == null) {
			throw new java.lang.IllegalArgumentException("Null 'time' argument.");
		}
		if (zone == null) {
			throw new java.lang.IllegalArgumentException("Null 'zone' argument.");
		}
		java.util.Calendar calendar = java.util.Calendar.getInstance(zone);
		calendar.setTime(time);
		org.jfree.data.time.Hour.this.hour = ((byte) (calendar.get(java.util.Calendar.HOUR_OF_DAY)));
		org.jfree.data.time.Hour.this.day = new org.jfree.data.time.Day(time, zone);
		peg(calendar);
	}

	public int getHour() {
		return org.jfree.data.time.Hour.this.hour;
	}

	public org.jfree.data.time.Day getDay() {
		return org.jfree.data.time.Hour.this.day;
	}

	public int getYear() {
		return org.jfree.data.time.Hour.this.day.getYear();
	}

	public int getMonth() {
		return org.jfree.data.time.Hour.this.day.getMonth();
	}

	public int getDayOfMonth() {
		return org.jfree.data.time.Hour.this.day.getDayOfMonth();
	}

	public long getFirstMillisecond() {
		return org.jfree.data.time.Hour.this.firstMillisecond;
	}

	public long getLastMillisecond() {
		return org.jfree.data.time.Hour.this.lastMillisecond;
	}

	public void peg(java.util.Calendar calendar) {
		org.jfree.data.time.Hour.this.firstMillisecond = getFirstMillisecond(calendar);
		org.jfree.data.time.Hour.this.lastMillisecond = getLastMillisecond(calendar);
	}

	public org.jfree.data.time.RegularTimePeriod previous() {
		org.jfree.data.time.Hour result;
		if ((org.jfree.data.time.Hour.this.hour) != (org.jfree.data.time.Hour.FIRST_HOUR_IN_DAY)) {
			result = new org.jfree.data.time.Hour(((org.jfree.data.time.Hour.this.hour) - 1), org.jfree.data.time.Hour.this.day);
		}else {
			org.jfree.data.time.Day prevDay = ((org.jfree.data.time.Day) (org.jfree.data.time.Hour.this.day.previous()));
			if (prevDay != null) {
				result = new org.jfree.data.time.Hour(org.jfree.data.time.Hour.LAST_HOUR_IN_DAY, prevDay);
			}else {
				result = null;
			}
		}
		return result;
	}

	public org.jfree.data.time.RegularTimePeriod next() {
		org.jfree.data.time.Hour result;
		if ((org.jfree.data.time.Hour.this.hour) != (org.jfree.data.time.Hour.LAST_HOUR_IN_DAY)) {
			result = new org.jfree.data.time.Hour(((org.jfree.data.time.Hour.this.hour) + 1), org.jfree.data.time.Hour.this.day);
		}else {
			org.jfree.data.time.Day nextDay = ((org.jfree.data.time.Day) (org.jfree.data.time.Hour.this.day.next()));
			if (nextDay != null) {
				result = new org.jfree.data.time.Hour(org.jfree.data.time.Hour.FIRST_HOUR_IN_DAY, nextDay);
			}else {
				result = null;
			}
		}
		return result;
	}

	public long getSerialIndex() {
		return ((org.jfree.data.time.Hour.this.day.getSerialIndex()) * 24L) + (org.jfree.data.time.Hour.this.hour);
	}

	public long getFirstMillisecond(java.util.Calendar calendar) {
		int year = org.jfree.data.time.Hour.this.day.getYear();
		int month = (org.jfree.data.time.Hour.this.day.getMonth()) - 1;
		int dom = org.jfree.data.time.Hour.this.day.getDayOfMonth();
		calendar.set(year, month, dom, org.jfree.data.time.Hour.this.hour, 0, 0);
		calendar.set(java.util.Calendar.MILLISECOND, 0);
		return calendar.getTime().getTime();
	}

	public long getLastMillisecond(java.util.Calendar calendar) {
		int year = org.jfree.data.time.Hour.this.day.getYear();
		int month = (org.jfree.data.time.Hour.this.day.getMonth()) - 1;
		int dom = org.jfree.data.time.Hour.this.day.getDayOfMonth();
		calendar.set(year, month, dom, org.jfree.data.time.Hour.this.hour, 59, 59);
		calendar.set(java.util.Calendar.MILLISECOND, 999);
		return calendar.getTime().getTime();
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.data.time.Hour.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.data.time.Hour)) {
			return false;
		}
		org.jfree.data.time.Hour that = ((org.jfree.data.time.Hour) (obj));
		if ((org.jfree.data.time.Hour.this.hour) != (that.hour)) {
			return false;
		}
		if (!(org.jfree.data.time.Hour.this.day.equals(that.day))) {
			return false;
		}
		return true;
	}

	public java.lang.String toString() {
		return ((((((("[" + (org.jfree.data.time.Hour.this.hour)) + ",") + (getDayOfMonth())) + "/") + (getMonth())) + "/") + (getYear())) + "]";
	}

	public int hashCode() {
		int result = 17;
		result = (37 * result) + (org.jfree.data.time.Hour.this.hour);
		result = (37 * result) + (org.jfree.data.time.Hour.this.day.hashCode());
		return result;
	}

	public int compareTo(java.lang.Object o1) {
		int result;
		if (o1 instanceof org.jfree.data.time.Hour) {
			org.jfree.data.time.Hour h = ((org.jfree.data.time.Hour) (o1));
			result = getDay().compareTo(h.getDay());
			if (result == 0) {
				result = (org.jfree.data.time.Hour.this.hour) - (h.getHour());
			}
		}else
			if (o1 instanceof org.jfree.data.time.RegularTimePeriod) {
				result = 0;
			}else {
				result = 1;
			}
		
		return result;
	}

	public static org.jfree.data.time.Hour parseHour(java.lang.String s) {
		org.jfree.data.time.Hour result = null;
		s = s.trim();
		java.lang.String daystr = s.substring(0, java.lang.Math.min(10, s.length()));
		org.jfree.data.time.Day day = org.jfree.data.time.Day.parseDay(daystr);
		if (day != null) {
			java.lang.String hourstr = s.substring(java.lang.Math.min(((daystr.length()) + 1), s.length()), s.length());
			hourstr = hourstr.trim();
			int hour = java.lang.Integer.parseInt(hourstr);
			if ((hour >= (org.jfree.data.time.Hour.FIRST_HOUR_IN_DAY)) && (hour <= (org.jfree.data.time.Hour.LAST_HOUR_IN_DAY))) {
				result = new org.jfree.data.time.Hour(hour, day);
			}
		}
		return result;
	}
}

