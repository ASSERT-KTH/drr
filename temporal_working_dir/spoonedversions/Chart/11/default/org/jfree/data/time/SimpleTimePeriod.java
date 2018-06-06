

package org.jfree.data.time;


public class SimpleTimePeriod implements java.io.Serializable , java.lang.Comparable , org.jfree.data.time.TimePeriod {
	private static final long serialVersionUID = 8684672361131829554L;

	private java.util.Date start;

	private java.util.Date end;

	public SimpleTimePeriod(long start, long end) {
		this(new java.util.Date(start), new java.util.Date(end));
	}

	public SimpleTimePeriod(java.util.Date start, java.util.Date end) {
		if ((start.getTime()) > (end.getTime())) {
			throw new java.lang.IllegalArgumentException("Requires end >= start.");
		}
		org.jfree.data.time.SimpleTimePeriod.this.start = start;
		org.jfree.data.time.SimpleTimePeriod.this.end = end;
	}

	public java.util.Date getStart() {
		return org.jfree.data.time.SimpleTimePeriod.this.start;
	}

	public java.util.Date getEnd() {
		return org.jfree.data.time.SimpleTimePeriod.this.end;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.data.time.SimpleTimePeriod.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.data.time.TimePeriod)) {
			return false;
		}
		org.jfree.data.time.TimePeriod that = ((org.jfree.data.time.TimePeriod) (obj));
		if (!(org.jfree.data.time.SimpleTimePeriod.this.start.equals(that.getStart()))) {
			return false;
		}
		if (!(org.jfree.data.time.SimpleTimePeriod.this.end.equals(that.getEnd()))) {
			return false;
		}
		return true;
	}

	public int compareTo(java.lang.Object obj) {
		org.jfree.data.time.TimePeriod that = ((org.jfree.data.time.TimePeriod) (obj));
		long t0 = getStart().getTime();
		long t1 = getEnd().getTime();
		long m0 = t0 + ((t1 - t0) / 2L);
		long t2 = that.getStart().getTime();
		long t3 = that.getEnd().getTime();
		long m1 = t2 + ((t3 - t2) / 2L);
		if (m0 < m1) {
			return -1;
		}else
			if (m0 > m1) {
				return 1;
			}else {
				if (t0 < t2) {
					return -1;
				}else
					if (t0 > t2) {
						return 1;
					}else {
						if (t1 < t3) {
							return -1;
						}else
							if (t1 > t3) {
								return 1;
							}else {
								return 0;
							}
						
					}
				
			}
		
	}

	public int hashCode() {
		int result = 17;
		result = (37 * result) + (org.jfree.data.time.SimpleTimePeriod.this.start.hashCode());
		result = (37 * result) + (org.jfree.data.time.SimpleTimePeriod.this.end.hashCode());
		return result;
	}
}

