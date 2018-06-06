

package org.joda.time.format;


public class DateTimeFormatterBuilder {
	private java.util.ArrayList<java.lang.Object> iElementPairs;

	private java.lang.Object iFormatter;

	public DateTimeFormatterBuilder() {
		super();
		iElementPairs = new java.util.ArrayList<java.lang.Object>();
	}

	public org.joda.time.format.DateTimeFormatter toFormatter() {
		java.lang.Object f = getFormatter();
		org.joda.time.format.DateTimePrinter printer = null;
		if (isPrinter(f)) {
			printer = ((org.joda.time.format.DateTimePrinter) (f));
		}
		org.joda.time.format.DateTimeParser parser = null;
		if (isParser(f)) {
			parser = ((org.joda.time.format.DateTimeParser) (f));
		}
		if ((printer != null) || (parser != null)) {
			return new org.joda.time.format.DateTimeFormatter(printer, parser);
		}
		throw new java.lang.UnsupportedOperationException("Both printing and parsing not supported");
	}

	public org.joda.time.format.DateTimePrinter toPrinter() {
		java.lang.Object f = getFormatter();
		if (isPrinter(f)) {
			return ((org.joda.time.format.DateTimePrinter) (f));
		}
		throw new java.lang.UnsupportedOperationException("Printing is not supported");
	}

	public org.joda.time.format.DateTimeParser toParser() {
		java.lang.Object f = getFormatter();
		if (isParser(f)) {
			return ((org.joda.time.format.DateTimeParser) (f));
		}
		throw new java.lang.UnsupportedOperationException("Parsing is not supported");
	}

	public boolean canBuildFormatter() {
		return isFormatter(getFormatter());
	}

	public boolean canBuildPrinter() {
		return isPrinter(getFormatter());
	}

	public boolean canBuildParser() {
		return isParser(getFormatter());
	}

	public void clear() {
		iFormatter = null;
		iElementPairs.clear();
	}

	public org.joda.time.format.DateTimeFormatterBuilder append(org.joda.time.format.DateTimeFormatter formatter) {
		if (formatter == null) {
			throw new java.lang.IllegalArgumentException("No formatter supplied");
		}
		return append0(formatter.getPrinter(), formatter.getParser());
	}

	public org.joda.time.format.DateTimeFormatterBuilder append(org.joda.time.format.DateTimePrinter printer) {
		checkPrinter(printer);
		return append0(printer, null);
	}

	public org.joda.time.format.DateTimeFormatterBuilder append(org.joda.time.format.DateTimeParser parser) {
		checkParser(parser);
		return append0(null, parser);
	}

	public org.joda.time.format.DateTimeFormatterBuilder append(org.joda.time.format.DateTimePrinter printer, org.joda.time.format.DateTimeParser parser) {
		checkPrinter(printer);
		checkParser(parser);
		return append0(printer, parser);
	}

	public org.joda.time.format.DateTimeFormatterBuilder append(org.joda.time.format.DateTimePrinter printer, org.joda.time.format.DateTimeParser[] parsers) {
		if (printer != null) {
			checkPrinter(printer);
		}
		if (parsers == null) {
			throw new java.lang.IllegalArgumentException("No parsers supplied");
		}
		int length = parsers.length;
		if (length == 1) {
			if ((parsers[0]) == null) {
				throw new java.lang.IllegalArgumentException("No parser supplied");
			}
			return append0(printer, parsers[0]);
		}
		org.joda.time.format.DateTimeParser[] copyOfParsers = new org.joda.time.format.DateTimeParser[length];
		int i;
		for (i = 0; i < (length - 1); i++) {
			if ((copyOfParsers[i] = parsers[i]) == null) {
				throw new java.lang.IllegalArgumentException("Incomplete parser array");
			}
		}
		copyOfParsers[i] = parsers[i];
		return append0(printer, new org.joda.time.format.DateTimeFormatterBuilder.MatchingParser(copyOfParsers));
	}

	public org.joda.time.format.DateTimeFormatterBuilder appendOptional(org.joda.time.format.DateTimeParser parser) {
		checkParser(parser);
		org.joda.time.format.DateTimeParser[] parsers = new org.joda.time.format.DateTimeParser[]{ parser , null };
		return append0(null, new org.joda.time.format.DateTimeFormatterBuilder.MatchingParser(parsers));
	}

	private void checkParser(org.joda.time.format.DateTimeParser parser) {
		if (parser == null) {
			throw new java.lang.IllegalArgumentException("No parser supplied");
		}
	}

	private void checkPrinter(org.joda.time.format.DateTimePrinter printer) {
		if (printer == null) {
			throw new java.lang.IllegalArgumentException("No printer supplied");
		}
	}

	private org.joda.time.format.DateTimeFormatterBuilder append0(java.lang.Object element) {
		iFormatter = null;
		iElementPairs.add(element);
		iElementPairs.add(element);
		return org.joda.time.format.DateTimeFormatterBuilder.this;
	}

	private org.joda.time.format.DateTimeFormatterBuilder append0(org.joda.time.format.DateTimePrinter printer, org.joda.time.format.DateTimeParser parser) {
		iFormatter = null;
		iElementPairs.add(printer);
		iElementPairs.add(parser);
		return org.joda.time.format.DateTimeFormatterBuilder.this;
	}

	public org.joda.time.format.DateTimeFormatterBuilder appendLiteral(char c) {
		return append0(new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral(c));
	}

	public org.joda.time.format.DateTimeFormatterBuilder appendLiteral(java.lang.String text) {
		if (text == null) {
			throw new java.lang.IllegalArgumentException("Literal must not be null");
		}
		switch (text.length()) {
			case 0 :
				return org.joda.time.format.DateTimeFormatterBuilder.this;
			case 1 :
				return append0(new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral(text.charAt(0)));
			default :
				return append0(new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral(text));
		}
	}

	public org.joda.time.format.DateTimeFormatterBuilder appendDecimal(org.joda.time.DateTimeFieldType fieldType, int minDigits, int maxDigits) {
		if (fieldType == null) {
			throw new java.lang.IllegalArgumentException("Field type must not be null");
		}
		if (maxDigits < minDigits) {
			maxDigits = minDigits;
		}
		if ((minDigits < 0) || (maxDigits <= 0)) {
			throw new java.lang.IllegalArgumentException();
		}
		if (minDigits <= 1) {
			return append0(new org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber(fieldType, maxDigits, false));
		}else {
			return append0(new org.joda.time.format.DateTimeFormatterBuilder.PaddedNumber(fieldType, maxDigits, false, minDigits));
		}
	}

	public org.joda.time.format.DateTimeFormatterBuilder appendFixedDecimal(org.joda.time.DateTimeFieldType fieldType, int numDigits) {
		if (fieldType == null) {
			throw new java.lang.IllegalArgumentException("Field type must not be null");
		}
		if (numDigits <= 0) {
			throw new java.lang.IllegalArgumentException(("Illegal number of digits: " + numDigits));
		}
		return append0(new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(fieldType, numDigits, false));
	}

	public org.joda.time.format.DateTimeFormatterBuilder appendSignedDecimal(org.joda.time.DateTimeFieldType fieldType, int minDigits, int maxDigits) {
		if (fieldType == null) {
			throw new java.lang.IllegalArgumentException("Field type must not be null");
		}
		if (maxDigits < minDigits) {
			maxDigits = minDigits;
		}
		if ((minDigits < 0) || (maxDigits <= 0)) {
			throw new java.lang.IllegalArgumentException();
		}
		if (minDigits <= 1) {
			return append0(new org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber(fieldType, maxDigits, true));
		}else {
			return append0(new org.joda.time.format.DateTimeFormatterBuilder.PaddedNumber(fieldType, maxDigits, true, minDigits));
		}
	}

	public org.joda.time.format.DateTimeFormatterBuilder appendFixedSignedDecimal(org.joda.time.DateTimeFieldType fieldType, int numDigits) {
		if (fieldType == null) {
			throw new java.lang.IllegalArgumentException("Field type must not be null");
		}
		if (numDigits <= 0) {
			throw new java.lang.IllegalArgumentException(("Illegal number of digits: " + numDigits));
		}
		return append0(new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(fieldType, numDigits, true));
	}

	public org.joda.time.format.DateTimeFormatterBuilder appendText(org.joda.time.DateTimeFieldType fieldType) {
		if (fieldType == null) {
			throw new java.lang.IllegalArgumentException("Field type must not be null");
		}
		return append0(new org.joda.time.format.DateTimeFormatterBuilder.TextField(fieldType, false));
	}

