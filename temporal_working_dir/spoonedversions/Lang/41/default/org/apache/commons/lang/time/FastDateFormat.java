

package org.apache.commons.lang.time;


public class FastDateFormat extends java.text.Format {
	private static final long serialVersionUID = 1L;

	public static final int FULL = java.text.DateFormat.FULL;

	public static final int LONG = java.text.DateFormat.LONG;

	public static final int MEDIUM = java.text.DateFormat.MEDIUM;

	public static final int SHORT = java.text.DateFormat.SHORT;

	private static java.lang.String cDefaultPattern;

	private static final java.util.Map<org.apache.commons.lang.time.FastDateFormat, org.apache.commons.lang.time.FastDateFormat> cInstanceCache = new java.util.HashMap<org.apache.commons.lang.time.FastDateFormat, org.apache.commons.lang.time.FastDateFormat>(7);

	private static final java.util.Map<java.lang.Object, org.apache.commons.lang.time.FastDateFormat> cDateInstanceCache = new java.util.HashMap<java.lang.Object, org.apache.commons.lang.time.FastDateFormat>(7);

	private static final java.util.Map<java.lang.Object, org.apache.commons.lang.time.FastDateFormat> cTimeInstanceCache = new java.util.HashMap<java.lang.Object, org.apache.commons.lang.time.FastDateFormat>(7);

	private static final java.util.Map<java.lang.Object, org.apache.commons.lang.time.FastDateFormat> cDateTimeInstanceCache = new java.util.HashMap<java.lang.Object, org.apache.commons.lang.time.FastDateFormat>(7);

	private static final java.util.Map<java.lang.Object, java.lang.String> cTimeZoneDisplayCache = new java.util.HashMap<java.lang.Object, java.lang.String>(7);

	private final java.lang.String mPattern;

	private final java.util.TimeZone mTimeZone;

	private final boolean mTimeZoneForced;

	private final java.util.Locale mLocale;

	private final boolean mLocaleForced;

	private transient org.apache.commons.lang.time.FastDateFormat.Rule[] mRules;

	private transient int mMaxLengthEstimate;

	public static org.apache.commons.lang.time.FastDateFormat getInstance() {
		return org.apache.commons.lang.time.FastDateFormat.getInstance(org.apache.commons.lang.time.FastDateFormat.getDefaultPattern(), null, null);
	}

	public static org.apache.commons.lang.time.FastDateFormat getInstance(java.lang.String pattern) {
		return org.apache.commons.lang.time.FastDateFormat.getInstance(pattern, null, null);
	}

	public static org.apache.commons.lang.time.FastDateFormat getInstance(java.lang.String pattern, java.util.TimeZone timeZone) {
		return org.apache.commons.lang.time.FastDateFormat.getInstance(pattern, timeZone, null);
	}

	public static org.apache.commons.lang.time.FastDateFormat getInstance(java.lang.String pattern, java.util.Locale locale) {
		return org.apache.commons.lang.time.FastDateFormat.getInstance(pattern, null, locale);
	}

	public static synchronized org.apache.commons.lang.time.FastDateFormat getInstance(java.lang.String pattern, java.util.TimeZone timeZone, java.util.Locale locale) {
		org.apache.commons.lang.time.FastDateFormat emptyFormat = new org.apache.commons.lang.time.FastDateFormat(pattern, timeZone, locale);
		org.apache.commons.lang.time.FastDateFormat format = org.apache.commons.lang.time.FastDateFormat.cInstanceCache.get(emptyFormat);
		if (format == null) {
			format = emptyFormat;
			format.init();
			org.apache.commons.lang.time.FastDateFormat.cInstanceCache.put(format, format);
		}
		return format;
	}

	public static org.apache.commons.lang.time.FastDateFormat getDateInstance(int style) {
		return org.apache.commons.lang.time.FastDateFormat.getDateInstance(style, null, null);
	}

	public static org.apache.commons.lang.time.FastDateFormat getDateInstance(int style, java.util.Locale locale) {
		return org.apache.commons.lang.time.FastDateFormat.getDateInstance(style, null, locale);
	}

	public static org.apache.commons.lang.time.FastDateFormat getDateInstance(int style, java.util.TimeZone timeZone) {
		return org.apache.commons.lang.time.FastDateFormat.getDateInstance(style, timeZone, null);
	}

