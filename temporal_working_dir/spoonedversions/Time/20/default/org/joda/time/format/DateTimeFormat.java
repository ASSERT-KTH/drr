

package org.joda.time.format;


public class DateTimeFormat {
	static final int FULL = 0;

	static final int LONG = 1;

	static final int MEDIUM = 2;

	static final int SHORT = 3;

	static final int NONE = 4;

	static final int DATE = 0;

	static final int TIME = 1;

	static final int DATETIME = 2;

	private static final java.util.Map<java.lang.String, org.joda.time.format.DateTimeFormatter> cPatternedCache = new java.util.HashMap<java.lang.String, org.joda.time.format.DateTimeFormatter>(7);

	private static final org.joda.time.format.DateTimeFormatter[] cStyleCache = new org.joda.time.format.DateTimeFormatter[25];

	public static org.joda.time.format.DateTimeFormatter forPattern(java.lang.String pattern) {
		return org.joda.time.format.DateTimeFormat.createFormatterForPattern(pattern);
	}

	public static org.joda.time.format.DateTimeFormatter forStyle(java.lang.String style) {
		return org.joda.time.format.DateTimeFormat.createFormatterForStyle(style);
	}

	public static java.lang.String patternForStyle(java.lang.String style, java.util.Locale locale) {
		org.joda.time.format.DateTimeFormatter formatter = org.joda.time.format.DateTimeFormat.createFormatterForStyle(style);
		if (locale == null) {
			locale = java.util.Locale.getDefault();
		}
		return ((org.joda.time.format.DateTimeFormat.StyleFormatter) (formatter.getPrinter())).getPattern(locale);
	}

	public static org.joda.time.format.DateTimeFormatter shortDate() {
		return org.joda.time.format.DateTimeFormat.createFormatterForStyleIndex(org.joda.time.format.DateTimeFormat.SHORT, org.joda.time.format.DateTimeFormat.NONE);
	}

	public static org.joda.time.format.DateTimeFormatter shortTime() {
		return org.joda.time.format.DateTimeFormat.createFormatterForStyleIndex(org.joda.time.format.DateTimeFormat.NONE, org.joda.time.format.DateTimeFormat.SHORT);
	}

	public static org.joda.time.format.DateTimeFormatter shortDateTime() {
		return org.joda.time.format.DateTimeFormat.createFormatterForStyleIndex(org.joda.time.format.DateTimeFormat.SHORT, org.joda.time.format.DateTimeFormat.SHORT);
	}

	public static org.joda.time.format.DateTimeFormatter mediumDate() {
		return org.joda.time.format.DateTimeFormat.createFormatterForStyleIndex(org.joda.time.format.DateTimeFormat.MEDIUM, org.joda.time.format.DateTimeFormat.NONE);
	}

	public static org.joda.time.format.DateTimeFormatter mediumTime() {
		return org.joda.time.format.DateTimeFormat.createFormatterForStyleIndex(org.joda.time.format.DateTimeFormat.NONE, org.joda.time.format.DateTimeFormat.MEDIUM);
	}

	public static org.joda.time.format.DateTimeFormatter mediumDateTime() {
		return org.joda.time.format.DateTimeFormat.createFormatterForStyleIndex(org.joda.time.format.DateTimeFormat.MEDIUM, org.joda.time.format.DateTimeFormat.MEDIUM);
	}

	public static org.joda.time.format.DateTimeFormatter longDate() {
		return org.joda.time.format.DateTimeFormat.createFormatterForStyleIndex(org.joda.time.format.DateTimeFormat.LONG, org.joda.time.format.DateTimeFormat.NONE);
	}

	public static org.joda.time.format.DateTimeFormatter longTime() {
		return org.joda.time.format.DateTimeFormat.createFormatterForStyleIndex(org.joda.time.format.DateTimeFormat.NONE, org.joda.time.format.DateTimeFormat.LONG);
	}

	public static org.joda.time.format.DateTimeFormatter longDateTime() {
		return org.joda.time.format.DateTimeFormat.createFormatterForStyleIndex(org.joda.time.format.DateTimeFormat.LONG, org.joda.time.format.DateTimeFormat.LONG);
	}

	public static org.joda.time.format.DateTimeFormatter fullDate() {
		return org.joda.time.format.DateTimeFormat.createFormatterForStyleIndex(org.joda.time.format.DateTimeFormat.FULL, org.joda.time.format.DateTimeFormat.NONE);
	}

	public static org.joda.time.format.DateTimeFormatter fullTime() {
		return org.joda.time.format.DateTimeFormat.createFormatterForStyleIndex(org.joda.time.format.DateTimeFormat.NONE, org.joda.time.format.DateTimeFormat.FULL);
	}