	public org.joda.time.format.DateTimeFormatterBuilder appendShortText(org.joda.time.DateTimeFieldType fieldType) {
		if (fieldType == null) {
			throw new java.lang.IllegalArgumentException("Field type must not be null");
		}
		return append0(new org.joda.time.format.DateTimeFormatterBuilder.TextField(fieldType, true));
	}

	public org.joda.time.format.DateTimeFormatterBuilder appendFraction(org.joda.time.DateTimeFieldType fieldType, int minDigits, int maxDigits) {
		if (fieldType == null) {
			throw new java.lang.IllegalArgumentException("Field type must not be null");
		}
		if (maxDigits < minDigits) {
			maxDigits = minDigits;
		}
		if ((minDigits < 0) || (maxDigits <= 0)) {
			throw new java.lang.IllegalArgumentException();
		}
		return append0(new org.joda.time.format.DateTimeFormatterBuilder.Fraction(fieldType, minDigits, maxDigits));
	}

	public org.joda.time.format.DateTimeFormatterBuilder appendFractionOfSecond(int minDigits, int maxDigits) {
		return appendFraction(org.joda.time.DateTimeFieldType.secondOfDay(), minDigits, maxDigits);
	}

	public org.joda.time.format.DateTimeFormatterBuilder appendFractionOfMinute(int minDigits, int maxDigits) {
		return appendFraction(org.joda.time.DateTimeFieldType.minuteOfDay(), minDigits, maxDigits);
	}

	public org.joda.time.format.DateTimeFormatterBuilder appendFractionOfHour(int minDigits, int maxDigits) {
		return appendFraction(org.joda.time.DateTimeFieldType.hourOfDay(), minDigits, maxDigits);
	}

	public org.joda.time.format.DateTimeFormatterBuilder appendFractionOfDay(int minDigits, int maxDigits) {
		return appendFraction(org.joda.time.DateTimeFieldType.dayOfYear(), minDigits, maxDigits);
	}

	public org.joda.time.format.DateTimeFormatterBuilder appendMillisOfSecond(int minDigits) {
		return appendDecimal(org.joda.time.DateTimeFieldType.millisOfSecond(), minDigits, 3);
	}

	public org.joda.time.format.DateTimeFormatterBuilder appendMillisOfDay(int minDigits) {
		return appendDecimal(org.joda.time.DateTimeFieldType.millisOfDay(), minDigits, 8);
	}

	public org.joda.time.format.DateTimeFormatterBuilder appendSecondOfMinute(int minDigits) {
		return appendDecimal(org.joda.time.DateTimeFieldType.secondOfMinute(), minDigits, 2);
	}

	public org.joda.time.format.DateTimeFormatterBuilder appendSecondOfDay(int minDigits) {
		return appendDecimal(org.joda.time.DateTimeFieldType.secondOfDay(), minDigits, 5);
	}

	public org.joda.time.format.DateTimeFormatterBuilder appendMinuteOfHour(int minDigits) {
		return appendDecimal(org.joda.time.DateTimeFieldType.minuteOfHour(), minDigits, 2);
	}

	public org.joda.time.format.DateTimeFormatterBuilder appendMinuteOfDay(int minDigits) {
		return appendDecimal(org.joda.time.DateTimeFieldType.minuteOfDay(), minDigits, 4);
	}

	public org.joda.time.format.DateTimeFormatterBuilder appendHourOfDay(int minDigits) {
		return appendDecimal(org.joda.time.DateTimeFieldType.hourOfDay(), minDigits, 2);
	}

	public org.joda.time.format.DateTimeFormatterBuilder appendClockhourOfDay(int minDigits) {
		return appendDecimal(org.joda.time.DateTimeFieldType.clockhourOfDay(), minDigits, 2);
	}

	public org.joda.time.format.DateTimeFormatterBuilder appendHourOfHalfday(int minDigits) {
		return appendDecimal(org.joda.time.DateTimeFieldType.hourOfHalfday(), minDigits, 2);
	}

	public org.joda.time.format.DateTimeFormatterBuilder appendClockhourOfHalfday(int minDigits) {
		return appendDecimal(org.joda.time.DateTimeFieldType.clockhourOfHalfday(), minDigits, 2);
	}

	public org.joda.time.format.DateTimeFormatterBuilder appendDayOfWeek(int minDigits) {
		return appendDecimal(org.joda.time.DateTimeFieldType.dayOfWeek(), minDigits, 1);
	}

	public org.joda.time.format.DateTimeFormatterBuilder appendDayOfMonth(int minDigits) {
		return appendDecimal(org.joda.time.DateTimeFieldType.dayOfMonth(), minDigits, 2);
	}

	public org.joda.time.format.DateTimeFormatterBuilder appendDayOfYear(int minDigits) {
		return appendDecimal(org.joda.time.DateTimeFieldType.dayOfYear(), minDigits, 3);
	}

	public org.joda.time.format.DateTimeFormatterBuilder appendWeekOfWeekyear(int minDigits) {
		return appendDecimal(org.joda.time.DateTimeFieldType.weekOfWeekyear(), minDigits, 2);
	}

	public org.joda.time.format.DateTimeFormatterBuilder appendWeekyear(int minDigits, int maxDigits) {
		return appendSignedDecimal(org.joda.time.DateTimeFieldType.weekyear(), minDigits, maxDigits);
	}

	public org.joda.time.format.DateTimeFormatterBuilder appendMonthOfYear(int minDigits) {
		return appendDecimal(org.joda.time.DateTimeFieldType.monthOfYear(), minDigits, 2);
	}

	public org.joda.time.format.DateTimeFormatterBuilder appendYear(int minDigits, int maxDigits) {
		return appendSignedDecimal(org.joda.time.DateTimeFieldType.year(), minDigits, maxDigits);
	}

	public org.joda.time.format.DateTimeFormatterBuilder appendTwoDigitYear(int pivot) {
		return appendTwoDigitYear(pivot, false);
	}

	public org.joda.time.format.DateTimeFormatterBuilder appendTwoDigitYear(int pivot, boolean lenientParse) {
		return append0(new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(org.joda.time.DateTimeFieldType.year(), pivot, lenientParse));
	}

	public org.joda.time.format.DateTimeFormatterBuilder appendTwoDigitWeekyear(int pivot) {
		return appendTwoDigitWeekyear(pivot, false);
	}

	public org.joda.time.format.DateTimeFormatterBuilder appendTwoDigitWeekyear(int pivot, boolean lenientParse) {
		return append0(new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(org.joda.time.DateTimeFieldType.weekyear(), pivot, lenientParse));
	}

	public org.joda.time.format.DateTimeFormatterBuilder appendYearOfEra(int minDigits, int maxDigits) {
		return appendDecimal(org.joda.time.DateTimeFieldType.yearOfEra(), minDigits, maxDigits);
	}

	public org.joda.time.format.DateTimeFormatterBuilder appendYearOfCentury(int minDigits, int maxDigits) {
		return appendDecimal(org.joda.time.DateTimeFieldType.yearOfCentury(), minDigits, maxDigits);
	}

	public org.joda.time.format.DateTimeFormatterBuilder appendCenturyOfEra(int minDigits, int maxDigits) {
		return appendSignedDecimal(org.joda.time.DateTimeFieldType.centuryOfEra(), minDigits, maxDigits);
	}

	public org.joda.time.format.DateTimeFormatterBuilder appendHalfdayOfDayText() {
		return appendText(org.joda.time.DateTimeFieldType.halfdayOfDay());
	}

	public org.joda.time.format.DateTimeFormatterBuilder appendDayOfWeekText() {
		return appendText(org.joda.time.DateTimeFieldType.dayOfWeek());
	}

	public org.joda.time.format.DateTimeFormatterBuilder appendDayOfWeekShortText() {
		return appendShortText(org.joda.time.DateTimeFieldType.dayOfWeek());
	}

	public org.joda.time.format.DateTimeFormatterBuilder appendMonthOfYearText() {
		return appendText(org.joda.time.DateTimeFieldType.monthOfYear());
	}

	public org.joda.time.format.DateTimeFormatterBuilder appendMonthOfYearShortText() {
		return appendShortText(org.joda.time.DateTimeFieldType.monthOfYear());
	}

	public org.joda.time.format.DateTimeFormatterBuilder appendEraText() {
		return appendText(org.joda.time.DateTimeFieldType.era());
	}

	public org.joda.time.format.DateTimeFormatterBuilder appendTimeZoneName() {
		return append0(new org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName(org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName.LONG_NAME), null);
	}