	public static synchronized org.apache.commons.lang.time.FastDateFormat getDateInstance(int style, java.util.TimeZone timeZone, java.util.Locale locale) {
		java.lang.Object key = java.lang.Integer.valueOf(style);
		if (timeZone != null) {
			key = new org.apache.commons.lang.time.FastDateFormat.Pair(key, timeZone);
		}
		if (locale == null) {
			locale = java.util.Locale.getDefault();
		}
		key = new org.apache.commons.lang.time.FastDateFormat.Pair(key, locale);
		org.apache.commons.lang.time.FastDateFormat format = org.apache.commons.lang.time.FastDateFormat.cDateInstanceCache.get(key);
		if (format == null) {
			try {
				java.text.SimpleDateFormat formatter = ((java.text.SimpleDateFormat) (java.text.DateFormat.getDateInstance(style, locale)));
				java.lang.String pattern = formatter.toPattern();
				format = org.apache.commons.lang.time.FastDateFormat.getInstance(pattern, timeZone, locale);
				org.apache.commons.lang.time.FastDateFormat.cDateInstanceCache.put(key, format);
			} catch (java.lang.ClassCastException ex) {
				throw new java.lang.IllegalArgumentException(("No date pattern for locale: " + locale));
			}
		}
		return format;
	}

	public static org.apache.commons.lang.time.FastDateFormat getTimeInstance(int style) {
		return org.apache.commons.lang.time.FastDateFormat.getTimeInstance(style, null, null);
	}

	public static org.apache.commons.lang.time.FastDateFormat getTimeInstance(int style, java.util.Locale locale) {
		return org.apache.commons.lang.time.FastDateFormat.getTimeInstance(style, null, locale);
	}

	public static org.apache.commons.lang.time.FastDateFormat getTimeInstance(int style, java.util.TimeZone timeZone) {
		return org.apache.commons.lang.time.FastDateFormat.getTimeInstance(style, timeZone, null);
	}

	public static synchronized org.apache.commons.lang.time.FastDateFormat getTimeInstance(int style, java.util.TimeZone timeZone, java.util.Locale locale) {
		java.lang.Object key = java.lang.Integer.valueOf(style);
		if (timeZone != null) {
			key = new org.apache.commons.lang.time.FastDateFormat.Pair(key, timeZone);
		}
		if (locale != null) {
			key = new org.apache.commons.lang.time.FastDateFormat.Pair(key, locale);
		}
		org.apache.commons.lang.time.FastDateFormat format = org.apache.commons.lang.time.FastDateFormat.cTimeInstanceCache.get(key);
		if (format == null) {
			if (locale == null) {
				locale = java.util.Locale.getDefault();
			}
			try {
				java.text.SimpleDateFormat formatter = ((java.text.SimpleDateFormat) (java.text.DateFormat.getTimeInstance(style, locale)));
				java.lang.String pattern = formatter.toPattern();
				format = org.apache.commons.lang.time.FastDateFormat.getInstance(pattern, timeZone, locale);
				org.apache.commons.lang.time.FastDateFormat.cTimeInstanceCache.put(key, format);
			} catch (java.lang.ClassCastException ex) {
				throw new java.lang.IllegalArgumentException(("No date pattern for locale: " + locale));
			}
		}
		return format;
	}

	public static org.apache.commons.lang.time.FastDateFormat getDateTimeInstance(int dateStyle, int timeStyle) {
		return org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(dateStyle, timeStyle, null, null);
	}

	public static org.apache.commons.lang.time.FastDateFormat getDateTimeInstance(int dateStyle, int timeStyle, java.util.Locale locale) {
		return org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(dateStyle, timeStyle, null, locale);
	}

	public static org.apache.commons.lang.time.FastDateFormat getDateTimeInstance(int dateStyle, int timeStyle, java.util.TimeZone timeZone) {
		return org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(dateStyle, timeStyle, timeZone, null);
	}

	public static synchronized org.apache.commons.lang.time.FastDateFormat getDateTimeInstance(int dateStyle, int timeStyle, java.util.TimeZone timeZone, java.util.Locale locale) {
		java.lang.Object key = new org.apache.commons.lang.time.FastDateFormat.Pair(java.lang.Integer.valueOf(dateStyle), java.lang.Integer.valueOf(timeStyle));
		if (timeZone != null) {
			key = new org.apache.commons.lang.time.FastDateFormat.Pair(key, timeZone);
		}
		if (locale == null) {
			locale = java.util.Locale.getDefault();
		}
		key = new org.apache.commons.lang.time.FastDateFormat.Pair(key, locale);
		org.apache.commons.lang.time.FastDateFormat format = org.apache.commons.lang.time.FastDateFormat.cDateTimeInstanceCache.get(key);
		if (format == null) {
			try {
				java.text.SimpleDateFormat formatter = ((java.text.SimpleDateFormat) (java.text.DateFormat.getDateTimeInstance(dateStyle, timeStyle, locale)));
				java.lang.String pattern = formatter.toPattern();
				format = org.apache.commons.lang.time.FastDateFormat.getInstance(pattern, timeZone, locale);
				org.apache.commons.lang.time.FastDateFormat.cDateTimeInstanceCache.put(key, format);
			} catch (java.lang.ClassCastException ex) {
				throw new java.lang.IllegalArgumentException(("No date time pattern for locale: " + locale));
			}
		}
		return format;
	}

