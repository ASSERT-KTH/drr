

package org.jfree.data.time;


public class FixedMillisecond extends org.jfree.data.time.RegularTimePeriod implements java.io.Serializable {
	private static final long serialVersionUID = 7867521484545646931L;

	private long time;

	public FixedMillisecond() {
		this(new java.util.Date());
	}

	public FixedMillisecond(long millisecond) {
		this(new java.util.Date(millisecond));
	}

	public FixedMillisecond(java.util.Date time) {
		org.jfree.data.time.FixedMillisecond.this.time = time.getTime();
	}

	public java.util.Date getTime() {
		return new java.util.Date(org.jfree.data.time.FixedMillisecond.this.time);
	}

	public void peg(java.util.Calendar calendar) {
	}

	public org.jfree.data.time.RegularTimePeriod previous() {
		org.jfree.data.time.RegularTimePeriod result = null;
		long t = org.jfree.data.time.FixedMillisecond.this.time;
		if (t != (java.lang.Long.MIN_VALUE)) {
			result = new org.jfree.data.time.FixedMillisecond((t - 1));
		}
		return result;
	}

	public org.jfree.data.time.RegularTimePeriod next() {
		org.jfree.data.time.RegularTimePeriod result = null;
		long t = org.jfree.data.time.FixedMillisecond.this.time;
		if (t != (java.lang.Long.MAX_VALUE)) {
			result = new org.jfree.data.time.FixedMillisecond((t + 1));
		}
		return result;
	}

	public boolean equals(java.lang.Object object) {
		if (object instanceof org.jfree.data.time.FixedMillisecond) {
			org.jfree.data.time.FixedMillisecond m = ((org.jfree.data.time.FixedMillisecond) (object));
			return (org.jfree.data.time.FixedMillisecond.this.time) == (m.getFirstMillisecond());
		}else {
			return false;
		}
	}

	public int hashCode() {
		return ((int) (org.jfree.data.time.FixedMillisecond.this.time));
	}

	public int compareTo(java.lang.Object o1) {
		int result;
		long difference;
		if (o1 instanceof org.jfree.data.time.FixedMillisecond) {
			org.jfree.data.time.FixedMillisecond t1 = ((org.jfree.data.time.FixedMillisecond) (o1));
			difference = (org.jfree.data.time.FixedMillisecond.this.time) - (t1.time);
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
			if (o1 instanceof org.jfree.data.time.RegularTimePeriod) {
				result = 0;
			}else {
				result = 1;
			}
		
		return result;
	}

	public long getFirstMillisecond() {
		return org.jfree.data.time.FixedMillisecond.this.time;
	}

	public long getFirstMillisecond(java.util.Calendar calendar) {
		return org.jfree.data.time.FixedMillisecond.this.time;
	}

	public long getLastMillisecond() {
		return org.jfree.data.time.FixedMillisecond.this.time;
	}

	public long getLastMillisecond(java.util.Calendar calendar) {
		return org.jfree.data.time.FixedMillisecond.this.time;
	}

	public long getMiddleMillisecond() {
		return org.jfree.data.time.FixedMillisecond.this.time;
	}

	public long getMiddleMillisecond(java.util.Calendar calendar) {
		return org.jfree.data.time.FixedMillisecond.this.time;
	}

	public long getSerialIndex() {
		return org.jfree.data.time.FixedMillisecond.this.time;
	}
}

