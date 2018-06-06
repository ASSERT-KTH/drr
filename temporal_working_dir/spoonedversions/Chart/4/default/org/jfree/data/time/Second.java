

package org.jfree.data.time;


public class Second extends org.jfree.data.time.RegularTimePeriod implements java.io.Serializable {
	private static final long serialVersionUID = -6536564190712383466L;

	public static final int FIRST_SECOND_IN_MINUTE = 0;

	public static final int LAST_SECOND_IN_MINUTE = 59;

	private org.jfree.data.time.Day day;

	private byte hour;

	private byte minute;

	private byte second;

	private long firstMillisecond;

	public Second() {
		this(new java.util.Date());
	}

	public Second(int second, org.jfree.data.time.Minute minute) {
		if (minute == null) {
			throw new java.lang.IllegalArgumentException("Null 'minute' argument.");
		}
		org.jfree.data.time.Second.this.day = minute.getDay();
		org.jfree.data.time.Second.this.hour = ((byte) (minute.getHourValue()));
		org.jfree.data.time.Second.this.minute = ((byte) (minute.getMinute()));
		org.jfree.data.time.Second.this.second = ((byte) (second));
		peg(java.util.Calendar.getInstance());
	}

	public Second(int second, int minute, int hour, int day, int month, int year) {
		this(second, new org.jfree.data.time.Minute(minute, hour, day, month, year));
	}

	public Second(java.util.Date time) {
		this(time, java.util.TimeZone.getDefault());
	}

	public Second(java.util.Date time, java.util.TimeZone zone) {
		java.util.Calendar calendar = java.util.Calendar.getInstance(zone);
		calendar.setTime(time);
		org.jfree.data.time.Second.this.second = ((byte) (calendar.get(java.util.Calendar.SECOND)));
		org.jfree.data.time.Second.this.minute = ((byte) (calendar.get(java.util.Calendar.MINUTE)));
		org.jfree.data.time.Second.this.hour = ((byte) (calendar.get(java.util.Calendar.HOUR_OF_DAY)));
		org.jfree.data.time.Second.this.day = new org.jfree.data.time.Day(time, zone);
		peg(calendar);
	}

	public int getSecond() {
		return org.jfree.data.time.Second.this.second;
	}

	public org.jfree.data.time.Minute getMinute() {
		return new org.jfree.data.time.Minute(org.jfree.data.time.Second.this.minute, new org.jfree.data.time.Hour(org.jfree.data.time.Second.this.hour, org.jfree.data.time.Second.this.day));
	}

	public long getFirstMillisecond() {
		return org.jfree.data.time.Second.this.firstMillisecond;
	}

	public long getLastMillisecond() {
		return (org.jfree.data.time.Second.this.firstMillisecond) + 999L;
	}

	public void peg(java.util.Calendar calendar) {
		org.jfree.data.time.Second.this.firstMillisecond = getFirstMillisecond(calendar);
	}

	public org.jfree.data.time.RegularTimePeriod previous() {
		org.jfree.data.time.Second result = null;
		if ((org.jfree.data.time.Second.this.second) != (org.jfree.data.time.Second.FIRST_SECOND_IN_MINUTE)) {
			result = new org.jfree.data.time.Second(((org.jfree.data.time.Second.this.second) - 1), getMinute());
		}else {
			org.jfree.data.time.Minute previous = ((org.jfree.data.time.Minute) (getMinute().previous()));
			if (previous != null) {
				result = new org.jfree.data.time.Second(org.jfree.data.time.Second.LAST_SECOND_IN_MINUTE, previous);
			}
		}
		return result;
	}

	public org.jfree.data.time.RegularTimePeriod next() {
		org.jfree.data.time.Second result = null;
		if ((org.jfree.data.time.Second.this.second) != (org.jfree.data.time.Second.LAST_SECOND_IN_MINUTE)) {
			result = new org.jfree.data.time.Second(((org.jfree.data.time.Second.this.second) + 1), getMinute());
		}else {
			org.jfree.data.time.Minute next = ((org.jfree.data.time.Minute) (getMinute().next()));
			if (next != null) {
				result = new org.jfree.data.time.Second(org.jfree.data.time.Second.FIRST_SECOND_IN_MINUTE, next);
			}
		}
		return result;
	}