	public org.joda.time.format.DateTimeFormatterBuilder appendTimeZoneShortName() {
		return append0(new org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName(org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName.SHORT_NAME), null);
	}

	public org.joda.time.format.DateTimeFormatterBuilder appendTimeZoneId() {
		return append0(new org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName(org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName.ID), null);
	}

	public org.joda.time.format.DateTimeFormatterBuilder appendTimeZoneOffset(java.lang.String zeroOffsetText, boolean showSeparators, int minFields, int maxFields) {
		return append0(new org.joda.time.format.DateTimeFormatterBuilder.TimeZoneOffset(zeroOffsetText, zeroOffsetText, showSeparators, minFields, maxFields));
	}

	public org.joda.time.format.DateTimeFormatterBuilder appendTimeZoneOffset(java.lang.String zeroOffsetPrintText, java.lang.String zeroOffsetParseText, boolean showSeparators, int minFields, int maxFields) {
		return append0(new org.joda.time.format.DateTimeFormatterBuilder.TimeZoneOffset(zeroOffsetPrintText, zeroOffsetParseText, showSeparators, minFields, maxFields));
	}

	public org.joda.time.format.DateTimeFormatterBuilder appendPattern(java.lang.String pattern) {
		org.joda.time.format.DateTimeFormat.appendPatternTo(org.joda.time.format.DateTimeFormatterBuilder.this, pattern);
		return org.joda.time.format.DateTimeFormatterBuilder.this;
	}

	private java.lang.Object getFormatter() {
		java.lang.Object f = iFormatter;
		if (f == null) {
			if ((iElementPairs.size()) == 2) {
				java.lang.Object printer = iElementPairs.get(0);
				java.lang.Object parser = iElementPairs.get(1);
				if (printer != null) {
					if ((printer == parser) || (parser == null)) {
						f = printer;
					}
				}else {
					f = parser;
				}
			}
			if (f == null) {
				f = new org.joda.time.format.DateTimeFormatterBuilder.Composite(iElementPairs);
			}
			iFormatter = f;
		}
		return f;
	}

	private boolean isPrinter(java.lang.Object f) {
		if (f instanceof org.joda.time.format.DateTimePrinter) {
			if (f instanceof org.joda.time.format.DateTimeFormatterBuilder.Composite) {
				return ((org.joda.time.format.DateTimeFormatterBuilder.Composite) (f)).isPrinter();
			}
			return true;
		}
		return false;
	}

	private boolean isParser(java.lang.Object f) {
		if (f instanceof org.joda.time.format.DateTimeParser) {
			if (f instanceof org.joda.time.format.DateTimeFormatterBuilder.Composite) {
				return ((org.joda.time.format.DateTimeFormatterBuilder.Composite) (f)).isParser();
			}
			return true;
		}
		return false;
	}

	private boolean isFormatter(java.lang.Object f) {
		return (isPrinter(f)) || (isParser(f));
	}

	static void appendUnknownString(java.lang.StringBuffer buf, int len) {
		for (int i = len; (--i) >= 0;) {
			buf.append('\ufffd');
		}
	}

	static void printUnknownString(java.io.Writer out, int len) throws java.io.IOException {
		for (int i = len; (--i) >= 0;) {
			out.write('\ufffd');
		}
	}

	static class CharacterLiteral implements org.joda.time.format.DateTimeParser , org.joda.time.format.DateTimePrinter {
		private final char iValue;

		CharacterLiteral(char value) {
			super();
			iValue = value;
		}

		public int estimatePrintedLength() {
			return 1;
		}

		public void printTo(java.lang.StringBuffer buf, long instant, org.joda.time.Chronology chrono, int displayOffset, org.joda.time.DateTimeZone displayZone, java.util.Locale locale) {
			buf.append(iValue);
		}

		public void printTo(java.io.Writer out, long instant, org.joda.time.Chronology chrono, int displayOffset, org.joda.time.DateTimeZone displayZone, java.util.Locale locale) throws java.io.IOException {
			out.write(iValue);
		}

		public void printTo(java.lang.StringBuffer buf, org.joda.time.ReadablePartial partial, java.util.Locale locale) {
			buf.append(iValue);
		}

		public void printTo(java.io.Writer out, org.joda.time.ReadablePartial partial, java.util.Locale locale) throws java.io.IOException {
			out.write(iValue);
		}

		public int estimateParsedLength() {
			return 1;
		}

		public int parseInto(org.joda.time.format.DateTimeParserBucket bucket, java.lang.String text, int position) {
			if (position >= (text.length())) {
				return ~position;
			}
			char a = text.charAt(position);
			char b = iValue;
			if (a != b) {
				a = java.lang.Character.toUpperCase(a);
				b = java.lang.Character.toUpperCase(b);
				if (a != b) {
					a = java.lang.Character.toLowerCase(a);
					b = java.lang.Character.toLowerCase(b);
					if (a != b) {
						return ~position;
					}
				}
			}
			return position + 1;
		}
	}

	static class StringLiteral implements org.joda.time.format.DateTimeParser , org.joda.time.format.DateTimePrinter {
		private final java.lang.String iValue;

		StringLiteral(java.lang.String value) {
			super();
			iValue = value;
		}

		public int estimatePrintedLength() {
			return iValue.length();
		}

		public void printTo(java.lang.StringBuffer buf, long instant, org.joda.time.Chronology chrono, int displayOffset, org.joda.time.DateTimeZone displayZone, java.util.Locale locale) {
			buf.append(iValue);
		}

		public void printTo(java.io.Writer out, long instant, org.joda.time.Chronology chrono, int displayOffset, org.joda.time.DateTimeZone displayZone, java.util.Locale locale) throws java.io.IOException {
			out.write(iValue);
		}

		public void printTo(java.lang.StringBuffer buf, org.joda.time.ReadablePartial partial, java.util.Locale locale) {
			buf.append(iValue);
		}

		public void printTo(java.io.Writer out, org.joda.time.ReadablePartial partial, java.util.Locale locale) throws java.io.IOException {
			out.write(iValue);
		}

		public int estimateParsedLength() {
			return iValue.length();
		}

		public int parseInto(org.joda.time.format.DateTimeParserBucket bucket, java.lang.String text, int position) {
			if (text.regionMatches(true, position, iValue, 0, iValue.length())) {
				return position + (iValue.length());
			}
			return ~position;
		}
	}

	abstract static class NumberFormatter implements org.joda.time.format.DateTimeParser , org.joda.time.format.DateTimePrinter {
		protected final org.joda.time.DateTimeFieldType iFieldType;

		protected final int iMaxParsedDigits;

		protected final boolean iSigned;

		NumberFormatter(org.joda.time.DateTimeFieldType fieldType, int maxParsedDigits, boolean signed) {
			super();
			iFieldType = fieldType;
			iMaxParsedDigits = maxParsedDigits;
			iSigned = signed;
		}

		public int estimateParsedLength() {
			return iMaxParsedDigits;
		}

		public int parseInto(org.joda.time.format.DateTimeParserBucket bucket, java.lang.String text, int position) {
			int limit = java.lang.Math.min(iMaxParsedDigits, ((text.length()) - position));
			boolean negative = false;
			int length = 0;
			while (length < limit) {
				char c = text.charAt((position + length));
				if (((length == 0) && ((c == '-') || (c == '+'))) && (iSigned)) {
					negative = c == '-';
					if ((((length + 1) >= limit) || ((c = text.charAt(((position + length) + 1))) < '0')) || (c > '9')) {
						break;
					}
					if (negative) {
						length++;
					}else {
						position++;
					}
					limit = java.lang.Math.min((limit + 1), ((text.length()) - position));
					continue;
				}
				if ((c < '0') || (c > '9')) {
					break;
				}
				length++;
			} 
			if (length == 0) {
				return ~position;
			}
			int value;
			if (length >= 9) {
				value = java.lang.Integer.parseInt(text.substring(position, (position += length)));
			}else {
				int i = position;
				if (negative) {
					i++;
				}
				try {
					value = (text.charAt((i++))) - '0';
				} catch (java.lang.StringIndexOutOfBoundsException e) {
					return ~position;
				}
				position += length;
				while (i < position) {
					value = (((value << 3) + (value << 1)) + (text.charAt((i++)))) - '0';
				} 
				if (negative) {
					value = -value;
				}
			}
			bucket.saveField(iFieldType, value);
			return position;
		}
	}

	static class UnpaddedNumber extends org.joda.time.format.DateTimeFormatterBuilder.NumberFormatter {
		protected UnpaddedNumber(org.joda.time.DateTimeFieldType fieldType, int maxParsedDigits, boolean signed) {
			super(fieldType, maxParsedDigits, signed);
		}