	static synchronized java.lang.String getTimeZoneDisplay(java.util.TimeZone tz, boolean daylight, int style, java.util.Locale locale) {
		java.lang.Object key = new org.apache.commons.lang.time.FastDateFormat.TimeZoneDisplayKey(tz, daylight, style, locale);
		java.lang.String value = org.apache.commons.lang.time.FastDateFormat.cTimeZoneDisplayCache.get(key);
		if (value == null) {
			value = tz.getDisplayName(daylight, style, locale);
			org.apache.commons.lang.time.FastDateFormat.cTimeZoneDisplayCache.put(key, value);
		}
		return value;
	}

	private static synchronized java.lang.String getDefaultPattern() {
		if ((org.apache.commons.lang.time.FastDateFormat.cDefaultPattern) == null) {
			org.apache.commons.lang.time.FastDateFormat.cDefaultPattern = new java.text.SimpleDateFormat().toPattern();
		}
		return org.apache.commons.lang.time.FastDateFormat.cDefaultPattern;
	}

	protected FastDateFormat(java.lang.String pattern, java.util.TimeZone timeZone, java.util.Locale locale) {
		super();
		if (pattern == null) {
			throw new java.lang.IllegalArgumentException("The pattern must not be null");
		}
		mPattern = pattern;
		mTimeZoneForced = timeZone != null;
		if (timeZone == null) {
			timeZone = java.util.TimeZone.getDefault();
		}
		mTimeZone = timeZone;
		mLocaleForced = locale != null;
		if (locale == null) {
			locale = java.util.Locale.getDefault();
		}
		mLocale = locale;
	}

	protected void init() {
		java.util.List<org.apache.commons.lang.time.FastDateFormat.Rule> rulesList = parsePattern();
		mRules = rulesList.toArray(new org.apache.commons.lang.time.FastDateFormat.Rule[rulesList.size()]);
		int len = 0;
		for (int i = mRules.length; (--i) >= 0;) {
			len += mRules[i].estimateLength();
		}
		mMaxLengthEstimate = len;
	}