	public long getSerialIndex() {
		long hourIndex = ((org.jfree.data.time.Second.this.day.getSerialIndex()) * 24L) + (org.jfree.data.time.Second.this.hour);
		long minuteIndex = (hourIndex * 60L) + (org.jfree.data.time.Second.this.minute);
		return (minuteIndex * 60L) + (org.jfree.data.time.Second.this.second);
	}

	public long getFirstMillisecond(java.util.Calendar calendar) {
		int year = org.jfree.data.time.Second.this.day.getYear();
		int month = (org.jfree.data.time.Second.this.day.getMonth()) - 1;
		int day = org.jfree.data.time.Second.this.day.getDayOfMonth();
		calendar.clear();
		calendar.set(year, month, day, org.jfree.data.time.Second.this.hour, org.jfree.data.time.Second.this.minute, org.jfree.data.time.Second.this.second);
		calendar.set(java.util.Calendar.MILLISECOND, 0);
		return calendar.getTime().getTime();
	}

	public long getLastMillisecond(java.util.Calendar calendar) {
		return (getFirstMillisecond(calendar)) + 999L;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.data.time.Second.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.data.time.Second)) {
			return false;
		}
		org.jfree.data.time.Second that = ((org.jfree.data.time.Second) (obj));
		if ((org.jfree.data.time.Second.this.second) != (that.second)) {
			return false;
		}
		if ((org.jfree.data.time.Second.this.minute) != (that.minute)) {
			return false;
		}
		if ((org.jfree.data.time.Second.this.hour) != (that.hour)) {
			return false;
		}
		if (!(org.jfree.data.time.Second.this.day.equals(that.day))) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		int result = 17;
		result = (37 * result) + (org.jfree.data.time.Second.this.second);
		result = (37 * result) + (org.jfree.data.time.Second.this.minute);
		result = (37 * result) + (org.jfree.data.time.Second.this.hour);
		result = (37 * result) + (org.jfree.data.time.Second.this.day.hashCode());
		return result;
	}

	public int compareTo(java.lang.Object o1) {
		int result;
		if (o1 instanceof org.jfree.data.time.Second) {
			org.jfree.data.time.Second s = ((org.jfree.data.time.Second) (o1));
			if ((org.jfree.data.time.Second.this.firstMillisecond) < (s.firstMillisecond)) {
				return -1;
			}else
				if ((org.jfree.data.time.Second.this.firstMillisecond) > (s.firstMillisecond)) {
					return 1;
				}else {
					return 0;
				}
			
		}else
			if (o1 instanceof org.jfree.data.time.RegularTimePeriod) {
				result = 0;
			}else {
				result = 1;
			}
		
		return result;
	}

	public static org.jfree.data.time.Second parseSecond(java.lang.String s) {
		org.jfree.data.time.Second result = null;
		s = s.trim();
		java.lang.String daystr = s.substring(0, java.lang.Math.min(10, s.length()));
		org.jfree.data.time.Day day = org.jfree.data.time.Day.parseDay(daystr);
		if (day != null) {
			java.lang.String hmsstr = s.substring(java.lang.Math.min(((daystr.length()) + 1), s.length()), s.length());
			hmsstr = hmsstr.trim();
			int l = hmsstr.length();
			java.lang.String hourstr = hmsstr.substring(0, java.lang.Math.min(2, l));
			java.lang.String minstr = hmsstr.substring(java.lang.Math.min(3, l), java.lang.Math.min(5, l));
			java.lang.String secstr = hmsstr.substring(java.lang.Math.min(6, l), java.lang.Math.min(8, l));
			int hour = java.lang.Integer.parseInt(hourstr);
			if ((hour >= 0) && (hour <= 23)) {
				int minute = java.lang.Integer.parseInt(minstr);
				if ((minute >= 0) && (minute <= 59)) {
					org.jfree.data.time.Minute m = new org.jfree.data.time.Minute(minute, new org.jfree.data.time.Hour(hour, day));
					int second = java.lang.Integer.parseInt(secstr);
					if ((second >= 0) && (second <= 59)) {
						result = new org.jfree.data.time.Second(second, m);
					}
				}
			}
		}
		return result;
	}
}