		public int estimatePrintedLength() {
			return iMaxParsedDigits;
		}

		public void printTo(java.lang.StringBuffer buf, long instant, org.joda.time.Chronology chrono, int displayOffset, org.joda.time.DateTimeZone displayZone, java.util.Locale locale) {
			try {
				org.joda.time.DateTimeField field = iFieldType.getField(chrono);
				org.joda.time.format.FormatUtils.appendUnpaddedInteger(buf, field.get(instant));
			} catch (java.lang.RuntimeException e) {
				buf.append('\ufffd');
			}
		}

		public void printTo(java.io.Writer out, long instant, org.joda.time.Chronology chrono, int displayOffset, org.joda.time.DateTimeZone displayZone, java.util.Locale locale) throws java.io.IOException {
			try {
				org.joda.time.DateTimeField field = iFieldType.getField(chrono);
				org.joda.time.format.FormatUtils.writeUnpaddedInteger(out, field.get(instant));
			} catch (java.lang.RuntimeException e) {
				out.write('\ufffd');
			}
		}

		public void printTo(java.lang.StringBuffer buf, org.joda.time.ReadablePartial partial, java.util.Locale locale) {
			if (partial.isSupported(iFieldType)) {
				try {
					org.joda.time.format.FormatUtils.appendUnpaddedInteger(buf, partial.get(iFieldType));
				} catch (java.lang.RuntimeException e) {
					buf.append('\ufffd');
				}
			}else {
				buf.append('\ufffd');
			}
		}

		public void printTo(java.io.Writer out, org.joda.time.ReadablePartial partial, java.util.Locale locale) throws java.io.IOException {
			if (partial.isSupported(iFieldType)) {
				try {
					org.joda.time.format.FormatUtils.writeUnpaddedInteger(out, partial.get(iFieldType));
				} catch (java.lang.RuntimeException e) {
					out.write('\ufffd');
				}
			}else {
				out.write('\ufffd');
			}
		}
	}

	static class PaddedNumber extends org.joda.time.format.DateTimeFormatterBuilder.NumberFormatter {
		protected final int iMinPrintedDigits;

		protected PaddedNumber(org.joda.time.DateTimeFieldType fieldType, int maxParsedDigits, boolean signed, int minPrintedDigits) {
			super(fieldType, maxParsedDigits, signed);
			iMinPrintedDigits = minPrintedDigits;
		}

		public int estimatePrintedLength() {
			return iMaxParsedDigits;
		}

		public void printTo(java.lang.StringBuffer buf, long instant, org.joda.time.Chronology chrono, int displayOffset, org.joda.time.DateTimeZone displayZone, java.util.Locale locale) {
			try {
				org.joda.time.DateTimeField field = iFieldType.getField(chrono);
				org.joda.time.format.FormatUtils.appendPaddedInteger(buf, field.get(instant), iMinPrintedDigits);
			} catch (java.lang.RuntimeException e) {
				org.joda.time.format.DateTimeFormatterBuilder.appendUnknownString(buf, iMinPrintedDigits);
			}
		}

		public void printTo(java.io.Writer out, long instant, org.joda.time.Chronology chrono, int displayOffset, org.joda.time.DateTimeZone displayZone, java.util.Locale locale) throws java.io.IOException {
			try {
				org.joda.time.DateTimeField field = iFieldType.getField(chrono);
				org.joda.time.format.FormatUtils.writePaddedInteger(out, field.get(instant), iMinPrintedDigits);
			} catch (java.lang.RuntimeException e) {
				org.joda.time.format.DateTimeFormatterBuilder.printUnknownString(out, iMinPrintedDigits);
			}
		}

		public void printTo(java.lang.StringBuffer buf, org.joda.time.ReadablePartial partial, java.util.Locale locale) {
			if (partial.isSupported(iFieldType)) {
				try {
					org.joda.time.format.FormatUtils.appendPaddedInteger(buf, partial.get(iFieldType), iMinPrintedDigits);
				} catch (java.lang.RuntimeException e) {
					org.joda.time.format.DateTimeFormatterBuilder.appendUnknownString(buf, iMinPrintedDigits);
				}
			}else {
				org.joda.time.format.DateTimeFormatterBuilder.appendUnknownString(buf, iMinPrintedDigits);
			}
		}

		public void printTo(java.io.Writer out, org.joda.time.ReadablePartial partial, java.util.Locale locale) throws java.io.IOException {
			if (partial.isSupported(iFieldType)) {
				try {
					org.joda.time.format.FormatUtils.writePaddedInteger(out, partial.get(iFieldType), iMinPrintedDigits);
				} catch (java.lang.RuntimeException e) {
					org.joda.time.format.DateTimeFormatterBuilder.printUnknownString(out, iMinPrintedDigits);
				}
			}else {
				org.joda.time.format.DateTimeFormatterBuilder.printUnknownString(out, iMinPrintedDigits);
			}
		}
	}

	static class FixedNumber extends org.joda.time.format.DateTimeFormatterBuilder.PaddedNumber {
		protected FixedNumber(org.joda.time.DateTimeFieldType fieldType, int numDigits, boolean signed) {
			super(fieldType, numDigits, signed, numDigits);
		}

		public int parseInto(org.joda.time.format.DateTimeParserBucket bucket, java.lang.String text, int position) {
			int newPos = super.parseInto(bucket, text, position);
			if (newPos < 0) {
				return newPos;
			}
			int expectedPos = position + (iMaxParsedDigits);
			if (newPos != expectedPos) {
				if (iSigned) {
					char c = text.charAt(position);
					if ((c == '-') || (c == '+')) {
						expectedPos++;
					}
				}
				if (newPos > expectedPos) {
					return ~(expectedPos + 1);
				}else
					if (newPos < expectedPos) {
						return ~newPos;
					}
				
			}
			return newPos;
		}
	}

	static class TwoDigitYear implements org.joda.time.format.DateTimeParser , org.joda.time.format.DateTimePrinter {
		private final org.joda.time.DateTimeFieldType iType;

		private final int iPivot;

		private final boolean iLenientParse;

		TwoDigitYear(org.joda.time.DateTimeFieldType type, int pivot, boolean lenientParse) {
			super();
			iType = type;
			iPivot = pivot;
			iLenientParse = lenientParse;
		}

		public int estimateParsedLength() {
			return iLenientParse ? 4 : 2;
		}

		public int parseInto(org.joda.time.format.DateTimeParserBucket bucket, java.lang.String text, int position) {
			int limit = (text.length()) - position;
			if (!(iLenientParse)) {
				limit = java.lang.Math.min(2, limit);
				if (limit < 2) {
					return ~position;
				}
			}else {
				boolean hasSignChar = false;
				boolean negative = false;
				int length = 0;
				while (length < limit) {
					char c = text.charAt((position + length));
					if ((length == 0) && ((c == '-') || (c == '+'))) {
						hasSignChar = true;
						negative = c == '-';
						if (negative) {
							length++;
						}else {
							position++;
							limit--;
						}
						continue;
					}
					if ((c < '0') || (c > '9')) {
						break;
					}
					length++;
				} 
				if (length == 0) {
					return ~position;
				}
				if (hasSignChar || (length != 2)) {
					int value;
					if (length >= 9) {
						value = java.lang.Integer.parseInt(text.substring(position, (position += length)));
					}else {
						int i = position;
						if (negative) {
							i++;
						}
						try {
							value = (text.charAt((i++))) - '0';
						} catch (java.lang.StringIndexOutOfBoundsException e) {
							return ~position;
						}
						position += length;
						while (i < position) {
							value = (((value << 3) + (value << 1)) + (text.charAt((i++)))) - '0';
						} 
						if (negative) {
							value = -value;
						}
					}
					bucket.saveField(iType, value);
					return position;
				}
			}
			int year;
			char c = text.charAt(position);
			if ((c < '0') || (c > '9')) {
				return ~position;
			}
			year = c - '0';
			c = text.charAt((position + 1));
			if ((c < '0') || (c > '9')) {
				return ~position;
			}
			year = (((year << 3) + (year << 1)) + c) - '0';
			int pivot = iPivot;
			if ((bucket.getPivotYear()) != null) {
				pivot = bucket.getPivotYear().intValue();
			}
			int low = pivot - 50;
			int t;
			if (low >= 0) {
				t = low % 100;
			}else {
				t = 99 + ((low + 1) % 100);
			}
			year += (low + (year < t ? 100 : 0)) - t;
			bucket.saveField(iType, year);
			return position + 2;
		}