	protected java.util.List<org.apache.commons.lang.time.FastDateFormat.Rule> parsePattern() {
		java.text.DateFormatSymbols symbols = new java.text.DateFormatSymbols(mLocale);
		java.util.List<org.apache.commons.lang.time.FastDateFormat.Rule> rules = new java.util.ArrayList<org.apache.commons.lang.time.FastDateFormat.Rule>();
		java.lang.String[] ERAs = symbols.getEras();
		java.lang.String[] months = symbols.getMonths();
		java.lang.String[] shortMonths = symbols.getShortMonths();
		java.lang.String[] weekdays = symbols.getWeekdays();
		java.lang.String[] shortWeekdays = symbols.getShortWeekdays();
		java.lang.String[] AmPmStrings = symbols.getAmPmStrings();
		int length = mPattern.length();
		int[] indexRef = new int[1];
		for (int i = 0; i < length; i++) {
			indexRef[0] = i;
			java.lang.String token = parseToken(mPattern, indexRef);
			i = indexRef[0];
			int tokenLen = token.length();
			if (tokenLen == 0) {
				break;
			}
			org.apache.commons.lang.time.FastDateFormat.Rule rule;
			char c = token.charAt(0);
			switch (c) {
				case 'G' :
					rule = new org.apache.commons.lang.time.FastDateFormat.TextField(java.util.Calendar.ERA, ERAs);
					break;
				case 'y' :
					if (tokenLen >= 4) {
						rule = selectNumberRule(java.util.Calendar.YEAR, tokenLen);
					}else {
						rule = org.apache.commons.lang.time.FastDateFormat.TwoDigitYearField.INSTANCE;
					}
					break;
				case 'M' :
					if (tokenLen >= 4) {
						rule = new org.apache.commons.lang.time.FastDateFormat.TextField(java.util.Calendar.MONTH, months);
					}else
						if (tokenLen == 3) {
							rule = new org.apache.commons.lang.time.FastDateFormat.TextField(java.util.Calendar.MONTH, shortMonths);
						}else
							if (tokenLen == 2) {
								rule = org.apache.commons.lang.time.FastDateFormat.TwoDigitMonthField.INSTANCE;
							}else {
								rule = org.apache.commons.lang.time.FastDateFormat.UnpaddedMonthField.INSTANCE;
							}
						
					
					break;
				case 'd' :
					rule = selectNumberRule(java.util.Calendar.DAY_OF_MONTH, tokenLen);
					break;
				case 'h' :
					rule = new org.apache.commons.lang.time.FastDateFormat.TwelveHourField(selectNumberRule(java.util.Calendar.HOUR, tokenLen));
					break;
				case 'H' :
					rule = selectNumberRule(java.util.Calendar.HOUR_OF_DAY, tokenLen);
					break;
				case 'm' :
					rule = selectNumberRule(java.util.Calendar.MINUTE, tokenLen);
					break;
				case 's' :
					rule = selectNumberRule(java.util.Calendar.SECOND, tokenLen);
					break;
				case 'S' :
					rule = selectNumberRule(java.util.Calendar.MILLISECOND, tokenLen);
					break;
				case 'E' :
					rule = new org.apache.commons.lang.time.FastDateFormat.TextField(java.util.Calendar.DAY_OF_WEEK, (tokenLen < 4 ? shortWeekdays : weekdays));
					break;
				case 'D' :
					rule = selectNumberRule(java.util.Calendar.DAY_OF_YEAR, tokenLen);
					break;
				case 'F' :
					rule = selectNumberRule(java.util.Calendar.DAY_OF_WEEK_IN_MONTH, tokenLen);
					break;
				case 'w' :
					rule = selectNumberRule(java.util.Calendar.WEEK_OF_YEAR, tokenLen);
					break;
				case 'W' :
					rule = selectNumberRule(java.util.Calendar.WEEK_OF_MONTH, tokenLen);
					break;
				case 'a' :
					rule = new org.apache.commons.lang.time.FastDateFormat.TextField(java.util.Calendar.AM_PM, AmPmStrings);
					break;
				case 'k' :
					rule = new org.apache.commons.lang.time.FastDateFormat.TwentyFourHourField(selectNumberRule(java.util.Calendar.HOUR_OF_DAY, tokenLen));
					break;
				case 'K' :
					rule = selectNumberRule(java.util.Calendar.HOUR, tokenLen);
					break;
				case 'z' :
					if (tokenLen >= 4) {
						rule = new org.apache.commons.lang.time.FastDateFormat.TimeZoneNameRule(mTimeZone, mTimeZoneForced, mLocale, java.util.TimeZone.LONG);
					}else {
						rule = new org.apache.commons.lang.time.FastDateFormat.TimeZoneNameRule(mTimeZone, mTimeZoneForced, mLocale, java.util.TimeZone.SHORT);
					}
					break;
				case 'Z' :
					if (tokenLen == 1) {
						rule = org.apache.commons.lang.time.FastDateFormat.TimeZoneNumberRule.INSTANCE_NO_COLON;
					}else {
						rule = org.apache.commons.lang.time.FastDateFormat.TimeZoneNumberRule.INSTANCE_COLON;
					}
					break;
				case '\'' :
					java.lang.String sub = token.substring(1);
					if ((sub.length()) == 1) {
						rule = new org.apache.commons.lang.time.FastDateFormat.CharacterLiteral(sub.charAt(0));
					}else {
						rule = new org.apache.commons.lang.time.FastDateFormat.StringLiteral(sub);
					}
					break;
				default :
					throw new java.lang.IllegalArgumentException(("Illegal pattern component: " + token));
			}
			rules.add(rule);
		}
		return rules;
	}

