

package org.jfree.chart.axis;


public class DateTickUnitType implements java.io.Serializable {
	public static final org.jfree.chart.axis.DateTickUnitType YEAR = new org.jfree.chart.axis.DateTickUnitType("DateTickUnitType.YEAR", java.util.Calendar.YEAR);

	public static final org.jfree.chart.axis.DateTickUnitType MONTH = new org.jfree.chart.axis.DateTickUnitType("DateTickUnitType.MONTH", java.util.Calendar.MONTH);

	public static final org.jfree.chart.axis.DateTickUnitType DAY = new org.jfree.chart.axis.DateTickUnitType("DateTickUnitType.DAY", java.util.Calendar.DATE);

	public static final org.jfree.chart.axis.DateTickUnitType HOUR = new org.jfree.chart.axis.DateTickUnitType("DateTickUnitType.HOUR", java.util.Calendar.HOUR_OF_DAY);

	public static final org.jfree.chart.axis.DateTickUnitType MINUTE = new org.jfree.chart.axis.DateTickUnitType("DateTickUnitType.MINUTE", java.util.Calendar.MINUTE);

	public static final org.jfree.chart.axis.DateTickUnitType SECOND = new org.jfree.chart.axis.DateTickUnitType("DateTickUnitType.SECOND", java.util.Calendar.SECOND);

	public static final org.jfree.chart.axis.DateTickUnitType MILLISECOND = new org.jfree.chart.axis.DateTickUnitType("DateTickUnitType.MILLISECOND", java.util.Calendar.MILLISECOND);

	private java.lang.String name;

	private int calendarField;

	private DateTickUnitType(java.lang.String name, int calendarField) {
		org.jfree.chart.axis.DateTickUnitType.this.name = name;
		org.jfree.chart.axis.DateTickUnitType.this.calendarField = calendarField;
	}

	public int getCalendarField() {
		return org.jfree.chart.axis.DateTickUnitType.this.calendarField;
	}

	public java.lang.String toString() {
		return org.jfree.chart.axis.DateTickUnitType.this.name;
	}

	public boolean equals(java.lang.Object obj) {
		if ((org.jfree.chart.axis.DateTickUnitType.this) == obj) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.axis.DateTickUnitType)) {
			return false;
		}
		org.jfree.chart.axis.DateTickUnitType t = ((org.jfree.chart.axis.DateTickUnitType) (obj));
		if (!(org.jfree.chart.axis.DateTickUnitType.this.name.equals(t.toString()))) {
			return false;
		}
		return true;
	}

	private java.lang.Object readResolve() throws java.io.ObjectStreamException {
		if (org.jfree.chart.axis.DateTickUnitType.this.equals(org.jfree.chart.axis.DateTickUnitType.YEAR)) {
			return org.jfree.chart.axis.DateTickUnitType.YEAR;
		}else
			if (org.jfree.chart.axis.DateTickUnitType.this.equals(org.jfree.chart.axis.DateTickUnitType.MONTH)) {
				return org.jfree.chart.axis.DateTickUnitType.MONTH;
			}else
				if (org.jfree.chart.axis.DateTickUnitType.this.equals(org.jfree.chart.axis.DateTickUnitType.DAY)) {
					return org.jfree.chart.axis.DateTickUnitType.DAY;
				}else
					if (org.jfree.chart.axis.DateTickUnitType.this.equals(org.jfree.chart.axis.DateTickUnitType.HOUR)) {
						return org.jfree.chart.axis.DateTickUnitType.HOUR;
					}else
						if (org.jfree.chart.axis.DateTickUnitType.this.equals(org.jfree.chart.axis.DateTickUnitType.MINUTE)) {
							return org.jfree.chart.axis.DateTickUnitType.MINUTE;
						}else
							if (org.jfree.chart.axis.DateTickUnitType.this.equals(org.jfree.chart.axis.DateTickUnitType.SECOND)) {
								return org.jfree.chart.axis.DateTickUnitType.SECOND;
							}else
								if (org.jfree.chart.axis.DateTickUnitType.this.equals(org.jfree.chart.axis.DateTickUnitType.MILLISECOND)) {
									return org.jfree.chart.axis.DateTickUnitType.MILLISECOND;
								}
							
						
					
				
			
		
		return null;
	}
}

