

package org.joda.time.format;


public class DateTimeFormatter {
	private final org.joda.time.format.DateTimePrinter iPrinter;

	private final org.joda.time.format.DateTimeParser iParser;

	private final java.util.Locale iLocale;

	private final boolean iOffsetParsed;

	private final org.joda.time.Chronology iChrono;

	private final org.joda.time.DateTimeZone iZone;

	private final java.lang.Integer iPivotYear;

	private final int iDefaultYear;

	public DateTimeFormatter(org.joda.time.format.DateTimePrinter printer, org.joda.time.format.DateTimeParser parser) {
		super();
		iPrinter = printer;
		iParser = parser;
		iLocale = null;
		iOffsetParsed = false;
		iChrono = null;
		iZone = null;
		iPivotYear = null;
		iDefaultYear = 2000;
	}

	private DateTimeFormatter(org.joda.time.format.DateTimePrinter printer, org.joda.time.format.DateTimeParser parser, java.util.Locale locale, boolean offsetParsed, org.joda.time.Chronology chrono, org.joda.time.DateTimeZone zone, java.lang.Integer pivotYear, int defaultYear) {
		super();
		iPrinter = printer;
		iParser = parser;
		iLocale = locale;
		iOffsetParsed = offsetParsed;
		iChrono = chrono;
		iZone = zone;
		iPivotYear = pivotYear;
		iDefaultYear = defaultYear;
	}

	public boolean isPrinter() {
		return (iPrinter) != null;
	}

	public org.joda.time.format.DateTimePrinter getPrinter() {
		return iPrinter;
	}

	public boolean isParser() {
		return (iParser) != null;
	}

	public org.joda.time.format.DateTimeParser getParser() {
		return iParser;
	}

	public org.joda.time.format.DateTimeFormatter withLocale(java.util.Locale locale) {
		if ((locale == (getLocale())) || ((locale != null) && (locale.equals(getLocale())))) {
			return org.joda.time.format.DateTimeFormatter.this;
		}
		return new org.joda.time.format.DateTimeFormatter(iPrinter, iParser, locale, iOffsetParsed, iChrono, iZone, iPivotYear, iDefaultYear);
	}

	public java.util.Locale getLocale() {
		return iLocale;
	}

	public org.joda.time.format.DateTimeFormatter withOffsetParsed() {
		if ((iOffsetParsed) == true) {
			return org.joda.time.format.DateTimeFormatter.this;
		}
		return new org.joda.time.format.DateTimeFormatter(iPrinter, iParser, iLocale, true, iChrono, null, iPivotYear, iDefaultYear);
	}

	public boolean isOffsetParsed() {
		return iOffsetParsed;
	}

	public org.joda.time.format.DateTimeFormatter withChronology(org.joda.time.Chronology chrono) {
		if ((iChrono) == chrono) {
			return org.joda.time.format.DateTimeFormatter.this;
		}
		return new org.joda.time.format.DateTimeFormatter(iPrinter, iParser, iLocale, iOffsetParsed, chrono, iZone, iPivotYear, iDefaultYear);
	}

	public org.joda.time.Chronology getChronology() {
		return iChrono;
	}

	public org.joda.time.Chronology getChronolgy() {
		return iChrono;
	}

	public org.joda.time.format.DateTimeFormatter withZoneUTC() {
		return withZone(org.joda.time.DateTimeZone.UTC);
	}

	public org.joda.time.format.DateTimeFormatter withZone(org.joda.time.DateTimeZone zone) {
		if ((iZone) == zone) {
			return org.joda.time.format.DateTimeFormatter.this;
		}
		return new org.joda.time.format.DateTimeFormatter(iPrinter, iParser, iLocale, false, iChrono, zone, iPivotYear, iDefaultYear);
	}

	public org.joda.time.DateTimeZone getZone() {
		return iZone;
	}