	protected java.lang.String parseToken(java.lang.String pattern, int[] indexRef) {
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

	protected org.apache.commons.lang.time.FastDateFormat.NumberRule selectNumberRule(int field, int padding) {
		switch (padding) {
			case 1 :
				return new org.apache.commons.lang.time.FastDateFormat.UnpaddedNumberField(field);
			case 2 :
				return new org.apache.commons.lang.time.FastDateFormat.TwoDigitNumberField(field);
			default :
				return new org.apache.commons.lang.time.FastDateFormat.PaddedNumberField(field, padding);
		}
	}

	@java.lang.Override
	public java.lang.StringBuffer format(java.lang.Object obj, java.lang.StringBuffer toAppendTo, java.text.FieldPosition pos) {
		if (obj instanceof java.util.Date) {
			return format(((java.util.Date) (obj)), toAppendTo);
		}else
			if (obj instanceof java.util.Calendar) {
				return format(((java.util.Calendar) (obj)), toAppendTo);
			}else
				if (obj instanceof java.lang.Long) {
					return format(((java.lang.Long) (obj)).longValue(), toAppendTo);
				}else {
					throw new java.lang.IllegalArgumentException(("Unknown class: " + (obj == null ? "<null>" : obj.getClass().getName())));
				}
			
		
	}

	public java.lang.String format(long millis) {
		return format(new java.util.Date(millis));
	}

	public java.lang.String format(java.util.Date date) {
		java.util.Calendar c = new java.util.GregorianCalendar(mTimeZone);
		c.setTime(date);
		return applyRules(c, new java.lang.StringBuffer(mMaxLengthEstimate)).toString();
	}

	public java.lang.String format(java.util.Calendar calendar) {
		return format(calendar, new java.lang.StringBuffer(mMaxLengthEstimate)).toString();
	}

	public java.lang.StringBuffer format(long millis, java.lang.StringBuffer buf) {
		return format(new java.util.Date(millis), buf);
	}

	public java.lang.StringBuffer format(java.util.Date date, java.lang.StringBuffer buf) {
		java.util.Calendar c = new java.util.GregorianCalendar(mTimeZone);
		c.setTime(date);
		return applyRules(c, buf);
	}

	public java.lang.StringBuffer format(java.util.Calendar calendar, java.lang.StringBuffer buf) {
		if (mTimeZoneForced) {
			calendar = ((java.util.Calendar) (calendar.clone()));
			calendar.setTimeZone(mTimeZone);
		}
		return applyRules(calendar, buf);
	}

	protected java.lang.StringBuffer applyRules(java.util.Calendar calendar, java.lang.StringBuffer buf) {
		org.apache.commons.lang.time.FastDateFormat.Rule[] rules = mRules;
		int len = mRules.length;
		for (int i = 0; i < len; i++) {
			rules[i].appendTo(buf, calendar);
		}
		return buf;
	}

	@java.lang.Override
	public java.lang.Object parseObject(java.lang.String source, java.text.ParsePosition pos) {
		pos.setIndex(0);
		pos.setErrorIndex(0);
		return null;
	}

	public java.lang.String getPattern() {
		return mPattern;
	}

	public java.util.TimeZone getTimeZone() {
		return mTimeZone;
	}

	public boolean getTimeZoneOverridesCalendar() {
		return mTimeZoneForced;
	}

	public java.util.Locale getLocale() {
		return mLocale;
	}

	public int getMaxLengthEstimate() {
		return mMaxLengthEstimate;
	}

	@java.lang.Override
	public boolean equals(java.lang.Object obj) {
		if ((obj instanceof org.apache.commons.lang.time.FastDateFormat) == false) {
			return false;
		}
		org.apache.commons.lang.time.FastDateFormat other = ((org.apache.commons.lang.time.FastDateFormat) (obj));
		if (((((((mPattern) == (other.mPattern)) || (mPattern.equals(other.mPattern))) && (((mTimeZone) == (other.mTimeZone)) || (mTimeZone.equals(other.mTimeZone)))) && (((mLocale) == (other.mLocale)) || (mLocale.equals(other.mLocale)))) && ((mTimeZoneForced) == (other.mTimeZoneForced))) && ((mLocaleForced) == (other.mLocaleForced))) {
			return true;
		}
		return false;
	}

	@java.lang.Override
	public int hashCode() {
		int total = 0;
		total += mPattern.hashCode();
		total += mTimeZone.hashCode();
		total += (mTimeZoneForced) ? 1 : 0;
		total += mLocale.hashCode();
		total += (mLocaleForced) ? 1 : 0;
		return total;
	}

	@java.lang.Override
	public java.lang.String toString() {
		return ("FastDateFormat[" + (mPattern)) + "]";
	}

	private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
		in.defaultReadObject();
		init();
	}

	private interface Rule {
		int estimateLength();

		void appendTo(java.lang.StringBuffer buffer, java.util.Calendar calendar);
	}

	private interface NumberRule extends org.apache.commons.lang.time.FastDateFormat.Rule {
		void appendTo(java.lang.StringBuffer buffer, int value);
	}

	private static class CharacterLiteral implements org.apache.commons.lang.time.FastDateFormat.Rule {
		private final char mValue;

		CharacterLiteral(char value) {
			mValue = value;
		}

		public int estimateLength() {
			return 1;
		}

		public void appendTo(java.lang.StringBuffer buffer, java.util.Calendar calendar) {
			buffer.append(mValue);
		}
	}

	private static class StringLiteral implements org.apache.commons.lang.time.FastDateFormat.Rule {
		private final java.lang.String mValue;

		StringLiteral(java.lang.String value) {
			mValue = value;
		}

		public int estimateLength() {
			return mValue.length();
		}

		public void appendTo(java.lang.StringBuffer buffer, java.util.Calendar calendar) {
			buffer.append(mValue);
		}
	}

