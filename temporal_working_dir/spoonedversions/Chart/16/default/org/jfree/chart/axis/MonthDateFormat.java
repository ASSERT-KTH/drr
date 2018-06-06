

package org.jfree.chart.axis;


public class MonthDateFormat extends java.text.DateFormat {
	private java.lang.String[] months;

	private boolean[] showYear;

	private java.text.DateFormat yearFormatter;

	public MonthDateFormat() {
		this(java.util.TimeZone.getDefault());
	}

	public MonthDateFormat(java.util.TimeZone zone) {
		this(zone, java.util.Locale.getDefault(), 1, true, false);
	}

	public MonthDateFormat(java.util.Locale locale) {
		this(java.util.TimeZone.getDefault(), locale, 1, true, false);
	}

	public MonthDateFormat(java.util.TimeZone zone, int chars) {
		this(zone, java.util.Locale.getDefault(), chars, true, false);
	}

	public MonthDateFormat(java.util.Locale locale, int chars) {
		this(java.util.TimeZone.getDefault(), locale, chars, true, false);
	}

	public MonthDateFormat(java.util.TimeZone zone, java.util.Locale locale, int chars, boolean showYearForJan, boolean showYearForDec) {
		this(zone, locale, chars, new boolean[]{ showYearForJan , false , false , false , false , false , false , false , false , false , false , false , showYearForDec }, new java.text.SimpleDateFormat("yy"));
	}

	public MonthDateFormat(java.util.TimeZone zone, java.util.Locale locale, int chars, boolean[] showYear, java.text.DateFormat yearFormatter) {
		if (locale == null) {
			throw new java.lang.IllegalArgumentException("Null 'locale' argument.");
		}
		java.text.DateFormatSymbols dfs = new java.text.DateFormatSymbols(locale);
		java.lang.String[] monthsFromLocale = dfs.getMonths();
		org.jfree.chart.axis.MonthDateFormat.this.months = new java.lang.String[12];
		for (int i = 0; i < 12; i++) {
			if (chars > 0) {
				org.jfree.chart.axis.MonthDateFormat.this.months[i] = monthsFromLocale[i].substring(0, java.lang.Math.min(chars, monthsFromLocale[i].length()));
			}else {
				org.jfree.chart.axis.MonthDateFormat.this.months[i] = monthsFromLocale[i];
			}
		}
		this.calendar = new java.util.GregorianCalendar(zone);
		org.jfree.chart.axis.MonthDateFormat.this.showYear = showYear;
		org.jfree.chart.axis.MonthDateFormat.this.yearFormatter = yearFormatter;
		this.numberFormat = java.text.NumberFormat.getNumberInstance();
	}

	public java.lang.StringBuffer format(java.util.Date date, java.lang.StringBuffer toAppendTo, java.text.FieldPosition fieldPosition) {
		org.jfree.chart.axis.MonthDateFormat.this.calendar.setTime(date);
		int month = org.jfree.chart.axis.MonthDateFormat.this.calendar.get(java.util.Calendar.MONTH);
		toAppendTo.append(org.jfree.chart.axis.MonthDateFormat.this.months[month]);
		if (org.jfree.chart.axis.MonthDateFormat.this.showYear[month]) {
			toAppendTo.append(org.jfree.chart.axis.MonthDateFormat.this.yearFormatter.format(date));
		}
		return toAppendTo;
	}