	public org.joda.time.format.DateTimeFormatter withPivotYear(java.lang.Integer pivotYear) {
		if (((iPivotYear) == pivotYear) || (((iPivotYear) != null) && (iPivotYear.equals(pivotYear)))) {
			return org.joda.time.format.DateTimeFormatter.this;
		}
		return new org.joda.time.format.DateTimeFormatter(iPrinter, iParser, iLocale, iOffsetParsed, iChrono, iZone, pivotYear, iDefaultYear);
	}

	public org.joda.time.format.DateTimeFormatter withPivotYear(int pivotYear) {
		return withPivotYear(new java.lang.Integer(pivotYear));
	}

	public java.lang.Integer getPivotYear() {
		return iPivotYear;
	}

	public org.joda.time.format.DateTimeFormatter withDefaultYear(int defaultYear) {
		return new org.joda.time.format.DateTimeFormatter(iPrinter, iParser, iLocale, iOffsetParsed, iChrono, iZone, iPivotYear, defaultYear);
	}

	public int getDefaultYear() {
		return iDefaultYear;
	}

	public void printTo(java.lang.StringBuffer buf, org.joda.time.ReadableInstant instant) {
		long millis = org.joda.time.DateTimeUtils.getInstantMillis(instant);
		org.joda.time.Chronology chrono = org.joda.time.DateTimeUtils.getInstantChronology(instant);
		printTo(buf, millis, chrono);
	}

	public void printTo(java.io.Writer out, org.joda.time.ReadableInstant instant) throws java.io.IOException {
		long millis = org.joda.time.DateTimeUtils.getInstantMillis(instant);
		org.joda.time.Chronology chrono = org.joda.time.DateTimeUtils.getInstantChronology(instant);
		printTo(out, millis, chrono);
	}

	public void printTo(java.lang.Appendable appendable, org.joda.time.ReadableInstant instant) throws java.io.IOException {
		appendable.append(print(instant));
	}

	public void printTo(java.lang.StringBuffer buf, long instant) {
		printTo(buf, instant, null);
	}

	public void printTo(java.io.Writer out, long instant) throws java.io.IOException {
		printTo(out, instant, null);
	}

	public void printTo(java.lang.Appendable appendable, long instant) throws java.io.IOException {
		appendable.append(print(instant));
	}

	public void printTo(java.lang.StringBuffer buf, org.joda.time.ReadablePartial partial) {
		org.joda.time.format.DateTimePrinter printer = requirePrinter();
		if (partial == null) {
			throw new java.lang.IllegalArgumentException("The partial must not be null");
		}
		printer.printTo(buf, partial, iLocale);
	}

	public void printTo(java.io.Writer out, org.joda.time.ReadablePartial partial) throws java.io.IOException {
		org.joda.time.format.DateTimePrinter printer = requirePrinter();
		if (partial == null) {
			throw new java.lang.IllegalArgumentException("The partial must not be null");
		}
		printer.printTo(out, partial, iLocale);
	}

	public void printTo(java.lang.Appendable appendable, org.joda.time.ReadablePartial partial) throws java.io.IOException {
		appendable.append(print(partial));
	}

	public java.lang.String print(org.joda.time.ReadableInstant instant) {
		java.lang.StringBuffer buf = new java.lang.StringBuffer(requirePrinter().estimatePrintedLength());
		printTo(buf, instant);
		return buf.toString();
	}

	public java.lang.String print(long instant) {
		java.lang.StringBuffer buf = new java.lang.StringBuffer(requirePrinter().estimatePrintedLength());
		printTo(buf, instant);
		return buf.toString();
	}

	public java.lang.String print(org.joda.time.ReadablePartial partial) {
		java.lang.StringBuffer buf = new java.lang.StringBuffer(requirePrinter().estimatePrintedLength());
		printTo(buf, partial);
		return buf.toString();
	}