	public static org.joda.time.format.DateTimeFormatter fullDateTime() {
		return org.joda.time.format.DateTimeFormat.createFormatterForStyleIndex(org.joda.time.format.DateTimeFormat.FULL, org.joda.time.format.DateTimeFormat.FULL);
	}

	static void appendPatternTo(org.joda.time.format.DateTimeFormatterBuilder builder, java.lang.String pattern) {
		org.joda.time.format.DateTimeFormat.parsePatternTo(builder, pattern);
	}

	protected DateTimeFormat() {
		super();
	}

	private static void parsePatternTo(org.joda.time.format.DateTimeFormatterBuilder builder, java.lang.String pattern) {
		int length = pattern.length();
		int[] indexRef = new int[1];
		for (int i = 0; i < length; i++) {
			indexRef[0] = i;
			java.lang.String token = org.joda.time.format.DateTimeFormat.parseToken(pattern, indexRef);
			i = indexRef[0];
			int tokenLen = token.length();
			if (tokenLen == 0) {
				break;
			}
			char c = token.charAt(0);
			switch (c) {
				case 'G' :
					builder.appendEraText();
					break;
				case 'C' :
					builder.appendCenturyOfEra(tokenLen, tokenLen);
					break;
				case 'x' :
				case 'y' :
				case 'Y' :
					if (tokenLen == 2) {
						boolean lenientParse = true;
						if ((i + 1) < length) {
							(indexRef[0])++;
							if (org.joda.time.format.DateTimeFormat.isNumericToken(org.joda.time.format.DateTimeFormat.parseToken(pattern, indexRef))) {
								lenientParse = false;
							}
							(indexRef[0])--;
						}
						switch (c) {
							case 'x' :
								builder.appendTwoDigitWeekyear(((new org.joda.time.DateTime().getWeekyear()) - 30), lenientParse);
								break;
							case 'y' :
							case 'Y' :
							default :
								builder.appendTwoDigitYear(((new org.joda.time.DateTime().getYear()) - 30), lenientParse);
								break;
						}
					}else {
						int maxDigits = 9;
						if ((i + 1) < length) {
							(indexRef[0])++;
							if (org.joda.time.format.DateTimeFormat.isNumericToken(org.joda.time.format.DateTimeFormat.parseToken(pattern, indexRef))) {
								maxDigits = tokenLen;
							}
							(indexRef[0])--;
						}
						switch (c) {
							case 'x' :
								builder.appendWeekyear(tokenLen, maxDigits);
								break;
							case 'y' :
								builder.appendYear(tokenLen, maxDigits);
								break;
							case 'Y' :
								builder.appendYearOfEra(tokenLen, maxDigits);
								break;
						}
					}
					break;
				case 'M' :
					if (tokenLen >= 3) {
						if (tokenLen >= 4) {
							builder.appendMonthOfYearText();
						}else {
							builder.appendMonthOfYearShortText();
						}
					}else {
						builder.appendMonthOfYear(tokenLen);
					}
					break;
				case 'd' :
					builder.appendDayOfMonth(tokenLen);
					break;
				case 'a' :
					builder.appendHalfdayOfDayText();
					break;
				case 'h' :
					builder.appendClockhourOfHalfday(tokenLen);
					break;
				case 'H' :
					builder.appendHourOfDay(tokenLen);
					break;
				case 'k' :
					builder.appendClockhourOfDay(tokenLen);
					break;
				case 'K' :
					builder.appendHourOfHalfday(tokenLen);
					break;
				case 'm' :
					builder.appendMinuteOfHour(tokenLen);
					break;
				case 's' :
					builder.appendSecondOfMinute(tokenLen);
					break;
				case 'S' :
					builder.appendFractionOfSecond(tokenLen, tokenLen);
					break;
				case 'e' :
					builder.appendDayOfWeek(tokenLen);
					break;
				case 'E' :
					if (tokenLen >= 4) {
						builder.appendDayOfWeekText();
					}else {
						builder.appendDayOfWeekShortText();
					}
					break;
				case 'D' :
					builder.appendDayOfYear(tokenLen);
					break;
				case 'w' :
					builder.appendWeekOfWeekyear(tokenLen);
					break;
				case 'z' :
					if (tokenLen >= 4) {
						builder.appendTimeZoneName();
					}else {
						builder.appendTimeZoneShortName();
					}
					break;
				case 'Z' :
					if (tokenLen == 1) {
						builder.appendTimeZoneOffset(null, "Z", false, 2, 2);
					}else
						if (tokenLen == 2) {
							builder.appendTimeZoneOffset(null, "Z", true, 2, 2);
						}else {
							builder.appendTimeZoneId();
						}
					
					break;
				case '\'' :
					java.lang.String sub = token.substring(1);
					if ((sub.length()) == 1) {
						builder.appendLiteral(sub.charAt(0));
					}else {
						builder.appendLiteral(new java.lang.String(sub));
					}
					break;
				default :
					throw new java.lang.IllegalArgumentException(("Illegal pattern component: " + token));
			}
		}
	}

