

package org.jfree.data.time;


public class Minute extends org.jfree.data.time.RegularTimePeriod implements java.io.Serializable {
	private static final long serialVersionUID = 2144572840034842871L;

	public static final int FIRST_MINUTE_IN_HOUR = 0;

	public static final int LAST_MINUTE_IN_HOUR = 59;

	private org.jfree.data.time.Day day;

	private byte hour;

	private byte minute;

	private long firstMillisecond;

	private long lastMillisecond;

	public Minute() {
		this(new java.util.Date());
	}

	public Minute(int minute, org.jfree.data.time.Hour hour) {
		if (hour == null) {
			throw new java.lang.IllegalArgumentException("Null 'hour' argument.");
		}
		org.jfree.data.time.Minute.this.minute = ((byte) (minute));
		org.jfree.data.time.Minute.this.hour = ((byte) (hour.getHour()));
		org.jfree.data.time.Minute.this.day = hour.getDay();
		peg(java.util.Calendar.getInstance());
	}

	public Minute(java.util.Date time) {
		this(time, org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE);
	}

	public Minute(java.util.Date time, java.util.TimeZone zone) {
		if (time == null) {
			throw new java.lang.IllegalArgumentException("Null 'time' argument.");
		}
		if (zone == null) {
			throw new java.lang.IllegalArgumentException("Null 'zone' argument.");
		}
		java.util.Calendar calendar = java.util.Calendar.getInstance(zone);
		calendar.setTime(time);
		int min = calendar.get(java.util.Calendar.MINUTE);
		org.jfree.data.time.Minute.this.minute = ((byte) (min));
		org.jfree.data.time.Minute.this.hour = ((byte) (calendar.get(java.util.Calendar.HOUR_OF_DAY)));
		org.jfree.data.time.Minute.this.day = new org.jfree.data.time.Day(time, zone);
		peg(calendar);
	}

	public Minute(int minute, int hour, int day, int month, int year) {
		this(minute, new org.jfree.data.time.Hour(hour, new org.jfree.data.time.Day(day, month, year)));
	}

	public org.jfree.data.time.Day getDay() {
		return org.jfree.data.time.Minute.this.day;
	}

	public org.jfree.data.time.Hour getHour() {
		return new org.jfree.data.time.Hour(org.jfree.data.time.Minute.this.hour, org.jfree.data.time.Minute.this.day);
	}

	public int getHourValue() {
		return org.jfree.data.time.Minute.this.hour;
	}

	public int getMinute() {
		return org.jfree.data.time.Minute.this.minute;
	}

	public long getFirstMillisecond() {
		return org.jfree.data.time.Minute.this.firstMillisecond;
	}

	public long getLastMillisecond() {
		return org.jfree.data.time.Minute.this.lastMillisecond;
	}

	public void peg(java.util.Calendar calendar) {
		org.jfree.data.time.Minute.this.firstMillisecond = getFirstMillisecond(calendar);
		org.jfree.data.time.Minute.this.lastMillisecond = getLastMillisecond(calendar);
	}

	public org.jfree.data.time.RegularTimePeriod previous() {
		org.jfree.data.time.Minute result;
		if ((org.jfree.data.time.Minute.this.minute) != (org.jfree.data.time.Minute.FIRST_MINUTE_IN_HOUR)) {
			result = new org.jfree.data.time.Minute(((org.jfree.data.time.Minute.this.minute) - 1), getHour());
		}else {
			org.jfree.data.time.Hour h = ((org.jfree.data.time.Hour) (getHour().previous()));
			if (h != null) {
				result = new org.jfree.data.time.Minute(org.jfree.data.time.Minute.LAST_MINUTE_IN_HOUR, h);
			}else {
				result = null;
			}
		}
		return result;
	}

	public org.jfree.data.time.RegularTimePeriod next() {
		org.jfree.data.time.Minute result;
		if ((org.jfree.data.time.Minute.this.minute) != (org.jfree.data.time.Minute.LAST_MINUTE_IN_HOUR)) {
			result = new org.jfree.data.time.Minute(((org.jfree.data.time.Minute.this.minute) + 1), getHour());
		}else {
			org.jfree.data.time.Hour nextHour = ((org.jfree.data.time.Hour) (getHour().next()));
			if (nextHour != null) {
				result = new org.jfree.data.time.Minute(org.jfree.data.time.Minute.FIRST_MINUTE_IN_HOUR, nextHour);
			}else {
				result = null;
			}
		}
		return result;
	}

