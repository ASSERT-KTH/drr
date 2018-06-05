

package org.joda.time.convert;


class StringConverter extends org.joda.time.convert.AbstractConverter implements org.joda.time.convert.DurationConverter , org.joda.time.convert.InstantConverter , org.joda.time.convert.IntervalConverter , org.joda.time.convert.PartialConverter , org.joda.time.convert.PeriodConverter {
	static final org.joda.time.convert.StringConverter INSTANCE = new org.joda.time.convert.StringConverter();

	protected StringConverter() {
		super();
	}

	public long getInstantMillis(java.lang.Object object, org.joda.time.Chronology chrono) {
		java.lang.String str = ((java.lang.String) (object));
		org.joda.time.format.DateTimeFormatter p = org.joda.time.format.ISODateTimeFormat.dateTimeParser();
		return p.withChronology(chrono).parseMillis(str);
	}

	public int[] getPartialValues(org.joda.time.ReadablePartial fieldSource, java.lang.Object object, org.joda.time.Chronology chrono, org.joda.time.format.DateTimeFormatter parser) {
		if ((parser.getZone()) != null) {
			chrono = chrono.withZone(parser.getZone());
		}
		long millis = parser.withChronology(chrono).parseMillis(((java.lang.String) (object)));
		return chrono.get(fieldSource, millis);
	}

	public long getDurationMillis(java.lang.Object object) {
		java.lang.String original = ((java.lang.String) (object));
		java.lang.String str = original;
		int len = str.length();
		if ((((len >= 4) && (((str.charAt(0)) == 'P') || ((str.charAt(0)) == 'p'))) && (((str.charAt(1)) == 'T') || ((str.charAt(1)) == 't'))) && (((str.charAt((len - 1))) == 'S') || ((str.charAt((len - 1))) == 's'))) {
		}else {
			throw new java.lang.IllegalArgumentException((("Invalid format: \"" + original) + '"'));
		}
		str = str.substring(2, (len - 1));
		int dot = -1;
		for (int i = 0; i < (str.length()); i++) {
			if ((((str.charAt(i)) >= '0') && ((str.charAt(i)) <= '9')) || ((i == 0) && ((str.charAt(0)) == '-'))) {
			}else
				if (((i > 0) && ((str.charAt(i)) == '.')) && (dot == (-1))) {
					dot = i;
				}else {
					throw new java.lang.IllegalArgumentException((("Invalid format: \"" + original) + '"'));
				}
			
		}
		long millis = 0;
		long seconds = 0;
		if (dot > 0) {
			seconds = java.lang.Long.parseLong(str.substring(0, dot));
			str = str.substring((dot + 1));
			if ((str.length()) != 3) {
				str = (str + "000").substring(0, 3);
			}
			millis = java.lang.Integer.parseInt(str);
		}else {
			seconds = java.lang.Long.parseLong(str);
		}
		if (seconds < 0) {
			return org.joda.time.field.FieldUtils.safeAdd(org.joda.time.field.FieldUtils.safeMultiply(seconds, 1000), (-millis));
		}else {
			return org.joda.time.field.FieldUtils.safeAdd(org.joda.time.field.FieldUtils.safeMultiply(seconds, 1000), millis);
		}
	}

	public void setInto(org.joda.time.ReadWritablePeriod period, java.lang.Object object, org.joda.time.Chronology chrono) {
		java.lang.String str = ((java.lang.String) (object));
		org.joda.time.format.PeriodFormatter parser = org.joda.time.format.ISOPeriodFormat.standard();
		period.clear();
		int pos = parser.parseInto(period, str, 0);
		if (pos < (str.length())) {
			if (pos < 0) {
				parser.withParseType(period.getPeriodType()).parseMutablePeriod(str);
			}
			throw new java.lang.IllegalArgumentException((("Invalid format: \"" + str) + '"'));
		}
	}

	public void setInto(org.joda.time.ReadWritableInterval writableInterval, java.lang.Object object, org.joda.time.Chronology chrono) {
		java.lang.String str = ((java.lang.String) (object));
		int separator = str.indexOf('/');
		if (separator < 0) {
			throw new java.lang.IllegalArgumentException(("Format requires a '/' separator: " + str));
		}
		java.lang.String leftStr = str.substring(0, separator);
		if ((leftStr.length()) <= 0) {
			throw new java.lang.IllegalArgumentException(("Format invalid: " + str));
		}
		java.lang.String rightStr = str.substring((separator + 1));
		if ((rightStr.length()) <= 0) {
			throw new java.lang.IllegalArgumentException(("Format invalid: " + str));
		}
		org.joda.time.format.DateTimeFormatter dateTimeParser = org.joda.time.format.ISODateTimeFormat.dateTimeParser();
		dateTimeParser = dateTimeParser.withChronology(chrono);
		org.joda.time.format.PeriodFormatter periodParser = org.joda.time.format.ISOPeriodFormat.standard();
		long startInstant = 0;
		long endInstant = 0;
		org.joda.time.Period period = null;
		org.joda.time.Chronology parsedChrono = null;
		char c = leftStr.charAt(0);
		if ((c == 'P') || (c == 'p')) {
			period = periodParser.withParseType(getPeriodType(leftStr)).parsePeriod(leftStr);
		}else {
			org.joda.time.DateTime start = dateTimeParser.parseDateTime(leftStr);
			startInstant = start.getMillis();
			parsedChrono = start.getChronology();
		}
		c = rightStr.charAt(0);
		if ((c == 'P') || (c == 'p')) {
			if (period != null) {
				throw new java.lang.IllegalArgumentException(("Interval composed of two durations: " + str));
			}
			period = periodParser.withParseType(getPeriodType(rightStr)).parsePeriod(rightStr);
			chrono = (chrono != null) ? chrono : parsedChrono;
			endInstant = chrono.add(period, startInstant, 1);
		}else {
			org.joda.time.DateTime end = dateTimeParser.parseDateTime(rightStr);
			endInstant = end.getMillis();
			parsedChrono = (parsedChrono != null) ? parsedChrono : end.getChronology();
			chrono = (chrono != null) ? chrono : parsedChrono;
			if (period != null) {
				startInstant = chrono.add(period, endInstant, (-1));
			}
		}
		writableInterval.setInterval(startInstant, endInstant);
		writableInterval.setChronology(chrono);
	}

	public java.lang.Class<?> getSupportedType() {
		return java.lang.String.class;
	}
}