		public int estimatePrintedLength() {
			return 2;
		}

		public void printTo(java.lang.StringBuffer buf, long instant, org.joda.time.Chronology chrono, int displayOffset, org.joda.time.DateTimeZone displayZone, java.util.Locale locale) {
			int year = getTwoDigitYear(instant, chrono);
			if (year < 0) {
				buf.append('\ufffd');
				buf.append('\ufffd');
			}else {
				org.joda.time.format.FormatUtils.appendPaddedInteger(buf, year, 2);
			}
		}

		public void printTo(java.io.Writer out, long instant, org.joda.time.Chronology chrono, int displayOffset, org.joda.time.DateTimeZone displayZone, java.util.Locale locale) throws java.io.IOException {
			int year = getTwoDigitYear(instant, chrono);
			if (year < 0) {
				out.write('\ufffd');
				out.write('\ufffd');
			}else {
				org.joda.time.format.FormatUtils.writePaddedInteger(out, year, 2);
			}
		}

		private int getTwoDigitYear(long instant, org.joda.time.Chronology chrono) {
			try {
				int year = iType.getField(chrono).get(instant);
				if (year < 0) {
					year = -year;
				}
				return year % 100;
			} catch (java.lang.RuntimeException e) {
				return -1;
			}
		}

		public void printTo(java.lang.StringBuffer buf, org.joda.time.ReadablePartial partial, java.util.Locale locale) {
			int year = getTwoDigitYear(partial);
			if (year < 0) {
				buf.append('\ufffd');
				buf.append('\ufffd');
			}else {
				org.joda.time.format.FormatUtils.appendPaddedInteger(buf, year, 2);
			}
		}

		public void printTo(java.io.Writer out, org.joda.time.ReadablePartial partial, java.util.Locale locale) throws java.io.IOException {
			int year = getTwoDigitYear(partial);
			if (year < 0) {
				out.write('\ufffd');
				out.write('\ufffd');
			}else {
				org.joda.time.format.FormatUtils.writePaddedInteger(out, year, 2);
			}
		}

		private int getTwoDigitYear(org.joda.time.ReadablePartial partial) {
			if (partial.isSupported(iType)) {
				try {
					int year = partial.get(iType);
					if (year < 0) {
						year = -year;
					}
					return year % 100;
				} catch (java.lang.RuntimeException e) {
				}
			}
			return -1;
		}
	}

	static class TextField implements org.joda.time.format.DateTimeParser , org.joda.time.format.DateTimePrinter {
		private static java.util.Map<java.util.Locale, java.util.Map<org.joda.time.DateTimeFieldType, java.lang.Object[]>> cParseCache = new java.util.HashMap<java.util.Locale, java.util.Map<org.joda.time.DateTimeFieldType, java.lang.Object[]>>();

		private final org.joda.time.DateTimeFieldType iFieldType;

		private final boolean iShort;

		TextField(org.joda.time.DateTimeFieldType fieldType, boolean isShort) {
			super();
			iFieldType = fieldType;
			iShort = isShort;
		}

		public int estimatePrintedLength() {
			return iShort ? 6 : 20;
		}

		public void printTo(java.lang.StringBuffer buf, long instant, org.joda.time.Chronology chrono, int displayOffset, org.joda.time.DateTimeZone displayZone, java.util.Locale locale) {
			try {
				buf.append(print(instant, chrono, locale));
			} catch (java.lang.RuntimeException e) {
				buf.append('\ufffd');
			}
		}

		public void printTo(java.io.Writer out, long instant, org.joda.time.Chronology chrono, int displayOffset, org.joda.time.DateTimeZone displayZone, java.util.Locale locale) throws java.io.IOException {
			try {
				out.write(print(instant, chrono, locale));
			} catch (java.lang.RuntimeException e) {
				out.write('\ufffd');
			}
		}

		public void printTo(java.lang.StringBuffer buf, org.joda.time.ReadablePartial partial, java.util.Locale locale) {
			try {
				buf.append(print(partial, locale));
			} catch (java.lang.RuntimeException e) {
				buf.append('\ufffd');
			}
		}

		public void printTo(java.io.Writer out, org.joda.time.ReadablePartial partial, java.util.Locale locale) throws java.io.IOException {
			try {
				out.write(print(partial, locale));
			} catch (java.lang.RuntimeException e) {
				out.write('\ufffd');
			}
		}

		private java.lang.String print(long instant, org.joda.time.Chronology chrono, java.util.Locale locale) {
			org.joda.time.DateTimeField field = iFieldType.getField(chrono);
			if (iShort) {
				return field.getAsShortText(instant, locale);
			}else {
				return field.getAsText(instant, locale);
			}
		}

		private java.lang.String print(org.joda.time.ReadablePartial partial, java.util.Locale locale) {
			if (partial.isSupported(iFieldType)) {
				org.joda.time.DateTimeField field = iFieldType.getField(partial.getChronology());
				if (iShort) {
					return field.getAsShortText(partial, locale);
				}else {
					return field.getAsText(partial, locale);
				}
			}else {
				return "\ufffd";
			}
		}

		public int estimateParsedLength() {
			return estimatePrintedLength();
		}

		@java.lang.SuppressWarnings(value = "unchecked")
		public int parseInto(org.joda.time.format.DateTimeParserBucket bucket, java.lang.String text, int position) {
			java.util.Locale locale = bucket.getLocale();
			java.util.Set<java.lang.String> validValues = null;
			int maxLength = 0;
			synchronized(org.joda.time.format.DateTimeFormatterBuilder.TextField.cParseCache) {
				java.util.Map<org.joda.time.DateTimeFieldType, java.lang.Object[]> innerMap = org.joda.time.format.DateTimeFormatterBuilder.TextField.cParseCache.get(locale);
				if (innerMap == null) {
					innerMap = new java.util.HashMap<org.joda.time.DateTimeFieldType, java.lang.Object[]>();
					org.joda.time.format.DateTimeFormatterBuilder.TextField.cParseCache.put(locale, innerMap);
				}
				java.lang.Object[] array = innerMap.get(iFieldType);
				if (array == null) {
					validValues = new java.util.HashSet<java.lang.String>(32);
					org.joda.time.MutableDateTime dt = new org.joda.time.MutableDateTime(0L, org.joda.time.DateTimeZone.UTC);
					org.joda.time.MutableDateTime.Property property = dt.property(iFieldType);
					int min = property.getMinimumValueOverall();
					int max = property.getMaximumValueOverall();
					if ((max - min) > 32) {
						return ~position;
					}
					maxLength = property.getMaximumTextLength(locale);
					for (int i = min; i <= max; i++) {
						property.set(i);
						validValues.add(property.getAsShortText(locale));
						validValues.add(property.getAsShortText(locale).toLowerCase(locale));
						validValues.add(property.getAsShortText(locale).toUpperCase(locale));
						validValues.add(property.getAsText(locale));
						validValues.add(property.getAsText(locale).toLowerCase(locale));
						validValues.add(property.getAsText(locale).toUpperCase(locale));
					}
					if (("en".equals(locale.getLanguage())) && ((iFieldType) == (org.joda.time.DateTimeFieldType.era()))) {
						validValues.add("BCE");
						validValues.add("bce");
						validValues.add("CE");
						validValues.add("ce");
						maxLength = 3;
					}
					array = new java.lang.Object[]{ validValues , new java.lang.Integer(maxLength) };
					innerMap.put(iFieldType, array);
				}else {
					validValues = ((java.util.Set<java.lang.String>) (array[0]));
					maxLength = ((java.lang.Integer) (array[1])).intValue();
				}
			}
			int limit = java.lang.Math.min(text.length(), (position + maxLength));
			for (int i = limit; i > position; i--) {
				java.lang.String match = text.substring(position, i);
				if (validValues.contains(match)) {
					bucket.saveField(iFieldType, match, locale);
					return i;
				}
			}
			return ~position;
		}
	}

	static class Fraction implements org.joda.time.format.DateTimeParser , org.joda.time.format.DateTimePrinter {
		private final org.joda.time.DateTimeFieldType iFieldType;

		protected int iMinDigits;

		protected int iMaxDigits;

		protected Fraction(org.joda.time.DateTimeFieldType fieldType, int minDigits, int maxDigits) {
			super();
			iFieldType = fieldType;
			if (maxDigits > 18) {
				maxDigits = 18;
			}
			iMinDigits = minDigits;
			iMaxDigits = maxDigits;
		}

		public int estimatePrintedLength() {
			return iMaxDigits;
		}

