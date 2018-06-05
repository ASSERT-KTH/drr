

package org.jfree.chart.util;


public class RelativeDateFormat extends java.text.DateFormat {
	private long baseMillis;

	private boolean showZeroDays;

	private java.text.NumberFormat dayFormatter;

	private java.lang.String daySuffix;

	private java.lang.String hourSuffix;

	private java.lang.String minuteSuffix;

	private java.text.NumberFormat secondFormatter;

	private java.lang.String secondSuffix;

	private static long MILLISECONDS_IN_ONE_HOUR = (60 * 60) * 1000L;

	private static long MILLISECONDS_IN_ONE_DAY = 24 * (org.jfree.chart.util.RelativeDateFormat.MILLISECONDS_IN_ONE_HOUR);

	public RelativeDateFormat() {
		this(0L);
	}

	public RelativeDateFormat(java.util.Date time) {
		this(time.getTime());
	}

	public RelativeDateFormat(long baseMillis) {
		super();
		org.jfree.chart.util.RelativeDateFormat.this.baseMillis = baseMillis;
		org.jfree.chart.util.RelativeDateFormat.this.showZeroDays = false;
		org.jfree.chart.util.RelativeDateFormat.this.dayFormatter = java.text.NumberFormat.getInstance();
		org.jfree.chart.util.RelativeDateFormat.this.daySuffix = "d";
		org.jfree.chart.util.RelativeDateFormat.this.hourSuffix = "h";
		org.jfree.chart.util.RelativeDateFormat.this.minuteSuffix = "m";
		org.jfree.chart.util.RelativeDateFormat.this.secondFormatter = java.text.NumberFormat.getNumberInstance();
		org.jfree.chart.util.RelativeDateFormat.this.secondFormatter.setMaximumFractionDigits(3);
		org.jfree.chart.util.RelativeDateFormat.this.secondFormatter.setMinimumFractionDigits(3);
		org.jfree.chart.util.RelativeDateFormat.this.secondSuffix = "s";
		this.calendar = new java.util.GregorianCalendar();
		this.numberFormat = new java.text.DecimalFormat("0");
	}

	public long getBaseMillis() {
		return org.jfree.chart.util.RelativeDateFormat.this.baseMillis;
	}

	public void setBaseMillis(long baseMillis) {
		org.jfree.chart.util.RelativeDateFormat.this.baseMillis = baseMillis;
	}

	public boolean getShowZeroDays() {
		return org.jfree.chart.util.RelativeDateFormat.this.showZeroDays;
	}

	public void setShowZeroDays(boolean show) {
		org.jfree.chart.util.RelativeDateFormat.this.showZeroDays = show;
	}

	public java.lang.String getDaySuffix() {
		return org.jfree.chart.util.RelativeDateFormat.this.daySuffix;
	}

	public void setDaySuffix(java.lang.String suffix) {
		if (suffix == null) {
			throw new java.lang.IllegalArgumentException("Null 'suffix' argument.");
		}
		org.jfree.chart.util.RelativeDateFormat.this.daySuffix = suffix;
	}

	public java.lang.String getHourSuffix() {
		return org.jfree.chart.util.RelativeDateFormat.this.hourSuffix;
	}

	public void setHourSuffix(java.lang.String suffix) {
		if (suffix == null) {
			throw new java.lang.IllegalArgumentException("Null 'suffix' argument.");
		}
		org.jfree.chart.util.RelativeDateFormat.this.hourSuffix = suffix;
	}

	public java.lang.String getMinuteSuffix() {
		return org.jfree.chart.util.RelativeDateFormat.this.minuteSuffix;
	}

	public void setMinuteSuffix(java.lang.String suffix) {
		if (suffix == null) {
			throw new java.lang.IllegalArgumentException("Null 'suffix' argument.");
		}
		org.jfree.chart.util.RelativeDateFormat.this.minuteSuffix = suffix;
	}

	public java.lang.String getSecondSuffix() {
		return org.jfree.chart.util.RelativeDateFormat.this.secondSuffix;
	}

	public void setSecondSuffix(java.lang.String suffix) {
		if (suffix == null) {
			throw new java.lang.IllegalArgumentException("Null 'suffix' argument.");
		}
		org.jfree.chart.util.RelativeDateFormat.this.secondSuffix = suffix;
	}

	public void setSecondFormatter(java.text.NumberFormat formatter) {
		if (formatter == null) {
			throw new java.lang.IllegalArgumentException("Null 'formatter' argument.");
		}
		org.jfree.chart.util.RelativeDateFormat.this.secondFormatter = formatter;
	}