	private static class TextField implements org.apache.commons.lang.time.FastDateFormat.Rule {
		private final int mField;

		private final java.lang.String[] mValues;

		TextField(int field, java.lang.String[] values) {
			mField = field;
			mValues = values;
		}

		public int estimateLength() {
			int max = 0;
			for (int i = mValues.length; (--i) >= 0;) {
				int len = mValues[i].length();
				if (len > max) {
					max = len;
				}
			}
			return max;
		}

		public void appendTo(java.lang.StringBuffer buffer, java.util.Calendar calendar) {
			buffer.append(mValues[calendar.get(mField)]);
		}
	}

	private static class UnpaddedNumberField implements org.apache.commons.lang.time.FastDateFormat.NumberRule {
		static final org.apache.commons.lang.time.FastDateFormat.UnpaddedNumberField INSTANCE_YEAR = new org.apache.commons.lang.time.FastDateFormat.UnpaddedNumberField(java.util.Calendar.YEAR);

		private final int mField;

		UnpaddedNumberField(int field) {
			mField = field;
		}

		public int estimateLength() {
			return 4;
		}

		public void appendTo(java.lang.StringBuffer buffer, java.util.Calendar calendar) {
			appendTo(buffer, calendar.get(mField));
		}

		public final void appendTo(java.lang.StringBuffer buffer, int value) {
			if (value < 10) {
				buffer.append(((char) (value + '0')));
			}else
				if (value < 100) {
					buffer.append(((char) ((value / 10) + '0')));
					buffer.append(((char) ((value % 10) + '0')));
				}else {
					buffer.append(java.lang.Integer.toString(value));
				}
			
		}
	}

	private static class UnpaddedMonthField implements org.apache.commons.lang.time.FastDateFormat.NumberRule {
		static final org.apache.commons.lang.time.FastDateFormat.UnpaddedMonthField INSTANCE = new org.apache.commons.lang.time.FastDateFormat.UnpaddedMonthField();

		UnpaddedMonthField() {
			super();
		}

		public int estimateLength() {
			return 2;
		}

		public void appendTo(java.lang.StringBuffer buffer, java.util.Calendar calendar) {
			appendTo(buffer, ((calendar.get(java.util.Calendar.MONTH)) + 1));
		}

		public final void appendTo(java.lang.StringBuffer buffer, int value) {
			if (value < 10) {
				buffer.append(((char) (value + '0')));
			}else {
				buffer.append(((char) ((value / 10) + '0')));
				buffer.append(((char) ((value % 10) + '0')));
			}
		}
	}

	private static class PaddedNumberField implements org.apache.commons.lang.time.FastDateFormat.NumberRule {
		private final int mField;

		private final int mSize;

		PaddedNumberField(int field, int size) {
			if (size < 3) {
				throw new java.lang.IllegalArgumentException();
			}
			mField = field;
			mSize = size;
		}

		public int estimateLength() {
			return 4;
		}

		public void appendTo(java.lang.StringBuffer buffer, java.util.Calendar calendar) {
			appendTo(buffer, calendar.get(mField));
		}

		public final void appendTo(java.lang.StringBuffer buffer, int value) {
			if (value < 100) {
				for (int i = mSize; (--i) >= 2;) {
					buffer.append('0');
				}
				buffer.append(((char) ((value / 10) + '0')));
				buffer.append(((char) ((value % 10) + '0')));
			}else {
				int digits;
				if (value < 1000) {
					digits = 3;
				}else {
					org.apache.commons.lang.Validate.isTrue((value > (-1)), "Negative values should not be possible", value);
					digits = java.lang.Integer.toString(value).length();
				}
				for (int i = mSize; (--i) >= digits;) {
					buffer.append('0');
				}
				buffer.append(java.lang.Integer.toString(value));
			}
		}
	}

	private static class TwoDigitNumberField implements org.apache.commons.lang.time.FastDateFormat.NumberRule {
		private final int mField;

		TwoDigitNumberField(int field) {
			mField = field;
		}

		public int estimateLength() {
			return 2;
		}

		public void appendTo(java.lang.StringBuffer buffer, java.util.Calendar calendar) {
			appendTo(buffer, calendar.get(mField));
		}

		public final void appendTo(java.lang.StringBuffer buffer, int value) {
			if (value < 100) {
				buffer.append(((char) ((value / 10) + '0')));
				buffer.append(((char) ((value % 10) + '0')));
			}else {
				buffer.append(java.lang.Integer.toString(value));
			}
		}
	}

	private static class TwoDigitYearField implements org.apache.commons.lang.time.FastDateFormat.NumberRule {
		static final org.apache.commons.lang.time.FastDateFormat.TwoDigitYearField INSTANCE = new org.apache.commons.lang.time.FastDateFormat.TwoDigitYearField();