	public long getSerialIndex() {
		long hourIndex = ((org.jfree.data.time.Minute.this.day.getSerialIndex()) * 24L) + (org.jfree.data.time.Minute.this.hour);
		return (hourIndex * 60L) + (org.jfree.data.time.Minute.this.minute);
	}

	public long getFirstMillisecond(java.util.Calendar calendar) {
		int year = org.jfree.data.time.Minute.this.day.getYear();
		int month = (org.jfree.data.time.Minute.this.day.getMonth()) - 1;
		int day = org.jfree.data.time.Minute.this.day.getDayOfMonth();
		calendar.clear();
		calendar.set(year, month, day, org.jfree.data.time.Minute.this.hour, org.jfree.data.time.Minute.this.minute, 0);
		calendar.set(java.util.Calendar.MILLISECOND, 0);
		return calendar.getTime().getTime();
	}

	public long getLastMillisecond(java.util.Calendar calendar) {
		int year = org.jfree.data.time.Minute.this.day.getYear();
		int month = (org.jfree.data.time.Minute.this.day.getMonth()) - 1;
		int day = org.jfree.data.time.Minute.this.day.getDayOfMonth();
		calendar.clear();
		calendar.set(year, month, day, org.jfree.data.time.Minute.this.hour, org.jfree.data.time.Minute.this.minute, 59);
		calendar.set(java.util.Calendar.MILLISECOND, 999);
		return calendar.getTime().getTime();
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.data.time.Minute.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.data.time.Minute)) {
			return false;
		}
		org.jfree.data.time.Minute that = ((org.jfree.data.time.Minute) (obj));
		if ((org.jfree.data.time.Minute.this.minute) != (that.minute)) {
			return false;
		}
		if ((org.jfree.data.time.Minute.this.hour) != (that.hour)) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		int result = 17;
		result = (37 * result) + (org.jfree.data.time.Minute.this.minute);
		result = (37 * result) + (org.jfree.data.time.Minute.this.hour);
		result = (37 * result) + (org.jfree.data.time.Minute.this.day.hashCode());
		return result;
	}

	public int compareTo(java.lang.Object o1) {
		int result;
		if (o1 instanceof org.jfree.data.time.Minute) {
			org.jfree.data.time.Minute m = ((org.jfree.data.time.Minute) (o1));
			result = getHour().compareTo(m.getHour());
			if (result == 0) {
				result = (org.jfree.data.time.Minute.this.minute) - (m.getMinute());
			}
		}else
			if (o1 instanceof org.jfree.data.time.RegularTimePeriod) {
				result = 0;
			}else {
				result = 1;
			}
		
		return result;
	}

	public static org.jfree.data.time.Minute parseMinute(java.lang.String s) {
		org.jfree.data.time.Minute result = null;
		s = s.trim();
		java.lang.String daystr = s.substring(0, java.lang.Math.min(10, s.length()));
		org.jfree.data.time.Day day = org.jfree.data.time.Day.parseDay(daystr);
		if (day != null) {
			java.lang.String hmstr = s.substring(java.lang.Math.min(((daystr.length()) + 1), s.length()), s.length());
			hmstr = hmstr.trim();
			java.lang.String hourstr = hmstr.substring(0, java.lang.Math.min(2, hmstr.length()));
			int hour = java.lang.Integer.parseInt(hourstr);
			if ((hour >= 0) && (hour <= 23)) {
				java.lang.String minstr = hmstr.substring(java.lang.Math.min(((hourstr.length()) + 1), hmstr.length()), hmstr.length());
				int minute = java.lang.Integer.parseInt(minstr);
				if ((minute >= 0) && (minute <= 59)) {
					result = new org.jfree.data.time.Minute(minute, new org.jfree.data.time.Hour(hour, day));
				}
			}
		}
		return result;
	}
}