	private static java.lang.String parseToken(java.lang.String pattern, int[] indexRef) {
		java.lang.StringBuffer buf = new java.lang.StringBuffer();
		int i = indexRef[0];
		int length = pattern.length();
		char c = pattern.charAt(i);
		if (((c >= 'A') && (c <= 'Z')) || ((c >= 'a') && (c <= 'z'))) {
			buf.append(c);
			while ((i + 1) < length) {
				char peek = pattern.charAt((i + 1));
				if (peek == c) {
					buf.append(c);
					i++;
				}else {
					break;
				}
			} 
		}else {
			buf.append('\'');
			boolean inLiteral = false;
			for (; i < length; i++) {
				c = pattern.charAt(i);
				if (c == '\'') {
					if (((i + 1) < length) && ((pattern.charAt((i + 1))) == '\'')) {
						i++;
						buf.append(c);
					}else {
						inLiteral = !inLiteral;
					}
				}else
					if ((!inLiteral) && (((c >= 'A') && (c <= 'Z')) || ((c >= 'a') && (c <= 'z')))) {
						i--;
						break;
					}else {
						buf.append(c);
					}
				
			}
		}
		indexRef[0] = i;
		return buf.toString();
	}

	private static boolean isNumericToken(java.lang.String token) {
		int tokenLen = token.length();
		if (tokenLen > 0) {
			char c = token.charAt(0);
			switch (c) {
				case 'c' :
				case 'C' :
				case 'x' :
				case 'y' :
				case 'Y' :
				case 'd' :
				case 'h' :
				case 'H' :
				case 'm' :
				case 's' :
				case 'S' :
				case 'e' :
				case 'D' :
				case 'F' :
				case 'w' :
				case 'W' :
				case 'k' :
				case 'K' :
					return true;
				case 'M' :
					if (tokenLen <= 2) {
						return true;
					}
			}
		}
		return false;
	}

	private static org.joda.time.format.DateTimeFormatter createFormatterForPattern(java.lang.String pattern) {
		if ((pattern == null) || ((pattern.length()) == 0)) {
			throw new java.lang.IllegalArgumentException("Invalid pattern specification");
		}
		org.joda.time.format.DateTimeFormatter formatter = null;
		synchronized(org.joda.time.format.DateTimeFormat.cPatternedCache) {
			formatter = org.joda.time.format.DateTimeFormat.cPatternedCache.get(pattern);
			if (formatter == null) {
				org.joda.time.format.DateTimeFormatterBuilder builder = new org.joda.time.format.DateTimeFormatterBuilder();
				org.joda.time.format.DateTimeFormat.parsePatternTo(builder, pattern);
				formatter = builder.toFormatter();
				org.joda.time.format.DateTimeFormat.cPatternedCache.put(pattern, formatter);
			}
		}
		return formatter;
	}

	private static org.joda.time.format.DateTimeFormatter createFormatterForStyle(java.lang.String style) {
		if ((style == null) || ((style.length()) != 2)) {
			throw new java.lang.IllegalArgumentException(("Invalid style specification: " + style));
		}
		int dateStyle = org.joda.time.format.DateTimeFormat.selectStyle(style.charAt(0));
		int timeStyle = org.joda.time.format.DateTimeFormat.selectStyle(style.charAt(1));
		if ((dateStyle == (org.joda.time.format.DateTimeFormat.NONE)) && (timeStyle == (org.joda.time.format.DateTimeFormat.NONE))) {
			throw new java.lang.IllegalArgumentException("Style '--' is invalid");
		}
		return org.joda.time.format.DateTimeFormat.createFormatterForStyleIndex(dateStyle, timeStyle);
	}

	private static org.joda.time.format.DateTimeFormatter createFormatterForStyleIndex(int dateStyle, int timeStyle) {
		int index = ((dateStyle << 2) + dateStyle) + timeStyle;
		org.joda.time.format.DateTimeFormatter f = null;
		synchronized(org.joda.time.format.DateTimeFormat.cStyleCache) {
			f = org.joda.time.format.DateTimeFormat.cStyleCache[index];
			if (f == null) {
				int type = org.joda.time.format.DateTimeFormat.DATETIME;
				if (dateStyle == (org.joda.time.format.DateTimeFormat.NONE)) {
					type = org.joda.time.format.DateTimeFormat.TIME;
				}else
					if (timeStyle == (org.joda.time.format.DateTimeFormat.NONE)) {
						type = org.joda.time.format.DateTimeFormat.DATE;
					}
				
				org.joda.time.format.DateTimeFormat.StyleFormatter llf = new org.joda.time.format.DateTimeFormat.StyleFormatter(dateStyle, timeStyle, type);
				f = new org.joda.time.format.DateTimeFormatter(llf, llf);
				org.joda.time.format.DateTimeFormat.cStyleCache[index] = f;
			}
		}
		return f;
	}

