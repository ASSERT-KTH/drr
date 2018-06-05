

package org.jfree.data.time;


public final class TimePeriodAnchor implements java.io.Serializable {
	private static final long serialVersionUID = 2011955697457548862L;

	public static final org.jfree.data.time.TimePeriodAnchor START = new org.jfree.data.time.TimePeriodAnchor("TimePeriodAnchor.START");

	public static final org.jfree.data.time.TimePeriodAnchor MIDDLE = new org.jfree.data.time.TimePeriodAnchor("TimePeriodAnchor.MIDDLE");

	public static final org.jfree.data.time.TimePeriodAnchor END = new org.jfree.data.time.TimePeriodAnchor("TimePeriodAnchor.END");

	private java.lang.String name;

	private TimePeriodAnchor(java.lang.String name) {
		org.jfree.data.time.TimePeriodAnchor.this.name = name;
	}

	public java.lang.String toString() {
		return org.jfree.data.time.TimePeriodAnchor.this.name;
	}

	public boolean equals(java.lang.Object obj) {
		if ((org.jfree.data.time.TimePeriodAnchor.this) == obj) {
			return true;
		}
		if (!(obj instanceof org.jfree.data.time.TimePeriodAnchor)) {
			return false;
		}
		org.jfree.data.time.TimePeriodAnchor position = ((org.jfree.data.time.TimePeriodAnchor) (obj));
		if (!(org.jfree.data.time.TimePeriodAnchor.this.name.equals(position.name))) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		return org.jfree.data.time.TimePeriodAnchor.this.name.hashCode();
	}

	private java.lang.Object readResolve() throws java.io.ObjectStreamException {
		if (org.jfree.data.time.TimePeriodAnchor.this.equals(org.jfree.data.time.TimePeriodAnchor.START)) {
			return org.jfree.data.time.TimePeriodAnchor.START;
		}else
			if (org.jfree.data.time.TimePeriodAnchor.this.equals(org.jfree.data.time.TimePeriodAnchor.MIDDLE)) {
				return org.jfree.data.time.TimePeriodAnchor.MIDDLE;
			}else
				if (org.jfree.data.time.TimePeriodAnchor.this.equals(org.jfree.data.time.TimePeriodAnchor.END)) {
					return org.jfree.data.time.TimePeriodAnchor.END;
				}
			
		
		return null;
	}
}

