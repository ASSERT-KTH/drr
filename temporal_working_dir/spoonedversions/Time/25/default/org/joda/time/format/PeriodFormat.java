

package org.joda.time.format;


public class PeriodFormat {
	private static final java.lang.String BUNDLE_NAME = "org.joda.time.format.messages";

	private static final java.util.concurrent.ConcurrentMap<java.util.Locale, org.joda.time.format.PeriodFormatter> FORMATTERS = new java.util.concurrent.ConcurrentHashMap<java.util.Locale, org.joda.time.format.PeriodFormatter>();

	protected PeriodFormat() {
		super();
	}

	public static org.joda.time.format.PeriodFormatter getDefault() {
		return org.joda.time.format.PeriodFormat.wordBased(java.util.Locale.ENGLISH);
	}

	public static org.joda.time.format.PeriodFormatter wordBased() {
		return org.joda.time.format.PeriodFormat.wordBased(java.util.Locale.getDefault());
	}

	public static org.joda.time.format.PeriodFormatter wordBased(java.util.Locale locale) {
		org.joda.time.format.PeriodFormatter pf = org.joda.time.format.PeriodFormat.FORMATTERS.get(locale);
		if (pf == null) {
			java.util.ResourceBundle b = java.util.ResourceBundle.getBundle(org.joda.time.format.PeriodFormat.BUNDLE_NAME, locale);
			java.lang.String[] variants = new java.lang.String[]{ b.getString("PeriodFormat.space") , b.getString("PeriodFormat.comma") , b.getString("PeriodFormat.commandand") , b.getString("PeriodFormat.commaspaceand") };
			pf = new org.joda.time.format.PeriodFormatterBuilder().appendYears().appendSuffix(b.getString("PeriodFormat.year"), b.getString("PeriodFormat.years")).appendSeparator(b.getString("PeriodFormat.commaspace"), b.getString("PeriodFormat.spaceandspace"), variants).appendMonths().appendSuffix(b.getString("PeriodFormat.month"), b.getString("PeriodFormat.months")).appendSeparator(b.getString("PeriodFormat.commaspace"), b.getString("PeriodFormat.spaceandspace"), variants).appendWeeks().appendSuffix(b.getString("PeriodFormat.week"), b.getString("PeriodFormat.weeks")).appendSeparator(b.getString("PeriodFormat.commaspace"), b.getString("PeriodFormat.spaceandspace"), variants).appendDays().appendSuffix(b.getString("PeriodFormat.day"), b.getString("PeriodFormat.days")).appendSeparator(b.getString("PeriodFormat.commaspace"), b.getString("PeriodFormat.spaceandspace"), variants).appendHours().appendSuffix(b.getString("PeriodFormat.hour"), b.getString("PeriodFormat.hours")).appendSeparator(b.getString("PeriodFormat.commaspace"), b.getString("PeriodFormat.spaceandspace"), variants).appendMinutes().appendSuffix(b.getString("PeriodFormat.minute"), b.getString("PeriodFormat.minutes")).appendSeparator(b.getString("PeriodFormat.commaspace"), b.getString("PeriodFormat.spaceandspace"), variants).appendSeconds().appendSuffix(b.getString("PeriodFormat.second"), b.getString("PeriodFormat.seconds")).appendSeparator(b.getString("PeriodFormat.commaspace"), b.getString("PeriodFormat.spaceandspace"), variants).appendMillis().appendSuffix(b.getString("PeriodFormat.millisecond"), b.getString("PeriodFormat.milliseconds")).toFormatter();
			org.joda.time.format.PeriodFormat.FORMATTERS.putIfAbsent(locale, pf);
		}
		return pf;
	}
}