	public java.lang.StringBuffer format(java.util.Date date, java.lang.StringBuffer toAppendTo, java.text.FieldPosition fieldPosition) {
		long currentMillis = date.getTime();
		long elapsed = currentMillis - (org.jfree.chart.util.RelativeDateFormat.this.baseMillis);
		long days = elapsed / (org.jfree.chart.util.RelativeDateFormat.MILLISECONDS_IN_ONE_DAY);
		elapsed = elapsed - (days * (org.jfree.chart.util.RelativeDateFormat.MILLISECONDS_IN_ONE_DAY));
		long hours = elapsed / (org.jfree.chart.util.RelativeDateFormat.MILLISECONDS_IN_ONE_HOUR);
		elapsed = elapsed - (hours * (org.jfree.chart.util.RelativeDateFormat.MILLISECONDS_IN_ONE_HOUR));
		long minutes = elapsed / 60000L;
		elapsed = elapsed - (minutes * 60000L);
		double seconds = elapsed / 1000.0;
		if ((days != 0) || (org.jfree.chart.util.RelativeDateFormat.this.showZeroDays)) {
			toAppendTo.append(((org.jfree.chart.util.RelativeDateFormat.this.dayFormatter.format(days)) + (getDaySuffix())));
		}
		toAppendTo.append(((java.lang.String.valueOf(hours)) + (getHourSuffix())));
		toAppendTo.append(((java.lang.String.valueOf(minutes)) + (getMinuteSuffix())));
		toAppendTo.append(((org.jfree.chart.util.RelativeDateFormat.this.secondFormatter.format(seconds)) + (getSecondSuffix())));
		return toAppendTo;
	}

	public java.util.Date parse(java.lang.String source, java.text.ParsePosition pos) {
		return null;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.util.RelativeDateFormat.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.util.RelativeDateFormat)) {
			return false;
		}
		if (!(super.equals(obj))) {
			return false;
		}
		org.jfree.chart.util.RelativeDateFormat that = ((org.jfree.chart.util.RelativeDateFormat) (obj));
		if ((org.jfree.chart.util.RelativeDateFormat.this.baseMillis) != (that.baseMillis)) {
			return false;
		}
		if ((org.jfree.chart.util.RelativeDateFormat.this.showZeroDays) != (that.showZeroDays)) {
			return false;
		}
		if (!(org.jfree.chart.util.RelativeDateFormat.this.daySuffix.equals(that.daySuffix))) {
			return false;
		}
		if (!(org.jfree.chart.util.RelativeDateFormat.this.hourSuffix.equals(that.hourSuffix))) {
			return false;
		}
		if (!(org.jfree.chart.util.RelativeDateFormat.this.minuteSuffix.equals(that.minuteSuffix))) {
			return false;
		}
		if (!(org.jfree.chart.util.RelativeDateFormat.this.secondSuffix.equals(that.secondSuffix))) {
			return false;
		}
		if (!(org.jfree.chart.util.RelativeDateFormat.this.secondFormatter.equals(that.secondFormatter))) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		int result = 193;
		result = (37 * result) + ((int) ((org.jfree.chart.util.RelativeDateFormat.this.baseMillis) ^ ((org.jfree.chart.util.RelativeDateFormat.this.baseMillis) >>> 32)));
		result = (37 * result) + (org.jfree.chart.util.RelativeDateFormat.this.daySuffix.hashCode());
		result = (37 * result) + (org.jfree.chart.util.RelativeDateFormat.this.hourSuffix.hashCode());
		result = (37 * result) + (org.jfree.chart.util.RelativeDateFormat.this.minuteSuffix.hashCode());
		result = (37 * result) + (org.jfree.chart.util.RelativeDateFormat.this.secondSuffix.hashCode());
		result = (37 * result) + (org.jfree.chart.util.RelativeDateFormat.this.secondFormatter.hashCode());
		return result;
	}

	public java.lang.Object clone() {
		org.jfree.chart.util.RelativeDateFormat clone = ((org.jfree.chart.util.RelativeDateFormat) (super.clone()));
		clone.dayFormatter = ((java.text.NumberFormat) (org.jfree.chart.util.RelativeDateFormat.this.dayFormatter.clone()));
		clone.secondFormatter = ((java.text.NumberFormat) (org.jfree.chart.util.RelativeDateFormat.this.secondFormatter.clone()));
		return clone;
	}

	public static void main(java.lang.String[] args) {
		java.util.GregorianCalendar c0 = new java.util.GregorianCalendar(2006, 10, 1, 0, 0, 0);
		java.util.GregorianCalendar c1 = new java.util.GregorianCalendar(2006, 10, 1, 11, 37, 43);
		c1.set(java.util.Calendar.MILLISECOND, 123);
		java.lang.System.out.println("Default: ");
		org.jfree.chart.util.RelativeDateFormat rdf = new org.jfree.chart.util.RelativeDateFormat(c0.getTimeInMillis());
		java.lang.System.out.println(rdf.format(c1.getTime()));
		java.lang.System.out.println();
		java.lang.System.out.println("Hide milliseconds: ");
		rdf.setSecondFormatter(new java.text.DecimalFormat("0"));
		java.lang.System.out.println(rdf.format(c1.getTime()));
		java.lang.System.out.println();
		java.lang.System.out.println("Show zero day output: ");
		rdf.setShowZeroDays(true);
		java.lang.System.out.println(rdf.format(c1.getTime()));
		java.lang.System.out.println();
		java.lang.System.out.println("Alternative suffixes: ");
		rdf.setShowZeroDays(false);
		rdf.setDaySuffix(":");
		rdf.setHourSuffix(":");
		rdf.setMinuteSuffix(":");
		rdf.setSecondSuffix("");
		java.lang.System.out.println(rdf.format(c1.getTime()));
		java.lang.System.out.println();
	}
}

