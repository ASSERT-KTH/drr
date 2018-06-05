

package org.apache.commons.lang3.time;


public class DateFormatUtils {
	public static final org.apache.commons.lang3.time.FastDateFormat ISO_DATETIME_FORMAT = org.apache.commons.lang3.time.FastDateFormat.getInstance("yyyy-MM-dd'T'HH:mm:ss");

	public static final org.apache.commons.lang3.time.FastDateFormat ISO_DATETIME_TIME_ZONE_FORMAT = org.apache.commons.lang3.time.FastDateFormat.getInstance("yyyy-MM-dd'T'HH:mm:ssZZ");

	public static final org.apache.commons.lang3.time.FastDateFormat ISO_DATE_FORMAT = org.apache.commons.lang3.time.FastDateFormat.getInstance("yyyy-MM-dd");

	public static final org.apache.commons.lang3.time.FastDateFormat ISO_DATE_TIME_ZONE_FORMAT = org.apache.commons.lang3.time.FastDateFormat.getInstance("yyyy-MM-ddZZ");

	public static final org.apache.commons.lang3.time.FastDateFormat ISO_TIME_FORMAT = org.apache.commons.lang3.time.FastDateFormat.getInstance("'T'HH:mm:ss");

	public static final org.apache.commons.lang3.time.FastDateFormat ISO_TIME_TIME_ZONE_FORMAT = org.apache.commons.lang3.time.FastDateFormat.getInstance("'T'HH:mm:ssZZ");

	public static final org.apache.commons.lang3.time.FastDateFormat ISO_TIME_NO_T_FORMAT = org.apache.commons.lang3.time.FastDateFormat.getInstance("HH:mm:ss");

	public static final org.apache.commons.lang3.time.FastDateFormat ISO_TIME_NO_T_TIME_ZONE_FORMAT = org.apache.commons.lang3.time.FastDateFormat.getInstance("HH:mm:ssZZ");

	public static final org.apache.commons.lang3.time.FastDateFormat SMTP_DATETIME_FORMAT = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEE, dd MMM yyyy HH:mm:ss Z", java.util.Locale.US);

	public DateFormatUtils() {
		super();
	}

	public static java.lang.String formatUTC(long millis, java.lang.String pattern) {
		return org.apache.commons.lang3.time.DateFormatUtils.format(new java.util.Date(millis), pattern, org.apache.commons.lang3.time.DateUtils.UTC_TIME_ZONE, null);
	}

	public static java.lang.String formatUTC(java.util.Date date, java.lang.String pattern) {
		return org.apache.commons.lang3.time.DateFormatUtils.format(date, pattern, org.apache.commons.lang3.time.DateUtils.UTC_TIME_ZONE, null);
	}

	public static java.lang.String formatUTC(long millis, java.lang.String pattern, java.util.Locale locale) {
		return org.apache.commons.lang3.time.DateFormatUtils.format(new java.util.Date(millis), pattern, org.apache.commons.lang3.time.DateUtils.UTC_TIME_ZONE, locale);
	}

	public static java.lang.String formatUTC(java.util.Date date, java.lang.String pattern, java.util.Locale locale) {
		return org.apache.commons.lang3.time.DateFormatUtils.format(date, pattern, org.apache.commons.lang3.time.DateUtils.UTC_TIME_ZONE, locale);
	}

	public static java.lang.String format(long millis, java.lang.String pattern) {
		return org.apache.commons.lang3.time.DateFormatUtils.format(new java.util.Date(millis), pattern, null, null);
	}

	public static java.lang.String format(java.util.Date date, java.lang.String pattern) {
		return org.apache.commons.lang3.time.DateFormatUtils.format(date, pattern, null, null);
	}

	public static java.lang.String format(java.util.Calendar calendar, java.lang.String pattern) {
		return org.apache.commons.lang3.time.DateFormatUtils.format(calendar, pattern, null, null);
	}

	public static java.lang.String format(long millis, java.lang.String pattern, java.util.TimeZone timeZone) {
		return org.apache.commons.lang3.time.DateFormatUtils.format(new java.util.Date(millis), pattern, timeZone, null);
	}

	public static java.lang.String format(java.util.Date date, java.lang.String pattern, java.util.TimeZone timeZone) {
		return org.apache.commons.lang3.time.DateFormatUtils.format(date, pattern, timeZone, null);
	}

	public static java.lang.String format(java.util.Calendar calendar, java.lang.String pattern, java.util.TimeZone timeZone) {
		return org.apache.commons.lang3.time.DateFormatUtils.format(calendar, pattern, timeZone, null);
	}

	public static java.lang.String format(long millis, java.lang.String pattern, java.util.Locale locale) {
		return org.apache.commons.lang3.time.DateFormatUtils.format(new java.util.Date(millis), pattern, null, locale);
	}

	public static java.lang.String format(java.util.Date date, java.lang.String pattern, java.util.Locale locale) {
		return org.apache.commons.lang3.time.DateFormatUtils.format(date, pattern, null, locale);
	}

	public static java.lang.String format(java.util.Calendar calendar, java.lang.String pattern, java.util.Locale locale) {
		return org.apache.commons.lang3.time.DateFormatUtils.format(calendar, pattern, null, locale);
	}

	public static java.lang.String format(long millis, java.lang.String pattern, java.util.TimeZone timeZone, java.util.Locale locale) {
		return org.apache.commons.lang3.time.DateFormatUtils.format(new java.util.Date(millis), pattern, timeZone, locale);
	}

	public static java.lang.String format(java.util.Date date, java.lang.String pattern, java.util.TimeZone timeZone, java.util.Locale locale) {
		org.apache.commons.lang3.time.FastDateFormat df = org.apache.commons.lang3.time.FastDateFormat.getInstance(pattern, timeZone, locale);
		return df.format(date);
	}

	public static java.lang.String format(java.util.Calendar calendar, java.lang.String pattern, java.util.TimeZone timeZone, java.util.Locale locale) {
		org.apache.commons.lang3.time.FastDateFormat df = org.apache.commons.lang3.time.FastDateFormat.getInstance(pattern, timeZone, locale);
		return df.format(calendar);
	}
}

