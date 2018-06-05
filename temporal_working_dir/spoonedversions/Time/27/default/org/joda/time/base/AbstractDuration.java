

package org.joda.time.base;


public abstract class AbstractDuration implements org.joda.time.ReadableDuration {
	protected AbstractDuration() {
		super();
	}

	public org.joda.time.Duration toDuration() {
		return new org.joda.time.Duration(getMillis());
	}

	public org.joda.time.Period toPeriod() {
		return new org.joda.time.Period(getMillis());
	}

	public int compareTo(org.joda.time.ReadableDuration other) {
		long thisMillis = org.joda.time.base.AbstractDuration.this.getMillis();
		long otherMillis = other.getMillis();
		if (thisMillis < otherMillis) {
			return -1;
		}
		if (thisMillis > otherMillis) {
			return 1;
		}
		return 0;
	}

	public boolean isEqual(org.joda.time.ReadableDuration duration) {
		if (duration == null) {
			duration = org.joda.time.Duration.ZERO;
		}
		return (compareTo(duration)) == 0;
	}

	public boolean isLongerThan(org.joda.time.ReadableDuration duration) {
		if (duration == null) {
			duration = org.joda.time.Duration.ZERO;
		}
		return (compareTo(duration)) > 0;
	}

	public boolean isShorterThan(org.joda.time.ReadableDuration duration) {
		if (duration == null) {
			duration = org.joda.time.Duration.ZERO;
		}
		return (compareTo(duration)) < 0;
	}

	public boolean equals(java.lang.Object duration) {
		if ((org.joda.time.base.AbstractDuration.this) == duration) {
			return true;
		}
		if ((duration instanceof org.joda.time.ReadableDuration) == false) {
			return false;
		}
		org.joda.time.ReadableDuration other = ((org.joda.time.ReadableDuration) (duration));
		return (getMillis()) == (other.getMillis());
	}

	public int hashCode() {
		long len = getMillis();
		return ((int) (len ^ (len >>> 32)));
	}

	public java.lang.String toString() {
		long millis = getMillis();
		java.lang.StringBuffer buf = new java.lang.StringBuffer();
		buf.append("PT");
		boolean negative = millis < 0;
		org.joda.time.format.FormatUtils.appendUnpaddedInteger(buf, millis);
		while ((buf.length()) < (negative ? 7 : 6)) {
			buf.insert((negative ? 3 : 2), "0");
		} 
		if (((millis / 1000) * 1000) == millis) {
			buf.setLength(((buf.length()) - 3));
		}else {
			buf.insert(((buf.length()) - 3), ".");
		}
		buf.append('S');
		return buf.toString();
	}
}