	private static int selectStyle(char ch) {
		switch (ch) {
			case 'S' :
				return org.joda.time.format.DateTimeFormat.SHORT;
			case 'M' :
				return org.joda.time.format.DateTimeFormat.MEDIUM;
			case 'L' :
				return org.joda.time.format.DateTimeFormat.LONG;
			case 'F' :
				return org.joda.time.format.DateTimeFormat.FULL;
			case '-' :
				return org.joda.time.format.DateTimeFormat.NONE;
			default :
				throw new java.lang.IllegalArgumentException(("Invalid style character: " + ch));
		}
	}

	static class StyleFormatter implements org.joda.time.format.DateTimeParser , org.joda.time.format.DateTimePrinter {
		private static final java.util.Map<java.lang.String, org.joda.time.format.DateTimeFormatter> cCache = new java.util.HashMap<java.lang.String, org.joda.time.format.DateTimeFormatter>();

		private final int iDateStyle;

		private final int iTimeStyle;

		private final int iType;

		StyleFormatter(int dateStyle, int timeStyle, int type) {
			super();
			iDateStyle = dateStyle;
			iTimeStyle = timeStyle;
			iType = type;
		}

		public int estimatePrintedLength() {
			return 40;
		}

		public void printTo(java.lang.StringBuffer buf, long instant, org.joda.time.Chronology chrono, int displayOffset, org.joda.time.DateTimeZone displayZone, java.util.Locale locale) {
			org.joda.time.format.DateTimePrinter p = getFormatter(locale).getPrinter();
			p.printTo(buf, instant, chrono, displayOffset, displayZone, locale);
		}

		public void printTo(java.io.Writer out, long instant, org.joda.time.Chronology chrono, int displayOffset, org.joda.time.DateTimeZone displayZone, java.util.Locale locale) throws java.io.IOException {
			org.joda.time.format.DateTimePrinter p = getFormatter(locale).getPrinter();
			p.printTo(out, instant, chrono, displayOffset, displayZone, locale);
		}

		public void printTo(java.lang.StringBuffer buf, org.joda.time.ReadablePartial partial, java.util.Locale locale) {
			org.joda.time.format.DateTimePrinter p = getFormatter(locale).getPrinter();
			p.printTo(buf, partial, locale);
		}

		public void printTo(java.io.Writer out, org.joda.time.ReadablePartial partial, java.util.Locale locale) throws java.io.IOException {
			org.joda.time.format.DateTimePrinter p = getFormatter(locale).getPrinter();
			p.printTo(out, partial, locale);
		}

		public int estimateParsedLength() {
			return 40;
		}

		public int parseInto(org.joda.time.format.DateTimeParserBucket bucket, java.lang.String text, int position) {
			org.joda.time.format.DateTimeParser p = getFormatter(bucket.getLocale()).getParser();
			return p.parseInto(bucket, text, position);
		}

		private org.joda.time.format.DateTimeFormatter getFormatter(java.util.Locale locale) {
			locale = (locale == null) ? java.util.Locale.getDefault() : locale;
			java.lang.String key = (java.lang.Integer.toString((((iType) + ((iDateStyle) << 4)) + ((iTimeStyle) << 8)))) + (locale.toString());
			org.joda.time.format.DateTimeFormatter f = null;
			synchronized(org.joda.time.format.DateTimeFormat.StyleFormatter.cCache) {
				f = org.joda.time.format.DateTimeFormat.StyleFormatter.cCache.get(key);
				if (f == null) {
					java.lang.String pattern = getPattern(locale);
					f = org.joda.time.format.DateTimeFormat.forPattern(pattern);
					org.joda.time.format.DateTimeFormat.StyleFormatter.cCache.put(key, f);
				}
			}
			return f;
		}

		java.lang.String getPattern(java.util.Locale locale) {
			java.text.DateFormat f = null;
			switch (iType) {
				case org.joda.time.format.DateTimeFormat.DATE :
					f = java.text.DateFormat.getDateInstance(iDateStyle, locale);
					break;
				case org.joda.time.format.DateTimeFormat.TIME :
					f = java.text.DateFormat.getTimeInstance(iTimeStyle, locale);
					break;
				case org.joda.time.format.DateTimeFormat.DATETIME :
					f = java.text.DateFormat.getDateTimeInstance(iDateStyle, iTimeStyle, locale);
					break;
			}
			if ((f instanceof java.text.SimpleDateFormat) == false) {
				throw new java.lang.IllegalArgumentException(("No datetime pattern for locale: " + locale));
			}
			return ((java.text.SimpleDateFormat) (f)).toPattern();
		}
	}
}