		public void printTo(java.lang.StringBuffer buf, long instant, org.joda.time.Chronology chrono, int displayOffset, org.joda.time.DateTimeZone displayZone, java.util.Locale locale) {
			try {
				printTo(buf, null, instant, chrono);
			} catch (java.io.IOException e) {
			}
		}

		public void printTo(java.io.Writer out, long instant, org.joda.time.Chronology chrono, int displayOffset, org.joda.time.DateTimeZone displayZone, java.util.Locale locale) throws java.io.IOException {
			printTo(null, out, instant, chrono);
		}

		public void printTo(java.lang.StringBuffer buf, org.joda.time.ReadablePartial partial, java.util.Locale locale) {
			long millis = partial.getChronology().set(partial, 0L);
			try {
				printTo(buf, null, millis, partial.getChronology());
			} catch (java.io.IOException e) {
			}
		}

		public void printTo(java.io.Writer out, org.joda.time.ReadablePartial partial, java.util.Locale locale) throws java.io.IOException {
			long millis = partial.getChronology().set(partial, 0L);
			printTo(null, out, millis, partial.getChronology());
		}

		protected void printTo(java.lang.StringBuffer buf, java.io.Writer out, long instant, org.joda.time.Chronology chrono) throws java.io.IOException {
			org.joda.time.DateTimeField field = iFieldType.getField(chrono);
			int minDigits = iMinDigits;
			long fraction;
			try {
				fraction = field.remainder(instant);
			} catch (java.lang.RuntimeException e) {
				if (buf != null) {
					org.joda.time.format.DateTimeFormatterBuilder.appendUnknownString(buf, minDigits);
				}else {
					org.joda.time.format.DateTimeFormatterBuilder.printUnknownString(out, minDigits);
				}
				return ;
			}
			if (fraction == 0) {
				if (buf != null) {
					while ((--minDigits) >= 0) {
						buf.append('0');
					} 
				}else {
					while ((--minDigits) >= 0) {
						out.write('0');
					} 
				}
				return ;
			}
			java.lang.String str;
			long[] fractionData = getFractionData(fraction, field);
			long scaled = fractionData[0];
			int maxDigits = ((int) (fractionData[1]));
			if ((scaled & 2147483647) == scaled) {
				str = java.lang.Integer.toString(((int) (scaled)));
			}else {
				str = java.lang.Long.toString(scaled);
			}
			int length = str.length();
			int digits = maxDigits;
			while (length < digits) {
				if (buf != null) {
					buf.append('0');
				}else {
					out.write('0');
				}
				minDigits--;
				digits--;
			} 
			if (minDigits < digits) {
				while (minDigits < digits) {
					if ((length <= 1) || ((str.charAt((length - 1))) != '0')) {
						break;
					}
					digits--;
					length--;
				} 
				if (length < (str.length())) {
					if (buf != null) {
						for (int i = 0; i < length; i++) {
							buf.append(str.charAt(i));
						}
					}else {
						for (int i = 0; i < length; i++) {
							out.write(str.charAt(i));
						}
					}
					return ;
				}
			}
			if (buf != null) {
				buf.append(str);
			}else {
				out.write(str);
			}
		}

		private long[] getFractionData(long fraction, org.joda.time.DateTimeField field) {
			long rangeMillis = field.getDurationField().getUnitMillis();
			long scalar;
			int maxDigits = iMaxDigits;
			while (true) {
				switch (maxDigits) {
					default :
						scalar = 1L;
						break;
					case 1 :
						scalar = 10L;
						break;
					case 2 :
						scalar = 100L;
						break;
					case 3 :
						scalar = 1000L;
						break;
					case 4 :
						scalar = 10000L;
						break;
					case 5 :
						scalar = 100000L;
						break;
					case 6 :
						scalar = 1000000L;
						break;
					case 7 :
						scalar = 10000000L;
						break;
					case 8 :
						scalar = 100000000L;
						break;
					case 9 :
						scalar = 1000000000L;
						break;
					case 10 :
						scalar = 10000000000L;
						break;
					case 11 :
						scalar = 100000000000L;
						break;
					case 12 :
						scalar = 1000000000000L;
						break;
					case 13 :
						scalar = 10000000000000L;
						break;
					case 14 :
						scalar = 100000000000000L;
						break;
					case 15 :
						scalar = 1000000000000000L;
						break;
					case 16 :
						scalar = 10000000000000000L;
						break;
					case 17 :
						scalar = 100000000000000000L;
						break;
					case 18 :
						scalar = 1000000000000000000L;
						break;
				}
				if (((rangeMillis * scalar) / scalar) == rangeMillis) {
					break;
				}
				maxDigits--;
			} 
			return new long[]{ (fraction * scalar) / rangeMillis , maxDigits };
		}

		public int estimateParsedLength() {
			return iMaxDigits;
		}

		public int parseInto(org.joda.time.format.DateTimeParserBucket bucket, java.lang.String text, int position) {
			org.joda.time.DateTimeField field = iFieldType.getField(bucket.getChronology());
			int limit = java.lang.Math.min(iMaxDigits, ((text.length()) - position));
			long value = 0;
			long n = (field.getDurationField().getUnitMillis()) * 10;
			int length = 0;
			while (length < limit) {
				char c = text.charAt((position + length));
				if ((c < '0') || (c > '9')) {
					break;
				}
				length++;
				long nn = n / 10;
				value += (c - '0') * nn;
				n = nn;
			} 
			value /= 10;
			if (length == 0) {
				return ~position;
			}
			if (value > (java.lang.Integer.MAX_VALUE)) {
				return ~position;
			}
			org.joda.time.DateTimeField parseField = new org.joda.time.field.PreciseDateTimeField(org.joda.time.DateTimeFieldType.millisOfSecond(), org.joda.time.field.MillisDurationField.INSTANCE, field.getDurationField());
			bucket.saveField(parseField, ((int) (value)));
			return position + length;
		}
	}

	static class TimeZoneOffset implements org.joda.time.format.DateTimeParser , org.joda.time.format.DateTimePrinter {
		private final java.lang.String iZeroOffsetPrintText;

		private final java.lang.String iZeroOffsetParseText;

		private final boolean iShowSeparators;

		private final int iMinFields;

		private final int iMaxFields;

		TimeZoneOffset(java.lang.String zeroOffsetPrintText, java.lang.String zeroOffsetParseText, boolean showSeparators, int minFields, int maxFields) {
			super();
			iZeroOffsetPrintText = zeroOffsetPrintText;
			iZeroOffsetParseText = zeroOffsetParseText;
			iShowSeparators = showSeparators;
			if ((minFields <= 0) || (maxFields < minFields)) {
				throw new java.lang.IllegalArgumentException();
			}
			if (minFields > 4) {
				minFields = 4;
				maxFields = 4;
			}
			iMinFields = minFields;
			iMaxFields = maxFields;
		}

		public int estimatePrintedLength() {
			int est = (1 + (iMinFields)) << 1;
			if (iShowSeparators) {
				est += (iMinFields) - 1;
			}
			if (((iZeroOffsetPrintText) != null) && ((iZeroOffsetPrintText.length()) > est)) {
				est = iZeroOffsetPrintText.length();
			}
			return est;
		}

		public void printTo(java.lang.StringBuffer buf, long instant, org.joda.time.Chronology chrono, int displayOffset, org.joda.time.DateTimeZone displayZone, java.util.Locale locale) {
			if (displayZone == null) {
				return ;
			}
			if ((displayOffset == 0) && ((iZeroOffsetPrintText) != null)) {
				buf.append(iZeroOffsetPrintText);
				return ;
			}
			if (displayOffset >= 0) {
				buf.append('+');
			}else {
				buf.append('-');
				displayOffset = -displayOffset;
			}
			int hours = displayOffset / (org.joda.time.DateTimeConstants.MILLIS_PER_HOUR);
			org.joda.time.format.FormatUtils.appendPaddedInteger(buf, hours, 2);
			if ((iMaxFields) == 1) {
				return ;
			}
			displayOffset -= hours * ((int) (org.joda.time.DateTimeConstants.MILLIS_PER_HOUR));
			if ((displayOffset == 0) && ((iMinFields) <= 1)) {
				return ;
			}
			int minutes = displayOffset / (org.joda.time.DateTimeConstants.MILLIS_PER_MINUTE);
			if (iShowSeparators) {
				buf.append(':');
			}
			org.joda.time.format.FormatUtils.appendPaddedInteger(buf, minutes, 2);
			if ((iMaxFields) == 2) {
				return ;
			}
			displayOffset -= minutes * (org.joda.time.DateTimeConstants.MILLIS_PER_MINUTE);
			if ((displayOffset == 0) && ((iMinFields) <= 2)) {
				return ;
			}
			int seconds = displayOffset / (org.joda.time.DateTimeConstants.MILLIS_PER_SECOND);
			if (iShowSeparators) {
				buf.append(':');
			}
			org.joda.time.format.FormatUtils.appendPaddedInteger(buf, seconds, 2);
			if ((iMaxFields) == 3) {
				return ;
			}
			displayOffset -= seconds * (org.joda.time.DateTimeConstants.MILLIS_PER_SECOND);
			if ((displayOffset == 0) && ((iMinFields) <= 3)) {
				return ;
			}
			if (iShowSeparators) {
				buf.append('.');
			}
			org.joda.time.format.FormatUtils.appendPaddedInteger(buf, displayOffset, 3);
		}

