

package org.jfree.chart.axis;


public class QuarterDateFormat extends java.text.DateFormat implements java.io.Serializable , java.lang.Cloneable {
	private static final long serialVersionUID = -6738465248529797176L;

	public static final java.lang.String[] REGULAR_QUARTERS = new java.lang.String[]{ "1" , "2" , "3" , "4" };

	public static final java.lang.String[] ROMAN_QUARTERS = new java.lang.String[]{ "I" , "II" , "III" , "IV" };

	public static final java.lang.String[] GREEK_QUARTERS = new java.lang.String[]{ "\u0391" , "\u0392" , "\u0393" , "\u0394" };

	private java.lang.String[] quarters = org.jfree.chart.axis.QuarterDateFormat.REGULAR_QUARTERS;

	private boolean quarterFirst;

	public QuarterDateFormat() {
		this(java.util.TimeZone.getDefault());
	}

	public QuarterDateFormat(java.util.TimeZone zone) {
		this(zone, org.jfree.chart.axis.QuarterDateFormat.REGULAR_QUARTERS);
	}

	public QuarterDateFormat(java.util.TimeZone zone, java.lang.String[] quarterSymbols) {
		this(zone, quarterSymbols, false);
	}

	public QuarterDateFormat(java.util.TimeZone zone, java.lang.String[] quarterSymbols, boolean quarterFirst) {
		if (zone == null) {
			throw new java.lang.IllegalArgumentException("Null 'zone' argument.");
		}
		this.calendar = new java.util.GregorianCalendar(zone);
		org.jfree.chart.axis.QuarterDateFormat.this.quarters = quarterSymbols;
		org.jfree.chart.axis.QuarterDateFormat.this.quarterFirst = quarterFirst;
		this.numberFormat = java.text.NumberFormat.getNumberInstance();
	}

	public java.lang.StringBuffer format(java.util.Date date, java.lang.StringBuffer toAppendTo, java.text.FieldPosition fieldPosition) {
		org.jfree.chart.axis.QuarterDateFormat.this.calendar.setTime(date);
		int year = org.jfree.chart.axis.QuarterDateFormat.this.calendar.get(java.util.Calendar.YEAR);
		int month = org.jfree.chart.axis.QuarterDateFormat.this.calendar.get(java.util.Calendar.MONTH);
		int quarter = month / 3;
		if (org.jfree.chart.axis.QuarterDateFormat.this.quarterFirst) {
			toAppendTo.append(org.jfree.chart.axis.QuarterDateFormat.this.quarters[quarter]);
			toAppendTo.append(" ");
			toAppendTo.append(year);
		}else {
			toAppendTo.append(year);
			toAppendTo.append(" ");
			toAppendTo.append(org.jfree.chart.axis.QuarterDateFormat.this.quarters[quarter]);
		}
		return toAppendTo;
	}

	public java.util.Date parse(java.lang.String source, java.text.ParsePosition pos) {
		return null;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.axis.QuarterDateFormat.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.axis.QuarterDateFormat)) {
			return false;
		}
		org.jfree.chart.axis.QuarterDateFormat that = ((org.jfree.chart.axis.QuarterDateFormat) (obj));
		if (!(java.util.Arrays.equals(org.jfree.chart.axis.QuarterDateFormat.this.quarters, that.quarters))) {
			return false;
		}
		if ((org.jfree.chart.axis.QuarterDateFormat.this.quarterFirst) != (that.quarterFirst)) {
			return false;
		}
		return super.equals(obj);
	}
}

