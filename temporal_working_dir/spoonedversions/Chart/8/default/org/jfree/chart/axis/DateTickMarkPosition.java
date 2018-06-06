

package org.jfree.chart.axis;


public final class DateTickMarkPosition implements java.io.Serializable {
	private static final long serialVersionUID = 2540750672764537240L;

	public static final org.jfree.chart.axis.DateTickMarkPosition START = new org.jfree.chart.axis.DateTickMarkPosition("DateTickMarkPosition.START");

	public static final org.jfree.chart.axis.DateTickMarkPosition MIDDLE = new org.jfree.chart.axis.DateTickMarkPosition("DateTickMarkPosition.MIDDLE");

	public static final org.jfree.chart.axis.DateTickMarkPosition END = new org.jfree.chart.axis.DateTickMarkPosition("DateTickMarkPosition.END");

	private java.lang.String name;

	private DateTickMarkPosition(java.lang.String name) {
		org.jfree.chart.axis.DateTickMarkPosition.this.name = name;
	}

	public java.lang.String toString() {
		return org.jfree.chart.axis.DateTickMarkPosition.this.name;
	}

	public boolean equals(java.lang.Object obj) {
		if ((org.jfree.chart.axis.DateTickMarkPosition.this) == obj) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.axis.DateTickMarkPosition)) {
			return false;
		}
		org.jfree.chart.axis.DateTickMarkPosition position = ((org.jfree.chart.axis.DateTickMarkPosition) (obj));
		if (!(org.jfree.chart.axis.DateTickMarkPosition.this.name.equals(position.toString()))) {
			return false;
		}
		return true;
	}

	private java.lang.Object readResolve() throws java.io.ObjectStreamException {
		if (org.jfree.chart.axis.DateTickMarkPosition.this.equals(org.jfree.chart.axis.DateTickMarkPosition.START)) {
			return org.jfree.chart.axis.DateTickMarkPosition.START;
		}else
			if (org.jfree.chart.axis.DateTickMarkPosition.this.equals(org.jfree.chart.axis.DateTickMarkPosition.MIDDLE)) {
				return org.jfree.chart.axis.DateTickMarkPosition.MIDDLE;
			}else
				if (org.jfree.chart.axis.DateTickMarkPosition.this.equals(org.jfree.chart.axis.DateTickMarkPosition.END)) {
					return org.jfree.chart.axis.DateTickMarkPosition.END;
				}
			
		
		return null;
	}
}

