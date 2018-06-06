

package org.jfree.data.time;


public class Millisecond extends org.jfree.data.time.RegularTimePeriod implements java.io.Serializable {
	static final long serialVersionUID = -5316836467277638485L;

	public static final int FIRST_MILLISECOND_IN_SECOND = 0;

	public static final int LAST_MILLISECOND_IN_SECOND = 999;

	private org.jfree.data.time.Day day;

	private byte hour;

	private byte minute;

	private byte second;

	private int millisecond;

	private long firstMillisecond;

	public Millisecond() {
		this(new java.util.Date());
	}

	public Millisecond(int millisecond, org.jfree.data.time.Second second) {
		org.jfree.data.time.Millisecond.this.millisecond = millisecond;
		org.jfree.data.time.Millisecond.this.second = ((byte) (second.getSecond()));
		org.jfree.data.time.Millisecond.this.minute = ((byte) (second.getMinute().getMinute()));
		org.jfree.data.time.Millisecond.this.hour = ((byte) (second.getMinute().getHourValue()));
		org.jfree.data.time.Millisecond.this.day = second.getMinute().getDay();
		peg(java.util.Calendar.getInstance());
	}

	public Millisecond(int millisecond, int second, int minute, int hour, int day, int month, int year) {
		this(millisecond, new org.jfree.data.time.Second(second, minute, hour, day, month, year));
	}

	public Millisecond(java.util.Date time) {
		this(time, org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE);
	}

	public Millisecond(java.util.Date time, java.util.TimeZone zone) {
		java.util.Calendar calendar = java.util.Calendar.getInstance(zone);
		calendar.setTime(time);
		org.jfree.data.time.Millisecond.this.millisecond = calendar.get(java.util.Calendar.MILLISECOND);
		org.jfree.data.time.Millisecond.this.second = ((byte) (calendar.get(java.util.Calendar.SECOND)));
		org.jfree.data.time.Millisecond.this.minute = ((byte) (calendar.get(java.util.Calendar.MINUTE)));
		org.jfree.data.time.Millisecond.this.hour = ((byte) (calendar.get(java.util.Calendar.HOUR_OF_DAY)));
		org.jfree.data.time.Millisecond.this.day = new org.jfree.data.time.Day(time, zone);
		peg(calendar);
	}

	public org.jfree.data.time.Second getSecond() {
		return new org.jfree.data.time.Second(org.jfree.data.time.Millisecond.this.second, org.jfree.data.time.Millisecond.this.minute, org.jfree.data.time.Millisecond.this.hour, org.jfree.data.time.Millisecond.this.day.getDayOfMonth(), org.jfree.data.time.Millisecond.this.day.getMonth(), org.jfree.data.time.Millisecond.this.day.getYear());
	}

	public long getMillisecond() {
		return org.jfree.data.time.Millisecond.this.millisecond;
	}

	public long getFirstMillisecond() {
		return org.jfree.data.time.Millisecond.this.firstMillisecond;
	}

	public long getLastMillisecond() {
		return org.jfree.data.time.Millisecond.this.firstMillisecond;
	}

	public void peg(java.util.Calendar calendar) {
		org.jfree.data.time.Millisecond.this.firstMillisecond = getFirstMillisecond(calendar);
	}

	public org.jfree.data.time.RegularTimePeriod previous() {
		org.jfree.data.time.RegularTimePeriod result = null;
		if ((org.jfree.data.time.Millisecond.this.millisecond) != (org.jfree.data.time.Millisecond.FIRST_MILLISECOND_IN_SECOND)) {
			result = new org.jfree.data.time.Millisecond(((org.jfree.data.time.Millisecond.this.millisecond) - 1), getSecond());
		}else {
			org.jfree.data.time.Second previous = ((org.jfree.data.time.Second) (getSecond().previous()));
			if (previous != null) {
				result = new org.jfree.data.time.Millisecond(org.jfree.data.time.Millisecond.LAST_MILLISECOND_IN_SECOND, previous);
			}
		}
		return result;
	}

	public org.jfree.data.time.RegularTimePeriod next() {
		org.jfree.data.time.RegularTimePeriod result = null;
		if ((org.jfree.data.time.Millisecond.this.millisecond) != (org.jfree.data.time.Millisecond.LAST_MILLISECOND_IN_SECOND)) {
			result = new org.jfree.data.time.Millisecond(((org.jfree.data.time.Millisecond.this.millisecond) + 1), getSecond());
		}else {
			org.jfree.data.time.Second next = ((org.jfree.data.time.Second) (getSecond().next()));
			if (next != null) {
				result = new org.jfree.data.time.Millisecond(org.jfree.data.time.Millisecond.FIRST_MILLISECOND_IN_SECOND, next);
			}
		}
		return result;
	}

	public long getSerialIndex() {
		long hourIndex = ((org.jfree.data.time.Millisecond.this.day.getSerialIndex()) * 24L) + (org.jfree.data.time.Millisecond.this.hour);
		long minuteIndex = (hourIndex * 60L) + (org.jfree.data.time.Millisecond.this.minute);
		long secondIndex = (minuteIndex * 60L) + (org.jfree.data.time.Millisecond.this.second);
		return (secondIndex * 1000L) + (org.jfree.data.time.Millisecond.this.millisecond);
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.data.time.Millisecond.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.data.time.Millisecond)) {
			return false;
		}
		org.jfree.data.time.Millisecond that = ((org.jfree.data.time.Millisecond) (obj));
		if ((org.jfree.data.time.Millisecond.this.millisecond) != (that.millisecond)) {
			return false;
		}
		if ((org.jfree.data.time.Millisecond.this.second) != (that.second)) {
			return false;
		}
		if ((org.jfree.data.time.Millisecond.this.minute) != (that.minute)) {
			return false;
		}
		if ((org.jfree.data.time.Millisecond.this.hour) != (that.hour)) {
			return false;
		}
		if (!(org.jfree.data.time.Millisecond.this.day.equals(that.day))) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		int result = 17;
		result = (37 * result) + (org.jfree.data.time.Millisecond.this.millisecond);
		result = (37 * result) + (getSecond().hashCode());
		return result;
	}

	public int compareTo(java.lang.Object obj) {
		int result;
		long difference;
		if (obj instanceof org.jfree.data.time.Millisecond) {
			org.jfree.data.time.Millisecond ms = ((org.jfree.data.time.Millisecond) (obj));
			difference = (getFirstMillisecond()) - (ms.getFirstMillisecond());
			if (difference > 0) {
				result = 1;
			}else {
				if (difference < 0) {
					result = -1;
				}else {
					result = 0;
				}
			}
		}else
			if (obj instanceof org.jfree.data.time.RegularTimePeriod) {
				result = 0;
			}else {
				result = 1;
			}
		
		return result;
	}

	public long getFirstMillisecond(java.util.Calendar calendar) {
		int year = org.jfree.data.time.Millisecond.this.day.getYear();
		int month = (org.jfree.data.time.Millisecond.this.day.getMonth()) - 1;
		int day = org.jfree.data.time.Millisecond.this.day.getDayOfMonth();
		calendar.clear();
		calendar.set(year, month, day, org.jfree.data.time.Millisecond.this.hour, org.jfree.data.time.Millisecond.this.minute, org.jfree.data.time.Millisecond.this.second);
		calendar.set(java.util.Calendar.MILLISECOND, org.jfree.data.time.Millisecond.this.millisecond);
		return calendar.getTime().getTime();
	}

	public long getLastMillisecond(java.util.Calendar calendar) {
		return getFirstMillisecond(calendar);
	}
}

