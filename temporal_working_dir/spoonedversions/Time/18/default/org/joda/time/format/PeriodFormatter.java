

package org.joda.time.format;


public class PeriodFormatter {
	private final org.joda.time.format.PeriodPrinter iPrinter;

	private final org.joda.time.format.PeriodParser iParser;

	private final java.util.Locale iLocale;

	private final org.joda.time.PeriodType iParseType;

	public PeriodFormatter(org.joda.time.format.PeriodPrinter printer, org.joda.time.format.PeriodParser parser) {
		super();
		iPrinter = printer;
		iParser = parser;
		iLocale = null;
		iParseType = null;
	}

	private PeriodFormatter(org.joda.time.format.PeriodPrinter printer, org.joda.time.format.PeriodParser parser, java.util.Locale locale, org.joda.time.PeriodType type) {
		super();
		iPrinter = printer;
		iParser = parser;
		iLocale = locale;
		iParseType = type;
	}

	public boolean isPrinter() {
		return (iPrinter) != null;
	}

	public org.joda.time.format.PeriodPrinter getPrinter() {
		return iPrinter;
	}

	public boolean isParser() {
		return (iParser) != null;
	}

	public org.joda.time.format.PeriodParser getParser() {
		return iParser;
	}

	public org.joda.time.format.PeriodFormatter withLocale(java.util.Locale locale) {
		if ((locale == (getLocale())) || ((locale != null) && (locale.equals(getLocale())))) {
			return org.joda.time.format.PeriodFormatter.this;
		}
		return new org.joda.time.format.PeriodFormatter(iPrinter, iParser, locale, iParseType);
	}

	public java.util.Locale getLocale() {
		return iLocale;
	}

	public org.joda.time.format.PeriodFormatter withParseType(org.joda.time.PeriodType type) {
		if (type == (iParseType)) {
			return org.joda.time.format.PeriodFormatter.this;
		}
		return new org.joda.time.format.PeriodFormatter(iPrinter, iParser, iLocale, type);
	}

	public org.joda.time.PeriodType getParseType() {
		return iParseType;
	}

	public void printTo(java.lang.StringBuffer buf, org.joda.time.ReadablePeriod period) {
		checkPrinter();
		checkPeriod(period);
		getPrinter().printTo(buf, period, iLocale);
	}

	public void printTo(java.io.Writer out, org.joda.time.ReadablePeriod period) throws java.io.IOException {
		checkPrinter();
		checkPeriod(period);
		getPrinter().printTo(out, period, iLocale);
	}

	public java.lang.String print(org.joda.time.ReadablePeriod period) {
		checkPrinter();
		checkPeriod(period);
		org.joda.time.format.PeriodPrinter printer = getPrinter();
		java.lang.StringBuffer buf = new java.lang.StringBuffer(printer.calculatePrintedLength(period, iLocale));
		printer.printTo(buf, period, iLocale);
		return buf.toString();
	}

	private void checkPrinter() {
		if ((iPrinter) == null) {
			throw new java.lang.UnsupportedOperationException("Printing not supported");
		}
	}

	private void checkPeriod(org.joda.time.ReadablePeriod period) {
		if (period == null) {
			throw new java.lang.IllegalArgumentException("Period must not be null");
		}
	}

	public int parseInto(org.joda.time.ReadWritablePeriod period, java.lang.String text, int position) {
		checkParser();
		checkPeriod(period);
		return getParser().parseInto(period, text, position, iLocale);
	}

	public org.joda.time.Period parsePeriod(java.lang.String text) {
		checkParser();
		return parseMutablePeriod(text).toPeriod();
	}

	public org.joda.time.MutablePeriod parseMutablePeriod(java.lang.String text) {
		checkParser();
		org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod(0, iParseType);
		int newPos = getParser().parseInto(period, text, 0, iLocale);
		if (newPos >= 0) {
			if (newPos >= (text.length())) {
				return period;
			}
		}else {
			newPos = ~newPos;
		}
		throw new java.lang.IllegalArgumentException(org.joda.time.format.FormatUtils.createErrorMessage(text, newPos));
	}

	private void checkParser() {
		if ((iParser) == null) {
			throw new java.lang.UnsupportedOperationException("Parsing not supported");
		}
	}
}