		public void printTo(java.io.Writer out, long instant, org.joda.time.Chronology chrono, int displayOffset, org.joda.time.DateTimeZone displayZone, java.util.Locale locale) throws java.io.IOException {
			if (displayZone == null) {
				return ;
			}
			if ((displayOffset == 0) && ((iZeroOffsetPrintText) != null)) {
				out.write(iZeroOffsetPrintText);
				return ;
			}
			if (displayOffset >= 0) {
				out.write('+');
			}else {
				out.write('-');
				displayOffset = -displayOffset;
			}
			int hours = displayOffset / (org.joda.time.DateTimeConstants.MILLIS_PER_HOUR);
			org.joda.time.format.FormatUtils.writePaddedInteger(out, hours, 2);
			if ((iMaxFields) == 1) {
				return ;
			}
			displayOffset -= hours * ((int) (org.joda.time.DateTimeConstants.MILLIS_PER_HOUR));
			if ((displayOffset == 0) && ((iMinFields) == 1)) {
				return ;
			}
			int minutes = displayOffset / (org.joda.time.DateTimeConstants.MILLIS_PER_MINUTE);
			if (iShowSeparators) {
				out.write(':');
			}
			org.joda.time.format.FormatUtils.writePaddedInteger(out, minutes, 2);
			if ((iMaxFields) == 2) {
				return ;
			}
			displayOffset -= minutes * (org.joda.time.DateTimeConstants.MILLIS_PER_MINUTE);
			if ((displayOffset == 0) && ((iMinFields) == 2)) {
				return ;
			}
			int seconds = displayOffset / (org.joda.time.DateTimeConstants.MILLIS_PER_SECOND);
			if (iShowSeparators) {
				out.write(':');
			}
			org.joda.time.format.FormatUtils.writePaddedInteger(out, seconds, 2);
			if ((iMaxFields) == 3) {
				return ;
			}
			displayOffset -= seconds * (org.joda.time.DateTimeConstants.MILLIS_PER_SECOND);
			if ((displayOffset == 0) && ((iMinFields) == 3)) {
				return ;
			}
			if (iShowSeparators) {
				out.write('.');
			}
			org.joda.time.format.FormatUtils.writePaddedInteger(out, displayOffset, 3);
		}

		public void printTo(java.lang.StringBuffer buf, org.joda.time.ReadablePartial partial, java.util.Locale locale) {
		}

		public void printTo(java.io.Writer out, org.joda.time.ReadablePartial partial, java.util.Locale locale) throws java.io.IOException {
		}

		public int estimateParsedLength() {
			return estimatePrintedLength();
		}

		public int parseInto(org.joda.time.format.DateTimeParserBucket bucket, java.lang.String text, int position) {
			int limit = (text.length()) - position;
			zeroOffset : if ((iZeroOffsetParseText) != null) {
				if ((iZeroOffsetParseText.length()) == 0) {
					if (limit > 0) {
						char c = text.charAt(position);
						if ((c == '-') || (c == '+')) {
							break zeroOffset;
						}
					}
					bucket.setOffset(0);
					return position;
				}
				if (text.regionMatches(true, position, iZeroOffsetParseText, 0, iZeroOffsetParseText.length())) {
					bucket.setOffset(0);
					return position + (iZeroOffsetParseText.length());
				}
			}
			if (limit <= 1) {
				return ~position;
			}
			boolean negative;
			char c = text.charAt(position);
			if (c == '-') {
				negative = true;
			}else
				if (c == '+') {
					negative = false;
				}else {
					return ~position;
				}
			
			limit--;
			position++;
			if ((digitCount(text, position, 2)) < 2) {
				return ~position;
			}
			int offset;
			int hours = org.joda.time.format.FormatUtils.parseTwoDigits(text, position);
			if (hours > 23) {
				return ~position;
			}
			offset = hours * (org.joda.time.DateTimeConstants.MILLIS_PER_HOUR);
			limit -= 2;
			position += 2;
			parse : {
				if (limit <= 0) {
					break parse;
				}
				boolean expectSeparators;
				c = text.charAt(position);
				if (c == ':') {
					expectSeparators = true;
					limit--;
					position++;
				}else
					if ((c >= '0') && (c <= '9')) {
						expectSeparators = false;
					}else {
						break parse;
					}
				
				int count = digitCount(text, position, 2);
				if ((count == 0) && (!expectSeparators)) {
					break parse;
				}else
					if (count < 2) {
						return ~position;
					}
				
				int minutes = org.joda.time.format.FormatUtils.parseTwoDigits(text, position);
				if (minutes > 59) {
					return ~position;
				}
				offset += minutes * (org.joda.time.DateTimeConstants.MILLIS_PER_MINUTE);
				limit -= 2;
				position += 2;
				if (limit <= 0) {
					break parse;
				}
				if (expectSeparators) {
					if ((text.charAt(position)) != ':') {
						break parse;
					}
					limit--;
					position++;
				}
				count = digitCount(text, position, 2);
				if ((count == 0) && (!expectSeparators)) {
					break parse;
				}else
					if (count < 2) {
						return ~position;
					}
				
				int seconds = org.joda.time.format.FormatUtils.parseTwoDigits(text, position);
				if (seconds > 59) {
					return ~position;
				}
				offset += seconds * (org.joda.time.DateTimeConstants.MILLIS_PER_SECOND);
				limit -= 2;
				position += 2;
				if (limit <= 0) {
					break parse;
				}
				if (expectSeparators) {
					if (((text.charAt(position)) != '.') && ((text.charAt(position)) != ',')) {
						break parse;
					}
					limit--;
					position++;
				}
				count = digitCount(text, position, 3);
				if ((count == 0) && (!expectSeparators)) {
					break parse;
				}else
					if (count < 1) {
						return ~position;
					}
				
				offset += ((text.charAt((position++))) - '0') * 100;
				if (count > 1) {
					offset += ((text.charAt((position++))) - '0') * 10;
					if (count > 2) {
						offset += (text.charAt((position++))) - '0';
					}
				}
			}
			bucket.setOffset((negative ? -offset : offset));
			return position;
		}

		private int digitCount(java.lang.String text, int position, int amount) {
			int limit = java.lang.Math.min(((text.length()) - position), amount);
			amount = 0;
			for (; limit > 0; limit--) {
				char c = text.charAt((position + amount));
				if ((c < '0') || (c > '9')) {
					break;
				}
				amount++;
			}
			return amount;
		}
	}

	static class TimeZoneName implements org.joda.time.format.DateTimePrinter {
		static final int LONG_NAME = 0;

		static final int SHORT_NAME = 1;

		static final int ID = 2;

		private final int iType;

		TimeZoneName(int type) {
			super();
			iType = type;
		}

		public int estimatePrintedLength() {
			return (iType) == (org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName.SHORT_NAME) ? 4 : 20;
		}

		public void printTo(java.lang.StringBuffer buf, long instant, org.joda.time.Chronology chrono, int displayOffset, org.joda.time.DateTimeZone displayZone, java.util.Locale locale) {
			buf.append(print((instant - displayOffset), displayZone, locale));
		}

		public void printTo(java.io.Writer out, long instant, org.joda.time.Chronology chrono, int displayOffset, org.joda.time.DateTimeZone displayZone, java.util.Locale locale) throws java.io.IOException {
			out.write(print((instant - displayOffset), displayZone, locale));
		}

		private java.lang.String print(long instant, org.joda.time.DateTimeZone displayZone, java.util.Locale locale) {
			if (displayZone == null) {
				return "";
			}
			switch (iType) {
				case org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName.LONG_NAME :
					return displayZone.getName(instant, locale);
				case org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName.SHORT_NAME :
					return displayZone.getShortName(instant, locale);
				case org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName.ID :
					return displayZone.getID();
			}
			return "";
		}