		TwoDigitYearField() {
			super();
		}

		public int estimateLength() {
			return 2;
		}

		public void appendTo(java.lang.StringBuffer buffer, java.util.Calendar calendar) {
			appendTo(buffer, ((calendar.get(java.util.Calendar.YEAR)) % 100));
		}

		public final void appendTo(java.lang.StringBuffer buffer, int value) {
			buffer.append(((char) ((value / 10) + '0')));
			buffer.append(((char) ((value % 10) + '0')));
		}
	}

	private static class TwoDigitMonthField implements org.apache.commons.lang.time.FastDateFormat.NumberRule {
		static final org.apache.commons.lang.time.FastDateFormat.TwoDigitMonthField INSTANCE = new org.apache.commons.lang.time.FastDateFormat.TwoDigitMonthField();

		TwoDigitMonthField() {
			super();
		}

		public int estimateLength() {
			return 2;
		}

		public void appendTo(java.lang.StringBuffer buffer, java.util.Calendar calendar) {
			appendTo(buffer, ((calendar.get(java.util.Calendar.MONTH)) + 1));
		}

		public final void appendTo(java.lang.StringBuffer buffer, int value) {
			buffer.append(((char) ((value / 10) + '0')));
			buffer.append(((char) ((value % 10) + '0')));
		}
	}

	private static class TwelveHourField implements org.apache.commons.lang.time.FastDateFormat.NumberRule {
		private final org.apache.commons.lang.time.FastDateFormat.NumberRule mRule;

		TwelveHourField(org.apache.commons.lang.time.FastDateFormat.NumberRule rule) {
			mRule = rule;
		}

		public int estimateLength() {
			return mRule.estimateLength();
		}

		public void appendTo(java.lang.StringBuffer buffer, java.util.Calendar calendar) {
			int value = calendar.get(java.util.Calendar.HOUR);
			if (value == 0) {
				value = (calendar.getLeastMaximum(java.util.Calendar.HOUR)) + 1;
			}
			mRule.appendTo(buffer, value);
		}

		public void appendTo(java.lang.StringBuffer buffer, int value) {
			mRule.appendTo(buffer, value);
		}
	}

	private static class TwentyFourHourField implements org.apache.commons.lang.time.FastDateFormat.NumberRule {
		private final org.apache.commons.lang.time.FastDateFormat.NumberRule mRule;

		TwentyFourHourField(org.apache.commons.lang.time.FastDateFormat.NumberRule rule) {
			mRule = rule;
		}

		public int estimateLength() {
			return mRule.estimateLength();
		}

		public void appendTo(java.lang.StringBuffer buffer, java.util.Calendar calendar) {
			int value = calendar.get(java.util.Calendar.HOUR_OF_DAY);
			if (value == 0) {
				value = (calendar.getMaximum(java.util.Calendar.HOUR_OF_DAY)) + 1;
			}
			mRule.appendTo(buffer, value);
		}

		public void appendTo(java.lang.StringBuffer buffer, int value) {
			mRule.appendTo(buffer, value);
		}
	}

	private static class TimeZoneNameRule implements org.apache.commons.lang.time.FastDateFormat.Rule {
		private final java.util.TimeZone mTimeZone;

		private final boolean mTimeZoneForced;

		private final java.util.Locale mLocale;

		private final int mStyle;

		private final java.lang.String mStandard;

		private final java.lang.String mDaylight;

		TimeZoneNameRule(java.util.TimeZone timeZone, boolean timeZoneForced, java.util.Locale locale, int style) {
			mTimeZone = timeZone;
			mTimeZoneForced = timeZoneForced;
			mLocale = locale;
			mStyle = style;
			if (timeZoneForced) {
				mStandard = org.apache.commons.lang.time.FastDateFormat.getTimeZoneDisplay(timeZone, false, style, locale);
				mDaylight = org.apache.commons.lang.time.FastDateFormat.getTimeZoneDisplay(timeZone, true, style, locale);
			}else {
				mStandard = null;
				mDaylight = null;
			}
		}

		public int estimateLength() {
			if (mTimeZoneForced) {
				return java.lang.Math.max(mStandard.length(), mDaylight.length());
			}else
				if ((mStyle) == (java.util.TimeZone.SHORT)) {
					return 4;
				}else {
					return 40;
				}
			
		}

