

package org.jfree.chart.axis;


public class DateTickUnit extends org.jfree.chart.axis.TickUnit implements java.io.Serializable {
	private static final long serialVersionUID = -7289292157229621901L;

	public static final int YEAR = 0;

	public static final int MONTH = 1;

	public static final int DAY = 2;

	public static final int HOUR = 3;

	public static final int MINUTE = 4;

	public static final int SECOND = 5;

	public static final int MILLISECOND = 6;

	private int unit;

	private int count;

	private int rollUnit;

	private int rollCount;

	private java.text.DateFormat formatter;

	public DateTickUnit(int unit, int count) {
		this(unit, count, null);
	}

	public DateTickUnit(int unit, int count, java.text.DateFormat formatter) {
		this(unit, count, unit, count, formatter);
	}

	public DateTickUnit(int unit, int count, int rollUnit, int rollCount, java.text.DateFormat formatter) {
		super(org.jfree.chart.axis.DateTickUnit.getMillisecondCount(unit, count));
		org.jfree.chart.axis.DateTickUnit.this.unit = unit;
		org.jfree.chart.axis.DateTickUnit.this.count = count;
		org.jfree.chart.axis.DateTickUnit.this.rollUnit = rollUnit;
		org.jfree.chart.axis.DateTickUnit.this.rollCount = rollCount;
		org.jfree.chart.axis.DateTickUnit.this.formatter = formatter;
		if (formatter == null) {
			org.jfree.chart.axis.DateTickUnit.this.formatter = java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT);
		}
	}

	public int getUnit() {
		return org.jfree.chart.axis.DateTickUnit.this.unit;
	}

	public int getCount() {
		return org.jfree.chart.axis.DateTickUnit.this.count;
	}

	public int getRollUnit() {
		return org.jfree.chart.axis.DateTickUnit.this.rollUnit;
	}

	public int getRollCount() {
		return org.jfree.chart.axis.DateTickUnit.this.rollCount;
	}

	public java.lang.String valueToString(double milliseconds) {
		return org.jfree.chart.axis.DateTickUnit.this.formatter.format(new java.util.Date(((long) (milliseconds))));
	}

	public java.lang.String dateToString(java.util.Date date) {
		return org.jfree.chart.axis.DateTickUnit.this.formatter.format(date);
	}

	public java.util.Date addToDate(java.util.Date base) {
		return addToDate(base, java.util.TimeZone.getDefault());
	}

	public java.util.Date addToDate(java.util.Date base, java.util.TimeZone zone) {
		java.util.Calendar calendar = java.util.Calendar.getInstance(zone);
		calendar.setTime(base);
		calendar.add(getCalendarField(org.jfree.chart.axis.DateTickUnit.this.unit), org.jfree.chart.axis.DateTickUnit.this.count);
		return calendar.getTime();
	}

	public java.util.Date rollDate(java.util.Date base) {
		return rollDate(base, java.util.TimeZone.getDefault());
	}

	public java.util.Date rollDate(java.util.Date base, java.util.TimeZone zone) {
		java.util.Calendar calendar = java.util.Calendar.getInstance(zone);
		calendar.setTime(base);
		calendar.add(getCalendarField(org.jfree.chart.axis.DateTickUnit.this.rollUnit), org.jfree.chart.axis.DateTickUnit.this.rollCount);
		return calendar.getTime();
	}

	public int getCalendarField() {
		return getCalendarField(org.jfree.chart.axis.DateTickUnit.this.unit);
	}

	private int getCalendarField(int tickUnit) {
		switch (tickUnit) {
			case org.jfree.chart.axis.DateTickUnit.YEAR :
				return java.util.Calendar.YEAR;
			case org.jfree.chart.axis.DateTickUnit.MONTH :
				return java.util.Calendar.MONTH;
			case org.jfree.chart.axis.DateTickUnit.DAY :
				return java.util.Calendar.DATE;
			case org.jfree.chart.axis.DateTickUnit.HOUR :
				return java.util.Calendar.HOUR_OF_DAY;
			case org.jfree.chart.axis.DateTickUnit.MINUTE :
				return java.util.Calendar.MINUTE;
			case org.jfree.chart.axis.DateTickUnit.SECOND :
				return java.util.Calendar.SECOND;
			case org.jfree.chart.axis.DateTickUnit.MILLISECOND :
				return java.util.Calendar.MILLISECOND;
			default :
				return java.util.Calendar.MILLISECOND;
		}
	}

	private static long getMillisecondCount(int unit, int count) {
		switch (unit) {
			case org.jfree.chart.axis.DateTickUnit.YEAR :
				return ((((365L * 24L) * 60L) * 60L) * 1000L) * count;
			case org.jfree.chart.axis.DateTickUnit.MONTH :
				return ((((31L * 24L) * 60L) * 60L) * 1000L) * count;
			case org.jfree.chart.axis.DateTickUnit.DAY :
				return (((24L * 60L) * 60L) * 1000L) * count;
			case org.jfree.chart.axis.DateTickUnit.HOUR :
				return ((60L * 60L) * 1000L) * count;
			case org.jfree.chart.axis.DateTickUnit.MINUTE :
				return (60L * 1000L) * count;
			case org.jfree.chart.axis.DateTickUnit.SECOND :
				return 1000L * count;
			case org.jfree.chart.axis.DateTickUnit.MILLISECOND :
				return count;
			default :
				throw new java.lang.IllegalArgumentException(("DateTickUnit.getMillisecondCount() : unit must " + ((("be one of the constants YEAR, MONTH, DAY, HOUR, MINUTE, " + "SECOND or MILLISECOND defined in the DateTickUnit ") + "class. Do *not* use the constants defined in ") + "java.util.Calendar.")));
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
		if ((org.jfree.chart.axis.DateTickUnit.this.unit) != (that.unit)) {
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
		result = (37 * result) + (org.jfree.chart.axis.DateTickUnit.this.unit);
		result = (37 * result) + (org.jfree.chart.axis.DateTickUnit.this.count);
		result = (37 * result) + (org.jfree.chart.axis.DateTickUnit.this.formatter.hashCode());
		return result;
	}

	private static final java.lang.String[] units = new java.lang.String[]{ "YEAR" , "MONTH" , "DAY" , "HOUR" , "MINUTE" , "SECOND" , "MILLISECOND" };

	public java.lang.String toString() {
		return ((("DateTickUnit[" + (org.jfree.chart.axis.DateTickUnit.units[org.jfree.chart.axis.DateTickUnit.this.unit])) + ", ") + (org.jfree.chart.axis.DateTickUnit.this.count)) + "]";
	}
}