	private void printTo(java.lang.StringBuffer buf, long instant, org.joda.time.Chronology chrono) {
		org.joda.time.format.DateTimePrinter printer = requirePrinter();
		chrono = selectChronology(chrono);
		org.joda.time.DateTimeZone zone = chrono.getZone();
		int offset = zone.getOffset(instant);
		long adjustedInstant = instant + offset;
		if (((instant ^ adjustedInstant) < 0) && ((instant ^ offset) >= 0)) {
			zone = org.joda.time.DateTimeZone.UTC;
			offset = 0;
			adjustedInstant = instant;
		}
		printer.printTo(buf, adjustedInstant, chrono.withUTC(), offset, zone, iLocale);
	}

	private void printTo(java.io.Writer buf, long instant, org.joda.time.Chronology chrono) throws java.io.IOException {
		org.joda.time.format.DateTimePrinter printer = requirePrinter();
		chrono = selectChronology(chrono);
		org.joda.time.DateTimeZone zone = chrono.getZone();
		int offset = zone.getOffset(instant);
		long adjustedInstant = instant + offset;
		if (((instant ^ adjustedInstant) < 0) && ((instant ^ offset) >= 0)) {
			zone = org.joda.time.DateTimeZone.UTC;
			offset = 0;
			adjustedInstant = instant;
		}
		printer.printTo(buf, adjustedInstant, chrono.withUTC(), offset, zone, iLocale);
	}

	private org.joda.time.format.DateTimePrinter requirePrinter() {
		org.joda.time.format.DateTimePrinter printer = iPrinter;
		if (printer == null) {
			throw new java.lang.UnsupportedOperationException("Printing not supported");
		}
		return printer;
	}

	public int parseInto(org.joda.time.ReadWritableInstant instant, java.lang.String text, int position) {
		org.joda.time.format.DateTimeParser parser = requireParser();
		if (instant == null) {
			throw new java.lang.IllegalArgumentException("Instant must not be null");
		}
		long instantMillis = instant.getMillis();
		org.joda.time.Chronology chrono = instant.getChronology();
		long instantLocal = instantMillis + (chrono.getZone().getOffset(instantMillis));
		chrono = selectChronology(chrono);
		org.joda.time.format.DateTimeParserBucket bucket = new org.joda.time.format.DateTimeParserBucket(instantLocal, chrono, iLocale, iPivotYear, iDefaultYear);
		int newPos = parser.parseInto(bucket, text, position);
		instant.setMillis(bucket.computeMillis(false, text));
		if ((iOffsetParsed) && ((bucket.getZone()) == null)) {
			int parsedOffset = bucket.getOffset();
			org.joda.time.DateTimeZone parsedZone = org.joda.time.DateTimeZone.forOffsetMillis(parsedOffset);
			chrono = chrono.withZone(parsedZone);
		}
		instant.setChronology(chrono);
		return newPos;
	}

	public long parseMillis(java.lang.String text) {
		org.joda.time.format.DateTimeParser parser = requireParser();
		org.joda.time.Chronology chrono = selectChronology(iChrono);
		org.joda.time.format.DateTimeParserBucket bucket = new org.joda.time.format.DateTimeParserBucket(0, chrono, iLocale, iPivotYear, iDefaultYear);
		int newPos = parser.parseInto(bucket, text, 0);
		if (newPos >= 0) {
			if (newPos >= (text.length())) {
				return bucket.computeMillis(true, text);
			}
		}else {
			newPos = ~newPos;
		}
		throw new java.lang.IllegalArgumentException(org.joda.time.format.FormatUtils.createErrorMessage(text, newPos));
	}

	public org.joda.time.LocalDate parseLocalDate(java.lang.String text) {
		return parseLocalDateTime(text).toLocalDate();
	}

	public org.joda.time.LocalTime parseLocalTime(java.lang.String text) {
		return parseLocalDateTime(text).toLocalTime();
	}