		public void appendTo(java.lang.StringBuffer buffer, java.util.Calendar calendar) {
			if (mTimeZoneForced) {
				if ((mTimeZone.useDaylightTime()) && ((calendar.get(java.util.Calendar.DST_OFFSET)) != 0)) {
					buffer.append(mDaylight);
				}else {
					buffer.append(mStandard);
				}
			}else {
				java.util.TimeZone timeZone = calendar.getTimeZone();
				if ((timeZone.useDaylightTime()) && ((calendar.get(java.util.Calendar.DST_OFFSET)) != 0)) {
					buffer.append(org.apache.commons.lang.time.FastDateFormat.getTimeZoneDisplay(timeZone, true, mStyle, mLocale));
				}else {
					buffer.append(org.apache.commons.lang.time.FastDateFormat.getTimeZoneDisplay(timeZone, false, mStyle, mLocale));
				}
			}
		}
	}

	private static class TimeZoneNumberRule implements org.apache.commons.lang.time.FastDateFormat.Rule {
		static final org.apache.commons.lang.time.FastDateFormat.TimeZoneNumberRule INSTANCE_COLON = new org.apache.commons.lang.time.FastDateFormat.TimeZoneNumberRule(true);

		static final org.apache.commons.lang.time.FastDateFormat.TimeZoneNumberRule INSTANCE_NO_COLON = new org.apache.commons.lang.time.FastDateFormat.TimeZoneNumberRule(false);

		final boolean mColon;

		TimeZoneNumberRule(boolean colon) {
			mColon = colon;
		}

		public int estimateLength() {
			return 5;
		}

		public void appendTo(java.lang.StringBuffer buffer, java.util.Calendar calendar) {
			int offset = (calendar.get(java.util.Calendar.ZONE_OFFSET)) + (calendar.get(java.util.Calendar.DST_OFFSET));
			if (offset < 0) {
				buffer.append('-');
				offset = -offset;
			}else {
				buffer.append('+');
			}
			int hours = offset / ((60 * 60) * 1000);
			buffer.append(((char) ((hours / 10) + '0')));
			buffer.append(((char) ((hours % 10) + '0')));
			if (mColon) {
				buffer.append(':');
			}
			int minutes = (offset / (60 * 1000)) - (60 * hours);
			buffer.append(((char) ((minutes / 10) + '0')));
			buffer.append(((char) ((minutes % 10) + '0')));
		}
	}

	private static class TimeZoneDisplayKey {
		private final java.util.TimeZone mTimeZone;

		private final int mStyle;

		private final java.util.Locale mLocale;

		TimeZoneDisplayKey(java.util.TimeZone timeZone, boolean daylight, int style, java.util.Locale locale) {
			mTimeZone = timeZone;
			if (daylight) {
				style |= -2147483648;
			}
			mStyle = style;
			mLocale = locale;
		}

		@java.lang.Override
		public int hashCode() {
			return ((mStyle) * 31) + (mLocale.hashCode());
		}

		@java.lang.Override
		public boolean equals(java.lang.Object obj) {
			if ((org.apache.commons.lang.time.FastDateFormat.TimeZoneDisplayKey.this) == obj) {
				return true;
			}
			if (obj instanceof org.apache.commons.lang.time.FastDateFormat.TimeZoneDisplayKey) {
				org.apache.commons.lang.time.FastDateFormat.TimeZoneDisplayKey other = ((org.apache.commons.lang.time.FastDateFormat.TimeZoneDisplayKey) (obj));
				return ((mTimeZone.equals(other.mTimeZone)) && ((mStyle) == (other.mStyle))) && (mLocale.equals(other.mLocale));
			}
			return false;
		}
	}

	private static class Pair {
		private final java.lang.Object mObj1;

		private final java.lang.Object mObj2;

		public Pair(java.lang.Object obj1, java.lang.Object obj2) {
			mObj1 = obj1;
			mObj2 = obj2;
		}

		@java.lang.Override
		public boolean equals(java.lang.Object obj) {
			if ((org.apache.commons.lang.time.FastDateFormat.Pair.this) == obj) {
				return true;
			}
			if (!(obj instanceof org.apache.commons.lang.time.FastDateFormat.Pair)) {
				return false;
			}
			org.apache.commons.lang.time.FastDateFormat.Pair key = ((org.apache.commons.lang.time.FastDateFormat.Pair) (obj));
			return ((mObj1) == null ? (key.mObj1) == null : mObj1.equals(key.mObj1)) && ((mObj2) == null ? (key.mObj2) == null : mObj2.equals(key.mObj2));
		}

		@java.lang.Override
		public int hashCode() {
			return ((mObj1) == null ? 0 : mObj1.hashCode()) + ((mObj2) == null ? 0 : mObj2.hashCode());
		}

		@java.lang.Override
		public java.lang.String toString() {
			return ((("[" + (mObj1)) + ':') + (mObj2)) + ']';
		}
	}
}

