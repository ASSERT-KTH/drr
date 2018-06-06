

package org.jfree.chart.axis;


public class DateTickUnit extends org.jfree.chart.axis.TickUnit implements java.io.Serializable {
	private static final long serialVersionUID = -7289292157229621901L;

	private org.jfree.chart.axis.DateTickUnitType unitType;

	private int count;

	private org.jfree.chart.axis.DateTickUnitType rollUnitType;

	private int rollCount;

	private java.text.DateFormat formatter;

	public DateTickUnit(org.jfree.chart.axis.DateTickUnitType unitType, int multiple) {
		this(unitType, multiple, java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT));
	}

	public DateTickUnit(org.jfree.chart.axis.DateTickUnitType unitType, int multiple, java.text.DateFormat formatter) {
		this(unitType, multiple, unitType, multiple, formatter);
	}

	public DateTickUnit(org.jfree.chart.axis.DateTickUnitType unitType, int multiple, org.jfree.chart.axis.DateTickUnitType rollUnitType, int rollMultiple, java.text.DateFormat formatter) {
		super(org.jfree.chart.axis.DateTickUnit.getMillisecondCount(unitType, multiple));
		if (formatter == null) {
			throw new java.lang.IllegalArgumentException("Null 'formatter' argument.");
		}
		if (multiple <= 0) {
			throw new java.lang.IllegalArgumentException("Requires 'multiple' > 0.");
		}
		if (rollMultiple <= 0) {
			throw new java.lang.IllegalArgumentException("Requires 'rollMultiple' > 0.");
		}
		org.jfree.chart.axis.DateTickUnit.this.unitType = unitType;
		org.jfree.chart.axis.DateTickUnit.this.count = multiple;
		org.jfree.chart.axis.DateTickUnit.this.rollUnitType = rollUnitType;
		org.jfree.chart.axis.DateTickUnit.this.rollCount = rollMultiple;
		org.jfree.chart.axis.DateTickUnit.this.formatter = formatter;
	}

	public org.jfree.chart.axis.DateTickUnitType getUnitType() {
		return org.jfree.chart.axis.DateTickUnit.this.unitType;
	}

	public int getMultiple() {
		return org.jfree.chart.axis.DateTickUnit.this.count;
	}

	public org.jfree.chart.axis.DateTickUnitType getRollUnitType() {
		return org.jfree.chart.axis.DateTickUnit.this.rollUnitType;
	}

	public int getRollMultiple() {
		return org.jfree.chart.axis.DateTickUnit.this.rollCount;
	}

	public java.lang.String valueToString(double milliseconds) {
		return org.jfree.chart.axis.DateTickUnit.this.formatter.format(new java.util.Date(((long) (milliseconds))));
	}

	public java.lang.String dateToString(java.util.Date date) {
		return org.jfree.chart.axis.DateTickUnit.this.formatter.format(date);
	}

	public java.util.Date addToDate(java.util.Date base, java.util.TimeZone zone) {
		java.util.Calendar calendar = java.util.Calendar.getInstance(zone);
		calendar.setTime(base);
		calendar.add(org.jfree.chart.axis.DateTickUnit.this.unitType.getCalendarField(), org.jfree.chart.axis.DateTickUnit.this.count);
		return calendar.getTime();
	}

	public java.util.Date rollDate(java.util.Date base) {
		return rollDate(base, java.util.TimeZone.getDefault());
	}

	public java.util.Date rollDate(java.util.Date base, java.util.TimeZone zone) {
		java.util.Calendar calendar = java.util.Calendar.getInstance(zone);
		calendar.setTime(base);
		calendar.add(org.jfree.chart.axis.DateTickUnit.this.rollUnitType.getCalendarField(), org.jfree.chart.axis.DateTickUnit.this.rollCount);
		return calendar.getTime();
	}

	public int getCalendarField() {
		return org.jfree.chart.axis.DateTickUnit.this.unitType.getCalendarField();
	}

	private static long getMillisecondCount(org.jfree.chart.axis.DateTickUnitType unit, int count) {
		if (unit.equals(org.jfree.chart.axis.DateTickUnitType.YEAR)) {
			return ((((365L * 24L) * 60L) * 60L) * 1000L) * count;
		}else
			if (unit.equals(org.jfree.chart.axis.DateTickUnitType.MONTH)) {
				return ((((31L * 24L) * 60L) * 60L) * 1000L) * count;
			}else
				if (unit.equals(org.jfree.chart.axis.DateTickUnitType.DAY)) {
					return (((24L * 60L) * 60L) * 1000L) * count;
				}else
					if (unit.equals(org.jfree.chart.axis.DateTickUnitType.HOUR)) {
						return ((60L * 60L) * 1000L) * count;
					}else
						if (unit.equals(org.jfree.chart.axis.DateTickUnitType.MINUTE)) {
							return (60L * 1000L) * count;
						}else
							if (unit.equals(org.jfree.chart.axis.DateTickUnitType.SECOND)) {
								return 1000L * count;
							}else
								if (unit.equals(org.jfree.chart.axis.DateTickUnitType.MILLISECOND)) {
									return count;
								}else {
									throw new java.lang.IllegalArgumentException(("The 'unit' argument has a " + "value that is not recognised."));
								}
							
						
					
				
			
		
	}

	private static java.text.DateFormat notNull(java.text.DateFormat formatter) {
		if (formatter == null) {
			return java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT);
		}else {
			return formatter;
		}
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.axis.DateTickUnit.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.axis.DateTickUnit)) {
			return false;
		}
		if (!(super.equals(obj))) {
			return false;
		}
		org.jfree.chart.axis.DateTickUnit that = ((org.jfree.chart.axis.DateTickUnit) (obj));
		if (!(org.jfree.chart.axis.DateTickUnit.this.unitType.equals(that.unitType))) {
			return false;
		}
		if ((org.jfree.chart.axis.DateTickUnit.this.count) != (that.count)) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.axis.DateTickUnit.this.formatter, that.formatter))) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		int result = 19;
		result = (37 * result) + (org.jfree.chart.axis.DateTickUnit.this.unitType.hashCode());
		result = (37 * result) + (org.jfree.chart.axis.DateTickUnit.this.count);
		result = (37 * result) + (org.jfree.chart.axis.DateTickUnit.this.formatter.hashCode());
		return result;
	}

	public java.lang.String toString() {
		return ((("DateTickUnit[" + (org.jfree.chart.axis.DateTickUnit.this.unitType.toString())) + ", ") + (org.jfree.chart.axis.DateTickUnit.this.count)) + "]";
	}
}