		public void printTo(java.lang.StringBuffer buf, org.joda.time.ReadablePartial partial, java.util.Locale locale) {
		}

		public void printTo(java.io.Writer out, org.joda.time.ReadablePartial partial, java.util.Locale locale) throws java.io.IOException {
		}
	}

	static class Composite implements org.joda.time.format.DateTimeParser , org.joda.time.format.DateTimePrinter {
		private final org.joda.time.format.DateTimePrinter[] iPrinters;

		private final org.joda.time.format.DateTimeParser[] iParsers;

		private final int iPrintedLengthEstimate;

		private final int iParsedLengthEstimate;

		Composite(java.util.List<java.lang.Object> elementPairs) {
			super();
			java.util.List<java.lang.Object> printerList = new java.util.ArrayList<java.lang.Object>();
			java.util.List<java.lang.Object> parserList = new java.util.ArrayList<java.lang.Object>();
			decompose(elementPairs, printerList, parserList);
			if ((printerList.size()) <= 0) {
				iPrinters = null;
				iPrintedLengthEstimate = 0;
			}else {
				int size = printerList.size();
				iPrinters = new org.joda.time.format.DateTimePrinter[size];
				int printEst = 0;
				for (int i = 0; i < size; i++) {
					org.joda.time.format.DateTimePrinter printer = ((org.joda.time.format.DateTimePrinter) (printerList.get(i)));
					printEst += printer.estimatePrintedLength();
					iPrinters[i] = printer;
				}
				iPrintedLengthEstimate = printEst;
			}
			if ((parserList.size()) <= 0) {
				iParsers = null;
				iParsedLengthEstimate = 0;
			}else {
				int size = parserList.size();
				iParsers = new org.joda.time.format.DateTimeParser[size];
				int parseEst = 0;
				for (int i = 0; i < size; i++) {
					org.joda.time.format.DateTimeParser parser = ((org.joda.time.format.DateTimeParser) (parserList.get(i)));
					parseEst += parser.estimateParsedLength();
					iParsers[i] = parser;
				}
				iParsedLengthEstimate = parseEst;
			}
		}

		public int estimatePrintedLength() {
			return iPrintedLengthEstimate;
		}

		public void printTo(java.lang.StringBuffer buf, long instant, org.joda.time.Chronology chrono, int displayOffset, org.joda.time.DateTimeZone displayZone, java.util.Locale locale) {
			org.joda.time.format.DateTimePrinter[] elements = iPrinters;
			if (elements == null) {
				throw new java.lang.UnsupportedOperationException();
			}
			if (locale == null) {
				locale = java.util.Locale.getDefault();
			}
			int len = elements.length;
			for (int i = 0; i < len; i++) {
				elements[i].printTo(buf, instant, chrono, displayOffset, displayZone, locale);
			}
		}

		public void printTo(java.io.Writer out, long instant, org.joda.time.Chronology chrono, int displayOffset, org.joda.time.DateTimeZone displayZone, java.util.Locale locale) throws java.io.IOException {
			org.joda.time.format.DateTimePrinter[] elements = iPrinters;
			if (elements == null) {
				throw new java.lang.UnsupportedOperationException();
			}
			if (locale == null) {
				locale = java.util.Locale.getDefault();
			}
			int len = elements.length;
			for (int i = 0; i < len; i++) {
				elements[i].printTo(out, instant, chrono, displayOffset, displayZone, locale);
			}
		}

		public void printTo(java.lang.StringBuffer buf, org.joda.time.ReadablePartial partial, java.util.Locale locale) {
			org.joda.time.format.DateTimePrinter[] elements = iPrinters;
			if (elements == null) {
				throw new java.lang.UnsupportedOperationException();
			}
			if (locale == null) {
				locale = java.util.Locale.getDefault();
			}
			int len = elements.length;
			for (int i = 0; i < len; i++) {
				elements[i].printTo(buf, partial, locale);
			}
		}

		public void printTo(java.io.Writer out, org.joda.time.ReadablePartial partial, java.util.Locale locale) throws java.io.IOException {
			org.joda.time.format.DateTimePrinter[] elements = iPrinters;
			if (elements == null) {
				throw new java.lang.UnsupportedOperationException();
			}
			if (locale == null) {
				locale = java.util.Locale.getDefault();
			}
			int len = elements.length;
			for (int i = 0; i < len; i++) {
				elements[i].printTo(out, partial, locale);
			}
		}

		public int estimateParsedLength() {
			return iParsedLengthEstimate;
		}

		public int parseInto(org.joda.time.format.DateTimeParserBucket bucket, java.lang.String text, int position) {
			org.joda.time.format.DateTimeParser[] elements = iParsers;
			if (elements == null) {
				throw new java.lang.UnsupportedOperationException();
			}
			int len = elements.length;
			for (int i = 0; (i < len) && (position >= 0); i++) {
				position = elements[i].parseInto(bucket, text, position);
			}
			return position;
		}

		boolean isPrinter() {
			return (iPrinters) != null;
		}

		boolean isParser() {
			return (iParsers) != null;
		}

		private void decompose(java.util.List<java.lang.Object> elementPairs, java.util.List<java.lang.Object> printerList, java.util.List<java.lang.Object> parserList) {
			int size = elementPairs.size();
			for (int i = 0; i < size; i += 2) {
				java.lang.Object element = elementPairs.get(i);
				if (element instanceof org.joda.time.format.DateTimePrinter) {
					if (element instanceof org.joda.time.format.DateTimeFormatterBuilder.Composite) {
						addArrayToList(printerList, ((org.joda.time.format.DateTimeFormatterBuilder.Composite) (element)).iPrinters);
					}else {
						printerList.add(element);
					}
				}
				element = elementPairs.get((i + 1));
				if (element instanceof org.joda.time.format.DateTimeParser) {
					if (element instanceof org.joda.time.format.DateTimeFormatterBuilder.Composite) {
						addArrayToList(parserList, ((org.joda.time.format.DateTimeFormatterBuilder.Composite) (element)).iParsers);
					}else {
						parserList.add(element);
					}
				}
			}
		}

		private void addArrayToList(java.util.List<java.lang.Object> list, java.lang.Object[] array) {
			if (array != null) {
				for (int i = 0; i < (array.length); i++) {
					list.add(array[i]);
				}
			}
		}
	}

	static class MatchingParser implements org.joda.time.format.DateTimeParser {
		private final org.joda.time.format.DateTimeParser[] iParsers;

		private final int iParsedLengthEstimate;

		MatchingParser(org.joda.time.format.DateTimeParser[] parsers) {
			super();
			iParsers = parsers;
			int est = 0;
			for (int i = parsers.length; (--i) >= 0;) {
				org.joda.time.format.DateTimeParser parser = parsers[i];
				if (parser != null) {
					int len = parser.estimateParsedLength();
					if (len > est) {
						est = len;
					}
				}
			}
			iParsedLengthEstimate = est;
		}

		public int estimateParsedLength() {
			return iParsedLengthEstimate;
		}

		public int parseInto(org.joda.time.format.DateTimeParserBucket bucket, java.lang.String text, int position) {
			org.joda.time.format.DateTimeParser[] parsers = iParsers;
			int length = parsers.length;
			final java.lang.Object originalState = bucket.saveState();
			boolean isOptional = false;
			int bestValidPos = position;
			java.lang.Object bestValidState = null;
			int bestInvalidPos = position;
			for (int i = 0; i < length; i++) {
				org.joda.time.format.DateTimeParser parser = parsers[i];
				if (parser == null) {
					if (bestValidPos <= position) {
						return position;
					}
					isOptional = true;
					break;
				}
				int parsePos = parser.parseInto(bucket, text, position);
				if (parsePos >= position) {
					if (parsePos > bestValidPos) {
						if (((parsePos >= (text.length())) || ((i + 1) >= length)) || ((parsers[(i + 1)]) == null)) {
							return parsePos;
						}
						bestValidPos = parsePos;
						bestValidState = bucket.saveState();
					}
				}else {
					if (parsePos < 0) {
						parsePos = ~parsePos;
						if (parsePos > bestInvalidPos) {
							bestInvalidPos = parsePos;
						}
					}
				}
				bucket.restoreState(originalState);
			}
			if ((bestValidPos > position) || ((bestValidPos == position) && isOptional)) {
				if (bestValidState != null) {
					bucket.restoreState(bestValidState);
				}
				return bestValidPos;
			}
			return ~bestInvalidPos;
		}
	}
}