	public java.util.Date parse(java.lang.String source, java.text.ParsePosition pos) {
		return null;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.axis.MonthDateFormat.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.axis.MonthDateFormat)) {
			return false;
		}
		if (!(super.equals(obj))) {
			return false;
		}
		org.jfree.chart.axis.MonthDateFormat that = ((org.jfree.chart.axis.MonthDateFormat) (obj));
		if (!(java.util.Arrays.equals(org.jfree.chart.axis.MonthDateFormat.this.months, that.months))) {
			return false;
		}
		if (!(java.util.Arrays.equals(org.jfree.chart.axis.MonthDateFormat.this.showYear, that.showYear))) {
			return false;
		}
		if (!(org.jfree.chart.axis.MonthDateFormat.this.yearFormatter.equals(that.yearFormatter))) {
			return false;
		}
		return true;
	}

	public static void main(java.lang.String[] args) {
		org.jfree.chart.axis.MonthDateFormat mdf = new org.jfree.chart.axis.MonthDateFormat(java.util.Locale.UK, 2);
		java.lang.System.out.println("UK:");
		java.lang.System.out.println(mdf.format(new org.jfree.data.time.Month(1, 2005).getStart()));
		java.lang.System.out.println(mdf.format(new org.jfree.data.time.Month(2, 2005).getStart()));
		java.lang.System.out.println(mdf.format(new org.jfree.data.time.Month(3, 2005).getStart()));
		java.lang.System.out.println(mdf.format(new org.jfree.data.time.Month(4, 2005).getStart()));
		java.lang.System.out.println(mdf.format(new org.jfree.data.time.Month(5, 2005).getStart()));
		java.lang.System.out.println(mdf.format(new org.jfree.data.time.Month(6, 2005).getStart()));
		java.lang.System.out.println(mdf.format(new org.jfree.data.time.Month(7, 2005).getStart()));
		java.lang.System.out.println(mdf.format(new org.jfree.data.time.Month(8, 2005).getStart()));
		java.lang.System.out.println(mdf.format(new org.jfree.data.time.Month(9, 2005).getStart()));
		java.lang.System.out.println(mdf.format(new org.jfree.data.time.Month(10, 2005).getStart()));
		java.lang.System.out.println(mdf.format(new org.jfree.data.time.Month(11, 2005).getStart()));
		java.lang.System.out.println(mdf.format(new org.jfree.data.time.Month(12, 2005).getStart()));
		java.lang.System.out.println();
		mdf = new org.jfree.chart.axis.MonthDateFormat(java.util.Locale.GERMANY, 2);
		java.lang.System.out.println("GERMANY:");
		java.lang.System.out.println(mdf.format(new org.jfree.data.time.Month(1, 2005).getStart()));
		java.lang.System.out.println(mdf.format(new org.jfree.data.time.Month(2, 2005).getStart()));
		java.lang.System.out.println(mdf.format(new org.jfree.data.time.Month(3, 2005).getStart()));
		java.lang.System.out.println(mdf.format(new org.jfree.data.time.Month(4, 2005).getStart()));
		java.lang.System.out.println(mdf.format(new org.jfree.data.time.Month(5, 2005).getStart()));
		java.lang.System.out.println(mdf.format(new org.jfree.data.time.Month(6, 2005).getStart()));
		java.lang.System.out.println(mdf.format(new org.jfree.data.time.Month(7, 2005).getStart()));
		java.lang.System.out.println(mdf.format(new org.jfree.data.time.Month(8, 2005).getStart()));
		java.lang.System.out.println(mdf.format(new org.jfree.data.time.Month(9, 2005).getStart()));
		java.lang.System.out.println(mdf.format(new org.jfree.data.time.Month(10, 2005).getStart()));
		java.lang.System.out.println(mdf.format(new org.jfree.data.time.Month(11, 2005).getStart()));
		java.lang.System.out.println(mdf.format(new org.jfree.data.time.Month(12, 2005).getStart()));
		java.lang.System.out.println();
		mdf = new org.jfree.chart.axis.MonthDateFormat(java.util.Locale.FRANCE, 2);
		java.lang.System.out.println("FRANCE:");
		java.lang.System.out.println(mdf.format(new org.jfree.data.time.Month(1, 2005).getStart()));
		java.lang.System.out.println(mdf.format(new org.jfree.data.time.Month(2, 2005).getStart()));
		java.lang.System.out.println(mdf.format(new org.jfree.data.time.Month(3, 2005).getStart()));
		java.lang.System.out.println(mdf.format(new org.jfree.data.time.Month(4, 2005).getStart()));
		java.lang.System.out.println(mdf.format(new org.jfree.data.time.Month(5, 2005).getStart()));
		java.lang.System.out.println(mdf.format(new org.jfree.data.time.Month(6, 2005).getStart()));
		java.lang.System.out.println(mdf.format(new org.jfree.data.time.Month(7, 2005).getStart()));
		java.lang.System.out.println(mdf.format(new org.jfree.data.time.Month(8, 2005).getStart()));
		java.lang.System.out.println(mdf.format(new org.jfree.data.time.Month(9, 2005).getStart()));
		java.lang.System.out.println(mdf.format(new org.jfree.data.time.Month(10, 2005).getStart()));
		java.lang.System.out.println(mdf.format(new org.jfree.data.time.Month(11, 2005).getStart()));
		java.lang.System.out.println(mdf.format(new org.jfree.data.time.Month(12, 2005).getStart()));
		java.lang.System.out.println();
		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy");
		sdf.setNumberFormat(null);
		java.lang.System.out.println(sdf.equals("X"));
	}
}