	public org.joda.time.LocalDateTime parseLocalDateTime(java.lang.String text) {
		org.joda.time.format.DateTimeParser parser = requireParser();
		org.joda.time.Chronology chrono = selectChronology(null).withUTC();
		org.joda.time.format.DateTimeParserBucket bucket = new org.joda.time.format.DateTimeParserBucket(0, chrono, iLocale, iPivotYear, iDefaultYear);
		int newPos = parser.parseInto(bucket, text, 0);
		if (newPos >= 0) {
			if (newPos >= (text.length())) {
				long millis = bucket.computeMillis(true, text);
				if ((bucket.getZone()) == null) {
					int parsedOffset = bucket.getOffset();
					org.joda.time.DateTimeZone parsedZone = org.joda.time.DateTimeZone.forOffsetMillis(parsedOffset);
					chrono = chrono.withZone(parsedZone);
				}
				return new org.joda.time.LocalDateTime(millis, chrono);
			}
		}else {
			newPos = ~newPos;
		}
		throw new java.lang.IllegalArgumentException(org.joda.time.format.FormatUtils.createErrorMessage(text, newPos));
	}

	public org.joda.time.DateTime parseDateTime(java.lang.String text) {
		org.joda.time.format.DateTimeParser parser = requireParser();
		org.joda.time.Chronology chrono = selectChronology(null);
		org.joda.time.format.DateTimeParserBucket bucket = new org.joda.time.format.DateTimeParserBucket(0, chrono, iLocale, iPivotYear, iDefaultYear);
		int newPos = parser.parseInto(bucket, text, 0);
		if (newPos >= 0) {
			if (newPos >= (text.length())) {
				long millis = bucket.computeMillis(true, text);
				if ((iOffsetParsed) && ((bucket.getZone()) == null)) {
					int parsedOffset = bucket.getOffset();
					org.joda.time.DateTimeZone parsedZone = org.joda.time.DateTimeZone.forOffsetMillis(parsedOffset);
					chrono = chrono.withZone(parsedZone);
				}
				return new org.joda.time.DateTime(millis, chrono);
			}
		}else {
			newPos = ~newPos;
		}
		throw new java.lang.IllegalArgumentException(org.joda.time.format.FormatUtils.createErrorMessage(text, newPos));
	}

	public org.joda.time.MutableDateTime parseMutableDateTime(java.lang.String text) {
		org.joda.time.format.DateTimeParser parser = requireParser();
		org.joda.time.Chronology chrono = selectChronology(null);
		org.joda.time.format.DateTimeParserBucket bucket = new org.joda.time.format.DateTimeParserBucket(0, chrono, iLocale, iPivotYear, iDefaultYear);
		int newPos = parser.parseInto(bucket, text, 0);
		if (newPos >= 0) {
			if (newPos >= (text.length())) {
				long millis = bucket.computeMillis(true, text);
				if ((iOffsetParsed) && ((bucket.getZone()) == null)) {
					int parsedOffset = bucket.getOffset();
					org.joda.time.DateTimeZone parsedZone = org.joda.time.DateTimeZone.forOffsetMillis(parsedOffset);
					chrono = chrono.withZone(parsedZone);
				}
				return new org.joda.time.MutableDateTime(millis, chrono);
			}
		}else {
			newPos = ~newPos;
		}
		throw new java.lang.IllegalArgumentException(org.joda.time.format.FormatUtils.createErrorMessage(text, newPos));
	}

	private org.joda.time.format.DateTimeParser requireParser() {
		org.joda.time.format.DateTimeParser parser = iParser;
		if (parser == null) {
			throw new java.lang.UnsupportedOperationException("Parsing not supported");
		}
		return parser;
	}

	private org.joda.time.Chronology selectChronology(org.joda.time.Chronology chrono) {
		chrono = org.joda.time.DateTimeUtils.getChronology(chrono);
		if ((iChrono) != null) {
			chrono = iChrono;
		}
		if ((iZone) != null) {
			chrono = chrono.withZone(iZone);
		}
		return chrono;
	}
}

